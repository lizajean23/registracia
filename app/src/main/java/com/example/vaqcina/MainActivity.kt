package com.example.vaqcina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.ActionBar
import java.io.CharArrayWriter

class MainActivity : AppCompatActivity() {

    private lateinit var yes : CheckBox
    private lateinit var no : CheckBox
    private lateinit var name : EditText
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {

        val actionBar: ActionBar?= supportActionBar
        actionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        yes = findViewById(R.id.yes)
        no = findViewById(R.id.no)
        name =  findViewById(R.id.name)
        button = findViewById(R.id.button)

        button.setOnClickListener{

            if (yes.isChecked && no.isChecked){
                Toast.makeText(this, "მონიშნეთ ერთ-ერთი პასუხი", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if (yes.isChecked && name.text.isEmpty() ){
                name.error = "გთხოვთ შეიყვანოთ თქვენ მიერ გაკეთებული ვაქცინა"
                return@setOnClickListener

            }
            else if (no.isChecked && !name.text.toString().isEmpty()){
                Toast.makeText(this, "თქვენ არ ხართ ვაქცინირებული", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            Toast.makeText(this, "GAGZAVNILIA", Toast.LENGTH_SHORT).show()

        }


    }


}

