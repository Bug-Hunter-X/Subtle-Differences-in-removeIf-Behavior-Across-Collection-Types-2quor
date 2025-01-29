# Kotlin removeIf() Behavior Across Collection Types

This repository demonstrates a subtle difference in how `removeIf()` works with different mutable collection types in Kotlin (`MutableList`, `MutableSet`, `MutableMap`).  While seemingly straightforward, the function's behavior can be unexpected if not thoroughly understood.

## Bug Description
The `removeIf()` function removes elements from a collection based on a predicate.  However, the way this removal affects iteration and element access differs between lists, sets, and maps.

Specifically, iterating during removal can lead to unexpected outcomes, with only the current iterated item considered for removal, possibly skipping other elements that would also satisfy the predicate. This is especially true when the predicate interacts with indices or key/value relationships (which differ among the three collection types).

## Solution
The provided solution emphasizes safe ways to handle `removeIf()`, and suggests alternative approaches to avoid potential pitfalls, especially when removal conditions depend on relationships between multiple collection items.