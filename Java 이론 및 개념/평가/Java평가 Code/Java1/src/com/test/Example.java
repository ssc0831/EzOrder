package com.test;

class Power {
    private int kick;
    private int punch;
    
    public Power(int kick, int punch) {
        this.kick = kick;
        this.punch = punch;
    }
    
    public int getKick() {
        return kick;
    }
    
    public void setKick(int kick) {
        this.kick = kick;
    }
    
    public int getPunch() {
        return punch;
    }
    
    public void setPunch(int punch) {
        this.punch = punch;
    }
}

public class Example {
    public static void main(String[] args) {
        Power robot = new Power(10, 20);
        robot.setKick(30);
        robot.setPunch(20);
        
        int kickPower = robot.getKick();
        int punchPower = robot.getPunch();
        
        System.out.println("Kick power: " + kickPower);
        System.out.println("Punch power: " + punchPower);
    }
}

