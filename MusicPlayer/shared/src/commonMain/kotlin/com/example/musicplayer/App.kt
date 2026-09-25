package com.example.musicplayer

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.musicplayer.model.Song
import com.example.musicplayer.screens.HomeScreen

@Composable
fun App() {
    val songs = listOf(
        Song(
            id = 1,
            title = "Blinding Lights",
            artist = "The Weeknd",
            album = "After Hours",
            duration = 200
        ),
        Song(
            id = 2,
            title = "Starboy",
            artist = "The Weeknd",
            album = "Starboy",
            duration = 230
        ),
        Song(
            id = 3,
            title = "Save Your Tears",
            artist = "The Weeknd",
            album = "After Hours",
            duration = 215
        )
    )

    MaterialTheme {
        HomeScreen(songs)
    }
}