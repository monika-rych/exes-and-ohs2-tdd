package com.exesandohs;

import java.util.Arrays;
import java.util.Optional;

public class ExesAndOhs {



/*    public boolean checkXO(String input) {
        char[] letters = input.toCharArray();
        if(letters[0] == 'X'){
            return false;
        }
        if(input.indexOf("x") == -1){
            return true;
        }

        for (char letter:letters) {
            if(letter != 'x' && letter != 'o' && letter != 'O' && letter != 'X'){
                return false;
            }
        }
        return true;
    }
}*/
    public boolean checkXO(String input) {
        char[] letters = input.toCharArray();
        int counterOfX = 0;
        int counterOfO = 0;

        for (char letter:letters) {
            if(letter == 'x' | letter == 'X' ){
                counterOfX ++;
            } else if(letter == 'o' | letter == 'O') {
                counterOfO++;
            }
        }
        if(counterOfO == counterOfX){
                return true;
            }

        return false;
    }
}
