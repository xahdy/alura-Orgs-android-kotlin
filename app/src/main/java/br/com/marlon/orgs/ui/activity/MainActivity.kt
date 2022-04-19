package br.com.marlon.orgs.ui.activity

import android.app.Activity
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.marlon.orgs.R
import br.com.marlon.orgs.model.Produto
import br.com.marlon.orgs.ui.recyclerview.adapter.ListaProdutosAdapter
import java.math.BigDecimal

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = ListaProdutosAdapter(context = this, produtos = listOf(
            Produto(
                nome = "Teste1",
                descricao = "Desc1",
                valor = BigDecimal("19.99")
            ),
            Produto(
                nome = "Teste2",
                descricao = "Desc2",
                valor = BigDecimal("29.99")
            )
        ))
        //recyclerView.layoutManager = LinearLayoutManager(this)
    }
}