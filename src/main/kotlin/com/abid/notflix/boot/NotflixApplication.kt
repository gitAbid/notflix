package com.abid.notflix.boot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan("com.abid.notflix")
class NotflixApplication

fun main(args: Array<String>) {
    runApplication<NotflixApplication>(*args)
}
