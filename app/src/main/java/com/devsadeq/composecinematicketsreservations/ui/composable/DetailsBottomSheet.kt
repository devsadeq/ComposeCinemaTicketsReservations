package com.devsadeq.composecinematicketsreservations.ui.composable

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.devsadeq.composecinematicketsreservations.ui.theme.White
import com.devsadeq.composecinematicketsreservations.viewmodel.details.DetailsUIState

@Composable
fun DetailsBottomSheet(
    state: DetailsUIState,
    onReserveClicked: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .clip(
                RoundedCornerShape(
                    topStart = 40.dp,
                    topEnd = 40.dp,
                    bottomStart = 0.dp,
                    bottomEnd = 0.dp
                )
            ),
        colors = CardDefaults.cardColors(containerColor = White)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            MovieStatistics()
            MovieTitle()
            MovieCategories()
            ActorsImages(state.actors)
            MovieDescription()
            CustomButton(onClick = onReserveClicked, modifier = Modifier.padding(top = 24.dp))
        }
    }
}