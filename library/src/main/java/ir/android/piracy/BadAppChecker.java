package ir.android.piracy;

import android.content.Context;
import android.content.pm.PackageManager;

public class BadAppChecker {
    public static boolean isPackageInstalled(Context context, String packageName) {
        PackageManager pm = context.getPackageManager();
        try {
            pm.getPackageInfo(packageName, 0);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }
    public static boolean isLuckyPatcherInstalled(Context context) {
        if(isPackageInstalled(context, "com.dimonvideo.luckypatcher")) {
            return true;
        } else if(isPackageInstalled(context, "com.chelpus.lackypatch")) {
            return true;
        } else if(isPackageInstalled(context, "com.android.vending.billing.InAppBillingService.LACK")) {
            return true;
        } else if(isPackageInstalled(context, "com.android.vending.billing.InAppBillingService.CLON")) {
            return true;
        } else if(isPackageInstalled(context, "com.android.vending.billing.InAppBillingService.CRAC")) {
            return true;
        } else if(isPackageInstalled(context, "com.android.vending.billing.InAppBillingService.BINN")) {
            return true;
        }  else if(isPackageInstalled(context, "ru.aaaaaaad.installer")) {
            return true;
        }  else if(isPackageInstalled(context, "ru.dtfwJSTu.uPJCGSdfY")) {
            return true;
        } else if(isPackageInstalled(context, "ru.sxbuIDfx.pFSOyagrF")) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean isApkEditorInstalled(Context context) {
        if(isPackageInstalled(context, "com.gmail.heagoo.apkeditor")) {
            return true;
        } else if(isPackageInstalled(context, "com.gmail.heagoo.apkeditor.pro")) {
            return true;
        } else {
            return false;
        }
    }
}