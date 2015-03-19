package model;

import java.util.Date;

public class Bolsista {
	
	private String nome;
	private String turno;
	private String matricula;
	private Date horInicio;
	private Date horFim;
	
	public Date getHorFim() {
		return horFim;
	}
	
	public void setHorFim(Date horFim) {
		this.horFim = horFim;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTurno() {
		return turno;
	}
	
	public void setTurno(String turno) {
		this.turno = turno;
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public Date getHorInicio() {
		return horInicio;
	}
	
	public void setHorInicio(Date horInicio) {
		this.horInicio = horInicio;
	}

}
