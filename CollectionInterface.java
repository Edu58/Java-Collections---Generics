public class CollectionInterface {
    /*
    The mother of all collections is an interface appropriately named Collection . It
    serves as a container that holds other objects, its elements. It doesn’t specify exactly
    how the objects are organized.
    it doesn’t say, for example, whether duplicate objects are allowed or whether the objects are ordered in any way.
    These kinds of details are left to child interfaces.

    The Collection interface defines the following methods:

    public boolean add(element){
        Adds the supplied object to this collection. If the operation succeeds, this method
        returns true . If the object already exists in this collection and the collection does
        not permit duplicates, false is returned. Furthermore, some collections are read-only.
        Those collections throw an UnsupportedOperationException if this method is called.
    }

    public boolean remove(element) {
        Removes the specified object from this collection. Like the add() method, this
        method returns true if the object is removed from the collection. If the object
        doesn’t exist in this collection, false is returned. Read-only collections throw an
        UnsupportedOperationException if this method is called.
    }

    public boolean contains(element) {
        Returns true if the collection contains the specified object.
    }

    public int size()
        Returns the number of elements in this collection.
    }

    public boolean isEmpty() {
        Returns true if this collection has no elements.
    }
    public Iterator iterator() {
        Examines all the elements in this collection. This method returns an Iterator ,
        which is an object you can use to step through the collection’s elements
    }

    Additionally, the methods addAll() , removeAll() , and containsAll() accept
    another Collection
     */

    public static void main(String[] args) {

    }
}
