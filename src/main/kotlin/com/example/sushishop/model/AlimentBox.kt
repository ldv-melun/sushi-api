package com.example.sushishop.model

import javax.persistence.*


@Entity
class AlimentBox(
    var quantite: Int,
    @ManyToOne
    @JoinColumn(name = "aliment_id")
    var aliment: Aliment,
    @ManyToOne
    @JoinColumn(name = "box_id")
    var box: Box,
    @Id @GeneratedValue var id: Long? = null)