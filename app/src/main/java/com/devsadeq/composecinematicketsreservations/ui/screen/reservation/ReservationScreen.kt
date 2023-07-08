package com.devsadeq.composecinematicketsreservations.ui.screen.reservation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.devsadeq.composecinematicketsreservations.ui.composable.ReservationScreenSeats
import com.devsadeq.composecinematicketsreservations.ui.theme.Black
import com.devsadeq.composecinematicketsreservations.viewmodel.reservation.ReservationViewModel
import com.devsadeq.composecinematicketsreservations.viewmodel.reservation.SeatUIState
import com.devsadeq.composecinematicketsreservations.viewmodel.reservation.toSeatPairs

@Composable
fun ReservationScreen(viewModel: ReservationViewModel = hiltViewModel()) {
    val state by viewModel.state.collectAsState()
    ReservationScreenContent(
        state.seats,
        onSeatClick = viewModel::onSeatSelected
    )
}

@Composable
private fun ReservationScreenContent(
    seats: List<SeatUIState>,
    onSeatClick: (id: Int) -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Black)
    ) {
        ReservationScreenHeader()
        ReservationScreenSeats(seatsPairs = seats.toSeatPairs(), onSeatClick = onSeatClick)
        ReservationScreenFooter()
    }
}

@Composable
fun ReservationScreenFooter() {
}


@Composable
fun ReservationScreenHeader() {
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ReservationScreenPreview() {
    ReservationScreen()
}