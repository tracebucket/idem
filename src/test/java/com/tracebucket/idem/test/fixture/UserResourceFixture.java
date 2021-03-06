package com.tracebucket.idem.test.fixture;

import com.tracebucket.idem.rest.resource.UserResource;
import com.tracebucket.idem.test.builder.UserResourceBuilder;

import java.util.UUID;

/**
 * @author ssm
 * @since 13-03-15
 */
public class UserResourceFixture {
    public static UserResource standardUser() {
/*        Set<Authority> authorities = new HashSet<Authority>();
        authorities.add(AuthorityFixture.userAuthority());*/
        UserResource user = UserResourceBuilder.anUserBuilder()
                //.withUsername("user")
                .withUsername(UUID.randomUUID().toString())
                .withPassword("password")
                .withAccountNonExpired(true)
                .withAccountNonLocked(true)
                .withCredentialsNonExpired(true)
                .withEnabled(true)
                .build();
        return user;
    }
}