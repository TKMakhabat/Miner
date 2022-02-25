package com.example.miner.components;

import com.example.miner.interfaces.IAlgorithm;
import org.springframework.stereotype.Component;

import java.security.MessageDigest;

@Component
public class HashFunctions implements IAlgorithm {

    @Override
    public String getHash(byte[] inputBytes, String algorithm) {
        String hashValue = "";
        try {
            MessageDigest messageDigest  = MessageDigest.getInstance(algorithm);
            messageDigest.update(inputBytes);
            byte[] digestedBytes = messageDigest.digest();
            hashValue = hexToString(digestedBytes);

        }
        catch  (Exception ignored){
        }
        return  hashValue;
    }

}
