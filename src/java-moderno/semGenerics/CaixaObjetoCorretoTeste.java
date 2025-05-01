 public class CaixaObjetoCorretoTeste {
    //O que ocontece é que, no momento em que fazemos o cast, ao compilar a aplicação, o java não conseguirá identificar 
    //que contem um erro no momento de realizar o cast, apenas após a funcionalidade ser utilizada pelo usuário/cliente,
    //já que o arquivo.class que será executado não vai identificar o erro

    //Além disso, temos que nos preocupar em fazer cast de forma explícita, porém, usando o Generics, no momento em que
    //definimos a classe genérica, caso venhamos a inserir um atributo ou um objeto de um tipo que não é aceito, o java conseguirá
    //identificar no momento da compilação e ocorrerá um erro, evitando que acabemos subindo estrutuas que irão dar problema.
    public static void main(String[] args) {

        CaixaObjetoSemGenerics caixaA = new CaixaObjetoSemGenerics();
        caixaA.guardar(2.3);

        Double coisa = (Double)caixaA.abrir();
        System.out.println(coisa);


        CaixaObjetoSemGenerics caixaB = new CaixaObjetoSemGenerics();
        caixaB.guardar("Hello World!");

        String coisaB = (String) caixaB.abrir();
        System.out.println(coisaB);

    }
}
