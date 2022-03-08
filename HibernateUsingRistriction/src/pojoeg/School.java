package pojoeg;
import javax.persistence.*;
@Entity
@Table(name="school")

public class School {
	@Id
private int rn;
	@Column
private String name;
	public int getRn() {
		return rn;
	}
	public void setRn(int rn) {
		this.rn = rn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
