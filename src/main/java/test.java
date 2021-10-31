/**
 * Project name(项目名称)：Integer类
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/31
 * Time(创建时间)： 14:55
 * Version(版本): 1.0
 * Description(描述)： Integer 类的构造方法
 * Integer 类中的构造方法有以下两个：
 * Integer(int value)：构造一个新分配的 Integer 对象，它表示指定的 int 值。
 * Integer(String s)：构造一个新分配的 Integer 对象，它表示 String 参数所指示的 int 值。
 * Integer类中的常用方法
 * 方法	返回值	功能
 * byteValue()	byte	以 byte 类型返回该 Integer 的值
 * shortValue()	short	以 short 类型返回该 Integer 的值
 * intValue()	int	以 int 类型返回该 Integer 的值
 * toString()	String	返回一个表示该 Integer 值的 String 对象
 * equals(Object obj)	boolean	比较此对象与指定对象是否相等
 * compareTo(Integer
 * anotherlnteger)	int	在数字上比较两个 Integer 对象，如相等，则返回 0；
 * 如调用对象的数值小于 anotherlnteger 的数值，则返回负值；
 * 如调用对象的数值大于 anotherlnteger 的数值，则返回正值
 * valueOf(String s)	Integer	返回保存指定的 String 值的 Integer 对象
 * parseInt(String s)	int	将数字字符串转换为 int 数值
 * <p>
 * Integer 类的常量
 * Integer 类包含以下 4 个常量。
 * MAX_VALUE：值为 231-1 的常量，它表示 int 类型能够表示的最大值。
 * MIN_VALUE：值为 -231 的常量，它表示 int 类型能够表示的最小值。
 * SIZE：用来以二进制补码形式表示 int 值的比特位数。
 * TYPE：表示基本类型 int 的 Class 实例。
 */

public class test
{
    @SuppressWarnings("all")
    public static void main(String[] args)
    {
        //------------------------------------------------------
        long startTime = System.nanoTime();   //获取开始时间
        //------------------------------------------------------
        Integer data1 = new Integer("258");
        System.out.println(data1);
        String str1 = "456";
        int num = Integer.parseInt(str1);    // 将字符串转换为int类型的数值
        System.out.println(num);
        int i = 789;
        String str2 = Integer.toString(i);    // 将int类型的数值转换为字符串
        System.out.println(str2);
        Integer data3 = 598;
        System.out.println(data1.compareTo(data3));
        System.out.println(data3 + "的二进制：" + Integer.toBinaryString(data3));
        System.out.println(data3 + "的八进制：" + Integer.toOctalString(data3));
        System.out.println(data3 + "的十六进制：" + Integer.toHexString(data3));
        System.out.printf("%o\t%x\n", data3, data3);          //时间复杂度很高 12ms
        System.out.println("int型的最大值：" + Integer.MAX_VALUE);
        System.out.println("int型的最大值：" + Integer.MIN_VALUE);
        System.out.println("int 类型的二进制位:" + Integer.SIZE);
        //------------------------------------------------------
        long endTime = System.nanoTime(); //获取结束时间
        if ((endTime - startTime) < 1000000)
        {
            double final_runtime;
            final_runtime = (endTime - startTime);
            final_runtime = final_runtime / 1000;
            System.out.println("算法运行时间： " + final_runtime + "微秒");
        }
        else if ((endTime - startTime) >= 1000000 && (endTime - startTime) < 10000000000L)
        {
            double final_runtime;
            final_runtime = (endTime - startTime) / 1000;
            final_runtime = final_runtime / 1000;
            System.out.println("算法运行时间： " + final_runtime + "毫秒");
        }
        else
        {
            double final_runtime;
            final_runtime = (endTime - startTime) / 10000;
            final_runtime = final_runtime / 100000;
            System.out.println("算法运行时间： " + final_runtime + "秒");
        }
        Runtime r = Runtime.getRuntime();
        float memory;
        memory = r.totalMemory();
        memory = memory / 1024 / 1024;
        System.out.printf("JVM总内存：%.3fMB\n", memory);
        memory = r.freeMemory();
        memory = memory / 1024 / 1024;
        System.out.printf(" 空闲内存：%.3fMB\n", memory);
        memory = r.totalMemory() - r.freeMemory();
        memory = memory / 1024 / 1024;
        System.out.printf("已使用的内存：%.4fMB\n", memory);
        //------------------------------------------------------
    }
}
