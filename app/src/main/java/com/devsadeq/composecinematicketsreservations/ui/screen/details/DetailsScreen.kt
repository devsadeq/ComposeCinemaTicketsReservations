package com.devsadeq.composecinematicketsreservations.ui.screen.details

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.devsadeq.composecinematicketsreservations.ui.composable.DetailsBackgroundImage
import com.devsadeq.composecinematicketsreservations.ui.composable.DetailsBottomSheet
import com.devsadeq.composecinematicketsreservations.ui.composable.DetailsHeader
import com.devsadeq.composecinematicketsreservations.ui.main.Screen
import com.devsadeq.composecinematicketsreservations.viewmodel.details.DetailsUIState
import com.devsadeq.composecinematicketsreservations.viewmodel.details.DetailsViewModel

@Composable
fun DetailsScreen(
    navController: NavController,
    viewModel: DetailsViewModel = hiltViewModel()
) {
    val state by viewModel.state.collectAsState()
    DetailsScreenContent(
        state,
        onCloseClicked = { navController.popBackStack() },
        onReserveClicked = { navController.navigate(Screen.Reservation.route) }
    )
}

@Composable
fun DetailsScreenContent(
    state: DetailsUIState,
    onCloseClicked: () -> Unit,
    onReserveClicked: () -> Unit
) {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        DetailsBackgroundImage(modifier = Modifier.align(Alignment.TopCenter))
        DetailsHeader(onCloseClicked = onCloseClicked)
        DetailsBottomSheet(
            state,
            modifier = Modifier.align(Alignment.BottomCenter),
            onReserveClicked = onReserveClicked
        )
    }
}