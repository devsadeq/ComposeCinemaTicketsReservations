package com.devsadeq.composecinematicketsreservations.ui.composable

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.devsadeq.composecinematicketsreservations.ui.theme.Orange

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomePager() {
    val state = rememberPagerState(initialPage = 1)

    HorizontalPager(
        pageCount = 3,
        contentPadding = PaddingValues(horizontal = 70.dp),
        pageSpacing = 0.dp,
        state = state
    ) { page ->
        val scale = animateFloatAsState(
            targetValue = if (page == state.currentPage) 1.0f else 0.8f,
            label = ""
        ).value

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(400.dp)
                .scale(scale)
                .clip(RoundedCornerShape(16.dp))
                .background(Orange)
        )
    }
}

@Preview(showBackground = true, showSystemUi = true, apiLevel = 31)
@Composable
fun HomePagerPreview() {
    HomePager()
}