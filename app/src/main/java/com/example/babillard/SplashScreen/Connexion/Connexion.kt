package com.example.babillard.SplashScreen.Connexion

import android.annotation.SuppressLint
import android.graphics.Bitmap
import android.util.Log
import android.util.Patterns
import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.rounded.Done
import androidx.compose.material.icons.rounded.KeyboardArrowLeft
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.view.ViewCompat
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.babillard.MainActivity
import com.example.babillard.R
import kotlinx.coroutines.InternalCoroutinesApi
import java.io.File
import java.text.SimpleDateFormat
import java.util.*


//////////////////////////// Main de la  page ///////////////////////////////
@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun ConnexionScreen( navController: NavHostController){
    val scrollState = rememberLazyListState()
    //val scaffoldState2 = rememberScaffoldState()
    Box{
        Connexion_Content(scrollState)
    }
    Scaffold(scaffoldState = rememberScaffoldState(),
        topBar = { Connexion_Headline(navController) },
        drawerContent = {},
        content = { Connexion_Card(navController) },
        bottomBar = { Connexion_Footer(navController) }
    )
}
/////////////////////// Terminé ////////////////////////////////



//////////////////////// L'entete de la page ///////////////////
@Composable
fun Connexion_Headline( navController: NavHostController ) {
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
                onClick = { navController.navigate( "Screen") }
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
                    text = "    Se connecter ",
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
fun Connexion_Footer ( navController: NavHostController) {
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
fun Connexion_Card(navController: NavHostController) {

    ///////////////// Scroll Horizontal ///////////////
    LazyColumn {

        /////////////// Logo centré //////////////////////
        item{
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .height(350.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(R.drawable.iuc),
                    contentDescription = null,
                    modifier = Modifier
                        .size(300.dp)
                        .padding(start = 1.dp)
                        .width(1.dp)
                )
            }
        }

        /////////////// Champ 1  ///////////////////
        item{
            Box(
                contentAlignment = Alignment.CenterStart,
                modifier = Modifier.fillMaxWidth(),
            ){
                LazyRow {
                    /////////////////////// Premier détail //////////////////////
                    items(1){
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 20.dp, top = 8.dp),
                            //verticalAlignment = Alignment.CenterVertically,
                        ) {
                            Column {
                                Row{
                                    //var textValue by remember { mutableStateOf("Bonjour") }
                                    TextField(
                                        value = "Dongmo Laurent",
                                        onValueChange = { /*textValue = it"*/ },
                                        label = { Text("Entrez votre nom : ") },
                                        keyboardOptions = KeyboardOptions(
                                            keyboardType = KeyboardType.Uri, // Indique que le champ accepte un chemin d'accès
                                            imeAction = ImeAction.Done,
                                        ),
                                        modifier = Modifier
                                            .width(325.dp)
                                            .background(Color.White)
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }

        /////////////// Champ 2  ///////////////////
        item{
            Box(
                contentAlignment = Alignment.CenterStart,
                modifier = Modifier.fillMaxWidth(),
            ){
                LazyRow {
                    /////////////////////// Premier détail //////////////////////
                    items(1){
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 20.dp, top = 20.dp),
                            //verticalAlignment = Alignment.CenterVertically,
                        ) {
                            Column {
                                Row{
                                    //var textValue by remember { mutableStateOf("Bonjour") }
                                    TextField(
                                        value = "IUC22E0066003",
                                        onValueChange = { /*textValue = it"*/ },
                                        label = { Text("Entrez votre matricule : ") },
                                        keyboardOptions = KeyboardOptions(
                                            keyboardType = KeyboardType.Uri, // Indique que le champ accepte un chemin d'accès
                                            imeAction = ImeAction.Done,
                                        ),
                                        modifier = Modifier
                                            .width(325.dp)
                                            .background(Color.White)
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }

        /////////////// Bouton Enregistrer ////////////////
        items(1){
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 1.dp, top = 30.dp),
                //verticalAlignment = Alignment.CenterVertically,
            ) {

                FloatingActionButton(
                    onClick = { navController.navigate( "EcolesScreen") },
                    backgroundColor = Color.Red,
                    contentColor = Color.White,
                    modifier = Modifier
                        .clip(CircleShape)
                        .fillMaxWidth()
                ) {
                    Text(
                        text = "        Connexion        ",
                        fontWeight = FontWeight.Bold,
                        style = MaterialTheme.typography.body1.copy(
                            fontSize = 22.sp
                        )
                    )
                }

            }

        }
    }
}

/////////////////////////// Terminé ////////////////////////////////



///////////////////////// Nouvelle fonction pour les images à recupérer //////////////
private fun getImagesFromFolder(folderPath: String): List<File> {
    val directory = File(folderPath)
    val imageFiles = directory.listFiles { file ->
        file.isFile &&
                (file.name.endsWith(".jpg", true) || file.name.endsWith(".png", true))
    }
    return imageFiles?.toList() ?: emptyList()
}
/////////////////////////////////////// Terminé //////////////////////////////////////////



//////////////////////////////////////////////////////////////////////////////////////
////////////////////////////// Main prinicipal de la page ///////////////////////////
////////////////////////////////////////////////////////////////////////////////////
@Composable
fun Connexion_Content(scaffoldState: LazyListState) {
    val navController = rememberNavController()
    Connexion_Card(navController)
}
////////////////////////////// Terminé ///////////////////////////////////

companion object{
    val TAB: String = MainActivity::class.java.simpleName
}

private val auth by lazy{
    Firebase.auth
}

@InternalCoroutinesApi
@ExperimentalMaterialApi



