package com.example.myquizapplication;

public class QuestionAnswer {

    public static String[] question ={
            "What do you use to create text in Android Studio?",
            "What is the primary language used in Android Studio?",
            "Which one of these is not used to connect an app to live data?",
            "Which one of these views allows us to display dynamic list?"
    };

    public static String[][] choices = {
            {"Text","TextView","ViewText","text"},
            {"Racket","Kotlin","Notepad","Python"},
            {"APPIs","HTML","HTTP","JSON"},
            {"TextView","ListView","GridView","RecyclerView"}
    };

    public static String[] correctAnswers = {
            "TextView",
            "Kotlin",
            "HTML",
            "RecyclerView"
    };

}