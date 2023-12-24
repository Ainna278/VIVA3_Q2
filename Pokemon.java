/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemontest;

/**
 *
 * @author User
 */
public class Pokemon {
    private double strength;
    private String type;
    private String name;

    public Pokemon() {
        strength = 0.0;
        type = null;
        name = null;
    }

    public Pokemon(String n, String t, double s) {
        name = n;
        type = t;
        strength = s;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public String getType() {
        return type;
    }

    public void setType(String t) {
        type = t;
    }

    public double getStrength() {
        return strength;
    }

    public void setStrength(double s) {
        strength = s;
    }
}
