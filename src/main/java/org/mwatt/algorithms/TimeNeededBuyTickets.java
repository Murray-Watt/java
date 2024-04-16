package org.mwatt.algorithms;

public class TimeNeededBuyTickets {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int beforeTickets = tickets[k];         // will not be less than 1
        int afterTickets = beforeTickets - 1;   // Will not be less than 0
        int total = beforeTickets;              // The time spent of k's tickets

        for (int i=0; i < k; i++) {
            total += Math.min(tickets[i],beforeTickets);
        }

        if (afterTickets > 0) {
            for (int i=k+1; i <  tickets.length ; i++) {
                total += Math.min(tickets[i],afterTickets);
            }
        }

        return total;
    }
}
