package br.com.estacio.pessoa;

public abstract class Funcionario extends Pessoa{
	private double salario;

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {

		this.salario = salario;
	}

	public abstract void aumentarSalario(double percentual);
		
	
}
