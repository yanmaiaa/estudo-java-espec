public class Caixa<T> {
  //Após definir no <> o tipo, substituimos onde teria o tipo do objeto declarado e onde tem
  //o tipo nos métodos
  private T coisa;

  public void guardar(T coisa){
    this.coisa = coisa;
  }

  public T abrir(){
    return coisa;
  }
}
