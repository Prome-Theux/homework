public class Electrical_appliance
{
        int power; //功率
        int Energy_consumption_grade; //能耗等级 1-5
        double  Operating_voltage; //工作电压
        double weight; //重量
        String name;
         String explain; //描述
        String color; //颜色


        void println (Object arg)
    {
        System.out.println(arg);
    }
        public String print_explain()
        {
            return (this.name+"采用"+this.explain+"\n");
        }
        public void All_information()
        {
            println("产品名："+this.name+"  "+print_explain()+"功率："+this.power+"W"+" 能耗等级："+this.Energy_consumption_grade+" 工作电压："+this.Operating_voltage+"V"+" 颜色："+this.color+" 重量："+this.weight+"kg");
        }




}
