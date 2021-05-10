package com.zhn.demo.rabbitmq.mq4javabean;

import java.util.StringJoiner;
import java.util.UUID;

public class Data {

    private UUID uuid;
    private String attr;
    private Type type;
    private Content content;

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getAttr() {
        return attr;
    }

    public void setAttr(String attr) {
        this.attr = attr;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Data.class.getSimpleName() + "[", "]")
                .add("uuid=" + uuid)
                .add("attr='" + attr + "'")
                .add("type=" + type)
                .add("content=" + content)
                .toString();
    }
}
