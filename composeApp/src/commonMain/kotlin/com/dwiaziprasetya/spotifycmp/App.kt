package com.dwiaziprasetya.spotifycmp

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import com.dwiaziprasetya.spotifycmp.presentation.navigation.AppNavHost
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        AppNavHost()
    }
}