package com.sobarna.wecandoit.core.data.source.local


import com.sobarna.wecandoit.core.data.source.local.entity.MovieEntity
import com.sobarna.wecandoit.core.data.source.local.room.MovieDao
import kotlinx.coroutines.flow.Flow

class LocalDataSource private constructor(private val movieDao: MovieDao) {

    companion object {
        private var instance : LocalDataSource? = null

        fun getInstance(movieDao: MovieDao): LocalDataSource =
            instance ?: synchronized(this){
                instance ?: LocalDataSource(movieDao)
            }
    }

    fun getAllMovie(): Flow<List<MovieEntity>> = movieDao.getAllMovie()

    fun getFavoriteMovie(): Flow<List<MovieEntity>> = movieDao.getFavoriteMovie()

    suspend fun insertMovie(movie: List<MovieEntity>) = movieDao.insertMovie(movie)

    fun setFavoriteMovie(movie: MovieEntity, newState: Boolean) {
        movie.favorite = newState
        movieDao.updateFavoriteMovie(movie)
    }

}