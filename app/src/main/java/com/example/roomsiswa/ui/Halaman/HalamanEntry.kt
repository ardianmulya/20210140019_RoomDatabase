package com.example.roomsiswa.ui.Halaman

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import com.example.roomsiswa.R
import com.example.roomsiswa.model.DetailSiswa
import com.example.roomsiswa.model.UIStateSiswa
import com.example.roomsiswa.navigasi.DestinasiNavigasi

object DestinasiEntry : DestinasiNavigasi{
    override val route = "item_entry"
    override val titleRes = R.string.entry_siswa
}

@Composable
fun EntrySiswaBody(
    uiStateSiswa: UIStateSiswa,
    onSiswaValueChange: (DetailSiswa) -> Unit,
    onSaveClick: () -> Unit,
    modifier: Modifier = Modifier
){
    Column (
        verticalArrangement = Arrangement.spacedBy(dimensionResource(id = R.dimen.padding_large)),
        modifier = Modifier.padding(dimensionResource(id = R.dimen.padding_medium))
    ){
        FormInputSiswa(
            detailSiswa = uiStateSiswa.detailSiswa,
            onValueChange = onSiswaValueChange,
            modifier = modifier.fillMaxWidth()
        )
        Button(
            onClick = onSaveClick,
            enabled = uiStateSiswa.isEntryValid,
            shape = MaterialTheme.shapes.small,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = stringResource(id = R.string.btn_submit))
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormInputSiswa(
    detailSiswa: DetailSiswa,
    modifier: Modifier,
    onValueChange : (DetailSiswa) ->Unit = {},
    enabled:Boolean = true
){
    Column (
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(dimensionResource(id = R.dimen.padding_medium))
    ){
        OutlinedTextField(
            value = detailSiswa.nama,
            onValueChange ={onValueChange(detailSiswa.copy(nama = it))},
            label = { Text(stringResource(id = R.string.nama))},
            singleLine = true,
            modifier = Modifier.fillMaxWidth(),
            enabled = enabled
        )
        OutlinedTextField(
            value = detailSiswa.alamat,
            onValueChange ={onValueChange(detailSiswa.copy(alamat = it))},
            label = { Text(stringResource(R.string.alamat)) },
            singleLine = true,
            modifier = Modifier.fillMaxWidth(),
            enabled = enabled
        )
        OutlinedTextField(
            value = detailSiswa.telpon,
            onValueChange ={onValueChange(detailSiswa.copy(telpon = it))},
            label = { Text(stringResource(R.string.telpon)) },
            singleLine = true,
            modifier = Modifier.fillMaxWidth(),
            enabled = enabled
        )
        if (enabled) {
            Text(
                text = stringResource(id = R.string.required_field),
                modifier = Modifier.padding(start = dimensionResource(id = R.dimen.padding_medium))
            )
        }
        Divider(
            thickness = dimensionResource(id = R.dimen.padding_small),
            modifier = Modifier.padding(bottom = dimensionResource(id = R.dimen.padding_medium))

        )
    }
}

