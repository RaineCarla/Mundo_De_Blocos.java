import java.util.HashMap;
import java.util.Map;

public class BlocoFactory {
    private static Map<String, TipoBloco> blocos = new HashMap<>();

    public static TipoBloco getBloco(String nome, String textura, boolean solido) {

        String chave = nome + "-" + textura + "-" + solido;

        if (!blocos.containsKey(chave)) {
            TipoBloco novoBloco = new TipoBloco(nome, textura, solido);
            blocos.put(chave, novoBloco);
        }

        return blocos.get(chave);
    }
}