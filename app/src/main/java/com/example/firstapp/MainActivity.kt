package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        setContentView(R.layout.activity_main)

        super.onCreate(savedInstanceState)
        val edtNumOne=findViewById<EditText>(R.id.edt_num_one)
        val edtNumTwo=findViewById<EditText>(R.id.edt_num_two)

        val btnSum=findViewById<Button>(R.id.btn_sum)
        val btnSub=findViewById<Button>(R.id.btn_sub)
        val btnMult=findViewById<Button>(R.id.btn_mult)
        val btnDiv=findViewById<Button>(R.id.btn_div)

        val txtResult=findViewById<TextView>(R.id.txt_result)



        btnSum.setOnClickListener {
            var numOne:Int=edtNumOne.text.toString().toInt()
            var numTwo:Int=edtNumTwo.text.toString().toInt()
            var result=numOne+numTwo
            txtResult.text=result.toString()
        }
        btnSub.setOnClickListener {
            var numOne: Int = edtNumOne.text.toString().toInt()
            var numTwo: Int = edtNumTwo.text.toString().toInt()
            var result = numOne - numTwo
            txtResult.text = result.toString()
        }
        btnMult.setOnClickListener {
            var numOne:Int=edtNumOne.text.toString().toInt()
            var numTwo:Int=edtNumTwo.text.toString().toInt()
            var result=numOne*numTwo
            txtResult.text=result.toString()
        }
        btnDiv.setOnClickListener {
            var numOne: Int = edtNumOne.text.toString().toInt()
            var numTwo: Int = edtNumTwo.text.toString().toInt()
            var result = numOne / numTwo
            txtResult.text = result.toString()
        }
    }
}
