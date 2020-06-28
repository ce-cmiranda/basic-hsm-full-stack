import java.util.Arrays;
import java.util.Random;
import java.util.Collections;

public class Ex_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Cria o array que vai armazenar os valores das médias diárias
		double daily_price [] = new double[28];
		//Define qual será o valor máximo e mínimo que será gerado aleatoriamente para as médias diárias
		double max = 15,  min = 10;
		//Auxiliar para cálculo da média diária
		double range = max - min;
		Random rd = new Random();
		
		//Preenche os valores das médias diárias com valores fictícios
		for (int i = 0; i < 28; i++) {
			
			//Aloca valores aleatórios para a média diária dentro do array
			//Arredondando para duas casas decimais
			daily_price [i] = Math.ceil((min + rd.nextFloat()*range)*100)/100;	
			
			//Informa o usuário o valor da média diária
			System.out.println((i + 1) +" - "+ daily_price[i]);
		}
		
		double month_total = 0;
		
		//Faz as tratativas semanais
		for (int k = 0; k <4; k++) {
			double week_prices [] = Arrays.copyOfRange(daily_price, k*7, k*7+7);
			double total = 0;
			double max_week = 0;
			double min_week = 100;
			for (int j = 0; j < 7; j++) {
				total += week_prices[j];
				//Atualiza máxima e mínima da semana
				if (week_prices[j] > max_week) {
					max_week = week_prices[j]; 
				}
				else if (week_prices[j] < min_week) {
					min_week = week_prices[j];
				}

			}
			double week_average = Math.ceil(total/7*100)/100;
			System.out.println("A média da semana " + (k+1) + " foi de "+week_average+", com máxima de "
			+ max_week + " e mínima de "+min_week);
			
			month_total += week_average;
		}
		
		//Faz a tratativa mensal
		double month_average = Math.ceil(month_total/4*100)/100;
		
		System.out.println("A média do mês foi de "+ month_average);	

	}

}
