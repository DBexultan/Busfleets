package com.example.busf

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var toogle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        toogle = ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close)
        drawerLayout.addDrawerListener(toogle)
        toogle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        navView.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.miItem1 -> Toast.makeText(applicationContext,
                    "Clicked Item 1", Toast.LENGTH_SHORT).show()
                R.id.miItem2 -> Toast.makeText(applicationContext,
                    "Clicked Item 2", Toast.LENGTH_SHORT).show()
                R.id.miItem3 -> Toast.makeText(applicationContext,
                    "Clicked Item 3", Toast.LENGTH_SHORT).show()
                R.id.miItem4 -> Toast.makeText(applicationContext,
                    "Clicked Item 4", Toast.LENGTH_SHORT).show()
                R.id.miItem5 -> Toast.makeText(applicationContext,
                    "Clicked Item 5", Toast.LENGTH_SHORT).show()
                R.id.miItem6 -> Toast.makeText(applicationContext,
                    "Clicked Item 6", Toast.LENGTH_SHORT).show()
            }
            true
        }

        myButton.setOnClickListener({
            Toast.makeText(this, "Добавлено", Toast.LENGTH_LONG).show()
        })

    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toogle.onOptionsItemSelected(item)) {
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}
