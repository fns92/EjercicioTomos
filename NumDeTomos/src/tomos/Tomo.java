package tomos;

class Tomo {
	
//	 	private String [] dominio;
//	 	
//	 	public Tomo(String [] dominio) {
//	 		
//	 		this.dominio = dominio;
//	 		
//	 	}
//	 	
	 	
	 	public String numeracionDeTomos(Integer n, String []dominio) {
	 		
	 		for(int i = 0; i < dominio.length; i++){
	 			if(n < 10)
	 				return (dominio[i] + "-0" + n);
	 			if(n <= 99)
	 				return (dominio[i] + "-" + n);
	 			n -= 99;
	 		}
			return "";
	 	}
	 	
}
