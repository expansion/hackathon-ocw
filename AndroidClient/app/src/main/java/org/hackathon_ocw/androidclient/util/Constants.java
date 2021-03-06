package org.hackathon_ocw.androidclient.util;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dianyang on 2016/3/5.
 */
public class Constants {
    public static final String APP_ID = "wx9b493c5b54472578";
    public static final String APP_SECRET = "211b995337b10a7ef9c32d511e7c4576";

    public static final String KEY_ID = "id";
    public static final String KEY_TITLE = "title";
    public static final String KEY_DESCRIPTION = "description";
    public static final String KEY_THUMB_URL = "thumb_url";
    public static final String KEY_VIDEOURL = "videoUrl";
    public static final String KEY_WEBURL = "webUrl";
    public static final String KEY_DURATION = "videoDuration";
    public static final String KEY_SOURCE = "source";
    public static final String KEY_INSTRUCTOR = "instructor";
    public static final String KEY_LANGUAGE = "language";
    public static final String KEY_SCHOOL = "school";
    public static final String KEY_TAGS = "tags";

    public static final String StringRecommend = "推荐";

    public static final List<String> catalogs = new ArrayList<>();

    static  {
        catalogs.add("推荐");
        catalogs.add("TED");
        catalogs.add("互联网");
        catalogs.add("数学");
        catalogs.add("生物");
        catalogs.add("物理");
        catalogs.add("化学");
        catalogs.add("心理");
        catalogs.add("InfoQ");
        catalogs.add("一席");
        catalogs.add("电子");
        catalogs.add("历史");
        catalogs.add("社会");
        catalogs.add("计算机");
        catalogs.add("纪录片");
        catalogs.add("环境");
        catalogs.add("哲学");
        catalogs.add("技能");
    }

}
