package com.devsadeq.composecinematicketsreservations.ui.main

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.devsadeq.composecinematicketsreservations.ui.screen.cart.CartScreen
import com.devsadeq.composecinematicketsreservations.ui.screen.details.DetailsScreen
import com.devsadeq.composecinematicketsreservations.ui.screen.home.HomeScreen
import com.devsadeq.composecinematicketsreservations.ui.screen.profile.ProfileScreen
import com.devsadeq.composecinematicketsreservations.ui.screen.reservation.ReservationScreen
import com.devsadeq.composecinematicketsreservations.ui.screen.search.SearchScreen

@Composable
fun AppNavGraph(navHostController: NavHostController) {
    NavHost(
        navController = navHostController,
        startDestination = Screen.Home.route,
    ) {
        composable(Screen.Home.route) {
            HomeScreen(navController = navHostController)
        }
        composable(Screen.Search.route) {
            SearchScreen()
        }
        composable(Screen.Cart.route) {
            CartScreen()
        }
        composable(Screen.Profile.route) {
            ProfileScreen()
        }
        composable(Screen.Details.route) {
            DetailsScreen(navController = navHostController)
        }
        composable(Screen.Reservation.route) {
            ReservationScreen(navController = navHostController)
        }
    }
}