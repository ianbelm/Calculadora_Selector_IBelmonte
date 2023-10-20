package cat.institutmontilivi.estat17_10.Package

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDownward
import androidx.compose.material.icons.filled.Remove
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun prevScroll()
{
    val dies = listOf("DG", "DL", "DM", "DC", "DJ", "DV", "DS")
    scroller(dies,{String,Int ->{}},1)
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun scroller(opcions:List<String>,
             onSeleccionChanged:((String, Int)->Unit),
             opcioInicial:Int=0) {
    var opcioSelect by remember {
        mutableStateOf(3)
    }
    var desplegat by remember {
        mutableStateOf(false)
    }
    Column() {
        Row(modifier = Modifier
            .background(color = Color.White))
        {
            TextField(
                value = opcions[opcioSelect],
                onValueChange = { null },
                modifier = Modifier
                    .weight(5F)
            )
            IconButton(onClick = { desplegat = !desplegat },
                modifier = Modifier
                    .clip(RoundedCornerShape(percent = 15))
                    .background(color = Color(255, 195, 0))
                    .border(
                        border = BorderStroke(
                            width = 1.dp,
                            color = Color.Black
                        ),
                        shape = RoundedCornerShape(percent = 15)
                    )
                    .padding(4.dp)) {
                Icon(imageVector= Icons.Default.ArrowDownward,contentDescription = "Desplega")

            }

        }
        if (desplegat==true)
        {
            Column(modifier = Modifier
                .background(color = Color.White)
                .fillMaxWidth()) {
                opcions.mapIndexed{index, valor-> Text(valor,
                    modifier = Modifier
                        .padding(5.dp)
                        .border(border= BorderStroke(
                            width = 1.dp,
                            color= Color.Black

                        ), shape = RoundedCornerShape(percent =5)
                        )
                        .clickable { opcioSelect=index
                            onSeleccionChanged(opcions[opcioSelect],opcioSelect)}, color = Color.Black
                )}
            }
        }
    }
}