package com.luizalabs.zipcode.model

import java.time.LocalDateTime
import javax.persistence.*

@Entity(name = "zip_code")
data class ZipCodeModel(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int,

    @Column
    var cep: String,

    @Column
    var rua: String,

    @Column
    var bairro: String,

    @Column
    var cidade: String,

    @Column
    var uf: String,

    @Column(name = "created_at")
    val createdAt: LocalDateTime = LocalDateTime.now()
)