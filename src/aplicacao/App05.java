package aplicacao;

import java.io.File;
import java.util.Scanner;

public class App05 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Entre com o caminho de um arquivo");
		String strPath= sc.nextLine();
		
		File path= new File(strPath);
		System.out.println("getName: "+ path.getName());
		System.out.println("getPatrent: "+ path.getParent());
		System.out.println("getPath: "+ path.getPath());
		sc.close();

	}

}
