package com.dwiaziprasetya.spotifycmp.presentation.navigation

import kotlinx.serialization.Serializable

@Serializable
sealed class Screen {

    @Serializable
    data object Home: Screen()
}