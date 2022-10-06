public class Desenvolvedor extends Usuario {

  public Desenvolvedor(String name, int idade) {
    super(name, idade);
  }
  
  double salario(){
    return SALARIO_BASE;  
  }
}
