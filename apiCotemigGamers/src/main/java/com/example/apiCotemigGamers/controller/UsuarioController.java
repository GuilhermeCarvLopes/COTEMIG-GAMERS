package com.example.apiCotemigGamers.controller;

import com.example.apiCotemigGamers.model.Usuario;
import com.example.apiCotemigGamers.service.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @RequestMapping(value = "usuario/insert", method = RequestMethod.GET)
    public ModelAndView insert() {
        return new ModelAndView("insert", "usuario", new Usuario());
    }

    @RequestMapping(value = "usuario/insert", method = RequestMethod.POST)
    public String submitInsert(@ModelAttribute("Usuario")Usuario usuario, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        usuarioService.insertUsuario(usuario);
        return "redirect:";
    }



    @RequestMapping(value = "usuario/delete", method = RequestMethod.GET)
    public ModelAndView delete(Integer id) {
        return new ModelAndView("delete", "usuario", usuarioService.getUsuarioById(id).get());
    }



    @RequestMapping(value = "usuario/delete", method = RequestMethod.POST)
    public String submitDelete(@ModelAttribute("Usuario")Usuario usuario, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        usuarioService.deleteUsuarioById(usuario.getIdUsuario());
        return "redirect:";
    }



    @RequestMapping(value = "usuario/update", method = RequestMethod.GET)
    public ModelAndView update(Integer id) {
        return new ModelAndView("update", "usuario", usuarioService.getUsuarioById(id).get());
    }



    @RequestMapping(value = "usuario/update", method = RequestMethod.POST)
    public String submitUpdate(@ModelAttribute("Usuario")Usuario usuario, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        usuarioService.updateUsuario(usuario);
        return "redirect:";
    }



    @RequestMapping(value = "usuario/read", method = RequestMethod.GET)
    public ModelAndView read() {
        ModelAndView mav = new ModelAndView("read");
        mav.addObject("usuarios", usuarioService.getAllUsuarios());
        return mav;
    }



    @RequestMapping(value = "usuario", method = RequestMethod.GET)
    public ModelAndView index() {
        ModelAndView mav = new ModelAndView("usuario/insert");
        mav.addObject("usuarios", usuarioService.getAllUsuarios());
        return mav;
    }
    
}
