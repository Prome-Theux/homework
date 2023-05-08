public class Refrigerator extends Electrical_appliance
{
    String ai ="诺拉3.2.9";
    String refrigeration ="43 ~ -18";
    public Refrigerator()
    {
        name="冰箱";
        explain="采用氟利昂制冷";
        color = "粉红色";
        weight = 20.2;
        Operating_voltage = 220;
        Energy_consumption_grade = 3;
        power = 4300;
    }
    public void special()
    {
        System.out.println("制冷范围： "+refrigeration+"智能语音系统： "+ai);
    }
}
