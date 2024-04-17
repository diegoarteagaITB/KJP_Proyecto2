package com.example.kjp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.kjp.R
import com.example.kjp.ui.navigation.AppScreens

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun UserHomeScreen(navController : NavController){
    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary,
                ),
                title = {
                    Text("KJP - Menu")
                }
            )
        },
        bottomBar = {
            BottomBarNavigator(navController)

        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding),
            verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            UserHomeContent()
        }
    }
}
@Composable
fun UserHomeContent(){
    Column {
        Row(modifier = Modifier
            .fillMaxWidth()){
            Box(modifier = Modifier
                .fillMaxWidth(0.3f)){
                Image(painter = painterResource(id = R.drawable.kjp_logo_bn), contentDescription = null )
            }
            Column {
                Row {
                    Text(text = "Name Last-Name")
                    Text(text = "Entities")
                }
                Text(text = "This is the main frase")
            }
        }
    }
}

@Composable
fun SquareButton(){
    Box(modifier = Modifier
        .background(Color.Blue)
        .clip(RoundedCornerShape(16.dp)),


    ){
        Icon(imageVector = Icons.Outlined.Add, contentDescription = null)
    }
}