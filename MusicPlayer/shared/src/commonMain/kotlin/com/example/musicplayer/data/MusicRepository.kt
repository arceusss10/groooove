package com.example.musicplayer.data

import com.example.musicplayer.model.Song

class MusicRepository{
    fun getSongs(): List<Song>{
        return listOf(
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
    }
}