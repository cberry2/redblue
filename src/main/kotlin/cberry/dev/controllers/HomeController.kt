package cberry.dev.controllers

import com.mongodb.reactivestreams.client.MongoClient
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import javax.inject.Inject

@Controller("/")
class HomeController(
    @Inject val mongoClient: MongoClient
) {

    @Get
    fun home() = "Hello Worldz"

    @Get("/db")
    fun db() = mongoClient.listDatabaseNames()

}