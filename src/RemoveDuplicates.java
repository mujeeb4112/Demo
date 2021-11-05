
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Blog {
    private String title;
    private String author;
    private String url;
    private String description; 

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    Blog(String title, String author, String url, String description)
    {
        this.title = title;
        this.author = author;
        this.url = url;
        this.description = description; 
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        if(obj instanceof Blog)
        {
            Blog temp = (Blog) obj;
            if(this.title.equals(temp.title) && this.author.equals(temp.author) && this.url.equals(temp.url) && this.description.equals(temp.description))
                return true;
        }
        return false;
    }
    

    @Override
	public String toString() {
		return "Blog [title=" + title + ", author=" + author + ", url=" + url + ", description=" + description + "]";
	}

	@Override
    public int hashCode() {
        // TODO Auto-generated method stub
        
        return (this.title.hashCode() + this.author.hashCode() + this.url.hashCode() + this.description.hashCode());        
    }
}

public class RemoveDuplicates {

	public static void main(String[] args) {
	    Blog b1 = new Blog("A", "sam", "a", "desc");
	    Blog b2 = new Blog("B", "ram", "b", "desc");
	    Blog b3 = new Blog("C", "cam", "c", "desc");
	    Blog b4 = new Blog("A", "sam", "a", "desc");
	    Blog b5 = new Blog("D", "dam", "d", "desc");
	    List<Blog> list = new ArrayList();
	    list.add(b1);
	    list.add(b2);
	    list.add(b3);
	    list.add(b4);       
	    list.add(b5);
	    
	    //Removing Duplicates;
	    Set<Blog> s= new HashSet<Blog>();
	    s.addAll(list);         
	    list = new ArrayList<Blog>();
	    list.addAll(s);        
	    list.forEach((Blog st) -> System.out.println(st.toString()));
	    //Now the List has only the identical Elements
	}

}
