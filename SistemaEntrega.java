/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex01.factory_method_entregas;

/**
 *
 * @author rafaelamoreira
 */
public class SistemaEntrega {
    private final EntregaFactory entregaFactory;

    public SistemaEntrega(EntregaFactory entregaFactory) {
        this.entregaFactory = entregaFactory;
    }

    public void processarEntrega(String produto) {
        Entrega entrega = entregaFactory.criarEntrega();
        entrega.entregar(produto);
    }
}
