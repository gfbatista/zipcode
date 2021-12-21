package com.luizalabs.zipcode.service

import com.luizalabs.zipcode.enums.Errors
import com.luizalabs.zipcode.exception.NotFoundException
import com.luizalabs.zipcode.model.ZipCodeModel
import com.luizalabs.zipcode.repository.ZipCodeRepository
import org.springframework.stereotype.Service

@Service
class ZipCodeService(
    private val zipCodeRepository: ZipCodeRepository
) {

    fun getAll(): List<ZipCodeModel> {
        return zipCodeRepository.findAll().toList()
    }

    fun findByCep(cep: String): ZipCodeModel? {
        return zipCodeRepository.findByCep(cep) ?: throw NotFoundException(Errors.ERROR001.message.format(cep), Errors.ERROR001.code)
    }

}