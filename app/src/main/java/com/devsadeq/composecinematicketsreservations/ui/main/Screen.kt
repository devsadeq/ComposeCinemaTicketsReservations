package com.devsadeq.composecinematicketsreservations.ui.main

import com.devsadeq.composecinematicketsreservations.R

sealed class Screen(
    val route: String,
    val title: String,
    val icon: Int
) {
    object Home : Screen("home", "Home", R.drawable.ic_video_play)
    object Search : Screen("search", "Search", R.drawable.ic_search)
    object Cart : Screen("cart", "Cart", R.drawable.ic_ticket)
    object Profile : Screen("profile", "Profile", R.drawable.ic_profile)
    object Details : Screen("details", "Details", R.drawable.ic_profile)
    object Reservation : Screen("reservation", "Reservation", R.drawable.ic_profile)

}