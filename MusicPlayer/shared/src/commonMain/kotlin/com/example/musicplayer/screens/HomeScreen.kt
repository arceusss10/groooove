package com.example.musicplayer.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.musicplayer.model.Song


@Composable
fun HomeScreen(
    songs: List<Song>
){
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        item {
            Text(
                text = "Good Evening"
            )
        }
        item {
            Text(
                text = "Recently Played"
            )
        }
        items(songs){ song->
            Text(
                text = "${song.title} • ${song.artist}"
            )
        }
    }
}