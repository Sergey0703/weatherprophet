package com.serhiibaliasnyi.weatherprophet

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.serhiibaliasnyi.weatherprophet.screens.MainCard
import com.serhiibaliasnyi.weatherprophet.screens.TabLayout
import com.serhiibaliasnyi.weatherprophet.ui.theme.GoodweatherTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           // GoodweatherTheme {
                Image(painter = painterResource(id = R.drawable.blue_sky),
                    contentDescription = "bg",
                    modifier= Modifier
                        .fillMaxSize()
                        .alpha(0.7f),
                    contentScale = ContentScale.FillBounds)
                Column {
                    MainCard()
                    TabLayout()

                }
           // }
        }
    }
}

