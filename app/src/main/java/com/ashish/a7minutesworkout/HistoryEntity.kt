package com.ashish.a7minutesworkout

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "history-table")
data class HistoryEntity(
    @PrimaryKey
    val date: String
)
