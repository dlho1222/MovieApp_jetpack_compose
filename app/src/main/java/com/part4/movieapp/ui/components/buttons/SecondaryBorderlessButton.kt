package com.part4.movieapp.ui.components.buttons

import androidx.annotation.StringRes
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.part4.movieapp.ui.theme.ColorScheme
import com.part4.movieapp.ui.theme.MovieAppTheme
import com.part4.movieapp.ui.theme.Paddings

@Composable
fun SecondaryBorderlessButton(
    modifier: Modifier = Modifier,
    @StringRes id: Int? = null,
    text: String = "",
    onClick: () -> Unit,
) {
    Button(
        modifier = Modifier.fillMaxWidth(),
        shape = MaterialTheme.shapes.large,
        border = BorderStroke(
            2.dp,
            MaterialTheme.ColorScheme.secondary
        ),
        colors = ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.ColorScheme.background,
            contentColor = MaterialTheme.ColorScheme.secondary,
            disabledContentColor = MaterialTheme.ColorScheme.background,
            disabledContainerColor = MaterialTheme.ColorScheme.disabledSecondary,
        ),
        onClick = onClick
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Text(text = id?.let { stringResource(id = id) } ?: text,
                style = MaterialTheme.typography.labelLarge,
                modifier = Modifier.padding(Paddings.small))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SecondaryBorderlessButtonPreview() {
    MovieAppTheme {
        SecondaryBorderlessButton(){

        }
    }
}