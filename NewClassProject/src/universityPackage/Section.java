package universityPackage;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Section{
    private String name;
    private List<Collection> collections;

    public Section(String name){
        this.name = name;
        this.collections = new ArrayList<>();
    }

    public void addCollection(Collection collection){
        this.collections.add(collection);
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public List<Collection> getCollections(){
        return collections;
    }
    public void setCollections(List<Collection> collections){
        this.collections = collections;
    }
}
