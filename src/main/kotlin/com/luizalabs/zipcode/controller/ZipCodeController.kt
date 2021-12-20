package com.luizalabs.zipcode.controller

import com.luizalabs.zipcode.controller.response.ZipCodeResponse
import com.luizalabs.zipcode.extension.toResponse
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

    /*@GetMapping("/{CEP}")
    fun getZipCode(@PathVariable id: Int): ZipCodeResponse {
        return zipCodeService.findByCep(id).toResponse()
    }
    */
}