package aula5;

import java.util.Scanner;

import model.Aluno;

public class Main {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		System.out.println(" === BOLETIM ===");
		
		System.out.println("Nome do aluno: ");
		var nome = sc.nextLine();
		
		System.out.println("Nota 1: ");
		var nota1 = sc.nextDouble();
		
		System.out.println("Nota 2: ");
		var nota2 = sc.nextDouble();
		
		System.out.println("Faltas: ");
		var faltas = sc.nextInt();
		
		
		
		var aluno = new Aluno(nome, nota1, nota2, faltas);
		var media = calcularMedia(aluno);
		var situacao = verificarSituacao(media, aluno.faltas());
		var mensagem = """
				========= \t RESULTADO ==========
				Nome: %s
				Média: %.2f
				Faltas: %d
				Situação: %s
				
				""".formatted(aluno.nome(), media, aluno.faltas(), situacao);
		
		sc.close();
		
	}

		public static double calcularMedia(Aluno aluno) {
			return (aluno.nota1() + aluno.nota2()) / 2;


	}
		public static String verificarSituacao(double media,int faltas) {
			if (faltas >= 25) {
				return "REPROVADO POR FALTAS";
			} else if (faltas >= 20) {
				System.out.println("Cuidado esta quase sedendo limite de falta");
				
			}
			return switch ((int) media) {
			case 10, 9, 8, 7 -> "APROVADO";
			case 6, 5 -> "RECUPERAÇÃO";
			default -> "REPROVADO";
			};
			
		}



}
