package com.example.musicplayer.components

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.musicplayer.navigation.Screen


@Composable
fun BottomNavigationBar(
    currentScreen: Screen,
    onScreenSelected: (Screen) -> Unit,
    modifier: Modifier = Modifier
) {
    val screens = listOf(
        Screen.Home,
        Screen.Library,
        Screen.Search,
        Screen.Settings
    )

    NavigationBar(
        modifier = modifier
    ) {
        screens.forEach { screen ->

            NavigationBarItem(
                selected = currentScreen == screen,

                onClick = {
                    onScreenSelected(screen)
                },

                icon = {
                    Icon(
                        imageVector = screen.icon,
                        contentDescription = screen.title
                    )
                },

                label = {
                    Text(screen.title)
                }
            )
        }
    }
}