package com.dev.jkstuff.feedly.interview.techgig;

import java.util.Vector;

public class SkyLineProblem {

	public class SkyLine {
		int capacity, n;
		Vector<Strip> strips;

		public void append(Strip s) {
			for (Strip strip : strips) {
				if (strip.height == s.height)
					return;
				if (strip.left == s.left) {
					strip.height = max(strip.height, s.height);
					return;
				}
				
			}
			return;
		}

		
		private int max(int height, int height2) {
			return 0;
		}

	}

	public class Building {
		int left, height, right;

		public Building() {
		}

		Building(int left, int height, int right) {
			this.left = left;
			this.height = height;
			this.right = right;
		}
	}

	public class Strip {
		int left, height;

		public Strip() {
		}

		public Strip(int left, int height) {
			this.left = left;
			this.height = height;
		}

	}

}
