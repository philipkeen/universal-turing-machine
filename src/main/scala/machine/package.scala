
package object machine {
  
  val GoToEndToPrintInitialStateAndEmptyCell = State(1)
  val PrintingColonAfterInputF = State(2)
  val PrintingInitialStateE = State(3)
  val PrintingInitialStateF = State(4)
  val PrintingInitialStateEndColonE = State(5)
  val PrintingInitialStateEndColonF = State(6)
  val PrintingFirstEmptyVirtualCellE = State(7)
  val PrintingFirstEmptyVirtualCellF = State(8)
  val PrintingEndingAfterFirstEmptyVirtualCellE = State(9)
  val PrintingEndingAfterFirstEmptyVirtualCellF = State(10)
  val GoToStartOfInput = State(11)
  val FoundBeginningOfInput_E = State(12)
  val FoundBeginningOfInput_F = State(13)
  val FoundZeroLengthInput = State(14)
  val GoToPrintFirstInputSymbol_0 = State(15)
  val MarkFirstInputSymbol_0 = State(16)
  val GoToPrintFirstInputSymbol_1 = State(17)
  val MarkFirstInputSymbol_1 = State(18)
  val GoToPrintFirstInputSymbol_Empty = State(19)
  val MarkFirstInputSymbol_Empty = State(20)
  val PrintingZeroLengthInputScannedVirtualCell_F = State(21)
  val PrintingTrailingVirtualHeadBufferE = State(22)
  val PrintingTrailingVirtualHeadBuffer = State(23)
  val MarkInitialVirtualHeadPosition = State(24)
  val FinishCopyingInputSymbol_z_E = State(25)
  val FinishCopyingInputSymbol_z_F = State(26)
  val ReturnForNextInputSymbol = State(27)
  val GetNextInputSymbol = State(28)
  val MarkNextInputSymbol_0 = State(29)
  val GoToPrintNextInputSymbol_0 = State(30)
  val PrintNextInputSymbol_0_F = State(31)
  val MarkNextInputSymbol_1 = State(32)
  val GoToPrintNextInputSymbol_1 = State(33)
  val PrintNextInputSymbol_1_F = State(34)
  val MarkNextInputSymbol_Empty = State(35)
  val GoToPrintNextInputSymbol_Empty = State(36)
  val PrintNextInputSymbol_Empty_F = State(37)
  val CheckIfNeedToAddHeaderBuffer = State(38)
  val CheckIfNextCellContainsz = State(39)
  val FinishPrintingInput_Firstz = State(40)
  val FinishPrintingInput_Secondz = State(41)
  val FindRulesMatchingCurrentVirtualState = State(42)
  val FindCurrentVirtualState_VirtualTapeSection = State(43)
  val FindCurrentVirtualState_GoToVirtualStateStart = State(44)
  val CurrentVirtualState_FindFirst1 = State(45)
  val CurrentVirtualState_MarkFirst1 = State(46)
  val FindRuleBeginningStates_FindNextSemicolon = State(47)
  val FindRuleBeginningStates_GoingToFirst1 = State(48)
  val FindRuleBeginningStates_MarkFirst1 = State(49)
  val FindRuleBeginningStates_SkippingMarkedRule = State(50)
  val FindRuleBeginningStates_ReturnToCurrentState_RuleSection = State(51)
  val FindRuleBeginningStates_ReturnToCurrentState_NonRuleSection = State(52)
  val GetNextCurrentStateTally = State(53)
  val CurrentStateTally_MarkNext1 = State(54)
  val MatchStateToBeginningRules_1_FindNextMark = State(55)
  val MatchStateToBeginningRules_1_CheckNextCell = State(56)
  val MatchStateToBeginningRules_1_Mark = State(57)
  val CurrentStateTally_FinalMatch_FindNextMark = State(58)
  val CurrentStateTally_FinalMatch_CheckForColon = State(59)
  val CurrentStateTally_FinalMatch_MarkColon = State(60)
  val GoToCurrentScannedVirtualCell = State(61)
  val ReadCurrentScannedVirtualCell = State(62)
  val FindRelevantRulesForSymbol1_NonRuleSection = State(63)
  val FindRelevantRulesForSymbol1_EndingState = State(64)
  val FindRelevantRulesForSymbol1_MovementInstruction = State(65)
  val FindRelevantRulesForSymbol1_NewSymbol = State(66)
  val FindRelevantRulesForSymbol1_CheckBeginningSymbol_F = State(67)
  val FindRelevantRulesForSymbol1_CheckBeginningSymbol_E = State(68)
  val FindRelevantRulesForSymbol1_MarkMatchingSymbol = State(69)
  val FindRelevantRulesForSymbol1_GoToNextRule = State(70)
  val FindRelevantRulesForSymbol0_NonRuleSection = State(71)
  val FindRelevantRulesForSymbol0_EndingState = State(72)
  val FindRelevantRulesForSymbol0_MovementInstruction = State(73)
  val FindRelevantRulesForSymbol0_NewSymbol = State(74)
  val FindRelevantRulesForSymbol0_CheckBeginningSymbol_F = State(75)
  val FindRelevantRulesForSymbol0_CheckBeginningSymbol_E = State(76)
  val FindRelevantRulesForSymbol0_MarkMatchingSymbol = State(77)
  val FindRelevantRulesForSymbol0_GoToNextRule = State(78)
  val FindRelevantRulesForSymbolEmpty_NonRuleSection = State(79)
  val FindRelevantRulesForSymbolEmpty_EndingState = State(80)
  val FindRelevantRulesForSymbolEmpty_MovementInstruction = State(81)
  val FindRelevantRulesForSymbolEmpty_NewSymbol = State(82)
  val FindRelevantRulesForSymbolEmpty_CheckBeginningSymbol_E = State(83)
  val FindRelevantRulesForSymbolEmpty_CheckBeginningSymbol_F = State(84)
  val FindRelevantRulesForSymbolEmpty_MarkMatchingSymbol = State(85)
  val FindRelevantRulesForSymbolEmpty_GoToNextRule = State(86)
  val FindApplicableRule = State(87)
  val FindApplicableRule_BeginningState = State(88)
  val FindApplicableRule_BeginningState_CheckIfMarked = State(89)
  val FindApplicableRule_GoToNextRule = State(90)
  val FindApplicableRule_BeginningSymbol = State(91)
  val FindApplicableRule_BeginningSymbol_CheckIfMarked = State(92)
  val FindApplicableRule_ApplicableRuleFound_GetNextSymbol = State(93)
  val FindApplicableRule_ApplicableRuleFound_ReadNextSymbol_F = State(94)
  val FindApplicableRule_ApplicableRuleFound_ReadNextSymbol_E = State(95)
  val CopyNewState_0 = State(96)
  val CopyNewState_0_Mark = State(97)
  val CopyNewState_1 = State(98)
  val CopyNewState_1_Mark = State(99)
  val CopyNewState_Empty = State(100)
  val CopyNewState_Empty_Mark = State(101)
  val GoToMarkedMovementInstruction = State(102)
  val ReadMovementInstruction = State(103)
  val MovementInstruction_L_Mark = State(104)
  val CopyMovementInstruction_L = State(105)
  val MoveVirtualHead_L_F = State(106)
  val MoveVirtualHead_L_E = State(107)
  val MovementInstruction_R_Mark = State(108)
  val CopyMovementInstruction_R = State(109)
  val MoveVirtualHead_R_F = State(110)
  val MoveVirtualHead_R_E = State(111)
  val GoToMarkedNewState = State(112)
  val GoToStartOfNewState = State(113)
  val CopyColonToEnd_Mark = State(114)
  val CopyColonToEnd = State(115)
  val WriteColonToEnd_E = State(116)
  val WriteNewState_Firstz = State(117)
  val WriteNewState_Secondz = State(118)
  val GoToGetNextNewStateTally = State(119)
  val CopyNewStateTally_Mark = State(120)
  val CopyNewStateTally = State(121)
  val Write1ToEnd_E = State(122)
  val CopyVirtualTape_GoToEnd = State(123)
  val FindStartOfPreviousVirtualTape_StateSection = State(124)
  val FindStartOfPreviousVirtualTape_TapeSection = State(125)
  val FindStartOfPreviousVirtualTape_Colon_E = State(126)
  val ReadFirstCell = State(127)
  val MarkFirstCell_0 = State(128)
  val CopyFirstCell_0 = State(129)
  val WriteFirstCell_0_Colon_E = State(130)
  val WriteFirstCell_0_F = State(131)
  val WriteFirstCell_0_E = State(132)
  val WriteCell_Firstz = State(133)
  val WriteCell_Secondz = State(134)
  val CopyFirstCell_0_Scanned = State(135)
  val WriteFirstCell_0_Scanned_Colon_E = State(136)
  val WriteFirstCell_0_Buffer_F = State(137)
  val WriteFirstCell_0_Buffer_E = State(138)
  val WriteFirstCell_0_Scanned_F = State(139)
  val WriteFirstCell_0_Scanned_E = State(140)
  val MarkFirstCell_1 = State(141)
  val CopyFirstCell_1 = State(142)
  val WriteFirstCell_1_Colon_E = State(143)
  val WriteFirstCell_1_F = State(144)
  val WriteFirstCell_1_E = State(145)
  val CopyFirstCell_1_Scanned = State(146)
  val WriteFirstCell_1_Scanned_Colon_E = State(147)
  val WriteFirstCell_1_Buffer_F = State(148)
  val WriteFirstCell_1_Buffer_E = State(149)
  val WriteFirstCell_1_Scanned_F = State(150)
  val WriteFirstCell_1_Scanned_E = State(151)
  val MarkFirstCell_Empty = State(152)
  val CopyFirstCell_Empty_CheckIfNextCellScanned_F = State(153)
  val CopyFirstCell_Empty_CheckIfNextCellScanned_E = State(154)
  val CopyFirstCell_Empty_DeletePreviousMark_F = State(155)
  val CopyFirstCell_Empty_DeletePreviousMark_E = State(156)
  val CopyFirstCell_Empty = State(157)
  val WriteFirstCell_Empty_Colon_E = State(158)
  val WriteFirstCell_Empty_Buffer_F = State(159)
  val WriteFirstCell_Empty_Buffer_E = State(160)
  val WriteFirstCell_Empty_F = State(161)
  val WriteFirstCell_Empty_E = State(162)
  val CopyFirstCell_Empty_Scanned = State(163)
  val WriteFirstCell_Empty_Scanned_Colon_E = State(164)
  val WriteFirstCell_Empty_Scanned_F = State(165)
  val WriteFirstCell_Empty_Scanned_E = State(166)
  val FindNextCellToCopy = State(167)
  val ReadNextCellToCopy = State(168)
  val MarkCell_0 = State(169)
  val CopyCell_0 = State(170)
  val WriteCell_0_E = State(171)
  val CopyCell_0_Scanned_CheckIfBufferRequired = State(172)
  val CopyCell_0_Scanned = State(173)
  val WriteCell_0_Scanned_E = State(174)
  val CopyCell_0_Scanned_Buffer = State(175)
  val WriteCell_0_Scanned_Buffer_E = State(176)
  val WriteCell_Buffer_F = State(177)
  val WriteCell_Buffer_E = State(178)
  val MarkCell_1 = State(179)
  val CopyCell_1 = State(180)
  val WriteCell_1_E = State(181)
  val CopyCell_1_Scanned_CheckIfBufferRequired = State(182)
  val CopyCell_1_Scanned = State(183)
  val WriteCell_1_Scanned_E = State(184)
  val CopyCell_1_Scanned_Buffer = State(185)
  val WriteCell_1_Scanned_Buffer_E = State(186)
  val MarkCell_Empty = State(187)
  val CopyCell_Empty = State(188)
  val WriteCell_Empty_E = State(189)
  val CopyCell_Empty_Scanned_CheckIfBufferRequired = State(190)
  val CopyCell_Empty_Scanned = State(191)
  val WriteCell_Empty_Scanned_E = State(192)
  val CopyCell_Empty_Scanned_Buffer = State(193)
  val WriteCell_Empty_Scanned_Buffer_E = State(194)
  val FinishedCopyingVirtualTape = State(195)
  val NoApplicableRulesFound = State(196)
  val Finished = State(999)
}
