package com.example.phone.ui.theme

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.phone.R

class DestinationActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContent {
            Destination()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Destination(){
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
    //Start of Box **(to write words on top of an image)**
    Box(modifier = Modifier
        .fillMaxWidth()
        .height(200.dp),
        contentAlignment = Alignment.Center) {
        Image(
            painter = painterResource(id = R.drawable.car),
            contentDescription = "Car",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.FillBounds
        )

        Text(
            text = "Lets plan your next vacation",
            fontSize = 35.sp,
            fontWeight = FontWeight.ExtraBold,
            color = Color.Black,
            textAlign = TextAlign.Center
        )
    }

//End of Box**

        Spacer(modifier = Modifier.height(30.dp))
        var search by remember {mutableStateOf("") }

        OutlinedTextField(value = search ,
            onValueChange ={search = it},
            placeholder = { Text(text = "What's your destination")},
            leadingIcon = { Icon(imageVector = Icons.Default.Search,
                contentDescription ="Search")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            )
        //End of searcher

        Spacer(modifier = Modifier.height(30.dp))
        Text(text = "Recently Viewed ",
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(start = 20.dp))


        Spacer(modifier = Modifier.height(30.dp))



        Row (modifier = Modifier
            .horizontalScroll(rememberScrollState())
        ){
            // Start of Card
            Card(modifier = Modifier
                .width(200.dp)
                .height(200.dp)
            ) {
                Column {
                    //Image to fill the entire width of the card
                    Box(modifier = Modifier
                        .fillMaxWidth()
                        .height(150.dp),
                        contentAlignment = Alignment.Center
                    ){
                        Image(painter = painterResource(id = R.drawable.car3),
                            contentDescription ="Car3",
                            modifier = Modifier
                                .fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )
                    }

                    Text(text = "Nairobi",
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        fontSize = 20.sp)
                }

            }

            // End of Card


            // Start of Card
            Card(modifier = Modifier
                .width(200.dp)
                .height(200.dp)
            ) {
                Column {
                    //Image to fill the entire width of the card
                    Box(modifier = Modifier
                        .fillMaxWidth()
                        .height(150.dp),
                        contentAlignment = Alignment.Center
                    ){
                        Image(painter = painterResource(id = R.drawable.car2),
                            contentDescription ="Car2",
                            modifier = Modifier
                                .fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )
                    }

                    Text(text = "NewYork",
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        fontSize = 20.sp)
                }

            }

            // End of Card

            // Start of Card
            Card(modifier = Modifier
                .width(200.dp)
                .height(200.dp)
            ) {
                Column {
                    //Image to fill the entire width of the card
                    Box(modifier = Modifier
                        .fillMaxWidth()
                        .height(150.dp),
                        contentAlignment = Alignment.Center
                    ){
                        Image(painter = painterResource(id = R.drawable.car4),
                            contentDescription ="Car4",
                            modifier = Modifier
                                .fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )
                    }

                    Text(text = "Daar-El-Sallam",
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        fontSize = 20.sp)
                }

            }

            // End of Card

            // Start of Card
            Card(modifier = Modifier
                .width(200.dp)
                .height(200.dp)
            ) {
                Column {
                    //Image to fill the entire width of the card
                    Box(modifier = Modifier
                        .fillMaxWidth()
                        .height(150.dp),
                        contentAlignment = Alignment.Center
                    ){
                        Image(painter = painterResource(id = R.drawable.car),
                            contentDescription ="Car",
                            modifier = Modifier
                                .fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )
                    }

                    Text(text = "Kenya",
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        fontSize = 20.sp)
                }

            }

            // End of Card

            // Start of Card
            Card(modifier = Modifier
                .width(200.dp)
                .height(200.dp)
            ) {
                Column {
                    //Image to fill the entire width of the card
                    Box(modifier = Modifier
                        .fillMaxWidth()
                        .height(150.dp),
                        contentAlignment = Alignment.Center
                    ){
                        Image(painter = painterResource(id = R.drawable.car5),
                            contentDescription ="Car5",
                            modifier = Modifier
                                .fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )
                    }

                    Text(text = "UK",
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        fontSize = 20.sp)
                }

            }

            // End of Card
        }



















    }
}

@Preview(showBackground = true)
@Composable
fun DestinationPreview(){
    Destination()
    }