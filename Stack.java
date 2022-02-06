
public class Stack {
    public int[] elements;
    public int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Stack(int[] elements) {
        this.elements = elements;
    }

    public int[] getElements() {
        return elements;
    }

    public void setElements(int[] elements) {
        this.elements = elements;
    }

    public Stack(int size) {
        this.elements = elements;
        this.size = size;
    }

    public boolean empty() {
        if (this.elements == null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public int peek(int[]elements)
    {
        return this.elements[this.size];
    }
    public void push(int value)
    {
        this.size+=1;
        this.elements[this.size] = value;
    }
    public int pop()
    {
        if (this.empty() == true)
        {
            return 0;
        }
        else
        {
            int value = this.elements[this.size];
            this.size -= 1;
            return value;
        }
    }
}