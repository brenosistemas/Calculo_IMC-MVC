
public class IMCModel {
	 private float altura;
     private float Peso;
	private float imc;


	
	public IMCModel(float altura, float peso){
		this.altura = altura;
		this.Peso = peso;
	}	

 

	public String condicao(){
		
		imc = Peso / (altura * altura);  

     if(imc < 18)  
     {  
         return "Abaixo do peso";  
     }  
     else  
         if(imc > 18 & imc < 25)  
         {  
             return  "Peso normal";  
         }  
         else  
             if(imc > 25 & imc < 30)  
             {  
                 return  "Acima do peso";  
             }  
             else  
                 if(imc > 30)  
                 {  
                     return  "obesso";  
                

                 }
	}

