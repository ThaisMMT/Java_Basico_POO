			import java.util.Scanner;
			
			
			public class DVD extends Midia
			{
			 private int nFaixas;
			
			 // CONSTRUTOR SEM PARAMETROS.
			 
			 public DVD()
			 { this(0,0.0,"Nenhum",0); }
			
			 
			 // CONSTRUTOR COM PARAMETROS.
			 public DVD(int codigo, double preco, String name, int nFaixas)
			 { super(codigo, preco, name); //
			 
			 }
			 
			
					 //METODOS (S� O NOME COM GET E SET)
					 public String getTipo()
					 { return "DVD: "; }
					
					 
					 public String getDetalhes()
					 { return super.getDetalhes() + "\n" +
					 "Numero de faixas: " + nFaixas + "\n"; }
					 
					
					 public void setFaixas(int nfaix)
					 { nFaixas = (nfaix > 0) ? nfaix:0; }
					
					 
					 
					  public void inserirDados()
					 {
					  super.inserirDados();
					
					  Scanner in = new Scanner(System.in);
					
					  System.out.printf("\n Entre com o numero de faixas: ");
					  int nfaix = in.nextInt();
					
					 setFaixas(nfaix);
					 }
				 }
					
					
					
			