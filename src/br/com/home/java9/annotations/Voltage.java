package br.com.home.java9.annotations;

import java.lang.annotation.Repeatable;

@Repeatable(Voltages.class)
public @interface Voltage {
    String volts();
}

