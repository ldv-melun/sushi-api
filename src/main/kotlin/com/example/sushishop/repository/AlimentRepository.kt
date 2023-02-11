package com.example.sushishop.repository

import com.example.sushishop.model.Aliment
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface AlimentRepository : CrudRepository<Aliment, Long>


