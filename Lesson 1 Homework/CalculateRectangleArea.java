class CalculateRectangleArea {
	public static void main(String[] args) {
		double width = Double.parseDouble(args[0]);
		double height = Double.parseDouble(args[1]);
		double area = width * height;
		System.out.println("The area of the rectangle is: " + area);
	}
}
