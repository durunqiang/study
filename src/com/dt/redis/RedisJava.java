package com.dt.redis;

import redis.clients.jedis.Jedis;

public class RedisJava {
   public static void main(String[] args) {
      //���ӱ��ص� Redis ����
      Jedis jedis = new Jedis("192.168.4.30");
      jedis.auth("redis123456");
      System.out.println("Connection to server sucessfully");
      //�鿴�����Ƿ�����
      System.out.println("Server is running: "+jedis.ping());
      
   }
}