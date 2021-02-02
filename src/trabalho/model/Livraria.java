package trabalho.model;

import java.util.HashMap;
import java.util.Map;

public class Livraria {


    private HashMap<IdEPreco, Integer> itens = new HashMap<>();


    public IdEPreco cadastrarItem(IdEPreco item) {
        itens.put(item, 0);
        return item;
    }

    public IdEPreco getLivroPorID(int id) {
        for (IdEPreco i : itens.keySet()) {
            return i;
        }
        return null;
    }


    public void setEstoque(int id, int quantidade) {
        for (IdEPreco i : itens.keySet()) {
            if (i.getID() == id) {
                itens.put(i, quantidade);
            }
        }
    }

    public int getEstoque(int id) {
        for (Map.Entry<IdEPreco, Integer> e : itens.entrySet()) {
            if (e.getKey().getID() == id) {
                return e.getValue().intValue();
            }
        }
        return -1;
    }


    public void venderItem(int id, int quantidade) throws Exception {
        int estoque = getEstoque(id);
        switch (estoque) {
            case -1:
                throw new Exception("Item não existe");
            case 0:
                throw new Exception("Item sem estoque");
            default:
                setEstoque(id, estoque - 1);
                System.out.println("Item comprado! id = " + id);
                break;
        }
    }


}
