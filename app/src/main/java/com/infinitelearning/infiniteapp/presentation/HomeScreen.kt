package com.infinitelearning.infiniteapp.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.infinitelearning.infiniteapp.data.DummyData
import com.infinitelearning.infiniteapp.model.VlogerMakanan
import com.infinitelearning.infiniteapp.model.Makanan
import com.infinitelearning.infiniteapp.navigation.Screen
import com.infinitelearning.infiniteapp.presentation.component.MenteeItem
import com.infinitelearning.infiniteapp.presentation.component.MentorItem

@Composable
fun HomeScreen(
    navController: NavController,
    modifier: Modifier = Modifier,
    makanans: List<Makanan> = DummyData.makananFavorit,
    vlogerMakanans: List<VlogerMakanan> = DummyData.mobileVlogerMakanans,
) {
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = modifier
    ) {
        item {
            LazyRow(
                contentPadding = PaddingValues(16.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                modifier = modifier
            ) {
                items(makanans, key = { it.id }) {
                    MentorItem(makanan = it) { mentorId ->
                        navController.navigate(Screen.Detail.route + "/$mentorId")
                    }
                }
            }
        }
        items(vlogerMakanans, key = { it.id }) {
            MenteeItem(vlogerMakanan = it, modifier = Modifier.padding(horizontal = 16.dp))
        }
    }
}