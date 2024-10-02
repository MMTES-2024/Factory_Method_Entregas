/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex01.factory_method_entregas;

/**
 *
 * @author rafaelamoreira
 */
public class CorreiosFactory extends EntregaFactory{
    @Override
    public Entrega criarEntrega() {
        return new EntregaCorreios();
    }
}
