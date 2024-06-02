import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println();

        var curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso Java");
        curso1.setCargaHoraria(8);

        var curso2 = new Curso();
        curso2.setTitulo("Curso Javascript");
        curso2.setDescricao("Descrição do curso Javascript");
        curso2.setCargaHoraria(4);

        var mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descrição da mentoria de Java");
        mentoria1.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/
        var bootcampJava = new Bootcamp();
        bootcampJava.setNome("Bootcamp Java Developer");
        bootcampJava.setDescricao("Descrição do bootcamp Java Developer");
        bootcampJava.getConteudos().add(curso1);
        bootcampJava.getConteudos().add(curso2);
        bootcampJava.getConteudos().add(mentoria1);

        var devCarlos = new Dev();
        devCarlos.setNome("Carlos Reis");
        devCarlos.inscreverBootcampo(bootcampJava);
        System.out.println("\nConteúdos inscritos (Carlos): \n" + devCarlos.getConteudosInscritos());
        devCarlos.progredir();
        devCarlos.progredir();
        devCarlos.progredir();
        System.out.println("---------");
        System.out.println("Conteúdos inscritos (Carlos): \n" + devCarlos.getConteudosInscritos());
        System.out.println("Conteúdos concluídos (Carlos): \n" + devCarlos.getConteudosConcluidos());
        System.out.println("XP: " + devCarlos.calcularTotalXp());



        var devLara = new Dev();
        devLara.setNome("Lara");
        devLara.inscreverBootcampo(bootcampJava);
        System.out.println("\nConteúdos inscritos (Lara): \n" + devLara.getConteudosInscritos());
        devLara.progredir();
        System.out.println("---------");
        System.out.println("Conteúdos inscritos (Lara): \n" + devLara.getConteudosInscritos());
        System.out.println("Conteúdos concluídos (Lara): \n" + devLara.getConteudosConcluidos());
        System.out.println("XP: " + devLara.calcularTotalXp());

    }
}
