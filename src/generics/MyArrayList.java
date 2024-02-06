package generics;

public class MyArrayList<T> {
    private T[] array;
    private int size;
    private int initialCapacity;

    @SuppressWarnings("unchecked")
    public MyArrayList(int initialCapacity){
        this.array = (T[]) new Object[initialCapacity];
        this.size = 0;
        this.initialCapacity = initialCapacity;
    }

    /**
     * size
     * Returns the number of elements that array contains
     * @return The unmber of elements
     */
    public int size(){
        return this.size;
    }

    /**
     * Determines if there is not any element in array
     * @return true if is empty false in other case
     */
    public boolean isEmpty(){
        return this.size==0;
    }

    /**
     * add
     * Add an element to the array at the end
     * @param elem Element to add
     */
    @SuppressWarnings("unchecked")
    public void add(T elem){
        if(array!=null && size==array.length){
            T[] aux = null;
            aux = array.clone();
            array = (T[]) (new Object[size+this.initialCapacity]);
            for(int i = 0; i<aux.length; i++)
                array[i] = aux[i];
        }
        else if(array==null){
            array = (T[]) (new Object[this.initialCapacity]);
        }
        array[size++] = elem;
    }

    /**
     * add
     * Insert an element to the array in a specified position
     * @param index Position of the element
     * @param elem Element to insert
     */
    @SuppressWarnings("unchecked")
    public  void add(int index, T elem){
        if(index >=0 && index < size){
            T[] aux = array.clone();
            if(size==array.length){
                array = (T[]) (new Object[size+this.initialCapacity]);
            }
            for(int i = 0; i<index; i++)
                array[i] = aux[i];
            array[index]=elem;
            for(int i = index; i<size; i++)
                array[i+1] = aux[i];
                size++;
        }
        else
            throw new IndexOutOfBoundsException();
    }

    /**
     * get
     * Obtain an Element from a position
     * @param index Position of the element to obtain
     * @return The previous element in that position
     */
    public T get(int index){
        if(index>=0 && index<size)
            return array[index];
        else    
            throw new IndexOutOfBoundsException();
        
    }

    /**
     * set
     * Update an element of a specified position
     * @param index Position to update
     * @param elem Element to save
     * @return The previous element in that position
     */
    public T set(int index, T elem){
        if(index>=0 && index<size){
            T previous = array[index];
            array[index] = elem;
            return previous;
        }
        else    
            throw new IndexOutOfBoundsException();
    }

    /**
     * Remove an element from a position in the array
     * @param index osition of the element to remove
     * @return The previous element in that position
     */
    public T remove(int index){
        if(index>=0 && index<size){
            T previous = array[index];
            for(int i = index; i < size-1; i++)
                array[i] = array[i+1];
            array[--size]=null;
            return previous;
        }
        else
            throw new IndexOutOfBoundsException();
    }

    /**
     * clear
     * Delete all the array
     */
    public void clear(){
        array=null;
        size=0;
    }

    @Override
    public String toString() {
        String ret="[";
        for(int i = 0; i < size-1; i++)
            ret+=array[i]+", ";
        if(size!=0)
            ret+=array[size-1];
        ret+="]";
        return ret;
    }
}
