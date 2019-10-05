import java.util.*;
public class Column
{
    String type = null;
    public ArrayList<Object> column = new ArrayList<>();
    public Column(String type)
    {
        this.type = type;
    }
    public boolean add(Object element)
    {
        String class_name = element.getClass().toString();
        String lastWord = class_name.substring(class_name.lastIndexOf(".")+1);
        if(lastWord.equals(type))
        {
            column.add(element);
            return true;
        }
        return false;
    }

    public int size()
    {
        return column.size();
    }
    public Object get(int number)
    {
        return column.get(number);
    }
    public void print(int start, int end ){
        for(int i = start; i<=end && i<column.size(); i++)
            System.out.println(column.get(i));
    }
    public void print(int start){
        for(int i = start; i<column.size(); i++)
            System.out.println(column.get(i));
    }
    public void print(){
        for(int i = 0; i<column.size(); i++)
            System.out.println(column.get(i));
    }


}
