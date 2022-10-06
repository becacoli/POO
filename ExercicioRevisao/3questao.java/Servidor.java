public abstract class Servidor {
  public void conectarServidor(){
      System.out.println("Conectando no servidor");
  }

  // parece uma interface de metodo
  abstract void extrairDados();

  public void processarDados(){
      System.out.println("Processando dados");
  }

  public void enviandoDados(){
    System.out.println("Enviando dados");
  }
}
