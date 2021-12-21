package com.luizalabs.zipcode.controller.response

data class ZipCodeResponse(
    var street: String,
    var district: String,
    var city: String,
    var state: String
) {
    var code: String = ""

    constructor(
        code: String,
        street: String,
        district: String,
        city: String,
        state: String
    ) : this(street, district, city, state) {
        val prefix: String = code.substring(0, code.length - 3)
        val suffix: String = code.substring(code.length - 3, code.length)
        this.code = prefix.plus("-").plus(suffix)
    }
}