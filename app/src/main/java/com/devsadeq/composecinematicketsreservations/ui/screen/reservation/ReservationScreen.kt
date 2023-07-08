package com.devsadeq.composecinematicketsreservations.ui.screen.reservation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.devsadeq.composecinematicketsreservations.ui.composable.ReservationScreenFooter
import com.devsadeq.composecinematicketsreservations.ui.composable.ReservationScreenHeader
import com.devsadeq.composecinematicketsreservations.ui.composable.ReservationScreenSeats
import com.devsadeq.composecinematicketsreservations.ui.theme.Black
import com.devsadeq.composecinematicketsreservations.viewmodel.reservation.ReservationUIState
import com.devsadeq.composecinematicketsreservations.viewmodel.reservation.ReservationViewModel
import com.devsadeq.composecinematicketsreservations.viewmodel.reservation.toSeatPairs

@Composable
fun ReservationScreen(
    navController: NavController,
    viewModel: ReservationViewModel = hiltViewModel()
) {
    val state by viewModel.state.collectAsState()
    ReservationScreenContent(
        state,
        onSeatClick = viewModel::onSeatSelected,
        onCloseClicked = { navController.popBackStack() }
    )
}

@Composable
private fun ReservationScreenContent(
    state: ReservationUIState,
    onSeatClick: (id: Int) -> Unit,
    onCloseClicked: () -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Black)
    ) {
        ReservationScreenHeader(
            modifier = Modifier.align(Alignment.TopCenter),
            onCloseClicked = onCloseClicked
        )
        ReservationScreenSeats(
            seatsPairs = state.seats.toSeatPairs(),
            onSeatClick = onSeatClick,
            modifier = Modifier
                .align(Alignment.TopCenter)
                .padding(top = 200.dp)
        )
        ReservationScreenFooter(
            state = state,
            modifier = Modifier.align(Alignment.BottomCenter),
        )
    }
}