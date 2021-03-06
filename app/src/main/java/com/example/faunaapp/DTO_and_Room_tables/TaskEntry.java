package com.example.faunaapp.DTO_and_Room_tables;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "entry_table")
public class TaskEntry {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private int categoryId;
    private String heading, title, description, date, time, token;

    public void setToken(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public TaskEntry() {
    }

    @Ignore
    public TaskEntry(String heading, String title, String description, String date, String time, String token) {
        this(heading, title, description, date, time, 1);
        this.token = token;
    }

    @Ignore
    public TaskEntry(String heading, String title, String description, String date, String time, int categoryId)
    {
        this(heading, title, date, time, categoryId);
        this.description = description;
    }
    @Ignore
    public TaskEntry(String heading, String title, String date, String time, int categoryId)
    {
        this.heading = heading;
        this.title = title;
        this.date = date;
        this.time = time;
        this.categoryId = categoryId;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getHeading() {
        return heading;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

}
