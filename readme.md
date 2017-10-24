# Universal Turing Machine
Scala implementation of a Universal Turing Machine

# Running
The Universal Turing Machine here can simulate a Turing machine that:
* uses the binary alphabet {0, 1} (with the empty symbol, naturally)
* at each step, moves its head either left or right (there is no option to stay put)
* has states that are labelled by positive integers
* starts in state 1

To simulate the operations of a Turing machine _T_ upon input _i_, you first need to encode both _T_'s instruction table, and _i_.

We assume _T_'s instruction table contains transformations of the form:
```
(current state, currently-scanned symbol) -> (symbol to write, head movement, ending state)
```
(so if the table has the transformation (`1`, `0`) -> (`1`, Left, `4`) this means "If you are in state `1` and scanning symbol `0` then you should, in sequence, write `1`, move left and finally finish in state `4`")
An encoding of a rule starts with a semi-colon, followed by five colon-separated blocks:
```
;{current_state}:{currently_scanned_symbol}:{symbol_to_write}:{head_movement}:{ending_state}
```
* For the `current_state` and `ending_state`, you represent state _n_ by a string of `1`'s of length _n_.  Hence state 5 should be represented by `11111`
* The `currently_scanned_symbol` and `symbol_to_write` are fairly straightforward.  `0` and `1` represent themselves.  Use `_` to represent the empty symbol.
* For `movement`, use `0` to represent an instruction to move left and `1` to represent an instruction to move right.

Hence the transformation (`1`, `0`) -> (`1`, Left, `4`) would be represented by the encoding `;1:0:1:0:1111`

An encoding of _T_'s instruction table is a concatenation of the individual encodings of the rules in the table.  For exmaple:
```aidl
;1:0:0:1:1;1:1:1:1:1;1:_:_:0:11;11:0:1:0:1111;11:1:0:0:111;111:0:1:0:1111;111:1:0:0:111;111:_:1:0:1111;1111:0:0:0:1111;1111:1:1:0:1111
```

Now, _i_ should use the alphabet {0, 1} and can largely be left as it is.  An empty cells in _i_ should be represented by "_", however


Now, to simulate the operations of Turing machine _T_ upon input _i_, run with the following command:
```$xslt
sbt "run {instruction_table_for_T} {i}"
```
