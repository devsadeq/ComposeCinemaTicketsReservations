package com.devsadeq.composecinematicketsreservations.ui.composable

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.PagerState
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.devsadeq.composecinematicketsreservations.R
import com.devsadeq.composecinematicketsreservations.ui.theme.DarkGrey
import com.devsadeq.composecinematicketsreservations.ui.theme.Grey
import com.devsadeq.composecinematicketsreservations.ui.theme.LightGrey
import com.devsadeq.composecinematicketsreservations.ui.theme.OpenSans
import com.devsadeq.composecinematicketsreservations.viewmodel.home.HomeUIState


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeOverview(
    state: HomeUIState,
    pagerState: PagerState,
) {
    Column(
        modifier = Modifier.padding(vertical = 24.dp, horizontal = 60.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Icon(
                painter = painterResource(R.drawable.ic_clock),
                contentDescription = null,
                tint = Grey,
                modifier = Modifier.size(16.dp)
            )
            Text(
                text = state.movies[pagerState.settledPage].duration,
                fontWeight = FontWeight.Medium,
                fontSize = 14.sp,
                modifier = Modifier.padding(start = 4.dp),
            )
        }
        Text(
            text = state.movies[pagerState.settledPage].title.replaceFirstChar { it.uppercase() },
            fontFamily = OpenSans,
            fontWeight = FontWeight.Medium,
            fontSize = 24.sp,
            modifier = Modifier.padding(vertical = 8.dp),
            textAlign = TextAlign.Center,
        )
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
        ) {
            state.movies[pagerState.settledPage].genres.forEach { genre ->
                AppChip(
                    label = genre,
                    onClick = {},
                    labelPadding = PaddingValues(2.dp),
                    borderColor = LightGrey,
                    labelStyle = MaterialTheme.typography.labelMedium.copy(
                        fontSize = 14.sp,
                        letterSpacing = 0.15.sp,
                        color = DarkGrey,
                        fontWeight = FontWeight.Bold
                    )
                )
                Spacer(modifier = Modifier.width(4.dp))
            }
        }
    }
}