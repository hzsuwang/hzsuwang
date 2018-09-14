package com.hzsuwang.cache.service.impl;

import java.util.Set;

import com.hzsuwang.cache.config.JedisClusterConfig;
import com.hzsuwang.cache.rpc.RedisServiceRpc;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import redis.clients.jedis.Tuple;

@Slf4j
public class RedisServiceRpcImpl implements RedisServiceRpc {

    @Autowired
    private JedisClusterConfig jedisClusterConfig;

    @Override
    public String get(String key,int appId) {
        return jedisClusterConfig.getJedisCluster().get(getAppNameKey(appId,key));
    }

    @Override
    public String set(String key, String value,int appId) {
        return jedisClusterConfig.getJedisCluster().set(getAppNameKey(appId,key), value);
    }

    @Override
    public Boolean exists(String key,int appId) {
        return jedisClusterConfig.getJedisCluster().exists(getAppNameKey(appId,key));
    }

    @Override
    public Long expire(String key, int seconds,int appId) {
        return jedisClusterConfig.getJedisCluster().expire(getAppNameKey(appId,key), seconds);
    }

    @Override
    public Long expireAt(String key, long unixTime,int appId) {
        return jedisClusterConfig.getJedisCluster().expireAt(getAppNameKey(appId,key), unixTime);
    }

    @Override
    public Long ttl(String key,int appId) {
        return jedisClusterConfig.getJedisCluster().ttl(getAppNameKey(appId,key));
    }

    @Override
    public Long setnx(String key, String value,int appId) {
        return jedisClusterConfig.getJedisCluster().setnx(getAppNameKey(appId,key), value);
    }

    @Override
    public String setex(String key, int seconds, String value,int appId) {
        return jedisClusterConfig.getJedisCluster().setex(getAppNameKey(appId,key), seconds, value);
    }

    @Override
    public Long decrBy(String key, long integer,int appId) {
        return jedisClusterConfig.getJedisCluster().decrBy(getAppNameKey(appId,key), integer);
    }

    @Override
    public Long decr(String key,int appId) {
        return jedisClusterConfig.getJedisCluster().decr(getAppNameKey(appId,key));
    }

    @Override
    public Long incrBy(String key, long integer,int appId) {
        return jedisClusterConfig.getJedisCluster().incrBy(getAppNameKey(appId,key), integer);
    }

    @Override
    public Long incr(String key,int appId) {
        return jedisClusterConfig.getJedisCluster().incr(getAppNameKey(appId,key));
    }

    @Override
    public Long del(String key,int appId) {
        return jedisClusterConfig.getJedisCluster().del(getAppNameKey(appId,key));
    }

    @Override
    public Long sadd(String key, String member,int appId) {
        return jedisClusterConfig.getJedisCluster().sadd(getAppNameKey(appId,key), member);
    }

    @Override
    public Set<String> smembers(String key,int appId) {
        return jedisClusterConfig.getJedisCluster().smembers(getAppNameKey(appId,key));
    }

    @Override
    public Long srem(String key, String member,int appId) {
        return jedisClusterConfig.getJedisCluster().srem(getAppNameKey(appId,key), member);
    }

    @Override
    public Long scard(String key,int appId) {
        return jedisClusterConfig.getJedisCluster().scard(getAppNameKey(appId,key));
    }

    @Override
    public Boolean sismember(String key, String member,int appId) {
        return jedisClusterConfig.getJedisCluster().sismember(getAppNameKey(appId,key), member);
    }

    @Override
    public Long zadd(String key, double score, String member,int appId) {
        return jedisClusterConfig.getJedisCluster().zadd(getAppNameKey(appId,key), score, member);
    }

    @Override
    public Long zrem(String key, String member,int appId) {
        return jedisClusterConfig.getJedisCluster().zrem(getAppNameKey(appId,key), member);
    }

    @Override
    public Double zincrby(String key, double score, String member,int appId) {
        return jedisClusterConfig.getJedisCluster().zincrby(getAppNameKey(appId,key), score, member);
    }

    @Override
    public Long zrevrank(String key, String member,int appId) {
        return jedisClusterConfig.getJedisCluster().zrevrank(getAppNameKey(appId,key), member);
    }

    @Override
    public Set<Tuple> zrangeWithScores(String key, int start, int end,int appId) {
        return jedisClusterConfig.getJedisCluster().zrangeWithScores(getAppNameKey(appId,key), start, end);
    }

    @Override
    public Set<Tuple> zrevrangeWithScores(String key, int start, int end,int appId) {
        return jedisClusterConfig.getJedisCluster().zrevrangeWithScores(getAppNameKey(appId,key), start, end);
    }

    @Override
    public Long zcard(String key,int appId) {
        return jedisClusterConfig.getJedisCluster().zcard(getAppNameKey(appId,key));
    }

    @Override
    public Double zscore(String key, String member,int appId) {
        return jedisClusterConfig.getJedisCluster().zscore(getAppNameKey(appId,key), member);
    }

    @Override
    public Long zcount(String key, double min, double max,int appId) {
        return jedisClusterConfig.getJedisCluster().zcount(getAppNameKey(appId,key), min, max);
    }

    @Override
    public Set<String> zrangeByScore(String key, double min, double max,int appId) {
        return jedisClusterConfig.getJedisCluster().zrangeByScore(getAppNameKey(appId,key), min, max);
    }

    @Override
    public Set<Tuple> zrangeByScoreWithScores(String key, double min, double max, int offset, int count,int appId) {
        return jedisClusterConfig.getJedisCluster().zrangeByScoreWithScores(getAppNameKey(appId,key), min, max, offset, count);
    }

    @Override
    public Set<Tuple> zrevrangeByScoreWithScores(String key, double max, double min, int offset, int count,int appId) {
        return jedisClusterConfig.getJedisCluster().zrevrangeByScoreWithScores(getAppNameKey(appId,key), max, min, offset, count);
    }

    private String getAppNameKey(int appId,String key) {
        return appId + ":" + key;
    }
}
