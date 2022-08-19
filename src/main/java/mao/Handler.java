package mao;

/**
 * Project name(项目名称)：java设计模式_责任链模式
 * Package(包名): mao
 * Class(类名): Handler
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/19
 * Time(创建时间)： 20:11
 * Version(版本): 1.0
 * Description(描述)： 抽象处理者（Handler）角色
 */

public abstract class Handler
{
    protected final static int NUM_ONE = 1;
    protected final static int NUM_THREE = 3;
    protected final static int NUM_SEVEN = 7;

    //该领导处理的请假天数区间
    private int numStart;
    private int numEnd;

    private Handler nextHandler;

    public Handler(int numStart)
    {
        this.numStart = numStart;
    }

    public Handler(int numStart, int numEnd)
    {
        this.numStart = numStart;
        this.numEnd = numEnd;
    }

    /**
     * 设置上级领导
     *
     * @param nextHandler Handler对象
     */
    public void setNextHandler(Handler nextHandler)
    {
        this.nextHandler = nextHandler;
    }

    /**
     * 提交请假条
     *
     * @param leave LeaveRequest对象
     */
    public final void submit(LeaveRequest leave)
    {
        if (this.numStart == 0)
        {
            return;
        }
        if (leave.getNum() >= this.numStart)
        {
            //需要都同意才能通过，假设请假9天，需要小组长、部门经理和总经理都同意才行，并不是只需要总经理同意就行了
            this.handleLeave(leave);
            if (this.nextHandler != null && leave.getNum() > numEnd)
            {
                this.nextHandler.submit(leave);
            }
            else
            {
                System.out.println("流程结束");
            }
        }
    }

    /**
     * 领导处理请假条的方法
     *
     * @param leave LeaveRequest对象
     */
    protected abstract void handleLeave(LeaveRequest leave);
}
