package br.senai.sp.jandira.viacep.model

import com.google.gson.annotations.SerializedName

data class Cep(
    var cep: String,
    var logradouro: String,
    var complemento: String,
    var bairro: String,
    //Mudando o nome do atributo, e igualando com o nome do Json
    @SerializedName("localidade") var cidade: String,
    @SerializedName("uf") var estado: String
)
