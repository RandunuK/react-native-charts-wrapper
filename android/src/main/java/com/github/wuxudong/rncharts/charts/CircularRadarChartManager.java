package com.github.wuxudong.rncharts.charts;


import android.util.Log;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.charts.RadarChart;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.RadarEntry;
import com.github.wuxudong.rncharts.data.DataExtract;
import com.github.wuxudong.rncharts.data.RadarDataExtract;
import com.github.wuxudong.rncharts.listener.RNOnChartGestureListener;
import com.github.wuxudong.rncharts.listener.RNOnChartValueSelectedListener;

public class CircularRadarChartManager extends YAxisChartBase<CircularRadarChart, RadarEntry> {

    @Override
    public String getName() {
        return "RNCircularRadarChart";
    }

    @Override
    protected CircularRadarChart createViewInstance(ThemedReactContext reactContext) {
        CircularRadarChart radarChart = new CircularRadarChart(reactContext);
        radarChart.setOnChartValueSelectedListener(new RNOnChartValueSelectedListener(radarChart));
        radarChart.setOnChartGestureListener(new RNOnChartGestureListener(radarChart));
        return radarChart;
    }

    @Override
    DataExtract getDataExtract() {
        return new RadarDataExtract();
    }

    @Override
    public void setYAxis(Chart chart, ReadableMap propMap) {
        CircularRadarChart radarChart = (CircularRadarChart) chart;
        YAxis axis = radarChart.getYAxis();

        setCommonAxisConfig(chart, axis, propMap);
        setYAxisConfig(axis, propMap);
        Log.d("getAxisMaximum", "getYAxis: " + axis.getAxisMaximum());
    }

    @ReactProp(name = "skipWebLineCount")
    public void setSkipWebLineCount(CircularRadarChart chart, int count) {
        chart.setSkipWebLineCount(count);
    }

    @ReactProp(name = "webLineWidth")
    public void setWebLineWidth(CircularRadarChart chart, float width) {
        chart.setWebLineWidth(width);
    }

    @ReactProp(name = "webLineWidthInner")
    public void setWebLineWidthInner(CircularRadarChart chart, float width) {
        chart.setWebLineWidthInner(width);
    }

    @ReactProp(name = "webAlpha")
    public void setWebAlpha(CircularRadarChart chart, int alpha) {
        chart.setWebAlpha(alpha);
    }

    @ReactProp(name = "webColor")
    public void setWebColor(CircularRadarChart chart, int color) {
        chart.setWebColor(color);
    }


    @ReactProp(name = "webColorInner")
    public void setWebColorInner(CircularRadarChart chart, int color) {
        chart.setWebColorInner(color);
    }

    @ReactProp(name = "drawWeb")
    public void setDrawWeb(CircularRadarChart chart, boolean enabled) {
        chart.setDrawWeb(enabled);
    }

    @ReactProp(name = "drawCircularWeb")
    public void setDrawCircularWeb(CircularRadarChart chart, boolean enabled) {
        chart.setDrawWeb(enabled);
    }

    @ReactProp(name = "minOffset")
    public void setMinOffset(CircularRadarChart chart, float minOffset) {
        chart.setMinOffset(minOffset);
    }

    @ReactProp(name = "rotationEnabled")
    public void setRotationEnabled(CircularRadarChart chart, boolean enabled) {
        chart.setRotationEnabled(enabled);
    }

    @ReactProp(name = "rotationAngle")
    public void setRotationAngle(CircularRadarChart chart, float angle) {
        chart.setRotationAngle(angle);
    }


}