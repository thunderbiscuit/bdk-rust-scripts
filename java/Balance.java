///usr/bin/env jbang "$0" "$@" ; exit $?
//DEPS org.bitcoindevkit:bdk-jvm:1.0.0-alpha.11
//DEPS org.jetbrains.kotlin:kotlin-stdlib:1.9.23
//DEPS org.jetbrains.kotlin:kotlin-script-runtime:1.9.23

//SOURCES KotlinUtils.kt

import org.bitcoindevkit.Descriptor;
import org.bitcoindevkit.Wallet;
import org.bitcoindevkit.ElectrumClient;
import org.bitcoindevkit.FullScanRequest;
import org.bitcoindevkit.Network;
import kotlin.ULong;


public class Balance {
    public static void main(String[] args) {
        Descriptor descriptor = new Descriptor("wpkh(tprv8ZgxMBicQKsPf2qfrEygW6fdYseJDDrVnDv26PH5BHdvSuG6ecCbHqLVof9yZcMoM31z9ur3tTYbSnr1WBqbGX97CbXcmp5H6qeMpyvx35B/84h/1h/0h/0/*)", Network.SIGNET);
        Descriptor changeDescriptor = new Descriptor("wpkh(tprv8ZgxMBicQKsPf2qfrEygW6fdYseJDDrVnDv26PH5BHdvSuG6ecCbHqLVof9yZcMoM31z9ur3tTYbSnr1WBqbGX97CbXcmp5H6qeMpyvx35B/84h/1h/0h/1/*)", Network.SIGNET);
        Wallet wallet = Wallet.Companion.newNoPersist(descriptor, changeDescriptor, Network.SIGNET);
        ElectrumClient electrumClient = new ElectrumClient("ssl://mempool.space:60602");
        FullScanRequest fullScanRequest = wallet.startFullScan();
        var update = KotlinUtilsKt.fullScan(electrumClient,fullScanRequest, 10L, 10L, false);
        wallet.applyUpdate(update);
        long balanceSatoshi = KotlinUtilsKt.toSat(wallet.getBalance().getTotal());
        System.out.println("Balance: " + balanceSatoshi + " satoshi");
    }

}
