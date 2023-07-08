package com.devsadeq.composecinematicketsreservations.ui.composable

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import com.devsadeq.composecinematicketsreservations.viewmodel.reservation.SeatUIState

@Composable
fun ReservationScreenSeats(
    seatsPairs: List<Pair<SeatUIState, SeatUIState>>,
    onSeatClick: (id: Int) -> Unit
) {
    Column {
        SeatsGrid(seatsPairs = seatsPairs, onSeatClick = onSeatClick)
        SeatsIndicators()

    }
}