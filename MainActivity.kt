package com.heetkothari123.tippy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.AbsSeekBar
import android.widget.EditText
import android.widget.SeekBar
import android.widget.TextView

private const val TAG = "MainActivity" // convention for logging is that the TAG will be the classname
class MainActivity : AppCompatActivity() {
    private lateinit var etBaseAmount: EditText // private variable which is initialized late (not in constructor)
    // name of variable = name of id
    private lateinit var seekBarTip: SeekBar
    private lateinit var tvTipPercentLabel: TextView
    private lateinit var tvTipAmount: TextView
    private lateinit var tvTotalAmount: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // UI should be the layout file...
        // ...in resources defined in activity_main.xml
        etBaseAmount = findViewById(R.id.etBaseAmount)
        seekBarTip = findViewById(R.id.seekBarTip)
        tvTipPercentLabel = findViewById(R.id.tvTipPercentLabel)
        tvTipAmount = findViewById(R.id.tvTipAmount)
        tvTotalAmount = findViewById(R.id.tvTotalAmount)

        seekBarTip.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener {
            // defining an anonymous class which defines the OnSeekBarChangeListener public interface
            // have to override these 3 methods in order to comply with OnSeekBarChangeListener (we
            // tell the system what happens when these methods are called)
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                Log.i(TAG, "onProgressChanged $p1") // whenever we change seekbar it will print out
                // current value of seekbar (number from 0 to 30) depending on how far you scroll
                // method that takes a string (TAG) and second one which is also a string
                // which is a message of our log statement
                // p1 is the current value of the seekbar


            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
            }

        })
        // add a listener to the seekbar variable
        // in parantheses tell the Android system what happens when the seekbar is changed
        // implement class inside parantheses
    }
}
