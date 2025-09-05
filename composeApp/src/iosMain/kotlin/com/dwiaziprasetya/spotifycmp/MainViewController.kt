package com.dwiaziprasetya.spotifycmp

import androidx.compose.ui.window.ComposeUIViewController
import com.dwiaziprasetya.spotifycmp.di.initializeKoin

fun MainViewController() = ComposeUIViewController(
    configure = { initializeKoin( ) }
) { App() }