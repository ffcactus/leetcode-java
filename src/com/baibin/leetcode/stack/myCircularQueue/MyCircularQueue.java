package com.baibin.leetcode.stack.myCircularQueue;

public class MyCircularQueue {
    // The index that is used to save the current head.
    private int head;
    // The index that is used to save the next element.
    private int tail;
    private int capacity;
    private int[] space;

    public MyCircularQueue(int k) {
        capacity = k + 1;
        space = new int[capacity];
        head = tail = 0;
    }

    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }
        space[tail] = value;
        tail = (tail + 1) % capacity;
        return true;
    }

    public int Rear() {
        if (isEmpty()) {
            return -1;
        }
        return space[(tail - 1 + capacity) % capacity];
    }

    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        head = (head + 1) % capacity;
        return true;
    }

    public int Front() {
        if (isEmpty()) {
            return -1;
        }
        return space[head];
    }

    public boolean isEmpty() {
        return tail == head;
    }

    public boolean isFull() {
        return (tail + 1) % capacity == head;
    }
}
