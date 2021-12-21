package com.luizalabs.zipcode.controller.response

data class ZipCodeResponse(
    var code: String,
    var street: String,
    var district: String,
    var city: String,
    var state: String
)