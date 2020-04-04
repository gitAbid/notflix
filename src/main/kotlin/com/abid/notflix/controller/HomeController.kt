package com.abid.notflix.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/")
class HomeController {

    fun home(): String {
        return "Welcome To Notflix"
    }

}