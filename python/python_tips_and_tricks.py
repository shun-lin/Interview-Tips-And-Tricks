'''
    Data strctures to know: List, sets, tuples, dictionaries (hashmap),
'''

# List
# Construct a list
l = list()
l = [1, 2, 'hi']
# add to list
l.append("hello")
# slicing
l[1:]
# get element
l[0]
l[-1]

# use list as a stack, use append and pop
l.append(1)
l.pop()

# useful list operations
l.extend(l2)
l.sort()
l.reverse()

# List comprehension
l_squared = [x ** 2 for x in l]

# set
# set is an unordered collection of elements, and those elements are unique
s = set(l)
s = set()
s = {1, 2, 3}

# elements in a set must be hashable, list is not hashable, need to use tuple instead
s = set([1, [2, 3]]) # this will throw exception as [2, 3] is unhashable

s = set([1, (2, 3)]) # this will not throw exception as (2, 3), a tuple, which can't be modified, is hashable

# useful set operations
s.union(s2) # same as s | s2
s.intersection(s2) # same as s & s2
s.difference(s2) # same as s - s2

# set also have set comprehensions
s2 = {x for x in s if x in "hello"}

#Frozensets
# frozenset is a set that is immutable
s_frozen = fronzeset(s)

#Tuples
#Tuples are immutable, but can hold mutable objects
t = ();
t = tuple();
t = (1, 2);
# good for putting into a set or dictionary, it is hashable, and good for something we don't have to change

#Dictionary (hashmap)
#Very very very important!
#Have key : value part, key must be hashable (so not list can be a key)

dictionary = dict();
dictionary = {1 : 'a', 2: 'b'}

# how to use in for loop
for key in dictionary:
    print(dictionary[key])

# important and useful built-in functions
d.keys()
d.values()
d.iteritems() # return an iterator of items
d.itervalues() # return an iterator of values
d.has_key()

# linked list
# python does not have a directly named linked list data strctures, but collections.deque is internally implmented using doubly linked-list
ll = collections.deque()

# string is immutable! need to turn it into a list to modify it and join it back
string = "hi"
can_modify = list(string)
can_modify[1] = '0'
new_string = ''.join(can_modify)
print(new_string)

# 'ho'
