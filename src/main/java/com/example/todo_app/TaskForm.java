package com.example.todo_app;
import java.util.Date;
import lombok.Data;

@Data
public class TaskForm {
    private String name;
    private Date startDate;
    private Date dueDate;
    private String priority;
    private String detail;
}    

