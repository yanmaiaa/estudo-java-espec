
public class CaixaNumero<N extends Number> extends CaixaNova<N> {
  //Number é a classe pai do Integer, Double e float (Classes que representam números)
  //É uma forma genérica de dizer que o tipo N vai extender obrigatoriamente a classe Number
  //Aqui já foi resolvido o tipo para CaixaNova, porém, ao instanciar o CaixaNumero, tem outra restrição que é o caso de só poderem classes filhas de Number
}
