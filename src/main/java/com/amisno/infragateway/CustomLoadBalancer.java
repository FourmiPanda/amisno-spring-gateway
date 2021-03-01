package com.amisno.infragateway;

import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.Server;

import java.util.List;

public class CustomLoadBalancer implements ILoadBalancer {
    @Override
    public void addServers(List<Server> list) {
        System.out.println("RIBBON : list");
        System.out.println(list);
    }

    @Override
    public Server chooseServer(Object o) {
        System.out.println("RIBBON : chooseServer");
        System.out.println(o);
        return null;
    }

    @Override
    public void markServerDown(Server server) {
        System.out.println("RIBBON : markServerDown");
        System.out.println(server);
    }

    @Override
    public List<Server> getServerList(boolean b) {
        System.out.println("RIBBON : getServerList");
        System.out.println(b);
        return null;
    }

    @Override
    public List<Server> getReachableServers() {
        System.out.println("RIBBON : getReachableServers");
        return null;
    }

    @Override
    public List<Server> getAllServers() {
        System.out.println("RIBBON : getAllServers");
        return null;
    }
}
