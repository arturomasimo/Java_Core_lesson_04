package lession4;
public class Robot {
	private String name;
	private String action;

	Robot (String name, String action) {
		this.action = action;
		this.name = name;
	}
	public void work() {
		System.out.println("Я "+name+" – я " + action);
		}
}
