package it.esempi.dao;

public class Autore {
	
	private int 	id;
	private String 	nome;
	private String 	cognome;
	private String  titolo;
	
	
	
	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public void setAutore(int id, String nome, String cognome, String titolo) {
		
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.titolo = titolo;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "AUTORE ID: '" + id + "' NOME: '" + nome + "' COGNOME: '" + cognome + "'"; 
	}
	
	
	
	

}
