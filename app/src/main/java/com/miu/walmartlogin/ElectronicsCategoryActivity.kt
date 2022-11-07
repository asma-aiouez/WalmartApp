package com.miu.walmartlogin

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.miu.walmartlogin.data.Product
import com.miu.walmartlogin.adapter.CategoryAdapter
import com.miu.walmartlogin.databinding.ActivityElectronicsItemBinding

class ElectronicsCategoryActivity : AppCompatActivity(), CategoryAdapter.Callback {

    private lateinit var binding: ActivityElectronicsItemBinding
    private val productList = mutableListOf(
        Product(123L, "RCA Voyager 7\" 16GB Android Tablet", "$35", "Black", R.drawable.ipad, "Tablet Lorem Ipsum is simply dummy text of the printing and typesetting industry. "),
        Product(124L, "HP Flyer Red 15.6 \" Laptop", "$299", "Black & Red", R.drawable.laptop, "Laptop Lorem Ipsum is simply dummy text of the printing and typesetting industry. "),
        Product(125L, "Vizio 70\" Classic 4K", "$1298.00", "Black", R.drawable.monitor, "Monitor Lorem Ipsum is simply dummy text of the printing and typesetting industry. "),
        Product(126L, "EPSON Workforce WF-2750", "$69.00", "Black", R.drawable.printer, "Printer Lorem Ipsum is simply dummy text of the printing and typesetting industry. ")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityElectronicsItemBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val recyclerView = binding.recyclerView
        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = CategoryAdapter(this, productList)
        adapter.setCallback(this)
        recyclerView.adapter = adapter
    }

    override fun onItemClicked(product: Product?) {
        val intent = Intent(this, ElectronicsDetailActivity::class.java)
        intent.putExtra("product", product)
        startActivity(intent)
    }
}