package br.senai.sp.jandira.viacep.service

import br.senai.sp.jandira.viacep.model.Cep
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

fun buscarCep(cep: String,onComplete: (String,) -> Unit){
    var logradouro = ""

    val call = RetrofitFactory()
        .retrofitServices()
        .getCep(cep)

    call.enqueue(object: Callback<Cep> {
        override fun onResponse(call: Call<Cep>, response: Response<Cep>) {
            logradouro = response.body()!!.logradouro ?: "Cep nao encontrado"
            onComplete.invoke(logradouro)
        }

        override fun onFailure(call: Call<Cep>, t: Throwable) {
            TODO("Not yet implemented")
        }

    })
}
