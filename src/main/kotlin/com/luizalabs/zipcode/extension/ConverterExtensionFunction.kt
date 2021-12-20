package com.luizalabs.zipcode.extension

import com.luizalabs.zipcode.controller.response.ZipCodeResponse
import com.luizalabs.zipcode.model.ZipCodeModel

fun ZipCodeModel.toResponse(): ZipCodeResponse {
    return ZipCodeResponse(
        cep = this.cep,
        rua = this.rua,
        bairro = this.bairro,
        cidade = this.cidade,
        uf = this.uf
    )
}