package com.example.biharinnovation

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ContactUs : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_us)
    }

    fun openFacebook(view: View){
        val url = "https://www.facebook.com/BiharInnovation/"
        val i = Intent(Intent.ACTION_VIEW)
        i.data = Uri.parse(url)
        startActivity(i)
    }
    fun openYoutube(view: View){
        val url = "https://www.youtube.com/channel/UC_h6LKTE9pqwZqnmmSGrMRQ"
        val i = Intent(Intent.ACTION_VIEW)
        i.data = Uri.parse(url)
        startActivity(i)
    }
    fun openWhatsapp(view: View){
        val url = "https://api.whatsapp.com/send/?phone=916127966092&text&app_absent=0"
        val i = Intent(Intent.ACTION_VIEW)
        i.data = Uri.parse(url)
        startActivity(i)
    }
    fun backToMain(view: View) {
        val i = Intent(this,MainActivity::class.java)
        startActivity(i)
    }
}
