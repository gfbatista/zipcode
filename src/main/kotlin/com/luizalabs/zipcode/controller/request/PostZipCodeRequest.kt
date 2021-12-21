package com.luizalabs.zipcode.controller.request

import javax.validation.constraints.NotEmpty
import javax.validation.constraints.Size

data class PostZipCodeRequest(

    @field:Size(min = 8, max = 8, message = "Zip code must have {max} characters")
    @field:NotEmpty(message = "Zip code must be informed")
    var code: String,

    @field:NotEmpty(message = "Street must be informed")
    var street: String,

    @field:NotEmpty(message = "District must be informed")
    var district: String,

    @field:NotEmpty(message = "City must be informed")
    var city: String,

    @field:Size(min = 2, max = 2, message = "State must have {max} characters")
    @field:NotEmpty(message = "State must be informed")
    var state: String,
)