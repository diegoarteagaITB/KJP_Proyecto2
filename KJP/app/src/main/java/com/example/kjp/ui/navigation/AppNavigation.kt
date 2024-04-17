package com.example.kjp.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.kjp.ui.screens.HomeScreen
import com.example.kjp.ui.screens.LoginScreen
import com.example.kjp.ui.screens.SplashScreen
import com.example.kjp.ui.screens.UserHomeScreen
import com.example.kjp.ui.viewmodels.LoginViewModel

@Composable
fun AppNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = AppScreens.SplashScreen.route){
        composable(route = AppScreens.SplashScreen.route){
            SplashScreen(navController)
        }
        composable(route = AppScreens.LoginScreen.route){
            LoginScreen(navController, viewModel = LoginViewModel())
        }
        composable(route = AppScreens.HomeScreen.route){
            HomeScreen(navController)
        }
        composable(route = AppScreens.UserHomeScreen.route){
            UserHomeScreen(navController)
        }
    }
}