package br.senai.sp.jandira.viacep.service

import br.senai.sp.jandira.viacep.model.Cep
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface CepRetrofitService {

    //https://viacep.com.br/ws/06053020/json/
    @GET("{cep}/json/")
    //Retorna um objeto cep via call
    fun getCep(@Path("cep") cep: String): Call<Cep>

     //https://viacep.com.br/ws/SP/Osasco/lourenco/json/
    @GET("{uf}/{cidade}/{logradouro}/json/")
    fun getCeps(
         @Path("uf") uf: String,
         @Path("cidade") cidade: String,
         @Path("logradouro") logradouro: String
     ): Call<List<Cep>>

}