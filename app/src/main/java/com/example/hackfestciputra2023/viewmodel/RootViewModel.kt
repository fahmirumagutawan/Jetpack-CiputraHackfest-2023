package com.example.hackfestciputra2023.viewmodel

import androidx.compose.material.SnackbarData
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.hackfestciputra2023.data.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class RootViewModel @Inject constructor(
    private val repository: Repository
) :ViewModel(){
    val snackbarActive = mutableStateOf(false)
    val snackbarMessage = mutableStateOf("")
    val snackbarAction: MutableState<(SnackbarData?) -> Unit> = mutableStateOf({})
    val snackbarActionLabel = mutableStateOf("Tutup")

    val xenditUrl = mutableStateOf("")

    val isLoading = mutableStateOf(false)
    val currentRoute = mutableStateOf("")
    val showBottombar = mutableStateOf(false)
}