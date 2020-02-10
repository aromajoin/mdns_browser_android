package com.example.mdns_browser_android;

import android.net.nsd.NsdServiceInfo;

public interface IDiscoveryListener {
    public void onStopDiscoveryFailed(String serviceType, int errorCode);
    public void onStartDiscoveryFailed(String serviceType, int errorCode);
    public void onServiceLost(NsdServiceInfo serviceInfo);
    public void onServiceFound(NsdServiceInfo serviceInfo);
    public void onDiscoveryStopped(String serviceType);
    public void onDiscoveryStarted(String serviceType);
    public void onResolveFailed(NsdServiceInfo serviceInfo, int errorCode);
    public void onServiceResolved(NsdServiceInfo serviceInfo);
}
