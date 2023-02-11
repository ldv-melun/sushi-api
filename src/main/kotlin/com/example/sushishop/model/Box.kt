package com.example.sushishop.model

import javax.persistence.*

@Entity
data class Box(
    var nom: String,
    var pieces: Int,
    var prix: Double,
    var image: String,

    @OneToMany(mappedBy = "box")
    var saveurs: List<Saveur>?,

    @OneToMany(mappedBy = "box", cascade = [CascadeType.ALL])
    var alimentBoxes: List<AlimentBox>?,

    @Id @GeneratedValue var id: Long? = null)
