package com.serhiibaliasnyi.weatherprophet

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.serhiibaliasnyi.weatherprophet.screens.MainScreen
import com.serhiibaliasnyi.weatherprophet.ui.theme.GoodweatherTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GoodweatherTheme {
                // A surface container using the 'background' color from the theme
                MainScreen()
            }
        }
    }
}

