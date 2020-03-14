package com.sanha.maskwhere;

import android.content.Context;

import com.naver.maps.map.NaverMapSdk;

/*
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

 */

public class IDManger {
    static boolean isTest = false;
    static public String myBannerId = "ca-app-pub-2294544540507821/3150093470";
    static String testBannerId = "ca-app-pub-3940256099942544/6300978111";
    static String myPopupId = " ca-app-pub-2294544540507821/9018287810";
    static String testPopupId = "ca-app-pub-3940256099942544/1033173712";

    /*
   static AdRequest adRequest = new AdRequest.Builder().
           addTestDevice("BCB25840E321EB575FD74829983EE77B").
           addTestDevice("A3EC797AA4237B0866E3A15C5A651867")
           .addTestDevice("578CDFF36B5F5362F70C2ECBF4F05440")
           .build();



   public static void SetBannerAd(Context context, FrameLayout av) {
       MobileAds.initialize(context, new OnInitializationCompleteListener() {
           @Override
           public void onInitializationComplete(InitializationStatus initializationStatus) {
           }
       });
       AdView mAdView = new AdView(context);
       mAdView.setAdSize(new AdSize(300, 50));
       if(!isTest)
           mAdView.setAdUnitId(myBannerId);
       else
           mAdView.setAdUnitId(testBannerId);
       FrameLayout frameLayout = av;
       frameLayout.addView(mAdView);

       mAdView.loadAd(adRequest);
   }

   public static InterstitialAd SetPopUpAd(Context context) {
       MobileAds.initialize(context, new OnInitializationCompleteListener() {
           @Override
           public void onInitializationComplete(InitializationStatus initializationStatus) {
           }
       });
       InterstitialAd popupAd = new InterstitialAd(context);
       if(!isTest)
           popupAd.setAdUnitId(myPopupId);
       else
           popupAd.setAdUnitId(testPopupId);
       popupAd.loadAd(adRequest);
       return popupAd;
   }

*/
    public static void SetNaverSdkClientId(Context context) {
        NaverMapSdk.getInstance(context).setClient(
                new NaverMapSdk.NaverCloudPlatformClient("6wb9x2vv5k"));
    }
}
