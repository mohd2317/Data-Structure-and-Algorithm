package collections.List.ArrayList;

public class ListBasic {

}

/*
Interview Must-Know Lines
ArrayList
Retrieval Operation | Best for random access (O(1) get/set)
❌ Avoid when frequent insertions/removals in the middle — shifting elements is costly.
Performance:
Access: O(1)
Insert/Remove end: O(1) amortized
Insert/Remove middle: O(n)
Example: Student records, product catalogs, search results.

LinkedList
Best for: Frequent insertions/removals in the middle or ends.
Bad for random access (O(n) traversal)
❌ Avoid when random access is frequent — traversal is O(n).
Performance:
Access: O(n)
Insert/Remove at ends: O(1)
Insert/Remove middle: O(n) traversal + O(1) insertion
Example: Undo history, playlist management, queue/deque implementations.

Vector
Best for: Thread-safe random access in legacy applications.
Thread-safe legacy → Vector (all methods synchronized).
❌ Avoid for new code — Collections.synchronizedList(new ArrayList<>()) is preferred.
Example: Legacy financial or government software.

Stack
LIFO DSA problem → Stack
Good for reversal problems, DFS, backtracking.
Modern stack → ArrayDeque
Always declare as collections.List for flexibility unless Stack or specific behavior is needed.


 */
