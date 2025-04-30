public class CaixaObjetoTest {
    public static void main(String[] args) {
        //Acabamos trabalhando muito com cast
        CaixaObjetoSemGenerics caixaA = new CaixaObjetoSemGenerics();
        caixaA.guardar(2.3); //tipo double primitivo onde ele converte para Double (chamado autobox)

        //O método retorna um Object, porém, como preciso de algo mais específico, vamos precisar fazer um cast, porém,
        //é perigoso o cast pois, o que foi retornado no método abrir foi um Double, mas, como fizemos um cast para Integer,
        //vai ocorrer um erro
        Integer coisa = (Integer)caixaA.abrir(); //Fazemos o cast para converter o valor que foi passado no método guardar.
        System.out.println(coisa); //Ocorrerá um erro de cast
    }
}   
