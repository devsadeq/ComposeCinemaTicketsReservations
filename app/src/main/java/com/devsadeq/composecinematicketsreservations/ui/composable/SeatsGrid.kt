package com.devsadeq.composecinematicketsreservations.ui.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.unit.dp
import com.devsadeq.composecinematicketsreservations.viewmodel.reservation.SeatUIState

@Composable
fun SeatsGrid(
    seatsPairs: List<Pair<SeatUIState, SeatUIState>>,
    onSeatClick: (id: Int) -> Unit
) {
    val leftSeatsIndexes = listOf(0, 3, 6, 9, 12)
    val rightSeatsIndexes = listOf(2, 5, 8, 11, 14)

    LazyVerticalGrid(
        columns = GridCells.Fixed(3),
        contentPadding = PaddingValues(0.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        items(seatsPairs.size) { index ->
            when (index) {
                in leftSeatsIndexes -> SeatPair(
                    seatsPairs[index],
                    modifier = Modifier.rotate(8f),
                    onSeatClick = onSeatClick
                )

                in rightSeatsIndexes -> SeatPair(
                    seatsPairs[index],
                    modifier = Modifier.rotate(-8f),
                    onSeatClick = onSeatClick
                )

                else -> SeatPair(
                    seatsPairs[index],
                    modifier = Modifier.padding(top = 8.dp),
                    onSeatClick = onSeatClick
                )
            }
        }
    }
}