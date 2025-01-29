fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    val toRemove = list.filter { it % 2 == 0 } // Identify elements to remove separately
    list.removeAll(toRemove) // Remove all identified elements
    println(list) // Output: [1, 3, 5]

    val set = mutableSetOf(1, 2, 3, 4, 5)
    val toRemoveSet = set.filter { it % 2 == 0 }.toSet()
    set.removeAll(toRemoveSet)
    println(set) // Output: [1, 3, 5]

    val map = mutableMapOf(1 to "a", 2 to "b", 3 to "c", 4 to "d", 5 to "e")
    val keysToRemove = map.filter { it.key % 2 == 0 }.map { it.key }
    keysToRemove.forEach { map.remove(it) }
    println(map) // Output: {1=a, 3=c, 5=e}
} 