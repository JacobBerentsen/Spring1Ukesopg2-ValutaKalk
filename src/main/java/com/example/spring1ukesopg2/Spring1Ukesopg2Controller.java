package com.example.spring1ukesopg2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Locale;


@RestController
public class Spring1Ukesopg2Controller {
    //private ArrayList<Valuta> valutaRegister = new ArrayList<>();

    @GetMapping("/")
    public double hei(String valuta, double antall){

        double nok = 0;


        switch (valuta.toLowerCase()) {
            case "usd", "dollar", "$":
                nok = 9;
                break;

            case "eur", "euro", "€":
                nok = 10.1;
                break;

            case "gbp", "pund", "£":
                nok = 12.12;
                break;

            case "sek", "svensk":
                nok = 0.94;
                break;

            case "dkk", "dansk":
                nok = 1.36;
                break;

        }

        nok *= antall;
        return nok;
    }
}