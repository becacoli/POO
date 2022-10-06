public abstract class Usuario {
  static double SALARIO_BASE = 1000;

  protected String name;
  protected int idade;  
  protected double salario;
  //protected é como se fosse publico pra classe que extends

  public Usuario(String name, int idade) {
    if(name.length() > 50) {
      System.out.println("Nome inválido");
      System.exit(1);
    } else {
    this.name = name;
    this.idade = idade;
    }
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    if(name.length() > 50) {
      System.out.println("Nome inválido");
      System.exit(1);
    } else {
    this.name = name;
    }
  }
  
  public int getIdade() {
    return idade;
  }
  public void setIdade(int idade) {
    this.idade = idade;
  }

}
