/*  Created by IntelliJ IDEA.
 *  User: Lalit Saini (lalitsaini85)
 *  Date: 28/10/20
 *  Time: 8:50 PM
 *  File Name : Race.java
 * */
package main;

import thread.rabbit.Rabbit;
import thread.tortoise.Tortoise;

public class Race {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        rabbit.getRabbit().start();
        Tortoise tortoise = new Tortoise();
        tortoise.getTortoise().start();
    }
}
