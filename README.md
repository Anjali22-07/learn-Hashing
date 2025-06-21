# 🔐 Hashing in Data Structures

This repository contains examples, explanations, and implementations of **Hashing** – a fundamental concept in data structures and algorithms used to map data to fixed-size values (hash codes) for fast access and lookup.

---

## 📚 What is Hashing?

Hashing is the process of converting an input (or 'key') into a fixed-size string of bytes, typically for use in hash tables.

A **hash table** uses a **hash function** to compute an index into an array of buckets or slots, from which the desired value can be found.

---

## ✅ Features

- Basic explanation of hashing
- Implementation of a simple hash table
- Collision handling using:
  - Chaining
  - Open Addressing (Linear Probing, Quadratic Probing)
- Load factor and resizing
- Common hash functions (modulo, division method, etc.)
- Real-world applications of hashing

---

## 🧠 Why Use Hashing?

- **Fast access**: Average time complexity for search, insert, delete is O(1)
- **Efficient memory use** compared to other data structures like arrays or linked lists
- Useful in:
  - Databases
  - Caching
  - Cryptography
  - Compilers
  - Search engines

---

## 🧠 HashMap – A key-value pair structure with average O(1) operations.
Key methods: put(), get(), containsKey(), remove()
Internally uses hashing, handles collisions via chaining, and resizes based on the load factor.

## 🌿 HashSet – Stores unique values with constant time performance.
Built on top of HashMap, using only the keys.
Key methods: add(), contains(), remove(), isEmpty()

---

## 🛠 Technologies

- Language: Java / C++ / Python (choose based on your implementation)
- IDE: VS Code / IntelliJ / PyCharm
- Tools: Console-based

## 👩‍💻 Author Anjali GitHub: 
```
Anjali22-07

```
Feel free to fork the repo, contribute, or open issues for improvements!
