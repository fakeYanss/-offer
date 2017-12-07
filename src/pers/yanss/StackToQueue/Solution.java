package pers.yanss.StackToQueue;
/**
 * ≤‚ ‘push()∫Õpop()∑Ω∑®
 * @author yanss
 *
 */
public class Solution {
	public static void main(String[] args) {
		StackToQueue stackToQueue = new StackToQueue();
		//stackToQueue.pop();
		stackToQueue.push(1);
		System.out.println(stackToQueue.pop());
		for (int i = 0; i < 10; i++) {
			stackToQueue.push(i);
		}
		while (!stackToQueue.empty()) {
			System.out.print(stackToQueue.pop() + " ");
		}
	}
}
