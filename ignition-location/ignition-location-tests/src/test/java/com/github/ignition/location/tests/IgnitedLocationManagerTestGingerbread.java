package com.github.ignition.location.tests;

import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Map;

import org.junit.runner.RunWith;

import android.app.PendingIntent;
import android.content.Intent;
import android.location.Criteria;
import android.location.LocationManager;

import com.github.ignition.support.IgnitedDiagnostics;

@RunWith(LocationTestsRobolectricTestRunner.class)
public class IgnitedLocationManagerTestGingerbread extends IgnitedLocationManagerTest {

    @Override
    public void setUp() throws Exception {
        IgnitedDiagnostics.setTestApiLevel(IgnitedDiagnostics.GINGERBREAD);

        super.setUp();
    }

    @Override
    public void shouldRequestUpdatesFromGpsIfBatteryOkay() {
        sendBatteryLevelChangedBroadcast(10);

        resume();

        Map<PendingIntent, Criteria> locationPendingIntents = shadowLocationManager
                .getRequestLocationUdpateCriteriaPendingIntents();
        Criteria criteria = new Criteria();
        criteria.setAccuracy(Criteria.ACCURACY_FINE);

        sendBatteryLevelChangedBroadcast(100);

        Intent intent = new Intent(Intent.ACTION_BATTERY_OKAY);
        shadowApp.sendBroadcast(intent);

        assertThat("Updates from " + LocationManager.GPS_PROVIDER
                + " provider should be requested when battery power is okay!",
                locationPendingIntents.containsValue(criteria));
    }
}
