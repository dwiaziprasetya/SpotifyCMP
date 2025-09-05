package com.dwiaziprasetya.spotifycmp.presentation.navigation.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dwiaziprasetya.spotifycmp.presentation.navigation.BottomBarDestination
import org.jetbrains.compose.resources.painterResource

@Composable
fun BottomBar(
    modifier: Modifier = Modifier,
    selected: BottomBarDestination,
    onSelect: (BottomBarDestination) -> Unit,
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .background(Color.Transparent)
            .padding(horizontal = 24.dp, vertical = 8.dp)
            .navigationBarsPadding(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
    ) {
        BottomBarDestination.entries.forEach { destination ->
            val isSelected = destination == selected

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.clickable { onSelect(destination) }
            ) {
                Icon(
                    painter = painterResource(
                        if (isSelected) destination.activeIcon else destination.icon
                    ),
                    contentDescription = destination.title,
                    tint = if (isSelected) Color.Unspecified else Color.Gray
                )
                Text(
                    text = destination.title,
                    color = if (isSelected) Color.White else Color.Gray,
                    fontSize = 12.sp
                )
            }
        }
    }
}

