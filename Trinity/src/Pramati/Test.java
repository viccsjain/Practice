package Pramati;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		int a[] = { -5, 4, -2, 3, 1, -1, -6, -1, 0, -5 };
		int min = 0, val = 0;
		for (int i = 0; i < a.length; i++) {
			if (min + a[i] < 0) {
				val = val - a[i] + 1;
				min = min - a[i] + 1;
				System.out.println(min);
			} else if (val + a[i] == 0) {
				val = val + a[i];
				min++;
				System.out.println(min);

			}
		}
		System.out.println(min);

	}

}
