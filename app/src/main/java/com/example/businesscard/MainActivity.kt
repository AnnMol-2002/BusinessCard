package com.example.businesscard

//import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
//import androidx.compose.foundation.layout.BoxScopeInstance.align
//import androidx.compose.foundation.layout.BoxScopeInstance.align
//import androidx.compose.foundation.layout.BoxScopeInstance.align
//import androidx.compose.foundation.layout.ColumnScopeInstance.align
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background) {
                    BusinessCardWithImage(name = "Ann Mol", desc = "Android Developer Extraordinarie", phone = "+91 9495830263", place = "@AndroidDev" , mail = "annmolanto2002@gmail.com")
                }
            }
        }
    }
}

@Composable
fun BusinessCardWithImage (name: String,desc: String,phone: String,place: String,mail: String) {
        Column() {
            Box(modifier = Modifier.padding(16.dp)) {
                Column() {
                    Image(
                        painter = painterResource(R.drawable.android_logo),
                        contentDescription = "Android logo",
                        modifier = Modifier
                            .height(50.dp)
                            .width(50.dp)
                            .align(Alignment.CenterHorizontally)
                    )
                    Text(
                        text = name,
                        fontSize = 30.sp,
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                    )
                    Text(
                        text = desc,
                        fontSize = 16.sp,
                        fontWeight = FontWeight(800),
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                        //color = Color(0xFF3ddc84)
                    )
                }
            }
            Box(modifier = Modifier.padding(16.dp)) {
                Column() {

                        //Row() {
                        Image(painter = painterResource(R.drawable.icons8_phone_24), contentDescription = "null")
                        Text(
                            text = phone,
                            fontSize = 16.sp,
                            modifier = Modifier.align(Alignment.CenterHorizontally)
                        )
                        //}

                    //Row() {
                        Image(painter = painterResource(R.drawable.icons8_phone_24), contentDescription = "null")
                        Text(
                            text = phone,
                            fontSize = 16.sp,
                            modifier = Modifier.align(Alignment.CenterHorizontally)
                        )
                    //}
                    //Row() {
                        Image(painter = painterResource(R.drawable.icons8_share_24), contentDescription = "null" )
                        Text(
                            text = place,
                            fontSize = 16.sp,
                            modifier = Modifier.align(Alignment.CenterHorizontally)
                        )
                    //}
                    //Row() {
                        Image(painter = painterResource(R.drawable.icons8_envelope_24), contentDescription = "null" )
                        Text(
                            text = mail,
                            fontSize = 16.sp,
                            modifier = Modifier.align(Alignment.CenterHorizontally)
                        )
                    //}
                }
            }
        }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BusinessCardTheme {
        BusinessCardWithImage(name = "Ann Mol", desc = "Android Developer Extraordinarie", phone = "+91 9495830263", place = "@AndroidDev" , mail = "annmolanto2002@gmail.com")
    }
}