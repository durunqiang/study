package com.dt.redis;

import redis.clients.jedis.Jedis;
public class RedisStringJava {
   public static void main(String[] args) {
      //���ӱ��ص� Redis ����
	  Jedis jedis = new Jedis("192.168.4.30");
	  jedis.auth("redis123456");
      System.out.println("Connection to server sucessfully");
      //���� redis �ַ�������
      jedis.set("runoobkey", "Redis tutorial");
      // ��ȡ�洢�����ݲ����
      System.out.println("Stored string in redis:: "+ jedis.get("runoobkey"));
   }
}
