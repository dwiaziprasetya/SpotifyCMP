package com.dwiaziprasetya.spotifycmp.presentation.navigation

import com.dwiaziprasetya.spotifycmp.core.resource.Resources
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.Resource

enum class BottomBarDestination(
    val icon: DrawableResource,
    val activeIcon: DrawableResource,
    val title: String,
    val screen: Screen
) {
    Home(
        icon = Resources.Icon.home,
        activeIcon = Resources.Icon.home_active,
        title = "Home",
        screen = Screen.Home
    ),
    Search(
        icon = Resources.Icon.search,
        activeIcon = Resources.Icon.search_active,
        title = "Search",
        screen = Screen.Search
    ),
    YourLibrary(
        icon = Resources.Icon.your_library,
        activeIcon = Resources.Icon.your_library_active,
        title = "Your Library",
        screen = Screen.YourLibrray
    ),
    Premium(
        icon = Resources.Icon.premium,
        activeIcon = Resources.Icon.premium,
        title = "Premium",
        screen = Screen.Premium
    ),
    Create(
        icon = Resources.Icon.create,
        activeIcon = Resources.Icon.create,
        title = "Create",
        screen = Screen.Create
    )
}