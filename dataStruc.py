 def method():    
    # Array
    array = [0] * 5
    array = [1, 9, 2, 3]
    
    # Increasing sort
    array.sort() # inplace
    array2 = sorted(array)

    # Decresing sort, lambda expression 
    array.sort(key = lambda x : -x)

    # complicated sorting, like decreasing by count then increasing by char 
    class Tuple:
        def __init__(self, count, name):
            self.count = count
            self.name = name
    tuples = []
    
    # Filling some tuplle then, implement comparator for sort 
    tuple.sort(key = lambda x:(-x.count, x.name))

    stringList = []
    # Add some strings or characters then 
    message = String.join("", stringList);

    # 2-d Array
    matrix = [[0] * n for i in range(m)]


    # 3-d Array matrix[k][m][n]
    cube = [[[0] * n for i in range(m)] for j in range(k)]
    
    arrayList = []

    # Insert
    arrayList.append(1);

    # Remove last  
    del arrayList[-1]
    
    # Access 
    arrayList[index]

    # LinkedList 
    linkedList = []

    # Stack
    stack = []
    if stack or len(stack) != 0

    # Top elememt
    stack[0]
    
    # Remove the top elememt
    stack.pop()

    # Add
    stack.append(x)

    # Deque
    deque = collections.deque()
    
    a = [1,3,4]
    deque = collections.deque(a)

    deque.appendleft(5)

    int first = deque[0]
    int last = deque.pop()
    int cur = deque[-1]

    # Queue
    queue = []

    # Insert
    queue.append(1)

    # Peek 
    int x = queue[0]
    # Pop
    int p = queue.pop(0)
     
    # Trie tree 
    
    # HashMao 
    # Create 
    hashMap = {} 
    
    # Insert
    hashMap["Ellie"] = 2

    # Get
    value = hashMap.get(key)
    value = hashMap.get("Ellie")
    value = hashMap.get("Ellie", 0)

    # Check contains
    if key in hashMap
    if "Ellie" in hashMap

    # Iterate
    for key in hashMap:
        value = hashmap[key]

    for key, value in hashMap.items():
   
    # Nested hashmap HashMap Map<Integer, Set<Integer>> map 
    cache = collections.defaultdict(set)
    # Add x in the set of cache[1]
    cache[1].add(x)

    # Convert map value to List
    #  Example ===========>
        return [list(cache.get(key)) for key in cache]
    # <============





    # HashSet
    s = set()
    # check contains
    if x in s

    # add
    s.add(x)


    # Heap
    a = [1, 5, 3]
    heapq.heapify(a)

    # For heapify order, we need to implement __ls__ function in the class 
    # Exampe ======>
    class Node:
    def __init__(self, val, pos):
        self.val = val
        self.pos = pos

    def __lt__(self, other):
        if self. pos == other.pos:
            return self.val < other.val
        return other.pos < self.pos

    q = [Node('a', 100), Node('b', 200), Node('a', 10), Node('c', 100)]
    heapq.heapify(q)
    while q:
        cur = heapq.heappop(q)
        print("value ", cur.val, "pos: ", cur.pos)

    """
    ans:
    value  b pos:  200
    value  a pos:  100
    value  c pos:  100
    value  a pos:  10

    """
           # <================

    # Insert
    heapq.heappush(q, x)
    # Peek 
    q[0]
    # Pop
    heapq.heappop(q)

    # Uinon find  
    # String
    s = "Ellie is smart!";
    # First index of e
    firstIndex =s.index('e');
    # Len
    len(s)
    # To char[]
    array = list(s)
    # Remove head and tail space
    s.strip()

    # Check if two strings are the same
    s1 = "Peter"
    s2 = "Peter"
    print(s1 == s2) # True

    # Split
    array = s.split(" ")

    # Substring index1: inclusive, index2: not inclusive
    sub = s[index1:index2]



    


    String s = 1 + "024";
    s.startWith(word, i);
    # String to Integer
    Integer res = Integer.valueOf(s);
    # String to char array
    char[] charArray = s.toCharArray();

}
