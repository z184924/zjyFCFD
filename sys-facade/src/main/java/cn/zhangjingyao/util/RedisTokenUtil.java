package cn.zhangjingyao.util;

import cn.zhangjingyao.entity.system.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import java.util.UUID;


@Component
public class RedisTokenUtil {

    @Autowired
    private JedisPool jedisPool;

    public String addToken(User user){
        Jedis jedis = jedisPool.getResource();
        String token=this.get32UUID();
        jedis.set(token.getBytes(),SerializeUtil.serialize(user));
        jedis.expire(token.getBytes(),30*60);
        jedis.close();
        return token;
    }
    public User getToken(String token) {
        if(token==null){
            return null;
        }
        Jedis jedis = jedisPool.getResource();
        byte[] bytes = jedis.get(token.getBytes());
        jedis.close();
        return (User) SerializeUtil.unserizlize(bytes);
    }
    public boolean flushToken(String token){
        Jedis jedis = jedisPool.getResource();
        jedis.expire(token.getBytes(),30*60);
        jedis.close();
        return true;
    }
    public boolean deleteToken(String token){
        Jedis jedis = jedisPool.getResource();
        jedis.del(token.getBytes());
        jedis.close();
        return true;
    }

    private String get32UUID() {
        String uuid = UUID.randomUUID().toString().trim().replaceAll("-", "");
        return uuid;
    }
}
