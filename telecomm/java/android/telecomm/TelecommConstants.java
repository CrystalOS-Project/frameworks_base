/*
 * Copyright (C) 2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package android.telecomm;

/**
 * Defines constants for use with the Telecomm system.
 */
public final class TelecommConstants {
    /**
     * <p>Activity action: Starts the UI for handing an incoming call. This intent starts the
     * in-call UI by notifying the Telecomm system that an incoming call exists for a specific call
     * service (see {@link android.telecomm.CallService}). Telecomm reads the Intent extras to find
     * and bind to the appropriate {@link android.telecomm.CallService} which Telecomm will
     * ultimately use to control and get information about the call.</p>
     *
     * <p>Input: get*Extra field {@link #EXTRA_CALL_SERVICE_DESCRIPTOR} contains the component name
     * of the {@link android.telecomm.CallService} that Telecomm should bind to. Telecomm will then
     * ask the call service for more information about the call prior to showing any UI.
     *
     * TODO(santoscordon): Needs permissions.
     * TODO(santoscordon): Consider moving this into a simple method call on a system service.
     */
    public static final String ACTION_INCOMING_CALL = "android.intent.action.INCOMING_CALL";

    /**
     * Extra for {@link #ACTION_INCOMING_CALL} containing the {@link CallServiceDescriptor} that
     * describes the call service to use for the incoming call.
     */
    public static final String EXTRA_CALL_SERVICE_DESCRIPTOR =
            "android.intent.extra.CALL_SERVICE_DESCRIPTOR";
}
