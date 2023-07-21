package com.example.roomdemo

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Upsert
import kotlinx.coroutines.flow.Flow

@Dao
interface EmployeeDao {

    @Insert
    suspend fun insert(employeeEntity: EmployeeEntity)

    @Upsert
    suspend fun update(employeeEntity: EmployeeEntity)

    @Delete
    suspend fun delete(employeeEntity: EmployeeEntity)

    @Query("SELECT * FROM EmployeeEntity")
    suspend fun fetchAllEmployees(): Flow<List<EmployeeEntity>>

    @Query("SELECT * FROM EmployeeEntity WHERE id=:id")
    suspend fun fetchEmployeeById(id: Int): Flow<EmployeeEntity>
}
