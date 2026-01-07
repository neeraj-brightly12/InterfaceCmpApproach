package com.brightly.interfacecmpapproach

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge

import com.brightly.interfacecmpapproach.AndroidStringProviderFactory

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            App(
                factory = AndroidStringProviderFactory()
            )
        }
    }
}