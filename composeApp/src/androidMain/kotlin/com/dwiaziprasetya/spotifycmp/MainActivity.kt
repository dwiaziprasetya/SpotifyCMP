package com.dwiaziprasetya.spotifycmp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.core.view.WindowInsetsControllerCompat
import androidx.core.graphics.toColorInt
import com.dwiaziprasetya.spotifycmp.di.initializeKoin
import org.koin.android.ext.koin.androidContext

@Suppress("DEPRECATION")
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        installSplashScreen()
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)

        window.statusBarColor = "#121212".toColorInt()
        WindowInsetsControllerCompat(window, window.decorView).isAppearanceLightStatusBars = false

        initializeKoin(
            config = {
                androidContext(this@MainActivity)
            }
        )

        setContent {
            App()
        }
    }
}

@Preview
@Composable
fun AppAndroidPreview() {
    App()
}