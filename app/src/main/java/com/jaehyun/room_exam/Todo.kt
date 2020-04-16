package com.jaehyun.room_exam

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class Todo(var title: String) {

    @PrimaryKey(autoGenerate = true)
    var id = 0

    override fun toString(): String {
        val sb = StringBuffer("Todo{")
        sb.append("id=").append(id)
        sb.append(", title='").append(title).append('\'')
        sb.append('}')
        return sb.toString()
    }
}