package modelo;

import java.util.Objects;

public class Aluno extends Pessoa {
	private long nroMatricula;
	private Disciplina disciplina = new Disciplina();
	
	public Aluno() {
		
	}
	
	public Aluno(String nome, int idade, long cpf, long nroMatricula, Disciplina disciplina) {
		super(nome,idade,cpf);
		this.nroMatricula = nroMatricula;
		this.disciplina = disciplina;
	}

	public long getNroMatricula() {
		return nroMatricula;
	}

	public void setNroMatricula(long nroMatricula) {
		this.nroMatricula = nroMatricula;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	
	public boolean maioridade(int idade){
		if(idade>= 18) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Aluno [Nome = " + nome + ", Idade=" + idade +", Cpf=" + cpf +", Numero de Matricula=" + nroMatricula + ", Disciplina=" + disciplina + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(nroMatricula);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return nroMatricula == other.nroMatricula;
	}
	
	

}
