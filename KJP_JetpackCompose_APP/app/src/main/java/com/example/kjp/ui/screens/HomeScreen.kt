package com.example.kjp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AccountBalance
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.Archive
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.kjp.R
import com.example.kjp.ui.components.MyIcon
import com.example.kjp.ui.navigation.AppScreens
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController) {


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
            HomeContent(navController)
        }
    }
}

@Composable
fun HomeContent(navController: NavController){

ItemCard(navController)

}

@Composable
fun BottomBarNavigator(navController: NavController){
BottomAppBar(
    containerColor = MaterialTheme.colorScheme.primaryContainer,
    contentColor = MaterialTheme.colorScheme.primary,
    ) {
Row(
    modifier = Modifier.fillMaxWidth(),
    horizontalArrangement = Arrangement.SpaceEvenly,
    verticalAlignment = Alignment.CenterVertically
){
    MyIcon(onClick = { navController.navigate(route = AppScreens.UserHomeScreen.route) }, img = Icons.Outlined.AccountCircle , cdesc = "" , size = 20.dp , padding = 8.dp )
    Icon(imageVector = Icons.Outlined.Home, contentDescription ="perfil" )
    Icon(imageVector = Icons.Outlined.Archive, contentDescription ="perfil" )
}
}
}
@Composable
fun ItemCard(navController: NavController) {
    Box(modifier = Modifier.fillMaxWidth()) {
        Column {
            Row(modifier = Modifier.fillMaxWidth()) {
                Text(text = "Text 1")
            }
            Box(
                modifier = Modifier.fillMaxWidth()
            ) {
                Image(
                    modifier = Modifier
                        .fillMaxWidth()
                        .aspectRatio(1f),
                    painter = painterResource(id = R.drawable.kjp_logo_bn),
                    contentDescription = "Photo"
                )
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(
                    modifier = Modifier.weight(3f),
                    horizontalArrangement = Arrangement.Start,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    MyIcon(onClick = { navController.navigate(route = AppScreens.UserHomeScreen.route) }, img = Icons.Outlined.AccountCircle , cdesc = "" , size = 20.dp , padding = 8.dp )
                    //Icon(imageVector = Icons.Outlined.AccountCircle, contentDescription = "perfil", modifier = Modifier.padding(horizontal = 8.dp))
                    Icon(imageVector = Icons.Outlined.Home, contentDescription = "perfil", modifier = Modifier.padding(horizontal = 8.dp))
                    Icon(imageVector = Icons.Outlined.Archive, contentDescription = "perfil", modifier = Modifier.padding(horizontal = 8.dp))
                }
                Row(
                    modifier = Modifier.weight(1f),
                    horizontalArrangement = Arrangement.End,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(imageVector = Icons.Outlined.Settings, contentDescription = "ajustes", modifier = Modifier.padding(horizontal = 8.dp))
                }

            }
            Button(onClick = { navController.navigate(route = AppScreens.SplashScreen.route) }) {
Text(text = "Click")
            }

        }
    }
}
