package com.kevin.base.utils;

import android.text.TextUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/**
 * Created by kevin on 2018/11/29.
 * descript：时间格式化工具类
 */

public class DateUtil {

    public static String getDateString() {
        SimpleDateFormat df = new SimpleDateFormat("_yyyy_MM_dd_", Locale.CHINA);
        return df.format(new Date(System.currentTimeMillis()));
    }

    /**
     * 判断今天,明天,后天
     *
     * @param time 时间
     * @return eg：
     */
    public static String getDateFrom(long time, boolean isTopDate) {
        try {
            Calendar aCalendar = Calendar.getInstance();
            aCalendar.setTimeInMillis(time);
            int day = aCalendar.get(Calendar.DAY_OF_YEAR);
            int aYear = aCalendar.get(Calendar.YEAR);

            aCalendar.setTimeInMillis(System.currentTimeMillis());
            int now = aCalendar.get(Calendar.DAY_OF_YEAR);
            int bYear = aCalendar.get(Calendar.YEAR);
            if (aYear == bYear) {
                int diff = day - now;
                if (diff < 0) {
                    return "报名已截止";
                } else if (diff == 0) {
                    return "今天报名截止";
                } else if (diff == 1) {
                    return "明天报名截止";
                } else if (diff == 2) {
                    return "后天报名截止";
                } else {
                    if (isTopDate)
                        return DateUtil.getDateString(time, "yyyy年MM月dd日");
                    else
                        return DateUtil.getDateString(time, "MM月dd日") + "报名截止";
                }
            } else if (aYear > bYear) {
                return DateUtil.getDateString(time, "MM月dd日") + "报名截止";
            } else {
                return "报名已截止";
            }
        } catch (Exception e) {
            return "";
        }
    }

    public static String getDateBefore(String time) {
        if (TextUtils.isEmpty(time)) {
            return time;
        }
        long longTime = 0;
        try {
            longTime= Long.parseLong(time);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

        return getDateBefore(longTime);
    }

    /**
     * 当前时间之前的时间显示格式
     *
     * @param time 时间
     * @return eg：
     */
    public static String getDateBefore(long time) {
        try {
            Calendar aCalendar = Calendar.getInstance();
            aCalendar.setTimeInMillis(time);
            int day = aCalendar.get(Calendar.DAY_OF_YEAR);
            int otherYear = aCalendar.get(Calendar.YEAR);

            aCalendar.setTimeInMillis(System.currentTimeMillis());
            int now = aCalendar.get(Calendar.DAY_OF_YEAR);
            int nowYear = aCalendar.get(Calendar.YEAR);
            if (otherYear == nowYear) {
                int diff = day - now;
                if (diff == 0) {
                    return "今天 " + DateUtil.getHHmm(time);
                } else if (diff == -1) {
                    return "昨天 " + DateUtil.getHHmm(time);
                } /*else if (diff == -2) {
                    return "前天";
                }*/ else {
                    return DateUtil.getMMdd(time);
                }
            } else {
                return DateUtil.getDateString(time, "yyyy年MM月dd日");
            }
        } catch (Exception e) {
            return "";
        }
    }

    /**
     * 获取时分 19:20
     *
     * @param time 时间
     * @return eg：2016年6月5日
     */
    public static String getHHmm(long time) {
        SimpleDateFormat df = new SimpleDateFormat("HH:mm", Locale.CHINA);
        return df.format(new Date(time));
    }

    /**
     * 获取月日 12月20日
     *
     * @param time 时间
     * @return eg：2016年6月5日
     */
    public static String getMMdd(long time) {
        SimpleDateFormat df = new SimpleDateFormat("MM月dd日", Locale.CHINA);
        return df.format(new Date(time));
    }

    /**
     * 判断今天,昨天
     *
     * @param time 时间
     * @return eg：
     */
    public static String getDateFromat(long time) {
        try {
            Calendar aCalendar = Calendar.getInstance();
            aCalendar.setTimeInMillis(time);
            int day = aCalendar.get(Calendar.DAY_OF_YEAR);

            aCalendar.setTimeInMillis(System.currentTimeMillis());
            int now = aCalendar.get(Calendar.DAY_OF_YEAR);
            int diff = day - now;
            if (diff == -1) {
                return "昨天";
            } else if (diff == 0) {
                return "今天";
            } else {
                return DateUtil.getDateString(time, "yyyy/M/d");
            }
        } catch (Exception e) {
            return "";
        }
    }

    /**
     * 获取日期
     *
     * @param time 时间
     * @return eg：2016年6月5日
     */
    public static String getDateString(long time) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd", Locale.CHINA);
        return df.format(new Date(time));
    }

    /**
     * 获取日期
     *
     * @param time 时间
     * @return eg：2016年6月5日
     */
    public static String getDateString(long time, String format) {
        SimpleDateFormat df = new SimpleDateFormat(format, Locale.CHINA);
        return df.format(new Date(time));
    }

    public static Date stringdata2date(String dateStr) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date date;
        try {
            date = sdf.parse(dateStr);
        } catch (ParseException e) {
            date = new Date(System.currentTimeMillis());
            e.printStackTrace();
        }

