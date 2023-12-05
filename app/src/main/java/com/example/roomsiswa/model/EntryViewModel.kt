package com.example.roomsiswa.model

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.roomsiswa.repositori.RepositoriSiswa

class EntryViewModel (private val repositoriSiswa: RepositoriSiswa): ViewModel() {
    var uiStateSiswa by mutableStateOf(UIStateSiswa())
        private set
}
data class UIStateSiswa(
    val detailSiswa : DetailSiswa = DetailSiswa(),
    val isEntryValid : Boolean = false
)

data class DetailSiswa (
    val id : Int = 0,
    val nama : String = "",
    val alamat : String = "",
    val telepon : String = "",
)
