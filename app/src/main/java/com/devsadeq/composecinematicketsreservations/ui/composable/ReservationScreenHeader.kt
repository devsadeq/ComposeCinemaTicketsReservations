package com.devsadeq.composecinematicketsreservations.ui.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.devsadeq.composecinematicketsreservations.R
import com.devsadeq.composecinematicketsreservations.ui.theme.White


@Composable
fun ReservationScreenHeader(modifier: Modifier, onCloseClicked: () -> Unit) {
    Column(
        modifier = modifier.padding(vertical = 16.dp, horizontal = 16.dp),
    ) {
        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(30.dp))
                .background(White.copy(alpha = 0.3f))
                .clickable { onCloseClicked() }
        ) {
            Icon(
                painter = painterResource(R.drawable.ic_close_circle),
                contentDescription = null,
                modifier = Modifier
                    .padding(4.dp)
                    .size(24.dp),
                tint = White,
            )
        }
        RoundedBannerImage()
    }
}