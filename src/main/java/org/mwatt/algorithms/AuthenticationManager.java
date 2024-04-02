package org.mwatt.algorithms;

import java.util.HashMap;
import java.util.Map;

/*
  Future improvements:
      clean up expired tokens when renewing
      don't create a new token if the token already exists
      look up if a token is expired by token id
      isExpired(String tokenId, int currentTime)
      remove(String tokenId)
 */
class AuthenticationManager {

    private int timeToLive;

    private Map<String,Integer> tokens = new HashMap<>();

    public AuthenticationManager(int timeToLive) {
        this.timeToLive = timeToLive;
    }

    public void generate(String tokenId, int currentTime) {
        tokens.put(tokenId,currentTime + timeToLive);
    }

    public void renew(String tokenId, int currentTime) {
        if (tokens.containsKey(tokenId) && tokens.get(tokenId) > currentTime) {
            tokens.put(tokenId,currentTime + timeToLive);
        }
    }

    public int countUnexpiredTokens(int currentTime) {
        int count = 0;

        for (String key : tokens.keySet()) {
            if (tokens.get(key) > currentTime) {
                count++;
            }
        }

        return count;
    }
}
