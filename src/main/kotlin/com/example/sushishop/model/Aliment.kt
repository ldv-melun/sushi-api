package com.example.sushishop.model

import javax.persistence.*

@Entity
class Aliment(
    var nom: String,

    @OneToMany(mappedBy = "aliment")
    var alimentBoxes: List<AlimentBox>,
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null)