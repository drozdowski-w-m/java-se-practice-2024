package pl.globallogic.exercises.ex47;

abstract class ListItem {
    protected ListItem rightLink, leftLink;
    protected Object value;

    ListItem(Object value){
        this.value = value;
    }

    abstract ListItem next();
    abstract ListItem setNext(ListItem listItem);
    abstract ListItem previous();
    abstract ListItem setPrevious(ListItem listItem);
    abstract int compareTo(ListItem listItem);

    Object getValue(){
        return value;
    }

    void setValue(Object value){
        this.value = value;
    }

}
