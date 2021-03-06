/*
 * Copyright 2014 http://Bither.net
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.bither.bitherj.test.core;

import net.bither.bitherj.crypto.DumpedPrivateKey;
import net.bither.bitherj.crypto.ECKey;
import net.bither.bitherj.exception.AddressFormatException;
import net.bither.bitherj.test.ApplicationTest;

public class AddressTest extends ApplicationTest {
    public void testAddress() {
        try {
            DumpedPrivateKey dumpedPrivateKey = new DumpedPrivateKey("L4rK1yDtCWekvXuE6oXD9jCYfFNV2cWRpVuPLBcCU2z8TrisoyY1");
            ECKey ecKey = dumpedPrivateKey.getKey();
            String addressStr=ecKey.toAddress();
            assertEquals(ecKey.toAddress(),"1F3sAm6ZtwLAUnj7d38pGFxtP3RVEvtsbV");
        } catch (AddressFormatException e) {
            e.printStackTrace();
        }
    }
}
