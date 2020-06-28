import java.util.Arrays;
import java.util.Random;
import java.util.Collections;

public class Ex_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Cria o array que vai armazenar os valores das m�dias di�rias
		double daily_price [] = new double[28];
		//Define qual ser� o valor m�ximo e m�nimo que ser� gerado aleatoriamente para as m�dias di�rias
		double max = 15,  min = 10;
		//Auxiliar para c�lculo da m�dia di�ria
		double range = max - min;
		Random rd = new Random();
		
		//Preenche os valores das m�dias di�rias com valores fict�cios
		for (int i = 0; i < 28; i++) {
			
			//Aloca valores aleat�rios para a m�dia di�ria dentro do array
			//Arredondando para duas casas decimais
			daily_price [i] = Math.ceil((min + rd.nextFloat()*range)*100)/100;	
			
			//Informa o usu�rio o valor da m�dia di�ria
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
				//Atualiza m�xima e m�nima da semana
				if (week_prices[j] > max_week) {
					max_week = week_prices[j]; 
				}
				else if (week_prices[j] < min_week) {
					min_week = week_prices[j];
				}

			}
			double week_average = Math.ceil(total/7*100)/100;
			System.out.println("A m�dia da semana " + (k+1) + " foi de "+week_average+", com m�xima de "
			+ max_week + " e m�nima de "+min_week);
			
			month_total += week_average;
		}
		
		//Faz a tratativa mensal
		double month_average = Math.ceil(month_total/4*100)/100;
		
		System.out.println("A m�dia do m�s foi de "+ month_average);	

	}

}
