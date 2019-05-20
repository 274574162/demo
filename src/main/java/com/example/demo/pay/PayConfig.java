package com.example.demo.pay;

/**
 * @Auther: lidengke
 * @Date: 2019/5/15 15:59
 * @Description:
 */
public class PayConfig {
    public static String app_id = "2016091100482924";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCEEh2TAqZ5Ek96aNL4yaYetTUdaProeggAYr8EPp7zsJYa88PJUXQd03rL15P8GPwHxGSRwI0P1gZ+gPT7d8Z4eE9sCtzLF1qxnAxS3+KcJNCMXFWncJcgrvbcYwkyn0nSAPnl8bMn5+O0d6x2Spgu/YoW5ZGjv7qlf0MlgrlOuSXe57iaeX/U0Vlt9cpSWVwAFcF94MB7SNW4dCRS+C8n+UwhvBX81N1FW8niZD/cps2+Vczj3NNY0/aFJXbS4BPCZElXP4fS6ElSNl41nS/8nw8eXBRZSNn64VCoGpncdVagTJR1qKfTTIAvOv5JWgLW/8RHJ0L3uu4yTx7Sx0wJAgMBAAECggEAVWiZs46NNdK/jzvm43kUcttg5AoV6O2x6v3w5b/Rb2qNSBTIUpLYcslmqhhZ3TgTFLrPBurszobsYDbpNw54TUQQqKBFtRj/T8jIt3eNxsiQDZVQ1x2avkon3tI1CoW0aZi0Ax5Ra8csnHKgF0eaLxlLig8gJjNBcvFf7Qwi5mMrFwqwVtsvAnznomCzYLSasIBayb+JiA6nvZWzVZuZZ/p6r2PiFAgzDhRLSab6tG3JqXjmrWB/veseLj5OlEh7xm/2tSgvffeZwvH4e7ClNfopqS4poVM4PkdvJMHD/uYCEMS4WhFU8YD48r4pjRW2cjooB8zJeUp0UbK1lyzrAQKBgQDHqWOGUt7OTF54+kx8H2aJqEyd75d2fZ04QKhxbszTN02NY41HrkcsJ7JG6MiUY/8xlBXVe54eT3sbgF6YP7m0y0CEFPztalVeOX1/dEOvld/cnXWHW7gAQLBLQNbKsr6yVnQHL34aQTJARDDUnjCy6NqfcTK3gjMqxnn/FrD68QKBgQCpVkfCymRIhLEzKPDZJ1bUGZm9KPbeELVRKlmwSTrjf8QrBakKZXHNovBz5hWPl8V5A9SFSswj3IXa7QX/aAQGhItzkCNuaPdJHdiPngf9Akzqv6wl8jFeN+FH0kTzzKT8dcc+4/DWfwo0M6AUzEEsm2CUMeuAMxNL8XMnk2JymQKBgCvh6uHm7Nlip5DnUlAlhp/SwaQkuKFuUlO+wkbMF3CEwyLEMpUClNn7j49OMmeK4te+uF3HYaU/ysrsl93Wg7Zcxb1B76Uurbyb3h1ZLFc3FZCjeuVZH0PO8/BWO98pEgiYP8AkjA6xLZ46XpEcg4+O5h4M/xyeHSjVnpKWJifBAoGAaudbenAHi3ip3eB03MLnIBPhaPgZkev+a/VOlepFUSZyE68JHtUYWXgKUUDqT7LDKjjuzA+CfQlVP/bvGGT0VaEL4LMYizWdF/3NoC1mYaY4JONIrNQPsqmYgZ0PhtKlPfSlCuEgRGoDaR1GbJrecmjNOgGh6VdVUVZnGo8DUdECgYAHKYBaj+n2RVHH/WW0+UL90sgdExXAeoIW2K/NZyF49DKbbVDiF/WNff8La07hQiNv3pAzikTbz5n8YI9tsE7ib+0tIlWqAlqyqBWKziN9BgfhREgchW5NDf4YJ4yhK9udTeBWGklSGwzN4+mXjhi6KFwG3L+irWNPjFFshgpC3Q==";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAx9vpmXe32ybqJOMTHMur/EI2SgAlYMB3xggzZKM4r+hcB8Gsvt8CSaNBKbPVO5rivy6/rufxQAW724wg9th/+wV1wtAl4PqVN+ru97DsRy/0mDDBA6fx8olexgPl5fb3ZMmesHdW+HT4yZUtaI6oscBH1WOtbVYGfbDZ2eA3UK5EN6ZsllRT0OBcpjbzM6F3sYTnLwJCQsgoXxO6nUBguWquwQnJVLc48Uq0upD6D4uB6bp6KH2sj2X76Qnp2ZEcsZrYaN7wcPQ4peYf7YXT+OZC+6DKfupscbAuVxZ7zpRnAjP21TF/fom7zJC2MXkPgs6oewWbjlAYx6mN1EoNawIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://aaaaa.ngrok.xiaomiqiu.cn/test";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://aaaaa.ngrok.xiaomiqiu.cn/return";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

}
