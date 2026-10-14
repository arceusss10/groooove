package com.example.musicplayer.presentation.home

import androidx.lifecycle.ViewModel
import com.example.musicplayer.data.MusicRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class HomeViewModel(
    private val repository: MusicRepository
): ViewModel() {

    private val _uiState = MutableStateFlow(HomeUiState(
        isLoading = true
    ))

    val uiState: StateFlow<HomeUiState> = _uiState.asStateFlow()

    init {
        loadSongs()
    }

    private fun loadSongs(){
        val songs = repository.getSongs()

        _uiState.value = HomeUiState(
            songs = songs,
            isLoading = false
        )
    }
}