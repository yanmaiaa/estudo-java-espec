import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {
  public static void main(String[] args) {
    List<String> langs = Arrays.asList("JS", "PHP", "Java");
    List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);

    //Ainda precisou fazer um cast pois é retornado um tipo Object, aí pra chegar na estrutura que queremos precisará disso
    String ultimaLinguagem = (String) ListaUtil.getUltimo1(langs);
    System.out.println(ultimaLinguagem);

    Integer ultimoNumero = (Integer) ListaUtil.getUltimo1(nums);
    System.out.println(ultimoNumero);

    //Após criar o novo método, não precisamos fazer cast. Além de que, podemos explicitar na estrutura o que queremos que seja passado, ficando da seguinte forma:ListaUtil<String>.getUltimo2(langs)
    String ultimaLinguagem2 = ListaUtil.getUltimo2(langs);
    System.out.println(ultimaLinguagem2);

    Integer ultimoNumero2 = ListaUtil.getUltimo2(nums);
    System.out.println(ultimoNumero2);
  }
}
