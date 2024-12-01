package com.example.roommvvmjetpackcompose.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.lifecycle.ReportFragment.Companion.reportFragment
import com.example.roommvvmjetpackcompose.R
import com.example.roommvvmjetpackcompose.ui.theme.RoomMVVMJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val todoList = emptyList<String>()
        enableEdgeToEdge()
        setContent {
            RoomMVVMJetpackComposeTheme {
                Scaffold(
                    topBar = {

                    },
                    floatingActionButton = {
                        FloatingActionButton(onClick = { },containerColor = colorResource(R.color.float_green)) {
                            Icon(Icons.Default.Add, contentDescription = "+")
                        }
                    }
                ) { paddingValues ->
                    if (todoList.isEmpty()) {
                        Box(modifier = Modifier.fillMaxSize().padding(paddingValues)) {
                            Text(
                                "Press the + button to add a TODO item",
                                Modifier.align(Alignment.Center)
                            )
                        }
                    } else {
                        LazyColumn {

                        }
                    }
                }
            }
        }
    }
}

