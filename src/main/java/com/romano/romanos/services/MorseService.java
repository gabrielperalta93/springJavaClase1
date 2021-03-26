package com.romano.romanos.services;

import java.util.HashMap;
import java.util.Map;

public class MorseService {
    public static String traducir(String morseCode)
    {
        String[] code
                = { ".-",   "-...", "-.-.", "-..",  ".",
                "..-.", "--.",  "....", "..",   ".---",
                "-.-",  ".-..", "--",   "-.",   "---",
                ".--.", "--.-", ".-.",  "...",  "-",
                "..-",  "...-", ".--",  "-..-", "-.--",
                "--..", "|" };

        // morse code to English Hashmap
        Map<String, Character> morseToEnglish
                = new HashMap<>();
        // Map value allocation
        for (int i = 0; i < 26; i++) {
            morseToEnglish.put(code[i], (char)('a' + i));
        }
        // Split morse code in array of string
        String[] array = morseCode.split(" ");

        // Morse code to English
        String convertido = "";
        for (int i = 0; i < array.length; i++) {
            if(morseToEnglish.get(array[i]) == null){
                convertido = convertido + " ";
            }else
                convertido = convertido + morseToEnglish.get(array[i]);
        }
        return convertido;
    }
}
