package com.testcases.generations;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class User implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "the age of user")
	private int age;
	@org.kie.api.definition.type.Label(value = "user name")
	private java.lang.String name;
	@org.kie.api.definition.type.Label(value = "what generation the user belongs to. ")
	private java.lang.String generation;

	public User() {
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.lang.String getGeneration() {
		return this.generation;
	}

	public void setGeneration(java.lang.String generation) {
		this.generation = generation;
	}

	public User(int age, java.lang.String name, java.lang.String generation) {
		this.age = age;
		this.name = name;
		this.generation = generation;
	}

}