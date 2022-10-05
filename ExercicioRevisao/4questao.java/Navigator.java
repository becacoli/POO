public class Navigator implements RouteStrategy {
  
  //composição é ligado por um atributo da classe/interface
  RouteStrategy routeStrategy;

  public Navigator(RouteStrategy routeStrategy) {
    this.routeStrategy = routeStrategy;
  }

  @Override
  public void buildRote(double A, double B) {
    System.out.println("Criando rota!");
  }

  
}
