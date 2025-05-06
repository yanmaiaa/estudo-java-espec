
public class Par<C, V> { //indicando os pares chave-valor
    private C chave;
    private V valor;

    public Par(){}

    public Par(C chave, V valor) {
        this.chave = chave;
        this.valor = valor;
    }

    public C getChave() {
        return chave;
    }
    public void setChave(C chave) {
        this.chave = chave;
    }
    public V getValor() {
        return valor;
    }
    public void setValor(V valor) {
        this.valor = valor;
    }

    //Definimos a identidade de uma classe. Caso a gente compare com outra classe, precisamos saber se ela é igual ou diferente, ,
    //usaremos como critério de igualdade a chave, pois, se um par tiver a mesma chave que outro, diremos que são iguais, aí
    //não usaremos o valor como critério de comparação. Pois a ideia é não ter em um Set dois parer com chaves duplicadas
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((chave == null) ? 0 : chave.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Par<C, V> other = (Par<C, V>) obj; //usamos o <C, V> para evitar problema de warning
        if (chave == null) {
            if (other.chave != null)
                return false;
        } else if (!chave.equals(other.chave))
            return false;
        return true;
    }

    

}
