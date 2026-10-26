package edu.ucb.ds.buttons

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import edu.ucb.ds.theme.MyProjectTheme

@Composable
fun MainButton(
    text: String,
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
) {
    Button(
        onClick = onClick,
        modifier = modifier,
        colors = ButtonDefaults.buttonColors(
            containerColor = MyProjectTheme.colors.primary,
            contentColor = Color.White
        )
    ) {
        Text(text = text, style = MyProjectTheme.typography.label)
    }
}
