package cn.zhangjingyao.config;

import cn.zhangjingyao.plugin.PagePlugin;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

@Configuration
public class MybatisPlusConfig {
    @Bean
    public PagePlugin pagePluginInterceptor(){
        Properties properties = new Properties();
        properties.setProperty("dialect","mysql");
        properties.setProperty("pageSqlId",".*listPage.*");
        PagePlugin pagePlugin=new PagePlugin();
        pagePlugin.setProperties(properties);
        return pagePlugin;
    }
}
