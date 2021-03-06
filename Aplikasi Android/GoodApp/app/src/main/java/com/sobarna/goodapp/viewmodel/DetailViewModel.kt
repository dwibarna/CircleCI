package com.sobarna.goodapp.viewmodel

import androidx.lifecycle.ViewModel
import com.sobarna.goodapp.core.domain.model.Movie
import com.sobarna.goodapp.core.domain.usecase.MovieUseCase

class DetailViewModel(private val useCase: MovieUseCase) : ViewModel() {
    fun setFavoriteTourism(movie: Movie, newStatus:Boolean) =
        useCase.setFavoriteMovie(movie, newStatus)
}