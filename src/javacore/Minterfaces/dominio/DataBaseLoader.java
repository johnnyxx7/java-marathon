package javacore.Minterfaces.dominio;

public class DataBaseLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados.");
    }

    @Override
    public void remove() {
        System.out.println("Deletando arquivos do banco de dados.");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões no banco de dados.");
    }

    public static void retrieveMaxDataSize() {
        System.out.println("Dentro do retrieveMaxDataSize na classe DataBaseLoader.");
    }
}
