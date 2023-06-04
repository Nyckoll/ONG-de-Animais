package classes;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Animal extends Abrigo{

	public String cod_animal;
	public String nome;
	public String especie;
	public String raca;
	public String sexo;
	public String pelagem;

	public Animal() {
		super();

		this.cod_animal = cod_animal;
		this.nome = nome;
		this.especie = especie;
		this.raca = raca;
		this.sexo = sexo;
		this.pelagem = pelagem;

	}

	// Construtor

	public String getCod_animal() {
		return cod_animal;
	}

	public void setCod_animal(String cod_animal) {
		this.cod_animal = cod_animal;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getPelagem() {
		return pelagem;
	}

	public void setPelagem(String pelagem) {
		this.pelagem = pelagem;
	}

	private String url;
	private String user;
	private String password;
	@SuppressWarnings("unused")
	private Connection ani;

	Animal() {
		url = "jdbc:postgresql://localhost:5432/postgres";
		user = "postgres";
		password = "aluno";

		try {

			Class.forName("org.postgresql.Driver");
			ani = DriverManager.getConnection(url, user, password);
			System.out.println("Conexão com o Banco de Dados bem Sucedida");

			Statement statement;
			statement = (Statement) con.createStatement();
			// Inserindo os dados no banco de dados
			String sql_str;
			sql_str="insert into animal values("this.cod_animal","this.nome",)";

		} catch (Exception e) {

			e.printStackTrace();
			
			
		}
	}

}
