package com.example.myapplication_recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val fruitList = arrayListOf<Fruit>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initFruit()//初始化数据
//        val layoutManager = LinearLayoutManager(this)
        val layoutManager = StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL)
//        layoutManager.orientation = LinearLayoutManager.HORIZONTAL
        recyclerview.layoutManager = layoutManager
        val adapter = FruitAdapter(fruitList)
        recyclerview.adapter = adapter



    }

    private fun initFruit() {
        repeat(2){
            fruitList.add(Fruit(getRhandomLengthString("1"),R.drawable.blue))
            fruitList.add(Fruit(getRhandomLengthString("2"),R.drawable.blue))
            fruitList.add(Fruit(getRhandomLengthString("3"),R.drawable.blue))
//            fruitList.add(Fruit("apple",R.drawable.blue))
//            fruitList.add(Fruit("2",R.drawable.blue))
//            fruitList.add(Fruit("3",R.drawable.blue))
//            fruitList.add(Fruit("4",R.drawable.blue))
        }

    }

    private fun getRhandomLengthString(str: String): String {
        val n = (1..20).random()
        val builder = StringBuilder()
        repeat(n){
            builder.append(str)
        }
        return builder.toString()
    }
}