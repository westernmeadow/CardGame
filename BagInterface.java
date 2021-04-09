//
//  Name:       Kwan, Wesley
//  Homework:   1
//  Due:        2/10/20
//  Course:     cs-2400-02
//
//  Description:
//              Interface of the bag ADT.
//
public interface BagInterface<T> {
    public int getCurrentSize();
    public boolean isEmpty();
    public boolean add(T newEntry);
    public T remove();
    public boolean remove(T anEntry);
    public void clear();
    public int getFrequencyOf(T anEntry);
    public boolean contains(T anEntry);
    public T[] toArray();
}