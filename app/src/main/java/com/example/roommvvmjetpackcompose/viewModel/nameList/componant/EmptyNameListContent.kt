package com.example.roommvvmjetpackcompose.viewModel.nameList.componant

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.sp
import com.example.roommvvmjetpackcompose.R

@Composable
fun EmptyNameListContent()
{
    Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center)
    {
        Text(text = stringResource(R.string.empty_name_list_text),fontSize = 18.sp)

    }
}