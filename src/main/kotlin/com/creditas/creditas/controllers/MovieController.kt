package com.creditas.creditas.controllers

import com.creditas.creditas.models.Movie
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import kotlin.io.println as println1

@RestController
class MovieController {

    val Peliculas = arrayOf<Movie> (
            Movie (1,"Transporter","Pepe",true,50.00F),
            Movie (2,"UP","Juan",false,25.00F),
            Movie (3,"Nemo","Pedro",true,30.00F),
            Movie (4,"Fast and Furious","Luis",true,35.00F)
    )
    @GetMapping( "/movies")
    fun getAllmovies() : Array<Movie> = Peliculas ;

    //localhost:8080/movieId
    // ?=""
    // &name=""
    @GetMapping("/movieId")
    fun getMovieById1(
            @RequestParam(value="id", defaultValue = "0") id : Int,
            @RequestParam(value="titulo", defaultValue = "0") titulo : String
                       ) : List<Movie> =
            Peliculas.filter{it.id == id}

    //Mas comun y mas profesional
    //localhost:8080/movie/1/Transporter
    @GetMapping("/movie/{id}/{titulo}/{titulo}")
    fun getMovieById( @PathVariable id : Int ,
                      @PathVariable titulo : String) : List<Movie> =
            Peliculas.filter{it.id == id}.filter{it.titulo == titulo}
}







}