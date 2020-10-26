package project1;

public class Games {
	
	private String console;
	private String name;
	private int releaseDate;
	private int id;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getConsole() {
		return console;
	}
	public void setConsole(String console) {
		this.console = console;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(int releaseDate) {
		this.releaseDate = releaseDate;
	}
	
	public void printGame() {
		//System.out.println("Game ID is............: "+id);
		System.out.println("Game Title is.........: "+name);
		System.out.println("Game release date is..: "+releaseDate);
		System.out.println("Game console is.......: "+console);
		System.out.println();
	}

}
