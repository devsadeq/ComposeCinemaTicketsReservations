package com.devsadeq.composecinematicketsreservations.ui.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.devsadeq.composecinematicketsreservations.viewmodel.reservation.ReservationUIState

@Composable
fun ReservationDays(state: ReservationUIState) {
    LazyRow(
        modifier = Modifier.fillMaxWidth(),
        contentPadding = PaddingValues(horizontal = 18.dp, vertical = 5.dp),
        horizontalArrangement = Arrangement.spacedBy(4.dp),
    ) {
        items(state.days) {
            DayItem(
                dayOfMonth = it.dayOfMonth,
                dayOfWeek = it.dayOfWeek,
                isSelected = it.isSelected
            )
        }
    }
}