        return date;
    }

    /**
     * 获取时间
     *
     * @param time 时间
     * @return eg：2016-6-5 11:20
     */
    public static String getTimeString(long time) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.US);
        return df.format(new Date(time));
    }

    /*2017-09-06 16:55:35*/
    public static long StringToLong(String time) {
        try {
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            return df.parse(time).getTime();
        } catch (ParseException e) {
            e.printStackTrace();
            return 0;
        }
    }

    /**
     * 获取时间
     *
     * @param time 时间
     * @return eg：2016-6-5 11:20
     */
    public static String getFullTimeString(long time) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA);
        return df.format(new Date(time));
    }

    /**
     * 获取时间
     *
     * @param time 时间
     * @return eg：2016/6/5 11:20
     */
    public static String getTimeSlashString(long time) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm", Locale.CHINA);
        return df.format(new Date(time));
    }


    /**
     * 获取时间
     *
     * @param time 时间
     * @return eg：／7月14日 12:00／
     */
    public static String getSpecialTimeString(long time) {
        SimpleDateFormat df = new SimpleDateFormat("/ MM月dd日 HH:mm /", Locale.CHINA);
        return df.format(new Date(time));
    }


    public static Date string2date(String dateStr) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date;
        try {
            date = sdf.parse(dateStr);
        } catch (ParseException e) {
            date = new Date(System.currentTimeMillis());
            e.printStackTrace();
        }
        return date;
    }

    public static String Data2String(Date date) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
    }

    public static Date[] string2date(String dateStr[]) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date[] dates = new Date[dateStr.length];
        for (int i = 0; i < dateStr.length; i++) {
            Date date = null;
            try {
                date = sdf.parse(dateStr[i]);
                dates[i] = date;
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return dates;
    }

    /**
     * 是否距离当前时间太接近
     */
    public static boolean isNearly(String time) {
        if (StringUtil.isEmpty(time)) return true;
        return string2date(time).before(new Date(System.currentTimeMillis()));
    }


    public static String get2DayFrom(long date) {
        //所在时区时8，系统初始时间是1970-01-01 80:00:00，注意是从八点开始，计算的时候要加回去
        int offSet = Calendar.getInstance().getTimeZone().getRawOffset();
        long today = (System.currentTimeMillis() + offSet) / 86400000;
        long start = (date + offSet) / 86400000;
        long intervalTime = start - today;
        //-2:前天,-1：昨天,0：今天,1：明天,2：后天
        String strDes = "";
        if (intervalTime == 0) {
            strDes = "今天 " + getDateString(date, "HH:mm");//今天
        } else if (intervalTime == -1) {
            strDes = "昨天 " + getDateString(date, "HH:mm");//昨天
        } else {
            strDes = getDateString(date, "MM月dd日");
        }
        return strDes;
    }

    public static String get2DayFrom2(long date) {
        //所在时区时8，系统初始时间是1970-01-01 80:00:00，注意是从八点开始，计算的时候要加回去
        int offSet = Calendar.getInstance().getTimeZone().getRawOffset();
        long today = (System.currentTimeMillis() + offSet) / 86400000;
        long start = (date + offSet) / 86400000;
        long intervalTime = start - today;
        //-2:前天,-1：昨天,0：今天,1：明天,2：后天
        String strDes = "";
        if (intervalTime == 0) {
            strDes = "今天 ";//今天
        } else if (intervalTime == -1) {
            strDes = "昨天 ";//昨天
        } else {
            strDes = getDateString(date, "MM月dd日");
        }
        return strDes;
    }

    public static String utc2Local(String utcTime, String localTimePatten) {
        return utc2Local(utcTime, "yyyy-MM-dd'T'HH:mm:ss.sss'Z'", localTimePatten);
    }

    /**
     * 函数功能描述:UTC时间转本地时间格式
     *
     * @param utcTime         UTC时间
     * @param utcTimePatten   UTC时间格式
     * @param localTimePatten 本地时间格式
     * @return 本地时间格式的时间
     * eg:utc2Local("2018-01-06T02:02:23.765Z", "yyyy-MM-dd'T'HH:mm:ss.sss'Z'", "yyyy-MM-dd HH:mm:ss.SSS")
     */
    public static String utc2Local(String utcTime, String utcTimePatten, String localTimePatten) {
        if (TextUtils.isEmpty(utcTime)) {
            return utcTime;
        }
        SimpleDateFormat utcFormater = new SimpleDateFormat(utcTimePatten);
        utcFormater.setTimeZone(TimeZone.getTimeZone("UTC"));//时区定义并进行时间获取
        Date gpsUTCDate = null;
        try {
            gpsUTCDate = utcFormater.parse(utcTime);
        } catch (Exception e) {
            e.printStackTrace();
            return utcTime;
        }
        SimpleDateFormat localFormater = new SimpleDateFormat(localTimePatten);
        localFormater.setTimeZone(TimeZone.getDefault());
        String localTime = localFormater.format(gpsUTCDate.getTime());
        return localTime;
    }

}
