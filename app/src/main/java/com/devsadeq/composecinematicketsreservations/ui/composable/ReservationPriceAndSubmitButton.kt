package com.devsadeq.composecinematicketsreservations.ui.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.devsadeq.composecinematicketsreservations.R
import com.devsadeq.composecinematicketsreservations.ui.theme.Black
import com.devsadeq.composecinematicketsreservations.ui.theme.DarkGrey
import com.devsadeq.composecinematicketsreservations.ui.theme.OpenSans

@Composable
fun ReservationPriceAndSubmitButton() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
            .padding(top = 20.dp, bottom = 10.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
    ) {
        Column {
            Text(
                text = stringResource(R.string._100_00),
                fontSize = 36.sp,
                fontWeight = FontWeight.Medium,
                fontFamily = OpenSans,
                color = Black
            )
            Text(
                text = stringResource(R.string._4_tickets),
                fontSize = 14.sp,
                fontWeight = FontWeight.Normal,
                fontFamily = OpenSans,
                color = DarkGrey
            )
        }
        CustomButton(
            icon = R.drawable.ic_ticket,
            text = stringResource(R.string.buy_tickets),
        )
    }
}

@Preview
@Composable
fun ReservationPriceAndSubmitButtonPreview() {
    ReservationPriceAndSubmitButton()
}