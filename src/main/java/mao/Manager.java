package mao;

/**
 * Project name(项目名称)：java设计模式_责任链模式
 * Package(包名): mao
 * Class(类名): Manager
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/19
 * Time(创建时间)： 20:20
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Manager extends Handler
{

    public Manager()
    {
        super(Handler.NUM_THREE, Handler.NUM_SEVEN);
    }

    @Override
    protected void handleLeave(LeaveRequest leave)
    {
        System.out.println(leave.getName() + "请假" + leave.getNum() + "天,");
        System.out.println("请假内容：" + leave.getContent());
        System.out.println("部门经理审批：同意");
    }
}
