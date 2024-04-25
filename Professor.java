package br.com.estacio.pessoa;

public class Professor extends Funcionario {

	private String departamento;

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {


		
		this.departamento = departamento;
	}
	
	public void aumentarSalario(double percentual) {
        double aumento = getSalario() * percentual / 100;
        setSalario(getSalario() + aumento);
}
}