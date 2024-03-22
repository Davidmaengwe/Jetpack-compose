package com.example.phone

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.shapes.Shape
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.phone.ui.theme.PhoneTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            demo()
        }
    }
}


@Composable
fun demo(){
Column (modifier = Modifier.fillMaxSize()){

    val mContext = LocalContext.current
    Text(
        text="Welcome to Android",
        color = androidx.compose.ui.graphics.Color.Red,
        fontSize = 30.sp,
        fontStyle = FontStyle.Italic,
        fontWeight = FontWeight.Bold,
    )

    Text(text = "The widespread use of speech-based  on the impacts of speech-based texting on driving performance")
    Button(
        onClick = { /*TODO*/ },
        shape = RoundedCornerShape(20.dp),
        colors = ButtonDefaults.buttonColors(androidx.compose.ui.graphics.Color.Magenta),
        modifier = Modifier.align(Alignment.CenterHorizontally)



    ) {
        Text(text = "See More")

    }

    Text(text = "Types of Cars",
        fontSize = 30.sp,
        modifier = Modifier
            .fillMaxWidth()
            .background(androidx.compose.ui.graphics.Color.Black)
            .height(40.dp),
        fontStyle = FontStyle.Italic,
        textDecoration = TextDecoration.Underline,
        color = androidx.compose.ui.graphics.Color.Blue,
        textAlign = TextAlign.Center,)
    Text(text = "1.BMW")
    Text(text = "2.Mercedies Benz")
    Text(text = "3.Ferrari")
    Text(text = "4.Bugatti")

    Text(text = "Courses Offered",
        fontSize = 30.sp,
        modifier = Modifier
            .fillMaxWidth()
            .background(androidx.compose.ui.graphics.Color.Black)
            .height(40.dp),
        fontStyle = FontStyle.Italic,
        textDecoration = TextDecoration.Underline,
        color = androidx.compose.ui.graphics.Color.Blue,
        textAlign = TextAlign.Center,)
    Text(text = "1.MIT")
    Text(text = "2.CYBER SECURITY")
    Text(text = "3.DATA SCIENCE")

    Spacer(modifier = Modifier.height(30.dp))



    Text(text = "Meaning of Erānous",
        fontSize = 30.sp,
        modifier = Modifier
            .fillMaxWidth()
            .background(androidx.compose.ui.graphics.Color.Blue)
            .height(40.dp),
        color = androidx.compose.ui.graphics.Color.Green,
        textAlign = TextAlign.Center,)
    Text(text = "Erānous is a term derived from ancient Persian, specifically  held in ancient Persia as a symbol of community and solidarity. These gatherings were significant social events where people would come together to share food, stories, and camaraderie. The term \"erānous\" reflects the cultural importance placed on hospitality and communal bonds in ancient Persian society." )

    Spacer(modifier = Modifier.height(20.dp))

    Divider()
    Spacer(modifier = Modifier.height(20.dp))
    Text(text = "eMobilis Mobile Training Institute",
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold,
        modifier = Modifier
    )

Box(modifier = Modifier.fillMaxWidth(),
    contentAlignment = Alignment.Center) {
    Image(painter = painterResource(id = R.drawable.car),
        contentDescription = "car",
        modifier = Modifier
            .size(200.dp)
            .clip(shape = CircleShape),
        contentScale = ContentScale.Crop
    )




}

     Button(
        onClick = { mContext.startActivity(Intent(mContext, MainActivity2::class.java)) },
        shape = RoundedCornerShape(5.dp),
        colors = ButtonDefaults.buttonColors(androidx.compose.ui.graphics.Color.Green),
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 30.dp, end = 30.dp)


        ) {
        Text(text = "Continue")

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

@Preview(showBackground = true)
@Composable
fun DemoPreview(){
    demo()

}