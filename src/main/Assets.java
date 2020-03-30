/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.image.BufferedImage;

/**
 *
 * @author oscarrodriguez
 */
public class Assets {

    /**
     * to store background image
     */
    public static BufferedImage background;
    
    /**
     * to store background image
     */
    public static BufferedImage throwZone;

    /**
     * to store the player image
     */
    public static BufferedImage ball;

    /**
     * Loading the images and sound clips for the global game
     */
    public static void init() {
        background = ImageLoader.loadImage("/images/space_background.jpg");
        throwZone = ImageLoader.loadImage("/images/throw_zone.png");
        ball = ImageLoader.loadImage("/images/basketball.jpg");
    }

}
