package MemoryAllocation;

public class MemoryWork {
	public static void main(String[] args) {
	
		var textBox1 = new TextBox();
		var textBox2 = textBox1;
		textBox2.setText("Memory Allocation Work");
		System.out.println(textBox1.text);
	}
}
