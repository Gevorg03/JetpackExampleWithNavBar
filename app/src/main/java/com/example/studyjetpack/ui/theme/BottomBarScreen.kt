package com.example.studyjetpack.ui.theme

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.studyjetpack.R

sealed class BottomBarScreen(
    val route: String,
    val title: String,
    val icon: Int
) {
    object Home : BottomBarScreen(
        route = "Home",
        title = "Home",
        icon = R.drawable.ic_home
    )

    object Mediatate : BottomBarScreen(
        route = "Mediatate",
        title = "Mediatate",
        icon = R.drawable.ic_bubble
    )

    object Sleep : BottomBarScreen(
        route = "Sleep",
        title = "Sleep",
        icon = R.drawable.ic_moon
    )

    object Music : BottomBarScreen(
        route = "Music",
        title = "Music",
        icon = R.drawable.ic_music
    )

    object Profile : BottomBarScreen(
        route = "Profile",
        title = "Profile",
        icon = R.drawable.ic_profile
    )
}