package com.jofranpduran.habittracker.core.ui.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

@Immutable
data class HabitTrackerColors(
    val success: Color,
    val streak: Color,
    val accent: Color,
    val destructive: Color,
    val surfaceElevated: Color,
    val surfaceBright: Color,
    val textPrimary: Color,
    val textSecondary: Color,
    val textTertiary: Color,
    val border: Color
)

val LocalHabitTrackerColors = staticCompositionLocalOf {
    HabitTrackerColors(
        success = Color.Unspecified,
        streak = Color.Unspecified,
        accent = Color.Unspecified,
        destructive = Color.Unspecified,
        surfaceElevated = Color.Unspecified,
        surfaceBright = Color.Unspecified,
        textPrimary = Color.Unspecified,
        textSecondary = Color.Unspecified,
        textTertiary = Color.Unspecified,
        border = Color.Unspecified
    )
}
