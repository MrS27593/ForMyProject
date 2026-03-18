package Projekty.PPJ.Wyklady.W16.dataStruct;
import Projekty.PPJ.Wyklady.W16.struct.Point;

public
    class MyList {

    private Node head;
    private Node tail;

    private int size;

    public MyList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void add(Point point){
        if(this.head == null){
            Node tmp = new Node(point);
            this.head = tmp;
            this.tail = tmp;
            size++;
        } else {
            Node tmp = new Node(point);
            this.tail.setNext(tmp);
            this.tail = tmp;
            size++;
        }
    }

    public Point viewData(int index) throws IllegalArgumentException {
        if(index >= size)
            throw new IllegalArgumentException(
                "index: "+index+" > size: "+size
            );

        Node tmp = this.head;
        int counter = 0;
        while(counter < index) {
            tmp = tmp.getNext();
            counter++;
        }

        return tmp.getData();
    }

    public int getSize(){
        return this.size;
    }
}
