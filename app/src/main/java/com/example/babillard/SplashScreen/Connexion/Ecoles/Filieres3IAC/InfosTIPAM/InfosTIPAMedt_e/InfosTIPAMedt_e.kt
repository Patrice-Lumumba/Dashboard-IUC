package com.example.babillard.SplashScreen.Connexion.Ecoles.Filieres3IAC.InfosTIPAM.InfosTIPAMedt_e


import androidx.compose.foundation.Image
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
//import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
//import androidx.compose.foundation.layout.ColumnScopeInstance.weight
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material.icons.rounded.KeyboardArrowLeft
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.babillard.R



//////////////////////////// Main de la  page ///////////////////////////////
@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun InfosTIPAMedt_eScreen( navController: NavHostController ){
    val scrollState = rememberLazyListState()
    //val scaffoldState2 = rememberScaffoldState()
    Box{
        InfosTIPAMedt_e_Content(scrollState)
    }
    Scaffold(scaffoldState = rememberScaffoldState(),
        topBar = { InfosTIPAMedt_e_Headline(navController) },
        drawerContent = {},
        content = { InfosTIPAMedt_e_Card(navController) },
        bottomBar = { InfosTIPAMedt_e_Footer(navController) }
    )
}

@Composable
fun InfosTIPAMedt_e_Headline( navController: NavHostController) {
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
                onClick = { navController.navigate( "Filieres3IACScreen") }
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
                    .padding(start = 40.dp, top = 4.dp, end = 4.dp, bottom = 4.dp),
            ) {
                Text(
                    text = "Informations",
                    style = MaterialTheme.typography.h5,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
            }

            IconButton(
                /////////////////////////////////////////////// Click retour ///////////
                onClick = { navController.navigate( "CreerTIPAMedt_eScreen") }
                ////////////////////////////////////////////// Click retour /////////
            ) {
                Icon(
                    Icons.Rounded.Add,
                    contentDescription = null ,
                    tint = Color.White,
                    modifier = Modifier.size(48.dp)
                )
            }
        }
    }
}
/////////////////////// Terminé ////////////////////////////////



