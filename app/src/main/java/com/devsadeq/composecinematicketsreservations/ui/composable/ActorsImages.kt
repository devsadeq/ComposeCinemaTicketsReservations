package com.devsadeq.composecinematicketsreservations.ui.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.devsadeq.composecinematicketsreservations.R

@Composable
fun ActorsImages() {
    LazyRow(
        modifier = Modifier.padding(vertical = 16.dp),
        horizontalArrangement = Arrangement.Center,
        contentPadding = PaddingValues(horizontal = 24.dp),
    ) {
        items(10) {
            Image(
                painter = painterResource(R.drawable.movie3),
                contentDescription = null,
                modifier = Modifier
                    .size(60.dp)
                    .clip(RoundedCornerShape(100.dp)),
                contentScale = ContentScale.Crop,
            )
            Spacer(modifier = Modifier.width(4.dp))
        }
    }
}