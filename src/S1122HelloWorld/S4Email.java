package S1122HelloWorld;

import java.io.Serializable;
import java.util.Set;

import org.apache.ibatis.type.Alias;
@Alias("email")
public class S4Email implements Serializable{
	private int id;
	private String name;
	private Set<S5MessageM> messageMSet;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	
	
	public Set<S5MessageM> getMessageMSet() {
		return messageMSet;
	}
	public void setMessageMSet(Set<S5MessageM> messageMSet) {
		this.messageMSet = messageMSet;
	}
	public S4Email() {
		super();
	}
	@Override
	public String toString() {
		return "T04Email [id=" + id + ", name=" + name + ", messageMSet="
				+ messageMSet + "]";
	}

	
}
