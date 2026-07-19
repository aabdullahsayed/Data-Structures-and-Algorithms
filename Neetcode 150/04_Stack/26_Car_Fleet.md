# 26. Car Fleet

**Difficulty:** Medium

**Pattern:** Sort by position + Monotonic Stack of arrival times

## Key Idea
Process cars from closest to the target backward; a car forms a new fleet only if its arrival time (time to reach target) is strictly greater than the fleet ahead of it — otherwise it merges into (is absorbed by) that fleet.

## Approach
1. Pair up (position, speed), sort descending by position (closest to target first).
2. Compute time_to_target = (target - position) / speed for each car in that order.
3. Maintain a stack of fleet times. For each car's time: if stack is empty or time > stack[-1] (this car arrives strictly later, can't catch up), push it as a new fleet.
4. If time <= stack[-1], it catches up and merges — do NOT push (it joins the fleet ahead, which sets the pace).
5. Answer is the final size of the stack (number of distinct fleets).

## Complexity
Time: O(n log n) for the sort | Space: O(n)

## Edge Cases
Single car -> 1 fleet, all cars already form one fleet, cars starting at target itself.

## Related / Notes
Monotonic-stack-of-'events' pattern, similar spirit to Daily Temperatures but comparing computed times instead of raw values.
