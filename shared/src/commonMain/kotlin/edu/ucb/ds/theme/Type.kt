package edu.ucb.ds.theme

import androidx.compose.runtime.Immutable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Immutable
data class DsTypography(
    val heading: TextStyle,
    val body: TextStyle,
    val label: TextStyle,
)

val DefaultDsTypography = DsTypography(
    heading = TextStyle(fontSize = 22.sp, fontWeight = FontWeight.Bold),
    body = TextStyle(fontSize = 16.sp),
    label = TextStyle(fontSize = 14.sp, fontWeight = FontWeight.Medium),
)
