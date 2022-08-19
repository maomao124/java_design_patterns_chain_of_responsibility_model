package mao;

/**
 * Project name(项目名称)：java设计模式_责任链模式
 * Package(包名): mao
 * Class(类名): Test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/19
 * Time(创建时间)： 20:23
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Test
{
    public static void main(String[] args)
    {
        LeaveRequest leaveRequest = new LeaveRequest("小明", 2, "医院看病");

        GroupLeader groupLeader = new GroupLeader();
        Manager manager = new Manager();
        GeneralManager generalManager = new GeneralManager();

        groupLeader.setNextHandler(manager);
        manager.setNextHandler(generalManager);

        groupLeader.submit(leaveRequest);

        System.out.println("--------------");

        leaveRequest = new LeaveRequest("小红", 4, "车祸");
        groupLeader.submit(leaveRequest);

        System.out.println("--------------");

        leaveRequest = new LeaveRequest("小亮", 9, "结婚");
        groupLeader.submit(leaveRequest);
    }
}
