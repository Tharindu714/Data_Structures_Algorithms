# Data Structures & Algorithms — Project Overview

**One-line description**
A clean, educational Java Maven project that implements core data structures and algorithms for study, reference, and interview practice.

---

## Purpose & Goals

This repository collects practical, well-structured Java implementations of common data structures and algorithm patterns so you can:

* Learn and revise core DSA concepts quickly.
* Use tested examples as reference implementations in your projects.
* Prepare for coding interviews with concrete code you can run, inspect, and extend.

The code is intentionally written for readability and clarity rather than micro-optimizations — ideal for study and teaching.

---

## What’s included (high-level)

* Implementations of common data structures (arrays, stacks, queues, linked lists, trees, heaps, hash maps, graphs, etc.).
* Algorithm examples (sorting, searching, traversals, dynamic programming patterns, graph algorithms like BFS/DFS, shortest paths where present).
* A standard Maven layout (`pom.xml`) so you can build and run from your IDE or the command line.
* Source files under `src/main/java/com/tharindu/Data` (organized by concern or problem type).

---

## Key packages and responsibilities

> Note: replace any package/file names below with exact class names if you want a file-by-file listing.

* `com.tharindu.Data.structures` — core data structures (List, Stack, Queue, TreeNode, GraphNode, etc.).
* `com.tharindu.Data.algorithms` — algorithm implementations (sorting, search, DP, graph algorithms).
* `com.tharindu.Data.utils` — helper utilities, input/output helpers, or common helpers used by examples.
* `com.tharindu.Data.examples` — small `main()` classes or demos that show how to run a structure/algorithm.

These logical groupings make it easy to find code when you want to study a specific topic.

---

## How to use this repo (quick steps)

1. **Clone** the repository:

```bash
git clone https://github.com/Tharindu714/Data-Structures-Algorithms-FULL.git
cd Data-Structures-Algorithms-FULL
```

2. **Open** the project in your IDE (IntelliJ IDEA / Eclipse) as a Maven project.

3. **Build** with Maven from command line:

```bash
mvn clean package
```

4. **Run examples**:

* Look for classes with `public static void main(String[] args)` inside `src/main/java/com/tharindu/Data`.
* Run them from your IDE or use Maven Exec plugin if configured. Example:

```bash
mvn -q exec:java -Dexec.mainClass="com.tharindu.Data.examples.YourExampleMain"
```

5. **Experiment**:

* Open a data structure class, add `System.out.println` checks or small drivers to try different inputs.
* Convert classes to generics (`<T>`) if you want broader reuse.

---

## How to study this repo (recommended path)

1. **Pick a data structure** (e.g., LinkedList). Read the code, then write a small `main()` that constructs and manipulates it.
2. **Trace the algorithm** on paper for a small input (helps internalize how it works).
3. **Write unit tests** (JUnit) that cover edge cases (empty, single element, large inputs).
4. **Optimize**: after understanding, try to improve complexity or convert to a generic implementation.
5. **Implement variants**: e.g., convert recursive tree traversal to iterative using a stack.

This hands-on cycle (read → run → test → improve) is the fastest way to master DSA.

---

## Example: How to run a sorting demo (if present)

1. Find a `SortingDemo` or similar class in `examples`.
2. Run it from the IDE or using the `exec:java` command shown above.
3. If no demo exists, create a quick `main()` like this:

```java
public class SortingDemo {
  public static void main(String[] args) {
    int[] arr = {5, 3, 8, 1, 2};
    QuickSort.sort(arr);
    System.out.println(Arrays.toString(arr));
  }
}
```

Replace `QuickSort.sort` with the actual sorting class and method found in the repo.

---

## Contributing & Next steps you might want

* Add Javadoc comments to public classes and methods.
* Add unit tests (JUnit) for every structure/algorithm demonstrating typical and edge cases.
* Add small `examples/` classes for each topic so others can run and learn quickly.
* Add a single `Main` CLI that accepts arguments to run specific demos (useful for teaching).

---

## Code-style & conventions (suggested)

* Keep methods small and focused (single responsibility).
* Prefer descriptive names: `insertAtHead()` over `ins()`.
* Add brief Javadoc for every public type and method.
* Use generics for collections where appropriate.

---

## Where this is useful

* Interview preparation (understand common patterns and pitfalls).
* Course assignments and teaching demos.
* Reference implementations to copy/adapt in personal projects.

---

## License

This repo uses the MIT License — you can reuse and adapt the code freely with attribution.

