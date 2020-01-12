package Utils.Global_utils.http;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

public class http_02_client_post {
    public String httpclient (){

        //创建一个httpclient对象
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();

        //创建get
        HttpPost HttpPost = new HttpPost("http://timor.tech/api/holiday/info/2019-10-02");

        // 响应模型

        CloseableHttpResponse response = null;
        try {

            // 由客户端执行(发送)Get请求

            response = httpClient.execute(HttpPost);
            //从响应里面拿去实体
            HttpEntity entity = response.getEntity();
            System.out.println(entity);
//            String a = EntityUtils.toString(entity );
            if (response !=null)
            {
                System.out.println("响应内容长度为:"+entity.getContentLength());
//                System.out.println("响应内容为:"+ EntityUtils.toString(entity ));
                return EntityUtils.toString(entity );
            }


        }catch (Exception e)
        {
            e.printStackTrace();
        }
//        finally {
//            {
//                try {
//                    if (httpClient!=null)
//                        httpClient.close();
//                    if (response!=null)
//                        response.close();
//                }catch (Exception e ){
//                    e.printStackTrace();
//                }
//            }
//        }
        return "";
    }
}
