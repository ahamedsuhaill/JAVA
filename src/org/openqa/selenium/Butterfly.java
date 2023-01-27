package org.openqa.selenium;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;

public class Butterfly {
    public void paintComponent(Graphics g) {
        // Set up the Graphics2D object
        Graphics2D g2d = (Graphics2D) g;
        
        // Set the color to orange
        g2d.setColor(Color.ORANGE);
        
        // Create a GeneralPath object to represent the butterfly
        GeneralPath butterfly = new GeneralPath();
        
        // Move to the starting point of the butterfly
        butterfly.moveTo(100, 100);
        
        // Draw the left wing
        butterfly.curveTo(50, 50, 50, 150, 100, 200);
        
        // Draw the body
        butterfly.lineTo(150, 150);
        
        // Draw the right wing
        butterfly.curveTo(200, 150, 200, 50, 150, 100);
        
        // Close the path to complete the butterfly shape
        butterfly.closePath();
        
        // Draw the butterfly
        g2d.fill(butterfly);
    }
}
