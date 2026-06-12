## How Recursion Works

Recursion is a programming technique where a **function calls itself** to solve a smaller instance of the same problem.

* **The Core Idea:** Instead of using a loop (like a `for` or `while` loop) to repeat an action, a recursive function tackles a small part of the problem and passes the remaining part back to itself.
* **The Base Case (The Stop Sign):** Every proper recursive function must have a base case. This is the condition under which the function *stops* calling itself and simply returns a value. Without it, the function will loop forever and cause a `StackOverflowError`.
* **The Recursive Case:** This is the part of the function where it modifies the input data and calls itself again, moving closer and closer to the base case.
* **The Call Stack:** Your computer uses an internal stack to manage function calls. When a function calls itself, the current execution is paused, and the new call is pushed onto the top of the stack. Once the base case is reached, the computer begins "popping" the functions off the stack one by one, resolving the final answer.

---

## Java Implementation: Factorial

A classic example of recursion is calculating the factorial of a number ($n!$), which is the product of all positive integers up to $n$ (e.g., $3! = 3 \times 2 \times 1 = 6$).

Here is how you implement it in Java:

```java
public class RecursionExample {

    // Recursive method to calculate factorial
    public static int factorial(int n) {
        // 1. Base Case: standard math dictates 1! (and 0!) equals 1.
        // This is where the recursion stops.
        if (n <= 1) {
            return 1;
        }
        
        // 2. Recursive Case: n * factorial of (n - 1)
        // The function calls itself with a smaller number, moving closer to 1.
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int number = 5;
        int result = factorial(number);
        System.out.println("The factorial of " + number + " is: " + result);
    }
}

```

### Visualizing the Call Stack for `factorial(3)`

1. `factorial(3)` is called $\rightarrow$ It's not the base case, so it waits for `3 * factorial(2)`.
2. `factorial(2)` is called $\rightarrow$ It's not the base case, so it waits for `2 * factorial(1)`.
3. `factorial(1)` is called $\rightarrow$ **Base Case hit!** It returns `1`.
4. The stack unwinds:
* `factorial(2)` resolves to `2 * 1 = 2`.
* `factorial(3)` resolves to `3 * 2 = 6`.