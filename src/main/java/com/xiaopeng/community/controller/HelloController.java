package com.xiaopeng.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @description:
 * @date: Create By 2021/9/4 20:07
 */
@Controller
public class HelloController {

    @GetMapping("/hello")
    public String greeting(@RequestParam(name = "name") String name, Model model){
        model.addAttribute("name",name);
        return "hello";
    }
}
