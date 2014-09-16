package questions.controller;

import java.util.Scanner;

import javax.swing.JOptionPane;



public class Questions
{
	private Scanner questionScanner;
	private int numberOfQuestions;
		public Questions()
		{
			questionScanner = new Scanner(System.in);
			numberOfQuestions = 4;
		}
	
			public void start() throws InterruptedException
			{
				//askQuestions();
				askQuestionsGUI();
			}
		
			
			private void askQuestionsGUI()
			{
				
				String answerGUI = JOptionPane.showInputDialog("what is your name?");
				answerGUI = JOptionPane.showInputDialog("Hi, " + answerGUI + ". Whats your favorite color");
			
				answerGUI = JOptionPane.showInputDialog("What do you like to do?");
				if(answerGUI.equalsIgnoreCase("games"))
				{
					answerGUI = JOptionPane.showInputDialog(answerGUI + "? Thats awesome! What else do you like to do?");
				}
				else
				{
					answerGUI = JOptionPane.showInputDialog("So you like to " + answerGUI + ". Thats Interesting");
				}
				answerGUI = JOptionPane.showInputDialog("What is your favorite game?");
				if(answerGUI.equalsIgnoreCase("Legend of zelda")||(answerGUI.equalsIgnoreCase("metroid")))
				{
					answerGUI = JOptionPane.showInputDialog( answerGUI +" thats my favorite game of all time!");
				}
				else
				{
					answerGUI = JOptionPane.showInputDialog( answerGUI +" , Oh thats a nice game.");
				}
				

			}
			
	
	/*private void askQuestions()// throws InterruptedException
	{
		System.out.println("What do you like to do?");
		String answer = questionScanner.nextLine();
		if(answer.equalsIgnoreCase("games"))
			
		{
			System.out.println("Oh thats awesome, I like to do that too");
		}
			else
			{
				System.out.println("Oh you like to " + answer +"? that's cool, I like to play games, How old are you");
			}
		
		System.out.println("Why, hello there " + answer + ". How are you today?");
		answer = questionScanner.nextLine();
		if(answer.equalsIgnoreCase("bad"))
			
			{
				System.out.println("Oh that's terrible, What have you done today?");
			}
				else
				{
					System.out.println("You feel " + answer +"? that's nice, What have you done today?");
				}
	
				answer = questionScanner.nextLine();
				if (answer.equals("16"))
				{
				System.out.println("im 16 too");
				}
					
				//System.out.println( answer +"Wow im 16");
				/*System.out.println("What is your favorite Game?");
				answer = questionScanner.nextLine();
					if (answer.equalsIgnoreCase("legend of Zelda"))	
					{
						System.out.println( answer +"? That's my FAVORITE game of all time!");
					}
						else if (answer.equalsIgnoreCase("Metroid"))	
						{
							System.out.println( answer +"? That's one of my FAVORITE game of all time!");
						}	
							else
							{	
								System.out.println( answer +"? That one is alright I guess not my favorite though");
							}
									answer = questionScanner.nextLine();
								*/
		
		
	}		

