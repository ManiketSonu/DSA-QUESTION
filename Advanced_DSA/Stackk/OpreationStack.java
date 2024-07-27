package Advanced_DSA.Stackk;

public class OpreationStack {
    public static void main(String[] args) {
        OpreationStack stack = new OpreationStack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.display();
        System.out.println(stack.peek());
        System.out.println();
        System.out.println(stack.pop());
        stack.display();
    }
    int maxSize;
    int []stackArray;
    int top;

    //have it's own constructor
    public OpreationStack(int size)
    {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    //push the element to the stack
    public void push(int value)
    {
        if(isFull())
        {
            return;
        }
        top++;
        stackArray[top] = value;
    }

    //pop the element from the top
    public int pop()
    {
        if(isEmpty())
        {
            System.out.println("element pop ho gaya");
            return -1;
        }
        return stackArray[top--];
    }

    //find the peak element
    public int peek()
    {
        if(isEmpty())
        {
            System.out.println("peak element ye hai");
            return -1;
        }
        return stackArray[top];
    }

    //display all the element in the stack
    public void display()
    {
        if(isEmpty())
        {
            System.out.println("remove krne ke bad wala");
            return;
        }
        for(int i=top;i>=0;i--)
        {
            System.out.println(stackArray[i]+" ");
        }
    }

    //check whether stack is empty or not
    public boolean isEmpty()
    {
        return (top==-1);
    }

    //check whether stack is full or not
    public boolean isFull()
    {
        return (top==maxSize-1);
    }
}
