package mao.javaweb;

/**
 * Project name(项目名称)：java设计模式_责任链模式
 * Package(包名): mao.javaweb
 * Class(类名): FirstFilter
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/19
 * Time(创建时间)： 20:51
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class FirstFilter implements Filter
{

    @Override
    public void doFilter(Request request, Response response, FilterChain c)
    {
        System.out.println("过滤器1 前置处理");
        c.doFilter(request, response);
        System.out.println("过滤器1 后置处理");
    }
}
