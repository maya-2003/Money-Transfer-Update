package com.teamj.moneytransferapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.teamj.moneytransferapp.transfer.TransferScreen

object  Route{
    const val SIGNUP = "signup"
    const val CONTINUE_SIGNUP = "continue_signup"
    const val PROFILE = "profile"
    const val PROFILE_INFO = "profile_info"
    const val TRANSFER_AMOUNT = "transfer_amount"
    const val TRANSFER_CONFIRM = "transfer_confirm"
    const val TRANSFER_PAYMENT = "transfer_payment"
    const val MORE = "more"
    const val NOTIFICATIONS = "notifications"
    const val LAST_TRANSACTIONS = "last_transactions"
    const val TRANSACTION = "transaction"
    const val TRANSFER_PH1 = "transfer_ph1"

}
@Composable
fun AppNavHost(onSendNotification: () -> Unit,modifier: Modifier = Modifier){
    val navController= rememberNavController()
    NavHost(navController = navController, startDestination = Route.TRANSFER_PH1) {
        composable(route = Route.TRANSFER_PH1){ TransferScreen(navController) }

    }
}