package modelo;

import java.util.Arrays;

public class Disciplina {
	String disciplina;
	double notas[] = new double[4] ;
	
	public Disciplina() {
		
	}
	
	public Disciplina(String disciplina, double notas[]) {
		this.disciplina = disciplina;
		this.notas = notas;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public double getMedia(){
		double soma = 0;
		double media=0;
		for(int i=0; i<notas.length; i++) {
			soma = soma + notas[i];
		}
		media= soma/notas.length;
		return media;
	}

	@Override
	public String toString() {
		return "Disciplina [disciplina=" + disciplina + ", notas=" + Arrays.toString(notas) + "]";
	}
	
	
	
}
