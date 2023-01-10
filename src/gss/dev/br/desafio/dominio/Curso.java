package gss.dev.br.desafio.dominio;

public class Curso extends Conteudo{
	
	private int cargaHoraria;
	
	public Curso(String titulo, String descricao, int cargaHoraria) {
		super(titulo,descricao);
		this.cargaHoraria = cargaHoraria;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}



	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}



	@Override
	public String toString() {
		return "Curso [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", cargaHoraria=" + getCargaHoraria() + "]";
	}

	@Override
	public double calcularXp() {
		// TODO Auto-generated method stub
		return XP_PADRAO * 10d;
	}
	
	

}
