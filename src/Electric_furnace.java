public class Electric_furnace extends Electrical_appliance
{
    //火炉参数 该火炉拥有五个档位
    int Gear_position[]={500,1000,2000,3000,3500};


    public Electric_furnace()
    {
        name="电炉";
        explain="采用电能加热";
        color = "黑";
        weight = 5.6;
        Operating_voltage = 220;
        Energy_consumption_grade = 4;
        power = 3500;
    }
    public void special()
    {
        System.out.print("1-5档功率：");
        //打印不同档位的功率
        for (int i=0 ; i<5;i++)
        {
            System.out.print(Gear_position[i]+" ");
        }
        println("");
    }
}