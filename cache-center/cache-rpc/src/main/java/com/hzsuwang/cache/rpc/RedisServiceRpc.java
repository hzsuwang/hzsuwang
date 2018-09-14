package com.hzsuwang.cache.rpc;

import redis.clients.jedis.Tuple;

import java.util.Set;

public interface RedisServiceRpc {

    /**
     * 获取单个值
     *
     * @param key
     * @return
     */
    public String get(String key,int appId);

    /**
     * 设置单个值
     *
     * @param key
     * @param value
     * @return
     */
    public String set(String key, String value,int appId);

    /**
     * @param key
     * @return
     */
    public Boolean exists(String key,int appId);

    /**
     * @param key
     * @param seconds
     * @return
     */
    public Long expire(String key, int seconds,int appId);

    /**
     * 在某个时间点失效
     *
     * @param key
     * @param unixTime
     * @return
     */
    public Long expireAt(String key, long unixTime,int appId);

    /**
     * @param key
     * @return
     */
    public Long ttl(String key,int appId);

    /**
     * @param key
     * @param value
     * @return
     */
    public Long setnx(String key, String value,int appId);

    /**
     * @param key
     * @param seconds
     * @param value
     * @return
     */
    public String setex(String key, int seconds, String value,int appId);

    /**
     * @param key
     * @param integer
     * @return
     */
    public Long decrBy(String key, long integer,int appId);

    /**
     * @param key
     * @return
     */
    public Long decr(String key,int appId);

    /**
     * @param key
     * @param integer
     * @return
     */
    public Long incrBy(String key, long integer,int appId);

    /**
     * @param key
     * @return
     */
    public Long incr(String key,int appId);

    /**
     * @param key
     * @return
     */
    public Long del(String key,int appId);

    public Long sadd(String key, String member,int appId);

    /**
     * @param key
     * @return
     */
    public Set<String> smembers(String key,int appId);

    /**
     * @param key
     * @param member
     * @return
     */
    public Long srem(String key, String member,int appId);

    /**
     * @param key
     * @return
     */
    public Long scard(String key,int appId);

    /**
     * @param key
     * @param member
     * @return
     */
    public Boolean sismember(String key, String member,int appId);

    /**
     * @param key
     * @param score
     * @param member
     * @return
     */
    public Long zadd(String key, double score, String member,int appId);

    /**
     * @param key
     * @param member
     * @return
     */
    public Long zrem(String key, String member,int appId);

    /**
     * @param key
     * @param score
     * @param member
     * @return
     */
    public Double zincrby(String key, double score, String member,int appId);

    /**
     * @param key
     * @param member
     * @return
     */
    public Long zrevrank(String key, String member,int appId);

    /**
     * @param key
     * @param start
     * @param end
     * @return
     */
    public Set<Tuple> zrangeWithScores(String key, int start, int end,int appId);

    /**
     * @param key
     * @param start
     * @param end
     * @return
     */
    public Set<Tuple> zrevrangeWithScores(String key, int start, int end,int appId);

    /**
     * @param key
     * @return
     */
    public Long zcard(String key,int appId);

    /**
     * @param key
     * @param member
     * @return
     */
    public Double zscore(String key, String member,int appId);

    /**
     * @param key
     * @param min
     * @param max
     * @return
     */
    public Long zcount(String key, double min, double max,int appId);

    /**
     * @param key
     * @param min
     * @param max
     * @return
     */
    public Set<String> zrangeByScore(String key, double min, double max,int appId);

    /**
     * @param key
     * @param min
     * @param max
     * @param offset
     * @param count
     * @return
     */
    public Set<Tuple> zrangeByScoreWithScores(String key, double min, double max, int offset, int count,int appId);

    /**
     * @param key
     * @param max
     * @param min
     * @param offset
     * @param count
     * @return
     */
    public Set<Tuple> zrevrangeByScoreWithScores(String key, double max, double min, int offset, int count,int appId);
}
