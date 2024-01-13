package com.saicone.settings.node;

import com.saicone.settings.SettingsNode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Map;

public class NodeKey<V> extends NodeValue<V> {

    private MapNode parent;
    private String key;

    @NotNull
    public static SettingsNode of(@Nullable MapNode parent, @Nullable String key, @Nullable Object object) {
        if (object instanceof SettingsNode) {
            return of(parent, key, ((SettingsNode) object).getValue()).mergeComment((SettingsNode) object);
        }

        if (object instanceof Map) {
            return new MapNode(parent, key).merge((Map<?, ?>) object);
        } else if (object instanceof Iterable) {
            return new ListNode(parent, key).merge((Iterable<?>) object);
        } else {
            return new ObjectNode(parent, key, object);
        }
    }

    protected NodeKey(@Nullable MapNode parent, @Nullable V value) {
        super(value);
        this.parent = parent;
        this.key = null;
    }

    public NodeKey(@Nullable MapNode parent, @Nullable String key, @Nullable V value) {
        super(value);
        this.parent = parent;
        this.key = key;
    }

    @Override
    public boolean isRoot() {
        return this.parent == null;
    }

    @Override
    public @Nullable MapNode getParent() {
        return parent;
    }

    @Override
    public @Nullable String getKey() {
        return key;
    }

    @NotNull
    @Override
    public SettingsNode setParent(MapNode parent) {
        this.parent = parent;
        return this;
    }

    @NotNull
    @Override
    public SettingsNode setKey(@Nullable String key) {
        if (this.parent != null) {
            if (this.key != null) {
                this.parent.remove(this.key);
            }
            if (key != null) {
                this.parent.put(key, this);
            }
        }
        this.key = key;
        return this;
    }
}
