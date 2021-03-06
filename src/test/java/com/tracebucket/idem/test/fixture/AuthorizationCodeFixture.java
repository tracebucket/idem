package com.tracebucket.idem.test.fixture;

import com.tracebucket.idem.domain.AuthorizationCode;
import com.tracebucket.idem.test.builder.AuthorizationCodeBuilder;

/**
 * @author ssm
 * @since 13-03-15
 */
public class AuthorizationCodeFixture {
    public static AuthorizationCode standardAuthorizationCode() {
        AuthorizationCode authorizationCode = AuthorizationCodeBuilder.anAuthorizationCodeBuilder()
                .withCode("Code")
                .withAuthentication("AuthorizationCode".getBytes())
                .build();
        return authorizationCode;
    }
}