package com.devsadeq.composecinematicketsreservations.ui.screen.cart

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun CartScreen() {
    CartScreenContent()
}

@Composable
private fun CartScreenContent() {
    Column(
        modifier = Modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Text(text = "Cart Screen", fontSize = 30.sp)
    }
}

@Preview(showBackground = true, showSystemUi = true, apiLevel = 31)
@Composable
fun CartScreenPreview() {
    CartScreen()
}