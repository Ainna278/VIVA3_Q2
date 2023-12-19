/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemontest;

/**
 *
 * @author User
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;


public class PokemonSortingSystem {
    // Sorting method using Arrays.sort()
    public static void sortPokemonByStrength(Pokemon[] pokemonList) {
        Arrays.sort(pokemonList, (p1, p2) -> Double.compare(p1.getStrength(), p2.getStrength()));
    }

    public static String[] determineWinner(String opponentName, Pokemon[] pokemonList) {
        double opponentStrength = 0.0;
        int winnerCount = 0;

        for (Pokemon pokemon : pokemonList) {
            if (pokemon.getName().equals(opponentName)) {
                opponentStrength = pokemon.getStrength();
                break;
            }
        }

        // Determine winners based on type advantages
        String[] winners = new String[pokemonList.length];
        int index = 0;

        for (Pokemon pokemon : pokemonList) {
            if (!pokemon.getName().equals(opponentName)) { // Exclude the opponent from the comparison
                if (pokemon.getType().equals("Flame") && opponentStrength * 1.4 < pokemon.getStrength()) {
                    winners[index++] = pokemon.getName();
                } else if (pokemon.getType().equals("Grass") && opponentStrength * 1.5 < pokemon.getStrength()) {
                    winners[index++] = pokemon.getName();
                } else if (pokemon.getType().equals("Water") && opponentStrength * 1.25 < pokemon.getStrength()) {
                    winners[index++] = pokemon.getName();
                }
            }
        }

        // Create a new array with the correct size
        String[] trimmedWinners = new String[index];
        System.arraycopy(winners, 0, trimmedWinners, 0, index);

        return trimmedWinners;
    }
}