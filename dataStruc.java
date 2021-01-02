public class solution {
    public void method(int a) {
    // Array
    Integer[] t = new Integer[5];
    Integer[] t1 = new Integer[]{1, 9, 2, 3};
    int[] a = new int[n];
    Arrays.fill(a, 1);
    
    // increasing sort
    Arrays.sort(a);
    // decresing sort, lambda expression 
    Arrays.sort(a, (x1, x2) -> (x2 - x1));
    
    Point[] points = new Point[5];
    // filling something then, implement comparator for sort 
    Arrays.sort(points, new Comparator<Point>(){
        @Orverride
        public int compare(Point p1, Point p2) {
            return p1.x - p2.x;    
        }
    });

    List<String> stringList = new ArrayList<>();
    // add some strings then
    String message = String.join("", stringList);

    // 2-d Array
    int[][] a2 = new int[m][n];
    for (int[] row: a2) {
        Arrays.fill(a2, x);
    }

    // 3-d Array
    int [][][] a3 = new int[n][m][k];
    for (int[][] mat : a3) {
        for (int[] row : mat) {
            Arrays.fill(row, 1);
        }
    }
    // List
    //  ArrayList
    List<Integer> arrayList  = new ArrayList<>();
    List<Integer> arrayList  = new ArrayList<>(Arrays.asList(1, 2, 3));
    
    // insert
    arrayList.add(1);
    // remove 
    arrayList.remove(arrayList.size() - 1);
    // access 
    arrayList.get(index);

    // LinkedList 
    LinkedList List<Integer> linkedList = new LinkedList<>(); 

    // Stack
    Stack<Integer> stack = new Stack<>(); 
    boolean e = stack.isEmpty();
    // top elememt
    Integer top = stack.peek();
    
    // remove the top elememt
    Integer last = stack.pop();

    // add
    stack.push(1); 


    // Deque
    Deque<Integer> deque = new LinkedList<>(); 
    
    deque.offerFirts(1);
    int first = deque.peekFirst();
    int last = deque.pollLast();
    int cur = deque.peekLast();

    // Queue
    Queue<Integer> q = new LinkedList<>();
    Queue<Integer> q = new ArrayDeque<>();

    // insert
    boolean x = q.offer(x);
    // peek 
    int x = q.peek();
    // pop
    int p = q.poll();
     
    // Trie tree 
    
    // HashMao 
    // create 
    HashMap Map<Integer, Integer> map = new HashMap<>();
    
    // insert
    map.put(key, value);
    map.put(1, 3);

    // get
    int value = map.get(key);
    int value = map.getOrDefault(key);

    // check contains
    map.contains(key);

    // iterate
    for (Integer key : map.keySet()){
        Intgeter value = map.get(key);
    }

    for (Map.Entry<Integer, Integer> entry, map.entrySet()){
        Integer key = entry.getKey();
        Integer value = entry.getValue();
    }
    
    
    HashMap Map<Integer, Set<Integer>> map = new HashMap<>();
    map.computeIfAbsent(1, new HashSet<>());
    map.get(1).add(2);

    // convert map value to List
    //  Example ===========>
     Map<Integer, Set<Integer>> map = new HashMap<>();
        for (int i = 0; i < 4; i++) {
            map.put(i, new HashSet());
            for (int j = 0; j <= i; j++) {
                map.get(i).add(j);
            }
        }
        List<Set<Integer>> res = new ArrayList<Set<Integer>>(map.values());
        for (Set<Integer> s : res){
            for (Integer x : s){
                System.out.print(x + " ");
            }
            System.out.println(" ");
        }
    // <============
    return new ArrayList<Set<Integer>>(map.values());

    // HashSet
    hashSet Set<Integer> set = new HashSet<>();
    // TreeMap
    Map<Integer, Integer> maps = new TreeMap<>();
    //      lower  floor   ceiling higher 
    // =================num====================
    map.floorKey(num); // greatest key <= num
    map.ceilingKey(num); // smallest key >= num
    map.lowerKey(num); // greatest key < num
    map.higherKey(num); // smallest key > num 

    // TreeSet 
    Set<Ineger> set = new TreeSet<>();
    Integer val = set.ceiling(x); // find the least number >= x
    // Heap
    Queue<Integer> q = new PriorityQueue<>();
    Queue<Integer> q = new PriorityQueue<>((a, b) -> a - b);
    Queue<Integer> q = new PriorityQueue<>(Colletions.reverseOrder());

    // create heap from a list
    List<Integer> list = new ArrayList<>();
    // add something in the list, then 
    Queue<Integer> q = new PriorityQueue<>(list);

    // insert
    boolean x = q.offer(x);
    // peek 
    int x = q.peek();
    // pop
    int p = q.poll();

    // Uinon find  
    // String
    String string = "Ellie is smart!";
    // first index of e
    int firstIndex = string.indexOf('e');
    // len
    int len = string.length();
    // to char[]
    char[] charArray = string.toCharArray();
    // remove head and tail space
    string.trim();

    // check if two strings are the same
    string.equal(str2);

    // split
    String[] stringArray = string.split(" ");

    // substring index1: inclusive, index2: not inclusive
    String sub = string.substring(index1, index2);

    }


    String s = 1 + "024";
    s.startWith(word, i);
    // string to Integer
    Integer res = Integer.valueOf(s);
    // string to char array
    char[] charArray = s.toCharArray();

}
