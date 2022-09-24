package com.example.bugtracker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.EditText
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView
import com.google.android.material.tabs.TabLayout.Tab

class MainActivity : AppCompatActivity() {
    private lateinit var btn: Button
    private lateinit var date: EditText
    private lateinit var version: EditText
    private lateinit var name: EditText
    private lateinit var desc: EditText
    private lateinit var tbl: TableLayout


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*The inputs*/
        btn = findViewById(R.id.button)
        date = findViewById(R.id.Date_Input)
        version = findViewById(R.id.Version_Input)
        name = findViewById(R.id.Name_Input)
        desc = findViewById(R.id.Desc_Input)
        tbl = findViewById(R.id.Bug_Table)



        btn.setOnClickListener {
            val d = date.text.toString()
            val v = version.text.toString()
            val n = name.text.toString()
            val ds = desc.text.toString()

            val row: TableRow = TableRow(this@MainActivity)
            val p : TableRow.LayoutParams = TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT,TableRow.LayoutParams.WRAP_CONTENT)
            row.layoutParams = p
            val dv: TextView = TextView(this@MainActivity)
            dv.text = d
            row.addView(dv)
            val vv: TextView = TextView(this@MainActivity)
            vv.text = v
            row.addView(vv)
            val nv: TextView = TextView(this@MainActivity)
            nv.text = n
            row.addView(nv)
            val dsv: TextView = TextView(this@MainActivity)
            dsv.text = ds
            row.addView(dsv)
            tbl.addView(row)
        }
    }
}