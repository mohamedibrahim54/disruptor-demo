# 🚀 Disruptor Demo

This repository showcases a simple demo using the [LMAX Disruptor](https://lmax-exchange.github.io/disruptor/) — a high-performance inter-thread messaging library designed for low-latency and high-throughput systems.

## 📌 What is LMAX Disruptor?

LMAX Disruptor is a concurrency framework that replaces traditional queues with a ring buffer, enabling efficient communication between threads without locks. It's widely used in performance-critical applications such as trading platforms and real-time analytics.

## 🧪 Demo Overview

This demo illustrates:
- How to set up and configure the Disruptor
- Creating events and event handlers
- Publishing messages to the ring buffer
- Processing events with minimal latency


## 🛠️ Requirements

- Java 11+
- Maven

## ▶️ Running the Demo

1. Clone the repository:
   ```bash
   git clone https://github.com/mohamedibrahim54/disruptor-demo.git
   cd disruptor-demo

2. Build and run:
   ```bash
   mvn clean install
   java -jar target/disruptor-demo.jar

## 📚 Resources
- [LMAX Disruptor Documentation](https://lmax-exchange.github.io/disruptor/)
- [Disruptor Technical Paper](https://lmax-exchange.github.io/disruptor/files/Disruptor-1.0.pdf)

## 🧠 Author
[Mohamed Ibrahim](https://github.com/mohamedibrahim54/) Passionate about high-performance systems and concurrent programming.
