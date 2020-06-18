import java.util.Scanner;

public class Ex_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
        System.out.println("Insira a nota da prova: (0-10)");  
        float prova = input.nextFloat();  
        
        System.out.println("Insira a nota do projeto: (0-10)");  
        float projeto = input.nextFloat();
        
        System.out.println("Insira a nota da lista de exercícios: (0-10)");  
        float lista = input.nextFloat();
        
        System.out.println("Insira a nota de atividades extras: (0-10)");  
        float ativ = input.nextFloat();
       
		input.close();
		
		float media = (prova * 3 + projeto * 3 + lista * 2 + ativ * 3)/11;

		if (media >= 8 && media <= 10) {
		    System.out.println("O aluno foi Aprovado. Sua média foi: "+ media);
		} else if (media > 0) {
			System.out.println("O aluno foi Reprovado. Sua média foi: "+ media);
		}
		else {
			System.out.println("A média calculada é inválida, por favor revise as notas");
		}
		
		
	}

}
