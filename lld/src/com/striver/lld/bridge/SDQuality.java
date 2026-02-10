package com.striver.lld.bridge;

import com.striver.lld.proxy.VideoDownloader;

public class SDQuality implements VideoQuality {

    public void load(String title) {
        System.out.println("Streaming " + title + " in SD Quality");
    }
}
