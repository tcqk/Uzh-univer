package game;
import java.util.Scanner;

public class GameKUBIC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("������ ��� ��'� ");
		String name = scan.next();
		System.out.println("������� ���, " + name);
		System.out.println("������ ��� ����, " + name + "?");
		
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
	    System.out.println("��� �����" + degree);
	    
	    
		boolean run=true;
		int score=0;
		int sproba=0;
		String answerSting="�������";
		   while(run) {
			   System.out.println("������ ������� �� �������?  ");
			   System.out.println("1-���  ");
			   System.out.println("2-����  ");
			   System.out.println("3-��  ");
			   System.out.println("4-������  ");
		int answer=scan.nextInt();
	    switch (answer) {
	    case 1 : answerSting = "�������";
	    break;
	    case 2 : answerSting = "�������";
	    break;
	    case 3 : answerSting = "���������";
	    score ++;
	    run=false;
	    break;
	    case 4 : answerSting = "�������";
	    break;}
	    
	    sproba ++;
	    System.out.println(answerSting);
	    System.out.println("���� ������ " + sproba );
	    System.out.println("���� ����  " + score);
	    if (sproba==2) {System.out.println("������ �����������");
	    run=false;
	    }
			   
	    System.out.println("���� ���� ���?  ");
		   System.out.println("1-������  ");
		   System.out.println("2-�����  ");
		   System.out.println("3-������  ");
		   System.out.println("4-������  ");
	    int answer1=scan.nextInt();
        switch (answer1) {
        case 1 : answerSting = "���������";
        score ++;
        run=false;
        break;
        case 2 : answerSting = "�������";
        break;
        case 3 : answerSting = "�������";
        break;
        case 4 : answerSting = "�������";
        break;
        }
        sproba ++ ;
        System.out.println(answerSting);
        System.out.println("���� ������ " + sproba );
        System.out.println("���� ����  " + score);
        if (sproba==2) {System.out.println("������ �����������");
        run=false;   }    
	    
       
     System.out.println("������ ������ � ����? ");
		   System.out.println("1-��� ");
		   System.out.println("2-���  ");
		   System.out.println("3-���������� ");
		   System.out.println("4-������  ");
	 int answer2=scan.nextInt();
     switch (answer2) {
     case 1 : answerSting = "�������";
     break;
     case 2 : answerSting = "�������";
     break;
     case 3 : answerSting = "���������";
              score ++;
     run=false;
     break;
     case 4 : answerSting = "�������";
     break;
     }
     sproba ++ ;
     System.out.println(answerSting);
     System.out.println("���� ������ " + sproba );
     System.out.println("���� ����  " + score);
     if (sproba==2) {System.out.println("������ �����������" );
     run=false;   }
     
     System.out.println("C����� ���� ����������� ����'��? ");
	   System.out.println("1-��� ");
	   System.out.println("2-���  ");
	   System.out.println("3-���������� ");
	   System.out.println("4-������  ");
    int answer3=scan.nextInt();
    switch (answer3) {
    case 1 : answerSting = "�������";
    break;
    case 2 : answerSting = "�������";
    break;
    case 3 : answerSting = "���������";
        score ++;
    run=false;
    break;
    case 4 : answerSting = "�������";
    break;
          }
    sproba ++ ;
    System.out.println(answerSting);
    System.out.println("���� ������ " + sproba );
    System.out.println("���� ����  " + score);
    if (sproba==2) {System.out.println("������ �����������");
    run=false;   }
			 
		   
		   } 
		
	

	}
}
