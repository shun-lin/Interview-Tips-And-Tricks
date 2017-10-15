
///// comments /////

// this is a a single line comment

/*
 * this is a multi-line comment
 */

/**
 * this is a javaDoc comment, for writing comments for api
 */

///// list /////

// initialization

// arraylist
List<Integer> list_of_intergers = new ArrayList<Integer>();
// LinkedList
List<Integer> list_of_intergers = new LinkedList<Integer>();
// Vector
List<Integer> list_of_intergers = new Vector<Integer>();
// Stack
List<Integer> list_of_intergers = new Stack<Integer>();
// Stack is a LIFO data structure

// accessing
int third = list_of_intergers.get(2);

// delete
list_of_intergers.remove(index);

// add
list_of_intergers.add(index);



///// array /////

// initializatin

int[] array_of_integers = int[size_of_array];
// can not change size after initialization, if you want to change size, use list instead

// index accessing
int third = array_of_integers[2];

// turn array into a list
List<Integer> list_of_integers = Arrays.asList(array_of_integers);

///// queue /////

Queue<String> namesQueue = new LinkedList<String>();
// queue is a FIFO data structure

// insertion
namesQueue.add("Shun");

// removal
String first = namesQueue.remove();

///// priority queue /////

// priority queue is a data structure that reorders queue base on the priorities of the elements
// important*** the default java priority queue is implemented as min heap
Queue<Integer> intPQ = new PriorityQueue<Integer>(max_size_of_pq, comparator);

// advance usage
// The type of the priorityQueue can be your own defined type/class, if you wish to do this, you need to pass in a comparator
// which you should add in your own class

// add
intPQ.add(20);
intPQ.add(10);

// remove
int first = intPQ.poll();
int second = intPQ.poll();
