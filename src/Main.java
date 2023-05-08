// 按两次 Shift 打开“随处搜索”对话框并输入 `show whitespaces`，
// 然后按 Enter 键。现在，您可以在代码中看到空格字符。
public class Main
{
    public static void main(String[] args)
    {
        Electric_furnace ef = new Electric_furnace();
        System.out.println("-----------------------------------------------------------------------");
        TV tv = new TV();
        ef.All_information();
        ef.special();
        System.out.println("-----------------------------------------------------------------------");
        tv.All_information();
        tv.special();
        System.out.println("-----------------------------------------------------------------------");
        Refrigerator re = new Refrigerator();
        re.All_information();
        re.special();
        System.out.println("-----------------------------------------------------------------------");
    }



}