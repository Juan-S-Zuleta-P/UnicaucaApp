package com.example.unicauapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


//@Preview(showBackground = true, showSystemUi = true)
@Composable
fun creadores(navController: NavController) {
    var isSecondScreenVisible by remember { mutableStateOf(false) }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp)
    ) {
        // Botones para volver a la pantalla anterior o ir a otra pantalla
        RowBotonLogin(navController)

        // Título
        Text(
            text = "DEVELOPERS",
            style = TextStyle(fontSize = 30.sp, fontWeight = FontWeight.Bold),
            modifier = Modifier.padding(bottom = 40.dp) // Ajusta el espacio inferior del título
        )

        // Primera fila
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            Spacer(modifier = Modifier.width(16.dp))
            Image(
                painter = painterResource(id = R.drawable.sebas),
                contentDescription = "foto perfil",
                modifier = Modifier
                    .size(100.dp)
                    .clip(CircleShape)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column(
                horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.Center
            ) {
                Text(text = "Sebastian Zuleta", style = TextStyle(fontSize = 20.sp), fontWeight = FontWeight.Bold)
                Text(
                    text = "Android Developer Extraordinaire",
                    color = Color(0xFF02602B),
                    style = TextStyle(fontSize = 15.sp),
                    fontWeight = FontWeight.Bold
                )
            }
            Spacer(modifier = Modifier.width(16.dp))
        }

        // Segunda fila
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            Spacer(modifier = Modifier.width(16.dp))
            Image(
                painter = painterResource(id = R.drawable.andres),
                contentDescription = "foto perfil",
                modifier = Modifier
                    .size(100.dp)
                    .clip(CircleShape)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column(
                horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.Center
            ) {
                Text(text = "Andres Rubiano", style = TextStyle(fontSize = 20.sp), fontWeight = FontWeight.Bold)
                Text(
                    text = "Android Developer Extraordinaire",
                    color = Color(0xFF02602B),
                    style = TextStyle(fontSize = 15.sp),
                    fontWeight = FontWeight.Bold
                )
            }
            Spacer(modifier = Modifier.width(16.dp))
        }

        // Tercera fila
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            Spacer(modifier = Modifier.width(16.dp))
            Image(
                painter = painterResource(id = R.drawable.miguel),
                contentDescription = "foto perfil",
                modifier = Modifier
                    .size(100.dp)
                    .clip(CircleShape)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column(
                horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.Center
            ) {
                Text(text = "Miguel Urbano", style = TextStyle(fontSize = 20.sp), fontWeight = FontWeight.Bold)
                Text(
                    text = "Android Developer Extraordinaire",
                    color = Color(0xFF02602B),
                    style = TextStyle(fontSize = 15.sp),
                    fontWeight = FontWeight.Bold
                )
            }
            Spacer(modifier = Modifier.width(16.dp))
        }

        // Imagen o logo al final
        Spacer(modifier = Modifier.height(20.dp))
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "logo",
            modifier = Modifier
                .size(150.dp)
        )
    }
}

@Composable
fun RowBotonLogin(navController: NavController) {
    Row(
        Modifier
            .fillMaxWidth()
            .padding(10.dp),
        horizontalArrangement = Arrangement.Center
    ) {
        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = {
                navController.popBackStack()
            }
        ) {
            Text(text = "Volver a Noticias")
        }

        Spacer(modifier = Modifier.width(16.dp))

        /*Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = {
                // Cambia la ruta con la correcta para ir a otra pantalla
                navController.navigate(RUTAS.P4.ruta)
            }
        ) {
            Text(text = "Ir a Otra Pantalla")
        }*/
    }
}