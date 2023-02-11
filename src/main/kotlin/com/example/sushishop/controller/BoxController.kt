package com.example.sushishop.controller
import com.example.sushishop.repository.BoxRepository
import org.springframework.web.bind.annotation.*
import java.util.*


@RestController
@RequestMapping("/boxes")
class BoxController(val boxRepository: BoxRepository) {

}