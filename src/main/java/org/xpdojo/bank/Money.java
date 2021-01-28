package org.xpdojo.bank;

/**
 * Immutable class to represent Money as a concept.
 * This class should have no accessor methods.
 */
public class Money {
    private int value;
    public Money(int value){
    if(value<0) throw new IllegalArgumentException("Incorrect Value");
        this.value =value;
    }
    public Money add(Money money){
        return new Money(this.value+money.value);
    }
}

