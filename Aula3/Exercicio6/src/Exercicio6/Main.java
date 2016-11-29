package Exercicio6;

public class Main {
	public static void main(String[] args) {
		
		Universidade curso = new Universidade();
		
		curso.addCurso(new Curso(201321, 40, 30 ,  40));
		curso.addCurso(new Curso(323124, 60, 30 ,  40));
		curso.addCurso(new Curso(654347, 80, 100, 120));
		curso.addCurso(new Curso(275939, 50, 30 ,  20));
		curso.addCurso(new Curso(340205, 40, 40 ,  60));
		curso.addCurso(new Curso(213410, 40, 130, 110));
		curso.addCurso(new Curso(120203, 40, 80 ,  40));
		
		
		System.out.println(curso.candidatosPorVaga());
		System.out.println(curso.maiorNumDeCandPorVaga());
		System.out.println(curso.totalDeCandidatos());
		
		
		
		
		
	}
	
	
}
