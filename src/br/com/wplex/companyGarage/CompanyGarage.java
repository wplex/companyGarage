package br.com.wplex.companyGarage;

import java.util.Scanner;

public class CompanyGarage
{
    public static void main(final String[] args)
    {
        final Scanner input = new Scanner(System.in);
        System.out.println(
            "(1) - Inserir empresa; (2) - Inserir garagem; (3) - Listar garagens por empresa; (4) - Listar garagens ordenadas por sigla; (5) - Listar empresas por número de garagens associadas: Nome - Sigla - Total de garagens; (6) - Encerrar programa;");

        boolean running = true;

        while (running)
        {
            System.out.println("Informe uma opção:");
            final int option = input.nextInt();

            switch (option)
            {
            case 6:
                running = false;
                break;

            default:
                System.out.println("Opção (" + option + "): a ser implementada.");
                break;
            }
        }

        input.close();
        System.out.println("Programa finalizado.");
    }
}
