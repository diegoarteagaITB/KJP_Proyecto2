package com.example.kjp.ui.navigation

sealed class AppScreens(val route: String) {

    object SplashScreen: AppScreens("splash_screen")
    object LoginScreen: AppScreens("login_screen")
    object HomeScreen: AppScreens("home_screen")
    object UserHomeScreen: AppScreens("user_home_screen")
    object EntityScreen: AppScreens("entity_screen")
    object MapScreen: AppScreens("map_screen")
    object Event: AppScreens("event_screen")
}