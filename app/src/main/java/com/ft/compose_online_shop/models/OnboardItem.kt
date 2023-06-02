package com.ft.compose_online_shop.models

import androidx.annotation.DrawableRes

data class OnboardItem(
    @DrawableRes val image: Int,
    val text: String,
)
