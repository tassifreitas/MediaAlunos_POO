package executavel;
import javax.swing.JOptionPane;

import modelo.Aluno;

public class Executavel {
	public static void main(String[] args) {
				
				Aluno aluno = new Aluno();
				String nome = JOptionPane.showInputDialog("Informe o nome do aluno: ");
				int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do aluno: "));
				long cpf = Long.parseLong(JOptionPane.showInputDialog("Informe o CPF do aluno: "));
				long nroMatricula = Long.parseLong(JOptionPane.showInputDialog("Informe o matricula do aluno: "));
				String disciplina = JOptionPane.showInputDialog("Informe a disciplina do aluno: ");
				
				
				
				aluno.setNome(nome);
				aluno.setIdade(idade);
				aluno.setCpf(cpf);
				aluno.setNroMatricula(nroMatricula);
				aluno.getDisciplina().setDisciplina(disciplina);
				
				double notas[] = new double[4]; 
				for(int i=0; i<aluno.getDisciplina().getNotas().length; i++) {
					double nota = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota " + (i+1)));
					notas[i]= nota;
					aluno.getDisciplina().setNotas(notas);
					
				}
				
				
				System.out.println(aluno.toString());
				System.out.println("Media do aluno = " + aluno.getDisciplina().getMedia());
				System.out.println("Maioridade = " + aluno.maioridade(aluno.getIdade()));
				
				
			
}
}