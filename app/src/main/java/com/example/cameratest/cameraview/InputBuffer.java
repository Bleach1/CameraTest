package com.example.cameratest.cameraview;

import java.nio.ByteBuffer;

class InputBuffer {
    ByteBuffer data;
    ByteBuffer source;
    int index;
    int length;
    long timestamp;
    boolean isEndOfStream;
}
