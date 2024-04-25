package br.com.estacio.pessoa;

public class App {

	public static void main(String[] args) {
		
		Aluno aluno01 = new Aluno();
		aluno01.setEndereco("rua das flores");
		aluno01.setIdade(0);
		aluno01.setMatricula("1");
		aluno01.setNome("Eike");
		
		Aluno aluno02 = new Aluno();
		aluno02.setEndereco(null);
		aluno02.setIdade(0);
		aluno02.setMatricula(null);
		aluno02.setNome("Melissa");
		
		Aluno aluno03 = new Aluno();
		aluno03.setEndereco(null);
		aluno03.setIdade(0);
		aluno03.setMatricula(null);
		aluno03.setNome("Roger Macutela");
		
		Coordenador coordenador01 = new Coordenador();
		coordenador01.setCurso(null);
		coordenador01.setEndereco(null);
		coordenador01.setIdade(0);
		coordenador01.setNome("Elisrenan");
		coordenador01.setSalario(5000);
		
		Professor professor01 = new Professor();
		professor01.setDepartamento(null);
		professor01.setEndereco(null);
		professor01.setIdade(0);
		professor01.setNome("Fausto");
		professor01.setSalario(5000);
		professor01.aumentarSalario(20);
		
		Professor professor02 = new Professor();
		professor02.setDepartamento(null);
		professor02.setEndereco(null);
		professor02.setIdade(0);
		professor02.setNome("Reutman");
		professor02.setSalario(5000);
		professor02.aumentarSalario(20);
		
		System.out.println("Alunos: ");
		System.out.println(aluno01.getNome());
		System.out.println(aluno02.getNome());
		System.out.println(aluno03.getNome());
		System.out.println("\n");
		System.out.println("Professores: ");
		System.out.println(professor01.getNome());
		System.out.println(professor01.getSalario());
		System.out.println(professor02.getNome());
		System.out.println(professor02.getSalario());
		System.out.println("\n");
		System.out.println("Coordenadores: ");
		System.out.println(coordenador01.getNome());
		System.out.println(coordenador01.getSalario());


		
		
	}

}
