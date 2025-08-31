package com.dwiaziprasetya.spotifycmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform