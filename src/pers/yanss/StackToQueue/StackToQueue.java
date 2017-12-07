package pers.yanss.StackToQueue;

import java.util.Stack;

public class StackToQueue {
	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();

	/**
	 * 将元素入栈到stack1
	 * 
	 * @param num
	 */
	public void push(int num) {
		stack1.push(num);
	}

	/**
	 * stack2不为空时，直接将stack2出栈；stack2为空，将stack1中所有元素出栈，并入栈到stack2
	 * 
	 * @return
	 */
	public int pop() {
		if (stack1.empty() && stack2.empty()) {
			throw new RuntimeException("Queue is empty!");
		}
		if (stack2.empty()) {
			while (!stack1.empty()) {
				stack2.push(stack1.pop());
			}
		}
		return stack2.pop();
	}

	/**
	 * 两个栈同时为空返回true
	 * 
	 * @return boolean
	 */
	public boolean empty() {
		return stack1.size() == 0 && stack2.size() == 0;
	}
}
