package com.devsadeq.composecinematicketsreservations.ui.composable

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.unit.dp
import com.devsadeq.composecinematicketsreservations.viewmodel.home.HomeUIState

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomePager(
    images: List<HomeUIState.MovieUIState>,
    modifier: Modifier = Modifier,
    pagerState: PagerState
) {
    HorizontalPager(
        pageCount = images.size,
        contentPadding = PaddingValues(horizontal = 60.dp),
        pageSpacing = (-15).dp,
        state = pagerState,
    ) { page ->
        val scale = animateFloatAsState(
            targetValue = if (page == pagerState.currentPage) 1.0f else 0.8f,
            label = ""
        ).value

        MovieItem(
            image = images[page].imageRes,
            modifier = modifier.scale(scale)
        )
    }
}