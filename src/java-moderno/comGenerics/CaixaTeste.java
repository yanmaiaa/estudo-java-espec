public class CaixaTeste {
  public static void main(String[] args) {
    Caixa caixaA = new Caixa(); //Conseguimos definir a caixa mesmo sem o tipo genérico, mas não é a melhor solução, pois gera uma advertência já que é um tipo bruto e também porque as estruturas irão acabar retornando um Object, logo, o ideal é definir um tipo

    Caixa<String> caixaAGenerica = new Caixa<>();
    //Agora o retorno dos métodos irá ser uma String e não precisamos mais ns preocupar tanto pois não aceitará outros tipos.
    caixaAGenerica.guardar("Segredo");
    System.out.println(caixaAGenerica.abrir());
    
    //ou
    String caixaNovaA = caixaAGenerica.abrir();
    System.out.println(caixaNovaA);

  }
}
