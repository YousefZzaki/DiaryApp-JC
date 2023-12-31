package com.example.diaryapp_jc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.compose.rememberNavController
import com.example.diaryapp_jc.navigation.NavGraphSetup
import com.example.diaryapp_jc.navigation.Screen
import com.example.diaryapp_jc.ui.theme.DiaryApp_JCTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        setContent {
            DiaryApp_JCTheme {
                // A surface container using the 'background' color from the theme
                val navController = rememberNavController()
                NavGraphSetup(navController = navController, startDestination = Screen.Home.route)
            }
        }
    }
}
