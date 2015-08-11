package fileSystem;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.io.File;
@RestController
public class FolderController {

    

    public Folder fsBuild(String path){
    	File currentFolder = new File("F:\\testRoot"+path);
    	File[] children = currentFolder.listFiles();
    	Folder folder = new Folder(currentFolder.getName(), currentFolder.isHidden());
    	if(children != null)
    		for(int i = 0; i < children.length; i++){
    			if(children[i].isDirectory()) 
    				folder.addSubfolder(new Folder(children[i].getName(), children[i].isHidden()));
    				//folder.addSubfolder(fsBuild("\\"+children[i].getName()));  //полное заполнение дерева
    			else
    				folder.addSubfile(new MyFile(children[i].getName(), children[i].isHidden()));
    		}
    	return folder;
    };
    
    @RequestMapping(value  =  "/root",  method  =  RequestMethod.GET)
    public @ResponseBody Folder folder(@RequestParam(value="path", defaultValue="") String path) {  
    	Folder folder = fsBuild(path);
        return folder;
    }

}
