import java.util.Random;

public class SnakeAndLadder {

   public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int p1position1=0;
		 int p2position1=0;
	     System.out.println("Player1 is initially at " + p1position1);
	     System.out.println("Player1 is initially at " + p2position1);
	     double dice;
	     int dice_countp1=0;
	     int dice_countp2=0;
	     int value;
	     while(p1position1<=100 || p2position1<=100)
	     {
	     dice=Math.floor(Math.random()*10)%7;
	     if(dice>0)
	     {
	     value=(int)dice;
	     System.out.println("Dice for Player 1 rolled at "+ value);
	     p1position1=p1position1+value;
	     dice_countp1++;
	     }
	     else
	    	 continue;
	     dice=Math.floor(Math.random()*10)%7;
	     if(dice>0)
	     {
	     value=(int)dice;
	     System.out.println("Dice for Player 2 rolled at "+ value);
	     p2position1=p2position1+value;
	     dice_countp2++;
	     }
	    
	     if(p1position1==2)
	     {
	    	 System.out.println("Player1 Ladder to 23");
	    	 p1position1=23;
	     }
	     else if(p1position1==7)
	     {
	    	 System.out.println("Player1 Ladder to 29");
	    	 p1position1=29;
	     }
	     else if(p1position1==22)
	     {
	    	 System.out.println("Player1 Ladder to 41");
	    	 p1position1=41;
	     }
	     else if(p1position1==28)
	     {
	    	 System.out.println("Player1 Ladder to 77");
	    	 p1position1=77;
	     }
	     else if(p1position1==30)
	     {
	    	 System.out.println("Player1 Ladder to 32");
	    	 p1position1=32;
	     }
	     else if(p1position1==54)
	     {
	    	 System.out.println("Player1 Ladder to 69");
	    	 p1position1=77;
	     }
	     else if(p1position1==70)
	     {
	    	 System.out.println("Player1 Ladder to 90");
	    	 p1position1=90;
	     }
	     else if(p1position1==80)
	     {
	    	 System.out.println("Player1 Ladder to 98");
	    	 p1position1=98;
	     }
	     else if(p1position1==27)
	     {
	    	 System.out.println("Player1 Snaked to 6");
	    	 p1position1=6;
	     }
	     else if(p1position1==35)
	     {
	    	 System.out.println("Player1 Snaked to 5");
	    	 p1position1=5;
	     }
	     else if(p1position1==39)
	     {
	    	 System.out.println("Player1 Snaked to 3");
	    	 p1position1=3;
	     }
	     else if(p1position1==50)
	     {
	    	 System.out.println("Player1 Snaked to 34");
	    	 p1position1=34;
	     }
	     else if(p1position1==59)
	     {
	    	 System.out.println("Player1 Snaked to 46");
	    	 p1position1=46;
	     }
	     else if(p1position1==66)
	     {
	    	 System.out.println("Player1 Snaked to 24");
	    	 p1position1=24;
	     }
	     else if(p1position1==73)
	     {
	    	 System.out.println("Player1 Snaked to 12");
	    	 p1position1=12;
	     }
	     else if(p1position1==76)
	     {
	    	 System.out.println("Player1 Snaked to 63");
	    	 p1position1=63;
	     }
	     else if(p1position1==89)
	     {
	    	 System.out.println("Player1 Snaked to 67");
	    	 p1position1=67;
	     }
	     else if(p1position1==97)
	     {
	    	 System.out.println("Player1 Snaked to 75");
	    	 p1position1=75;
	     }
	     else if(p1position1==99)
	     {
	    	 System.out.println("Player1 Snaked to 26");
	    	 p1position1=26;
	     }
	     
	     if(p2position1==2)
	     {
	    	 System.out.println("Player2 Ladder to 23");
	    	 p2position1=23;
	     }
	     else if(p2position1==7)
	     {
	    	 System.out.println("Player2 Ladder to 29");
	    	 p2position1=29;
	     }
	     else if(p2position1==22)
	     {
	    	 System.out.println("Player2 Ladder to 41");
	    	 p2position1=41;
	     }
	     else if(p2position1==28)
	     {
	    	 System.out.println("Player2 Ladder to 77");
	    	 p2position1=77;
	     }
	     else if(p2position1==30)
	     {
	    	 System.out.println("Player2 Ladder to 32");
	    	 p2position1=32;
	     }
	     else if(p2position1==54)
	     {
	    	 System.out.println("Player2 Ladder to 69");
	    	 p2position1=77;
	     }
	     else if(p2position1==70)
	     {
	    	 System.out.println("Player2 Ladder to 90");
	    	 p2position1=90;
	     }
	     else if(p2position1==80)
	     {
	    	 System.out.println("Player2 Ladder to 98");
	    	 p2position1=98;
	     }
	     else if(p2position1==27)
	     {
	    	 System.out.println("Player2 Snaked to 6");
	    	 p2position1=6;
	     }
	     else if(p2position1==35)
	     {
	    	 System.out.println("Player2 Snaked to 5");
	    	 p2position1=5;
	     }
	     else if(p2position1==39)
	     {
	    	 System.out.println("Player2 Snaked to 3");
	    	 p2position1=3;
	     }
	     else if(p2position1==50)
	     {
	    	 System.out.println("Player2 Snaked to 34");
	    	 p2position1=34;
	     }
	     else if(p2position1==59)
	     {
	    	 System.out.println("Player2 Snaked to 46");
	    	 p2position1=46;
	     }
	     else if(p2position1==66)
	     {
	    	 System.out.println("Player2 Snaked to 24");
	    	 p2position1=24;
	     }
	     else if(p2position1==73)
	     {
	    	 System.out.println("Player2 Snaked to 12");
	    	 p2position1=12;
	     }
	     else if(p2position1==76)
	     {
	    	 System.out.println("Player2 Snaked to 63");
	    	 p2position1=63;
	     }
	     else if(p2position1==89)
	     {
	    	 System.out.println("Player2 Snaked to 67");
	    	 p2position1=67;
	     }
	     else if(p2position1==97)
	     {
	    	 System.out.println("Player2 Snaked to 75");
	    	 p2position1=75;
	     }
	     else if(p2position1==99)
	     {
	    	 System.out.println("Player2 Snaked to 26");
	    	 p2position1=26;
	     }
	     
	     
	     
	     
	     if (p1position1>100 || p2position1>100)
	     {
	    	 if(p1position1>100)
	    	 {
	    	 p1position1=p1position1-value;
	    	 continue;
	    	 }
	    	 else
	    	 {
	    		 p2position1=p2position1-value;
		    	 continue;
	    	 }
	     }else if(p1position1==100 || p2position1==100)
	     {
	    	 if(p1position1==100)
	    	 {
	    		 System.out.println();
	    	 System.out.println("Player1 reached 100");
	    	 System.out.println("Player 1 Wins");
	    	 System.out.println();
	    	 break;
	    	 }
	    	 else
	    	 {   System.out.println();
	    		 System.out.println("Player2 reached 100");
	    		 System.out.println("Player 2 Wins");
	    		 System.out.println();
		    	 break; 
	    	 }
	     }
	     System.out.println("Player1 is at "+ p1position1);
	     System.out.println("Player2 is at "+ p2position1);
	     System.out.println();
	     }
	     System.out.println("Player1 is now at "+ p1position1); 
	     System.out.println("Player2 is now at "+ p2position1); 
	     System.out.println();
	  
	} 
}

