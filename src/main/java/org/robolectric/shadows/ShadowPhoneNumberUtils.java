package org.robolectric.shadows;

import android.telephony.PhoneNumberUtils;
import org.robolectric.internal.Implementation;
import org.robolectric.internal.Implements;

@Implements(PhoneNumberUtils.class)
public class ShadowPhoneNumberUtils {

    @Implementation
    public static java.lang.String formatNumber(java.lang.String source) {
        return source + "-formatted";
    }

    @Implementation
    public static java.lang.String stripSeparators(java.lang.String source) {
        return source + "-stripped";
    }
}
