package com.luizalabs.zipcode.exception

class NotFoundException(override val message: String, val errorCode: String) : Exception() {
}