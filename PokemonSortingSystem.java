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
        String opponentType = null;
        int winnerCount = 0;

        // Find opponent's strength and type
        for (Pokemon pokemon : pokemonList) {
            if (pokemon.getName().equals(opponentName)) {
                opponentStrength = pokemon.getStrength();
                opponentType = pokemon.getType();
                break;
            }
        }

        // Determine winners based on type advantages
        String[] winners = new String[pokemonList.length];
        int index = 0;

        for (Pokemon pokemon : pokemonList) {
            if (!pokemon.getName().equals(opponentName)) { // Exclude the opponent from the comparison
                double effectivenessFactor = 1.0;

                // Compare types and apply the appropriate effectiveness factor
                if (pokemon.getType().equals("Flame")) {
                    if (opponentType.equals("Grass")) {
                        effectivenessFactor = 5.0/7.0;
                    } else if (opponentType.equals("Water")) {
                        effectivenessFactor = 1.4;
                    }
                } else if (pokemon.getType().equals("Grass")) {
                    if (opponentType.equals("Water")) {
                        effectivenessFactor = 2.0/3.0;
                    } else if (opponentType.equals("Flame")) {
                        effectivenessFactor = 1.5;
                    }
                } else if (pokemon.getType().equals("Water")) {
                    if (opponentType.equals("Flame")) {
                        effectivenessFactor = 0.8;
                    } else if (opponentType.equals("Grass")) {
                        effectivenessFactor = 1.25;
                    }
                }

                if (opponentStrength * effectivenessFactor < pokemon.getStrength()) {
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
