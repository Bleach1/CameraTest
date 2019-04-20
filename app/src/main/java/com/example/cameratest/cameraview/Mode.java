package com.example.cameratest.cameraview;


import android.support.annotation.Nullable;

import java.io.File;

/**
 * Type of the session to be opened or to move to.
 * Session modes have influence over the capture and preview size, ability to shoot pictures,
 * focus modes, runtime permissions needed.
 *
 * @see CameraView#setMode(Mode)
 */
public enum Mode implements Control {

    /**
     * Session used to capture pictures.
     * <p>
     * - {@link CameraView#takeVideo(File)} will throw an exception
     * - Only the camera permission is requested
     * - Capture size is chosen according to the current picture size selector
     */
    PICTURE(0),

    /**
     * Session used to capture videos.
     * <p>
     * - {@link CameraView#takePicture()} will throw an exception
     * - Camera and audio record permissions are requested
     * - Capture size is chosen according to the current video size selector
     */
    VIDEO(1);

    static final Mode DEFAULT = PICTURE;

    private int value;

    Mode(int value) {
        this.value = value;
    }

    int value() {
        return value;
    }

    @Nullable
    static Mode fromValue(int value) {
        Mode[] list = Mode.values();
        for (Mode action : list) {
            if (action.value() == value) {
                return action;
            }
        }
        return null;
    }
}
