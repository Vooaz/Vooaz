import androidx.compose.ui.res.painterResource
import com.vooazdomain.Vooaz.R
import com.vooazdomain.Vooaz.modelsData.datas.TourismGuide

object GuidesContants {
    val guidesObj = listOf(
        TourismGuide(
            tourismGuideId = 1,
            name = "Ana Ferreira",
            specialty = "História e cultura local",
            country = "Brasil",
            state = "Bahia",
            city = "Salvador",
            neighborhood = "Pelourinho",
            languages = listOf("Português", "Inglês"),
            rating = 4.8,
            email = "ana.ferreira@example.com",
            contact = "+55 71 98765-4321",
            type = "Histórico/Cultural",
            disabilitySpecialty = "Acessibilidade para cadeirantes",
            gender = "Feminino",
            feedbackCount = 154,
            age = 32,
            imageRes = R.drawable.anaferreira,
            AboutGuide = "Ana Ferreira é uma apaixonada pela história e pela rica cultura afro-brasileira. Com mais de 10 anos de experiência como guia, Ana conduz visitantes pelo icônico bairro do Pelourinho, em Salvador. Ela se especializa em compartilhar as tradições, músicas, danças e a influência africana que formam a base da cultura baiana. Sua experiência como guia vai além do conhecimento superficial, ela explora histórias e curiosidades que revelam as conexões entre passado e presente, criando uma experiência enriquecedora para todos os visitantes. Ana também é dedicada à acessibilidade, oferecendo um atendimento inclusivo para pessoas com mobilidade reduzida.",
            flagCountry = R.drawable.ico_flag_brasil
        ),
        TourismGuide(
            tourismGuideId = 2,
            name = "Carlos Mendes",
            specialty = "Ecoturismo",
            country = "Brasil",
            state = "Amazonas",
            city = "Manaus",
            neighborhood = "Centro",
            languages = listOf("Português", "Espanhol"),
            rating = 4.7,
            email = "carlos.mendes@example.com",
            contact = "+55 92 91234-5678",
            type = "Aventura",
            disabilitySpecialty = "Audiodescrição para deficientes visuais",
            gender = "Masculino",
            feedbackCount = 98,
            age = 29,
            imageRes = R.drawable.carlosmendes,
            AboutGuide = "Carlos Mendes é um experiente guia de ecoturismo especializado em trilhas na floresta amazônica. Com um vasto conhecimento da fauna e flora da região, ele oferece aos turistas uma experiência única de imersão na natureza selvagem. Ele combina a aventura e o aprendizado sobre a biodiversidade da Amazônia, proporcionando aos participantes a chance de observar a fauna local, conhecer a vegetação exuberante e aprender sobre a importância de conservar o ambiente. Além disso, Carlos é fluente em espanhol e português, o que torna seus tours acessíveis a visitantes de diversas nacionalidades.",
            flagCountry = R.drawable.ico_flag_brasil
        ),
        TourismGuide(
            tourismGuideId = 3,
            name = "Sophia Nakamura",
            specialty = "Arte e museus",
            country = "Japão",
            state = "Tóquio",
            city = "Tóquio",
            neighborhood = "Shibuya",
            languages = listOf("Japonês", "Inglês"),
            rating = 4.9,
            email = "sophia.nakamura@example.com",
            contact = "+81 90 1234-5678",
            type = "Cultural",
            disabilitySpecialty = "Guia para surdos com linguagem de sinais",
            gender = "Feminino",
            feedbackCount = 200,
            age = 40,
            imageRes = R.drawable.sophianakamura,
            AboutGuide = "Sophia Nakamura é uma especialista em arte contemporânea e cultura japonesa. Com uma paixão por museus e exposições, ela oferece uma visão única sobre as obras de arte mais emblemáticas de Tóquio. Sophia guia seus visitantes por museus renomados da cidade, incluindo o Museu Nacional de Arte Moderna, e os ensina sobre o impacto cultural da arte japonesa no cenário global. Além disso, Sophia também é uma defensora da inclusão, proporcionando acessibilidade para surdos com tradução em linguagem de sinais. Sua abordagem calorosa e informativa transforma cada visita em uma verdadeira experiência educacional.",
            flagCountry = R.drawable.ico_flag_japao
        ),
        TourismGuide(
            tourismGuideId = 4,
            name = "Miguel Rodríguez",
            specialty = "Gastronomia local",
            country = "México",
            state = "Cidade do México",
            city = "Cidade do México",
            neighborhood = "Coyoacán",
            languages = listOf("Espanhol", "Inglês"),
            rating = 4.6,
            email = "miguel.rodriguez@example.com",
            contact = "+52 55 9876-5432",
            type = "Gastronômico",
            disabilitySpecialty = "Dietas especiais (intolerância e alergias)",
            gender = "Masculino",
            feedbackCount = 125,
            age = 35,
            imageRes = R.drawable.miguelrodriguez,
            AboutGuide = "Miguel Rodríguez é um entusiasta da gastronomia mexicana e guia especializado em tours culinários pela Cidade do México. Com uma profunda paixão por sabores autênticos, ele leva os turistas a explorar mercados locais, pequenas cantinas e restaurantes tradicionais, onde é possível saborear pratos típicos e conhecer histórias fascinantes sobre a culinária mexicana. Miguel também é altamente capacitado para atender visitantes com necessidades alimentares especiais, como dietas para intolerâncias alimentares ou alergias, oferecendo uma experiência gastronômica adaptada para todos os gostos.",
            flagCountry = R.drawable.ico_flag_mexico
        ),
        TourismGuide(
            tourismGuideId = 5,
            name = "Laila El-Sayed",
            specialty = "História antiga e arqueologia",
            country = "Egito",
            state = "Gizé",
            city = "Gizé",
            neighborhood = "Pirâmides",
            languages = listOf("Árabe", "Inglês", "Francês"),
            rating = 4.8,
            email = "laila.elsayed@example.com",
            contact = "+20 102 345-6789",
            type = "Histórico",
            disabilitySpecialty = "Guias em Braille",
            gender = "Feminino",
            feedbackCount = 180,
            age = 38,
            imageRes = R.drawable.lailaelsayed,
            AboutGuide = "Laila El-Sayed é uma expert em arqueologia egípcia, especializada nas antigas pirâmides e na história dos faraós. Ela oferece tours aprofundados que exploram as maravilhas das pirâmides de Gizé e o Grande Esfinge, proporcionando aos visitantes uma compreensão detalhada da vida e das crenças das antigas civilizações egípcias. Laila é também fluente em vários idiomas, incluindo árabe, inglês e francês, o que a torna acessível a turistas de diferentes partes do mundo. Para turistas com deficiência visual, Laila oferece guias em Braille, garantindo que todos possam se beneficiar de sua vasta experiência.",
            flagCountry = R.drawable.ico_flag_suecia
        ),
        TourismGuide(
            tourismGuideId = 6,
            name = "Leonard Johansson",
            specialty = "Tours arquitetônicos",
            country = "Suécia",
            state = "Estocolmo",
            city = "Estocolmo",
            neighborhood = "Gamla Stan",
            languages = listOf("Sueco", "Inglês", "Alemão"),
            rating = 4.7,
            email = "leonard.johansson@example.com",
            contact = "+46 70 123-4567",
            type = "Cultural",
            disabilitySpecialty = "Acessibilidade para deficientes motores",
            gender = "Masculino",
            feedbackCount = 140,
            age = 45,
            imageRes = R.drawable.leonardjohansson,
            AboutGuide = "Leonard Johansson é um guia especializado em tours arquitetônicos por Estocolmo. Com uma formação sólida em história da arquitetura, Leonard compartilha o fascínio pela arquitetura medieval e moderna da cidade, guiando turistas pelas ruas de Gamla Stan (Cidade Velha) e outros marcos arquitetônicos importantes. Seus tours são interativos e informativos, permitindo que os participantes compreendam como a arquitetura sueca evoluiu ao longo dos séculos. Leonard é altamente qualificado para atender pessoas com deficiências motoras, proporcionando uma experiência acessível e memorável para todos.",
            flagCountry = R.drawable.ico_flag_estadosunidos
        )
    )
}
