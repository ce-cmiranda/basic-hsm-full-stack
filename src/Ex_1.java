import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Ex_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <Float> medias_bimestrais = new ArrayList<>();
		

		Scanner input = new Scanner(System.in);
        for (int i = 1; i < 5; i++){

    	
    	
    	float prova = 0;
    	float projeto = 0;
    	float lista = 0;
    	float ativ = 0;
    	
	
        System.out.println("Insira a nota da prova do bimestre "+ i + ": (0-10)");  
        prova = Float.parseFloat(input.nextLine());  
        
        System.out.println("Insira a nota do projeto do bimestre "+ i + ": (0-10)");  
        projeto = Float.parseFloat(input.nextLine());
        
        System.out.println("Insira a nota da lista de exercícios do bimestre "+ i + ": (0-10)");  
        lista = Float.parseFloat(input.nextLine());
        
        System.out.println("Insira a nota de atividades extras do bimestre "+ i + ": (0-10)");  
        ativ = Float.parseFloat(input.nextLine());
       

    	
		float media = (prova * 3 + projeto * 3 + lista * 2 + ativ * 3)/11;

		medias_bimestrais.add(media);

        }
		input.close();
		
		float soma_notas = 0;
		
		for (float nota : medias_bimestrais) {
			soma_notas = soma_notas + nota;	
		}
//		System.out.println(medias_bimestrais + " - "+soma_notas + " - "+medias_bimestrais.size());
		float media_final = soma_notas / medias_bimestrais.size();
					
		if (media_final >= 8 && media_final <= 10) {
		    System.out.println("O aluno foi Aprovado. Sua média foi: "+ media_final);
		} else if (media_final > 0) {
			System.out.println("O aluno foi Reprovado. Sua média foi: "+ media_final);
		}
		else {
			System.out.println("A média calculada é inválida, por favor revise as notas");
		}
		
		
	}

}
