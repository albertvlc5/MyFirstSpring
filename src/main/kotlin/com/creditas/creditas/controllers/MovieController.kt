package com.creditas.creditas.controllers

import com.creditas.creditas.models.Movie
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class MovieController {

    @GetMapping( "/movies")
    fun getAllmovies() =

            Movie(1,"SoyLeyenda","Albert",true,40.00F)

    @GetMapping("/movie")
    fun getMovieById( @RequestParam(value = "id", defaultValue = "0") id: Int) =

        Movie(1,"SoyLeyenda","Albert",true,40.00F)



}