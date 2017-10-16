
///// comments /////

// this is a a single line comment

/*
 * this is a multi-line comment
 */

/**
 * this is a javaDoc comment, for writing comments for api
 */

///// i/o /////

// input from System.in example
Scanner in = new Scanner(System.in);
int n = in.nextInt();
String[] unsorted = new String[n];
for(int unsorted_i=0; unsorted_i < n; unsorted_i += 1){
    unsorted[unsorted_i] = in.next();
}

// output to system.out example
System.out.println("print this");

///// string /////
String name = "Shun";
// string is immutable, i.e. we cannot do something like name[2] = 's'
// get a char from a string
char secondLetter = name.charAt(1);
// length of a string
int name_length = name.length();

///// String Builder /////
// use stringBuilder to build up strings (duh)
StringBuilder builder = new StringBuilder();
// optional constructors
StringBuilder builder = new StringBuilder(int cap);
StringBuilder builder = new StringBuilder(String str);

// add to string builder
builder.append(char c);
// get character at
builder.charAt(integer);

// important** turn string builder back into a string
String builder_string = builder.toString();

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

// list a hashable!!



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

// advance usage
// synchronized hashmap
Collections.synchronizedMap(bank);
// synchronizedMap provides better concurrency for parallel programming

///// hashSet /////

// just like hashmap, but just a set, again the elements must be hashable
HashSet<Integer> hashset_of_integers = new HashSet<Integer>();

// operators for hashset is very similiar to hashmap, see hashmap section of this file for more detail

///// set /////

// set is a collection of *unique* elements

// initialization
Set<Integer> set_of_integers = new Set<Integer>();

// add element
set_of_integers.add(10);

// remove element if present
set_of_integers.remove(10);

// get size
set_of_integers.size();


// test if an element is in the set
boolean isTenInSet = set_of_integers.contains(10);

///// iterator /////

// important and basic methods for iterator
iterator.hasNext(); // return a boolean
iterator.next(); // return the next element in the iterator

///// custom comparator /////

// example
// this comparator compare integers represented in string without the need to convert string to integers
Comparator<String> comparator = new Comparator<String>() {

    @Override
    public int compare(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return 1;
        }
        else if (s1.length() < s2.length()) {
            return -1;
        }
        else {
            return s1.compareTo(s2);
        }
    }
};
