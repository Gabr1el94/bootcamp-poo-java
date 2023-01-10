import java.time.LocalDate;

import gss.dev.br.desafio.dominio.BootCamp;
import gss.dev.br.desafio.dominio.Curso;
import gss.dev.br.desafio.dominio.Dev;
import gss.dev.br.desafio.dominio.Mentoria;

public class Main {
	public static void main(String[] args) {
		Curso curso1 = new Curso("Curso Java", "descri��o curso Java", 120);
		Curso curso2 = new Curso("Curso Mysql", "descri��o curso SGBD e mysql", 200);
		
		Mentoria mentoria1 = new Mentoria("Mentoria JS/TS", "descri��o mentoria JS/TS", LocalDate.now());
		
		
//		System.out.println(curso1);
//		System.out.println(mentoria1);
//		System.out.println(curso1.calcularXp());
//		System.out.println(mentoria1.calcularXp());
		
		BootCamp bootCamp = new BootCamp();
		bootCamp.setDescricao("JS Developer");
		bootCamp.setDescricao("Descri��o Bootcamp Java Developer");
		bootCamp.getConteudos().add(curso1);
		bootCamp.getConteudos().add(curso2);
		bootCamp.getConteudos().add(mentoria1);
		
		Dev devGss = new Dev();
		devGss.setNome("Gabriel Soares");
		devGss.inscreverBootCamp(bootCamp);
		System.out.println("Conte�dos inscritos de "+devGss.getNome()+": "+devGss.getConteudosInscritos());
		devGss.progredir();
		System.out.println("Conte�dos inscritos de "+devGss.getNome()+": "+devGss.getConteudosInscritos());
		System.out.println("Conte�dos concluidos de "+devGss.getNome()+": "+devGss.getConteudosConcluidos());
		System.out.println("XP:"+ devGss.calcularXp());
		
		
		Dev devJp = new Dev();
		devJp.setNome("Jo�o Paulo");
		devJp.inscreverBootCamp(bootCamp);
		System.out.println("Conte�dos inscritos de "+devJp.getNome()+": "+devJp.getConteudosInscritos());
		System.out.println("Conte�dos concluidos de "+devJp.getNome()+": "+devJp.getConteudosConcluidos());
		System.out.println("XP:"+ devJp.calcularXp());
	
	}
}
