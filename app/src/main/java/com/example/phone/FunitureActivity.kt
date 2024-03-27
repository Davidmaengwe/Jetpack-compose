package com.example.phone

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
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.phone.ui.theme.MainActivity


class FunitureActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Funiture()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Funiture(){
    Column (
        modifier = Modifier.verticalScroll(rememberScrollState())
    ){

        val mContext = LocalContext.current


        //TopAppBar
        TopAppBar(
            title = { Text(text = "", color = Color.Black) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.White),
            navigationIcon = {
                IconButton(onClick = {
                    mContext.startActivity(
                        Intent(
                            mContext,
                            PayActivity::class.java
                        )
                    )
                },) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "Arrowback",
                        tint = Color.Black
                    )

                }
            },
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.ShoppingCart,
                        contentDescription = "shop",
                        tint = Color.Black
                    )

                }

                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = "menu",
                        tint = Color.Black
                    )

                }

            }
        )
        //End of TopAppBar

        Spacer(modifier = Modifier.height(10.dp))

        Row (modifier = Modifier
            .padding(start = 20.dp)
            .horizontalScroll(rememberScrollState())
        ){
            Text(text = "Featured",
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                fontSize = 30.sp,
                color = Color.Black)

            Spacer(modifier = Modifier
                .height(60.dp)
                .width(30.dp)

            )

            Text(text = "New",
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                fontSize = 30.sp)

            Spacer(modifier = Modifier
                .height(60.dp)
                .width(30.dp)

            )

            Text(text = "Collection",
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                fontSize = 30.sp)

            Spacer(modifier = Modifier
                .height(60.dp)
                .width(30.dp)

            )

        }




        Spacer(modifier = Modifier.height(20.dp))

        // Start of Card
        Card(modifier = Modifier
            .padding(start = 20.dp, end = 20.dp)
            .width(350.dp)
            .height(270.dp),
        ) {
            Column {
                //Image to fill the entire width of the card
                Box(modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp)
                    .width(350.dp)
                    .height(500.dp),
                ){
                    Image(painter = painterResource(id = R.drawable.chair3),
                        contentDescription ="Chair3",
                        modifier = Modifier
                            .fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )

                    //text

                    Text(text = "")


                    //text

                    IconButton(onClick = { mContext.startActivity(Intent(mContext, ChairsActivity::class.java)) }) {
                        Icon(imageVector = Icons.Default.ArrowForward,
                            contentDescription = "ArrowForward",)
                    }





                }





            }



        }

        Spacer(modifier = Modifier.height(30.dp))

        Row {
            Row (modifier = Modifier
                .padding(start = 20.dp)
                .horizontalScroll(rememberScrollState())
            ){
                Text(text = "Best Sellers",
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold)

                Spacer(modifier = Modifier
                    .height(10.dp)
                    .width(190.dp)

                )

                Text(text = "View all",
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center,
                    fontSize = 15.sp)


                Spacer(modifier = Modifier
                    .height(30.dp)
                    .width(10.dp)

                )

            }



        }


        Spacer(modifier = Modifier.height(10.dp))


        Row (
            modifier = Modifier.horizontalScroll(rememberScrollState())
        ){
            //Start of Row1


            // Start of Column1
            Column (modifier = Modifier
                .padding( start = 20.dp)
            ){
                Card(
                    modifier = Modifier
                        .height(130.dp)
                        .width(160.dp)

                ) {
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    )
                    {
                        Image(
                            painter = painterResource(id = R.drawable.chair4),
                            contentDescription = "d",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.FillBounds
                        )

                    }

                }

                Spacer(modifier = Modifier.height(10.dp))


            }
            //End of  Column1



            // Start of Column1
            Column (modifier = Modifier.padding( start = 20.dp)){
                Card(
                    modifier = Modifier
                        .height(130.dp)
                        .width(160.dp)

                ) {
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    )
                    {
                        Image(
                            painter = painterResource(id = R.drawable.chair4),
                            contentDescription = "d",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.FillBounds
                        )

                    }

                }

                Spacer(modifier = Modifier.height(10.dp))


            }
            //End of  Column1





            // Start of Column1
            Column (modifier = Modifier.padding( start = 20.dp)){
                Card(
                    modifier = Modifier
                        .height(130.dp)
                        .width(160.dp)

                ) {
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    )
                    {
                        Image(
                            painter = painterResource(id = R.drawable.chair4),
                            contentDescription = "d",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.FillBounds
                        )

                    }

                }

                Spacer(modifier = Modifier.height(10.dp))


            }
            //End of  Column1




            // Start of Column1
            Column (modifier = Modifier.padding( start = 20.dp)){
                Card(
                    modifier = Modifier
                        .height(130.dp)
                        .width(160.dp)

                ) {
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    )
                    {
                        Image(
                            painter = painterResource(id = R.drawable.chair4),
                            contentDescription = "d",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.FillBounds
                        )

                    }

                }

                Spacer(modifier = Modifier.height(10.dp))


            }
            //End of  Column1




            // Start of Column1
            Column (modifier = Modifier.padding( start = 20.dp)){
                Card(
                    modifier = Modifier
                        .height(130.dp)
                        .width(160.dp)

                ) {
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    )
                    {
                        Image(
                            painter = painterResource(id = R.drawable.chair4),
                            contentDescription = "d",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.FillBounds
                        )

                    }

                }

                Spacer(modifier = Modifier.height(10.dp))


            }
            //End of  Column1






        }

        Spacer(modifier = Modifier.height(20.dp))



        Spacer(modifier = Modifier.height(10.dp))



        Row {
            Row (modifier = Modifier
                .padding(start = 20.dp)
                .horizontalScroll(rememberScrollState())
            ){
                Text(text = "Best Sellers",
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold)

                Spacer(modifier = Modifier
                    .height(10.dp)
                    .width(190.dp)

                )

                Text(text = "View all",
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center,
                    fontSize = 15.sp)


                Spacer(modifier = Modifier
                    .height(30.dp)
                    .width(10.dp)

                )

            }



        }


        Spacer(modifier = Modifier.height(10.dp))


        Row (
            modifier = Modifier.horizontalScroll(rememberScrollState())
        ){
            //Start of Row1


            // Start of Column1
            Column (modifier = Modifier
                .padding( start = 20.dp)
            ){
                Card(
                    modifier = Modifier
                        .height(130.dp)
                        .width(160.dp)

                ) {
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    )
                    {
                        Image(
                            painter = painterResource(id = R.drawable.chair4),
                            contentDescription = "d",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.FillBounds
                        )

                    }

                }

                Spacer(modifier = Modifier.height(10.dp))


            }
            //End of  Column1



            // Start of Column1
            Column (modifier = Modifier.padding( start = 20.dp)){
                Card(
                    modifier = Modifier
                        .height(130.dp)
                        .width(160.dp)

                ) {
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    )
                    {
                        Image(
                            painter = painterResource(id = R.drawable.chair4),
                            contentDescription = "d",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.FillBounds
                        )

                    }

                }

                Spacer(modifier = Modifier.height(10.dp))


            }
            //End of  Column1





            // Start of Column1
            Column (modifier = Modifier.padding( start = 20.dp)){
                Card(
                    modifier = Modifier
                        .height(130.dp)
                        .width(160.dp)

                ) {
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    )
                    {
                        Image(
                            painter = painterResource(id = R.drawable.chair4),
                            contentDescription = "d",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.FillBounds
                        )

                    }

                }

                Spacer(modifier = Modifier.height(10.dp))


            }
            //End of  Column1




            // Start of Column1
            Column (modifier = Modifier.padding( start = 20.dp)){
                Card(
                    modifier = Modifier
                        .height(130.dp)
                        .width(160.dp)

                ) {
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    )
                    {
                        Image(
                            painter = painterResource(id = R.drawable.chair4),
                            contentDescription = "d",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.FillBounds
                        )

                    }

                }

                Spacer(modifier = Modifier.height(10.dp))


            }
            //End of  Column1




            // Start of Column1
            Column (modifier = Modifier.padding( start = 20.dp)){
                Card(
                    modifier = Modifier
                        .height(130.dp)
                        .width(160.dp)

                ) {
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    )
                    {
                        Image(
                            painter = painterResource(id = R.drawable.chair4),
                            contentDescription = "d",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.FillBounds
                        )

                    }

                }

                Spacer(modifier = Modifier.height(10.dp))


            }
            //End of  Column1






        }

        Spacer(modifier = Modifier.height(30.dp))









    }




}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun FuniturePreview() {
    Funiture()

}




