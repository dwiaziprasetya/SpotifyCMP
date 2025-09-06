package com.dwiaziprasetya.spotifycmp.presentation.screen.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dwiaziprasetya.spotifycmp.core.resource.Resources
import org.jetbrains.compose.resources.painterResource

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF121212))
            .statusBarsPadding()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            FilterChip("All", selected = true)
            FilterChip("Music", selected = false)
            FilterChip("Podcasts", selected = false)
        }
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            contentPadding = PaddingValues(16.dp)
        ) {
            item {
                PlaylistGrid()
            }
            item {
                Text(
                    text = "Your recent rotation",
                    color = Color.White,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(vertical = 8.dp)
                )
            }
            items(10) { index ->
                RecentRotationItem(
                    title = when (index) {
                        0 -> "Take Me Out"
                        1 -> "Heaven Sent"
                        else -> "Feel Something (With I Prevail)"
                    },
                    subtitle = when (index) {
                        0 -> "Franz Ferdinand"
                        1 -> "Tevomxntana"
                        else -> "ILLENIUM, Excision, I Prevail"
                    }
                )
            }
        }
    }
}

@Composable
fun FilterChip(text: String, selected: Boolean) {
    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(50))
            .background(if (selected) Color(0xFf1ED760) else Color.DarkGray)
            .padding(horizontal = 16.dp, vertical = 8.dp)
    ) {
        Text(
            text = text,
            color = if (selected) Color.Black else Color.White,
            fontSize = 14.sp,
            fontWeight = FontWeight.Medium
        )
    }
}

@Composable
fun PlaylistGrid() {
    Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
            PlaylistCard("My top tracks playlist")
            PlaylistCard("Quenica")
        }
        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
            PlaylistCard("Neptuna")
            PlaylistCard("BizKit")
        }
        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
            PlaylistCard("BreZ")
            PlaylistCard("Hits 2017-2018-2019")
        }
    }
}

@Composable
fun PlaylistCard(title: String) {
    Box(
        modifier = Modifier
            .height(60.dp)
            .clip(RoundedCornerShape(8.dp))
            .background(Color(0xFF2A2A2A))
            .padding(8.dp),
        contentAlignment = Alignment.CenterStart
    ) {
        Text(
            text = title,
            color = Color.White,
            fontSize = 12.sp,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        )
    }
}

@Composable
fun RecentRotationItem(title: String, subtitle: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .size(48.dp)
                .clip(RoundedCornerShape(6.dp))
                .background(Color.Gray)
        )
        Spacer(modifier = Modifier.width(12.dp))
        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = title,
                color = Color.White,
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = subtitle,
                color = Color.Gray,
                fontSize = 12.sp
            )
        }
    }
}
