package mao.javaweb;

/**
 * Project name(项目名称)：java设计模式_责任链模式
 * Package(包名): mao.javaweb
 * Class(类名): ThirdFilter
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/19
 * Time(创建时间)： 20:56
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class ThirdFilter implements Filter
{

    @Override
    public void doFilter(Request request, Response response, FilterChain c)
    {
        System.out.println("过滤器3 前置处理");
        c.doFilter(request,response);
        System.out.println("过滤器3 后置处理");
    }
}
