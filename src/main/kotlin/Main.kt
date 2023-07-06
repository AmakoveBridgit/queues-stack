fun main() {
    var a= Queue(6)
    a.dequeue() //removing items in a queue
    a.enqueue(3)  //adding items in a queue
    a.enqueue(4)
    a.enqueue(7)
    a.enqueue(6)
    a.display()
    a.dequeue()
    println("........")
    a.display()
    a.enqueue(8)
    a.enqueue(6)
    println(a.peek())



}

    class Queue(var capacity:Int) {
        var data = IntArray(capacity)
        var front = 0
        var rear = 0

        fun enqueue(item: Int) {
            if (isFull()) {
                println("Queue is full")
                return
            }
            data[rear] = item
        }

        fun dequeue(): Int? {
            if (isEmpty()) {
                println("Queue is empty")
                return null

            }
            var removed = data[front]
            for (i in front until rear - 1) {
                data[i] = data[i + 1]
            }
            rear--
            return removed
        }

        fun isFull(): Boolean {
            return rear == capacity

        }

        fun isEmpty(): Boolean {
            return front == rear

        }

        fun peek(): Int? {
            if (isEmpty()) {
                println("Queue is empty")
//                return null
            }
            return null
        }


        fun display() {
            if(isEmpty()){
                println("Queue is empty")
                return
            }
            for(i in front until rear){
                println(data[i])
            }

        }
    }

