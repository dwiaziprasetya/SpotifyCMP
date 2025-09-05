package com.dwiaziprasetya.spotifycmp.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.dwiaziprasetya.spotifycmp.presentation.screen.home.HomeScreen
import com.dwiaziprasetya.spotifycmp.presentation.screen.main.MainScreen

@Composable
fun AppNavHost() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.MainScreen
    ) {
        composable<Screen.MainScreen> {
            MainScreen()
        }
    }
}