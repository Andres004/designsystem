package edu.ucb.ds.labels

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import edu.ucb.ds.theme.MyProjectTheme

@Composable
fun MainLabel(
    text: String,
    modifier: Modifier = Modifier,
) {
    Text(text = text, style = MyProjectTheme.typography.label, modifier = modifier)
}
