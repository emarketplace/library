package com.marketplace.library.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.ObjectUtils;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author Muhammed Shaheer
 * @since 07 December 2020
 */

public class HashingUtil {
    private static final Logger logger = LoggerFactory.getLogger(HashingUtil.class);

    public static String getSha256Hash(String email) {
        if (!ObjectUtils.isEmpty(email)) {
            try {
                MessageDigest digest = MessageDigest.getInstance("SHA-256");
                byte[] encodedHash = digest.digest(email.getBytes(StandardCharsets.UTF_8));
                return bytesToHex(encodedHash);
            } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                logger.error("Error while generating email hash", noSuchAlgorithmException);
            }
        }
        return email;
    }

    private static String bytesToHex(byte[] hash) {
        StringBuilder hexString = new StringBuilder();
        for (byte b : hash) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1)
                hexString.append('0');
            hexString.append(hex);
        }
        return hexString.toString();
    }
}
