package com.example.musicplayer.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.LibraryMusic
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Screen(
    val title: String,
    val icon: ImageVector
) {
    data object Home: Screen(
        title = "Home",
        icon = Icons.Default.Home
    )
    data object Library : Screen(
        title = "Library",
        icon = Icons.Default.LibraryMusic
    )

    data object Search : Screen(
        title = "Search",
        icon = Icons.Default.Search
    )

    data object Settings : Screen(
        title = "Settings",
        icon = Icons.Default.Settings
    )
}
