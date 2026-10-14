package com.example.musicplayer

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.example.musicplayer.components.BottomNavigationBar
import com.example.musicplayer.data.MusicRepository
import com.example.musicplayer.model.Song
import com.example.musicplayer.navigation.Screen
import com.example.musicplayer.presentation.home.HomeViewModel
import com.example.musicplayer.screens.HomeScreen
import com.example.musicplayer.screens.LibraryScreen
import com.example.musicplayer.screens.SearchScreen
import com.example.musicplayer.screens.SettingsScreen

@Composable
fun App() {
    var currentScreen by remember {
        mutableStateOf<Screen>(Screen.Home)
    }

    val musicRepository = remember { MusicRepository() }

    val homeViewModel = remember { HomeViewModel(musicRepository) }

    val homeUiState by homeViewModel.uiState.collectAsState()

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
                        uiState = homeUiState
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
