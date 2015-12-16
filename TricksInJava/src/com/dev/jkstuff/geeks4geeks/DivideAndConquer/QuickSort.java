package com.dev.jkstuff.geeks4geeks.DivideAndConquer;

public class QuickSort {
	static int a[];

	public void display() {
		for (int i : a) {
			System.out.print(i + " , ");
		}
	}

	public QuickSort(int[] ar) {
		this.a = ar;

	}

	public static void main(String[] args) {
		int a[] = { 1, 1, 2, 2, 6, 6, 2, 2, 8, 8, 3, 3, 9, 9, 9, 9, 9 };
		QuickSort s = new QuickSort(a);
		s.sortme(0, a.length - 1);
		s.display();
	}

	public static int part(int p, int q) {
		int x = a[p];
		int i = p;
		int j = p + 1;
		while (j <= q) {
			if (a[j] <= x) {
				i = i + 1;
				exchange(i, j);
			}
			j++;
		}
		exchange(i, p);
		return i;
	}

	private static void exchange(int i, int j) {
		int t = 0;
		t = a[i];
		a[i] = a[j];
		a[j] = t;

	}

	public int[] sortme(int p, int q) {// in the first time p=0 q= a.length-1;
		if (p < q) {
			int r = part(p, q);
			sortme(p, r - 1);
			sortme(r + 1, q);
		}
		return a;
	}

}