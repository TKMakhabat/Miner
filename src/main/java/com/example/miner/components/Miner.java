package com.example.miner.components;


import com.example.miner.interfaces.IAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Miner {

    @Autowired
    private final IAlgorithm algorithm;

    public Miner(IAlgorithm algorithm) {
        this.algorithm = algorithm;
    }


    public void checkHash(String message) {
        System.out.println(  "SHA-256 for the message: " + message +
                " is: " + algorithm.getHash(message.getBytes(), "SHA-256"));
    }
}
