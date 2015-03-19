package control;

import java.util.ArrayList;

import model.Bolsista;

public class BolsistaMB {
	
	private Bolsista bolsista;
	private ArrayList<Bolsista> bolsistas;
	
	public BolsistaMB(){
		bolsista = new Bolsista();
		bolsistas = new ArrayList<Bolsista>();
		
	}
	
	public Bolsista getBolsista() {
		return bolsista;
	}
	
	public void setBolsista(Bolsista bolsista) {
		this.bolsista = bolsista;
	}
	
	public ArrayList<Bolsista> getBolsistas() {
		return bolsistas;
	}
	
	public void setBolsistas(ArrayList<Bolsista> bolsistas) {
		this.bolsistas = bolsistas;
	}
	
	
	
	public String salvar(){
		/*if (opcao){
			estacaoDAO.adicionar(estacao);
		}
		else{
			estacaoDAO.atualizar(estacao);
			opcao = true;
		}		*/
		return "salvar";
	}
	
	public String voltar(){
		return "voltar";
	}
	
	public String editar(){
		return "editar";
	}
	
	public String cadastrar(){
		return "cadastrarBolsista";
	}

}
