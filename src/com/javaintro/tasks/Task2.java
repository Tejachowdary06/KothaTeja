package com.javaintro.tasks;

public class Task2 {

	void main() {
		hello();
	}

	int hello() {
		try {
			return 10;
		} catch (Exception e) {
			return 30;
		}
		finally {
			return 20;
		}
	}
}
