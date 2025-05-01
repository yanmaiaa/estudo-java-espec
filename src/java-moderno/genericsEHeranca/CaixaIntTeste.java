public class CaixaIntTeste {
  public static void main(String[] args) {

    CaixaInt caixaA = new CaixaInt(); //O tipo genérico foi resolvido na herança e não ao instanciar o objeto, logo, ao instanciar, usaremos como um objeto normal, sem precisar resolver a parte do tipo genérico
    caixaA.guardar(123);

    Integer coisaA = caixaA.abrir();
    System.out.println(coisaA);
  }
}
