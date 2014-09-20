/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myuniverse;
import java.util.Random;

/**
 *
 * @author lsmoore
 */
public class Planet {
    private String name;
    private int x, y;
    private int pirateChance;
    private int policeLevel;
    private TechLevel techLevel;
    private Resources resources;
    private GovernmentType govType;
    private SolarSystem solarSystem;
    
    
    public Planet(String name, int x, int y, SolarSystem ss){
        this.name = name;
        this.x = x;
        this.y = y;
        solarSystem = ss;
        
        Random rand = new Random();
        pirateChance = rand.nextInt(100);
        policeLevel = rand.nextInt(10);
        techLevel = TechLevel.values()[rand.nextInt(8)];
        govType = GovernmentType.values()[rand.nextInt(6)];
        resources = Resources.values()[rand.nextInt(13)];
    }
   
}
