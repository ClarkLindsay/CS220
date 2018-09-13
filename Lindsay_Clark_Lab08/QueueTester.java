public class QueueTester{
   
   public static void main(String[] args){
      CircularQueue<String> queue = new CircularQueue<String>(10);
      
      System.out.println("IsEmpty: " + queue.isEmpty());
      
      queue.enqueue("1");
      queue.enqueue("2");
      queue.enqueue("3");
      queue.enqueue("4");
      queue.enqueue("5");
      
      System.out.println("IsEmpty: " + queue.isEmpty());
      
      System.out.println("Front: " + queue.getFront());
      System.out.println("Removing: " + queue.dequeue());
      System.out.println("Front: " + queue.getFront());
      System.out.println("Removing: " + queue.dequeue());
      System.out.println("Front: " + queue.getFront());
      System.out.println("Removing: " + queue.dequeue());
      System.out.println("Front: " + queue.getFront());
      System.out.println("Removing: " + queue.dequeue());
      System.out.println("Front: " + queue.getFront());
      System.out.println("Removing: " + queue.dequeue());
      
      System.out.println("IsEmpty: " + queue.isEmpty());
      
      queue.enqueue("1");
      queue.enqueue("2");
      queue.enqueue("3");
      queue.enqueue("4");
      queue.enqueue("5");
      
      System.out.println("IsEmpty: " + queue.isEmpty());
      
      queue.clear();
      
      System.out.println("IsEmpty: " + queue.isEmpty());
   }
}