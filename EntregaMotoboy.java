/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex01.factory_method_entregas;

/**
 *
 * @author rafaelamoreira
 */
public class EntregaMotoboy implements Entrega{
    @Override
    public void entregar(String produto) {
        System.out.println("Entregando " + produto + " via Motoboy.");
    }
}
