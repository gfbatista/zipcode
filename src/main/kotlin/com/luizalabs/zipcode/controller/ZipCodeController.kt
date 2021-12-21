package com.luizalabs.zipcode.controller

import com.luizalabs.zipcode.controller.response.ZipCodeResponse
import com.luizalabs.zipcode.extension.toResponse
import com.luizalabs.zipcode.model.ZipCodeModel
import com.luizalabs.zipcode.service.ZipCodeService
import org.springframework.web.bind.annotation.*

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
    fun getZipCode(@PathVariable code: String): ZipCodeModel? {
        return zipCodeService.findByCode(code)
    }

}