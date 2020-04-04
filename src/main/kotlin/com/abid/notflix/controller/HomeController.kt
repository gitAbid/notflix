package com.abid.notflix.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
@RequestMapping("/")
class HomeController {

    @GetMapping
    @ResponseBody
    fun home(): String {
        return "Welcome To Notflix"
    }

}