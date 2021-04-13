package edu.itesm.nytimes

import retrofit2.Response
import retrofit2.http.GET

interface APIService{
    @GET("hardcover-fiction.json?api-key=URGoz54WqmHBhJ7Csy8W7GCGyhTwKZsQ")
    suspend fun getBooks() : Response<Results>
}
