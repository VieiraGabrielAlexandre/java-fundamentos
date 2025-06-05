package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {
    Ana mae = new Ana();

    void testeAcesso() {
        System.out.println(mae.todosSabem);
        System.out.println(formaDeFalar);
    }
}
