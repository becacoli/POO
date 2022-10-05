class Main {
  public static void main(String[] args) {
    WalkingStrategy strategy = new WalkingStrategy();
    Navigator navigator = new Navigator(strategy);
    navigator.buildRote(2, 3);
  }
}