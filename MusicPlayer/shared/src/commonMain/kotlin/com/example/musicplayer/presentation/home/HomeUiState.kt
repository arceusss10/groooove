package com.example.musicplayer.presentation.home

import com.example.musicplayer.model.Song

data class HomeUiState(
    val songs: List<Song> = emptyList(),
    val isLoading: Boolean = false
)