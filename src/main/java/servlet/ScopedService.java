/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servlet;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Singleton;

/**
 *
 * @author akiba
 */
//@RequestScoped
//@ApplicationScoped
//@Singleton//bug が出る
@RequestScoped
public class ScopedService {

    private int counter = 0;

    public void countUp() {
        this.counter++;
    }

    public int getCounter() {
        return this.counter;
    }
}