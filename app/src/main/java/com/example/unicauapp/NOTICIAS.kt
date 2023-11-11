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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun noticias() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        // Título de la pantalla
        Text(
            text = "Últimas Noticias",
            style = TextStyle(fontSize = 30.sp, fontWeight = FontWeight.Bold),
            modifier = Modifier.padding(bottom = 20.dp)
        )

        // Lista de noticias (puedes repetir este bloque para agregar más noticias)
        NewsItem(
            imageUrl = R.drawable.noti1,
            title = "Triunfos deportivos",
            description = "Las y los deportistas de la Universidad del Cauca, en sus distintas disciplinas, destacaron en diversos encuentros durante el segundo semestre del 2023."
        )

        NewsItem(
            imageUrl = R.drawable.noti2,
            title = "Posgrados en Estudios Bioculturales",
            description = "La colección incluye tres volúmenes: Diversidad epistémica y bioculturalidad; Virus, revueltas y crisis. Lecturas de la pandemia COVID-19 desde las epistemologías del cosmos vivo; y Minga para la paz, el buen vivir y la no violencia."
        )

        NewsItem(
            imageUrl = R.drawable.noti3,
            title = "Hackaton de computación",
            description = "Jessica Lasso, Daniel Oñate y German Díaz, de Ingeniería Física, y Juan Diego Vergara de la Maestría en Ingeniería Física desarrollaron un algoritmo de optimización usando computación cuántica, cuya naturaleza ofrece mayores ventajas frente a la computación clásica."
        )

        // Más noticias...

        // Logo o imagen al final
        Spacer(modifier = Modifier.height(20.dp))
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "Logo",
            modifier = Modifier
                .size(150.dp)
                .padding(16.dp)
        )
    }
}

@Composable
fun NewsItem(imageUrl: Int, title: String, description: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = imageUrl),
            contentDescription = "Noticia Imagen",
            modifier = Modifier
                .size(80.dp)
                .clip(RoundedCornerShape(8.dp))
        )

        Spacer(modifier = Modifier.width(16.dp))

        Column(
            modifier = Modifier.weight(1f)
        ) {
            Text(
                text = title,
                style = TextStyle(fontSize = 18.sp, fontWeight = FontWeight.Bold)
            )

            Text(
                text = description,
                style = TextStyle(fontSize = 14.sp, color = Color.Gray)
            )
        }
    }
}