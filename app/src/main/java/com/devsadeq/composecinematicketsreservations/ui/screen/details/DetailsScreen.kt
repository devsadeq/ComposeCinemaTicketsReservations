package com.devsadeq.composecinematicketsreservations.ui.screen.details

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.devsadeq.composecinematicketsreservations.ui.composable.DetailsBackgroundImage
import com.devsadeq.composecinematicketsreservations.ui.composable.DetailsBottomSheet
import com.devsadeq.composecinematicketsreservations.ui.composable.DetailsHeader
import com.devsadeq.composecinematicketsreservations.ui.main.Screen

@Composable
fun DetailsScreen(
    navController: NavController,
) {
    DetailsScreenContent(
        onCloseClicked = { navController.popBackStack() },
        onReserveClicked = { navController.navigate(Screen.Reservation.route) }
    )
}

@Composable
fun DetailsScreenContent(
    onCloseClicked: () -> Unit,
    onReserveClicked: () -> Unit
) {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        DetailsBackgroundImage(modifier = Modifier.align(Alignment.TopCenter))
        DetailsHeader(onCloseClicked = onCloseClicked)
        DetailsBottomSheet(
            modifier = Modifier.align(Alignment.BottomCenter),
            onReserveClicked = onReserveClicked
        )
    }
}