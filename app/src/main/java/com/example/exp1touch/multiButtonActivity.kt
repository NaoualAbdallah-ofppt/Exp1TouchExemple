package com.example.exp1touch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.view.View.OnClickListener
import android.view.View.OnTouchListener
import android.widget.Button
import android.widget.Toast

class multiButtonActivity : AppCompatActivity(),
    OnClickListener, OnTouchListener
{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_multi_button)

           val btn1:Button=findViewById(R.id.btn1) as Button
        val btn2:Button=findViewById(R.id.btn2) as Button
       val btn3:Button=findViewById(R.id.btn3) as Button
        val btn4:Button=findViewById(R.id.btn4) as Button
       val btn5:Button=findViewById(R.id.btn5) as Button

       btn1.setOnClickListener(this)
        btn2.setOnClickListener(this)
        btn3.setOnClickListener(this)
        btn4.setOnClickListener(this)
        btn5.setOnClickListener(this)

        btn1.setOnTouchListener(this)
        btn2.setOnTouchListener(this)
        btn3.setOnTouchListener(this)
        btn4.setOnTouchListener(this)
        btn5.setOnTouchListener(this)

    }

    override fun onClick(p0: View?) {
       when (p0?.id)
        {
            R.id.btn1->
            {
                Toast.makeText(applicationContext,"btn1",Toast.LENGTH_SHORT).show()}
            R.id.btn2-> Toast.makeText(applicationContext,"btn2",Toast.LENGTH_SHORT).show()
            R.id.btn3-> Toast.makeText(applicationContext,"btn3",Toast.LENGTH_SHORT).show()
            R.id.btn4-> Toast.makeText(applicationContext,"btn4",Toast.LENGTH_SHORT).show()
            R.id.btn5-> Toast.makeText(applicationContext,"btn5",Toast.LENGTH_SHORT).show()


        }
    }

    override fun onTouch(p0: View?, p1: MotionEvent?): Boolean {
        when (p0?.id)
        {
            R.id.btn1->
            {

                Toast.makeText(applicationContext,"Touch btn1",Toast.LENGTH_SHORT).show()}
            R.id.btn2-> Toast.makeText(applicationContext,"Touch btn2",Toast.LENGTH_SHORT).show()
            R.id.btn3-> Toast.makeText(applicationContext,"Touch btn3",Toast.LENGTH_SHORT).show()
            R.id.btn4-> Toast.makeText(applicationContext,"Touch btn4",Toast.LENGTH_SHORT).show()
            R.id.btn5-> Toast.makeText(applicationContext,"Touch btn5",Toast.LENGTH_SHORT).show()


        }
        return true
    }
}