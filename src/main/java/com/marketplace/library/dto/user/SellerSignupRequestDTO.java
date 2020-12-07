package com.marketplace.library.dto.user;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Muhammed Shaheer
 * @since 06 December 2020
 */

@Getter
@Setter
@NoArgsConstructor
public class SellerSignupRequestDTO {

    private String legalName;
    private String displayName;
    private String emailId;
    private String password;
    private String countryCode;
    private String mobileNumber;
}
