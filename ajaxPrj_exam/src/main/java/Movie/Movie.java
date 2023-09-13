package Movie;

public class Movie {
	
	String name;
	String supervise;
	String runtime;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSupervise() {
		return supervise;
	}
	public void setSupervise(String supervise) {
		this.supervise = supervise;
	}
	public String getRuntime() {
		return runtime;
	}
	public void setRuntime(String runtime) {
		this.runtime = runtime;
	}
	
	public Movie(String name, String supervise, String runtime) {
		super();
		this.name = name;
		this.supervise = supervise;
		this.runtime = runtime;
	}
	
	
	public Movie() {}
	
	
	@Override
	public String toString() {
		return "Movie [name=" + name + ", supervise=" + supervise + ", runtime=" + runtime + "]";
	}
	

}
