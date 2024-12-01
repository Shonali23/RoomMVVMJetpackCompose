package com.example.roommvvmjetpackcompose.view

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import com.example.roommvvmjetpackcompose.R
import com.example.roommvvmjetpackcompose.viewModel.nameList.componant.EmptyNameListContent
import com.example.roommvvmjetpackcompose.viewModel.nameList.componant.NameListSearchBar

@Composable
fun NameListScreen()
{
    val todoList= emptyList<String>()

    Scaffold(
        topBar = {
            NameListSearchBar()
        },
        floatingActionButton = {
            FloatingActionButton(onClick = { },containerColor = colorResource(R.color.float_green)) {
                Icon(Icons.Default.Add, contentDescription = stringResource(R.string.insert_text))
            }
        }
    ) { paddingValues ->
        if (todoList.isEmpty()) {
            EmptyNameListContent()
        } else {
            LazyColumn {

            }
        }
    }
}