package com.example.phone

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import com.example.phone.ui.theme.PhoneTheme
import com.example.phone.ui.theme.Pink80

class productActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Product()
        }
    }
}

@Composable
fun Product(){
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center){
        val mContext = LocalContext.current

        Image(painter = painterResource(id = R.drawable.product1),
            contentDescription = "car",
            modifier = Modifier
                .size(350.dp)
                .clip(shape = CircleShape),
            contentScale = ContentScale.Crop
        )


        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "Plan Your Next Trip",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
        )
        Spacer(modifier = Modifier.height(8.dp))

        Text(text = "In publishing and graphic design, Lorem ipsum is a " +
                "placeholder demonstrate the visual form of a" +
                " document or a typeface  without relying on meaningful content." +
                "Lorem ipsum may be used as a placeholder before ",
            fontSize = 15.sp,
            textAlign = TextAlign.Center,
        )

        Spacer(modifier = Modifier.height(100.dp))

        Button(
            onClick = { mContext.startActivity(Intent(mContext, CartActivity::class.java)) },
            shape = RoundedCornerShape(20.dp),
            colors = ButtonDefaults.buttonColors(Pink80),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp)



        ) {
            Text(text = "Next")
        }

    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ProductPreview(){
    Product()
}