package com.example.apka2;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {
    private final YouTube youTube;

    public HomeController(YouTube youTube){
        this.youTube = youTube;
    }

    @GetMapping("/")
    String index(Model model){
        model.addAttribute("channelVideos",
                youTube.channelVideos("",10,YouTube.Sort.VIEW_COUNT));
        return "index";
    }
}
