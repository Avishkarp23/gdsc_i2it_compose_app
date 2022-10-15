package com.example.gdsci2it.Navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.List
import androidx.compose.ui.graphics.vector.ImageVector

sealed class navroutes (val route:String,val label:String,val icon:ImageVector){
    object Home:navroutes("Home","Home", Icons.Default.Home)
    object Roadmaps:navroutes("Roadmap","Roadmap",Icons.Default.List)
    object Info:navroutes("Info","Info",Icons.Default.Info)
}