
public class ParesTeste {
    public static void main(String[] args) {
        Pares<Integer, String> resultadoConcurso = new Pares<>();
        resultadoConcurso.adicionar(1, "Maria");
        resultadoConcurso.adicionar(2, "Pedro");
        resultadoConcurso.adicionar(3, "João");
        resultadoConcurso.adicionar(4, "Ana");
        resultadoConcurso.adicionar(2, "Rebeca");

        System.out.println(resultadoConcurso.getValor(1));
        System.out.println(resultadoConcurso.getValor(4));
        System.out.println(resultadoConcurso.getValor(2)); //O método que criamos não está aceitando duplicação, logo, ele pega o último valor
        // e vai substituir. Como usamos o Set, o mesmo também não permite duplicação
    }
}
