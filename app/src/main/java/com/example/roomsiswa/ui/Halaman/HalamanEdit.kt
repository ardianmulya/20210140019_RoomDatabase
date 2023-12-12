package com.example.roomsiswa.ui.Halaman

import com.example.roomsiswa.R
import com.example.roomsiswa.navigasi.DestinasiNavigasi

object ItemEditDestination : DestinasiNavigasi{
    override val route= "item_edit"
    override val titleRes= R.string.edit_siswa
    const val itemIdArg = "itemId"
    val routeWithArgs = "$route/{$itemIdArg}"
}