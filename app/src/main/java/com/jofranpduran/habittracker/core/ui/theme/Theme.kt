package com.jofranpduran.habittracker.core.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Typography
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable

private val DarkColorScheme = darkColorScheme(
    primary = Primary,
    onPrimary = TextPrimary,
    primaryContainer = PrimaryDark,
    onPrimaryContainer = TextPrimary,
    
    secondary = Secondary,
    onSecondary = TextPrimary,
    
    background = Background,
    onBackground = TextPrimary,
    
    surface = Surface,
    onSurface = TextPrimary,
    surfaceVariant = SurfaceElevated,
    onSurfaceVariant = TextSecondary,
    
    inverseSurface = SurfaceBright,
    inverseOnSurface = TextPrimary,

    outline = Border,
    error = Destructive,
    onError = TextPrimary
)

private val habitTrackerColors = HabitTrackerColors(
    success = Success,
    streak = Streak,
    accent = Accent,
    destructive = Destructive,
    surfaceElevated = SurfaceElevated,
    surfaceBright = SurfaceBright,
    textPrimary = TextPrimary,
    textSecondary = TextSecondary,
    textTertiary = TextTertiary,
    border = Border
)

object HabitTrackerTheme {
    val colors: HabitTrackerColors
        @Composable
        @ReadOnlyComposable
        get() = LocalHabitTrackerColors.current

    val typography: Typography
        @Composable
        @ReadOnlyComposable
        get() = MaterialTheme.typography
}

@Composable
fun HabitTrackerTheme(
    content: @Composable () -> Unit
) {
    CompositionLocalProvider(LocalHabitTrackerColors provides habitTrackerColors) {
        MaterialTheme(
            colorScheme = DarkColorScheme,
            typography = Typography,
            content = content
        )
    }
}
