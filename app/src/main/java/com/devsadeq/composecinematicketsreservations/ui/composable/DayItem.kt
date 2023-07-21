package com.devsadeq.composecinematicketsreservations.ui.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.devsadeq.composecinematicketsreservations.ui.theme.Black
import com.devsadeq.composecinematicketsreservations.ui.theme.Grey
import com.devsadeq.composecinematicketsreservations.ui.theme.LightGrey
import com.devsadeq.composecinematicketsreservations.ui.theme.OpenSans
import com.devsadeq.composecinematicketsreservations.ui.theme.White


@Composable
fun DayItem(
    dayOfMonth: Int,
    dayOfWeek: String,
    isSelected: Boolean = false,
) {
    Column(
        modifier = Modifier
            .border(1.dp, if (isSelected) Grey else LightGrey, RoundedCornerShape(24.dp))
            .clip(RoundedCornerShape(24.dp))
            .background(if (isSelected) Grey else Color.Transparent)
            .padding(vertical = 12.dp, horizontal = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = dayOfMonth.toString(),
            fontSize = 24.sp,
            fontWeight = FontWeight.Medium,
            color = if (isSelected) White else Black
        )
        Text(
            text = dayOfWeek,
            color = if (isSelected) White else Grey,
            fontSize = 12.sp,
            fontWeight = FontWeight.Medium,
            fontFamily = OpenSans,
        )
    }
}