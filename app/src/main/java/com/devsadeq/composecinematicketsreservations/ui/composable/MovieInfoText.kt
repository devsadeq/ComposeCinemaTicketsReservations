package com.devsadeq.composecinematicketsreservations.ui.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.devsadeq.composecinematicketsreservations.ui.theme.Black
import com.devsadeq.composecinematicketsreservations.ui.theme.Grey
import com.devsadeq.composecinematicketsreservations.ui.theme.OpenSans

@Composable
fun DetailsInfoText(
    title: String,
    subtitle: String,
    isRating: Boolean = false,
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Row(
            horizontalArrangement = Arrangement.Center,
        ) {
            Text(
                title,
                fontSize = 18.sp,
                fontWeight = FontWeight.Medium,
                color = Black,
                textAlign = TextAlign.Center,
                fontFamily = OpenSans
            )
            if (isRating) Text(
                "/10",
                fontSize = 18.sp,
                fontWeight = FontWeight.Medium,
                color = Grey,
                fontFamily = OpenSans
            )
        }
        Text(
            subtitle,
            fontSize = 14.sp,
            fontWeight = FontWeight.Normal,
            color = Grey,
            textAlign = TextAlign.Center,
            fontFamily = OpenSans
        )
    }
}