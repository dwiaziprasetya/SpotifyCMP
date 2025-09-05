package com.dwiaziprasetya.spotifycmp.presentation.navigation

import kotlinx.serialization.Serializable

@Serializable
sealed class Screen {

    @Serializable
    data object MainScreen: Screen()

    @Serializable
    data object Detail: Screen()

    @Serializable
    data object Home: Screen()

    @Serializable
    data object Search: Screen()

    @Serializable
    data object YourLibrray: Screen()

    @Serializable
    data object Premium: Screen()

    @Serializable
    data object Create: Screen()
}