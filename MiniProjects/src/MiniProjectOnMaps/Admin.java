package MiniProjectOnMaps;

public class Admin {
	private String name;
	private Integer id;
	private String city;
	
	
	public Admin() {
		super();
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	@Override
	public String toString() {
		return "Admin [name=" + name + ", id=" + id + ", city=" + city + "]";
	}
	
}
