package com.dwiaziprasetya.spotifycmp.presentation.screen.main

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.dwiaziprasetya.spotifycmp.presentation.navigation.BottomBarDestination
import com.dwiaziprasetya.spotifycmp.presentation.navigation.Screen
import com.dwiaziprasetya.spotifycmp.presentation.navigation.component.BottomBar
import com.dwiaziprasetya.spotifycmp.presentation.screen.home.HomeScreen

@Composable
fun MainScreen() {
    val navController = rememberNavController()
    val currentRoute = navController.currentBackStackEntryAsState()
    val selectedDestination by remember {
        derivedStateOf {
            val route = currentRoute.value?.destination?.route.toString()
            when {
                route.contains(BottomBarDestination.Home.screen.toString()) -> BottomBarDestination.Home
                route.contains(BottomBarDestination.Search.screen.toString()) -> BottomBarDestination.Search
                route.contains(BottomBarDestination.YourLibrary.screen.toString()) -> BottomBarDestination.YourLibrary
                route.contains(BottomBarDestination.Premium.screen.toString()) -> BottomBarDestination.Premium
                route.contains(BottomBarDestination.Create.screen.toString()) -> BottomBarDestination.Create
                else -> BottomBarDestination.Home
            }
        }
    }

    Scaffold(
        contentWindowInsets = WindowInsets(0, 0, 0, 0),
        containerColor = Color(0xFF121212)
    ) { padding ->
        Box(
            modifier = Modifier.fillMaxSize()
        ) {
            NavHost(
                modifier = Modifier.fillMaxSize(),
                navController = navController,
                startDestination = Screen.Home
            ) {
                composable<Screen.Home> {
                    HomeScreen()
                }
                composable<Screen.Search> { }
                composable<Screen.YourLibrray> { }
                composable<Screen.Premium> { }
                composable<Screen.Create> { }
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)
                    .align(Alignment.BottomCenter)
                    .background(
                        Brush.verticalGradient(
                            colors = listOf(
                                Color.Transparent,
                                Color(0xFF121212).copy(alpha = 0.9f),
                                Color(0xFF121212).copy(alpha = 0.9f),
                                Color(0xFF121212)
                            )
                        )
                    )
            )
            BottomBar(
                selected = selectedDestination,
                onSelect = { destination ->
                    navController.navigate(destination.screen) {
                        launchSingleTop = true
                        popUpTo<Screen.Home> {
                            saveState = true
                            inclusive = false
                        }
                        restoreState = true
                    }
                },
                modifier = Modifier.align(Alignment.BottomCenter)
            )
        }
    }
}
