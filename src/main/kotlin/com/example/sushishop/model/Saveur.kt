package com.example.sushishop.model

import javax.persistence.*

@Entity
data class Saveur(
    var nom: String,

    @ManyToOne
    @JoinColumn(name = "box_id")
    var box: Box,
    @Id @GeneratedValue var id: Long? = null)