package com.luizalabs.zipcode.controller

import com.luizalabs.zipcode.controller.request.PostZipCodeRequest
import com.luizalabs.zipcode.controller.response.ZipCodeResponse
import com.luizalabs.zipcode.extension.toResponse
import com.luizalabs.zipcode.extension.toZipCodeModel
import com.luizalabs.zipcode.model.ZipCodeModel
import com.luizalabs.zipcode.service.ZipCodeService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@RestController
@RequestMapping("zipcode")
class ZipCodeController(
    private val zipCodeService: ZipCodeService
) {

    @GetMapping
    fun getAll(): List<ZipCodeResponse> {
        return zipCodeService.getAll().map { it.toResponse() }
    }

    @GetMapping("/{code}")
    fun getZipCode(@PathVariable code: String): ZipCodeResponse? {
        return zipCodeService.findByCode(code)?.toResponse()
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody @Valid zipcode: PostZipCodeRequest) {
        zipCodeService.create(zipcode.toZipCodeModel())
    }

}