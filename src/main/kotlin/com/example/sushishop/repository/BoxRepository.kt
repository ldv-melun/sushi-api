package com.example.sushishop.repository

import com.example.sushishop.model.Box
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository



@Repository
interface BoxRepository : CrudRepository<Box, Long>
