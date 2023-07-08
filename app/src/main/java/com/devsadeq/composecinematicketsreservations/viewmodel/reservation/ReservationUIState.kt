package com.devsadeq.composecinematicketsreservations.viewmodel.reservation

data class ReservationUIState(
    val seats: List<SeatUIState> = emptyList(),
)

data class SeatUIState(
    val id: Int,
    val isReserved: Boolean = false,
    val isSelected: Boolean = false,
)

fun List<SeatUIState>.toSeatPairs(): List<Pair<SeatUIState, SeatUIState>> {
    return this.chunked(2).map { it.first() to it.last() }
}


