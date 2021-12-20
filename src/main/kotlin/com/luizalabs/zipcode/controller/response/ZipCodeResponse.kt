package com.luizalabs.zipcode.controller.response

data class ZipCodeResponse(
    var cep: String,
    var rua: String,
    var bairro: String,
    var cidade: String,
    var uf: String
)