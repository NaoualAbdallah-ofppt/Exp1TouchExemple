package com.example.exp1touch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var img:ImageView
    var x1:Float=0f
    var x2:Float=0f
    var lst= arrayListOf(R.drawable.ic_metro,R.drawable.ic_tgv    ,R.drawable.ic_rer )
    var p:Int=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    img=findViewById(R.id.MonImg)
        val txt=findViewById<TextView>(R.id.txtTitre)

        img.setOnTouchListener{v,event->

                     when(event.action)
            {
                MotionEvent.ACTION_DOWN-> x1=event.x
                MotionEvent.ACTION_UP->
                {
                    x2=event.x
                    when
                    {x1<x2-> {
                        if (p!=0)
                            p--
                    }
                    x1>x2->
                        if (p<lst.size-1)
                        p++

                    }
                    img.setImageResource(lst[p])

                }

        }

true
        }
    }
}