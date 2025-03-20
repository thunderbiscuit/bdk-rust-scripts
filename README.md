# Readme
This repo hosts a collection of scripts that make use of the [Bitcoin Development Kit](https://bitcoindevkit.org/) and some of its language bindings.

_Total number of scripts: 34_  
<br/>

## Rust Scripts
To run Rust scripts, you'll the need the [rust-script](https://rust-script.org/) tool installed. From there, simply use
```shell
rust-script 1.balance.rs
```

<div align="center">
    <h1>
        <img src="./images/rust.svg" width=200px>
    </h1>
</div>

| File                                                                                    | Task                                                                                                                          |
|-----------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------|
| [1.balance.rs](rust/1.balance.rs)                                                       | Query an Electrum server for the balance of a wallet.                                                                         |
| [2.descriptor-templates.rs](rust/2.descriptor-templates.rs)                             | Create public descriptors using the descriptor templates.                                                                     |
| [3.balance-from-rpc.rs](rust/3.balance-from-rpc.rs)                                     | Query a full node through RPC for the balance of a descriptor.                                                                |
| [4.bdk-policy.rs](rust/4.bdk-policy.rs)                                                 | Print the BDK policy for a non-trivial descriptor.                                                                            |
| [5.miniscript-compilation.rs](rust/5.miniscript-compilation.rs)                         | Build a BDK wallet starting from a miniscript policy.                                                                         |
| [6.fee-estimation.rs](rust/6.fee-estimation.rs)                                         | Estimate the fee rate required to confirm a transaction in a given target of blocks.                                          |
| [7.miniscript-policy-parser.rs](rust/7.miniscript-policy-parser.rs)                     | Take a list of pubkeys and a miniscript policy in a json file and spit out another json file with tons of useful information. |
