package com.example.unicauapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.unicauapp.ui.theme.UNICAUAPPTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UNICAUAPPTheme {
                // Crear el NavController
                val navController = rememberNavController()

                // Configurar el NavHost con las rutas y el NavController
                NavHost(
                    navController = navController,
                    startDestination = RUTAS.P1.ruta
                ) {
                    composable(RUTAS.P1.ruta) { login(navController) }
                    composable(RUTAS.P2.ruta) { Olvido(navController) }
                    composable(RUTAS.P3.ruta) { Carnet(navController) }
                    composable(RUTAS.P4.ruta) { horario(navController) }
                    composable(RUTAS.P5.ruta) { notas(navController) }
                    composable(RUTAS.P6.ruta) { noticias(navController) }
                    composable(RUTAS.P7.ruta) { creadores(navController) }
                }
            }
        }
    }
}

/*@Composable
fun*/

/*@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    UNICAUAPPTheme {
        login()

    }
}*/