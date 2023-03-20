import java.util.Scanner;
public class volumen_pravoagolnik {

	public static void main(String[] args) 
	{ 
		double str1,str2, str3,visina,L,P;
		Scanner tastatura= new Scanner (System.in);
		System.out.println("Programata presmetuva perimetar na raznostran triagolnik.");
		System.out.println("Vnesete ja prvata strana");
		str1=tastatura.nextDouble();
		System.out.println("vnesete ja vtorata strana");
		str2=tastatura.nextDouble();
		System.out.println("Vnesete ja tretata strana");
		str3=tastatura.nextDouble()	;

		L=str1+str2+str3;
System.out.println("Perimetarot na pravoagolnikot e: "+ L);
		}
	}
