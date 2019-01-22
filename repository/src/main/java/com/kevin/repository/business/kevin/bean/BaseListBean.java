package com.kevin.repository.business.kevin.bean;

import java.util.List;

/**
 * Created by xiaodong.jin on 2017/8/31.
 */

public class BaseListBean<T> {
    public int pageNo;
    public int pageSize;
    public int count;
    public int startIndex;
    public boolean hasNextPage;
    public boolean hasPrePage;
    public int currentPage;
    public int totalPages;
    public List<T> records;
    public List<Integer> nearlyPageNum;

}
