package com.bridgelab1;

import java.util.Objects;

public abstract class Bird {
	enum Color{RED, GREEN, BLACK_WHITE, WHITE}
	 String id;
	 String name;
	 Color color;
	 
	 @Override
	  public String toString() {
		  return "Bird [id=" + id + ", name=" + name + ", Color=" + color + "]";
	  }
	 
//	 void fly() {
//		  System.out.println(getClass().getSimpleName() + "I can fly");
//	  }
	  void eat() {
		  System.out.println(getClass().getSimpleName() + "I can eat");
	  }
//	  void swim() {
//		  System.out.println(getClass().getSimpleName() + "I can swim");
//	  }

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bird other = (Bird) obj;
		return Objects.equals(id, other.id);
	}
}
