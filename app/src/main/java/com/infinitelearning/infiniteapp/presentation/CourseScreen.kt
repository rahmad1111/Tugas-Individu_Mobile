package com.infinitelearning.infiniteapp.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.infinitelearning.infiniteapp.data.DummyData
import com.infinitelearning.infiniteapp.model.About
import com.infinitelearning.infiniteapp.presentation.component.CourseItem
import com.infinitelearning.infiniteapp.ui.theme.InfiniteAppTheme

@Composable
fun About(
    modifier: Modifier = Modifier,
    cours: List<About> = DummyData.About
) {
    LazyVerticalGrid(
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        columns = GridCells.Adaptive(140.dp),
        modifier = modifier.fillMaxSize()
    ) {
        items(cours, key = { it.id }) {
            CourseItem(about = it)
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun CourseScreenPreview() {
    InfiniteAppTheme {
        About(cours = DummyData.About)
    }
}