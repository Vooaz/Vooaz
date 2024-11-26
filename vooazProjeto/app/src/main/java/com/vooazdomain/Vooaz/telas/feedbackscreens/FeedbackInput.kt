package com.example.feedbackscreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.vooazdomain.Vooaz.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FeedbackScreen() {
    val topBarColor = Color(0xFF4059AD)
    val buttonColor = Color(0xFF4059AD)
    val bodyBackgroundColor = Color(0xFFD9D9D9)

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Feedback",
                        color = Color.White,
                        style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 20.sp)
                    )
                },
                navigationIcon = {
                    IconButton(onClick = { /* Handle back action */ }) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "Voltar",
                            tint = Color.White
                        )
                    }
                },
                colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = topBarColor)
            )
        },
        containerColor = bodyBackgroundColor
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(horizontal = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Spacer(modifier = Modifier.height(32.dp))
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(180.dp),
                contentAlignment = Alignment.TopCenter
            ) {
                Image(
                    painterResource(R.drawable.logoaz),
                    contentDescription = stringResource(id = R.string.logo_description),
                    modifier = Modifier.size(250.dp),
                )
            }
            Spacer(modifier = Modifier.height(32.dp))

            // Texto de instrução
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(
                        color = Color.White,
                        shape = RoundedCornerShape(16.dp)
                    )
                    .border(
                        width = 4.dp,
                        color = Color(0xFF4059AD),
                        shape = RoundedCornerShape(16.dp)
                    )
                    .padding(16.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Nos conta, como podemos melhorar?",
                    style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp,
                        color = Color(0xFF4059AD),
                        textAlign = TextAlign.Center
                    )
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Caixa de texto para feedback
            var feedbackText by remember { mutableStateOf("") }
            OutlinedTextField(
                value = feedbackText,
                onValueChange = { feedbackText = it },
                placeholder = { Text("Feedback...") },
                modifier = Modifier
                    .border(width = 2.dp, color = Color(0xFF000000), shape = RoundedCornerShape(size = 19.dp))
                .width(370.dp)
                .height(243.dp)
                .background(color = Color(0xFFE4E1E1), shape = RoundedCornerShape(size = 19.dp)),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    containerColor = Color.White,
                    focusedBorderColor = Color.Black,
                    unfocusedBorderColor = Color.Black
                ),

            )

            Spacer(modifier = Modifier.height(24.dp))

            // Botão "Enviar"
            Button(
                onClick = { /* Handle send action */ },
                modifier =Modifier
                    .shadow(elevation = 4.dp, spotColor = Color(0x40000000), ambientColor = Color(0x40000000))
                    .width(223.dp)
                    .height(39.dp)
                    .background(color = Color(0xFF4059AD), shape = RoundedCornerShape(size = 28.dp))
            ) {
                Text(
                    text = "Enviar",
                    color = Color.White,
                    style = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.Bold)
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Botão "Voltar"
            Button(
                onClick = { /* Handle back action */ },
                modifier = Modifier
                    .shadow(elevation = 4.dp, spotColor = Color(0x40000000), ambientColor = Color(0x40000000))
                    .width(143.dp)
                    .height(39.dp)
                    .background(color = Color(0xFF4059AD), shape = RoundedCornerShape(size = 28.dp))
            ) {
                Text(
                    text = "Voltar",
                    color = Color.White,
                    style = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.Bold)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun FeedbackScreenPreview() {
    FeedbackScreen()
}
