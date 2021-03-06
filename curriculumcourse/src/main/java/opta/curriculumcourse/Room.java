package opta.curriculumcourse;

import org.optaplanner.core.impl.domain.solution.AbstractSolution;
import org.optaplanner.core.api.score.buildin.hardmediumsoft.HardMediumSoftScore;
import org.optaplanner.core.api.score.buildin.hardsoft.HardSoftScore;
import org.optaplanner.core.api.score.buildin.hardsoftdouble.HardSoftDoubleScore;
import org.optaplanner.core.api.score.buildin.simpledouble.SimpleDoubleScore;
import org.optaplanner.core.api.score.buildin.bendable.BendableScore;
import org.optaplanner.core.api.score.buildin.simple.SimpleScore;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Room implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String code;
	private int capacity;

	private java.lang.Long id;

	public Room() {
	}

	public java.lang.String getCode() {
		return this.code;
	}

	public void setCode(java.lang.String code) {
		this.code = code;
	}

	public int getCapacity() {
		return this.capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public Room(java.lang.String code, int capacity, java.lang.Long id) {
		this.code = code;
		this.capacity = capacity;
		this.id = id;
	}

}