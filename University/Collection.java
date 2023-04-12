import java.sql.Date;

public class Collection{
    private String collectionType;
    private List<Item> items;
    private Section section;

    public Collection(String collectionType, Section section){
        this.collectionType = collectionType;
        this.section = section;
        this.items = new ArrayList<>();
    }
    
    public void addItem(Item item){
        this.items.add(item);
    }
    public void addSection(Section section){
        this.sections.add(section);
    }

    public String getCollectionType(){
        return collectionType;
    }
    public void setCollectionType(String collectionType){
        this.collectionType = collectionType;
    }

    public List<Item> getItems(){
        return items;
    }
    public void setItems(List<Item> items){
        this.items = items;
    }

    public List<Section> getSections(){
        return sections;
    }
    public void setSections(List<Sections> sections){
        this.sections = sections;
    }
}
    
