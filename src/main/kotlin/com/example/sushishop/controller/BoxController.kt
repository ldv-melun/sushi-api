package com.example.sushishop.controller
import com.example.sushishop.model.Box
import com.example.sushishop.repository.BoxRepository
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.util.*


@RestController
@RequestMapping("/boxes")
class BoxController(val boxRepository: BoxRepository) {

    @PostMapping
    fun addBox(@RequestBody box: Box): ResponseEntity<Box> {
        val newBox = boxRepository.save(box)
        return ResponseEntity.ok(newBox)
    }

}