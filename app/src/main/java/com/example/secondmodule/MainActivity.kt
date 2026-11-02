package com.example.secondmodule

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextIndent
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.secondmodule.ui.theme.SecondmoduleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SecondmoduleTheme {
                Hello(
                    // name = null
                    name = "Oleg Alexey Vadim"
                )
            }
        }
    }
}

@Composable
fun Hello(name: String?) {
    Text(text = name ?: "Имя не задано")
}

@Composable
fun DescriptionText() {
    val text = stringResource(R.string.compose_description)
    Text(text)
}

@Composable
fun DescriptionGreen() {
    val text = stringResource(R.string.compose_description)
    Text(
        text,
        color = Color.Green,
        fontSize = 16.sp,
        fontStyle = FontStyle.Italic,
        textAlign = TextAlign.Center
    )
}

@Composable
fun DescriptionEllipsis() {
    val text = stringResource(R.string.compose_description)
    Text(
        text,
        maxLines = 1,
        overflow = TextOverflow.Ellipsis,
        modifier = Modifier.fillMaxWidth(1f)
    )
}

@Composable
fun DescriptionStyled() {
    val text = stringResource(R.string.compose_description)
    Text(
        text,
        fontSize = 24.sp,
        color = Color.Black,
        modifier = Modifier.background(color = Color.Green),
        style = androidx.compose.ui.text.TextStyle(
            textIndent = TextIndent(firstLine = 48.sp),
            textDecoration = TextDecoration.Underline
        )
    )
}

@Composable
fun CustomButton() {
    Button(
        onClick = {},
        content = {
            Text(text = "Нажми на меня")
        },
        modifier = Modifier.fillMaxWidth(1f),
        shape = RoundedCornerShape(16.dp),
        border = BorderStroke(2.dp, Color.Gray),
        elevation = ButtonDefaults.buttonElevation(4.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color.LightGray, contentColor = Color.Black)
    )
}

// ---------------------
// ----- <PREVIEW> -----
// ---------------------

@Preview(
    name = "portrait",
    showSystemUi = true,
    device = "spec:width=411dp,height=891dp,dpi=420,orientation=portrait"
)
@Composable
fun HelloPortraitPreview() {
    Hello(null)
}

@Preview(
    name = "landscape",
    showSystemUi = true,
    device = "spec:width=891dp,height=411dp,dpi=420,orientation=landscape"
)
@Composable
fun HelloLandscapePreview() {
    Hello(null)
}

@Preview(
    name = "round",
    showSystemUi = true,
    device = "spec:width=200dp,height=200dp,dpi=420,isRound=true",
    showBackground = true
)
@Composable
fun HelloRoundPreview() {
    Surface(color = Color.Yellow) {
        Hello(null)
    }
}

@Preview(showBackground = true)
@Composable
fun DescriptionTextPreview() {
    DescriptionText()
}

@Preview
@Composable
fun DescriptionGreenPreview() {
    DescriptionGreen()
}

@Preview(showBackground = true)
@Composable
fun DescriptionEllipsisPreview() {
    DescriptionEllipsis()
}

@Preview(showBackground = true)
@Composable
fun DescriptionStyledPreview() {
    DescriptionStyled()
}

@Preview(showBackground = true)
@Composable
fun CustomButtonPreview() {
    CustomButton()
}
