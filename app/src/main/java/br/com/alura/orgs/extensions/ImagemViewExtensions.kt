package br.com.alura.orgs.extensions

import android.widget.ImageView
import br.com.alura.orgs.R
import coil.load

fun ImageView.TentaCarregarImagem(url: String? = null){
    load(url){
        fallback(R.drawable.erro)
        error(R.drawable.erro)
        placeholder(R.drawable.placeholder)

    }
}