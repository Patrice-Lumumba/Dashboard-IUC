package com.example.babillard.SplashScreen.Connexion.Ecoles.Filieres3IAC

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.KeyboardArrowLeft
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.babillard.R


//////////////////////////// Main de la  page ///////////////////////////////
@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
//@Preview
@Composable
fun Filieres3IACScreen( navController: NavHostController){
    val scrollState = rememberLazyListState()
    //val scaffoldState2 = rememberScaffoldState()
    Box{
        Filieres3IAC_Content(scrollState)
    }
    Scaffold(scaffoldState = rememberScaffoldState(),
        topBar = { Filieres3IAC_Headline(navController) },
        drawerContent = {},
        content = { Filieres3IAC_Card(navController) },
        bottomBar = { Filieres3IAC_Footer(navController) }
    )
}
/////////////////////// Terminé ////////////////////////////////



//////////////////////// L'entete de la page ///////////////////
@Composable
fun Filieres3IAC_Headline(navController: NavHostController) {
    Column {
        Row(
            Modifier
                .clip(
                    RoundedCornerShape(
                        bottomStart = 30.dp,
                        bottomEnd = 30.dp
                    )
                )
                .fillMaxWidth()
                .background(Color.Red)
                .padding(
                    horizontal = 8.dp,
                    vertical = 4.dp
                ),
            verticalAlignment = Alignment.Bottom,
            horizontalArrangement = Arrangement.Start
        ) {
            IconButton(
                /////////////////////////////////////////////// Click retour ///////////
                onClick = { navController.navigate( "EcolesScreen") }
                ////////////////////////////////////////////// Click retour /////////
            ) {
                Icon(
                    Icons.Rounded.KeyboardArrowLeft ,
                    contentDescription = null ,
                    tint = Color.White,
                    modifier = Modifier.size(48.dp)
                )
            }

            Row(
                modifier = Modifier
                    .height(45.dp)
                    .size(250.dp)
                    .padding(start = 25.dp, top = 4.dp, end = 4.dp, bottom = 4.dp),
            ) {
                Text(
                    text = "Bienvenue à IUC !",
                    style = MaterialTheme.typography.h5,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
            }
        }
    }
}
/////////////////////// Terminé ////////////////////////////////



////////////////////// Le pied de la page /////////////////
@Composable
fun Filieres3IAC_Footer ( navController: NavHostController ) {
    Box(modifier = Modifier
        .height(20.dp)
        .fillMaxWidth()
        .background(color = Color.Red)
    ){
        Row(
            modifier = Modifier.padding(start = 170.dp, top = 4.dp, end = 4.dp, bottom = 4.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(100.dp)
        )
        {
            IconButton(
                /////////////////////////////////////////////// Click retour ///////////
                onClick = { navController.navigate( "Screen") },
                /////////////////////////////////////////////// Click retour ///////////
                modifier = Modifier.size(32.dp, 32.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.iuc),
                    contentDescription = "My Image",
                    modifier = Modifier
                )
            }
        }
    }
}
/////////////////////// Terminé ////////////////////////////////



//////////////////////////// Corps de la page /////////////////
@Composable
fun Filieres3IAC_Card(navController: NavHostController) {
    //Icon(painterResource(R.drawable.arrow_back) , contentDescription = "" )

    ///////////////// Scroll Horizontal ///////////////
    LazyColumn {

        /////////////// Logo centré //////////////////////
        item{
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .height(95.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(R.drawable.iac),
                    contentDescription = null,
                    modifier = Modifier.size(100.dp).padding(start = 1.dp).width(1.dp)
                )
            }
        }

        /////////////// Texte centré //////////////////////
        item{
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .height(60.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    "<< Nos différentes filières >>",
                    fontWeight = FontWeight.Bold,
                    color = Color.Blue,
                    fontSize = 22.sp,
                )
            }
        }

        /////////////// Détail 1 ///////////////////
        item{
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier.fillMaxWidth(),
            ){
                LazyRow {
                    /////////////////////// Premier détail //////////////////////
                    items(1){
                        Row(modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 1.dp),
                            //verticalAlignment = Alignment.CenterVertically,
                        ) {

                            IconButton(
                                /////////////////////////////////////////////// Click retour ///////////
                                onClick = { navController.navigate( "InfosTIPAMgeneralScreen") }
                                //onClick = { navController.navigate( "InfosTIPAMgeneralScreen") }
                                ////////////////////////////////////////////// Click retour /////////
                            ) {
                                Image(
                                    painter = painterResource(R.drawable.tipam),
                                    contentDescription = null,
                                    modifier = Modifier.size(130.dp).padding(start = 1.dp).width(1.dp)
                                )
                            }
                        }

                        Column(modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 30.dp)
                        ) {
                            Row{
                                Text(" ", fontWeight = FontWeight.Bold, fontSize = 22.sp)
                            }
                            Row{
                                FloatingActionButton(
                                    onClick = { navController.navigate( "InfosTIPAMgeneralScreen") },
                                    backgroundColor = Color.Red,
                                    contentColor = Color.White,
                                    modifier = Modifier
                                        .clip(CircleShape)
                                        .fillMaxWidth()
                                ) {
                                    Text(
                                        text = "     Accéder     ",
                                        fontWeight = FontWeight.Bold,
                                        style = MaterialTheme.typography.body1.copy(
                                            fontSize = 22.sp
                                        )
                                    )
                                }
                            }
                            Row{
                                Text(" ", fontWeight = FontWeight.Bold, fontSize = 22.sp)
                            }
                        }
                    }
                }
            }
        }

        /////////////// Détail 2 ///////////////////
        item{
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier.fillMaxWidth(),
            ){
                LazyRow {
                    /////////////////////// Premier détail //////////////////////
                    items(1){
                        Row(modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 1.dp),
                            //verticalAlignment = Alignment.CenterVertically,
                        ) {

                            IconButton(
                                /////////////////////////////////////////////// Click retour ///////////
                                onClick = { navController.navigate( "Screen") }
                                ////////////////////////////////////////////// Click retour /////////
                            ) {
                                Image(
                                    painter = painterResource(R.drawable.tirsi),
                                    contentDescription = null,
                                    modifier = Modifier.size(130.dp).padding(start = 1.dp).width(1.dp)
                                )
                            }
                        }

                        Column(modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 30.dp)
                        ){
                            Row{
                                Text(" ", fontWeight = FontWeight.Bold, fontSize = 22.sp)
                            }
                            Row{

                                FloatingActionButton(
                                    onClick = { navController.navigate( "Screen") },
                                    backgroundColor = Color.Red,
                                    contentColor = Color.White,
                                    modifier = Modifier
                                        .clip(CircleShape)
                                        .fillMaxWidth()
                                ) {
                                    Text(
                                        text = "     Accéder     ",
                                        fontWeight = FontWeight.Bold,
                                        style = MaterialTheme.typography.body1.copy(
                                            fontSize = 22.sp
                                        )
                                    )
                                }
                            }
                            Row{
                                Text(" ", fontWeight = FontWeight.Bold, fontSize = 22.sp)
                            }
                        }
                    }
                }
            }
        }

        /////////////// Détail 3 ///////////////////
        item{
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier.fillMaxWidth(),
            ){
                LazyRow {
                    /////////////////////// Premier détail //////////////////////
                    items(1){
                        Row(modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 1.dp),
                            //verticalAlignment = Alignment.CenterVertically,
                        ) {

                            IconButton(
                                /////////////////////////////////////////////// Click retour ///////////
                                onClick = { navController.navigate( "Screen") }
                                ////////////////////////////////////////////// Click retour /////////
                            ) {
                                Image(
                                    painter = painterResource(R.drawable.prepa),
                                    contentDescription = null,
                                    modifier = Modifier.size(130.dp).padding(start = 1.dp).width(1.dp)
                                )
                            }
                        }

                        Column(modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 30.dp)
                        ) {
                            Row{
                                Text(" ", fontWeight = FontWeight.Bold, fontSize = 22.sp)
                            }
                            Row{

                                FloatingActionButton(
                                    onClick = { navController.navigate( "Screen") },
                                    backgroundColor = Color.Red,
                                    contentColor = Color.White,
                                    modifier = Modifier
                                        .clip(CircleShape)
                                        .fillMaxWidth()
                                ) {
                                    Text(
                                        text = "     Accéder     ",
                                        fontWeight = FontWeight.Bold,
                                        style = MaterialTheme.typography.body1.copy(
                                            fontSize = 22.sp
                                        )
                                    )
                                }
                            }
                            Row{
                                Text(" ", fontWeight = FontWeight.Bold, fontSize = 22.sp)
                            }
                        }
                    }
                }
            }
        }

        /////////////// Détail 4 ///////////////////
        item{
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier.fillMaxWidth(),
            ){
                LazyRow {
                    /////////////////////// Premier détail //////////////////////
                    items(1){
                        Row(modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 1.dp),
                            //verticalAlignment = Alignment.CenterVertically,
                        ) {

                            IconButton(
                                /////////////////////////////////////////////// Click retour ///////////
                                onClick = { navController.navigate( "Screen") }
                                ////////////////////////////////////////////// Click retour /////////
                            ) {
                                Image(
                                    painter = painterResource(R.drawable.gl),
                                    contentDescription = null,
                                    modifier = Modifier.size(130.dp).padding(start = 1.dp).width(1.dp)
                                )
                            }
                        }

                        Column(modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 30.dp)
                        ) {
                            Row{
                                Text(" ", fontWeight = FontWeight.Bold, fontSize = 22.sp)
                            }
                            Row{

                                FloatingActionButton(
                                    onClick = { navController.navigate( "Screen") },
                                    backgroundColor = Color.Red,
                                    contentColor = Color.White,
                                    modifier = Modifier
                                        .clip(CircleShape)
                                        .fillMaxWidth()
                                ) {
                                    Text(
                                        text = "     Accéder     ",
                                        fontWeight = FontWeight.Bold,
                                        style = MaterialTheme.typography.body1.copy(
                                            fontSize = 22.sp
                                        )
                                    )
                                }
                            }
                            Row{
                                Text(" ", fontWeight = FontWeight.Bold, fontSize = 22.sp)
                            }
                        }
                    }
                }
            }
        }

    }
}
/////////////////////////// Terminé ////////////////////////////////




//////////////////////////////////////////////////////////////////////////////////////
////////////////////////////// Main prinicipal de la page ///////////////////////////
////////////////////////////////////////////////////////////////////////////////////
@Composable
fun Filieres3IAC_Content(scaffoldState: LazyListState) {
    val navController = rememberNavController()
    Filieres3IAC_Card(navController)
}
////////////////////////////// Terminé ///////////////////////////////////

