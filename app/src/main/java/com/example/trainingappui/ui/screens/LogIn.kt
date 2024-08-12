package com.example.trainingappui.ui.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.trainingappui.R
import com.example.trainingappui.ui.theme.TrainingAppUITheme

@Composable
fun LoginScreen(modifier: Modifier = Modifier) {
    Box(modifier = modifier.fillMaxSize()) {
        Image(
            painter = painterResource(R.drawable.pic_one),
            contentDescription = "Woman training",
            contentScale = ContentScale.FillHeight
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp, vertical = 56.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            // logo + skip button
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Image(
                    painter = painterResource(R.drawable.v_logo),
                    contentDescription = "Logo",
                    modifier = Modifier.size(38.dp)
                )

                OutlinedButton(
                    colors = ButtonDefaults.outlinedButtonColors(
                        contentColor = Color.White
                    ),
                    border = BorderStroke(width = 1.dp, color = Color.White),
                    onClick = {}
                ) {
                    Text(
                        text = "Skip".uppercase()
                    )
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                        contentDescription = "Skip"
                    )
                }
            }

            // Supplements text
            Column(modifier = Modifier.fillMaxWidth()) {
                Text(
                    text = "Supplements",
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    fontSize = 28.sp,
                    modifier = Modifier.padding(bottom = 8.dp)
                )
                Text(
                    text = "Workout plans designed to help you achieve your fitness goals whether it's losing weight or building muscle.",
                    color = Color.White,
                )
            }

            // login + signUp buttons
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                OutlinedButton(
                    colors = ButtonDefaults.outlinedButtonColors(contentColor = Color.White),
                    border = BorderStroke(1.dp, Color.White),
                    modifier = Modifier.weight(1f),
                    onClick = {}
                ) {
                    Text(
                        text = "Log In"
                    )
                }

                Spacer(modifier = Modifier.width(52.dp))

                Button(
                    modifier = Modifier.weight(1f),
                    onClick = {}
                ) {
                    Text(
                        text = "Sign Up"
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    TrainingAppUITheme {
        LoginScreen()
    }
}