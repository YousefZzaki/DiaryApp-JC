package com.example.diaryapp_jc.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.*
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.diaryapp_jc.util.Constants.WRITE_SCREEN_DIARY_ID_ARG

@Composable
fun NavGraphSetup(navController: NavHostController, startDestination: String) {

    NavHost(navController = navController, startDestination = startDestination) {
        authenticationScreen()
        homeScreen()
        writeScreen()
    }
}


fun NavGraphBuilder.authenticationScreen() {
    composable(Screen.Authentication.route) {

    }
}

fun NavGraphBuilder.homeScreen() {
    composable(Screen.Home.route) {

    }
}

fun NavGraphBuilder.writeScreen() {
    composable(
        Screen.Write.route,
        listOf(navArgument(name = WRITE_SCREEN_DIARY_ID_ARG) {
            type = NavType.StringType
            nullable = true
            defaultValue = null
        })
    ) {

    }
}
