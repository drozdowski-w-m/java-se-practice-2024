package pl.globallogic.exercises.ex47;

public class MyLinkedList implements NodeList{
    private ListItem root;

    public MyLinkedList(ListItem listItem){
        this.root = listItem;
    }

    @Override
    public ListItem getRoot(){
        return this.root;
    }
    @Override
    public boolean addItem(ListItem listItem){
        //if ( root == null )
        return true;
    }
    @Override
    public boolean removeItem(ListItem listItem){
        return true;
    }
    @Override
    public void traverse(ListItem listItem){

    }
}
