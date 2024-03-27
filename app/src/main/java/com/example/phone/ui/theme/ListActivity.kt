package com.example.phone.ui.theme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.phone.R

class WoofActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            List()
        }
    }
}

@Composable
fun List(){
    Column  (modifier = Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState()
    )
    ){
         //heading
        Box (contentAlignment = Alignment.Center,
            modifier = Modifier.fillMaxWidth()){
            Row {

                Image(
                    painter = painterResource(id = R.drawable.register),
                    contentDescription = "woof",
                    modifier = Modifier.size(60.dp))

                Text(
                    text = "Woof",
                    fontSize = 50.sp,
                    fontWeight = FontWeight.ExtraBold,
                    textAlign = TextAlign.Center
                )

            }
        }
        //end of heading

        //CARD1
        Box (contentAlignment = Alignment.Center,
            modifier = Modifier.fillMaxWidth()){
            Row {

                Card (modifier = Modifier.fillMaxWidth()){
                    Row {
                        Image(
                            painter = painterResource(id = R.drawable.car),
                            contentDescription = "register",
                            modifier = Modifier
                                .size(60.dp)
                                .clip(shape = CircleShape),
                            contentScale = ContentScale.Crop
                        )
                        Spacer(modifier = Modifier.width(15.dp))

                        Column {
                            Text(
                                text = "Koda",
                                fontSize = 25.sp,
                                fontWeight = FontWeight.ExtraBold,
                                textAlign = TextAlign.Center
                            )
                            Text(
                                text = "2 years old",
                                fontSize = 20.sp,
                                textAlign = TextAlign.Center
                            )
                        }
                    }
                }

            }
        }
        //END OF CARD1
        Spacer(modifier = Modifier.height(20.dp))


        //CARD1
        Box (contentAlignment = Alignment.Center,
            modifier = Modifier.fillMaxWidth()){
            Row {

                Card (modifier = Modifier.fillMaxWidth()){
                    Row {
                        Image(
                            painter = painterResource(id = R.drawable.car5),
                            contentDescription = "register",
                            modifier = Modifier
                                .size(60.dp)
                                .clip(shape = CircleShape),
                            contentScale = ContentScale.Crop
                        )
                        Spacer(modifier = Modifier.width(15.dp))

                        Column {
                            Text(
                                text = "Lola",
                                fontSize = 25.sp,
                                fontWeight = FontWeight.ExtraBold,
                                textAlign = TextAlign.Center
                            )
                            Text(
                                text = "2 years old",
                                fontSize = 20.sp,
                                textAlign = TextAlign.Center
                            )
                        }
                    }
                }

            }
        }
        //END OF CARD1
        Spacer(modifier = Modifier.height(20.dp))


        //CARD1
        Box (contentAlignment = Alignment.Center,
            modifier = Modifier.fillMaxWidth()){
            Row {

                Card (modifier = Modifier.fillMaxWidth()){
                    Row {
                        Image(
                            painter = painterResource(id = R.drawable.car4),
                            contentDescription = "register",
                            modifier = Modifier
                                .size(60.dp)
                                .clip(shape = CircleShape),
                            contentScale = ContentScale.Crop
                        )
                        Spacer(modifier = Modifier.width(15.dp))

                        Column {
                            Text(
                                text = "Frankie",
                                fontSize = 25.sp,
                                fontWeight = FontWeight.ExtraBold,
                                textAlign = TextAlign.Center
                            )
                            Text(
                                text = "2 years old",
                                fontSize = 20.sp,
                                textAlign = TextAlign.Center
                            )
                        }
                    }
                }

            }
        }
        //END OF CARD1
        Spacer(modifier = Modifier.height(20.dp))


        //CARD1
        Box (contentAlignment = Alignment.Center,
            modifier = Modifier.fillMaxWidth()){
            Row {

                Card (modifier = Modifier.fillMaxWidth()){
                    Row {
                        Image(
                            painter = painterResource(id = R.drawable.car2),
                            contentDescription = "register",
                            modifier = Modifier
                                .size(60.dp)
                                .clip(shape = CircleShape),
                            contentScale = ContentScale.Crop
                        )
                        Spacer(modifier = Modifier.width(15.dp))

                        Column {
                            Text(
                                text = "Nox",
                                fontSize = 25.sp,
                                fontWeight = FontWeight.ExtraBold,
                                textAlign = TextAlign.Center
                            )
                            Text(
                                text = "2 years old",
                                fontSize = 20.sp,
                                textAlign = TextAlign.Center
                            )
                        }
                    }
                }

            }
        }
        //END OF CARD1
        Spacer(modifier = Modifier.height(20.dp))


        //CARD1
        Box (contentAlignment = Alignment.Center,
            modifier = Modifier.fillMaxWidth()){
            Row {

                Card (modifier = Modifier.fillMaxWidth()){
                    Row {
                        Image(
                            painter = painterResource(id = R.drawable.d),
                            contentDescription = "register",
                            modifier = Modifier
                                .size(60.dp)
                                .clip(shape = CircleShape),
                            contentScale = ContentScale.Crop
                        )
                        Spacer(modifier = Modifier.width(15.dp))

                        Column {
                            Text(
                                text = "Faye",
                                fontSize = 25.sp,
                                fontWeight = FontWeight.ExtraBold,
                                textAlign = TextAlign.Center
                            )
                            Text(
                                text = "2 years old",
                                fontSize = 20.sp,
                                textAlign = TextAlign.Center
                            )
                        }
                    }
                }

            }
        }
        //END OF CARD1
        Spacer(modifier = Modifier.height(20.dp))


        //CARD1
        Box (contentAlignment = Alignment.Center,
            modifier = Modifier.fillMaxWidth()){
            Row {

                Card (modifier = Modifier.fillMaxWidth()){
                    Row {
                        Image(
                            painter = painterResource(id = R.drawable.car4),
                            contentDescription = "register",
                            modifier = Modifier
                                .size(60.dp)
                                .clip(shape = CircleShape),
                            contentScale = ContentScale.Crop
                        )
                        Spacer(modifier = Modifier.width(15.dp))

                        Column {
                            Text(
                                text = "Bella",
                                fontSize = 25.sp,
                                fontWeight = FontWeight.ExtraBold,
                                textAlign = TextAlign.Center
                            )
                            Text(
                                text = "2 years old",
                                fontSize = 20.sp,
                                textAlign = TextAlign.Center
                            )
                        }
                    }
                }

            }
        }
        //END OF CARD1
        Spacer(modifier = Modifier.height(20.dp))


        //CARD1
        Box (contentAlignment = Alignment.Center,
            modifier = Modifier.fillMaxWidth()){
            Row {

                Card (modifier = Modifier.fillMaxWidth()){
                    Row {
                        Image(
                            painter = painterResource(id = R.drawable.car3
                            ),
                            contentDescription = "register",
                            modifier = Modifier
                                .size(60.dp)
                                .clip(shape = CircleShape),
                            contentScale = ContentScale.Crop
                        )
                        Spacer(modifier = Modifier.width(15.dp))

                        Column {
                            Text(
                                text = "Moana",
                                fontSize = 25.sp,
                                fontWeight = FontWeight.ExtraBold,
                                textAlign = TextAlign.Center
                            )
                            Text(
                                text = "2 years old",
                                fontSize = 20.sp,
                                textAlign = TextAlign.Center
                            )
                        }
                    }
                }

            }
        }
        //END OF CARD1
        Spacer(modifier = Modifier.height(20.dp))


        //CARD1
        Box (contentAlignment = Alignment.Center,
            modifier = Modifier.fillMaxWidth()){
            Row {

                Card (modifier = Modifier.fillMaxWidth()){
                    Row {
                        Image(
                            painter = painterResource(id = R.drawable.car3),
                            contentDescription = "register",
                            modifier = Modifier
                                .size(60.dp)
                                .clip(shape = CircleShape),
                            contentScale = ContentScale.Crop
                        )
                        Spacer(modifier = Modifier.width(15.dp))

                        Column {
                            Text(
                                text = "Tzeitel",
                                fontSize = 25.sp,
                                fontWeight = FontWeight.ExtraBold,
                                textAlign = TextAlign.Center
                            )
                            Text(
                                text = "2 years old",
                                fontSize = 20.sp,
                                textAlign = TextAlign.Center
                            )
                        }
                    }
                }

            }
        }
        //END OF CARD1
        Spacer(modifier = Modifier.height(20.dp))


        //CARD1
        Box (contentAlignment = Alignment.Center,
            modifier = Modifier.fillMaxWidth()){
            Row {

                Card (modifier = Modifier.fillMaxWidth()){
                    Row {
                        Image(
                            painter = painterResource(id = R.drawable.car3),
                            contentDescription = "register",
                            modifier = Modifier
                                .size(60.dp)
                                .clip(shape = CircleShape),
                            contentScale = ContentScale.Crop
                        )
                        Spacer(modifier = Modifier.width(15.dp))

                        Column {
                            Text(
                                text = "Koda",
                                fontSize = 25.sp,
                                fontWeight = FontWeight.ExtraBold,
                                textAlign = TextAlign.Center
                            )
                            Text(
                                text = "2 years old",
                                fontSize = 20.sp,
                                textAlign = TextAlign.Center
                            )
                        }
                    }
                }

            }
        }
        //END OF CARD1
        Spacer(modifier = Modifier.height(20.dp))







    }

}

@Preview(showBackground = true)
@Composable
fun ListPreview(){
    List()

}