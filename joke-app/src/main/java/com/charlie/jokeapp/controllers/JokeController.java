package com.charlie.jokeapp.controllers;

import com.charlie.jokeapp.services.JokeService;
import com.charlie.jokeapp.services.JokeServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping("/jokes")
    public String getJokes(Model model) {
        model.addAttribute("joke",this.jokeService.getJoke());
        return "chucknorris";
    }
}
