package com.keenant.tabbed.item;

import com.comphenix.protocol.wrappers.WrappedSignedProperty;

public interface TabItem {
    String getText();

    int getPing();

    WrappedSignedProperty getSkin();
}
