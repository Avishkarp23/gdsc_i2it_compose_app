package com.example.gdsci2it.Navigation

import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.composeapp.roadmap
import com.example.gdsci2it.Home
import com.example.gdsci2it.screens.Info


@Composable
fun navigationcontroller(navController: NavHostController){
NavHost(navController = navController, startDestination = navroutes.Home.route){
    composable(navroutes.Home.route){
        Home()
    }
    composable(navroutes.Roadmaps.route){
        roadmap()
    }
    composable(navroutes.Info.route){
Info()
}
}}

@Composable
fun StartNavigation(){
val navController= rememberNavController()
    val items= listOf(navroutes.Home,navroutes.Roadmaps,navroutes.Info)
    Scaffold(topBar = { TopAppBar(title = { Text(text = " GDSC I²IT")})}, bottomBar = { BottomNavigation(
        backgroundColor = MaterialTheme.colors.background
    ) {
        val navBackstackEntry by navController.currentBackStackEntryAsState()
        val curretRoute=navBackstackEntry?.destination?.route
        items.forEach{
            BottomNavigationItem(selected = curretRoute==it.route,
                label = { Text(text = it.label,color=if (curretRoute==it.route) Color.DarkGray else Color.LightGray)},
                icon = { Icon(imageVector = it.icon, contentDescription = "Icon", tint = if (curretRoute==it.route) Color.DarkGray else Color.LightGray)
                       },
                onClick = {
                    if(curretRoute !=it.route){
                        navController.graph?.startDestinationRoute?.let {
                            navController.popBackStack(it, inclusive = true)
                        }
                        navController.navigate(it.route){
                            launchSingleTop=true
                        }
                    }


                })
        }
        
    }} ) {
        navigationcontroller(navController = navController)
    }
}
