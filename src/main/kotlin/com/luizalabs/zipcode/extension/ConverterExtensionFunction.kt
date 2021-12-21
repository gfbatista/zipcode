package com.luizalabs.zipcode.extension

import com.luizalabs.zipcode.controller.response.ZipCodeResponse
import com.luizalabs.zipcode.model.ZipCodeModel

fun ZipCodeModel.toResponse(): ZipCodeResponse {
    return ZipCodeResponse(
        code = this.code,
        street = this.street,
        district = this.district,
        city = this.city,
        state = this.state
    )
}