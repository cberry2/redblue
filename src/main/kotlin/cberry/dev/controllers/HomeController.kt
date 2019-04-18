package cberry.dev.controllers

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/")
class HomeController {

    @Get
    fun home() = "Hello Worldz"
}