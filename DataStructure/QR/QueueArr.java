package DataStructure.QR;

public class QueueArr<Type> {
   Type[] qR;
   int size;
   int first;
   int last;

   QueueArr(int expectedSize) {
      qR = (Type[]) new Object[expectedSize];
      this.first = 0;
      this.last = 0;
      this.size = 0;
   }

   public boolean isEmpty() {

      return size == 0;
   }

   public void enqueue(Type data) {
      if (size == qR.length)
         resize(2 * qR.length);
      qR[last++] = data;
      size++;

      if (last == qR.length)
         last = 0;
      size++;

   }

   public Type dequeue() {
      if (isEmpty()) {
         return null;
      }
      Type temp = qR[first];
      qR[first] = null;
      first++;
      size--;

      return temp;
   }

   public void resize(int newExpectedSize) {
      Type[] temp = (Type[]) new Object[newExpectedSize];
      for (int i = 0; i < qR.length; i++) {
         temp[i] = qR[(first + i) % qR.length];
      }
      qR = temp;
      first = 0;
      last = size;
   }

   public String toString() {
      StringBuilder s = new StringBuilder();
      for (int i = 0; i < qR.length; i++) {
         s.append(qR[(first + i) % qR.length]).append(" ");
      }
      return s.toString();


   }
}
