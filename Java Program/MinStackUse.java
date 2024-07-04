import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

class MinStack {

    public List<int[]> stack;

    public MinStack() {
        stack = new ArrayList<>();
    }
    
    public void push(int val) {
        if (stack.size() == 0) {
            stack.add(new int[]{val, val});
            return;
        }
        int min = getMin();
        stack.add(new int[]{val, Math.min(min, val)});
    }

    private void printStack() {
        for (int[] arr : stack) {
            System.out.println(Arrays.toString(arr));
        }
    }

    public void pop() {
        stack.remove(stack.size() - 1);
    }
    
    public int top() {
        return stack.get(stack.size() - 1)[0];
    }
    
    public int getMin() {
        return stack.get(stack.size() - 1)[1];
    }
}

public class MinStackUse{
    public static void main(String[] args) {
        MinStack stack = new MinStack();
        List<String> operation = new ArrayList<>(List.of("MinStack", "push", "push", "push", "getMin", "pop", "top", "getMin"));

        List<List<Integer>> value = new ArrayList<List<Integer>>() {{
            add(new ArrayList<>(List.of())); 
            add(new ArrayList<>(List.of(-2))); 
            add(new ArrayList<>(List.of(0))); 
            add(new ArrayList<>(List.of(-3))); 
            add(new ArrayList<>(List.of())); 
            add(new ArrayList<>(List.of())); 
            add(new ArrayList<>(List.of())); 
            add(new ArrayList<>(List.of())); 
        }};

        String ope;
        List<Object> ansList = new ArrayList<Object>();
        Object ans;
        try{
            for(int i=0;i < operation.size();i++){
                ope = operation.get(i);
                if (ope == "MinStack") {
                    ansList.add(null);
                    continue;
                }
                Method method;
                if (value.get(i).isEmpty()) {
                    method = MinStack.class.getMethod(ope);
                    ans = method.invoke(stack);
                    ansList.add(ans);
                } else {
                    method = MinStack.class.getMethod(ope, int.class);
                    int val = value.get(i).get(0);
                    ans = method.invoke(stack, val);
                    ansList.add(ans);
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        // Print the list of lists
        System.out.println("Answer: " + ansList);
    }
}
