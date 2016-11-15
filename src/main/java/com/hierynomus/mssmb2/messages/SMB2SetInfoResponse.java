/*
 * Copyright (C)2016 - SMBJ Contributors
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
package com.hierynomus.mssmb2.messages;

import com.hierynomus.mssmb2.SMB2Packet;
import com.hierynomus.protocol.commons.buffer.BufferException;
import com.hierynomus.smbj.common.SMBBuffer;

/**
 * [MS-SMB2].pdf 2.2.40 SMB2 SET_INFO Response
 */
public class SMB2SetInfoResponse extends SMB2Packet {

    public SMB2SetInfoResponse() {
        super();
    }

    @Override
    protected void readMessage(SMBBuffer buffer) throws BufferException {
        buffer.skip(2); // StructureSize (2 bytes)
    }
}
