package com.luizalabs.zipcode.service

import com.luizalabs.zipcode.model.ZipCodeModel
import com.luizalabs.zipcode.repository.ZipCodeRepository
import org.springframework.stereotype.Service

@Service
class ZipCodeService (
    private val zipCodeRepository: ZipCodeRepository
        ){

    fun getAll(): List<ZipCodeModel> {
        return zipCodeRepository.findAll().toList()
    }

}