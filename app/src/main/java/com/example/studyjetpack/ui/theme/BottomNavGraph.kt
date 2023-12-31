package com.example.studyjetpack.ui.theme

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun BottomNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Home.route
    ) {
        composable(
            route = BottomBarScreen.Home.route
        ) {
            HomeScreen()
        }

        composable(
            route = BottomBarScreen.Mediatate.route
        ) {
            HomeScreen()
        }

        composable(
            route = BottomBarScreen.Sleep.route
        ) {
            HomeScreen()
        }
    }
}