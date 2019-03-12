package game;
import java.util.Scanner;

public class GameKUBIC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Введіть своє ім'я ");
		String name = scan.next();
		System.out.println("Доброго дня, " + name);
		System.out.println("Скільки вам років, " + name + "?");
		
		int ask = scan.nextInt();
		byte degree;
		if (ask <= 10); {
			degree = 1;
		   }
	    if (ask < 10 && ask <= 15) { 
			degree = 2; }
	    else if ( ask > 15 && ask <= 20) {
	    	degree = 3;                  }
	    else if ( ask >20 ) {
	    	degree = 4;      }
	    System.out.println("ваш рівень" + degree);
	    
	    
		boolean run=true;
		int score=0;
		int sproba=0;
		String answerSting="помилка";
		   while(run) {
			   System.out.println("Скільки кольорів має веселка?  ");
			   System.out.println("1-три  ");
			   System.out.println("2-пять  ");
			   System.out.println("3-сім  ");
			   System.out.println("4-десять  ");
		int answer=scan.nextInt();
	    switch (answer) {
	    case 1 : answerSting = "Помилка";
	    break;
	    case 2 : answerSting = "Помилка";
	    break;
	    case 3 : answerSting = "Правильно";
	    score ++;
	    run=false;
	    break;
	    case 4 : answerSting = "Помилка";
	    break;}
	    
	    sproba ++;
	    System.out.println(answerSting);
	    System.out.println("Ваші спроби " + sproba );
	    System.out.println("Ваші бали  " + score);
	    if (sproba==2) {System.out.println("Спроби використано");
	    run=false;
	    }
			   
	    System.out.println("Коли падає сніг?  ");
		   System.out.println("1-взимку  ");
		   System.out.println("2-влітку  ");
		   System.out.println("3-восени  ");
		   System.out.println("4-навесні  ");
	    int answer1=scan.nextInt();
        switch (answer1) {
        case 1 : answerSting = "Правильно";
        score ++;
        run=false;
        break;
        case 2 : answerSting = "Помилка";
        break;
        case 3 : answerSting = "Помилка";
        break;
        case 4 : answerSting = "Помилка";
        break;
        }
        sproba ++ ;
        System.out.println(answerSting);
        System.out.println("Ваші спроби " + sproba );
        System.out.println("Ваші бали  " + score);
        if (sproba==2) {System.out.println("Спроби використано");
        run=false;   }    
	    
       
     System.out.println("Скільки місяців у році? ");
		   System.out.println("1-три ");
		   System.out.println("2-вісім  ");
		   System.out.println("3-дванадцять ");
		   System.out.println("4-десять  ");
	 int answer2=scan.nextInt();
     switch (answer2) {
     case 1 : answerSting = "Помилка";
     break;
     case 2 : answerSting = "Помилка";
     break;
     case 3 : answerSting = "Правильно";
              score ++;
     run=false;
     break;
     case 4 : answerSting = "Помилка";
     break;
     }
     sproba ++ ;
     System.out.println(answerSting);
     System.out.println("Ваші спроби " + sproba );
     System.out.println("Ваші бали  " + score);
     if (sproba==2) {System.out.println("Спроби використано" );
     run=false;   }
     
     System.out.println("Cкільки існує зодіакальних сузір'їв? ");
	   System.out.println("1-три ");
	   System.out.println("2-вісім  ");
	   System.out.println("3-дванадцять ");
	   System.out.println("4-десять  ");
    int answer3=scan.nextInt();
    switch (answer3) {
    case 1 : answerSting = "Помилка";
    break;
    case 2 : answerSting = "Помилка";
    break;
    case 3 : answerSting = "Правильно";
        score ++;
    run=false;
    break;
    case 4 : answerSting = "Помилка";
    break;
          }
    sproba ++ ;
    System.out.println(answerSting);
    System.out.println("Ваші спроби " + sproba );
    System.out.println("Ваші бали  " + score);
    if (sproba==2) {System.out.println("Спроби використано");
    run=false;   }
			 
		   
		   } 
		
	

	}
}
