/*
 * Copyright (C) 2013-2017 microG Project Team
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.android.gms.tasks;

import org.microg.gms.common.PublicApi;

/**
 * Listener called when a {@link Task} completes successfully.
 *
 * @see Task#addOnSuccessListener(OnSuccessListener)
 */
@PublicApi
public interface OnSuccessListener<TResult> {
    /**
     * Called when the {@link Task} completes successfully.
     *
     * @param result the result of the Task
     */
    void onSuccess(TResult result);
}
