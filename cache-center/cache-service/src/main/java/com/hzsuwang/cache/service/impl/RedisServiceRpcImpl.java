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
    public String get(String key) {
        return jedisClusterConfig.getJedisCluster().get(key);
    }

    @Override
    public String set(String key, String value) {
        return jedisClusterConfig.getJedisCluster().set(key, value);
    }

    @Override
    public Boolean exists(String key) {
        return jedisClusterConfig.getJedisCluster().exists(key);
    }

    @Override
    public Long expire(String key, int seconds) {
        return jedisClusterConfig.getJedisCluster().expire(key, seconds);
    }

    @Override
    public Long expireAt(String key, long unixTime) {
        return jedisClusterConfig.getJedisCluster().expireAt(key, unixTime);
    }

    @Override
    public Long ttl(String key) {
        return jedisClusterConfig.getJedisCluster().ttl(key);
    }

    @Override
    public Long setnx(String key, String value) {
        return jedisClusterConfig.getJedisCluster().setnx(key, value);
    }

    @Override
    public String setex(String key, int seconds, String value) {
        return jedisClusterConfig.getJedisCluster().setex(key, seconds, value);
    }

    @Override
    public Long decrBy(String key, long integer) {
        return jedisClusterConfig.getJedisCluster().decrBy(key, integer);
    }

    @Override
    public Long decr(String key) {
        return jedisClusterConfig.getJedisCluster().decr(key);
    }

    @Override
    public Long incrBy(String key, long integer) {
        return jedisClusterConfig.getJedisCluster().incrBy(key, integer);
    }

    @Override
    public Long incr(String key) {
        return jedisClusterConfig.getJedisCluster().incr(key);
    }

    @Override
    public Long del(String key) {
        return jedisClusterConfig.getJedisCluster().del(key);
    }

    @Override
    public Long sadd(String key, String member) {
        return jedisClusterConfig.getJedisCluster().sadd(key, member);
    }

    @Override
    public Set<String> smembers(String key) {
        return jedisClusterConfig.getJedisCluster().smembers(key);
    }

    @Override
    public Long srem(String key, String member) {
        return jedisClusterConfig.getJedisCluster().srem(key, member);
    }

    @Override
    public Long scard(String key) {
        return jedisClusterConfig.getJedisCluster().scard(key);
    }

    @Override
    public Boolean sismember(String key, String member) {
        return jedisClusterConfig.getJedisCluster().sismember(key, member);
    }

    @Override
    public Long zadd(String key, double score, String member) {
        return jedisClusterConfig.getJedisCluster().zadd(key, score, member);
    }

    @Override
    public Long zrem(String key, String member) {
        return jedisClusterConfig.getJedisCluster().zrem(key, member);
    }

    @Override
    public Double zincrby(String key, double score, String member) {
        return jedisClusterConfig.getJedisCluster().zincrby(key, score, member);
    }

    @Override
    public Long zrevrank(String key, String member) {
        return jedisClusterConfig.getJedisCluster().zrevrank(key, member);
    }

    @Override
    public Set<Tuple> zrangeWithScores(String key, int start, int end) {
        return jedisClusterConfig.getJedisCluster().zrangeWithScores(key, start, end);
    }

    @Override
    public Set<Tuple> zrevrangeWithScores(String key, int start, int end) {
        return jedisClusterConfig.getJedisCluster().zrevrangeWithScores(key, start, end);
    }

    @Override
    public Long zcard(String key) {
        return jedisClusterConfig.getJedisCluster().zcard(key);
    }

    @Override
    public Double zscore(String key, String member) {
        return jedisClusterConfig.getJedisCluster().zscore(key, member);
    }

    @Override
    public Long zcount(String key, double min, double max) {
        return jedisClusterConfig.getJedisCluster().zcount(key, min, max);
    }

    @Override
    public Set<String> zrangeByScore(String key, double min, double max) {
        return jedisClusterConfig.getJedisCluster().zrangeByScore(key, min, max);
    }

    @Override
    public Set<Tuple> zrangeByScoreWithScores(String key, double min, double max, int offset, int count) {
        return jedisClusterConfig.getJedisCluster().zrangeByScoreWithScores(key, min, max, offset, count);
    }

    @Override
    public Set<Tuple> zrevrangeByScoreWithScores(String key, double max, double min, int offset, int count) {
        return jedisClusterConfig.getJedisCluster().zrevrangeByScoreWithScores(key, max, min, offset, count);
    }
}