////////////////////// Le pied de la page /////////////////
@Composable
fun InfosTIPAMedt_e_Footer ( navController: NavHostController ) {
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
fun InfosTIPAMedt_e_Card(navController: NavHostController) {
    //Icon(painterResource(R.drawable.arrow_back) , contentDescription = "" )

    ///////////////// Scroll Horizontal ///////////////
    LazyColumn {


        /////////////// Logo centré //////////////////////
        item{
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .height(80.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(R.drawable.tipam),
                    contentDescription = null,
                    modifier = Modifier.size(100.dp).padding(start = 1.dp).width(1.dp)
                )
            }
        }

        /////////////// Premier cadre //////////////////////////
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
                                ////////////////// Colonne A /////////////////
                                Column {
                                    IconButton(
                                        /////////////////////////////////////////////// Click retour ///////////
                                        onClick = { navController.navigate( "InfosTIPAMgeneralScreen") }
                                        ////////////////////////////////////////////// Click retour /////////
                                    ) {
                                        Image(
                                            painter = painterResource(R.drawable.general),
                                            contentDescription = "Image 1",
                                            modifier = Modifier.size(80.dp)
                                        )
                                    }
                                    Text(text = "Générale")
                                }

                                //////////////////// Colonne B /////////////////////////////
                                Column {
                                    IconButton(
                                        /////////////////////////////////////////////// Click retour ///////////
                                        onClick = { navController.navigate( "InfosTIPAMedt_pScreen") }
                                        ////////////////////////////////////////////// Click retour /////////
                                    ) {
                                        Image(
                                            painter = painterResource(R.drawable.emploprof_removebg_preview),
                                            contentDescription = "Image 1",
                                            modifier = Modifier.size(80.dp)
                                        )
                                    }
                                    Text(text = "EDT_P")
                                }

                                //////////////// Colonne C ///////////////////
                                Column {
                                    IconButton(
                                        /////////////////////////////////////////////// Click retour ///////////
                                        onClick = { navController.navigate( "InfosTIPAMliste_pScreen") }
                                        ////////////////////////////////////////////// Click retour /////////
                                    ) {
                                        Image(
                                            painter = painterResource(R.drawable.listprof),
                                            contentDescription = "Image 1",
                                            modifier = Modifier.size(80.dp)
                                        )
                                    }
                                    Text(text = "Liste_P")
                                }

                                //////////////// Colonne d ///////////////////
                                Column {
                                    IconButton(
                                        /////////////////////////////////////////////// Click retour ///////////
                                        onClick = { navController.navigate( "InfosTIPAMsportScreen") }
                                        ////////////////////////////////////////////// Click retour /////////
                                    ) {
                                        Image(
                                            painter = painterResource(R.drawable.sport),
                                            contentDescription = "Image 1",
                                            modifier = Modifier.size(80.dp)
                                        )
                                    }
                                    Text(text = "Sport")
                                }

                            }
                        }
                    }
                }
            }
        }

        /////////////// Deuxième cadre //////////////////////////
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
                                ////////////////// Colonne A /////////////////
                                Column {
                                    IconButton(
                                        /////////////////////////////////////////////// Click retour ///////////
                                        onClick = { navController.navigate( "InfosTIPAMsnScreen") }
                                        ////////////////////////////////////////////// Click retour /////////
                                    ) {
                                        Image(
                                            painter = painterResource(R.drawable.img3),
                                            contentDescription = "Image 1",
                                            modifier = Modifier.size(80.dp)
                                        )
                                    }
                                    Text(text = "SN")
                                }

                                //////////////////// Colonne B /////////////////////////////
                                Column {
                                    IconButton(
                                        /////////////////////////////////////////////// Click retour ///////////
                                        onClick = { navController.navigate( "InfosTIPAMedt_eScreen") }
                                        ////////////////////////////////////////////// Click retour /////////
                                    ) {
                                        Image(
                                            painter = painterResource(R.drawable.vector_removebg_preview),
                                            contentDescription = "Image 1",
                                            modifier = Modifier.size(80.dp)
                                        )
                                    }
                                    Text(text = "EDT_E")
                                }
                                //////////////// Colonne C ///////////////////
                                Column {
                                    IconButton(
                                        /////////////////////////////////////////////// Click retour ///////////
                                        onClick = { navController.navigate( "InfosTIPAMliste_eScreen") }
                                        ////////////////////////////////////////////// Click retour /////////
                                    ) {
                                        Image(
                                            painter = painterResource(R.drawable.listetudiant_removebg_preview),
                                            contentDescription = "Image 1",
                                            modifier = Modifier.size(80.dp)
                                        )
                                    }
                                    Text(text = "Liste_E")
                                }
                                //////////////// Colonne d ///////////////////
                                Column {
                                    IconButton(
                                        /////////////////////////////////////////////// Click retour ///////////
                                        onClick = { navController.navigate( "InfosTIPAMevensScreen") }
                                        ////////////////////////////////////////////// Click retour /////////
                                    ) {
                                        Image(
                                            painter = painterResource(R.drawable.evenement),
                                            contentDescription = "Image 1",
                                            modifier = Modifier.size(80.dp)
                                        )
                                    }
                                    Text(text = "Evens")
                                }
                            }
                        }
                    }
                }
            }
        }

        /////////////// Texte centré //////////////////////
        item{
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .height(100.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    "<<     Détails     >>",
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
                                onClick = { navController.navigate( "TIPAMedt_e1Screen") }
                                ////////////////////////////////////////////// Click retour /////////
                            ) {
                                Image(
                                    painter = painterResource(R.drawable.slundi22mai2023),
                                    contentDescription = null,
                                    modifier = Modifier.size(130.dp).padding(start = 1.dp).width(1.dp)
                                )
                            }

                            Column {
                                Row{
                                    Text("Info: ", fontWeight = FontWeight.Bold)
                                    Text("EDT_E")
                                }
                                Row{
                                    Text("Salle: ", fontWeight = FontWeight.Bold)
                                    Text("Ce234")
                                }
                                Row{
                                    Text("Niveau: ", fontWeight = FontWeight.Bold)
                                    Text("2")
                                }
                                Row{
                                    Text("Niveau: ", fontWeight = FontWeight.Bold)
                                    Text("2")
                                }
                                Row{
                                    Text("Lieu: ", fontWeight = FontWeight.Bold)
                                    Text("Logbessou")
                                }
                                Row{
                                    Text("Date: ", fontWeight = FontWeight.Bold)
                                    Text("22/05/2023")
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
                                onClick = { navController.navigate( "TIPAMedt_e2Screen") }
                                ////////////////////////////////////////////// Click retour /////////
                            ) {
                                Image(
                                    painter = painterResource(R.drawable.slundi15mai2023),
                                    contentDescription = null,
                                    modifier = Modifier.size(130.dp).padding(start = 1.dp).width(1.dp)
                                )
                            }

                            Column {
                                Row{
                                    Text("Info: ", fontWeight = FontWeight.Bold)
                                    Text("EDT_E")
                                }
                                Row{
                                    Text("Salle: ", fontWeight = FontWeight.Bold)
                                    Text("Ce234")
                                }
                                Row{
                                    Text("Niveau: ", fontWeight = FontWeight.Bold)
                                    Text("1")
                                }
                                Row{
                                    Text("Lieu: ", fontWeight = FontWeight.Bold)
                                    Text("Logbessou")
                                }
                                Row{
                                    Text("Date: ", fontWeight = FontWeight.Bold)
                                    Text("15/05/2023")
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
                                onClick = { navController.navigate( "TIPAMedt_e3Screen") }
                                ////////////////////////////////////////////// Click retour /////////
                            ) {
                                Image(
                                    painter = painterResource(R.drawable.slundi08mai2023),
                                    contentDescription = null,
                                    modifier = Modifier.size(130.dp).padding(start = 1.dp).width(1.dp)
                                )
                            }

                            Column {
                                Row{
                                    Text("Info: ", fontWeight = FontWeight.Bold)
                                    Text("Sport")
                                }
                                Row{
                                    Text("Salle: ", fontWeight = FontWeight.Bold)
                                    Text("Ce234")
                                }
                                Row{
                                    Text("Niveau: ", fontWeight = FontWeight.Bold)
                                    Text("2")
                                }
                                Row{
                                    Text("Lieu: ", fontWeight = FontWeight.Bold)
                                    Text("Logbessou")
                                }
                                Row{
                                    Text("Date: ", fontWeight = FontWeight.Bold)
                                    Text("08/05/2023")
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
                                onClick = { navController.navigate( "TIPAMedt_e4Screen") }
                                ////////////////////////////////////////////// Click retour /////////
                            ) {
                                Image(
                                    painter = painterResource(R.drawable.slundi01mai2023),
                                    contentDescription = null,
                                    modifier = Modifier.size(130.dp).padding(start = 1.dp).width(1.dp)
                                )
                            }

                            Column {
                                Row{
                                    Text("Info: ", fontWeight = FontWeight.Bold)
                                    Text("EDT_E")
                                }
                                Row{
                                    Text("Salle: ", fontWeight = FontWeight.Bold)
                                    Text("Ce234")
                                }
                                Row{
                                    Text("Niveau: ", fontWeight = FontWeight.Bold)
                                    Text("2")
                                }
                                Row{
                                    Text("Lieu: ", fontWeight = FontWeight.Bold)
                                    Text("Logbessou")
                                }
                                Row{
                                    Text("Date: ", fontWeight = FontWeight.Bold)
                                    Text("01/05/2023")
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
                                onClick = { navController.navigate( "TIPAMedt_e5Screen") }
                                ////////////////////////////////////////////// Click retour /////////
                            ) {
                                Image(
                                    painter = painterResource(R.drawable.slundi17avril2023),
                                    contentDescription = null,
                                    modifier = Modifier.size(130.dp).padding(start = 1.dp).width(1.dp)
                                )
                            }

                            Column {
                                Row{
                                    Text("Info: ", fontWeight = FontWeight.Bold)
                                    Text("EDT_E")
                                }
                                Row{
                                    Text("Salle: ", fontWeight = FontWeight.Bold)
                                    Text("Ce234")
                                }
                                Row{
                                    Text("Niveau: ", fontWeight = FontWeight.Bold)
                                    Text("1")
                                }
                                Row{
                                    Text("Lieu: ", fontWeight = FontWeight.Bold)
                                    Text("Logbessou")
                                }
                                Row{
                                    Text("Date: ", fontWeight = FontWeight.Bold)
                                    Text("17/04/2023")
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
                                onClick = { navController.navigate( "TIPAMedt_e6Screen") }
                                ////////////////////////////////////////////// Click retour /////////
                            ) {
                                Image(
                                    painter = painterResource(R.drawable.slundi10avril2023),
                                    contentDescription = null,
                                    modifier = Modifier.size(130.dp).padding(start = 1.dp).width(1.dp)
                                )
                            }

                            Column {
                                Row{
                                    Text("Info: ", fontWeight = FontWeight.Bold)
                                    Text("EDT_E")
                                }
                                Row{
                                    Text("Salle: ", fontWeight = FontWeight.Bold)
                                    Text("Ce234")
                                }
                                Row{
                                    Text("Niveau: ", fontWeight = FontWeight.Bold)
                                    Text("2")
                                }
                                Row{
                                    Text("Lieu: ", fontWeight = FontWeight.Bold)
                                    Text("Logbessou")
                                }
                                Row{
                                    Text("Date: ", fontWeight = FontWeight.Bold)
                                    Text("10/04/2023")
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
                                onClick = { navController.navigate( "TIPAMedt_e7Screen") }
                                ////////////////////////////////////////////// Click retour /////////
                            ) {
                                Image(
                                    painter = painterResource(R.drawable.slundi03avril2023),
                                    contentDescription = null,
                                    modifier = Modifier.size(130.dp).padding(start = 1.dp).width(1.dp)
                                )
                            }

                            Column {
                                Row{
                                    Text("Info: ", fontWeight = FontWeight.Bold)
                                    Text("EDT_E")
                                }
                                Row{
                                    Text("Salle: ", fontWeight = FontWeight.Bold)
                                    Text("Ce234")
                                }
                                Row{
                                    Text("Niveau: ", fontWeight = FontWeight.Bold)
                                    Text("2")
                                }
                                Row{
                                    Text("Lieu: ", fontWeight = FontWeight.Bold)
                                    Text("Logbessou")
                                }
                                Row{
                                    Text("Date: ", fontWeight = FontWeight.Bold)
                                    Text("03/04/2023")
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
/////////////////////////// Terminé ////////////////////////////////




//////////////////////////////////////////////////////////////////////////////////////
////////////////////////////// Main prinicipal de la page ///////////////////////////
////////////////////////////////////////////////////////////////// //////////////////
@Composable
fun InfosTIPAMedt_e_Content(scaffoldState: LazyListState) {
    val navController = rememberNavController()
    InfosTIPAMedt_e_Card(navController)
}
////////////////////////////// Terminé ///////////////////////////////////

