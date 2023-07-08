package com.devsadeq.composecinematicketsreservations.ui.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.devsadeq.composecinematicketsreservations.R
import com.devsadeq.composecinematicketsreservations.ui.theme.DarkGrey
import com.devsadeq.composecinematicketsreservations.ui.theme.LightOrange
import com.devsadeq.composecinematicketsreservations.viewmodel.reservation.SeatUIState


@Composable
fun SeatPair(
    seatPair: Pair<SeatUIState, SeatUIState>,
    modifier: Modifier = Modifier,
    onSeatClick: (id: Int) -> Unit
) {
    Box(
        modifier = modifier,
        contentAlignment = Alignment.Center
    ) {
        Icon(
            painter = painterResource(R.drawable.seat_belt), contentDescription = null,
            tint = if (seatPair.first.isSelected && seatPair.second.isSelected) LightOrange else DarkGrey,
            modifier = Modifier
                .fillMaxWidth()
                .height(45.dp)
                .padding(top = 6.dp),
        )
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            SeatItem(seatPair.first, onSeatClick = onSeatClick)
            Spacer(modifier = Modifier.width(4.dp))
            SeatItem(seatPair.second, onSeatClick = onSeatClick)
        }
    }
}