# Floyd's cycle detection in Java

A small algorithm practice project that finds a repeated integer in an array using the tortoise-and-hare technique.

## Run the example

Install a Java Development Kit (JDK), then run these commands from this folder:

```sh
javac Floyd.java
java Floyd
```

The sample array is `[2, 1, 3, 4, 2]`. The program prints `2`.

## How it works

Each array value points to another index. For the sample, following those pointers from index zero produces `0 → 2 → 3 → 4 → 2`. The repeated value is the entry to the cycle.

1. Move a slow pointer one step and a fast pointer two steps until they meet inside the cycle.
2. Reset the fast pointer to index zero. Move both pointers one step at a time until they meet again at the cycle entry.

The implementation takes **O(n) time** and **O(1) additional space**, and leaves the input unchanged.

## Input contract

`findDuplicate(int[] nums)` expects an array of length `n + 1`, with values from `1` to `n` and exactly one distinct value repeated. The repeated value may occur more than twice. Callers are responsible for satisfying these preconditions.

The implementation and runnable example are in [Floyd.java](Floyd.java).
