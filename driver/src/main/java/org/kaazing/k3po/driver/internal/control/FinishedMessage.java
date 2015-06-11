/*
 * Copyright 2014, Kaazing Corporation. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.kaazing.k3po.driver.internal.control;

import java.util.Objects;

public class FinishedMessage extends ControlMessage {

    private String script = "";

    public String getScript() {
        return script;
    }

    public void setScript(String script) {
        this.script = script;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getKind(), script);
    }

    @Override
    public boolean equals(Object obj) {
        return (this == obj) || (obj instanceof FinishedMessage) && equals((FinishedMessage) obj);
    }

    @Override
    public Kind getKind() {
        return Kind.FINISHED;
    }

    protected final boolean equals(FinishedMessage that) {
        return super.equalTo(that) && Objects.equals(this.script, that.script);
    }

}