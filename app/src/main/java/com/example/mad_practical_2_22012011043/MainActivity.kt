package com.example.mad_practical_2_22012011043

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    val TAG="MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        ShowToastmessage("onCreate method is called")
    }
    override fun onStart() {
        super.onStart()
        ShowToastmessage("onStart method is called.")
    }

    override fun onResume() {
        super.onResume()
        ShowToastmessage("onResume method is called")
    }


    override fun onPause() {
        super.onPause()
        ShowToastmessage("onPause method is called")
    }

    override fun onStop() {
        super.onStop()
        ShowToastmessage("onstop method is called")
    }

    override fun onDestroy() {
        super.onDestroy()
        ShowToastmessage("ondestroy method is called")
    }

    override fun onRestart() {
        super.onRestart()
        ShowToastmessage("onRestart method is called")
    }
    fun ShowToastmessage(msg:String){
        Log.i(TAG, msg)
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()

    }
    fun ShowSnackBarMessage(msg:String){
        Log.i(TAG, msg)
        Snackbar.make(findViewById(R.id.main), msg, Snackbar.LENGTH_SHORT).show()
    }



}
