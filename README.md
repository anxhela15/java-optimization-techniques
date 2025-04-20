# Java JVM Optimization Techniques

This Maven project demonstrates **practical Java coding techniques** that improve JVM performance. Each optimization is implemented in a separate class and backed by JUnit 5 unit tests.

## ✅ Requirements

- Java 17
- Maven 3.6+
- JUnit 5

---

## Project Structure & Optimizations

### 1. `AutoboxingExample.java`
**Purpose**: Avoid unnecessary object creation by using primitive types instead of boxed types like `Integer`.

**Optimization**:
- Avoids frequent autoboxing/unboxing.
- Reduces memory allocation and GC pressure.

**Tests**:
- `AutoboxingExampleTest` validates the sum logic using both boxed and primitive types.

---

### 2. `BufferIOExample.java`
**Purpose**: Improve I/O performance by using buffered streams over unbuffered ones.

**Optimization**:
- Buffered I/O groups read/write operations, reducing expensive system calls.
- Boosts throughput for file operations.

**Tests**:
- `BufferIOExampleTest` reads a file with both buffered and unbuffered strategies and ensures the results match.

---

### 3. `ThreadLocalExample.java`
**Purpose**: Eliminate synchronization bottlenecks by giving each thread its own instance of an object.

**Optimization**:
- Uses `ThreadLocal` to make `SimpleDateFormat` thread-safe without synchronization.
- Prevents contention in multi-threaded environments.

**Tests**:
- `ThreadLocalExampleTest` checks correct date formatting using a known date string.

---

### 4. `ConcurrentCacheExample.java`
**Purpose**: Use a high-performance thread-safe map (`ConcurrentHashMap`) for shared caching.

**Optimization**:
- Avoids global synchronization by segmenting locks internally.
- Scales well with multiple threads using `computeIfAbsent`.

**Tests**:
- `ConcurrentCacheExampleTest` checks correctness and concurrency by running parallel threads.

---

### 5. `StringConcatOptimizer.java`
**Purpose**: Avoid repeated string concatenation using `+` in loops.

**Optimization**:
- Using `StringBuilder` inside loops prevents creation of intermediate `String` objects.
- Reduces memory churn and GC pressure.

**Tests**:
- Validates string concatenation using `StringBuilder` vs direct `+` approach.

---

### 6. `LoopOptimizationExample.java`
**Purpose**: Reduce redundant method calls inside loops.

**Optimization**:
- Cache the result of `list.size()` in a local variable.
- Prefer enhanced for-loops which are optimized by the compiler.

**Tests**:
- Validates both loop behaviors with expected iteration outputs.

---

### 7. `MemoizationExample.java`
**Purpose**: Avoid redundant computation of expensive operations.

**Optimization**:
- Implements caching using `Map` and `computeIfAbsent`.
- Common inputs are only computed once.

**Tests**:
- Validates caching by calling the method repeatedly with the same and different inputs.

---

## Running the Tests

Use the following command to run all unit tests:

```bash
mvn clean test
