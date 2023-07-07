package com.devsadeq.composecinematicketsreservations.ui.composable

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.devsadeq.composecinematicketsreservations.R

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomePager(
    images: List<Int>,
    modifier: Modifier = Modifier,
) {
    val state = rememberPagerState(initialPage = 1)
    HorizontalPager(
        pageCount = images.size,
        contentPadding = PaddingValues(horizontal = 60.dp),
        pageSpacing = (-15).dp,
        state = state
    ) { page ->
        val scale = animateFloatAsState(
            targetValue = if (page == state.currentPage) 1.0f else 0.8f,
            label = ""
        ).value

        MovieItem(
            image = images[page],
            modifier = modifier.scale(scale)
        )
    }
}

@Preview(showBackground = true, showSystemUi = true, apiLevel = 31)
@Composable
fun HomePagerPreview() {
    val images = listOf(
        R.drawable.movie1,
        R.drawable.movie2,
        R.drawable.movie3,
    )
    HomePager(images)
}