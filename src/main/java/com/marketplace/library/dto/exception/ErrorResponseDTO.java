package com.marketplace.library.dto.exception;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Muhammed Shaheer
 * @since 07 December 2020
 */

@Getter
@Setter
@NoArgsConstructor
public class ErrorResponseDTO {

    private String message;
    private String code;

    public ErrorResponseDTO(String message, String code) {
        this.message = message;
        this.code = code;
    }

    @Override
    public String toString() {
        return "{" +
                "message='" + message + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
