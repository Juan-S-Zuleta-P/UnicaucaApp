package com.example.unicauapp


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.unicauapp.R
import com.example.unicauapp.RUTAS


//@Preview(showBackground = true, showSystemUi = true)
/*@Composable
fun CarnetPreview(navController: NavController) {
    // Puedes cambiar los valores según tus necesidades
    val navController = rememberNavController()
    Carnet(navController)
}*/

@Composable
fun Carnet(navController: NavHostController) {
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
                onClick = { navController.popBackStack(RUTAS.P1.ruta, inclusive = false) }
            ) {
                Text(text = "Volver a Login")
            }

            Spacer(modifier = Modifier.width(16.dp))

            Button(
                modifier = Modifier
                    .weight(1f)
                    .padding(10.dp),
                onClick = { navController.navigate(RUTAS.P4.ruta) }
            ) {
                Text(text = "Horario")
            }
        }

        Text(
            text = "CARNET ESTUDIANTIL",
            style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold),
            modifier = Modifier.padding(bottom = 30.dp) // Ajusta el espacio inferior del título
        )



        Spacer(modifier = Modifier.height(16.dp)) // Ajusta el espacio según tus necesidades

        // Utiliza el modificador fillMaxSize para que la imagen ocupe todo el espacio disponible
        Image(
            painter = painterResource(id = R.drawable.profile_picture),
            contentDescription = "foto perfil",
            modifier = Modifier
                .fillMaxSize()
                .clickable { isSecondScreenVisible = !isSecondScreenVisible },
            contentScale = ContentScale.Crop // Esto recortará la imagen para que llene el espacio sin distorsionarla
        )

        // Agrega más contenido según sea necesario para tu pantalla "carnet"
        // ...

        // Llamada a la función RowBotonCarnet que estaba faltando
        RowBotonCarnet(navController, isSecondScreenVisible)
    }
}

@Composable
fun RowBotonCarnet(navController: NavHostController, isSecondScreenVisible: Boolean) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        horizontalArrangement = Arrangement.Center
    ) {
        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = {
                if (isSecondScreenVisible) {
                    navController.navigate(RUTAS.P4.ruta)
                } else {
                    navController.popBackStack(RUTAS.P1.ruta, inclusive = false)
                }
            }
        ) {
            Text(
                text = if (isSecondScreenVisible) "Ir a Otra Pantalla" else "Volver a Login"
            )
        }
    }
}

@Composable
fun RowBotonLogin(navController: NavHostController) {
    Row(
        Modifier
            .fillMaxWidth()
            .padding(10.dp),
        horizontalArrangement = Arrangement.Center
    ) {
        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = {
                navController.popBackStack(RUTAS.P1.ruta, inclusive = false)
            }
        ) {
            Text(text = "Volver a Login")
        }
    }
}

/*@Composable
fun RowBotonCarnet(navController: NavHostController, isSecondScreenVisible: Boolean) {
    Row(
        Modifier
            .fillMaxWidth()
            .padding(10.dp),
        horizontalArrangement = Arrangement.Center
    ) {
        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = {
                if (isSecondScreenVisible) {
                    navController.navigate(RUTAS.P4.ruta)
                } else {
                    navController.popBackStack(RUTAS.P1.ruta, inclusive = false)
                }
            }
        ) {
            Text(
                text = if (isSecondScreenVisible) "Ir a Otra Pantalla" else "Volver a Login"
            )
        }
    }*/

private fun NavHostController.popBackStack(p1: RUTAS.P1, inclusive: Boolean) {

}

private fun NavHostController.navigate(p4: RUTAS.P4, inclusive: Boolean) {

}





