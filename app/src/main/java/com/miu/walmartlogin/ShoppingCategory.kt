package com.miu.walmartlogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_shopping_category.*

class ShoppingCategory : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shopping_category)
        var sintent = intent
        tvUsername.text = sintent.getStringExtra("username")
    }
    fun btnClick(view: View){
        var cat = ""
        when(view.id){
            R.id.btnElectronics -> startActivity(Intent(this, ElectronicsCategoryActivity::class.java))

            R.id.btnClothing ->         Toast.makeText(this,"You have chosen the clothing category of shopping",Toast.LENGTH_LONG).show()

            R.id.btnBeauty ->        Toast.makeText(this,"You have chosen the beauty category of shopping",Toast.LENGTH_LONG).show()

            R.id.btnFood ->  Toast.makeText(this,"You have chosen the Food category of shopping",Toast.LENGTH_LONG).show()

        }
        //Toast.makeText(this,"You have chosen the $cat category of shopping",Toast.LENGTH_LONG).show()
    }
}