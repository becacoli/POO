public class LiderDeProjeto extends Usuario{

  public LiderDeProjeto(String name, int idade) {
    super(name, idade);
  }
  
  double salario() {
    return SALARIO_BASE * 3;
  }
}
