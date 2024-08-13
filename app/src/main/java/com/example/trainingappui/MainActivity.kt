package com.example.trainingappui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.trainingappui.ui.screens.LoginScreen
import com.example.trainingappui.ui.theme.TrainingAppUITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TrainingAppUITheme {
                LoginScreen()
            }
        }
    }
}