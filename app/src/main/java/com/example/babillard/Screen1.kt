package com.example.babillard

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun Screen1(navController: NavController) {
    Button( onClick = { navController.navigate( "Screen") } ) {
        Text(text = "Go to Screen2")
    }
}
