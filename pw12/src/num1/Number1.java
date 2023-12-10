package num1;

import java.util.Stack;

public class Number1 {
    Stack<Integer> fp, sp;

    public Number1(String fp, String sp) {
        this.fp = new Stack<>();
        this.sp = new Stack<>();
        for(int i = 4; i >= 0; i --){
            this.fp.push(Integer.parseInt(fp.substring(i, i+1)));
            this.sp.push(Integer.parseInt(sp.substring(i, i+1)));
        }
    }

    private void pushBack(Stack<Integer> s, Integer item){
        Stack<Integer> ns = new Stack<>();
        while (!s.isEmpty())
            ns.push(s.pop());
        s.push(item);
        while (!ns.isEmpty())
            s.push(ns.pop());
    }

    public String play(){
        int count = 0;
        while(!fp.isEmpty() && !sp.isEmpty() && count <= 106){
            if(fp.peek() > sp.peek() && sp.peek() != 0)
            {
                pushBack(fp, fp.pop());
                pushBack(fp, sp.pop());
            }
            else
            {
                pushBack(sp, fp.pop());
                pushBack(sp, sp.pop());
            }
            count++;
        }
        String res = "";
        if(fp.isEmpty()) res += "Второй игрок ";
        else res += "Первый игрок ";
        res += count + " ходов";
        if(count >= 106) res += ", botva";
        return res;
    }

    public static void main(String[] args)
    {
        System.out.println("Пусть у первого игрока: 1 3 5 7 9\nУ второго: 2 4 6 8 0\nПобедитель: ");
        System.out.println(new Number1("13579", "24680").play());
        System.out.println("\nПусть у первого игрока: 6 7 8 9 0\nУ второго: 1 3 0 2 9\nПобедитель: ");
        System.out.println(new Number1("67890", "13029").play());
    }

}