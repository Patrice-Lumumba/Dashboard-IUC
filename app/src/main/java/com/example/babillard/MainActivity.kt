package com.example.babillard

import android.os.Bundle
import android.util.Log
import android.util.Patterns
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusDirection
import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.BlendMode.Companion.Screen
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
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.babillard.MainActivity.Companion.TAB
import com.example.babillard.SplashScreen.Connexion.ConnexionScreen
import com.example.babillard.SplashScreen.Connexion.Ecoles.Association.InfosClubDanse.*
import com.example.babillard.SplashScreen.Connexion.Ecoles.EcolesScreen
import com.example.babillard.SplashScreen.Connexion.Ecoles.Filieres3IAC.Filieres3IACScreen
import com.example.babillard.SplashScreen.Connexion.Ecoles.Filieres3IAC.InfosTIPAM.InfosTIPAMedt_e.*
import com.example.babillard.SplashScreen.Connexion.Ecoles.Filieres3IAC.InfosTIPAM.InfosTIPAMevens.*
import com.example.babillard.SplashScreen.Connexion.Ecoles.Filieres3IAC.InfosTIPAM.InfosTIPAMgenerale.*
import com.example.babillard.SplashScreen.Connexion.Ecoles.Filieres3IAC.InfosTIPAM.InfosTIPAMsport.*
import com.example.babillard.SplashScreen.Screen
import com.example.babillard.ui.theme.BabillardTheme
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import kotlinx.coroutines.InternalCoroutinesApi

class MainActivity : ComponentActivity() {

    companion object{
        val TAB: String = MainActivity::class.java.simpleName
    }

    private val auth by lazy{
        Firebase.auth
    }

    @InternalCoroutinesApi
    @ExperimentalMaterialApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BabillardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    //Greeting("Android")


                    //////////////// Variable de navigation ///////////////////////
                    val navController = rememberNavController()
                    ////////////////////////// Navigation entre les interfaces //////////////////////
                    NavHost(navController = navController, startDestination = "Screen") {
                        composable("screen1") { Screen1(navController) }
                        composable("screen2") { Screen2() }

                        composable("LoginScreen") {LoginScreen(navController, Firebase.auth) }
                        composable("Screen") { Screen(navController) }
                        composable("ConnexionScreen") { ConnexionScreen(navController) }
                        composable("EcolesScreen") { EcolesScreen(navController) }
                        composable("Filieres3IACScreen") { Filieres3IACScreen(navController) }

                        composable("CreerTIPAMgeneralScreen") { CreerTIPAMgeneralScreen(navController) }
                        composable("InfosTIPAMgeneralScreen") { InfosTIPAMgeneralScreen(navController) }
                        composable("TIPAMgeneral1Screen") { TIPAMgeneral1Screen(navController) }
                        composable("TIPAMgeneral2Screen") { TIPAMgeneral2Screen(navController) }
                        composable("TIPAMgeneral3Screen") { TIPAMgeneral3Screen(navController) }
                        composable("TIPAMgeneral4Screen") { TIPAMgeneral4Screen(navController) }
                        composable("TIPAMgeneral5Screen") { TIPAMgeneral5Screen(navController) }
                        composable("TIPAMgeneral6Screen") { TIPAMgeneral6Screen(navController) }
                        composable("TIPAMgeneral7Screen") { TIPAMgeneral7Screen(navController) }

                        composable("CreerTIPAMevensScreen") { CreerTIPAMevensScreen(navController) }
                        composable("InfosTIPAMevensScreen") { InfosTIPAMevensScreen(navController) }
                        composable("TIPAMevens1Screen") { TIPAMevens1Screen(navController) }
                        composable("TIPAMevens2Screen") { TIPAMevens2Screen(navController) }
                        composable("TIPAMevens3Screen") { TIPAMevens3Screen(navController) }
                        composable("TIPAMevens4Screen") { TIPAMevens4Screen(navController) }
                        composable("TIPAMevens5Screen") { TIPAMevens5Screen(navController) }
                        composable("TIPAMevens6Screen") { TIPAMevens6Screen(navController) }
                        composable("TIPAMevens7Screen") { TIPAMevens7Screen(navController) }

                        composable("CreerTIPAMedt_eScreen") { CreerTIPAMedt_eScreen(navController) }
                        composable("InfosTIPAMedt_eScreen") { InfosTIPAMedt_eScreen(navController) }
                        composable("TIPAMedt_e1Screen") { TIPAMedt_e1Screen(navController) }
                        composable("TIPAMedt_e2Screen") { TIPAMedt_e2Screen(navController) }
                        composable("TIPAMedt_e3Screen") { TIPAMedt_e3Screen(navController) }
                        composable("TIPAMedt_e4Screen") { TIPAMedt_e4Screen(navController) }
                        composable("TIPAMedt_e5Screen") { TIPAMedt_e5Screen(navController) }
                        composable("TIPAMedt_e6Screen") { TIPAMedt_e6Screen(navController) }
                        composable("TIPAMedt_e7Screen") { TIPAMedt_e7Screen(navController) }

                        composable("CreerTIPAMsportScreen") { CreerTIPAMsportScreen(navController) }
                        composable("InfosTIPAMsportScreen") { InfosTIPAMsportScreen(navController) }
                        composable("TIPAMsport1Screen") { TIPAMsport1Screen(navController) }
                        composable("TIPAMsport2Screen") { TIPAMsport2Screen(navController) }
                        composable("TIPAMsport3Screen") { TIPAMsport3Screen(navController) }
                        composable("TIPAMsport4Screen") { TIPAMsport4Screen(navController) }
                        composable("TIPAMsport5Screen") { TIPAMsport5Screen(navController) }
                        composable("TIPAMsport6Screen") { TIPAMsport6Screen(navController) }
                        composable("TIPAMsport7Screen") { TIPAMsport7Screen(navController) }

                        composable("CreerClubDanseScreen") { CreerClubDanseScreen(navController) }
                        composable("InfosClubDanseScreen") { InfosClubDanseScreen(navController) }
                        composable("ClubDanse1Screen") { ClubDanse1Screen(navController) }
                        composable("ClubDanse2Screen") { ClubDanse2Screen(navController) }
                        composable("ClubDanse3Screen") { ClubDanse3Screen(navController) }
                        composable("ClubDanse4Screen") { ClubDanse4Screen(navController) }
                        composable("ClubDanse5Screen") { ClubDanse5Screen(navController) }
                        composable("ClubDanse6Screen") { ClubDanse6Screen(navController) }
                        composable("ClubDanse7Screen") { ClubDanse7Screen(navController) }

                    }
                    /////////////////////////////////////// Terminé /////////////////////////////
                }
            }
        }
    }
}

