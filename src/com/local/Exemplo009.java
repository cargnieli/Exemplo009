package com.local;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exemplo009 {

    public static void main(String[] args) {

        Date agora = new Date();

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

        String dataformatada = formatter.format(agora);

        System.out.println("Hoje é dia: " + dataformatada);


    }
}
