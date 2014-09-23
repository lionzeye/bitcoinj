/**
 * Copyright 2014 Giannis Dzegoutanis
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

package com.google.bitcoin.core;

import com.google.bitcoin.script.Script;
import com.google.bitcoin.wallet.WalletTransaction;

import java.util.Map;

/**
 * This interface is used to abstract the {@link com.google.bitcoin.core.Wallet} and the {@link com.google.bitcoin.core.Transaction}
 */
public interface TransactionBag {
    public boolean isPubKeyHashMine(byte[] pubkeyHash);

    public boolean isWatchedScript(Script script);

    public boolean isPubKeyMine(byte[] pubkey);

    public boolean isPayToScriptHashMine(byte[] payToScriptHash);

    public Map<Sha256Hash, Transaction> getTransactionPool(WalletTransaction.Pool pool);
}
