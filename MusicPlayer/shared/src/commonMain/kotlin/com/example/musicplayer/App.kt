package com.example.musicplayer

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.example.musicplayer.components.BottomNavigationBar
import com.example.musicplayer.model.Song
import com.example.musicplayer.navigation.Screen
import com.example.musicplayer.screens.HomeScreen
import com.example.musicplayer.screens.LibraryScreen
import com.example.musicplayer.screens.SearchScreen
import com.example.musicplayer.screens.SettingsScreen

@Composable
fun App() {
    var currentScreen by remember {
        mutableStateOf<Screen>(Screen.Home)
    }
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

        Scaffold(

            bottomBar = {
                BottomNavigationBar(
                    currentScreen = currentScreen,
                    onScreenSelected = { screen ->
                        currentScreen = screen
                    }
                )
            }

        ) { _ ->

            when (currentScreen) {

                Screen.Home -> {
                    HomeScreen(
                        songs = songs
                    )
                }

                Screen.Library -> {
                    LibraryScreen()
                }

                Screen.Search -> {
                    SearchScreen()
                }

                Screen.Settings -> {
                    SettingsScreen()
                }
            }
        }
    }
}
