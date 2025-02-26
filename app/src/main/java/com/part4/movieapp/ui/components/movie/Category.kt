package com.part4.movieapp.ui.components.movie

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.part4.movieapp.ui.theme.MovieAppTheme
import com.part4.movieapp.ui.theme.Paddings

@Composable
fun CategoryRow() {
    Column {
        CategoryTitle("Action")
        LazyRow(
            contentPadding = PaddingValues(horizontal = Paddings.large)
        ) {
            //itemsIndexed
            item {
                MovieItem()
            }
            item {
                MovieItem()
            }
            item {
                MovieItem()
            }
            item {
                MovieItem()
            }
            item {
                MovieItem()
            }


        }
    }
}

@Composable
fun CategoryTitle(title: String) {
    Text(
        text = "Action",
        modifier = Modifier.padding(
            vertical = Paddings.large,
            horizontal = Paddings.extra
        ),
        style = MaterialTheme.typography.headlineSmall
    )
}

@Preview(showBackground = true)
@Composable
fun CategoryPreview() {
    MovieAppTheme {
        CategoryRow()
    }
}