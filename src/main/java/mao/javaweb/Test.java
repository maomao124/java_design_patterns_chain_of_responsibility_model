package mao.javaweb;

/**
 * Project name(项目名称)：java设计模式_责任链模式
 * Package(包名): mao.javaweb
 * Class(类名): Test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/19
 * Time(创建时间)： 20:57
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Test
{
    public static void main(String[] args)
    {
        Request request = null;
        Response response = null;

        FilterChain filterChain = new FilterChain();
        filterChain.addFilter(new FirstFilter())
                .addFilter(new SecondFilter())
                .addFilter(new ThirdFilter());

        filterChain.doFilter(request, response);
    }
}
