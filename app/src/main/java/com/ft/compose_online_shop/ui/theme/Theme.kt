package com.ft.compose_online_shop.ui.theme


import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.graphics.Color.Companion.LightGray
import androidx.compose.ui.graphics.Color.Companion.White

private val DarkColorPalette = darkColors(
    primary = Blue,
    primaryVariant = DarkBlue,
    secondary = Orange,
    background = White,
    surface = LightGray,
    onPrimary = White,
    onSecondary = White,
    onBackground = Black,
    onSurface = Black,
)

private val LightColorPalette = lightColors(
    primary = Blue,
    primaryVariant = DarkBlue,
    secondary = Orange,
    background = White,
    surface = LightGray,
    onPrimary = White,
    onSecondary = White,
    onBackground = Black,
    onSurface = Black,
)


@Composable
fun ComposeOnlineShopTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}