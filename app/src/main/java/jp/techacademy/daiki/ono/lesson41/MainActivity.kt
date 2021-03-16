package jp.techacademy.daiki.ono.lesson41

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.app.TimePickerDialog
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(),View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1.setOnClickListener(this)
    }

    override fun onClick(v:View){
        when(v.id){
            R.id.button1 -> showTimePickerDialog()
        }
    }

    private fun showTimePickerDialog() {
        val timePickerDialog = TimePickerDialog(
                this,
                TimePickerDialog.OnTimeSetListener { view, hour, minute ->
                   if(2 <= hour && hour<10) {
                       textView1.text = "おはよう"
                   }else if(10<= hour && hour <18){
                       textView1.text="こんにちは"
                   }else{
                       textView1.text="こんばんは"
                   }
                },
                13, 0, true)
        timePickerDialog.show()
    }

}