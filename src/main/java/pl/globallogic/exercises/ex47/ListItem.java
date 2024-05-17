package pl.globallogic.exercises.ex47;

abstract class ListItem {
    protected ListItem rightLink, leftLink;
    protected Integer value;

    ListItem(Integer value){
        this.value = value;
    }

    abstract ListItem next();
    abstract ListItem setNext(ListItem listItem);
    abstract ListItem previous();
    abstract ListItem setPrevious(ListItem listItem);
    abstract int compareTo(ListItem listItem);

    public Integer getValue(){
        return value;
    }

    public void setValue(Integer value){
        this.value = value;
    }

}
