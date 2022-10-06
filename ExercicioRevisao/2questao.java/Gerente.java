public class Gerente extends Usuario{

  public Gerente(String name, int idade) {
    super(name, idade);
  }

  double salario(){
    return SALARIO_BASE * 15;
  }
  
}
