package selectionStructures;

import javax.swing.JOptionPane;

public class Ex23 {

	public static void main(String[] args) {

		int[] cpf = new int[11];

		int multiply = 10;

		int sum = 0;

		for (int i = 0; i < cpf.length; i++) {

			cpf[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Input value 1°"));
		}

		for (int i = 0; i < 9; i++) {

			cpf[i] *= multiply;

			multiply--;

			sum += cpf[i];
		}

		int result = sum / 11;

		int result_1 = result * 11;

		int diff = sum - result_1;

		if (diff == 0 || diff == 1) {

			cpf[9] = 0;

		} else {

			cpf[9] = 11 - diff;
		}

		String formattedCpf = String.format("%d%d%d.%d%d%d.%d%d%d-%d", cpf[0], cpf[1], cpf[2], cpf[3], cpf[4], cpf[5],

				cpf[6], cpf[7], cpf[8], cpf[9]);

		System.out.println("CPF com primeiro dígito verificador: " + formattedCpf);

		sum = 0;

		multiply = 11;

		for (int i = 0; i < 10; i++) {

			sum += cpf[i] * multiply;

			multiply--;
		}

		int resultY = sum / 11;

		int resultYMult = resultY * 11;

		int diffY = sum - resultYMult;

		int digitY;

		if (diffY == 0 || diffY == 1) {

			digitY = 0;

		} else {

			digitY = 11 - diffY;
		}

		formattedCpf = String.format("%d%d%d.%d%d%d.%d%d%d-%d%d", cpf[0], cpf[1], cpf[2], cpf[3], cpf[4], cpf[5],
				cpf[6], cpf[7], cpf[8], cpf[9], digitY);
		System.out.println("CPF completo com ambos os dígitos verificadores: " + formattedCpf);
	}
}
