import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class Pares<C1 extends Number, V1> {
    //Usamos <C1, V1> para que ao isntanciar uma classe tenhamos a liberdade de determinar os tipos que queremos
    //Neste caso iremos restringir C1 seja de um tipo Number
    private final Set<Par<C1, V1>> itens = new HashSet<>(); 

    public void adicionar(C1 chave, V1 valor){
        if(chave == null) return; //usamos esta validação mesmo sendo void para que, caso a chave esteja nula possamos "sair" do método
        
        Par<C1, V1> novoValor = new Par<>(chave, valor);

        //No contains ele está olhando pelo equals e hashcode da classe e como estamos usando de critério apenas a chave,
        //iremos verificar se tem e remover, pois eventualmente o valor passado pode ser diferente e queremos que
        //atualize o valor passado. logo, se contém remove e logo mais abaixo adiciona e se não estiver contido ele
        //não vai remover nada e vai adicionar um novo par
        if(itens.contains(novoValor))
            itens.remove(novoValor);

        itens.add(novoValor);
    }

    public V1 getValor(C1 chave){
        if(chave == null) return null;
        //vai filtrar os pares que tem a mesma chave em que passamos
       Optional<Par<C1,V1>> parOpcional = itens.stream()
                    .filter(p -> chave.equals(p.getChave()))
                    .findFirst();

        return parOpcional.isPresent() 
                ? parOpcional.get().getValor() : null;
    }

}
