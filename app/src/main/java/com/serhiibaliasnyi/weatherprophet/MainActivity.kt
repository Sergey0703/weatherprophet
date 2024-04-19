package com.serhiibaliasnyi.weatherprophet

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.privacysandbox.tools.core.model.Method
import com.android.volley.Request
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.serhiibaliasnyi.weatherprophet.screens.MainCard
import com.serhiibaliasnyi.weatherprophet.screens.TabLayout
import com.serhiibaliasnyi.weatherprophet.ui.theme.GoodweatherTheme

const val API_KEY = "75225e91714c4104861143421241904"
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           // GoodweatherTheme {
            getData("Killarney", this)
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

private fun getData(city: String, context: Context){
    val url = "https://api.weatherapi.com/v1/forecast.json?key=$API_KEY" +
            "&q=$city" +
            "&days=" +
            "3" +
            "&aqi=no&alerts=no"
    val queue = Volley.newRequestQueue(context)
    val sRequest = StringRequest(
        Request.Method.GET,
        url,
        {
                response ->
            Log.d("MyLog", "Response: $response")
        },
        {
            Log.d("MyLog", "VolleyError: $it")
        }
    )
    queue.add(sRequest)
}