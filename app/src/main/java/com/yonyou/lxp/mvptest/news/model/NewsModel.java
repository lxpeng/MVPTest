package com.yonyou.lxp.mvptest.news.model;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.yonyou.lxp.mvptest.entity.NewsInfo;
import com.yonyou.lxp.mvptest.news.model.iml.INewsModel;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.xutils.common.Callback;
import org.xutils.common.util.LogUtil;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.util.ArrayList;
import java.util.List;

/**
 * 作者： liuxiaopeng on 16/3/23.
 * 描述：
 */
public class NewsModel implements INewsModel {
    private Gson gson=new Gson();
    private List<NewsInfo> data=new ArrayList<>();

    @Override
    public void getData(int pageNow,final ICallBack callback) {
        RequestParams params=new RequestParams("http://op.juhe.cn/onebox/news/query");

        params.addQueryStringParameter("q","春天");
        params.addQueryStringParameter("key","15ca8df1bf5872ecc735f6f3abcb1eb5");


        x.http().post(params, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                LogUtil.d(result);
                result="{\"reason\":\"查询成功\",\"result\":[{\"title\":\"普京露面破外媒失踪谣言\",\"content\":\"普京自本月5日会见来访的意大利总理伦齐后,便未再公开露面。11日,俄发布俄罗斯、哈萨克斯坦、白俄罗斯三国领导人会晤推迟举行的消息,西方媒体借此猜测会晤推迟原因是\\\"普京生病\\\"。俄方予以否认,坚称普京身体状况\\\"绝对健康\\\"。13日,俄总统新闻秘书佩斯科夫否认了关于普京\\\"新添...\",\"img_width\":\"\",\"full_title\":\"普京露面破外媒失踪谣言\",\"pdate\":\"39分钟前\",\"src\":\"光明网\",\"img_length\":\"\",\"img\":\"\",\"url\":\"http://world.gmw.cn/newspaper/2015-03/17/content_105205337.htm\",\"pdate_src\":\"2015-03-17 10:55:00\"},{\"title\":\"看!媒体这样玩普京\\\"失踪\\\"\",\"content\":\"再没有出现在公开场合。一些欧美媒体此后对普京行踪进行了诸多猜测性报道,路透社、法新社等西方通讯社也援引多个消息源不清的传言,以\\\"普京在哪里\\\"\\\"普京不在场\\\"等标题新闻予以报道。 普京16日会见阿坦巴耶夫,持续10天的传言得以停歇。这些天来,普京如何\\\"被失踪\\\"?西方媒体的...\",\"img_width\":\"\",\"full_title\":\"看!媒体这样玩普京\\\"失踪\\\"\",\"pdate\":\"1小时前\",\"src\":\"环球网\",\"img_length\":\"\",\"img\":\"\",\"url\":\"http://world.huanqiu.com/hot/2015-03/5929476.html\",\"pdate_src\":\"2015-03-17 10:24:00\"},{\"title\":\"普京\\\"失踪\\\"多日来首露面 会见吉尔吉斯斯坦总统\",\"content\":\"当地时间2015年3月16日,据外媒报道,俄罗斯总统普京16日在圣彼得堡与吉尔吉斯斯坦总统阿坦巴耶夫会晤。此次会晤是两位领导人2015年的第二次会晤,会晤也破除了此前外界流传的普京身体\\\"抱恙\\\"的传言。图片来源:东方ic 版权作品 请勿转载 (责任编辑 :史博超)\",\"img_width\":\"671\",\"full_title\":\"普京\\\"失踪\\\"多日来首露面 会见吉尔吉斯斯坦总统\",\"pdate\":\"1小时前\",\"src\":\"中国经济网\",\"img_length\":\"940\",\"img\":\"http://p1.qhimg.com/t0149ac168ffc124d73.jpg\",\"url\":\"http://intl.ce.cn/intlpic/gd/201503/17/t20150317_4842351.shtml\",\"pdate_src\":\"2015-03-17 10:08:00\"},{\"title\":\"普京失踪11天后\",\"content\":\"普京自本月5日会见来访的意大利总理伦齐后,便未再公开露面。11日,俄总统官方网站发布俄罗斯、哈萨克斯坦、白俄罗斯三国领导人会晤推迟举行的消息,西方媒体借此猜测会晤推迟原因是\\\"普京生病\\\"。俄方予以否认,坚称普京身体状况\\\"绝对健康\\\"。■据新华社\",\"img_width\":\"\",\"full_title\":\"普京失踪11天后\",\"pdate\":\"3小时前\",\"src\":\"凤凰网\",\"img_length\":\"\",\"img\":\"\",\"url\":\"http://finance.ifeng.com/a/20150317/13558603_0.shtml\",\"pdate_src\":\"2015-03-17 08:19:00\"}],\"error_code\":0}";
                String dataStr="";
                try {
                    JSONObject all=new JSONObject(result);
                    JSONArray array=all.getJSONArray("result");
                    dataStr=array.toString();
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                data=(List<NewsInfo>)gson.fromJson(dataStr,new TypeToken<List<NewsInfo>>(){}.getType());

                callback.onResult(data);
            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {

            }

            @Override
            public void onCancelled(CancelledException cex) {

            }

            @Override
            public void onFinished() {

            }
        });
    }
}
