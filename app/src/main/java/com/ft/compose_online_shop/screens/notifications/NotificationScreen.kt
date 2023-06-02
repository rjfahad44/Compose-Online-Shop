package com.ft.compose_online_shop.screens.notifications

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.hilt.navigation.compose.hiltViewModel
import com.ft.compose_online_shop.R
import com.ft.compose_online_shop.sealed.UiState
import com.ft.compose_online_shop.ui.theme.Dimension

@Composable
fun NotificationScreen(
    notificationViewModel: NotificationViewModel = hiltViewModel(),
) {
    val uiState by remember { notificationViewModel.uiState }
    LazyColumn(
        modifier = Modifier.background(MaterialTheme.colors.background),
        verticalArrangement = Arrangement.spacedBy(Dimension.pagePadding),
        contentPadding = PaddingValues(Dimension.pagePadding),
    ) {
        item {
            Text(
                text = stringResource(R.string.notifications),
                style = MaterialTheme.typography.button,
                color = MaterialTheme.colors.onBackground,
            )
        }
        when (uiState) {
            is UiState.Loading -> {}
            is UiState.Success -> {

            }
            is UiState.Idle -> {}
            is UiState.Error -> {}
        }
    }
}