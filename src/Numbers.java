import java.util.Scanner;
public class Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner D=new Scanner(System.in);		
System.out.println("Type in three numbers");		
int O=D.nextInt();
int T=D.nextInt();
int Th=D.nextInt();

if(O>Th && T>Th && O>T){
System.out.println("Largest= "+ O);
System.out.println("Smallest= " + Th);
}

else if(O>T && Th>T && O>Th){
System.out.println("Largest= "+ O);
System.out.println("Smallest="+ T);
}

else if(T>O && Th>O && T>Th){
System.out.println("Largest= "+ T);
System.out.println("Smallest="+ O);	
}
		
else if(T>Th && O>Th && T>O){
System.out.println("Largest= "+ T);
System.out.println("Smallest="+ Th);
}

else if(Th>O && O>T && Th>T){
System.out.println("Largest= "+ Th);
System.out.println("Smallest="+ T);
}

else{
	System.out.println("Largest="+ Th);
	System.out.println("Smallest="+ O);
}
		
	}

}
