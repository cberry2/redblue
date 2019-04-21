package cberry.dev.controllers

import com.mongodb.reactivestreams.client.MongoClient
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.reactivex.Single
import javax.inject.Inject

@Controller("/")
class HomeController(
    @Inject val mongoClient: MongoClient
) {

    @Get
    fun home() = "Hello Worldz"

    @Get("/db")
    fun db(): Single<Long> {
        println("db version 1")
        return Single.fromPublisher(
            mongoClient.getDatabase("admin")
                .getCollection("test")
                .count()
        )

//        val db = mongoClient.getDatabase("admin")
//        println("db found: $db")
//
//        val collection = db.getCollection("test")
//        println("'test' collection found: $collection")
//
//        val count = collection.count()
//        println("count found: $count")
//
//        return "test"
    }

}