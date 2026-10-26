package edu.ucb.ds.theme

import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color

@Immutable
data class DsColors(
    val primary: Color,
    val secondary: Color,
    val background: Color,
    val error: Color,
)

val LightDsColors = DsColors(
    primary = Color(0xFF0D47A1),
    secondary = Color(0xFF00897B),
    background = Color(0xFFF5F7FA),
    error = Color(0xFFC62828),
)
