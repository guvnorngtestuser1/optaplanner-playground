package opta.curriculumcourse;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Teacher implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String code;

	private java.lang.Long id;

	public Teacher() {
	}

	public java.lang.String getCode() {
		return this.code;
	}

	public void setCode(java.lang.String code) {
		this.code = code;
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public Teacher(java.lang.String code, java.lang.Long id) {
		this.code = code;
		this.id = id;
	}

}