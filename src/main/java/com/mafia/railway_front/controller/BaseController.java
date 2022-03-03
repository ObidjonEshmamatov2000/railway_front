package com.mafia.railway_front.controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;





@RestController
public interface BaseController<T> {


    public String add(Model model,@ModelAttribute T t) ;


    public String list(Model model);


    public String get(Model model, @PathVariable Long id, @ModelAttribute T t);


    public String update(Model model, @PathVariable Long id,@ModelAttribute T t);


    public String delete(Model model, @PathVariable Long id);

}
