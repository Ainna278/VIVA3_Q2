/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pokemontest;

/**
 *
 * @author User
 */
public class PokemonTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pokemon moltres = new Pokemon ("Moltres", "Flame", 85.0);
        Pokemon servine = new Pokemon ("Servine", "Grass", 60.0);
        Pokemon charmander = new Pokemon ("Charmander", "Flame", 92.0);
        Pokemon pansage = new Pokemon ("Pansage", "Grass", 55.0);
        Pokemon araquanid = new Pokemon ("Araquanid", "Water", 74.0);
        Pokemon flareon = new Pokemon ("Flareon", "Flame", 65.0);
        Pokemon squirtle = new Pokemon ("Squirtle", "Water", 63.0);
        Pokemon wooper = new Pokemon ("Wooper", "Water", 42.0);
        
        Pokemon[] PokemonList = {moltres, servine, charmander, pansage, araquanid, flareon, squirtle, wooper};
    
        PokemonSortingSystem.sortPokemonByStrength(PokemonList);
        
        System.out.println("List of Pokemon after Sorting: ");
        for (Pokemon pokemon : PokemonList) {
            System.out.println(pokemon.getName());
        }
        
        System.out.println();
        
        String opponentName = "Squirtle";
        String[] winners = PokemonSortingSystem.determineWinner(opponentName, PokemonList);
        
        System.out.print("Pokemon effective against " + opponentName + ":");
        
        for (String winner : winners) {
            System.out.print(winner + ", ");
        }
    }
    
}
