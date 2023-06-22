// subclasse Gerente
public class Gerente extends Funcionario {

   protected int qtdFunc;

   public Gerente(String nome,double salario, int qtdFunc){
      super(nome,salario);
      this.qtdFunc = qtdFunc;
   }

   public double getQtdFunc(){
      return this.salario;
   }
}
