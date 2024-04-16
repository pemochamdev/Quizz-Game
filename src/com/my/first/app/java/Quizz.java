package com.my.first.app.java;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Quizz implements ActionListener{
	
	String[] questions = {
							"Which compagny created Java",
							"Which year was Java created",
							"What was Java originally called",
						};
	String[][] options = {
							{"Microsoft", "Sun Microsystem","Starbuck","Alphabet"},
							{"1989", "1996","1972", "1490"},
							{"Apple", "Latt", "Oak", "Koffing"}
						};
	char[] answers = {
						'A',
						'B',
						'C',
					};
	char guess;
	char answer;
	int index;
	int correct_guesses = 0;
	int total_questions = questions.length;
	int result;
	int seconds = 10;
	
	public  Quizz() {
		
	}

	public void nextQuestion() {
		
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public void displayAnswer() {
		
	}
	
	public void results() {
		
	}
	
}
