package fileSystem;


import java.util.ArrayList;

public class Folder {

	private static boolean showHidden = true;
	
	private String name;
	private boolean isHidden;
	private ArrayList<Folder> subfolders;
	private ArrayList<MyFile> subfiles;	
	
	public Folder(String name, boolean isHidden){
		this.name = name;
		this.isHidden = isHidden;
		this.subfiles = new ArrayList<MyFile>();
		this.subfolders = new ArrayList<Folder>();
	}
	
	public Folder(String name){
		this(name, false);
	}
	
	public Folder(){
		this("NewFolder");
	}
	
	public static boolean getShowHidden(){
		return showHidden;
	}
	
	public String getName(){
		return this.name;
	}
	
	public boolean getIsHidden(){
		return this.isHidden;
	}
	
	public ArrayList<Folder> getSubfolders(){
		return this.subfolders;
	}
	
	public ArrayList<MyFile> getSubfiles(){
		return this.subfiles;
	}
	
	public static void setShowHidden(boolean showHidden){
		Folder.showHidden = showHidden;
	}
	
	public void addSubfolder(Folder subfolder){
		this.subfolders.add(subfolder);
	}
	
	public void addSubfile(MyFile subfile){
		this.subfiles.add(subfile);
	}
	
}
