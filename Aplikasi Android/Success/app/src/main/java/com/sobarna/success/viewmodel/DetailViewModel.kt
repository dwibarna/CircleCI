package com.sobarna.success.viewmodel

import androidx.lifecycle.ViewModel
import com.sobarna.success.core.domain.model.Movie
import com.sobarna.success.core.domain.usecase.MovieUseCase

class DetailViewModel(private val useCase: MovieUseCase) : ViewModel() {
    fun setFavoriteTourism(movie: Movie, newStatus:Boolean) =
        useCase.setFavoriteMovie(movie, newStatus)
}