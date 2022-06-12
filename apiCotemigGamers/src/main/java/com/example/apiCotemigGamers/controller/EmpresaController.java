package com.example.apiCotemigGamers.controller;

import com.example.apiCotemigGamers.model.Empresa;
import com.example.apiCotemigGamers.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmpresaController {

    @Autowired
    private EmpresaService empresaService;

    @RequestMapping(value = "empresa/insert", method = RequestMethod.GET)
    public ModelAndView insert() {
        return new ModelAndView("insert", "Empresa", new Empresa());
    }

    @RequestMapping(value = "empresa/insert", method = RequestMethod.POST)
    public String submitInsert(@ModelAttribute("Empresa")Empresa empresa, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        empresaService.insertEmpresa(empresa);
        return "redirect:";
    }



    @RequestMapping(value = "empresa/delete", method = RequestMethod.GET)
    public ModelAndView delete(Integer id) {
        return new ModelAndView("delete", "Empresa", empresaService.getEmpresaById(id).get());
    }



    @RequestMapping(value = "empresa/delete", method = RequestMethod.POST)
    public String submitDelete(@ModelAttribute("empresa")Empresa empresa, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        empresaService.deleteEmpresaById(empresa.getIdEmpresa());
        return "redirect:";
    }



    @RequestMapping(value = "empresa/update", method = RequestMethod.GET)
    public ModelAndView update(Integer id) {
        return new ModelAndView("update", "empresa", empresaService.getEmpresaById(id).get());
    }



    @RequestMapping(value = "empresa/update", method = RequestMethod.POST)
    public String submitUpdate(@ModelAttribute("empresa")Empresa empresa, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        empresaService.updateEmpresa(empresa);
        return "redirect:";
    }



    @RequestMapping(value = "empresa/read", method = RequestMethod.GET)
    public ModelAndView read() {
        ModelAndView mav = new ModelAndView("read");
        mav.addObject("empresas", empresaService.getAllEmpresas());
        return mav;
    }



    @RequestMapping(value = "empresa", method = RequestMethod.GET)
    public ModelAndView index() {
        ModelAndView mav = new ModelAndView("empresa/index");
        mav.addObject("empresas", empresaService.getAllEmpresas());
        return mav;
    }
    
}
