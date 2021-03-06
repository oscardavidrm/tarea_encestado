/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videogame;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author oscarrodriguez
 */
public class KeyManager implements KeyListener {

    /**
     *
     */
    public boolean Q;      // flag to move up the player

    /**
     *
     */
    public boolean P;    // flag to move down the player

    /**
     *
     */
    public boolean A;    // flag to move left the player

    /**
     *
     */
    public boolean L;   // flag to move right the player

    private boolean keys[];  // to store all the flags for every key

    /**
     *
     */
    public KeyManager() {
        keys = new boolean[256];
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // set true to every key pressed
        keys[e.getKeyCode()] = true;
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // set false to every key released
        keys[e.getKeyCode()] = false;
    }

    /**
     * to enable or disable moves on every tick
     */
    public void tick() {
        Q = keys[KeyEvent.VK_Q];
        P = keys[KeyEvent.VK_P];
        A = keys[KeyEvent.VK_A];
        L = keys[KeyEvent.VK_L];
    }
}
