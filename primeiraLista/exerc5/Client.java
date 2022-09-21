package exerc5;

public class Client {
  private String name;
  private String email;
  private java.util.Date birthDate;

  public Client(String name, String email, java.util.Date birthDate) {
    this.name = name;
    this.email = email;
    this.birthDate = birthDate;
  }

  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return String.format("%s (%s) - %s\n", name, birthDate, email);
  }
}
