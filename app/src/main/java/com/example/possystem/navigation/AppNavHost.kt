package com.example.possystem.navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.possystem.data.AuthViewModel
import com.example.possystem.product.AddProductScreen
import com.example.possystem.product.ProductListScreen
import com.example.possystem.ui.theme.screens.dashboard.Dashboard
import com.example.possystem.ui.theme.screens.login.LoginScreen
import com.example.possystem.ui.theme.screens.register.RegisterScreen

@Composable
fun AppNavHost(
    navController: NavHostController = rememberNavController(),
    authViewModel: AuthViewModel = viewModel(),
    startDestination: String = if (authViewModel.isUserLoggedIn()) ROUTE_DASHBOARD else ROUTE_REGISTER
) {
    NavHost(navController = navController, startDestination = startDestination) {
        composable(ROUTE_REGISTER) { RegisterScreen(navController) }
        composable(ROUTE_LOGIN) { LoginScreen(navController) }
        composable(ROUTE_DASHBOARD) { Dashboard(navController) }
        composable(ROUTE_ADD_PRODUCT) { AddProductScreen(navController) }
        composable(ROUTE_VIEW_PRODUCT) { ProductListScreen(navController) }
    }
}
