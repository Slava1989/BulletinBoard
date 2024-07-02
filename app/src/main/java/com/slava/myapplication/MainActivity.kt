package com.slava.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import com.google.android.material.navigation.NavigationView
import com.slava.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    private lateinit var rootElement: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        rootElement = ActivityMainBinding.inflate(layoutInflater)
        val view = rootElement.root
//        setContentView(R.layout.activity_main)
        setContentView(view)
        init()
    }

    private fun init() {
        val toggle = ActionBarDrawerToggle(this, rootElement.drawerLayout, rootElement.mainContent.toolbar, R.string.open, R.string.close)
        rootElement.drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
        rootElement.navView.setNavigationItemSelectedListener(this)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.id_key_my_ads -> {
                Toast.makeText(this, "Pressed id_my_ads", Toast.LENGTH_LONG).show()
            }
            R.id.id_cars -> {
                Toast.makeText(this, "Pressed id_my_ads", Toast.LENGTH_LONG).show()
            }
            R.id.id_pc -> {
                Toast.makeText(this, "Pressed id_pc", Toast.LENGTH_LONG).show()
            }
            R.id.id_smart -> {
                Toast.makeText(this, "Pressed id_smart", Toast.LENGTH_LONG).show()
            }
            R.id.id_dm -> {
                Toast.makeText(this, "Pressed id_dm", Toast.LENGTH_LONG).show()
            }
            R.id.id_key_sign_up -> {
                Toast.makeText(this, "Pressed id_key_sign_up", Toast.LENGTH_LONG).show()
            }
            R.id.id_key_sign_in -> {
                Toast.makeText(this, "Pressed id_key_sign_in", Toast.LENGTH_LONG).show()
            }
            R.id.id_key_sign_out -> {
                Toast.makeText(this, "Pressed id_key_sign_out", Toast.LENGTH_LONG).show()
            }
        }

        rootElement.drawerLayout.closeDrawer(GravityCompat.START)

        return true
    }
}