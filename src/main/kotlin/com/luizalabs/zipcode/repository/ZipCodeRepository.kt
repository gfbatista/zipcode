package com.luizalabs.zipcode.repository

import com.luizalabs.zipcode.model.ZipCodeModel
import org.springframework.data.repository.CrudRepository

interface ZipCodeRepository : CrudRepository<ZipCodeModel, Int> {
    fun findByCode(code: String): ZipCodeModel?
}