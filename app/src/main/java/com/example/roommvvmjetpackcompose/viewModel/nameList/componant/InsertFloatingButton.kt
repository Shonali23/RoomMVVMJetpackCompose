package com.example.roommvvmjetpackcompose.viewModel.nameList.componant

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import com.example.roommvvmjetpackcompose.R

@Composable
fun InsertFloatingButton(

) {
    FloatingActionButton(
        contentColor = colorResource(R.color.float_green),
        onClick = {  }
    ) {
        Icon(
            imageVector = Icons.Default.Add,
            contentDescription = stringResource(
                id = R.string.insert_text
            )
        )
    }
}