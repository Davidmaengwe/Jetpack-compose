package com.example.phone

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
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
import com.example.phone.ui.theme.PhoneTheme

class MainActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            layout()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun layout(){
    Column(modifier = Modifier.fillMaxSize()){

        val mContext = LocalContext.current
        //TopAppBar
        TopAppBar(
            title = { Text(text = "Home", color = Color.White)},
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Blue),
            navigationIcon = {
                IconButton(onClick = { mContext.startActivity(Intent(mContext, MainActivity::class.java)) },) {
                    Icon(imageVector = Icons.Default.ArrowBack,
                        contentDescription = "Arrowback",
                        tint = Color.White)
                    
                }
            },
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Share,
                        contentDescription = "share",
                        tint = Color.White)

                }

                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Settings,
                        contentDescription = "settings",
                        tint = Color.White)

                }

            }
        )
        //End of TopAppBar
        Spacer(modifier = Modifier.height(30.dp))
        Text(text = "BREEDS OF DOGS",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )

        //Start of Row
        //Row1
        Row {

            Image(
                painter = painterResource(id = R.drawable.car),
                contentDescription = "car",
                modifier = Modifier.size(width = 200.dp, height = 100.dp)

            )
            Spacer(modifier = Modifier.height(20.dp))
            Column {
                Text(text = "Volvo", fontWeight = FontWeight.Bold, fontSize = 18.sp)
                Text(text = "A car is a vehicle that has wheels. However, trucks and buses are larger than cars, and they carry heavier loads.")

            }

        }
        //End of Row1


        //Row2
        Spacer(modifier = Modifier.height(20.dp))
        Row {

            Image(
                painter = painterResource(id = R.drawable.car2),
                contentDescription = "car",
                modifier = Modifier.size(width = 200.dp, height = 100.dp)
            )
            Spacer(modifier = Modifier.height(20.dp))
            Column {
                Text(text = "Volvo", fontWeight = FontWeight.Bold, fontSize = 18.sp)
                Text(text = "A car is a vehicle that has wheels. However, trucks and buses are larger than cars, and they carry heavier loads.")

            }

        }
        //End of Row2

        //Row3
        Spacer(modifier = Modifier.height(20.dp))
        Row {

            Image(
                painter = painterResource(id = R.drawable.car3),
                contentDescription = "car",
                modifier = Modifier.size(width = 200.dp, height = 100.dp)
            )
            Spacer(modifier = Modifier.height(20.dp))
            Column {
                Text(text = "Volvo", fontWeight = FontWeight.Bold, fontSize = 18.sp)
                Text(text = "A car is a vehicle that has wheels. However, trucks and buses are larger than cars, and they carry heavier loads.")

            }

        }
        //End of Row3
        
        //End of Row

        Spacer(modifier = Modifier.height(30.dp))
        Button(
            onClick = { mContext.startActivity(Intent(mContext, IntentActivit::class.java)) },
            shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Color.Blue),
            modifier = Modifier
                .fillMaxWidth()



        ) {
            Text(text = "Next")



        }


    }

}

@Preview(showBackground = true)
@Composable
fun layoutPreview(){
    layout()

}