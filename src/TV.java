public class TV extends Electrical_appliance
{
    String panel ="VA";
    String sRGB = "150%sRGB";
    String Refresh = "60hz";
    String colorimetric = "△E=2.0";
    public TV()
    {
        name="电视机";
        explain="使用液晶产生图像";
        color = "黑";
        weight = 4.0;
        Operating_voltage = 220;
        Energy_consumption_grade = 1;
        power = 100;
    }
    public void special()
    {
        println("屏幕面板："+panel+" 色域"+sRGB+" 刷新率"+Refresh+" 色准："+ colorimetric);
    }
}
