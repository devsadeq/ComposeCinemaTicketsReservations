package com.devsadeq.composecinematicketsreservations.ui.screen.home

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.devsadeq.composecinematicketsreservations.ui.composable.BlurBackground
import com.devsadeq.composecinematicketsreservations.ui.composable.HomeFilterChips
import com.devsadeq.composecinematicketsreservations.ui.composable.HomeOverview
import com.devsadeq.composecinematicketsreservations.ui.composable.HomePager
import com.devsadeq.composecinematicketsreservations.ui.main.Screen
import com.devsadeq.composecinematicketsreservations.viewmodel.home.HomeUIState
import com.devsadeq.composecinematicketsreservations.viewmodel.home.HomeViewModel


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeScreen(
    navController: NavController,
    viewModel: HomeViewModel = hiltViewModel()
) {
    val state by viewModel.state.collectAsState()
    val pagerState = rememberPagerState(initialPage = 1)

    HomeScreenContent(
        state = state,
        pagerState = pagerState,
        onItemClicked = { navController.navigate(Screen.Details.route) }
    )
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
private fun HomeScreenContent(
    state: HomeUIState,
    pagerState: PagerState,
    onItemClicked: () -> Unit
) {

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        BlurBackground(image = state.movies[pagerState.currentPage].imageRes)
        Column(
            modifier = Modifier,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            HomeFilterChips()
            HomePager(state.movies, pagerState = pagerState, onItemClicked = onItemClicked)
            HomeOverview(state, pagerState)
        }
    }
}