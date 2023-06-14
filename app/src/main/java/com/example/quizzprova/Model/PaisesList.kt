package com.example.quizzprova.Model

import com.example.quizzprova.R

object PaisesList {
    val paises = listOf(
        Pais(
            id = 1,
            nome = "Argentina",
            imageId = R.drawable.argentina,
            respostas = listOf("Brasil", "Alemanha", "Hungria", "Argentina"),
            continente = "América do Sul",
            informacoes = "É um país com uma área extensa que abrange montanhas dos Andes, lagos glaciais e pradarias nos Pampas, ocupadas tradicionalmente por seu famoso gado.",
            imageComida = R.drawable.carg,
            descComida = "Asado: é um estilo de preparação de carne na grelha que é muito popular na Argentina"
        ),
        Pais(
            id = 2,
            nome = "Brasil",
            imageId = R.drawable.brasil,
            respostas = listOf("Brasil", "Estados Unidos", "Japão", "Argentina"),
            continente = "América do Sul",
            informacoes = "O Brasil, um vasto país sul-americano, estende-se da Bacia Amazônica, no norte, até os vinhedos e as gigantescas Cataratas do Iguaçu, no sul.",
            imageComida = R.drawable.cbra,
            descComida = "Feijoada: é um ensopado de feijão preto com uma variedade de carnes."
        ),
        Pais(
            id = 3,
            nome = "Alemanha",
            imageId = R.drawable.alemanha,
            respostas = listOf("Argentina", "Alemanha", "Nigeria", "Kuwait"),
            continente = "Europa",
            informacoes = "É um país situado na Europa Ocidental com uma paisagem de florestas, rios, cordilheiras e praias do Mar do Norte. A nação tem mais de 2 milênios de história.",
            imageComida = R.drawable.cale,
            descComida = "Bratwurst: É uma salsicha grelhada feita com carne de porco, bovina ou vitela."
        ),
        Pais(
            id = 4,
            nome = "Kuwait",
            imageId = R.drawable.kuwait,
            respostas = listOf("Suecia", "Australia", "Romenia", "Kuwait"),
            continente = "Ásia",
            informacoes = "É um país árabe no Golfo Pérsico, tem uma herança cultural que remonta à antiguidade.",
            imageComida = R.drawable.ckuw,
            descComida = "Machbous: É um arroz temperado e cozido com carne, geralmente cordeiro ou frango. "
        ),
        Pais(
            id = 5,
            nome = "Romenia",
            imageId = R.drawable.romenia,
            respostas = listOf("Estados Unidos", "Kuwait", "Romenia", "Nigeria"),
            continente = "Europa",
            informacoes = "É um país do sudeste europeu conhecido pela região florestal da Transilvânia, cercada pelos Cárpatos.",
            imageComida = R.drawable.crom,
            descComida = "Sarmale: É feito com folhas de repolho ou uva recheadas com uma mistura de carne moída arroz, cebola e temperos"
        ),
        Pais(
            id = 6,
            nome = "Estados Unidos",
            imageId = R.drawable.eua,
            respostas = listOf("Estados Unidos", "Romenia", "Kuwait", "Reino Unido"),
            continente = "América do Norte",
            informacoes = "É um país com 50 estados que cobrem uma vasta faixa da América do Norte, com o Alasca ao noroeste e o Havaí no Oceano Pacífico, estendendo a presença do país.",
            imageComida = R.drawable.ceua,
            descComida = "Buffalo Wings: são asinhas de frango fritas e cobertas com um molho picante à base de pimenta de caiena e manteiga."
        ),
        Pais(
            id = 7,
            nome = "Nigeria",
            imageId = R.drawable.nigeria,
            respostas = listOf("Brasil", "Nigeria", "Kuwait", "Japão"),
            continente = "África",
            informacoes = "É um país africano que fica no Golfo da Guiné, tem muitos monumentos naturais e reservas de animais selvagens. ",
            imageComida = R.drawable.cnig,
            descComida = "Jollof Rice: É um arroz cozido em um molho de tomate rico em temperos, como cebola, pimentão, alho e uma mistura de especiarias. "
        ),
        Pais(
            id = 8,
            nome = "Colombia",
            imageId = R.drawable.colombia,
            respostas = listOf("Colombia", "Ilha de Man", "Venezuela", "Romenia"),
            continente = "América do Sul",
            informacoes = "É um país no extremo norte da América do Sul. Sua paisagem é marcada por florestas tropicais, pela Cordilheira dos Andes e por várias plantações de café.",
            imageComida = R.drawable.ccol,
            descComida = "Bandeja Paisa: Consiste em uma grande variedade de ingredientes, incluindo arroz, feijão, carne moída, chicharrón (torresmo), linguiça, ovo frito, etc..."
        ),
        Pais(
            id = 9,
            nome = "Ilha de Man",
            imageId = R.drawable.ilhademan,
            respostas = listOf("Ilha de Man", "Uruguai", "Argentina", "Frisia"),
            continente = "Europa",
            informacoes = "É uma dependência autónoma da coroa britânica no mar da Irlanda, entre Inglaterra e a Irlanda.",
            imageComida = R.drawable.cilm,
            descComida = "Manx Kippers: Os Kippers são peixes defumados, geralmente arenque, que são uma iguaria popular na Ilha de Man"
        ),
        Pais(
            id = 10,
            nome = "Frisia",
            imageId = R.drawable.frisia,
            respostas = listOf("Quigustao", "Reino Unido", "Venezuela", "Frisia"),
            continente = "Europa",
            informacoes = "É uma província ao norte dos Países Baixos. Localização da Frísia nos Países Baixos.",
            imageComida = R.drawable.cfri,
            descComida = "Sûkerbôle: É um pão doce de centeio típico da Frísia. É feito com farinha de centeio, melaço, especiarias como erva-doce e canela, e geralmente tem uma cor escura. "
        ),
        Pais(
            id = 11,
            nome = "Jamaica",
            imageId = R.drawable.jamaica,
            respostas = listOf("Jamaica", "Ilha de Man", "Romenia", "Australia"),
            continente = "América do Norte",
            informacoes = "A Jamaica é um país insular no Caribe com uma topografia exuberante de montanhas, florestas tropicais e praias com recifes.",
            imageComida = R.drawable.cjam,
            descComida = "Jerk Chicken: É um prato icônico da Jamaica, consistindo de frango marinado em uma mistura de especiarias chamada \"jerk\""
        ),
        Pais(
            id = 12,
            nome = "Martinica",
            imageId = R.drawable.martinica,
            respostas = listOf("Brasil", "Quiguistao", "Martinica", "Venezuela"),
            continente = "América do Norte",
            informacoes = "A Martinica é uma ilha de relevo acidentado que faz parte das Pequenas Antilhas, no Caribe.",
            imageComida = R.drawable.cmar,
            descComida = "São bolinhos fritos feitos com massa de peixe (geralmente bacalhau), temperada com ervas, cebola e pimentão."
        ),
        Pais(
            id = 13,
            nome = "Quirguistão",
            imageId = R.drawable.quiguistao,
            respostas = listOf("Ilha de Man", "Frisia", "Quirguistão", "Uruguai"),
            continente = "Ásia",
            informacoes = "O Quirguistão é um país da Ásia Central ao longo da Rota da Seda, antigo trajeto comercial entre a China e o Mediterrâneo.",
            imageComida = R.drawable.cqui,
            descComida = "Beshbarmak: Consiste em carne cozida servida sobre uma cama de macarrão caseiro, acompanhada de cebola refogada e caldo da carne."
        ),
        Pais(
            id = 14,
            nome = "Uruguai",
            imageId = R.drawable.uruguai,
            respostas = listOf("Uruguai", "Argentina", "Suécia", "Japão"),
            continente = "América do Sul",
            informacoes = "É um país da América do Sul conhecido pelo interior verdejante e pelo litoral repleto de praias.",
            imageComida = R.drawable.curu,
            descComida = "Chivito: É feito com carne de filé-mignon grelhado, coberto com fatias de presunto, queijo, alface, tomate, ovo e maionese. "
        ),
        Pais(
            id = 15,
            nome = "Venezuela",
            imageId = R.drawable.venezuela,
            respostas = listOf("Chile", "Colombia", "Venezuela", "Brasil"),
            continente = "América do Sul",
            informacoes = "É um país situado na costa norte da América do Sul com diversas atrações naturais. Ao longo da costa do Caribe, há ilhas turísticas tropicais como a Isla de Margarita e o arquipélago Los Roques.",
            imageComida = R.drawable.cven,
            descComida = "Arepas: São espécies de pães redondos e achatados feitos de massa de milho, com vários recheios."
        ),
        Pais(
            id = 16,
            nome = "Canada",
            imageId = R.drawable.canada,
            respostas = listOf("Canada", "Estados Unidos", "França", "Chile"),
            continente = "América do Norte",
            informacoes = "O Canadá é um país norte-americano que se estende desde os EUA, no sul, até o Círculo Polar Ártico, no norte. Entre suas grandes cidades estão a gigantesca Toronto; Vancouver, Montreal e Québec City, que falam francês; e a capital, Ottawa.",
            imageComida = R.drawable.ccan,
            descComida = "Poutine: É um prato originário de Quebec e consiste em batatas fritas cobertas com queijo coalho fresco e regadas com molho gravy quente. "
        ),
        Pais(
            id = 17,
            nome = "Coreia",
            imageId = R.drawable.coreia,
            respostas = listOf("Japão", "China", "Coreia", "Índia"),
            continente = "Ásia",
            informacoes = "A Coreia do Sul, uma nação do Leste da Ásia localizada na metade sul da Península da Coreia, compartilha uma das fronteiras mais militarizadas do mundo com a Coreia do Norte. ",
            imageComida = R.drawable.ccor,
            descComida = "Bibimbap: É um prato popular que consiste em arroz cozido, legumes variados, carne, ovo e molho gochujang. "
        ),
        Pais(
            id = 18,
            nome = "Honduras",
            imageId = R.drawable.honduras,
            respostas = listOf("Jamaica", "Honduras", "Peru", "Mexico"),
            continente = "América Central",
            informacoes = "Honduras é um país da América Central limitado ao norte pelo mar do Caribe e ao sul pelo Oceano Pacífico. Na floresta tropical próxima à Guatemala, o antigo local cerimonial maia de Copán exibe hieróglifos entalhados em pedra e estelas, monumentos altos de pedra.",
            imageComida = R.drawable.chon,
            descComida = "Baleadas: São tortilhas de farinha de trigo recheadas com feijão refogado, queijo, creme de leite e outros ingredientes."
        ),
        Pais(
            id = 19,
            nome = "Japão",
            imageId = R.drawable.japao,
            respostas = listOf("China", "Russia", "Australia", "Japão"),
            continente = "Ásia",
            informacoes = "O Japão, país insular no Oceano Pacífico, tem cidades densas, palácios imperiais, parques nacionais montanhosos e milhares de santuários e templos.",
            imageComida = R.drawable.cjap,
            descComida = "Sushi: Consiste em pequenos bolinhos de arroz temperado cobertos com uma variedade de ingredientes"
        ),
        Pais(
            id = 20,
            nome = "México",
            imageId = R.drawable.mexico,
            respostas = listOf("Africa do Sul", "Estados Unidos", "México", "Qatar"),
            continente = "América do Norte",
            informacoes = "É um país situado entre os Estados Unidos e a América Central, conhecido pelas praias no Pacífico e no Golfo do México e pela paisagem diversificada que inclui montanhas, desertos e selvas.",
            imageComida = R.drawable.cmex,
            descComida = "Tacos: São tortilhas de milho ou trigo, recheadas com uma variedade de ingredientes."
        ),
        Pais(
            id = 21,
            nome = "Peru",
            imageId = R.drawable.peru,
            respostas = listOf("Colombia", "Peru", "Paraguai", "China"),
            continente = "América do Sul",
            informacoes = "O Peru é um país da América do Sul que abriga uma parte da Floresta Amazônica e Machu Picchu, uma antiga cidade inca na cordilheira dos Andes. ",
            imageComida = R.drawable.cper,
            descComida = "Carapulcra: é um prato com raízes da antiga culinária inca; é um guisado feito com carne e batata-seca, tradicionalmente chamada “chuño” ou “papaseca”. "
        ),
        Pais(
            id = 22,
            nome = "Catar",
            imageId = R.drawable.qatar,
            respostas = listOf("Brasil", "Arabia Saudita", "Catar", "Frisia"),
            continente = "Ásia",
            informacoes = "É um país peninsular árabe cuja paisagem abrange um deserto árido e um longo litoral no Golfo Pérsico (Árabe) repleto de praias e dunas. ",
            imageComida = R.drawable.ccat,
            descComida = "Machbous: É o prato nacional do Qatar, feito com arroz temperado, carne e uma variedade de especiarias."
        ),
        Pais(
            id = 23,
            nome = "Reino Unido",
            imageId = R.drawable.reinounido,
            respostas = listOf("Reino Unido", "Pais de Gales", "Escocia", "Inglaterra"),
            continente = "Europa",
            informacoes = "O Reino Unido, formado por Inglaterra, Escócia, País de Gales e Irlanda do Norte, é uma nação insular situada no noroeste da Europa. ",
            imageComida = R.drawable.crei,
            descComida = "Fish and Chips: Consiste em peixe branco, empanado e frito, servido com batatas fritas e acompanhado de molho tártaro."
        ),
        Pais(
            id = 24,
            nome = "Russia",
            imageId = R.drawable.russia,
            respostas = listOf("China", "Russia", "Australia", "Japão"),
            continente = "Europa / Ásia",
            informacoes = "É um país que se estende por grande parte do norte da Eurásia. Composto por grande parte da Europa oriental e do norte da Ásia, é o maior país do mundo.",
            imageComida = R.drawable.crus,
            descComida = "Borsch: É uma sopa de beterraba feita com legumes como repolho, cenoura, batata e cebola, além de carne bovina ou suína."
        ),
        Pais(
            id = 25,
            nome = "China",
            imageId = R.drawable.china,
            respostas = listOf("China", "Brasil", "Estados Unidos", "Japão"),
            continente = "Ásia",
            informacoes = "A China é uma nação muito populosa da Ásia Oriental cuja ampla paisagem abrange pradarias, desertos, montanhas, lagos, rios e mais de 14.000 km de litoral.",
            imageComida = R.drawable.cchi,
            descComida = "Arroz frito: é um prato  feito com arroz cozido, legumes, carnes e temperos, como molho de soja e óleo de gergelim"
        ),
        Pais(
            id = 26,
            nome = "Espanha",
            imageId = R.drawable.espanha,
            respostas = listOf("Espanha", "França", "Portugal", "Italia"),
            continente = "Europa",
            informacoes = "A Espanha, país europeu da península Ibérica, tem 17 regiões autônomas com geografia e cultura diversas. Madri, a capital, abriga o Palácio Real e o Museu do Prado, obras erigidas por mestres europeus.",
            imageComida = R.drawable.cesp,
            descComida = "Paella: É feito com arroz, açafrão, legumes, carnes (como frango, coelho ou frutos do mar) e temperos."
        ),
        Pais(
            id = 27,
            nome = "Italia",
            imageId = R.drawable.italia,
            respostas = listOf("Italia", "Reino Unido", "França", "Austrália"),
            continente = "Europa",
            informacoes = "A Itália, país europeu com uma longa costa mediterrânea, deixou uma marca poderosa na culinária e na cultura ocidentais.",
            imageComida = R.drawable.cita,
            descComida = "Pizza: A pizza é um ícone da culinária italiana e existe uma grande variedade de sabores e estilos."
        ),
        Pais(
            id = 28,
            nome = "França",
            imageId = R.drawable.franca,
            respostas = listOf("Tailandia", "Italia", "França", "Escocia"),
            continente = "Europa",
            informacoes = "A França, tem cidades medievais, aldeias alpinas e praias mediterrâneas. Paris, sua capital, é famosa pelas casas de alta costura, museus de arte clássica, como o Louvre, e monumentos como a Torre Eiffel.",
            imageComida = R.drawable.cfra,
            descComida = "Coq au Vin: É um prato clássico francês feito com frango cozido em vinho tinto, geralmente servido com cogumelos, cebolas e bacon."
        ),
        Pais(
            id = 29,
            nome = "Tailandia",
            imageId = R.drawable.tailandia,
            respostas = listOf("Estados Unidos", "Reino Unido", "Tailandia", "Turquia"),
            continente = "Ásia",
            informacoes = "A Tailândia é um país do Sudeste Asiático conhecido pelas praias tropicais, pelos palácios reais suntuosos, pelas ruínas antigas e pelos templos ornamentados com figuras de Buda.",
            imageComida = R.drawable.ctai,
            descComida = "Pad Thai: É um prato de macarrão de arroz frito com camarão, frango ou tofu, ovos, broto de feijão, amendoim, suco de limão e molho de tamarindo."
        ),
        Pais(
            id = 30,
            nome = "Turquia",
            imageId = R.drawable.turquia,
            respostas = listOf("Turquia", "China", "Russia", "Frisia"),
            continente = "Europa / Ásia",
            informacoes = "A Turquia é uma nação que se estende do leste da Europa ao oeste da Ásia e mantém conexões culturais com os antigos impérios grego, persa, romano, bizantino e otomano.",
            imageComida = R.drawable.ctur,
            descComida = "Kebab: Existem várias variações, como o döner kebab e o adana kebab."
        )
    )
}