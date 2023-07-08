package com.devsadeq.composecinematicketsreservations.viewmodel.details

import androidx.lifecycle.ViewModel
import com.devsadeq.composecinematicketsreservations.R
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import javax.inject.Inject

@HiltViewModel
class DetailsViewModel @Inject constructor() : ViewModel() {
    private val _state = MutableStateFlow(DetailsUIState())
    val state = _state.asStateFlow()

    init {
        getActors()
    }

    private fun getActors() {
        _state.update {
            it.copy(
                actors = listOf(
                    R.drawable.actor_1,
                    R.drawable.actor_2,
                    R.drawable.actor_3,
                    R.drawable.actor_4,
                    R.drawable.actor_5,
                    R.drawable.actor_6,
                    R.drawable.actor_7,
                    R.drawable.actor_8,
                    R.drawable.actor_1,
                    R.drawable.actor_2,
                    R.drawable.actor_3,
                    R.drawable.actor_4,
                    R.drawable.actor_5,
                    R.drawable.actor_6,
                    R.drawable.actor_7,
                    R.drawable.actor_8,
                )
            )
        }
    }
}