package com.example.kjp.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults.shape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun Styled_Button(){
    Button(
        modifier = Modifier
            .background(color = Color.White)
            ,
        onClick = { /*TODO*/ }) {
        Text(text = "Button")
    }
}

@Composable
fun MyBox(){

}
//Icon(imageVector = Icons.Outlined.AccountCircle, contentDescription = "perfil", modifier = Modifier.padding(horizontal = 8.dp))
@Composable
fun MyIcon(onClick: () -> Unit, img: ImageVector, cdesc: String, size: Dp, padding: Dp) {
    // Utilitza un Clickable com a contenidor per a l'Icon

        // Defineix l'Icon amb l'imatge i el contentDescription
        Icon(
            imageVector = img,
            contentDescription = cdesc,
            modifier = Modifier.padding(horizontal = padding).clickable { onClick() } // Mida de l'Icon
        )

}