package com.actiontech.dble.config.loader.zkprocess.entity;

import com.actiontech.dble.config.Versions;
import com.actiontech.dble.config.loader.zkprocess.entity.server.FireWall;
import com.actiontech.dble.config.loader.zkprocess.entity.server.System;
import com.actiontech.dble.config.loader.zkprocess.entity.server.User;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(namespace = "http://io." + Versions.ROOT_PREFIX + "/", name = "server")
public class Server {

    @XmlElement(required = true)
    protected System system;
    @XmlElement
    protected FireWall firewall;
    @XmlElement(required = true)
    protected List<User> user;

    public System getSystem() {
        return system;
    }

    public void setSystem(System value) {
        this.system = value;
    }

    public List<User> getUser() {
        return user;
    }

    public void setUser(List<User> user) {
        this.user = user;
    }


    public FireWall getFirewall() {
        return firewall;
    }

    public void setFirewall(FireWall firewall) {
        this.firewall = firewall;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Server [system=");
        builder.append(system);
        builder.append(", user=");
        builder.append(user);
        if (firewall != null) {
            builder.append(", firewall=");
            builder.append(firewall);
        }
        builder.append("]");
        return builder.toString();
    }

}