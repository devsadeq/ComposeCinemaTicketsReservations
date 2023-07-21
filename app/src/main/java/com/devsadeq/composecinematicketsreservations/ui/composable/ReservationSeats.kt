package com.devsadeq.composecinematicketsreservations.ui.composable

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.devsadeq.composecinematicketsreservations.viewmodel.reservation.SeatUIState

@Composable
fun ReservationScreenSeats(
    seatsPairs: List<Pair<SeatUIState, SeatUIState>>,
    onSeatClick: (id: Int) -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
    ) {
        SeatsGrid(seatsPairs = seatsPairs, onSeatClick = onSeatClick)
        SeatsIndicators()
    }
}