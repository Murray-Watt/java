# Time Needed Buy Tickets
## Introduction
This problem aims to calculate the total time required to buy tickets for people standing in line, considering the time it takes to buy a ticket for each person before and after the person at the kth position. We need to find the minimum total time spent without allocating tickets in order.
Intuition
To reach the kth position, we need to account for the time spent on every person in front of the kth position. For people after the kth position, we only need to consider the time spent on one less ticket.
## Approach

Initialize the total time spent as the time spent on the kth position ticket.
Iterate through the tickets array once.

Divide the tickets into "beforeTickets" (including the kth position) and "afterTickets."
Use Math.min for both before and after positions to account for cases where there are more tickets before or after the kth position than the kth position itself.
Return the total time spent.

## Pseudocode

function minTimeToBuyTickets(tickets, k):
    n = tickets.length
    totalTime = tickets[k]
    beforeTickets = tickets[k]

    for i = 0 to k-1
        totalTime += Math.min(beforeTickets, tickets[i])

    afterTickets = beforeTickets - 1

    for i = k+1 to n-1
        totalTime += Math.min(afterTickets, tickets[i])

    return totalTime

## Complexity
Time complexity: One iteration of the array of size n plus constant space. O(n)
Space complexity: Constant space O(1)
Test cases
Considered test cases include a normal case, an edge case with all tickets equal to the kth position ticket, and an extreme case with many more tickets before the kth position than after.

## Conclusion
The proposed solution has a time complexity of O(n) and a space complexity of O(1), which demonstrates its efficiency. However, further optimizations could be explored, such as handling specific cases separately to reduce unnecessary computations.