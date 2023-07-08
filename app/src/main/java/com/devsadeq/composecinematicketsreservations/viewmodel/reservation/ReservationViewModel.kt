package com.devsadeq.composecinematicketsreservations.viewmodel.reservation

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import javax.inject.Inject

@HiltViewModel
class ReservationViewModel @Inject constructor() : ViewModel() {
    private val _state = MutableStateFlow(ReservationUIState())
    val state = _state.asStateFlow()

    init {
        getSeats()
        getDays()
        getTimes()
    }

    fun onSeatSelected(seatId: Int) {
        _state.update {
            it.copy(
                seats = it.seats.map { seat ->
                    if (seat.id == seatId) {
                        seat.copy(isSelected = !seat.isSelected)
                    } else {
                        seat
                    }
                }
            )
        }
    }

    private fun getSeats() {
        val seats = mutableListOf<SeatUIState>()
        for (i in 1..30) {
            seats.add(
                SeatUIState(
                    id = i,
                    isReserved = i % 3 == 0,
                    isSelected = i == 5
                )
            )
        }
        _state.value = _state.value.copy(seats = seats)
    }

    private fun getDays() {
        val days = mutableListOf<DayUIState>()
        for (i in 1..30) {
            days.add(
                DayUIState(
                    id = i,
                    dayOfWeek = if (i == 1) "Today" else "Day $i",
                    dayOfMonth = i,
                    isSelected = i == 1
                )
            )
        }
        _state.value = _state.value.copy(days = days)
    }

    private fun getTimes() {
        val times = mutableListOf<TimeUIState>()
        for (i in 1..7) {
            times.add(
                TimeUIState(
                    id = i,
                    time = "${i + 10}:00",
                    isSelected = i == 1
                )
            )
        }
        _state.value = _state.value.copy(times = times)
    }
}