package com.example.babillard.SplashScreen.Connexion.Ecoles

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
fun EcolesScreen( navController: NavHostController ){
    val scrollState = rememberLazyListState()
    //val scaffoldState2 = rememberScaffoldState()
    Box{
        Ecoles_Content(scrollState)
    }
    Scaffold(scaffoldState = rememberScaffoldState(),
        topBar = { Ecoles_Headline(navController) },
        drawerContent = {},
        content = { Ecoles_Card(navController) },
        bottomBar = { Ecoles_Footer(navController) }
    )
}
/////////////////////// Terminé ////////////////////////////////



//////////////////////// L'entete de la page ///////////////////
@Composable
fun Ecoles_Headline( navController: NavHostController ) {
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
                onClick = { navController.navigate( "ConnexionScreen") }
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
fun Ecoles_Footer ( navController: NavHostController ) {
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
fun Ecoles_Card(navController: NavHostController) {
    //Icon(painterResource(R.drawable.arrow_back) , contentDescription = "" )

    ///////////////// Scroll Horizontal ///////////////
    LazyColumn {

        /////////////// Logo centré //////////////////////
        item{
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .height(75.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(R.drawable.iuc),
                    contentDescription = null,
                    modifier = Modifier.size(80.dp).padding(start = 1.dp).width(1.dp)
                )
            }
        }

        /////////////// 1er Texte centré //////////////////////
        item{
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .height(60.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    "<< Informations générales >>",
                    fontWeight = FontWeight.Bold,
                    color = Color.Blue,
                    fontSize = 22.sp,
                )
            }
        }

        /////////////// Navigation horizontale ///////////////////
        item {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier.fillMaxWidth()
            ){

                LazyRow(horizontalArrangement = Arrangement.spacedBy(30.dp),) {
                    items(1) {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 30.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(30.dp),
                                verticalAlignment = Alignment.Bottom
                            ) {


                                ////////////////// Colonne 1 /////////////////
                                Column {
                                    IconButton(
                                        /////////////////////////////////////////////// Click retour ///////////
                                        onClick = { navController.navigate( "TIPAMgeneral1Screen") }
                                        ////////////////////////////////////////////// Click retour /////////
                                    ) {
                                        Image(
                                            painter = painterResource(R.drawable.general),
                                            contentDescription = null,
                                            modifier = Modifier.size(130.dp).padding(start = 1.dp).width(1.dp)
                                        )
                                    }
                                    Column {
                                        Row{
                                            Text("Info: ", fontWeight = FontWeight.Bold)
                                            Text("Générale")
                                        }
                                        Row{
                                            Text("Thème: ", fontWeight = FontWeight.Bold)
                                            Text("Rentrée à l'IUC")
                                        }
                                        Row{
                                            Text("Lieu: ", fontWeight = FontWeight.Bold)
                                            Text("Logbessou")
                                        }
                                        Row{
                                            Text("Date: ", fontWeight = FontWeight.Bold)
                                            Text("07/09/2023")
                                        }
                                        Row{
                                            Text("Auteur: ", fontWeight = FontWeight.Bold)
                                            Text("M. TEKOUDJOU")
                                        }
                                        Row{
                                            Text(" ", fontWeight = FontWeight.Bold)
                                            Text(" ")
                                        }
                                    }
                                }

                                //////////////////// Colonne 2 /////////////////////////////
                                Column {
                                    IconButton(
                                        /////////////////////////////////////////////// Click retour ///////////
                                        onClick = { navController.navigate( "TIPAMgeneral2Screen") }
                                        ////////////////////////////////////////////// Click retour /////////
                                    ) {
                                        Image(
                                            painter = painterResource(R.drawable.telechargement),
                                            contentDescription = null,
                                            modifier = Modifier.size(130.dp).padding(start = 1.dp).width(1.dp)
                                        )
                                    }
                                    Column {
                                        Row{
                                            Text("Info: ", fontWeight = FontWeight.Bold)
                                            Text("Générale")
                                        }
                                        Row{
                                            Text("Thème: ", fontWeight = FontWeight.Bold)
                                            Text("Concours")
                                        }
                                        Row{
                                            Text("Lieu: ", fontWeight = FontWeight.Bold)
                                            Text("Logbessou")
                                        }
                                        Row{
                                            Text("Date: ", fontWeight = FontWeight.Bold)
                                            Text("23/05/2023")
                                        }
                                        Row{
                                            Text("Auteur: ", fontWeight = FontWeight.Bold)
                                            Text("M. BABAGNACK")
                                        }
                                        Row{
                                            Text(" ", fontWeight = FontWeight.Bold)
                                            Text(" ")
                                        }
                                    }
                                }

                                //////////////// Colonne 3 ///////////////////
                                Column {
                                    IconButton(
                                        /////////////////////////////////////////////// Click retour ///////////
                                        onClick = { navController.navigate( "TIPAMgeneral3Screen") }
                                        ////////////////////////////////////////////// Click retour /////////
                                    ) {
                                        Image(
                                            painter = painterResource(R.drawable.img_10_1684431370830),
                                            contentDescription = null,
                                            modifier = Modifier.size(130.dp).padding(start = 1.dp).width(1.dp)
                                        )
                                    }
                                    Column {
                                        Row{
                                            Text("Info: ", fontWeight = FontWeight.Bold)
                                            Text("Générale")
                                        }
                                        Row{
                                            Text("Thème: ", fontWeight = FontWeight.Bold)
                                            Text("Excursion")
                                        }
                                        Row{
                                            Text("Lieu: ", fontWeight = FontWeight.Bold)
                                            Text("Kribi")
                                        }
                                        Row{
                                            Text("Date: ", fontWeight = FontWeight.Bold)
                                            Text("01/08/2023")
                                        }
                                        Row{
                                            Text("Auteur: ", fontWeight = FontWeight.Bold)
                                            Text("M. TEKOUDJOU")
                                        }
                                        Row{
                                            Text(" ", fontWeight = FontWeight.Bold)
                                            Text(" ")
                                        }
                                    }
                                }

                                //////////////// Colonne 4 ///////////////////
                                Column {
                                    IconButton(
                                        /////////////////////////////////////////////// Click retour ///////////
                                        onClick = { navController.navigate( "TIPAMgeneral4Screen") }
                                        ////////////////////////////////////////////// Click retour /////////
                                    ) {
                                        Image(
                                            painter = painterResource(R.drawable.img_18_1684431656090),
                                            contentDescription = null,
                                            modifier = Modifier.size(130.dp).padding(start = 1.dp).width(1.dp)
                                        )
                                    }
                                    Column {
                                        Row{
                                            Text("Info: ", fontWeight = FontWeight.Bold)
                                            Text("Générale")
                                        }
                                        Row{
                                            Text("Thème: ", fontWeight = FontWeight.Bold)
                                            Text("Tradition")
                                        }
                                        Row{
                                            Text("Lieu: ", fontWeight = FontWeight.Bold)
                                            Text("Bafoussam")
                                        }
                                        Row{
                                            Text("Date: ", fontWeight = FontWeight.Bold)
                                            Text("24/12/2023")
                                        }
                                        Row{
                                            Text("Auteur: ", fontWeight = FontWeight.Bold)
                                            Text("M. BABAGNACK")
                                        }
                                        Row{
                                            Text(" ", fontWeight = FontWeight.Bold)
                                            Text(" ")
                                        }
                                    }
                                }

                                //////////////// Colonne 5 ///////////////////
                                Column {
                                    IconButton(
                                        /////////////////////////////////////////////// Click retour ///////////
                                        onClick = { navController.navigate( "TIPAMgeneral5Screen") }
                                        ////////////////////////////////////////////// Click retour /////////
                                    ) {
                                        Image(
                                            painter = painterResource(R.drawable.img_1_1684432396198),
                                            contentDescription = null,
                                            modifier = Modifier.size(130.dp).padding(start = 1.dp).width(1.dp)
                                        )
                                    }
                                    Column {
                                        Row{
                                            Text("Info: ", fontWeight = FontWeight.Bold)
                                            Text("Générale")
                                        }
                                        Row{
                                            Text("Thème: ", fontWeight = FontWeight.Bold)
                                            Text("J.P.O")
                                        }
                                        Row{
                                            Text("Lieu: ", fontWeight = FontWeight.Bold)
                                            Text("Logbessou")
                                        }
                                        Row{
                                            Text("Date: ", fontWeight = FontWeight.Bold)
                                            Text("11/02/2023")
                                        }
                                        Row{
                                            Text("Auteur: ", fontWeight = FontWeight.Bold)
                                            Text("M. TEKOUDJOU")
                                        }
                                        Row{
                                            Text(" ", fontWeight = FontWeight.Bold)
                                            Text(" ")
                                        }
                                    }
                                }

                                //////////////// Colonne 6 ///////////////////
                                Column {
                                    IconButton(
                                        /////////////////////////////////////////////// Click retour ///////////
                                        onClick = { navController.navigate( "TIPAMgeneral6Screen") }
                                        ////////////////////////////////////////////// Click retour /////////
                                    ) {
                                        Image(
                                            painter = painterResource(R.drawable.img_20_1684432120895),
                                            contentDescription = null,
                                            modifier = Modifier.size(130.dp).padding(start = 1.dp).width(1.dp)
                                        )
                                    }
                                    Column {
                                        Row{
                                            Text("Info: ", fontWeight = FontWeight.Bold)
                                            Text("Générale")
                                        }
                                        Row{
                                            Text("Thème: ", fontWeight = FontWeight.Bold)
                                            Text("Mentors")
                                        }
                                        Row{
                                            Text("Lieu: ", fontWeight = FontWeight.Bold)
                                            Text("Logbessou")
                                        }
                                        Row{
                                            Text("Date: ", fontWeight = FontWeight.Bold)
                                            Text("12/07/2023")
                                        }
                                        Row{
                                            Text("Auteur: ", fontWeight = FontWeight.Bold)
                                            Text("M. TEKOUDJOU")
                                        }
                                        Row{
                                            Text(" ", fontWeight = FontWeight.Bold)
                                            Text(" ")
                                        }
                                    }
                                }

                                //////////////// Colonne 7 ///////////////////
                                Column {
                                    IconButton(
                                        /////////////////////////////////////////////// Click retour ///////////
                                        onClick = { navController.navigate( "TIPAMgeneral7Screen") }
                                        ////////////////////////////////////////////// Click retour /////////
                                    ) {
                                        Image(
                                            painter = painterResource(R.drawable.img_23_1684432233566),
                                            contentDescription = null,
                                            modifier = Modifier.size(130.dp).padding(start = 1.dp).width(1.dp)
                                        )
                                    }
                                    Column {
                                        Row{
                                            Text("Info: ", fontWeight = FontWeight.Bold)
                                            Text("Générale")
                                        }
                                        Row{
                                            Text("Thème: ", fontWeight = FontWeight.Bold)
                                            Text("Loisir")
                                        }
                                        Row{
                                            Text("Lieu: ", fontWeight = FontWeight.Bold)
                                            Text("Akwa")
                                        }
                                        Row{
                                            Text("Date: ", fontWeight = FontWeight.Bold)
                                            Text("29/11/2023")
                                        }
                                        Row{
                                            Text("Auteur: ", fontWeight = FontWeight.Bold)
                                            Text("M. BABAGNACK")
                                        }
                                        Row{
                                            Text(" ", fontWeight = FontWeight.Bold)
                                            Text(" ")
                                        }
                                    }
                                }

                            }
                        }
                    }
                }
            }
        }

        /////////////// 2em Texte centré //////////////////////
        item{
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .height(60.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    "<<  Nos différents secteurs  >>",
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
                                onClick = { navController.navigate( "Filieres3IACScreen") }
                                ////////////////////////////////////////////// Click retour /////////
                            ) {
                                Image(
                                    painter = painterResource(R.drawable.iac),
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
                                    onClick = { navController.navigate( "Filieres3IACScreen") },
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
                                    painter = painterResource(R.drawable.icia),
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
                                    painter = painterResource(R.drawable.pisti),
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
                                    painter = painterResource(R.drawable.seas),
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
                            Row{
                                Text(" ", fontWeight = FontWeight.Bold, fontSize = 22.sp)
                            }
                        }
                    }
                }
            }
        }

        /////////////// Détail 5 ///////////////////
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
                                    painter = painterResource(R.drawable.istdi),
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
                            Row{
                                Text(" ", fontWeight = FontWeight.Bold, fontSize = 22.sp)
                            }
                        }
                    }
                }
            }
        }

        /////////////// Détail 6 ///////////////////
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
                                onClick = { navController.navigate( "InfosAdminScreen") }
                                ////////////////////////////////////////////// Click retour /////////
                            ) {
                                Image(
                                    painter = painterResource(R.drawable.logoadministration),
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
                                    onClick = { navController.navigate( "InfosAdminScreen") },
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
                            Row{
                                Text(" ", fontWeight = FontWeight.Bold, fontSize = 22.sp)
                            }
                        }
                    }
                }
            }
        }

        /////////////// Détail 7 ///////////////////
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
                                onClick = { navController.navigate( "InfosClubDanseScreen") }
                                ////////////////////////////////////////////// Click retour /////////
                            ) {
                                Image(

                                    painter = painterResource(R.drawable.logoassociation),
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
                                    onClick = { navController.navigate( "InfosClubDanseScreen") },
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
fun Ecoles_Content(scaffoldState: LazyListState) {
    val navController = rememberNavController()
    Ecoles_Card(navController)
}
////////////////////////////// Terminé ///////////////////////////////////

