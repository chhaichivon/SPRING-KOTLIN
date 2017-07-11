package com.chhaichivon.controllers

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus
/**
 * AUTHOR : CHHAI CHIVON
 * EMAIL  : chhaichivon1995@gmail.com
 * DATE   : 7/12/2017
 * TIME   : 12:31 AM
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND)
class NotFoundException : RuntimeException()