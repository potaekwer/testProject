package util;

public class Pageable {

	private int index;
	private int size;
	
	
	public Pageable(){}
	
	public Pageable(int index, int size){
		this.index = index;
		this.size = size;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
}
