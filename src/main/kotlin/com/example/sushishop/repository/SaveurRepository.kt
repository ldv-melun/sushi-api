package com.example.sushishop.repository

import com.example.sushishop.model.Saveur
import org.springframework.data.repository.CrudRepository

interface SaveurRepository : CrudRepository<Saveur, Long> {
}