@Composable
fun LoginScreen( navController: NavHostController, auth: FirebaseAuth) {

    val context = LocalContext.current

    val focusManager = LocalFocusManager.current

    var email by remember {
        mutableStateOf("")
    }

    var password by remember {
        mutableStateOf("")
    }

    val isEmailValid by derivedStateOf {
        Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }

    val isPasswordValid by derivedStateOf {
        password.length > 7
    }

    var isPasswordVisible by remember {
        mutableStateOf(false)
    }

    Column(
        modifier = Modifier
            .background(color = Color.LightGray)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ){
        Text(
            text = "IUC",
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic,
            fontSize = 20.sp,
            color = Color.Red,
            modifier = Modifier.padding(top = 20.dp, bottom = 16.dp)
        )

        Image(
            painter = painterResource(id = R.drawable.iuciuciuc),
            contentDescription = "Logo",
            modifier = Modifier.size(250.dp)
        )

        Text(
            text = "...Enseigner l'homme dans sa",
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            fontStyle = FontStyle.Italic,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = "globalité",
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            fontStyle = FontStyle.Italic,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 8.dp),
            shape = RoundedCornerShape(16.dp),
            border = BorderStroke(1.dp, Color.Black)
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(8.dp),
                modifier = Modifier.padding(all = 10.dp)
            ){
                OutlinedTextField(
                    value = email,
                    onValueChange = { email = it },
                    label = { Text( "Votre Email")},
                    placeholder = { Text("nom.prenom@myiuc.com")},
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth(),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Email,
                        imeAction = ImeAction.Next
                    ),
                    keyboardActions = KeyboardActions(
                        onNext = {focusManager.moveFocus(FocusDirection.Down)}
                    ),
                    isError = !isEmailValid,
                    trailingIcon = {
                        if(email.isNotBlank()){
                            IconButton(onClick = {email = ""}) {
                                Icon(
                                    imageVector = Icons.Filled.Clear,
                                    contentDescription = "Clear mail"
                                )
                            }
                        }
                    }
                )

                OutlinedTextField(
                    value = password,
                    onValueChange = { password = it },
                    label = { Text( "Matricule")},
                    placeholder = { Text("")},
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth(),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Password,
                        imeAction = ImeAction.Done
                    ),
                    keyboardActions = KeyboardActions(
                        onDone = {focusManager.clearFocus()}
                    ),
                    isError = !isPasswordValid

                )

                Button(
                    onClick = {
                        auth.signInWithEmailAndPassword(email, password)
                            .addOnCompleteListener{
                                if (it.isSuccessful){
                                    Toast.makeText(context, "Vous avez été connecté avec succès", Toast.LENGTH_SHORT).show()
                                    Log.d(TAB, "Vous avez été connecté avec succès")
                                    ////////////////////////////////////////////////////////////////////
                                    navController.navigate("EcolesScreen")
                                    ////////////////////////////////////////////////////////////////////

                                }else{
                                    Toast.makeText(context, "Email ou mot de passe incorrect", Toast.LENGTH_SHORT).show()
                                    Log.d(TAB, "Email ou mot de passe incorrect")
                                    ////////////////////////////////////////////////////////////////////
                                    /*
                                        navController.navigate("EcolesScreen")
                                    */
                                    ////////////////////////////////////////////////////////////////////

                                }
                            }
                    },
                    modifier = Modifier.fillMaxWidth(),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.Red),
                    enabled = isEmailValid && isPasswordValid
                ) {
                    /*Text(
                        text = "Se connecter",
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                        fontSize = 16.dp
                    )*/
                }

            }
        }
        Row(
            horizontalArrangement = Arrangement.End,
            modifier = Modifier.fillMaxWidth()
        ) {

        }
    }
}



@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    val navController = rememberNavController()
    LoginScreen(navController, Firebase.auth)
}

/*@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BabillardTheme {
        Greeting("Android")
    }
}*/