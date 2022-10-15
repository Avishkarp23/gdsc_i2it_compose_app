package com.example.gdsci2it.screens

import androidx.compose.material.Text
//import androidx.compose.runtime.Composable
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.gdsci2it.R

@Composable
fun Info(){
    //Text(text = "Hello $name!")
    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
        Image(painter = painterResource(id = R.drawable.gdsc2), contentDescription = "logo", modifier = Modifier.padding(10.dp,5.dp))
        //Image(painter = painterResource(id = R.drawable.pic), contentDescription = "decor", modifier = Modifier.padding(150.dp,0.dp,80.dp,100.dp))
        Box()
        {
            Text(
                text = "GDSC I2IT",
                color = Color.Black,
                modifier = Modifier.padding(20.dp, 40.dp),
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "Software Development",
                color = Color.Black,
                modifier = Modifier.padding(20.dp, 60.dp)
            )
            Text(
                text = "LEARN-GROW-CONNECT",
                color = Color.Black,
                modifier = Modifier.padding(20.dp, 80.dp)
            )
            Text(
                text = "About Us",
                color = Color.Black,
                modifier = Modifier.padding(20.dp, 120.dp),
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "Google Developer Student Clubs (GDSC) are community groups for college and university students interested in Google developer technologies.Students from all undergraduate or graduate programs with an interest in growing as a developer are welcome.",
                color = Color.Black,
                modifier = Modifier.padding(20.dp, 140.dp)
            )
            Text(
                text = "Group Members of GDSC I2IT  \uD83D\uDC68\u200D\uD83D\uDCBB" +
                        "\n\n Avishkar " +
                        "\n Atul" +
                        "\n Neha" +
                        "\n Chaitanya" +
                        "\n Priyanshu" +
                        "\n Lipi",
                color = Color.Black,
                modifier = Modifier.padding(20.dp, 270.dp)
            )


            Text(
                text = "\uD83E\uDD1D\uD83C\uDFFB Connect" +
                        "\n\nMeet students interested in developer technologies at your university. All are welcome, including those with diverse backgrounds and different majors.",
                color = Color.Black,
                modifier = Modifier.padding(20.dp, 450.dp)
            )
            Text(
                text = "\uD83D\uDCA1 Learn" +
                        "\n\nLearn about a range of technical topics and gain new skills through hands-on workshops, events, talks, and project-building activities - both online and in-person.",
                color = Color.Black,
                modifier = Modifier.padding(20.dp, 565.dp)
            )
            Text(
                text = "\uD83C\uDFC6 Grow" +
                        "\n\nApply new learnings to build great solutions for local problems. Advance your skills, career, and network. Give back to your community by helping others learn, too.",
                color = Color.Black,
                modifier = Modifier.padding(20.dp, 670.dp)
            )





        }
    }
}