package com.example.miner.interfaces;

public interface IAlgorithm {

    default String hexToString(byte[] digest) {
        StringBuilder hexString = new StringBuilder();
        for (byte b : digest) {
            if ((0xff & b) < 0x10) {
                hexString.append("0").append(Integer.toHexString((0xFF & b)));
            } else {
                hexString.append(Integer.toHexString(0xFF & b));
            }
        }
        return hexString.toString();
    }

    String getHash(byte[] inputBytes, String algorithm);


}
