package com.jiawa.wiki.req;

/**
 * Author: EdisonHo
 * Date: 2022/5/20
 */
public class PageReq {

    private int page;

    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }


    @Override
    public String toString() {
        return "PageReq{" +
                "page=" + page +
                ", size=" + size +
                '}';
    }
}
