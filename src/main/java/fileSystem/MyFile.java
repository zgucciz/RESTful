package fileSystem;


public class MyFile {
	
	private String name;
	private boolean isHidden;
	
	public MyFile(String name, boolean isHidden){
		this.name = name;
		this.isHidden = isHidden;
	}
	
	public MyFile(String name){
		this(name, false);
	}

	public MyFile(){
		this("NewFile");
	}
	
	public String getName(){
		return this.name;
	}
	
	public boolean getIsHidden(){
		return this.isHidden;
	}
}
