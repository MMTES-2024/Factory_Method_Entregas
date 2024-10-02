/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ex01.factory_method_entregas;

/**
 *
 * @author rafaelamoreira
 */
public class DemoFactoryMethod {

    public static void main(String[] args) {
        SistemaEntrega sistemaCorreios = new SistemaEntrega(new CorreiosFactory());
        sistemaCorreios.processarEntrega("Livro");

        SistemaEntrega sistemaMotoboy = new SistemaEntrega(new MotoboyFactory());
        sistemaMotoboy.processarEntrega("Pizza");

        SistemaEntrega sistemaTransportadora = new SistemaEntrega(new TransportadoraFactory());
        sistemaTransportadora.processarEntrega("Móveis");
    }
}
