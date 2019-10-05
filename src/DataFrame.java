import java.util.*;
public class DataFrame
{
    String []types = null;
    String []names = null;
    ArrayList<Column> data = new ArrayList<>();
    public DataFrame(String []names, String []types)
    {
        this.types = types;
        this.names = names;
        for(String type: types)
        {
            data.add(new Column(type));
        }
    }
    public ArrayList<Object> get(String name)
    {
        int index = -1;
        int i=0;
        for (String _name: names)
        {
            if(name.equals(_name))
            {
                index = i;
            }
            i++;
        }
        if(index != -1 )
        {
            return data.get(i).column;
        }
        return null;
    }
    void ViewData()
    {
        System.out.println(data.size());
        for (int i=0; i<data.size(); i++)
        {
            for (int j=0; j<data.get(0).size(); j++)
            {
                System.out.print(data.get(i).get(j) + " ");
            }
            System.out.println(" ");
        }

    }

    public static void main(String [] args)
    {
        DataFrame MyData = new DataFrame(new String[]{"Ala", "Kot", "Kolezka"}, new String []{"Integer", "Integer", "String"});
        MyData.data.get(0).add(10);
        MyData.data.get(0).add(10);
        MyData.data.get(1).add(15);
        MyData.data.get(1).add(15);
        MyData.data.get(2).add("siema");
        MyData.data.get(2).add("yo");
        MyData.data.get(2).print();


        MyData.ViewData();


    }
}
