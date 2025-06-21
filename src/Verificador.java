
public class Verificador {
    int minCaracteres = 3;
    int maxCaracteres = 10;

    public boolean verificarNome(String nome){
    if(nome == null || nome.isEmpty()){
        return false;
    }
   int tamanhoNome = nome.length();


    return tamanhoNome >= minCaracteres && tamanhoNome <= maxCaracteres;
    }


    }

