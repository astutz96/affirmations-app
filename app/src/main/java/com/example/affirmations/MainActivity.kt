package com.example.affirmations

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.adapter.ItemAdapter
import com.example.affirmations.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //init data set
        val myDataset = Datasource().loadAffirmations()

        val recyclerview = findViewById<RecyclerView>(R.id.recycler_view)

        //If you want to make the layout a Grid you can do something like this...
        //recyclerview.layoutManager = GridLayoutManager(this, 3);

        recyclerview.adapter = ItemAdapter(this, myDataset)

        /**
         * Use this setting to improve performance if you know that changes in the content
         * do not change the layout size of the RecyclerView
        */
        recyclerview.setHasFixedSize(true)

//        val textView: TextView = findViewById(R.id.textview)
//        textView.text = Datasource().loadAffirmations().size.toString()
    }
}