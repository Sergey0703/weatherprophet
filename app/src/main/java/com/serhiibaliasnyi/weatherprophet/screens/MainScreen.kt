package com.serhiibaliasnyi.weatherprophet.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
//import androidx.compose.ui.text.style.TextForegroundStyle.Unspecified.alpha
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.serhiibaliasnyi.weatherprophet.R
import com.serhiibaliasnyi.weatherprophet.ui.theme.BlueLight


@Preview(showBackground = true)
@Composable
fun MainScreen(){
    Image(painter = painterResource(id = R.drawable.blue_sky),
        contentDescription = "bg",
        modifier= Modifier
            .fillMaxSize()
            .alpha(0.7f),
        contentScale = ContentScale.FillBounds)
    Column(
        modifier= Modifier
            .fillMaxSize()
            .padding(5.dp)){
       Card(
           modifier= Modifier
               .fillMaxWidth(),
                colors = CardDefaults.cardColors(BlueLight),
               //.background(color = BlueLight),
               //elevation=0.dp,
               shape = RoundedCornerShape(10.dp)
       ){
           Column(
               modifier=Modifier.fillMaxWidth(),
               horizontalAlignment = Alignment.CenterHorizontally
           ){
                Row(
                    modifier=Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ){
                   Text(
                       modifier = Modifier.padding(top=5.dp, start=5.dp),
                       text = "10 April 2024",
                       style= TextStyle(fontSize=15.sp),
                       color= Color.White
                   )
                    AsyncImage(model = "https://cdn.weatherapi.com/weather/64x64/day/116.png",
                        contentDescription = "weather",
                        modifier= Modifier
                            .size(35.dp)
                            .padding(top = 3.dp, end = 8.dp))
                }

               Text(
                   text = "Killarney",
                   style= TextStyle(fontSize=24.sp),
                   color= Color.White
               )
               Text(
                   text = "14'C",
                   style= TextStyle(fontSize=65.sp),
                   color= Color.White
               )
               Text(
                   text = "Sunny",
                   style= TextStyle(fontSize=16.sp),
                   color= Color.White
               )
               Row(
                   modifier=Modifier.fillMaxWidth(),
                   horizontalArrangement = Arrangement.SpaceBetween
               ){
                   IconButton(onClick = { /*TODO*/ })
                   {
                      Icon(
                          painter = painterResource(id = R.drawable.button_search) ,
                          contentDescription ="button",
                          tint= Color.White)
                       
                   }

                   Text(
                       text = "14'C/10'C",
                       style= TextStyle(fontSize=16.sp),
                       color= Color.White
                   )

                   IconButton(onClick = { /*TODO*/ })
                   {
                       Icon(painter = painterResource(id = R.drawable.button_sync) ,
                           contentDescription ="button",
                           tint= Color.White)

                   }

               }
           }
       }
    }
}