package com.creditas.creditas.controllers

import com.creditas.creditas.models.Movie
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class MovieController {

    @GetMapping("/movies")
    fun getAllMovies(
            @RequestParam(value = "name", defaultValue = "All") name: String) =

        Movie(1,"SoyLeyenda","Albert",true,40.00F)



}