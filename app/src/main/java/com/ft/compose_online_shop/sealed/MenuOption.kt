package com.ft.compose_online_shop.sealed

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.ft.compose_online_shop.R

sealed class MenuOption(
    @StringRes open val title: Int,
    @DrawableRes open val icon: Int? = null
){
    /** All the possible menu options goes here */
    object Share: MenuOption(title = R.string.share, icon = R.drawable.ic_share)
    object ClearCart: MenuOption(title = R.string.empty_cart, icon = R.drawable.ic_trash)
}
