package com.example.cameratest.cameraview;

import android.media.MediaCodec;

import java.nio.ByteBuffer;

class OutputBuffer {
    MediaCodec.BufferInfo info;
    int trackIndex;
    ByteBuffer data;
}
