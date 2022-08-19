package mao;

/**
 * Project name(项目名称)：java设计模式_责任链模式
 * Package(包名): mao
 * Class(类名): LeaveRequest
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/19
 * Time(创建时间)： 20:09
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class LeaveRequest
{
    //请假人姓名
    private String name;
    //请假天数
    private int num;
    //请假内容
    private String content;

    /**
     * Instantiates a new Leave request.
     *
     * @param name    the name
     * @param num     the num
     * @param content the content
     */
    public LeaveRequest(String name, int num, String content)
    {
        this.name = name;
        this.num = num;
        this.content = content;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * Gets num.
     *
     * @return the num
     */
    public int getNum()
    {
        return num;
    }

    /**
     * Gets content.
     *
     * @return the content
     */
    public String getContent()
    {
        return content;
    }

    @Override
    @SuppressWarnings("all")
    public String toString()
    {
        final StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("name：").append(name).append('\n');
        stringbuilder.append("num：").append(num).append('\n');
        stringbuilder.append("content：").append(content).append('\n');
        return stringbuilder.toString();
    }
}
