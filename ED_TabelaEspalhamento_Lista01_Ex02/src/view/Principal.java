package view;

import controller.ControleCarros;
import model.Morador;

public class Principal {
    public static void main(String[] args) {
        try {
            ControleCarros controleCarros = new ControleCarros();
            
            Morador morador1 = new Morador(101, "João", "Civic", "Preto", "ABC-1234");
            Morador morador2 = new Morador(102, "Maria", "Corolla", "Branco", "DEF-5678");
            Morador morador3 = new Morador(201, "Pedro", "Onix", "Prata", "GHI-9012");
            Morador morador4 = new Morador(301, "Ana", "HB20", "Vermelho", "JKL-3456");

            controleCarros.cadastrarMorador(morador1);
            controleCarros.cadastrarMorador(morador2);
            controleCarros.cadastrarMorador(morador3);
            controleCarros.cadastrarMorador(morador4);
            System.out.println("Moradores cadastrados com sucesso.");

            Morador consulta = controleCarros.consultarMorador(102);
            if (consulta != null) {
                System.out.println("Morador encontrado: " + consulta);
            } else {
                System.out.println("Morador não encontrado.");
            }

            controleCarros.excluirMorador(morador3);
            System.out.println("Morador do apartamento 201 excluído.");

            Morador consultaExcluido = controleCarros.consultarMorador(201);
            if (consultaExcluido == null) {
                System.out.println("Morador do apartamento 201 não encontrado (excluído corretamente).");
            }

            System.out.println("Moradores do 1º andar:");
            controleCarros.listarMoradorPorAndar(1);

            System.out.println("Moradores do 2º andar:");
            controleCarros.listarMoradorPorAndar(2);

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
