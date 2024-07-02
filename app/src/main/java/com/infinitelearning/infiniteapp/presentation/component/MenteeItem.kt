package com.infinitelearning.infiniteapp.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.infinitelearning.infiniteapp.R
import com.infinitelearning.infiniteapp.model.VlogerMakanan
import com.infinitelearning.infiniteapp.ui.theme.InfiniteAppTheme

@Composable
fun MenteeItem(
    vlogerMakanan: VlogerMakanan,
    modifier: Modifier = Modifier,
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .fillMaxWidth()
    ) {
        Image(
            painter = painterResource(id = vlogerMakanan.photo),
            contentDescription = vlogerMakanan.name,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .clip(CircleShape)
                .size(80.dp)
        )
        Spacer(modifier = Modifier.width(16.dp))
        Column {
            Text(text = vlogerMakanan.name, style = MaterialTheme.typography.titleMedium)
            Row {
                Text(text = vlogerMakanan.bumbu, color = MaterialTheme.colorScheme.primary)
                Text(text = " - ${vlogerMakanan.batch}")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun MentorItemPreview() {
    InfiniteAppTheme {
        MenteeItem(
            vlogerMakanan = VlogerMakanan(
                1,
                "Nama Mentee",
                R.drawable.no_profile,
                "Batch 7",
                "Mentee Mobile"
            )
        )
    }
}