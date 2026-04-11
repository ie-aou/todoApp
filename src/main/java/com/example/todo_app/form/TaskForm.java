package com.example.todo_app.form;
import java.util.Date;
import lombok.Data;

@Data
public class TaskForm {
    private String title;
    private String startDate;
    private String dueDate;
    private String priority;
    private String detail;
}    

