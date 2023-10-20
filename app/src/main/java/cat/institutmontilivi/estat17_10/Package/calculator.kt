package cat.institutmontilivi.estat17_10.Package

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun prevCalc()
{
    calc()
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun calc()
{
    var numPantalla by remember{ mutableStateOf("0") }
    var memoria by remember{ mutableStateOf(0) }
    var editant by remember{ mutableStateOf(false)}
    var sign by remember { mutableStateOf("") }
    
    Column(
        modifier = Modifier
            .padding(10.dp)
    )
    {
        TextField(value = numPantalla, onValueChange={ nouText -> numPantalla = nouText },
            modifier = Modifier
                .background(Color.DarkGray)
                .fillMaxWidth())
        Row(
            modifier = Modifier
                .padding(10.dp)
        )
        {
            Column(modifier = Modifier.weight(2F))
            {
                Row(
                    modifier = Modifier
                        .weight(3F)
                )
                {
                    Button(onClick =
                    {
                    if (!editant)
                    {
                        numPantalla="1"
                        editant=true
                    }
                    else numPantalla += "1"
                                     },
                        colors = ButtonDefaults.buttonColors(Color(255, 195, 0)),
                        modifier = Modifier
                            .weight(4F)
                            .padding(5.dp)
                            .fillMaxHeight(),
                        shape = MaterialTheme.shapes.medium) {
                        Text(text = "1")
                    }
                    Button(onClick = {
                        if (!editant)
                        {
                            numPantalla="2"
                            editant=true
                        }
                        else numPantalla += "2"
                    },
                        colors = ButtonDefaults.buttonColors(Color(255, 195, 0)),
                        modifier = Modifier
                            .weight(4F)
                            .padding(5.dp)
                            .fillMaxHeight(),
                        shape = MaterialTheme.shapes.medium) {
                        Text(text = "2")
                    }
                    Button(onClick = {
                        if (!editant)
                        {
                            numPantalla="3"
                            editant=true
                        }
                        else numPantalla += "3"
                    },
                        colors = ButtonDefaults.buttonColors(Color(255, 195, 0)),
                        modifier = Modifier
                            .weight(4F)
                            .padding(5.dp)
                            .fillMaxHeight(),
                        shape = MaterialTheme.shapes.medium) {
                        Text(text = "3")
                    }
                }
                Row(
                    modifier = Modifier
                        .weight(3F)
                )
                {
                    Button(onClick = {
                        if (!editant)
                        {
                            numPantalla="4"
                            editant=true
                        }
                        else numPantalla += "4"
                    },
                        colors = ButtonDefaults.buttonColors(Color(255, 195, 0)),
                        modifier = Modifier
                            .weight(4F)
                            .padding(5.dp)
                            .fillMaxHeight(),
                        shape = MaterialTheme.shapes.medium) {
                        Text(text = "4")
                    }
                    Button(onClick = {
                        if (!editant)
                        {
                            numPantalla="5"
                            editant=true
                        }
                        else numPantalla += "5"
                    },
                        colors = ButtonDefaults.buttonColors(Color(255, 195, 0)),
                        modifier = Modifier
                            .weight(4F)
                            .padding(5.dp)
                            .fillMaxHeight(),
                        shape = MaterialTheme.shapes.medium) {
                        Text(text = "5")
                    }
                    Button(onClick = {
                        if (!editant)
                        {
                            numPantalla="6"
                            editant=true
                        }
                        else numPantalla += "6"
                    },
                        colors = ButtonDefaults.buttonColors(Color(255, 195, 0)),
                        modifier = Modifier
                            .weight(4F)
                            .padding(5.dp)
                            .fillMaxHeight(),
                        shape = MaterialTheme.shapes.medium) {
                        Text(text = "6")
                    }
                }
                Row(
                    modifier = Modifier
                        .weight(3F)
                )
                {
                    Button(onClick = {
                        if (!editant)
                        {
                            numPantalla="7"
                            editant=true
                        }
                        else numPantalla += "7"
                    },
                        colors = ButtonDefaults.buttonColors(Color(255, 195, 0)),
                        modifier = Modifier
                            .weight(4F)
                            .padding(5.dp)
                            .fillMaxHeight(),
                        shape = MaterialTheme.shapes.medium) {
                        Text(text = "7")
                    }
                    Button(onClick = {
                        if (!editant)
                        {
                            numPantalla="8"
                            editant=true
                        }
                        else numPantalla += "8"
                    },
                        colors = ButtonDefaults.buttonColors(Color(255, 195, 0)),
                        modifier = Modifier
                            .weight(4F)
                            .padding(5.dp)
                            .fillMaxHeight(),
                        shape = MaterialTheme.shapes.medium) {
                        Text(text = "8")
                    }
                    Button(onClick = {
                        if (!editant)
                        {
                            numPantalla="9"
                            editant=true
                        }
                        else numPantalla += "9"
                    },
                        colors = ButtonDefaults.buttonColors(Color(255, 195, 0)),
                        modifier = Modifier
                            .weight(4F)
                            .padding(5.dp)
                            .fillMaxHeight(),
                        shape = MaterialTheme.shapes.medium) {
                        Text(text = "9")
                    }
                }
                    Button(onClick = {
                        if (!editant)
                        {
                            numPantalla="0"
                        }
                        else numPantalla += "0"
                    },
                        colors = ButtonDefaults.buttonColors(Color(255, 195, 0)),
                        modifier = Modifier
                            .weight(1F)
                            .padding(5.dp)
                            .height(80.dp)
                            .fillMaxWidth(),
                        shape = MaterialTheme.shapes.medium) {
                        Text(text = "0")
                    }
            }
            Column(
                modifier = Modifier
                    .weight(0.5F)
            )
            {
                Button(onClick = {
                        numPantalla="0"
                        editant=false
                    memoria=0
                    sign=""
                },
                    colors = ButtonDefaults.buttonColors(Color(255, 195, 0)),
                    modifier = Modifier
                        .weight(4F)
                        .padding(5.dp)
                        .width(80.dp),
                    shape = MaterialTheme.shapes.medium) {
                    Text(text = "C")
                }
                Button(onClick = {
                    memoria+=numPantalla.toInt()
                    editant=false
                    numPantalla=memoria.toString()
                    sign="+"
                },
                    colors = ButtonDefaults.buttonColors(Color(255, 195, 0)),
                    modifier = Modifier
                        .weight(4F)
                        .padding(5.dp)
                        .width(80.dp),
                    shape = MaterialTheme.shapes.medium) {
                    Text(text = "+")
                }
                Button(onClick = {
                    if (sign=="-") memoria += (numPantalla.toInt())*-1
                    else memoria += (numPantalla.toInt())
                    editant = false
                    numPantalla = memoria.toString()
                    sign="-"
                },
                    colors = ButtonDefaults.buttonColors(Color(255, 195, 0)),
                    modifier = Modifier
                        .weight(4F)
                        .padding(5.dp)
                        .width(80.dp),
                    shape = MaterialTheme.shapes.medium) {
                    Text(text = "-")
                }
                Button(onClick = {
                    if (sign=="+")
                        numPantalla = (memoria + numPantalla.toInt()).toString()
                    else
                        numPantalla = (memoria - numPantalla.toInt()).toString()

                    editant = false
                    memoria = 0
                },
                    colors = ButtonDefaults.buttonColors(Color(255, 195, 0)),
                    modifier = Modifier
                        .weight(4F)
                        .padding(5.dp)
                        .width(80.dp),
                    shape = MaterialTheme.shapes.medium) {
                    Text(text = "=")
                }
            }
        }
    }
}