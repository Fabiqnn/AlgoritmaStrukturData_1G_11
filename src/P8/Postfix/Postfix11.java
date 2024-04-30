package P8.Postfix;

/**
 * Postfix11
 */
public class Postfix11 {

    int size;
    int top;
    char[] stack;

    public Postfix11(int total) {
        this.size = total;
        stack = new char[total];
        top = -1;
        push ('(');
    }

    public void push(char c) {
        top++;
        stack[top] = c;
    }

    public char pop() {
        char biner = stack[top];
        top --;
        return biner;
    }

    public boolean isOperrand(char c) {
        if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= 0 && c <= 9) || (c == ' ' && c == '.')) {
            return true; 
        } else {
            return false;
        }
    }

    public boolean isOperator(char c) {
        if ((c == '^' || c == '%' || c == '/' || c == '*' || c == '-' || c == '+')) {
            return true;
        } else {
            return false;
        }
    }

    public int derajat(char c) {
        switch (c) {
            case '^':
                return 3;
            case '%':
                return 2;
            case '/':
                return 2;
            case '*':
                return 2;
            case '-':
                return 1;
            case '+':
                return 1;
            default:
                return 0;
        }
    }

    public String Konversi(String Q) {
        String p = "";
        char c;
        for (int i = 0; i < size; i++) {
            c = Q.charAt(i);
            if (isOperrand(c)) {
                p = p + c;
            } else if (c == '('){
                push(c);
            } else if(c == ')') {
                while (stack[top] != '(') {
                    p = p + pop();
                }
                pop();
            } else if(isOperator(c)) {
                while (derajat(stack[top]) >= derajat(c)) {
                    p = p + pop();
                }
                push(c);
            }
        }
        return p;
    }
}