package control;

import java.util.ArrayList;

import model.Setor;

public class SetorMB {
	
	private Setor setor;
	private ArrayList<Setor> setores;
	
	public SetorMB(){
		setor = new Setor();
		setores = new ArrayList<Setor>();
	}
	
	public Setor getSetor() {
		return setor;
	}
	
	public void setSetor(Setor setor) {
		this.setor = setor;
	}
	
	public ArrayList<Setor> getSetores() {
		return setores;
	}
	
	public void setSetores(ArrayList<Setor> setores) {
		this.setores = setores;
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
		return "cadastrarSetor";
	}

}
