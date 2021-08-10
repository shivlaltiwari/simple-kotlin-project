package com.example.todoapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

class TodoAdapter(
    private val todos: MutableList<Todo>,

): RecyclerView.Adapter<TodoAdapter.TodoViewHolder>() {
    class TodoViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        return TodoViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_todo,
                parent,
                false
            )
        )
    }
    fun addTodo(todo: Todo ){
        todos.add(todo)
        notifyItemInserted(todos.size-1)

    }
    fun deletDoneTodo(){
        todos.removeAll {  todo ->
           todo.isChecked

        }
        notifyDataSetChanged()
    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
    val curTodo = todos[position]
        holder.itemView.apply {
        val textview = findViewById<TextView>(R.id.tvTodoTitle)
            textview.text = curTodo.title
            val value : CheckBox? = findViewById <CheckBox>(R.id.cbDone)
           // value.isChecked = curTodo.isChecked
           // value.text = curTodo.title
        }
    }

    override fun getItemCount(): Int {
    return todos.size
    }
}