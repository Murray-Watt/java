package org.mwatt.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthenticationManagerTest {

    @Test
    public void testAuthenticationManager() {
        AuthenticationManager authenticationManager = new AuthenticationManager(5);
        authenticationManager.renew("aaa", 1);
        authenticationManager.generate("aaa", 2);
        assertEquals(1, authenticationManager.countUnexpiredTokens(6));
        authenticationManager.generate("aaa", 5);
        assertEquals(0, authenticationManager.countUnexpiredTokens(7));
    }

}