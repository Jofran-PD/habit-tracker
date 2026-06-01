package com.jofranpduran.habittracker.core.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ColorSwatch(name: String, color: Color) {
    val hex = "0x" + Integer.toHexString(color.toArgb()).uppercase()
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .size(32.dp)
                .background(color)
        )
        Spacer(modifier = Modifier.width(12.dp))
        Column {
            Text(
                text = name,
                color = HabitTrackerTheme.colors.textPrimary,
                style = HabitTrackerTheme.typography.bodyLarge
            )
            Text(
                text = hex,
                color = HabitTrackerTheme.colors.textSecondary,
                style = HabitTrackerTheme.typography.labelSmall
            )
        }
    }
}

@Preview(showBackground = true, backgroundColor = 0xFF0F0F15, heightDp = 1000)
@Composable
fun DesignSystemPreview() {
    HabitTrackerTheme {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background)
                .padding(16.dp)
                .verticalScroll(rememberScrollState())
        ) {
            Text(
                text = "Core Colors (M3 Scheme)",
                style = HabitTrackerTheme.typography.displayLarge,
                color = MaterialTheme.colorScheme.onBackground
            )
            Spacer(modifier = Modifier.height(8.dp))
            ColorSwatch("Primary (M3)", MaterialTheme.colorScheme.primary)
            ColorSwatch("Secondary (M3)", MaterialTheme.colorScheme.secondary)
            ColorSwatch("Background (M3)", MaterialTheme.colorScheme.background)
            ColorSwatch("Surface (M3)", MaterialTheme.colorScheme.surface)
            ColorSwatch("Surface Variant (M3)", MaterialTheme.colorScheme.surfaceVariant)

            Spacer(modifier = Modifier.height(24.dp))

            Text(
                text = "Custom Semantic Colors",
                style = HabitTrackerTheme.typography.displayLarge,
                color = HabitTrackerTheme.colors.textPrimary
            )
            Spacer(modifier = Modifier.height(8.dp))
            ColorSwatch("Success", HabitTrackerTheme.colors.success)
            ColorSwatch("Streak", HabitTrackerTheme.colors.streak)
            ColorSwatch("Accent", HabitTrackerTheme.colors.accent)
            ColorSwatch("Destructive", HabitTrackerTheme.colors.destructive)
            ColorSwatch("Surface Elevated", HabitTrackerTheme.colors.surfaceElevated)
            ColorSwatch("Surface Bright", HabitTrackerTheme.colors.surfaceBright)
            ColorSwatch("Border", HabitTrackerTheme.colors.border)

            Spacer(modifier = Modifier.height(24.dp))

            Text(
                text = "Typography",
                style = HabitTrackerTheme.typography.displayLarge,
                color = HabitTrackerTheme.colors.textPrimary
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                "Display Large (Manrope 800)",
                style = HabitTrackerTheme.typography.displayLarge,
                color = HabitTrackerTheme.colors.textPrimary,

                )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                "Headline Medium (Manrope 800)",
                style = HabitTrackerTheme.typography.headlineMedium,
                color = HabitTrackerTheme.colors.textPrimary
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                "Title Medium (Inter 600)",
                style = HabitTrackerTheme.typography.titleMedium,
                color = HabitTrackerTheme.colors.textPrimary
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                "Body Large (Inter 500)",
                style = HabitTrackerTheme.typography.bodyLarge,
                color = HabitTrackerTheme.colors.textPrimary
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                "Label Small (Inter 500, Caps)",
                style = HabitTrackerTheme.typography.labelSmall,
                color = HabitTrackerTheme.colors.textPrimary
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                "Label Large (Inter 700, Button)",
                style = HabitTrackerTheme.typography.labelLarge,
                color = HabitTrackerTheme.colors.textPrimary
            )
        }
    }
}
