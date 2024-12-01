package com.vooazdomain.Vooaz.telas.feedbackscreens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import com.example.feedbackscreen.FeedbackScreen
import com.vooazdomain.Vooaz.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FeedbackConfirmScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Feedback", color = Color.White, fontWeight = FontWeight.Bold) },
                navigationIcon = {
                    IconButton(onClick = { /* Handle back action */ }) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "Voltar",
                            tint = Color.White
                        )
                    }
                },
                actions = {
                    IconButton(onClick = { /* Fechar ação */ }) {
                        Icon(
                            painter = painterResource(id = R.drawable.close), // Substitua pelo seu ícone de fechar
                            contentDescription = "Fechar",
                            tint = Color.White
                        )
                    }
                },
                colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = Color(0xFF4059AD))
            )
        },
        content = { paddingValues ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues)
                    .background(Color(0xFFEFEFEF)) // Cor do fundo
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    // Caixa de texto
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color.White, shape = RoundedCornerShape(12.dp))
                            .padding(16.dp),
                    ) {
                        Text(
                            text = "Agradecemos sinceramente pelo seu feedback! Sua opinião é muito importante para nós e nos ajuda a melhorar continuamente nossos serviços. Estamos sempre em busca de maneiras de oferecer a melhor experiência possível.\n\nSe tiver mais sugestões ou comentários, não hesite em entrar em contato!\n\nObrigado mais uma vez!",
                            style = TextStyle(
                                fontSize = 16.sp,
                                textAlign = TextAlign.Center,
                                color = Color.Black,
                                lineHeight = 22.sp
                            )
                        )
                    }

                    Spacer(modifier = Modifier.height(16.dp))

                    // Emoji
                    Text(
                        text = "😊",
                        style = TextStyle(fontSize = 32.sp),
                    )

                    Spacer(modifier = Modifier.height(24.dp))

                    // Botão Voltar
                    Button(
                        onClick = { /* Ação do botão */ },
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF4059AD)),
                        shape = RoundedCornerShape(8.dp),
                        modifier = Modifier.fillMaxWidth(0.5f) // Botão ocupa metade da largura
                    ) {
                        Text(
                            text = "Voltar",
                            color = Color.White,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun FeedbackConfirmPreview() {
    FeedbackScreen()
}
