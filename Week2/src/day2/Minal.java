package day2;
import java.util.Scanner;
public class Minal {
	
	private static final String It = null;
	private static final int selec = 0;

	public static void main(String[] args){

	Scanner pp = new Scanner(System.in);
	System.out.println("What is your full name");
	String name = pp.nextLine();
	System.out.println("Welcome to nepaquiz" + " " + name + ".");

	System.out.println(name + "!");
	System.out.println("Are you excited to play this game? (yes/no)");
	String exci = pp.nextLine();
	String uk = "URUGUAY";
	String java = "JAVA";
	String jm = "JAMES GOSLING";
	String bk = "KYRIE";
	String yah = "yes";
	String nah = "no";
	String m = "sports";
	String h = "history";
	String it = "It";
	String mov = "movies";
	String a = "ARGENTINA";
	String typ="BOOLEAN";

	if (exci.equals(yah)) {
	    System.out.println("Then let's start the game");
	    System.out.println("These are the rules for the game");
	    System.out.println("1. The quiz game has 4 different sections.");
	    System.out.println("2. You have to select one of the four sections to play the quiz on the topic you are interested in.");
	    System.out.println("3. Every section has 10 questions each and each question contains 10 marks.");
	    System.out.println("4. To win the quiz, you must get 8 questions correct, which is 80 percent.");
	    System.out.println("I HOPE YOU UNDERSTOOD THE GAME" + " " + name.toUpperCase() + " " + "So let's play this game");
	    System.out.println("Choose any one section. If you have selected, type any word from the bracket (sports, history, It, movies)");
	    String selec = pp.nextLine();
	    

	}else{
	System.out.println("thanks");


	}


	    
	    //select case
	    switch (selec){
	    case sports:
	    	System.out.println("Good luck" + " " + name.toUpperCase() + "! However, please make sure your answers are in capital.");
	    	System.out.println("1. WHO WON THE WORLD CUP 2023");
	    	String won = pp.nextLine();
	    	if (won.equals(a)) {
	    		System.out.println("You are correct! YOU HAVE RECEIVED 10 POINTS");
	    		} else {
	    			System.out.println("WRONG!");
	    			}
	    	
	    	
	    	System.out.println("2. HOW MANY BALLON D'OR DOES MESSI HAVE?");
	    	int ball = pp.nextInt();
	        if (ball == 7) {
	        	System.out.println("You are correct! YOU HAVE RECEIVED 10 POINTS!");
	        	} else {
	        		System.out.println("You are wrong");
	        		}
	        System.out.println("3. HOW MANY WWE CHAMPIONSHIPS DOES JOHN CENA HAVE");
	        
	        int john=pp.nextInt();
	        if(john==16){
	System.out.println("You are correct! YOUHAVE RECIEVED 10 POINT");
	}else{
	System.out.println("You are wrong");
	}
	System.out.println("4.WHO WEARS NUMBER 11 JERSEY FROM BROOKLYN NETS");
	String kai=pp.nextLine();
	if(kai.equals(bk)){
	System.out.println("You are correct! YOUHAVE RECIEVED 10 POINT");
	}else{
	System.out.println("WRONG!");
	}
	System.out.println("5.WHICH TEAM WON THE FIRST WORLDCUP?");   
	String mon=pp.nextLine();
	if(mon.equals(uk)){
	System.out.println("You are correct! YOUHAVE RECIEVED 10 POINT");
	}else{
	System.out.println("WRONG!");
	}
	System.out.println("6.HOW MANY PLAYER CAN PLAY IN THE BASKETBALL COURT FROM ONE PLAY");
	int call=pp.nextInt();
	if(call==5){
	System.out.println("You are correct! YOUHAVE RECIEVED 10 POINT!");
	}else{
	System.out.println("You are wrong");
	}
	System.out.println("7.HOW MANY CHAMPIONSHIP RING DOES MICHAEL JORDAN HAVE");
	int mic=pp.nextInt();
	if(mic==6){
	System.out.println("You are correct! YOUHAVE RECIEVED 10 POINT!");
	}else{
	System.out.println("You are wrong");
	}
	String fra="FRANCE";

	System.out.println("8.WHICH TEAM WON THE 2018 WORLDCUP?");   
	String hhh=pp.nextLine();
	if(hhh.equals(fra)){
	System.out.println("You are correct! YOUHAVE RECIEVED 10 POINT");
	}else{
	System.out.println("WRONG!");
	}
	String gg="RONALDO";

	System.out.println("9.WHICH PLAYER RECIEVED THE 200 MILLION DOLLAR CONTRACT");
	String bbb=pp.nextLine();
	if(bbb.equals(gg)){
	System.out.println("You are correct! YOUHAVE RECIEVED 10 POINT");
	}else{
	System.out.println("WRONG!");
	}
	String ww="WILT";
	System.out.println("10. WHICH PLAYER SCORED 100 PONT IN ONE NBA GAME?");    
	String iii=pp.nextLine();
	if(iii.equals(ww)){
	System.out.println("You are correct! YOU HAVE RECIEVED 10 POINT");
	}else{
	System.out.println("WRONG!");
	}
	System.out.println("This is the end of sports quiz section");
	System.out.println("how many of them did u make right?");
	int numm=pp.nextInt();
	if(numm>7){
	System.out.println("CONGRATS"+" "+name.toUpperCase() +"!. YOU HAVE SUCCESSFULLY WON THIS SPORTS SECTION BY CROSSING 80 PERCENT");
	}else{
	System.out.println("I am sorry"+name+" "+"you lost the game"); 
	}
    
	break;

	//NEXT FIELD
	case It:
	System.out.println("Good luck for this it game where it contains total of 5 questions" + " " + name.toUpperCase() + "! However, please make sure your answers are in capital.");
	System.out.println("Goodluck"+" "+name.toUpperCase() +"! However please make sure your answers are in capital");
	System.out.println("1.WHO CREATED JAVA PROGRAMMING LANGUAGE");
	String jav=pp.nextLine();
	if(jav.equals(java)){
	System.out.println("You are correct! YOUHAVE RECIEVED 10 POINT");
	}else{
	System.out.println("WRONG!");
	}

	System.out.println("2.HOW MANY USABLE RESERVED WORDS ARE THERE IN JAVA?");
	int rese=pp.nextInt();
	if(rese==48){
	System.out.println("You are correct! YOUHAVE RECIEVED 10 POINT!");
	}else{
	System.out.println("You are wrong");
	}
	System.out.println("3.HOW MANY BITS IS THERE IN ONE BYTE");    
	int biti=pp.nextInt();
	if(biti==8) {
	System.out.println("You are correct! YOUHAVE RECIEVED 10 POINT");
	}else{
	System.out.println("You are wrong");
	}
	System.out.println("4.WHO CREATED JAVA PROGRAMMING LANGUAGGE");
	String jam=pp.nextLine();
	if(jam.equals(jm)){
	System.out.println("You are correct! YOUHAVE RECIEVED 10 POINT");
	}else{
	System.out.println("WRONG!");
	}
	System.out.println("5.WHICH DATATYPE GIVE TRUE OR FALSE IN JAVA");
	String dat=pp.nextLine();
	if(jam.equals(typ)){
	System.out.println("You are correct! YOUHAVE RECIEVED 10 POINT");
	}else{
	System.out.println("WRONG!");
	}


	System.out.println("This is the end of sports quiz section");
	System.out.println("how many of them did u make right?");
	int num=pp.nextInt();
	if(numm>7){
	System.out.println("CONGRATS"+" "+name.toUpperCase()+"!. YOU HAVE SUCCESSFULLY WON THIS SPORTS SECTION BY CROSSING 80 PERCENT");
	}else{
	System.out.println("I am sorry"+name+" "+"you lost the game"); 
	}
	    }

	
	
	}


}
