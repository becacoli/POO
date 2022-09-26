package exerc8;

import java.util.ArrayList;

public class Program {
  public static void main(String[] args) {
    ArrayList<Nota> notas = new ArrayList<Nota>();
    notas.add(new Nota(9, "Inglês"));
    notas.add(new Nota(7, "Física"));
    notas.add(new Nota(7, "Química"));
    notas.add(new Nota(8, "Matemática"));
    notas.add(new Nota(10, "Português"));
    Aluno aluno = new Aluno("Rebeca Coli", "20152020", notas);
    System.out.println(aluno);
  }
}
