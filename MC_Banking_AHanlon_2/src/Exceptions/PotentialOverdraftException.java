/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author csykes20
 */
public class PotentialOverdraftException extends Exception
{
    public PotentialOverdraftException(String s)
    {
        super(s);
    }
}