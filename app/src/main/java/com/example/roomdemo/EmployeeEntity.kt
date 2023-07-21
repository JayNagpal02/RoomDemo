package com.example.roomdemo

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity
data class EmployeeEntity(
    val name: String,
    val email: String,
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null
)
