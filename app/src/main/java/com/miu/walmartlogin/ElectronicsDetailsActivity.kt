package com.miu.walmartlogin

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.miu.walmartlogin.data.Product
import com.miu.walmartlogin.databinding.ActivityElectronicsDetailBinding


class ElectronicsDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityElectronicsDetailBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityElectronicsDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val product: Product? = intent.getSerializableExtra("product") as Product?
        product?.image?.let { binding.detailProductImage.setBackgroundResource(it) }
        binding.detailProductTitle.text = product?.title
        binding.detailProductColor.text = "Color: ${product?.color}"
        binding.detailProductNumber.text = "Walmart #: ${product?.productId.toString()}"
        binding.detailProductDescription.text = "Item Description:\n${product?.desc}"
    }

}