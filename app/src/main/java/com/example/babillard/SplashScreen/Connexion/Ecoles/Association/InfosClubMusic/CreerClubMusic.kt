package com.example.babillard.SplashScreen.Connexion.Ecoles.Association.InfosClubMusic


//import android.R
import android.annotation.SuppressLint
import android.graphics.Bitmap
import android.widget.TextView
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Done
import androidx.compose.material.icons.rounded.KeyboardArrowLeft
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.babillard.R
import java.io.File
import java.text.SimpleDateFormat
import java.util.*


//////////////////////////// Main de la  page ///////////////////////////////
@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun CreerClubMusicScreen( navController: NavHostController ){
    val scrollState = rememberLazyListState()
    //val scaffoldState2 = rememberScaffoldState()
    Box{
        CreerClubMusic_Content(scrollState)
    }
    Scaffold(scaffoldState = rememberScaffoldState(),
        topBar = { CreerClubMusic_Headline(navController) },
        drawerContent = {},
        content = { CreerClubMusic_Card(navController) },
        bottomBar = { CreerClubMusic_Footer(navController) }
    )
}
/////////////////////// Terminé ////////////////////////////////



//////////////////////// L'entete de la page ///////////////////
@Composable
fun CreerClubMusic_Headline(navController: NavHostController) {
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
                onClick = { navController.navigate( "InfosClubMusicScreen") }
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
                    text = "Création",
                    style = MaterialTheme.typography.h5,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
            }

            IconButton(
                /////////////////////////////////////////////// Click retour ///////////
                onClick = { navController.navigate( "InfosClubMusicScreen") }
                ////////////////////////////////////////////// Click retour /////////
            ) {
                Icon(
                    Icons.Rounded.Done,
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
fun CreerClubMusic_Footer ( navController: NavHostController) {
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
fun CreerClubMusic_Card(navController: NavHostController) {

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
                    painter = painterResource(R.drawable.clubmusic),
                    contentDescription = null,
                    modifier = Modifier
                        .size(100.dp)
                        .padding(start = 1.dp)
                        .width(1.dp)
                )
            }
        }

        /////////////// Texte01 centré //////////////////////
        item{
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .height(30.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    "Information sur",
                    fontWeight = FontWeight.Bold,
                    color = Color.Blue,
                    fontSize = 18.sp,
                )
            }
        }

        /////////////// Texte02 centré //////////////////////
        item{
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .height(30.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    "le club de music",
                    fontWeight = FontWeight.Bold,
                    color = Color.Blue,
                    fontSize = 18.sp,
                )
            }
        }

        /////////////// Champ 111  ///////////////////
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
                                .padding(start = 20.dp, top = 35.dp),
                            //verticalAlignment = Alignment.CenterVertically,
                        ) {

                            val folderPath = "Images"
                            val selectedImage: Bitmap? by remember { mutableStateOf(null) }

                            Column {

                                Row{
                                    Text("Insérer une image : ", fontWeight = FontWeight.Bold)
                                }
                            }
                        }
                    }
                }
            }
        }

        /////////////// Champ 1  ///////////////////
        item{
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier.fillMaxWidth(),
            ){
                LazyRow {
                    /////////////////////// Premier détail //////////////////////
                    items(1){
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 20.dp, top = 0.dp),
                            //verticalAlignment = Alignment.CenterVertically,
                        ) {

                            val folderPath = "Images"
                            val selectedImage: Bitmap? by remember { mutableStateOf(null) }

                            Column {

                                // Afficher l'image sélectionnée
                                if (selectedImage != null) {
                                    Image(
                                        bitmap = selectedImage!!.asImageBitmap(),
                                        contentDescription = "Image sélectionnée",
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .height(80.dp)
                                    )
                                } else {
                                    Image(
                                        painter = painterResource(id = com.example.babillard.R.drawable.icon),
                                        contentDescription = "Sélectionner une image",
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .height(80.dp)
                                    )
                                }

                                /*
                                // Ajouter un bouton pour sélectionner l'image
                                Button(
                                    onClick = {
                                        val imageFiles = getImagesFromFolder(folderPath)
                                        val buttonList = imageFiles.map { file ->
                                            Button(onClick = {
                                                selectedImage = BitmapFactory.decodeFile(file.path)
                                            }) {
                                                Text(file.name)
                                            }
                                        }
                                        AlertDialog(
                                            onDismissRequest = {},
                                            title = { Text("Sélectionner une photo") },
                                            text = { Column { /*buttonList.forEach { it }*/ } },
                                            confirmButton = { Button(onClick = { /* Fermer la boîte de dialogue */ }) { Text("Fermer") } }
                                        )
                                    },
                                    modifier = Modifier.align(Alignment.CenterHorizontally).padding(16.dp)
                                ) {
                                    Text("Sélectionner une photo")
                                }
                                */
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
                                .padding(start = 20.dp, top = 8.dp),
                            //verticalAlignment = Alignment.CenterVertically,
                        ) {
                            Column {
                                Row{
                                    //var textValue by remember { mutableStateOf("Bonjour") }
                                    TextField(
                                        value = "Music",
                                        onValueChange = { /*textValue = it"*/ },
                                        label = { Text("Entrer le type du club : ") },
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

        /////////////// Champ 3  ///////////////////
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
                                        value = "1",
                                        onValueChange = { /*textValue = it"*/ },
                                        label = { Text("Entrer le nombre de membres : ") },
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

        /////////////// Champ 4  ///////////////////
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
                                .padding(start = 20.dp, top = 15.dp),
                            //verticalAlignment = Alignment.CenterVertically,
                        ) {
                            Column {
                                Row{
                                    //var textValue by remember { mutableStateOf("Bonjour") }
                                    TextField(
                                        value = "Logbessou",
                                        onValueChange = { /*textValue = it"*/ },
                                        label = { Text("Entrer le lieu de la source : ") },
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

        /////////////// Champ 5  ///////////////////
        item{
            Box(
                contentAlignment = Alignment.CenterStart,
                modifier = Modifier.fillMaxWidth(),
            ){
                LazyRow {
                    items(1){
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 20.dp, top = 15.dp),
                            //verticalAlignment = Alignment.CenterVertically,
                        ) {
                            Column {
                                Row{

                                }
                                Row{
                                    Text("Date de parution: ", fontWeight = FontWeight.Bold)
                                    //Text("Générale")
                                    // Obtenez la date actuelle
                                    val date = Date()

                                    // Créer un formateur de date avec le format Jeckson Path
                                    val sdf = SimpleDateFormat("yyyy/MM/dd")

                                    // Formater la date actuelle selon le format Jeckson Path
                                    val formattedDate: String = sdf.format(date)
                                    // Afficher la date dans un TextView

                                    //val textView: TextView = findViewById(com.example.babillard.R.id.textView)
                                    //textView.text = formattedDate
                                }
                            }
                        }
                    }
                }
            }
        }

        /////////////// Champ 6  ///////////////////
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
                                .padding(start = 20.dp, top = 15.dp),
                            //verticalAlignment = Alignment.CenterVertically,
                        ) {
                            Column {
                                Row{
                                    //var textValue by remember { mutableStateOf("Bonjour") }
                                    TextField(
                                        value = "M. TEKOUDJOU",
                                        onValueChange = { /*textValue = it"*/ },
                                        label = { Text("Entrer le nom de l'auteur : ") },
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
                    onClick = { navController.navigate( "InfosClubMusicScreen") },
                    backgroundColor = Color.Red,
                    contentColor = Color.White,
                    modifier = Modifier
                        .clip(CircleShape)
                        .fillMaxWidth()
                ) {
                    Text(
                        text = "                   Enregistrer                   ",
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
fun CreerClubMusic_Content(scaffoldState: LazyListState) {
    val navController = rememberNavController()
    CreerClubMusic_Card(navController)
}
////////////////////////////// Terminé ///////////////////////////////////


