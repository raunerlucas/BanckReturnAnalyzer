package com.programin.rauner;

import com.programin.rauner.model.BoletoBancoBrasil;

import java.util.Calendar;
import java.util.Date;


public class Main {
    public static void main(String[] args) {
        BoletoBancoBrasil bb = new BoletoBancoBrasil(1, 1,
                new Date(2019, Calendar.DECEMBER,23), new Date(2019,Calendar.AUGUST,31), "12345678911", 106.2, 0.0, 0.0);
        bb.lerBoleto();
    }

}