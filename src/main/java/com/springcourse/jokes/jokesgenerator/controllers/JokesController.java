package com.springcourse.jokes.jokesgenerator.controllers;

import com.springcourse.jokes.jokesgenerator.services.JokesService;
import com.springcourse.jokes.jokesgenerator.services.JokesServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class JokesController {

    private JokesService jokesService;

    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping("/")
    public String getJoke(Model model){
        model.addAttribute("joke", jokesService.getJoke());
        return "jokes";
    }
}
