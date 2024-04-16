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
	
	JFrame frame = new JFrame();
	
	JTextField textfield = new JTextField();
	JTextField numbers_rigth = new JTextField();
	JTextField percentage = new JTextField();
	
	JTextArea textarea = new JTextArea();
	
	JButton btnA  = new JButton();
	JButton btnB  = new JButton();
	JButton btnC  = new JButton();
	JButton btnD  = new JButton();
	
	JLabel answer_labelA = new JLabel();
	JLabel answer_labelB = new JLabel();
	JLabel answer_labelC = new JLabel();
	JLabel answer_labelD = new JLabel();
	JLabel timbe_label = new JLabel();
	JLabel second_left = new JLabel();
	
	
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
