package com.luizalabs.zipcode.enums

enum class Errors(val code: String, val message: String) {
    ERROR001("001", "code [%s] not found"),
    ERROR002("002", "Invalid Request")
}