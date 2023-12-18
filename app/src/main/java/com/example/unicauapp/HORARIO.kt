package com.example.unicauapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController


//@Preview(showBackground = true, showSystemUi = true)

@Composable
fun horario(navController: NavController) {
    var isSecondScreenVisible by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Botones para navegar a otra pantalla o volver a login
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Button(
                modifier = Modifier
                    .weight(1f)
                    .padding(10.dp),
                onClick = { navController.popBackStack(RUTAS.P3.ruta, inclusive = false) }
            ) {
                Text(text = "Volver a Carnet")
            }

            Spacer(modifier = Modifier.width(16.dp))

            Button(
                modifier = Modifier
                    .weight(1f)
                    .padding(10.dp),
                onClick = { navController.navigate(RUTAS.P5.ruta) }
            ) {
                Text(text = "Notas")
            }
        }

        Spacer(modifier = Modifier.height(16.dp)) // Ajusta el espacio según tus necesidades

        // Utiliza el modificador fillMaxSize para que la imagen ocupe todo el espacio disponible
        Image(
            painter = painterResource(id = R.drawable.horario_picture),
            contentDescription = "foto perfil",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop // Esto recortará la imagen para que llene el espacio sin distorsionarla
        )


    }
        }



