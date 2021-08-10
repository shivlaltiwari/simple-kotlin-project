package com.example.todoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var todoAdapter: TodoAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        todoAdapter =TodoAdapter(mutableListOf())
        val listtodo = findViewById<RecyclerView>(R.id.rvTodoItem)
        listtodo.adapter = todoAdapter
        listtodo.layoutManager = LinearLayoutManager(this)
        val btnAddTodo = findViewById<Button>(R.id.btnAddTodo)
        val btnDelTodo = findViewById<Button>(R.id.btnDelTodo)
        val etTodoTitle = findViewById<EditText>(R.id.etTodoTitle)
        btnAddTodo.setOnClickListener{
            val todoTitle = etTodoTitle.text.toString()
            if(todoTitle.isNotEmpty()){
                val todo = Todo(todoTitle)
                todoAdapter.addTodo(todo)
                etTodoTitle.text.clear()
            }
        }
        btnDelTodo.setOnClickListener{
            todoAdapter.deletDoneTodo()
        }

    }
}