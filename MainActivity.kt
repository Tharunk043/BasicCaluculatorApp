package com.example.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.lang.ArithmeticException

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonPlus = findViewById<Button>(R.id.btnplus)
        buttonPlus.setOnClickListener{
            try {
                val ed1 = findViewById<EditText>(R.id.editTextText1)
                val ed2 = findViewById<EditText>(R.id.editTextText2)
                val input1 = ed1.text.toString().toFloat()
                val input2 = ed2.text.toString().toFloat()
                val res = findViewById<TextView>(R.id.textView)
                res.text = (input1 + input2).toString()
            }catch (e:Exception){
                val res = findViewById<TextView>(R.id.textView)
                res.text = "Enter Both Inputs Properly"
            }
        }
        val buttonMinus = findViewById<Button>(R.id.btnminus)
        buttonMinus.setOnClickListener {
            try{
            val ed1 =findViewById<EditText>(R.id.editTextText1)
            val ed2 =findViewById<EditText>(R.id.editTextText2)
            val input1= ed1.text.toString().toFloat()
            val input2= ed2.text.toString().toFloat()
            val res = findViewById<TextView>(R.id.textView)
            res.text=(input1-input2).toString()
            }catch (e:Exception){
                val res = findViewById<TextView>(R.id.textView)
                res.text = "Enter Both Inputs Properly"
            }
        }
        val buttonMultiply = findViewById<Button>(R.id.btnmultiply)
        buttonMultiply.setOnClickListener {
            try{
            val ed1 =findViewById<EditText>(R.id.editTextText1)
            val ed2 =findViewById<EditText>(R.id.editTextText2)
            val input1= ed1.text.toString().toFloat()
            val input2= ed2.text.toString().toFloat()
            val res = findViewById<TextView>(R.id.textView)
            res.text=(input1*input2).toString()
            }catch (e:Exception){
                val res = findViewById<TextView>(R.id.textView)
                res.text = "Enter Both Inputs Properly"
            }
        }
        val buttonDivide = findViewById<Button>(R.id.btndivide)
        buttonDivide.setOnClickListener {
            try{
            val ed1 =findViewById<EditText>(R.id.editTextText1)
            val ed2 =findViewById<EditText>(R.id.editTextText2)
            val input1= ed1.text.toString().toFloat()
            val input2= ed2.text.toString().toFloat()
            val res = findViewById<TextView>(R.id.textView)
            res.text = (input1 / input2).toString()
            if(input2==0.0f)
                res.text="cannot divide by zero"
        }catch (e:Exception){
            val res = findViewById<TextView>(R.id.textView)
            res.text = "You Must Enter Two Inputs"
        }
            }
        val buttonModulo = findViewById<Button>(R.id.btnModulo)
        buttonModulo.setOnClickListener {
            try{
                val ed1 =findViewById<EditText>(R.id.editTextText1)
                val ed2 =findViewById<EditText>(R.id.editTextText2)
                val input1= ed1.text.toString().toFloat()
                val input2= ed2.text.toString().toFloat()
                val res = findViewById<TextView>(R.id.textView)
                res.text = (input1 % input2).toInt().toString()
                if(input2==0.0f)
                    res.text="cannot divide by zero"
            }catch (e:Exception){
                val res = findViewById<TextView>(R.id.textView)
                res.text = "You Must Enter Two Inputs"
            }
        }
        val buttonNegate = findViewById<Button>(R.id.btnNegate)
        buttonNegate.setOnClickListener {
            try{
                val ed1 =findViewById<EditText>(R.id.editTextText1)
                val ed2 =findViewById<EditText>(R.id.editTextText2)
                val input1= ed1.text.toString().toInt()
                val input2= ed2.text.toString().toInt()
                val res = findViewById<TextView>(R.id.textView)
                res.text= (Math.pow(input1.toDouble(),input2.toDouble())).toInt().toString()
            }catch (e:Exception){
                val res = findViewById<TextView>(R.id.textView)
                res.text = "You Must Enter Two Inputs"
            }
        }
    }
}