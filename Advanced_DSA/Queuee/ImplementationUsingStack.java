package Advanced_DSA.Queuee;

import java.util.Stack;

public class ImplementationUsingStack {
    public static void main(String[] args) {
        new ImplementationUsingStack();
        push(4);
        push(8);
        push(15);
        System.out.println(pop());
        System.out.println(peek());
        System.out.println(isEmpty());

    }
    static Stack<Integer> Input;
    static Stack<Integer> Output;
    ImplementationUsingStack()
    {
        Input = new Stack<>();
        Output = new Stack<>();
    }
    static void push(int x)
    {
        Input.push(x);
    }
    static int pop()
    {
        peek();
        return Output.peek();
    }
    static int peek()
    {
        if(Output.empty())
        {
            while(!Input.empty())
            {
                Output.push(Input.pop());
            }
        }
        return Output.peek();
    }
    static boolean isEmpty()
    {
        return Input.empty() && Output.empty();
    }
}
