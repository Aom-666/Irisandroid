package com.example.Irisandroid

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.irisandroid.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // รับค่า EditText
        val sepalLengthInput = findViewById<EditText>(R.id.sepal_length)
        val sepalWidthInput = findViewById<EditText>(R.id.sepal_width)
        val petalLengthInput = findViewById<EditText>(R.id.petal_length)
        val petalWidthInput = findViewById<EditText>(R.id.petal_width)

        // รับค่า Button
        val predictButton = findViewById<Button>(R.id.btnPredict)

        // ตั้งค่า OnClickListener สำหรับปุ่ม
        predictButton.setOnClickListener {
            val sepalLength = sepalLengthInput.text.toString()
            val sepalWidth = sepalWidthInput.text.toString()
            val petalLength = petalLengthInput.text.toString()
            val petalWidth = petalWidthInput.text.toString()

            // ตรวจสอบว่าไม่มีฟิลด์ไหนว่าง
            if (sepalLength.isNotEmpty() && sepalWidth.isNotEmpty() && petalLength.isNotEmpty() && petalWidth.isNotEmpty()) {
                // นำค่าที่รับมาไปประมวลผล
                // ในที่นี้จะแสดงผลเป็น Toast แทน
                val result = "Sepal Length: $sepalLength, Sepal Width: $sepalWidth, Petal Length: $petalLength, Petal Width: $petalWidth"
                Toast.makeText(this, result, Toast.LENGTH_LONG).show()

                // คุณสามารถเพิ่มโค้ดเพื่อส่งข้อมูลไปยัง API ที่นี่
            } else {
                Toast.makeText(this, "กรุณากรอกข้อมูลให้ครบทุกช่อง", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
