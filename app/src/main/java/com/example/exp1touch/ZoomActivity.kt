package com.example.exp1touch

import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.view.View.OnTouchListener
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
class ZoomActivity : AppCompatActivity(),OnTouchListener {
    lateinit var myImageView:ImageView
    var distanceX: Float=0f
    var distanceY: Float=0f
    var distanceDepart:Double=0.0
    var distanceFin:Double=0.0
    lateinit var P: LinearLayout.LayoutParams
    val X_Initiale=400
    val Y_Initiale=400
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zoom)
        myImageView = findViewById<View>(R.id.img) as ImageView
        P = myImageView.layoutParams as LinearLayout.LayoutParams
        P.width = X_Initiale
        P.height = Y_Initiale
        myImageView.setLayoutParams(P)
       myImageView.setOnTouchListener(this)
    }
    override fun onTouch(p0: View?, event: MotionEvent?): Boolean {
        when (event?.action?. and (MotionEvent.ACTION_MASK)) {
            MotionEvent.ACTION_POINTER_DOWN -> {
                distanceX = event.getX(0) - event.getX(1)
                distanceY = event.getY(0) - event.getY(1)
                distanceDepart = Math.sqrt(
                    Math.pow(distanceX.toDouble(),2.0) + Math.pow(distanceX.toDouble(),2.0)
                )
            }



            MotionEvent.ACTION_MOVE -> {
                distanceX = event.getX(0) - event.getX(1)
                distanceY = event.getY(0) - event.getY(1)
                distanceFin = Math.sqrt(
                    Math.pow(distanceX.toDouble(),2.0) + Math.pow(distanceX.toDouble(),2.0)
                )


              redimensionner()


        }}
     return   true

    }
     fun redimensionner()
      {
          //Formule pour modifier la taille de l’image en fonction d’une échelle

          //Formule pour modifier la taille de l’image en fonction d’une échelle
          var Echelle: Double = distanceFin / distanceDepart
          if (Echelle < 0.1) Echelle = 0.1
          P = myImageView.layoutParams as LinearLayout.LayoutParams
          P.width = ((X_Initiale * Echelle).toInt())
          P.height = ((Y_Initiale * Echelle).toInt())
          myImageView.setLayoutParams(P)

      }


}