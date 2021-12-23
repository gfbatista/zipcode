package com.luizalabs.zipcode.exception

import com.luizalabs.zipcode.controller.response.ErrorResponse
import com.luizalabs.zipcode.controller.response.FieldErrorResponse
import com.luizalabs.zipcode.enums.Errors
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.MethodArgumentNotValidException
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.context.request.WebRequest

@ControllerAdvice
class ControllerAdvice {

    @ExceptionHandler(NotFoundException::class)
    fun handleNotFoundException(ex: NotFoundException, request: WebRequest): ResponseEntity<ErrorResponse> {
        val err = ErrorResponse(HttpStatus.NOT_FOUND.value(), ex.message, ex.errorCode, null)

        return ResponseEntity(err, HttpStatus.NOT_FOUND)
    }

    @ExceptionHandler(MethodArgumentNotValidException::class)
    fun handleBMethodArgumentNotValidException(
        ex: MethodArgumentNotValidException,
        request: WebRequest
    ): ResponseEntity<ErrorResponse> {
        val erro = ErrorResponse(HttpStatus.UNPROCESSABLE_ENTITY.value(),
            Errors.ERROR002.message,
            Errors.ERROR002.code,
            ex.bindingResult.fieldErrors.map { FieldErrorResponse(it.defaultMessage ?: "Invalid", it.field) })

        return ResponseEntity(erro, HttpStatus.UNPROCESSABLE_ENTITY)
    }
}