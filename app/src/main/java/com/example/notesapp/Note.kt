package com.example.notesapp

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "notes_table")
class Note(@ColumnInfo(name = "text")val text:String) {

    @ColumnInfo(name = "id")
    @PrimaryKey(autoGenerate = true)var id=0
}