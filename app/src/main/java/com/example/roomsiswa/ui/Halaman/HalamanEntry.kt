package com.example.roomsiswa.ui.Halaman

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.roomsiswa.R
import com.example.roomsiswa.model.DetailSiswa
import com.example.roomsiswa.navigasi.DestinasiNavigasi

object DestinasiEntry : DestinasiNavigasi{
    override val route = "item_entry"
    override val titleRes = R.string.entry_siswa
}

@Composable
fun FormInputSiswa(
    detailSiswa: DetailSiswa,
    modifier: Modifier,
    onValueChange : (DetailSiswa) ->Unit = {},
    enabled:Boolean = true
){
    Column (

    ){

    }
}

