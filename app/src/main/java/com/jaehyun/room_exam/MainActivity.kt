package com.jaehyun.room_exam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.room.Room
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val db = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java, "database-name"
        )
            .allowMainThreadQueries()
            .build()

        tv_contents.text = db.todoDao()?.getAll().toString()
        btn_add.setOnClickListener {
            db.todoDao()?.insert(Todo(et_todo.text.toString()))
            tv_contents.text = db.todoDao()?.getAll().toString()
        }
    }
}
