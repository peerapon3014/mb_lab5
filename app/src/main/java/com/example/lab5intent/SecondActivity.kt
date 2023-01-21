package com.example.lab5intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.lab5intent.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var bindingSecond :ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        bindingSecond = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(bindingSecond.root)

        var data = intent.extras
        var newStudent:Student? = data?.getParcelable("stdData")

        bindingSecond.txtID.text = "Student ID : ${newStudent?.id}"
        bindingSecond.txtName.text = "Student Name : ${newStudent?.name}"
        bindingSecond.txtAge.text = "Student Age : ${newStudent?.age}"
        bindingSecond.txtHobby.text = "Student Hobby : ${newStudent?.hobby}"
//        Toast.makeText(applicationContext, newStudent?.id, Toast.LENGTH_LONG).show()
        bindingSecond.btnClose.setOnClickListener{
            finish()
        }
    }
}