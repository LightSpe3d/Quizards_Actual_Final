package com.example.finn.quizards;

public class Questions {

    public String mQuestions [] = {
            "Which fictional city is the home of Batman?",
            "Spinach is high in which mineral?",
            "What is a Geiger Counter used to detect?",
            "Which type of dog has breeds called Scottish, Welsh and Irish?",
            "Babe Ruth is associated with which sport?",
            "Which Roman emperor supposedly fiddled while Rome burned?",
            "What’s the total number of dots on a pair of dice?",
            "Which planet is the closest to Earth?",
            "Which is the tallest mammal?",
            "Is this an amazing quiz?",
    };

    public String mAnswers[] [] = {
            {"New York", "Metropolis", "Gotham", "America"},
            {"Iron", "Magnesium", "Potassium", "Spinachium"},
            {"Dogs", "Geigers", "Radiation", "Wind Direction"},
            {"Terrier", "Hound", "Retriever", "Shepherd"},
            {"Acoustic Guitar", "Football", "Hacky-Sack", "Baseball"},
            {"Caesar", "Nero", "Emperor Fiddlesalot", "Galileo"},
            {"40", "36", "42", "38"},
            {"Venus", "Mars", "The Moon", "Jupiter"},
            {"Blue Whale", "Elephant", "Giraffe", "Shaquille O'Neal"},
            {"Yes", "No", "Not Sure", "That's subjective"}
    };

    public String mCorrect[] = {"Gotham", "Iron", "Radiation", "Terrier", "Baseball", "Nero", "42", "Venus", "Giraffe", "Yes"};

    public String getQuestion (int a) {
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a) {
        String choice = mAnswers[a][0];
        return choice;
    }

    public String getChoice2(int a) {
        String choice = mAnswers[a][1];
        return choice;
    }

    public String getChoice3(int a) {
        String choice = mAnswers[a][2];
        return choice;
    }

    public String getChoice4(int a) {
        String choice = mAnswers[a][3];
        return choice;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrect[a];
        return answer;
    }
}
