package com.example.gdsci2it.screens

import android.app.Activity
import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.materialIcon
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gdsci2it.MainActivity2
import com.example.gdsci2it.MainActivity3
import com.example.gdsci2it.R

@Composable
fun Login(context: Activity){
    var username by remember{
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }
    Box(modifier = Modifier.fillMaxSize()) {
        Image(painter = painterResource(id = R.drawable.istockphoto_1001279264_612x612) , contentDescription ="gdsc_logo",modifier= Modifier
            .fillMaxSize()
            , contentScale = ContentScale.Crop)
        Box(modifier = Modifier
            .fillMaxSize()
            .padding(28.dp)
            .alpha(0.3f)
            .clip(RoundedCornerShape(15.dp))
            .background(MaterialTheme.colors.background)) {

        }
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(48.dp), horizontalAlignment = Alignment.CenterHorizontally) {
            Spacer(modifier = Modifier.height(55.dp))
            LoginHeader()
            Spacer(modifier = Modifier.height(55.dp))
            LoginField(username,
            password,
            onpasswordchange = {
                password=it
            },
            onusernamechange = {
                username=it
            },
            onforgotpasswordclick = {

            })
            Spacer(modifier = Modifier.height(40.dp))
            LoginFooter(context, onsigninClick = {

            },
            onSignupClick = {

            })
        }


    }
}

@Composable
fun LoginHeader(){

        Text(text = "Welcome Back", fontSize = 36.sp, fontWeight = FontWeight.ExtraBold)
         Spacer(modifier = Modifier.height(8.dp))
        Text(text = "Sign in to Continue", fontSize = 18.sp, fontWeight = FontWeight.SemiBold)

    

}
@Composable
fun ColumnScope.LoginField(username:String,password:String,onusernamechange: (String) ->Unit,onpasswordchange: (String)->Unit,onforgotpasswordclick: ()->Unit){
demofield(value = username,
    Onvaluechange =onusernamechange ,
    label = "Username",
    placeholder ="Enter Your Email Id",
leadingicon = {Icon(imageVector = Icons.Default.Email, contentDescription ="Email" )},
        keyboardoption = KeyboardOptions(keyboardType = KeyboardType.Email, imeAction = ImeAction.Next)
    
)
    Spacer(modifier = Modifier.height(8.dp))
    demofield(value = password,
        Onvaluechange = onpasswordchange,
        label ="Password" ,
        placeholder = "Enter Password",
        VisualTransform = PasswordVisualTransformation(),
        leadingicon = { Icon(imageVector = Icons.Default.Lock, contentDescription ="Password" )},
       keyboardoption = KeyboardOptions(keyboardType = KeyboardType.Password, imeAction = ImeAction.Go)
    )
    
    TextButton(onClick = onforgotpasswordclick, modifier = Modifier.align(Alignment.End)) {
        Text(text = "Forgot Password?", color = Color.Black )
    }
}
@Composable
fun LoginFooter(context:Activity,
    onsigninClick: ()->Unit,
    onSignupClick: ()->Unit
){


Button(onClick = {                   val intent= Intent(context, MainActivity3::class.java)
    context.startActivity(intent)}, modifier = Modifier.fillMaxWidth(), shape = MaterialTheme.shapes.large) {
    Text(text = "Sign In")
}
TextButton(onClick = onSignupClick) {
    Text(text = "Don't Have an account?,click here")
}
}

@Composable
fun demofield(value:String,Onvaluechange:(String)->Unit,label:String,placeholder:String,VisualTransform:VisualTransformation= VisualTransformation.None,keyboardoption:KeyboardOptions=KeyboardOptions.Default,leadingicon:@Composable (() -> Unit)?=null){
    OutlinedTextField(value = value,
        onValueChange =Onvaluechange,
        label = {
            Text(text = label)
        },
        placeholder = {
            Text(text = placeholder)
        },
        visualTransformation = VisualTransform,
        keyboardOptions =keyboardoption,
        leadingIcon = leadingicon
    
    )
}
