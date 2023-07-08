package com.devsadeq.composecinematicketsreservations.viewmodel.reservation

data class ReservationUIState(
    val seats: List<SeatUIState> = emptyList(),
    val days: List<DayUIState> = emptyList(),
    val times: List<TimeUIState> = emptyList(),
)

data class SeatUIState(
    val id: Int,
    val isReserved: Boolean = false,
    val isSelected: Boolean = false,
)

data class DayUIState(
    val id: Int,
    val dayOfWeek: String,
    val dayOfMonth: Int,
    val isSelected: Boolean = false,
)

data class TimeUIState(
    val id: Int,
    val time: String,
    val isSelected: Boolean = false,
)

fun List<SeatUIState>.toSeatPairs(): List<Pair<SeatUIState, SeatUIState>> {
    return this.chunked(2).map { it.first() to it.last() }
}