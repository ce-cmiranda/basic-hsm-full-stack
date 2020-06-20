import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	List <Float> medias_dos_alunos = new ArrayList<>();
	List <String> resultado_alunos = new ArrayList<>();
	
	int alunos_aprovados = 0, alunos_reprovados = 0, alunos_af = 0;


	Scanner input = new Scanner(System.in);
	System.out.println("Quantos alunos têm na turma?");
	int qtd_alunos = input.nextInt();
	input.close();
	
	Scanner input_notas = new Scanner(System.in);
	for (int i = 1; i <= qtd_alunos; i++){
		
		float prova = 0;
		float projeto = 0;
		float lista = 0;
		int peso_prova = 5, peso_projeto = 3, peso_lista = 2;
		
		
		
        System.out.println("Qual a nota da prova do aluno "+ i + "? (0-10)");  
        prova = Float.parseFloat(input_notas.nextLine());
        System.out.println("Qual a nota do projeto do aluno "+ i + "? (0-10)");  
        projeto = Float.parseFloat(input_notas.nextLine());
        System.out.println("Qual a nota da lista de exercícios do aluno "+ i + "? (0-10)");  
        lista = Float.parseFloat(input_notas.nextLine());
        

        
        float media_aluno = (prova * peso_prova + projeto * peso_projeto + lista * peso_lista) / (peso_projeto + peso_prova + peso_lista);
        medias_dos_alunos.add(media_aluno);
        
        if (media_aluno < 5) {
        	resultado_alunos.add("Reprovado");
        	alunos_reprovados =+ 1;
        }
        else if (media_aluno <= 7.9) {
        	resultado_alunos.add("Avaliação Final (AF)");
        	alunos_af =+ 1;
        }
        else {
        	resultado_alunos.add("Aprovado");
        	alunos_aprovados =+ 1;
        }   
        input_notas.close();
	}
	
	System.out.println("A maior nota foi: "+ Collections.max(medias_dos_alunos));
	System.out.println("A maior nota foi: "+ Collections.min(medias_dos_alunos));
	
	float media_turma;
	float soma_notas = 0;
	
	for (float nota : medias_dos_alunos) {
		soma_notas =+ nota;
	}
	
	media_turma = soma_notas/qtd_alunos;
	System.out.println("A média da turma foi: "+ media_turma);
	System.out.println("A quantidade de alunos aprovados foi: "+ alunos_aprovados);
	System.out.println("A quantidade de alunos com avaliação final foi: "+ alunos_af);
	System.out.println("A quantidade de alunos reprovados foi: "+ alunos_reprovados);
	
	
	}
}
