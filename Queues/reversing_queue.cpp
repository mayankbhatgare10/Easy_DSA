/*Give an algorithm for reversing a queue Q. Only the following standard operations are allowed on queue. 

enqueue(x): Add an item x to the rear of the queue.
dequeue(): Remove an item from the front of the queue.
empty(): Checks if a queue is empty or not.
The task is to reverse the queue. */

// CPP program to reverse a Queue
#include <bits/stdc++.h>
using namespace std;

// Utility function to print the queue
void Print(queue<int>& Queue)
{
	while (!Queue.empty()) {
		cout << Queue.front() << " ";
		Queue.pop();
	}
}

// Function to reverse the queue
void reverseQueue(queue<int>& Queue)
{
	stack<int> Stack;
	while (!Queue.empty()) {
		Stack.push(Queue.front());
		Queue.pop();
	}
	while (!Stack.empty()) {
		Queue.push(Stack.top());
		Stack.pop();
	}
}

// Driver code
int main()
{
	queue<int> Queue;
	Queue.push(10);
	Queue.push(20);
	Queue.push(30);
	Queue.push(40);
	Queue.push(50);
	Queue.push(60);
	Queue.push(70);
	Queue.push(80);
	Queue.push(90);
	Queue.push(100);

	reverseQueue(Queue);
	Print(Queue);
}
