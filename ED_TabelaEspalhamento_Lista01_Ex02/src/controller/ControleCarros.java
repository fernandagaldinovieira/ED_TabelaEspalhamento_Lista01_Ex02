package controller;

import br.edu.fateczl.Lista;
import model.Morador;

public class ControleCarros {
	
		Lista<Morador>[] tabelaHashCarros;

		@SuppressWarnings("unchecked")
		public ControleCarros() {
			tabelaHashCarros = new Lista[20];
			inicializarTabelaHash();
		}

		private void inicializarTabelaHash() {
			int tamanho = tabelaHashCarros.length;
			for (int i = 0; i < tamanho; i++) {
				tabelaHashCarros[i] = new Lista<>();
			}
		}
		
		public void cadastrarMorador(Morador morador) {
			int posicao = hash(morador.getNumeroApartamento());
			tabelaHashCarros[posicao].addFirst(morador);
		}
		
		
		public Morador consultarMorador(int numeroApartamento) throws Exception {
		    int posicao = hashAndar(numeroApartamento);
		    int tamanho = tabelaHashCarros[posicao].size();
		    
		    for (int i = 0; i < tamanho; i++) {
		        Morador m = tabelaHashCarros[posicao].get(i);
		        if (m.getNumeroApartamento() == numeroApartamento) {
		            return m;
		        }
		    }
		    return null; 
		}

		
		public void excluirMorador(Morador morador) throws Exception {
			int posicao = hashAndar(morador.getNumeroApartamento());
			int tamanho = tabelaHashCarros[posicao].size();
			for (int i = 0; i < tamanho; i++) {
				Morador m = (Morador) tabelaHashCarros[posicao].get(i);
				if (m.numeroApartamento == morador.numeroApartamento) {
				    tabelaHashCarros[posicao].remove(i);
				    break;
				}

			}
		}
		
		public void listarMoradorPorAndar(int andar) throws Exception {
			int posicao = hashAndar(andar);
			int tamanho = tabelaHashCarros[posicao].size();
			for (int i = 0; i < tamanho; i++) {
				Morador m = (Morador) tabelaHashCarros[posicao].get(i);
				System.out.println(m.toString());
			}
		}
		
		private int hashAndar(int numeroApartamento) {
		    int andar = numeroApartamento / 100; // 
		    return andar % tabelaHashCarros.length;
		}

		private int hash(int numeroApartamento) {
		    return (numeroApartamento / 100) - 1; 
		}

}



