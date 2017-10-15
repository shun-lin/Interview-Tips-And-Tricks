import queue as Q

# examples

pq = Q.priorityQueue()
pq.put(1)
pq.put(5)
pq.put(10)

while not pq.empty():
    pq.get()

# 1 5 10

pq2 = Q.priorityQueue()
pq2.put((10, "10"))
pq2.put((2, "2"))
pq2.put((-2, "-2"))

while not pq2.empty():
    pq2.get()

# (-2 "-2"), (2, "2"), (10, "-10")
# (priority, item)
