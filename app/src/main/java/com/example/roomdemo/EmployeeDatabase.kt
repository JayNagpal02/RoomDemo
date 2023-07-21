package com.example.roomdemo

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(
    entities = [EmployeeEntity::class],
    version = 1
)
abstract class EmployeeDatabase : RoomDatabase() {
    abstract val employeeDao: EmployeeDao

    companion object {
        private var instance: EmployeeDatabase? = null

        fun getInstance(context: Context): EmployeeDatabase {
            if (instance == null) {
                instance =
                    Room.databaseBuilder(context.applicationContext, EmployeeDatabase::class.java, "employee_database")
                        .build()
            }
            return instance!!
        }
    }
}
