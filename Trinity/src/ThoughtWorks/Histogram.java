package ThoughtWorks;

import java.util.Stack;

public class Histogram {

	public static void main(String[] args) {
		
		Histogram histogram = new Histogram();
		int arr[] = {2,1,2, 3, 5, 3, 1};
		System.out.println(histogram.maxHistogram(arr));

	}

	public int maxHistogram(int[] arr) {
		Stack<Integer> stack = new Stack<>();
		int maxArea = 0, area = 0;
		int i = 0;
		for (i = 0; i < arr.length;) {

			if (stack.isEmpty() || arr[stack.peek()] <= arr[i]) {
				stack.push(i++);
			} else {
				int index = stack.pop();
				if (stack.isEmpty()) {
					area = arr[index] * i;
				} else {
					area = arr[index] * (i - stack.peek() - 1);
				}
				if (area > maxArea)
					maxArea = area;
			}
		}

		while (!stack.isEmpty()) {
			area = 0;
			int index = stack.pop();
			//System.out.println("Popped value "+index);
			if (stack.isEmpty()) {
				area = arr[index] * i;
			} else {
				area = arr[index] * (i - stack.peek() - 1);
			}
			if (area > maxArea)
				maxArea = area;
		}

		return maxArea;
	}

}
