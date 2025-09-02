package com.rk.dependencyinversion;

import com.rk.singleresponsiblity.Marker;

public class Macbook {

    private final Keyboard keyboard;
    private final Mouse mouse;

    public Macbook(Keyboard keyboard, Mouse mouse) {

        this.keyboard = keyboard;
        this.mouse = mouse;
    }
}
