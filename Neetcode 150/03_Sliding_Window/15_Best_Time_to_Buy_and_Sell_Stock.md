# 15. Best Time to Buy and Sell Stock

**Difficulty:** Easy

**Pattern:** Sliding Window / Track running minimum

## Key Idea
Keep the lowest price seen so far as the 'buy' point and compute profit at every day as a potential 'sell' point.

## Approach
1. Set min_price = prices[0], max_profit = 0.
2. For each price starting at index 1: profit = price - min_price; max_profit = max(max_profit, profit).
3. Update min_price = min(min_price, price).
4. Return max_profit.

## Complexity
Time: O(n) | Space: O(1)

## Edge Cases
Prices strictly decreasing -> profit 0, single-day array -> profit 0.

## Related / Notes
This is 'one transaction only'; Buy/Sell Stock II/III/IV allow multiple transactions (different DP pattern).
