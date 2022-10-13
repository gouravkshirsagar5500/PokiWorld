package com.gourav.jetpackcomposepokedex.pokemondetail

import androidx.lifecycle.ViewModel
import com.gourav.jetpackcomposepokedex.data.remote.responses.Pokemon
import com.gourav.jetpackcomposepokedex.repository.PokemonRepository
import com.gourav.jetpackcomposepokedex.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonDetailViewModel @Inject constructor(
    private val repository: PokemonRepository
) : ViewModel() {

    suspend fun getPokemonInfo(pokemonName: String): Resource<Pokemon> {
        return repository.getPokemonInfo(pokemonName)
    }
}