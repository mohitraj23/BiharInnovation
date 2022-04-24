package com.example.biharinnovation

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Members : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_members)


    }

    fun openDewang(view: View) {
        val url = "https://www.linkedin.com/in/dewang-shekhar-7a69aa1a2/"
        val i = Intent(Intent.ACTION_VIEW)
        i.data = Uri.parse(url)
        startActivity(i)
    }
    fun openAtul(view: View) {
        val url = "https://www.linkedin.com/in/atulkumar/"
        val i = Intent(Intent.ACTION_VIEW)
        i.data = Uri.parse(url)
        startActivity(i)
    }
    fun openRabindra(view: View) {
        val url = "https://www.linkedin.com/in/ravindra-kumar-31813746/"
        val i = Intent(Intent.ACTION_VIEW)
        i.data = Uri.parse(url)
        startActivity(i)
    }
    fun openKamini(view: View) {
        val url = "https://www.linkedin.com/in/kamini-kumari-2b2a72208/"
        val i = Intent(Intent.ACTION_VIEW)
        i.data = Uri.parse(url)
        startActivity(i)
    }
    fun openNatasha(view: View) {
        val url = "https://www.linkedin.com/in/natashgpt/"
        val i = Intent(Intent.ACTION_VIEW)
        i.data = Uri.parse(url)
        startActivity(i)
    }
    fun openMohit(view: View) {
        val url = "https://www.linkedin.com/in/mohit-r-06156b200/"
        val i = Intent(Intent.ACTION_VIEW)
        i.data = Uri.parse(url)
        startActivity(i)
    }
    fun openKrishna(view: View) {
        val url = "https://www.linkedin.com/in/krishna-kumar-5b836464/"
        val i = Intent(Intent.ACTION_VIEW)
        i.data = Uri.parse(url)
        startActivity(i)
    }
    fun openAmitM(view: View) {
        val url = "https://www.linkedin.com/in?_l=en_US"
        val i = Intent(Intent.ACTION_VIEW)
        i.data = Uri.parse(url)
        startActivity(i)
    }
    fun openAditya(view: View) {
        val url = "https://www.linkedin.com/in/aditya-narayan-79b5831b0/"
        val i = Intent(Intent.ACTION_VIEW)
        i.data = Uri.parse(url)
        startActivity(i)
    }
    fun openAbhishek(view: View) {
        val url = "https://www.linkedin.com/in/abhishek-kumar-b52975177/"
        val i = Intent(Intent.ACTION_VIEW)
        i.data = Uri.parse(url)
        startActivity(i)
    }
    fun openNitesh(view: View) {
        val url = "https://www.linkedin.com/in/unavailable/"
        val i = Intent(Intent.ACTION_VIEW)
        i.data = Uri.parse(url)
        startActivity(i)
    }
    fun openAmit(view: View) {
        val url = "https://www.linkedin.com/in/amit-kumar-shukla-972a998a/"
        val i = Intent(Intent.ACTION_VIEW)
        i.data = Uri.parse(url)
        startActivity(i)
    }
    fun openBikash(view: View) {
        val url = "https://www.linkedin.com/in/branjan/"
        val i = Intent(Intent.ACTION_VIEW)
        i.data = Uri.parse(url)
        startActivity(i)
    }

    fun openShubham(view: View) {
        val url = "https://www.linkedin.com/in/shubham-kumar-0a44ba1b8/"
        val i = Intent(Intent.ACTION_VIEW)
        i.data = Uri.parse(url)
        startActivity(i)
    }

    fun backToMain(view: View) {
        val i = Intent(this,MainActivity::class.java)
        startActivity(i)
    }
}