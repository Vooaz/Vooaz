package com.vooazdomain.Vooaz.telas.profile

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

import com.vooazdomain.Vooaz.R

@Composable
fun ProfileScreen(navController: NavHostController) {
    val backgroundColor = Color(0xFF4059AD) // Amarelo para o fundo do cabeçalho
    val profileImagePlaceholder =
        painterResource(R.drawable.examplepeopleprofile) // Ícone substituível
    val flagIcon = painterResource(R.drawable.ic_flag_brazil) // Bandeira substituível
    val whatsappIcon = painterResource(R.drawable.ic_whatsapp) // Ícone WhatsApp substituível
    val instagramIcon = painterResource(R.drawable.instagram) // Ícone Instagram substituível
    val facebookIcon = painterResource(R.drawable.facebook) // Ícone Facebook substituível
    val containerColor = Color(0xFFF5F5F5) // Fundo da tela (cinza claro)
    Scaffold(
        topBar = {
            Row(modifier = Modifier.background(containerColor).padding(top=20.dp)) {


                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = "Voltar",
                    modifier = Modifier.size(60.dp).padding(start = 20.dp, top= 15.dp).clickable {
                        navController.popBackStack()
                    },
                    tint = Color.Black
                )


                Box(
                    modifier = Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.Center
                ) {
                    Box(modifier = Modifier.padding(end = 60.dp)) {
                        Image(
                            painter = painterResource(id = R.drawable.logoaz),
                            contentDescription = "image description",
                            contentScale = ContentScale.FillBounds,
                            modifier = Modifier
                                .width(75.dp)
                                .height(73.dp)
                        )
                    }
                }

            }
        },
        content =  { padding ->
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(padding)
            ) {
                // Cabeçalho
                item {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(170.dp)
                            .background(backgroundColor,shape = RoundedCornerShape(
                                topStart = 16.dp,
                                topEnd = 16.dp,
                                bottomStart = 0.dp,
                                bottomEnd = 0.dp
                            ))
                            .padding(15.dp),

                        ) {
                        Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center) {
                            // Imagem de perfil
                            Image(
                                painter = profileImagePlaceholder,
                                contentDescription = "image description",
                                contentScale = ContentScale.FillBounds,
                                modifier = Modifier
                                    .width(128.dp)
                                    .height(120.dp)
                                    .border(
                                        width = 2.dp,
                                        color = Color(0xFF4059AD),
                                        shape = RoundedCornerShape(size = 158.dp)
                                    )
                            )

                            Spacer(modifier = Modifier.width(16.dp))

                            // Informações do usuário
                            Column(modifier = Modifier.width(210.dp)) {
                                Row() {
                                    Text(
                                        text = "Fabio Nascimento",
                                        style = TextStyle(
                                            fontSize = 20.sp,
                                            fontWeight = FontWeight.Bold,
                                            color = Color.White
                                        )
                                    )
                                    Spacer(modifier = Modifier.width(4.dp))
                                    Image(painterResource(R.drawable.walking_stick_white
                                    ), contentDescription = "walkingstick" ,modifier =Modifier.size(30.dp))
                                }
                                Row(verticalAlignment = Alignment.CenterVertically) {
                                    Image(
                                        painter = flagIcon,
                                        contentDescription = "Localização",
                                        modifier = Modifier.size(30.dp)
                                    )
                                    Spacer(modifier = Modifier.width(8.dp))
                                    Text(
                                        text = "São Paulo, Brasil",
                                        style = TextStyle(fontSize = 14.sp, color = Color.White)
                                    )
                                }
                                Spacer(modifier = Modifier.height(2.dp))
                                Button(
                                    onClick = { /* Ação conectar */ },
                                    colors = ButtonDefaults.buttonColors(
                                        containerColor = Color(
                                            0xFFF4B942
                                        )
                                    ),
                                    modifier = Modifier.padding(start = 20.dp)
                                ) {
                                    Text(text = "Conexões", color = Color.White)
                                }
                            }

                            Spacer(modifier = Modifier.weight(1f))

                            // Botão conectar

                        }
                    }
                }

                // Seção "Sobre Fabio"
                item {

                    Column(
                        modifier = Modifier
                            .width(411.dp)
                            .height(453.dp)
                            .background(
                                color = Color(0xFFEFF2F1),
                                shape = RoundedCornerShape(size = 3.dp)
                            ),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = "Sobre mim:",
                            style = TextStyle(
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.Black
                            )
                        )
                        Spacer(modifier = Modifier.height(28.dp))
                        Text(
                            text = "Olá! Sou Laís Ribeiro, tenho 20 anos e moro em São Paulo. Sou uma pessoa apaixonada por natureza e amo explorar os parques da cidade. Gosto de sentir a energia dos lugares e as diferentes texturas e sons ao meu redor – é uma experiência única! Além disso, sou curiosa e estou sempre buscando novas formas de aproveitar a cidade. Acredito que cada passeio é uma oportunidade de me conectar mais com o mundo e com as pessoas ao meu redor.",
                            style = TextStyle(
                                fontSize = 19.sp,
                                lineHeight = 18.36.sp,
                                fontWeight = FontWeight(400),
                                color = Color(0xFF000000),
                                textAlign = TextAlign.Justify,

                                ),
                            modifier = Modifier
                                .width(270.dp)
                                .height(351.dp)
                        )
                    }
                }

                // Ícones de contato
                item {

                    Box(modifier = Modifier.fillMaxSize().background(backgroundColor)) {
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Text(

                                text = "Entre em contato",
                                style = TextStyle(
                                    fontSize = 21.sp,
                                    lineHeight = 17.28.sp,
                                    fontWeight = FontWeight(700),
                                    color = Color(0xFFFFFFFF),
                                    textAlign = TextAlign.Justify,
                                )
                            )
                            Row(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .padding(horizontal = 32.dp),
                                horizontalArrangement = Arrangement.Center
                            ) {
                                IconButton(onClick = { /* Ação WhatsApp */ }) {
                                    Icon(
                                        painter = whatsappIcon,
                                        contentDescription = "WhatsApp",
                                        modifier = Modifier.size(30.dp),
                                        tint = Color.Unspecified
                                    )
                                }
                                Spacer(modifier = Modifier.width(16.dp))
                                IconButton(onClick = { /* Ação Instagram */ }) {
                                    Icon(
                                        painter = instagramIcon,
                                        contentDescription = "Instagram",
                                        modifier = Modifier.size(55.dp),
                                        tint = Color.Unspecified
                                    )
                                }
                                Spacer(modifier = Modifier.width(16.dp))

                                IconButton(onClick = { /* Ação Facebook */ }) {
                                    Icon(
                                        painter = facebookIcon,
                                        contentDescription = "Facebook",
                                        modifier = Modifier.size(30.dp),
                                        tint = Color.Unspecified
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }

    )
}

@Composable
@Preview
fun ProfileScreenPreview() {
    ProfileScreen(rememberNavController())
}