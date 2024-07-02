package com.infinitelearning.infiniteapp.data

import com.infinitelearning.infiniteapp.R
import com.infinitelearning.infiniteapp.model.About
import com.infinitelearning.infiniteapp.model.Favorit
import com.infinitelearning.infiniteapp.model.Makanan
import com.infinitelearning.infiniteapp.model.VlogerMakanan

object DummyData {
    val makananFavorit = listOf(
        Makanan(
            id = 1,
            name = "Sate",
            nickname = "Tesate",
            saos = "Bumbu Kacang",
            photo = R.drawable.sate
        ),
        Makanan(
            id = 2,
            name = "Somay",
            nickname = "umai",
            saos = "Bumbu Kacang",
            photo = R.drawable.somay
        ),
        Makanan(
            id = 3,
            name = "Martabak Manis",
            nickname = "Terang Bulan",
            saos = "Coklat",
            photo = R.drawable.martabak_manis
        ),
        Makanan(
            id = 4,
            name = "Seblak",
            nickname = "Krupuk Basah",
            saos = "Sambal Cabai",
            photo = R.drawable.seblak
        ),
        Makanan(
            id = 5,
            name = "Batagor",
            nickname = "agor",
            saos = "Bumbu Kacang",
            photo = R.drawable.batagor
        )
    )

    val mobileVlogerMakanans = listOf(
        VlogerMakanan(
            id = 1,
            name = "Ria SW",
            photo = R.drawable.no_profile,
            batch = "November 2023",
            bumbu = "Food Travel",
        ),
        VlogerMakanan(
            id = 2,
            name = "Mongol",
            photo = R.drawable.no_profile,
            batch = "September 2023",
            bumbu = "Food Horor",
        ),
        VlogerMakanan(
            id = 3,
            name = "Chef Juna",
            photo = R.drawable.no_profile,
            batch = "Juni 2023",
            bumbu = "Juri Masterchef",
        ),
        VlogerMakanan(
            id = 4,
            name = "Chef Renata",
            photo = R.drawable.no_profile,
            batch = "Juni 2023",
            bumbu = "Juri Masterchef",
        ),
        VlogerMakanan(
            id = 5,
            name = "Chef Arnold",
            photo = R.drawable.no_profile,
            batch = "Maret 2023",
            bumbu = "Juri Masterchef",
        ),
        VlogerMakanan(
            id = 6,
            name = "Darma Muktabar",
            photo = R.drawable.no_profile,
            batch = "Maret 2023",
            bumbu = "Vlogger Bengkel",
        ),
        VlogerMakanan(
            id = 7,
            name = "Ryan Rudmiansyah",
            photo = R.drawable.no_profile,
            batch = "Maret 2023",
            bumbu = "Vlogger Haiya",
        ),
        VlogerMakanan(
            id = 8,
            name = "Raysita",
            photo = R.drawable.no_profile,
            batch = "Februari 2023",
            bumbu = "Open Joki",
        ),
        VlogerMakanan(
            id = 9,
            name = "Alexander Stifen",
            photo = R.drawable.no_profile,
            batch = "Februari 2023",
            bumbu = "Consultan Food",
        ),
        VlogerMakanan(
            id = 10,
            name = "Bang",
            photo = R.drawable.no_profile,
            batch = "Januari 2023",
            bumbu = "Mekanik makanan",
        )
    )

    val About = listOf(
        About(
            id = 1,
            name = "Angela Jessica",
            jurusan = "Desain Komuunikasi Visual",
            email = "21420100029@dinamika.ac.id",
            asalperguruan = "Universitas Dinamika",
            photo = R.drawable.compose_introduction
        ),
    )

    val infiniteGalleries = listOf(
        Favorit(
            id = 1,
            name = "somay mamank ryan",
            photo = R.drawable.somay
        ),
        Favorit(
            id = 2,
            name = "sate bapak darma",
            photo = R.drawable.sate
        ),
        Favorit(
            id = 3,
            name = "seblak jeje slebew",
            photo = R.drawable.seblak
        ),
        Favorit(
            id = 4,
            name = "sitagor",
            photo = R.drawable.batagor
        ),
        Favorit(
            id = 5,
            name = "marman stipen",
            photo = R.drawable.martabak_manis
        ),
        Favorit(
            id = 6,
            name = "marsin good",
            photo = R.drawable.martabak_asin
        ),
        Favorit(
            id = 7,
            name = "bebek bakar jayapura",
            photo = R.drawable.bebar
        ),
    )
}