package Entity;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class Emp {
	private Integer id;
	private String name;
	private Double sal;

}
