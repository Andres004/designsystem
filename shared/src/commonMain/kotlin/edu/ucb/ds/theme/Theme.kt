package edu.ucb.ds.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Immutable
data class DsSpacing(
    val small: Dp = 4.dp,
    val medium: Dp = 8.dp,
    val large: Dp = 16.dp,
)

private val LocalDsColors = staticCompositionLocalOf { LightDsColors }
private val LocalDsTypography = staticCompositionLocalOf { DefaultDsTypography }
private val LocalDsSpacing = staticCompositionLocalOf { DsSpacing() }

// Forma de acceso del PDF: MyProjectTheme.colors.primary
object MyProjectTheme {
    val colors: DsColors
        @Composable get() = LocalDsColors.current
    val typography: DsTypography
        @Composable get() = LocalDsTypography.current
    val spacing: DsSpacing
        @Composable get() = LocalDsSpacing.current
}

@Composable
fun MyProjectTheme(content: @Composable () -> Unit) {
    CompositionLocalProvider(
        LocalDsColors provides LightDsColors,
        LocalDsTypography provides DefaultDsTypography,
        LocalDsSpacing provides DsSpacing(),
        content = content
    )
}
