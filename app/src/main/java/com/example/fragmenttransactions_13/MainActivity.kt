package com.example.fragmenttransactions_13

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.add
import androidx.fragment.app.commit
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val fragmentB = FragmentB()
        val fragmentC = FragmentC()

        if (savedInstanceState == null){
            supportFragmentManager
                .beginTransaction()
                .add(R.id.fragment_b_container_view, fragmentB )
                .commit()


        }

        buttonReplace.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragment_b_container_view, fragmentC)
                .addToBackStack("Fragment C")
                .commit()
        }
    }
}