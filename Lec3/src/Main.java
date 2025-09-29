//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static int getMinIndex(int[] values) {
        int minValue = Integer.MAX_VALUE;
        int minIndex = -1;
        for(int i=0; i<values.length; i++)
            if (values[i] < minValue) {
                minValue = values[i];
                minIndex = i;
            }
        return minIndex;
    }

    public static int getSecondMinIndex(int[] values) {
        int secondIdx = -1;
        int minIdx= getMinIndex(values);
        for(int i=0; i<values.length; i++) {
            if (i == minIdx)
                continue;
            if (secondIdx == -1 ||
                    values[i] < values[secondIdx])
                secondIdx = i;
        }
        return secondIdx;
    }

    public static void main(String[] args) {
        int[] values = new int[12];
        int size = values.length;

        int minValue = Integer.MAX_VALUE;
//        System.out.println(args.length);
//        System.out.println(args[0]);
//        System.out.println(args[1]);
        int[] values1 = {0};
        System.out.println(getMinIndex(values1));
        System.out.println(getSecondMinIndex(values1));


    }
}