package com.devsadeq.composecinematicketsreservations.ui.main

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.devsadeq.composecinematicketsreservations.ui.theme.ComposeCinemaTicketsReservationsTheme
import com.devsadeq.composecinematicketsreservations.ui.theme.Orange
import com.devsadeq.composecinematicketsreservations.ui.theme.White

@Composable
fun MainScreen() {
    ComposeCinemaTicketsReservationsTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            MainScreenContent()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreenContent() {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = { BottomNavBar(navController) }
    ) { innerPadding ->
        Box(modifier = Modifier.padding(innerPadding)) {
            AppNavGraph(navController)
        }
    }
}

@Composable
fun BottomNavBar(navController: NavHostController) {
    val screens = listOf(
        Screen.Home,
        Screen.Search,
        Screen.Cart,
        Screen.Profile
    )
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    BottomNavigation(
        modifier = Modifier,
        backgroundColor = White,
        contentColor = White,
        elevation = 0.dp
    ) {
        screens.forEach { screen ->
            AddItem(
                selected = currentRoute == screen.route,
                screen = screen,
                navController = navController
            )
        }
    }
}

@Composable
fun RowScope.AddItem(
    selected: Boolean = false,
    screen: Screen,
    navController: NavHostController
) {
    BottomNavigationItem(
        icon = {
            if (selected) {
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(50.dp))
                        .background(Orange)
                        .padding(8.dp),
                ) {
                    Icon(
                        painter = painterResource(id = screen.icon),
                        contentDescription = screen.title,
                        tint = MaterialTheme.colorScheme.onPrimary
                    )
                }
            } else {
                Icon(
                    painter = painterResource(id = screen.icon),
                    contentDescription = screen.title
                )
            }
        },
        selected = selected,
        onClick = {
            navController.navigate(screen.route) {
                popUpTo(navController.graph.startDestinationId)
                launchSingleTop = true
            }
        },
        alwaysShowLabel = false,
    )
}

@Preview(showBackground = true, showSystemUi = true, apiLevel = 31)
@Composable
fun MainScreenPreview() {
    MainScreen()
}