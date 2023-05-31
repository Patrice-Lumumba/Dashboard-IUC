package com.example.babillard.SplashScreen

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.babillard.R
import kotlinx.coroutines.delay


//////////////////////////////////// Navigation :fonction Screen ///////////////////////////////////////
//@Preview
@Composable
fun Screen( navController: NavHostController ){

    var startAnimation by remember{
        mutableStateOf(false)
    }
    val alphaAnim = animateFloatAsState(targetValue =
    if (startAnimation) 1f else 0f,
        animationSpec = tween(
            durationMillis = 3000
        )
    )

    LaunchedEffect(key1 = true){
        startAnimation = true
        delay(4000)

        /////////////////////////////////////// Ouverture du formulaire Ecoles //////////////////
        navController.navigate("LoginScreen")

    }
    SplashScreen_Content(alpha = alphaAnim.value)
}
//////////////////////////////////// Terminé ////////////////////////////////////////////////////



////////////////////////////////// Corps de la page //////////////////////////////////////////////
@Composable
fun SplashScreen_Content(alpha: Float){
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .fillMaxSize()
                .alpha(alpha = alpha)
        )

        Column(modifier = Modifier
            .padding(top = 250.dp, start = 138.dp)
            .height(200.dp)
            .width(200.dp)
            .clip(RoundedCornerShape(28.dp))
        ) {
            IconButton(
                /////////////////////////////////////////////// Click retour ///////////
                onClick = {  },
                /////////////////////////////////////////////// Click retour ///////////
                modifier = Modifier.size(100.dp, 100.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.iuc),
                    contentDescription = "My Logo",
                    modifier = Modifier
                )
            }
            /*
            Image(
                painter = painterResource(id = com.example.babillard.R.drawable.iuc),
                contentDescription = "My Logo",
                modifier = Modifier
            )
            */
        }

        Text(
            text = "Babillard",
            fontSize = 50.sp,
            color = Color.White,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.SansSerif,
            modifier = Modifier
                .align(Alignment.Center)
                .padding(16.dp)
        )

    }
}
//////////////////////////////////// Terminé ////////////////////////////////////////////////////



/////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////// Main principal SplashScreen  ///////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////
@Preview
@Composable
fun SplashScreen(){
    SplashScreen_Content(1f)
}
//////////////////////////////////// Terminé ////////////////////////////////////////////////////
