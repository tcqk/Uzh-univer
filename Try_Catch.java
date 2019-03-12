
public class Try_Catch {
	public static void main(String[] args) {
		try {
			int[] mas = new int[2];
			mas[1] = 2;
			//mas[2] = 3;
			//if (mas[2] == 3)
			if (mas[1] == 2)
			throw new Exception("lashdfkajsdfljk;askdfhaskfaf");
			System.out.println("tratata");
		}
		catch (Exception y) {
			System.out.println(y.getMessage());
			y.printStackTrace();
			//return;
		}
		finally{
		System.out.println("dafasdad");
		}

int[] numbers = new int[3];
try{
	numbers[6]=45;
	numbers[6]=Integer.parseInt("gfd");
}
catch(ArrayIndexOutOfBoundsException ex){
	System.out.println("Выход за пределы массива");
}
catch(NumberFormatException o){
	System.out.println("Ошибка преобразования из строки в число");
	o.printStackTrace();
}
}
	
}