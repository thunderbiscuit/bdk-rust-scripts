//DEPS org.bitcoindevkit:bdk-jvm:1.0.0-alpha.11
//DEPS org.jetbrains.kotlin:kotlin-stdlib:1.9.23
//DEPS org.jetbrains.kotlin:kotlin-script-runtime:1.9.23

import org.bitcoindevkit.Amount
import org.bitcoindevkit.ElectrumClient
import org.bitcoindevkit.FullScanRequest
import org.bitcoindevkit.Update

fun longToULong(value: Long): ULong = value.toULong()

fun ElectrumClient.fullScan(fullScanRequest: FullScanRequest,stopGap: Long, batchSize: Long, fetchPrevTxouts: Boolean): Update{
    return this.fullScan(fullScanRequest, stopGap.toULong(), batchSize.toULong(), fetchPrevTxouts)
}

fun Amount.toSat(): Long{
    return this.toSat().toLong()
}