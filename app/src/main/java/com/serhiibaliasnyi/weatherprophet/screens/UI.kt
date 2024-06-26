package com.serhiibaliasnyi.weatherprophet.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.serhiibaliasnyi.weatherprophet.data.WeatherModel
import com.serhiibaliasnyi.weatherprophet.ui.theme.BlueLight


@Composable
fun MainList(list:List<WeatherModel>, currentDays:MutableState<WeatherModel>){
    LazyColumn(
        modifier=Modifier.fillMaxSize()
    ) {
        //items(15){
        //    ListItem()
        //}
        itemsIndexed(
            list
            /*listOf(
                WeatherModel(
                "Killarney",
                     "10:00",
                "25 'C",
                "Sunny",
                "//cdn.weatherapi.com/weather/64x64/day/116.png",
                    "",
                "",
                ""
            ),
                WeatherModel(
                    "Killarney",
                    "19/04/2024",
                    "",
                    "Sunny",
                    "//cdn.weatherapi.com/weather/64x64/day/116.png",
                    "18",
                    "12",
                    "qwqeqweq"
                ),


                ) */
        ){
                _, item->
            ListItem(item)
        }
    }
    //end LazyColumn

}
//@Preview(showBackground = true)
@Composable
fun ListItem(item:WeatherModel) {
    Card(modifier=Modifier
        .fillMaxWidth(1f)
        .padding(top=3.dp),
        colors = CardDefaults.cardColors(BlueLight),
        //backgroundColor= BlueLight,
        //elevation = 1.dp,
        shape = RoundedCornerShape(5.dp)
    ){
        Row( modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment=Alignment.CenterVertically)
        {
             Column(modifier=Modifier
                 .padding(
                 start=8.dp, top=5.dp, bottom = 5.dp))
             {
                 Text(text=item.time)
                 Text(
                     text=item.condition,
                     color= Color.White)
             }
            //℃
            Text(
                text=item.currentTemp.ifEmpty { "${item.maxTemp} / ${item.minTemp}" },
                color= Color.White,
                style= TextStyle(fontSize = 25.sp)
            )

            AsyncImage(model = "https:${item.icon}", //cdn.weatherapi.com/weather/64x64/day/116.png",
                contentDescription = "weather2",
                modifier= Modifier
                    .size(35.dp)
                    .padding( end = 8.dp))
        }
    }
}