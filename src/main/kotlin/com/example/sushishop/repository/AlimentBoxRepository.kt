package com.example.sushishop.repository

import com.example.sushishop.model.AlimentBox
import org.springframework.data.repository.CrudRepository

interface AlimentBoxRepository : CrudRepository<AlimentBox, Long> {
}