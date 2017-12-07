package pers.yanss.StackToQueue;

import java.util.Stack;

public class StackToQueue {
	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();

	/**
	 * ��Ԫ����ջ��stack1
	 * 
	 * @param num
	 */
	public void push(int num) {
		stack1.push(num);
	}

	/**
	 * stack2��Ϊ��ʱ��ֱ�ӽ�stack2��ջ��stack2Ϊ�գ���stack1������Ԫ�س�ջ������ջ��stack2
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
	 * ����ջͬʱΪ�շ���true
	 * 
	 * @return boolean
	 */
	public boolean empty() {
		return stack1.size() == 0 && stack2.size() == 0;
	}
}
