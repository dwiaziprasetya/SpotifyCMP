package com.dwiaziprasetya.spotifycmp.core.resource

import spotifycmp.composeapp.generated.resources.Res
import spotifycmp.composeapp.generated.resources.home
import spotifycmp.composeapp.generated.resources.home_active
import spotifycmp.composeapp.generated.resources.plus
import spotifycmp.composeapp.generated.resources.search
import spotifycmp.composeapp.generated.resources.search_active
import spotifycmp.composeapp.generated.resources.spotify
import spotifycmp.composeapp.generated.resources.your_library
import spotifycmp.composeapp.generated.resources.your_library_active

object Resources {
    object Icon {
        val home = Res.drawable.home
        val home_active = Res.drawable.home_active

        val search = Res.drawable.search
        val search_active = Res.drawable.search_active

        val your_library = Res.drawable.your_library
        val your_library_active = Res.drawable.your_library_active

        val premium = Res.drawable.spotify

        val create = Res.drawable.plus
    }
}