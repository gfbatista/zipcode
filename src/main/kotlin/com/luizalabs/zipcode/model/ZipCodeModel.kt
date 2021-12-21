package com.luizalabs.zipcode.model

import java.time.LocalDateTime
import javax.persistence.*

@Entity(name = "zip_code")
data class ZipCodeModel(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int,

    @Column
    var code: String,

    @Column
    var street: String,

    @Column
    var district: String,

    @Column
    var city: String,

    @Column
    var state: String,

    @Column(name = "created_at")
    val createdAt: LocalDateTime = LocalDateTime.now()
)