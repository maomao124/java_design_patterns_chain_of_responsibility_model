package mao.javaweb;

import java.util.ArrayList;
import java.util.List;

/**
 * Project name(项目名称)：java设计模式_责任链模式
 * Package(包名): mao.javaweb
 * Class(类名): FilterChain
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/19
 * Time(创建时间)： 20:49
 * Version(版本): 1.0
 * Description(描述)： 过滤器链
 */

public class FilterChain
{
    private int index = 0;
    private final List<Filter> filters = new ArrayList<>();

    public FilterChain addFilter(Filter filter)
    {
        this.filters.add(filter);
        return this;
    }

    public void doFilter(Request request, Response response)
    {
        if (index == filters.size())
        {
            return;
        }
        Filter filter = filters.get(index);
        index++;
        filter.doFilter(request, response, this);
    }
}
