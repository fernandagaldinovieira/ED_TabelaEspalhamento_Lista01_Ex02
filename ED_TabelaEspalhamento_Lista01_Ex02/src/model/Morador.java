package model;

public class Morador {
	
	    public int numeroApartamento;
	    private String nome;
	    private String modeloCarro;
	    private String corCarro;
	    private String placaCarro;

	    public Morador(int numeroApartamento, String nome, String modeloCarro, String corCarro, String placaCarro) {
	        this.numeroApartamento = numeroApartamento;
	        this.nome = nome;
	        this.modeloCarro = modeloCarro;
	        this.corCarro = corCarro;
	        this.placaCarro = placaCarro;
	    }

	    public int getNumeroApartamento() { 
	    	return numeroApartamento; 
	    }
	    
	    public String getNome() { 
	    	return nome; 
	    }
	    
	    public String getModeloCarro() { 
	    	return modeloCarro; 
	    }
	    
	    public String getCorCarro() { 
	    	return corCarro; 
	    }
	    
	    public String getPlacaCarro() { 
	    	return placaCarro; 
	    }
	    
	    @Override
	    public String toString() {
	        return "Apartamento: " + numeroApartamento + ", Nome: " + nome + 
	               ", Carro: " + modeloCarro + " (" + corCarro + "), Placa: " + placaCarro;
	    }

}

