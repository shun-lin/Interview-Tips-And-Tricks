
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

///// two-d array /////
int[][] two_d_array = int[max_col][max_row];

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

///// hashmap ///// ** very very important

// initializatin
Hashmap<Key_Type, Value_Type> hashmap = new Hashmap<Key_Type, Value_Type>();
// caution: Key_Type and Value_Type must be hashable, for example a list is not hashable because its mutable

// example
Hashmap<String, Integer> bank = new Hashmap<String, Integer>();

// insertion
bank.put("Shun", 20);
bank.put("Pei", -20);

// get value
bank.get("Shun");

// check if hashmap contains key
bank.containsKey("Shun"); // return a boolean, in this case true
// get the set of keys
Set<String> set_of_keys = bank.keySet();
// get the iterator of set of keys
Iterator<String> iterator_of_keys = bank.keySet().iterator();
// value doesn't have set because value doesn't have to be unique

// check if hashmap contains value
bank.containsValue(20); // return a boolean, in this case true

// get the size
bank.size();
// check if it is empty
bank.isEmpty();

// removing an object form the hashmap
Object value = bank.remove(key);
// key must be in the hashmap

//sorting hashmap
// to sort hashmap, we need to convert it to treemap
Tree Map sorted_bank = new TreeMap(bank);
// this will sort the hashmap, in this example the bank, by key from smallest to largest
