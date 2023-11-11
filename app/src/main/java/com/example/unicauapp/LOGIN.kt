package com.example.unicauapp

import android.util.Patterns
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController


@Preview(showBackground = true, showSystemUi = true)
@Composable


fun login(){
    val context= LocalContext.current

    // Correo Electrónico
    var email by remember{
        mutableStateOf("")
    }

    var isValidEmail by remember {
        mutableStateOf(false)
    }

   // COntraseña
    var password by remember{
        mutableStateOf("")
    }

    var isValidPassword by remember {
        mutableStateOf(false)
    }

    var passwordVisible by remember {
        mutableStateOf(false)
    }

    Box(modifier= Modifier
        .fillMaxSize()
        .background(Color(0xffFFFFFF))){

        Column(
            Modifier
                .align(Alignment.Center)
                .padding(16.dp)
                .fillMaxWidth())
        {
            Card(modifier=Modifier.padding(12.dp),
                shape = RoundedCornerShape(10.dp),
                elevation=CardDefaults.cardElevation(defaultElevation = 20.dp) )
            {

            }
            }
            }
        Column(Modifier.padding(16.dp)) {
            RowImage()
            RowCorreo(
                email= email,
                emailChage = {
                    email = it
                    isValidEmail = Patterns.EMAIL_ADDRESS.matcher(email).matches()
                },
                isValidEmail

            )
            RowContraseña(
                password = password,
                passwordChange = {
                    password=it
                    isValidPassword= password.length>=6
                },
                passwordVisible = passwordVisible,
                passwordVisibleChange = { passwordVisible=!passwordVisible},
                isValidpassword = isValidPassword
            )

            val navigationController= rememberNavController()
            RowBoton(navController = navigationController,
                isValidEmail = isValidEmail,
                isValidPassword =isValidPassword )

            RowBotonC(navController = navigationController)


        }

    /*val navigationController = rememberNavController()
    NavHost(navController = navigationController,principal= RUTAS.P1.ruta)
    {
        composable(RUTAS.P1.ruta){ RUTAS.P1(NavController = navigationController) }
    }*/
            }


@Composable
fun RowImage() {

    Row(
        Modifier
            .fillMaxWidth()
            .padding(70.dp),
        horizontalArrangement = Arrangement.Center
    ) {

        Image(
            modifier = Modifier.width(1000.dp),
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "Logo"
        )

    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RowCorreo(email: String, emailChage: (String) -> Unit, isValidEmail: Boolean)
{
    Row(
        Modifier
            .fillMaxWidth()
            .padding(10.dp), horizontalArrangement = Arrangement.Center) {

        OutlinedTextField(
            value =email ,
            onValueChange = emailChage,
            label = { Text(text="Email") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            maxLines = 1,
            singleLine = true,
            colors = if(isValidEmail){
                TextFieldDefaults.outlinedTextFieldColors(
                    focusedLabelColor = Color.Green,
                    focusedBorderColor = Color.Green
                )
            } else{
                TextFieldDefaults.outlinedTextFieldColors(
                    focusedLabelColor = Color.Red,
                    focusedBorderColor = Color.Red
                )
            }

        )
    }

}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RowContraseña(password:String, passwordChange:(String) -> Unit, passwordVisible:Boolean,
                  passwordVisibleChange: () -> Unit,isValidpassword: Boolean
                  )
{
 Row(
     Modifier
         .fillMaxWidth()
         .padding(10.dp), horizontalArrangement = Arrangement.Center)
 {
     OutlinedTextField(
         value =password ,
         onValueChange = passwordChange,
         label = { Text(text="Contraseña") },
         keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
         maxLines = 1,
         singleLine = true,
         trailingIcon = {
             val image = if(passwordVisible){
                 Icons.Filled.VisibilityOff
             }
             else{
                 Icons.Filled.Visibility
             }
             IconButton(onClick = { passwordVisibleChange }) {
                androidx.compose.material3.Icon(imageVector = image, contentDescription ="Mostrar Contraseña" )
             }

         },
         visualTransformation = if (passwordVisible){
             VisualTransformation.None

         }else{
             PasswordVisualTransformation()
         },
         colors = if(isValidpassword){
             TextFieldDefaults.outlinedTextFieldColors(
                 focusedLabelColor = Color.Green,
                 focusedBorderColor = Color.Green
             )
         } else{
             TextFieldDefaults.outlinedTextFieldColors(
                 focusedLabelColor = Color.Red,
                 focusedBorderColor = Color.Red
             )
         }


     )
 }
}
@Composable
fun RowBoton(
    navController: NavHostController,
    isValidEmail: Boolean,
    isValidPassword: Boolean
) {
    Row(
        Modifier
            .fillMaxWidth()
            .padding(10.dp),
        horizontalArrangement = Arrangement.Center) {
        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = { navController.navigate(RUTAS.P2.ruta) },
            enabled = isValidEmail && isValidPassword
        ) {
            Text(text = "Ingresar")
        }
    }
}

@Composable
fun RowBotonC(
    navController: NavHostController,
) {
    Row(
        Modifier
            .fillMaxWidth()
            .padding(10.dp),
        horizontalArrangement = Arrangement.Center) {
        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = { navController.navigate(RUTAS.P2.ruta) }
        ) {
            Text(text = "¿Olvidaste tu contraseña?")
        }
    }
}


