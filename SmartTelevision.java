package week04_2;

public class SmartTelevision implements RemoteControl, Searchable {
	public void turnOn() {
		System.out.println("TV를켭니다.");
		}
	public void turnOff() {
		System.out.println("TV를끕니다.");
		}
	public void search(String url) {
		System.out.println(url + "을검색합니다.");
		}
	}
