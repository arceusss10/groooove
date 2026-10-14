package com.example.musicplayer.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.example.musicplayer.model.Song
import com.example.musicplayer.presentation.home.HomeUiState


@Composable
fun HomeScreen(
    uiState: HomeUiState
){
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        item {
            Text(
                text = "Good Evening",
                style = MaterialTheme.typography.headlineMedium
            )
        }
        item {
            Text(
                text = "Recently Played",
                style = MaterialTheme.typography.titleLarge
            )
        }
        items(uiState.songs){ song->
            SongItem(
                song = song,
            )
        }
    }
}

@Composable
private fun SongItem(
    song: Song,
){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(8.dp))
            .background(
                MaterialTheme.colorScheme.surfaceVariant
            )
            .padding(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ){
        Spacer(
            modifier = Modifier
                .size(64.dp)
                .clip(RoundedCornerShape(8.dp))
                .background(
                    MaterialTheme.colorScheme.primaryContainer
                )
        )
        Column(
            modifier = Modifier
                .padding(start = 16.dp)
                .weight(1f)
        ) {
            Text(
                text = song.title,
                style = MaterialTheme.typography.titleMedium
            )

            Text(
                text = song.artist,
                style = MaterialTheme.typography.bodyMedium
            )
        }
        Text(
            text = formatDuration(song.duration),
            style = MaterialTheme.typography.bodySmall
        )
    }
}

private fun formatDuration(seconds: Long): String {
    val minutes = seconds / 60
    val remainingSeconds = seconds % 60
    val formattedSeconds = remainingSeconds.toString().padStart(2, '0')

    return "$minutes:$formattedSeconds"
}