package com.example.gdsci2it.screens

import android.app.Activity
import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gdsci2it.MainActivity
import com.example.gdsci2it.MainActivity2
import com.example.gdsci2it.R
@Composable
fun Onboarding(context:Activity) {
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.SpaceAround) {
        Image(painter = painterResource(id =R.drawable.gdsc3
        ), contentDescription =null , modifier = Modifier.padding(top=85.dp)
            .size(240.dp)
            .clip(
                CircleShape
            ), contentScale = ContentScale.FillBounds)
        Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "For the Students", fontWeight = FontWeight.ExtraBold, fontSize = 26.sp)
            Text(text = "By the Students", fontWeight = FontWeight.ExtraBold, fontSize = 24.sp, color = MaterialTheme.colors.secondary)
        }

        Text(text = "One stop resource for students' need", fontSize = 20.sp,
            modifier = Modifier.padding(horizontal = 6.dp), fontStyle = FontStyle.Italic, textAlign = TextAlign.Center)
        IconButton(onClick = {
                     val intent= Intent(context, MainActivity2::class.java)
            context.startActivity(intent)
        }, modifier = Modifier
            .clip(CircleShape)
            .background(
                MaterialTheme.colors.primary
            )) {
            Icon(Icons.Default.ArrowForward, contentDescription =null,tint= MaterialTheme.colors.onPrimary )

        }
    }
}
/*@Preview(showBackground = true)
@Composable
fun preview( ){
    Onboarding()
}*/