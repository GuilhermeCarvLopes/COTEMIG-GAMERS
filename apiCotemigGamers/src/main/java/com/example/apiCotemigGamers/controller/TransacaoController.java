package com.example.apiCotemigGamers.controller;

import com.example.apiCotemigGamers.model.Transacao;
import com.example.apiCotemigGamers.service.TransacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TransacaoController {

    @Autowired
    private TransacaoService transacaoService;

    @RequestMapping(value = "transacao/insert", method = RequestMethod.GET)
    public ModelAndView insert() {
        return new ModelAndView("insert", "Transacao", new Transacao());
    }

    @RequestMapping(value = "transacao/insert", method = RequestMethod.POST)
    public String submitInsert(@ModelAttribute("Transacao")Transacao transacao, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        transacaoService.insertTransacao(transacao);
        return "redirect:";
    }



    @RequestMapping(value = "transacao/delete", method = RequestMethod.GET)
    public ModelAndView delete(Integer id) {
        return new ModelAndView("delete", "Transacao", transacaoService.getTransacaoById(id).get());
    }



    @RequestMapping(value = "transacao/delete", method = RequestMethod.POST)
    public String submitDelete(@ModelAttribute("transacao")Transacao transacao, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        transacaoService.deleteTransacaoById(transacao.getIdTransacao());
        return "redirect:";
    }



    @RequestMapping(value = "transacao/update", method = RequestMethod.GET)
    public ModelAndView update(Integer id) {
        return new ModelAndView("update", "transacao", transacaoService.getTransacaoById(id).get());
    }



    @RequestMapping(value = "transacao/update", method = RequestMethod.POST)
    public String submitUpdate(@ModelAttribute("transacao")Transacao transacao, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        transacaoService.updateTransacao(transacao);
        return "redirect:";
    }



    @RequestMapping(value = "transacao/read", method = RequestMethod.GET)
    public ModelAndView read() {
        ModelAndView mav = new ModelAndView("read");
        mav.addObject("transacaos", transacaoService.getAllTransacao());
        return mav;
    }



    @RequestMapping(value = "transacao", method = RequestMethod.GET)
    public ModelAndView index() {
        ModelAndView mav = new ModelAndView("transacao/index");
        mav.addObject("transacaos", transacaoService.getAllTransacao());
        return mav;
    }
    
}
