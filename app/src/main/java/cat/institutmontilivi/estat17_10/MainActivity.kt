package cat.institutmontilivi.estat17_10

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import cat.institutmontilivi.estat17_10.Package.calc
import cat.institutmontilivi.estat17_10.Package.scroller
import cat.institutmontilivi.estat17_10.ui.theme.Estat1710Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Estat1710Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Estat1710Theme {
        var text by remember { mutableStateOf("DG") }
        val dies = listOf("DG", "DL", "DM", "DC", "DJ", "DV", "DS")
        Column()
        {
            Box(modifier = Modifier
                .fillMaxWidth()
                .weight(3F))
            {
                calc()
            }
            Box(modifier = Modifier
                .fillMaxWidth()
                .weight(1F))
            {
                scroller(dies,{String,Int ->{}},1)
            }
        }
    }
}
fun onClick (textSelect:String, pos:Int)
{
    //text = textSelect
}