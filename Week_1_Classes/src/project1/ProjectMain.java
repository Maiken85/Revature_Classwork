package project1;
/*
 * Michael Aiken
 * Week 1 Project using what was learned in week 1
 * October 25 2020
 */

import java.util.*;

public class ProjectMain {

	
public static void main(String[] args) {

		Games g1 = new Games();
		g1.setId(0);
		g1.setName("Tekken");
		g1.setReleaseDate(2007);
		g1.setConsole("Ps4");
		Games g2 = new Games();
		g2.setId(1);
		g2.setName("Grand Theft Auto");
		g2.setReleaseDate(1999);
		g2.setConsole("Ps4");
		Games g3 = new Games();
		g3.setId(2);
		g3.setName("Halo");
		g3.setReleaseDate(2017);
		g3.setConsole("Xbox");
		Games g4 = new Games();
		g4.setId(3);
		g4.setName("Doom");
		g4.setReleaseDate(2020);
		g4.setConsole("Xbox");
		
//		g1.printGame();
//		g2.printGame();
//		g3.printGame();
//		g4.printGame();
		
		Scanner i = new Scanner(System.in);
		int amtOfPlayers;
		int b = 0;
		
		// make sure user inserts a number
		do {
		    System.out.println("Please enter the number of player(s) you wish to enter :");
		    while (!i.hasNextInt()) {
		        System.out.println("That's not a number. Please enter number of player(s)");
		        i.next();
		    }
		     amtOfPlayers = i.nextInt();
		} while (amtOfPlayers <= 0);		
		System.out.println("You have entered "+amtOfPlayers+" players.\n");
		
		String [][] playerArray = new String[amtOfPlayers][5];
		int [][] gameArray = new int [amtOfPlayers][4];
		
		 Players player = new Players();
		for(int t =0; t< amtOfPlayers; t++) {
			
			//sets id
			player.setId(t);			
			playerArray [t][0]= Integer.toString(player.getId());
			
			//sets first name
			System.out.println("Please enter player "+(t+1)+"'s First Name. ");
			player.setFname(i.next());
			playerArray [t][1]= player.getFname();
			
			//sets last name
			System.out.println("Please enter player "+(t+1)+"'s Last Name. ");
			player.setLname(i.next());
			playerArray [t][2]= player.getLname();
			
			//sets age to number only			
			boolean inputNum = false;
			while (!inputNum) {
	            try {
	    			System.out.println("Please enter player "+(t+1)+"'s Age. ");
	    			int age=(Integer.parseInt(i.next()));
		    		if(age>0) {
		    			player.setAge(age);
			    		playerArray [t][3]=Integer.toString(player.getAge());
		            inputNum = true;
		    		}else {System.out.println("Please enter a postive number");}
		                
	            } catch (NumberFormatException e) {
	                System.out.println("Not a valid number.");
	            }
	        }
			
			
			//sets sex
			System.out.println("Please enter player"+(t+1)+"'s Sex. 1 For Male - 2 For Female ");
			player.setSex(Integer.parseInt(i.next()));
			    int num = player.getSex();
			    //makes sure user enters 1 or 2
			    while(num >2 || num <1) {
			    	
			    	System.out.println("Please enter 1 for male and 2 for female.");
			    	player.setSex(Integer.parseInt(i.next()));
				     num = player.getSex();
			    }
			    //sets male or female
			    switch(num) {
				case 1:
					playerArray [t][4]= "Male";
					break;
				case 2:
					playerArray [t][4]= "Female";
					break;
			    }
			    //sets up games
			    System.out.println("How many games has player "+(t+1)+" played? ");
				int gamNum=(Integer.parseInt(i.next()));
				
				System.out.println("What games have player "+(t+1)+" played");
				System.out.println("1.) Tekken");
				System.out.println("2.) Grand Theft Auto");
				System.out.println("3.) Halo");
				System.out.println("4.) Doom");
				
				 b = gamNum;
				
				for (int p=0;p<gamNum;p++) {
					System.out.println("Please enter corresponding numbers: ");
				gameArray [t][p]= Integer.parseInt(i.next());
				}
				
			    System.out.println();
		}
		//nested for loop to set players to print
		for(int r=0;r < amtOfPlayers; r++) {
			
		
			for (int c=0; c<5; c++) {
			
				
				if(c == 0) {
					player.setId(Integer.parseInt(playerArray[r][0]));					
				}else if(c == 1) {
					player.setFname(playerArray[r][1]);
				}else if(c == 2) {
					player.setLname(playerArray[r][2]);
				}else if(c == 3) {
					player.setAge(Integer.parseInt(playerArray[r][3]));
				}else if(c == 4) {
					player.setMf(playerArray[r][4]);
					break;
				}				
			}
			//Prints games played
			player.printPlayer();
			System.out.println("Games that "+player.getFname()+" has played");
			for(int q=0; q <b;q++) {
				int k = gameArray[r][q];
				switch(k) {

				case 1:
					g1.printGame();
					break;
				case 2:
					g2.printGame();
					break;
				case 3:
					g3.printGame();
					break;
				case 4:
					g4.printGame();
					break;
					
				}
				
			}
		}
		
i.close();
	}
		
}
