package com.example.demo

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class HelloController {

    @GetMapping("/hello")
    @ResponseBody
    fun hello_world(): String {
        return "hello, world"
    }

    @GetMapping("/hello/{name}")
    fun hello_name(@PathVariable name: String, model: Model): String {
        model.addAttribute("name", name)
        return "hello_name"
    }
}