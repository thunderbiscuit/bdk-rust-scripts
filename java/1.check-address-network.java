//DEPS org.bitcoindevkit:bdk-jvm:1.0.0-alpha.11

import org.bitcoindevkit.Address;
import org.bitcoindevkit.Network;

String addressString = "mzB8yhJeA9vVP5wkiVJVzk19TjPVZe8SGL";
Network network = Network.TESTNET;
Address address =new Address(addressString,network);
System.out.println(address.network());