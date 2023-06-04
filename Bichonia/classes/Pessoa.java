package classes;

public class Pessoa {
	public String nome;
	public String cpf;
	public String telefone;
	public String sexo;
	
	public Pessoa(){
		
		this.nome=nome;
		this.cpf=cpf;
		this.telefone=telefone;
		this.sexo=sexo;
		
		
	}
	     //Construtor da classe
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getSexo(String sexo) {
		this.sexo=sexo;
	}
	public void setSexo(String sexo) {
		return sexo;
	}
	

}
