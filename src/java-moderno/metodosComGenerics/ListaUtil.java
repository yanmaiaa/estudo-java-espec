import java.util.List;

public class ListaUtil {
//Funcionalidades e métodos para facilitar fazer ações com lista

public static Object getUltimo1(List<?> lista){
  return lista.get(lista.size() - 1);
}

//Esse tipo de estrutura tira a nossa preocupação de fazer cast para a estrutura que precisamos, já que, no momento de passar o tipo ele retornará o que precisamos. Com isso, é necessário deixar o <T> ao lado do static para garantir o tipo retornado corretamente
public static <T> T getUltimo2(List<T> lista){
  return lista.get(lista.size() - 1);
}
}
