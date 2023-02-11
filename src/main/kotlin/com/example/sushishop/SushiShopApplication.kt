package com.example.sushishop

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@SpringBootApplication
class SushiShopApplication {


    @GetMapping
    fun hellowWord() = "Hello"
}

fun main(args: Array<String>) {
    runApplication<SushiShopApplication>(*args)
}
