package com.example.exp1touch

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class DemarreActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_demarre)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        getMenuInflater().inflate(R.menu.menudemarre,menu)
    return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId)
        {
            R.id.act1-> {
                val itt = Intent(applicationContext, MainActivity::class.java)
                startActivity(itt)
            }
         R.id.act2->
         {
             val itt = Intent(applicationContext, ZoomActivity::class.java)
             startActivity(itt)
         }
            R.id.act3->
          // finish()
Toast.makeText(applicationContext,"rtr",Toast.LENGTH_LONG).show()
          }
        return(false)
}

}
