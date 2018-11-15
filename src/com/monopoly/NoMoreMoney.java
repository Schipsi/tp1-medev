package com.monopoly;

/**
 * Class NoMoreMoney est une classe qui herite de Exception
 * @author Exia
 */
class NoMoreMoney extends Exception{
    public NoMoreMoney(String message){
        super(message);
    }
    public NoMoreMoney(){
        super("No more money!");
    }
}