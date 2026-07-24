
COMMENT ON TABLE MAM_JNL_PTN IS '自動仕訳パタンマスタ // Auto-journal pattern master';


COMMENT ON COLUMN MAM_JNL_PTN.JNL_PTN_CD IS '仕訳パタンＣＤ // #MA.JNL_PTN_CD // Journal pattern cd.';


COMMENT ON COLUMN MAM_JNL_PTN.JNL_SEQ IS '連番 // #MA.INT4 // Sequence number';


COMMENT ON COLUMN MAM_JNL_PTN.DR_DPT_TYP IS '借方部門区分 // #MA.DPT_TYP // Debit dept. type';


COMMENT ON COLUMN MAM_JNL_PTN.CR_DPT_TYP IS '貸方部門区分 // #MA.DPT_TYP // Credit dept. type';


COMMENT ON COLUMN MAM_JNL_PTN.DR_DPT_CD IS '借方部門ＣＤ // #MA.AC_DPT_CD // Debit dept. cd.';


COMMENT ON COLUMN MAM_JNL_PTN.CR_DPT_CD IS '貸方部門ＣＤ // #MA.AC_DPT_CD // Credit dept. cd.';


COMMENT ON COLUMN MAM_JNL_PTN.DR_PTN_TYP IS '借方パタン区分 // #MA.PTN_TYP // Debit pattern type';


COMMENT ON COLUMN MAM_JNL_PTN.DR_GRP_CD IS '借方仕訳グループＣＤ // #MA.JNL_GRP_CD // Debit journal group cd.';


COMMENT ON COLUMN MAM_JNL_PTN.CR_PTN_TYP IS '貸方パタン区分 // #MA.PTN_TYP // Credit pattern type';


COMMENT ON COLUMN MAM_JNL_PTN.CR_GRP_CD IS '貸方仕訳グループＣＤ // #MA.JNL_GRP_CD // Credit journal group cd.';


COMMENT ON COLUMN MAM_JNL_PTN.DR_AC_CD IS '借方勘定科目ＣＤ // #MA.AC_CD // Debit account cd.';


COMMENT ON COLUMN MAM_JNL_PTN.DR_SUB_AC_CD IS '借方補助勘定科目ＣＤ // #MA.SUB_AC_CD // Debit subsidiary account cd.';


COMMENT ON COLUMN MAM_JNL_PTN.CR_AC_CD IS '貸方勘定科目ＣＤ // #MA.AC_CD // Credit account cd.';


COMMENT ON COLUMN MAM_JNL_PTN.CR_SUB_AC_CD IS '貸方補助勘定科目ＣＤ // #MA.SUB_AC_CD // Credit subsidiary account cd.';


COMMENT ON COLUMN MAM_JNL_PTN.DR_AC_TAX_CD IS '借方会計税ＣＤ // #MA.AC_TAX_CD // Debit accounting tax cd.';


COMMENT ON COLUMN MAM_JNL_PTN.CR_AC_TAX_CD IS '貸方会計税ＣＤ // #MA.AC_TAX_CD // Credit accounting tax cd.';


COMMENT ON COLUMN MAM_JNL_PTN.DR_BP_TYP IS '借方取引先区分 // #MA.BP_SET_TYP // Debit BP type';


COMMENT ON COLUMN MAM_JNL_PTN.CR_BP_TYP IS '貸方取引先区分 // #MA.BP_SET_TYP // Credit BP type';


COMMENT ON COLUMN MAM_JNL_PTN.DR_BP_CD IS '借方取引先ＣＤ // #MA.BP_CD // Debit BP cd.';


COMMENT ON COLUMN MAM_JNL_PTN.CR_BP_CD IS '貸方取引先ＣＤ // #MA.BP_CD // Credit company cd.';


COMMENT ON COLUMN MAM_JNL_PTN.DR_ITM_TYP IS '借方品目区分 // #MA.ITM_SET_TYP // Debit item type';


COMMENT ON COLUMN MAM_JNL_PTN.CR_ITM_TYP IS '貸方品目区分 // #MA.ITM_SET_TYP // Credit item type';


COMMENT ON COLUMN MAM_JNL_PTN.DR_AMT_TYP IS '借方金額区分 // #MA.AMT_TYP // Debit amount type';


COMMENT ON COLUMN MAM_JNL_PTN.CR_AMT_TYP IS '貸方金額区分 // #MA.AMT_TYP // Credit amount type';


COMMENT ON COLUMN MAM_JNL_PTN.DR_ABS_TYP IS '借方摘要区分 // #MA.ABS_TYP // Debit abstract type';


COMMENT ON COLUMN MAM_JNL_PTN.DR_ABSTRACT IS '借方摘要 // #MA.ABSTRACT_M // Debit summary';


COMMENT ON COLUMN MAM_JNL_PTN.CR_ABS_TYP IS '貸方摘要区分 // #MA.ABS_TYP // Credit abstract type';


COMMENT ON COLUMN MAM_JNL_PTN.CR_ABSTRACT IS '貸方摘要 // #MA.ABSTRACT_M // Credit summary';


COMMENT ON COLUMN MAM_JNL_PTN.DR_TRD_SML_FLG IS '借方振替先集計ＦＬＧ // #MA.FLG // Debit transfer destination aggregation flg.';


COMMENT ON COLUMN MAM_JNL_PTN.CR_TRD_SML_FLG IS '貸方振替先集計ＦＬＧ // #MA.FLG // Credit transfer destination aggregation flg.';


COMMENT ON COLUMN MAM_JNL_PTN.CARRY_FLG IS '繰越仕訳ＦＬＧ // #MA.FLG // Carry-over journal flg.';


COMMENT ON COLUMN MAM_JNL_PTN.MINUS_FLG IS 'マイナスＦＬＧ // #MA.FLG // Minus flg.';


COMMENT ON COLUMN MAM_JNL_PTN.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MAM_JNL_PTN.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MAM_JNL_PTN.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MAM_JNL_PTN.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MAM_JNL_PTN.ITM_JNL_CD IS '品目仕訳ＣＤ // #MA.ITM_JNL_CD // Item journal cd.';


COMMENT ON COLUMN MAM_JNL_PTN.AC_RSN_CD IS '会計理由ＣＤ // #MA.AC_RSN_CD // Accounting reason cd.';


COMMENT ON COLUMN MAM_JNL_PTN.PURC_TYP IS '購買区分 // #MA.PURC_TYP // Purchase type';


COMMENT ON COLUMN MAM_JNL_PTN.UN_FIX_TYP IS '金額未確定区分 // #MA.UN_FIX_TYP // Amount unfirm type';


COMMENT ON COLUMN MAM_JNL_PTN.FOREIGN_TYP IS '国外取引区分 // #MA.FOREIGN_TYP // Foreign transaction type';


COMMENT ON COLUMN MAM_JNL_PTN.CUR_CD IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN MAM_JNL_PTN.ASST_TYP IS '資産区分 // #MA.ASST_TYP // Asset type';


COMMENT ON COLUMN MAM_JNL_PTN.QUALITY_TYP IS '在庫良品区分 // #MA.QUALITY_TYP // Inventory conforming type';


COMMENT ON COLUMN MAM_JNL_PTN.INV_LOC_TYP IS '在庫場所区分 // #MA.INV_LOC_TYP // Inventory location type';


COMMENT ON COLUMN MAM_JNL_PTN.AMT_SIGN_TYP IS '金額符号区分 // #MA.AMT_SIGN_TYP // Amount sign type';


COMMENT ON COLUMN MAM_JNL_PTN.JNL_KEY1 IS '仕訳キー項目１ // #MA.JNL_KEY1 // Journal key column 1';


COMMENT ON COLUMN MAM_JNL_PTN.JNL_KEY2 IS '仕訳キー項目２ // #MA.JNL_KEY2 // Journal key column 2';


COMMENT ON COLUMN MAM_JNL_PTN.JNL_KEY3 IS '仕訳キー項目３ // #MA.JNL_KEY3 // Journal key column 3';


COMMENT ON COLUMN MAM_JNL_PTN.JNL_KEY4 IS '仕訳キー項目４ // #MA.JNL_KEY4 // Journal key column 4';


COMMENT ON COLUMN MAM_JNL_PTN.JNL_KEY5 IS '仕訳キー項目５ // #MA.JNL_KEY5 // Journal key column 5';


COMMENT ON COLUMN MAM_JNL_PTN.JNL_KEY6 IS '仕訳キー項目６ // #MA.JNL_KEY6 // Journal key column 6';


COMMENT ON COLUMN MAM_JNL_PTN.JNL_KEY7 IS '仕訳キー項目７ // #MA.JNL_KEY7 // Journal key column 7';


COMMENT ON COLUMN MAM_JNL_PTN.JNL_KEY8 IS '仕訳キー項目８ // #MA.JNL_KEY8 // Journal key column 8';


COMMENT ON COLUMN MAM_JNL_PTN.JNL_KEY9 IS '仕訳キー項目９ // #MA.JNL_KEY9 // Journal key column 9';


COMMENT ON COLUMN MAM_JNL_PTN.JNL_KEY10 IS '仕訳キー項目１０ // #MA.JNL_KEY10 // Journal key column 10';


COMMENT ON COLUMN MAM_JNL_PTN.MON01_INVALID_FLG IS '１月対象外ＦＬＧ // #MA.FLG // Not for Jan. flg.';


COMMENT ON COLUMN MAM_JNL_PTN.MON02_INVALID_FLG IS '２月対象外ＦＬＧ // #MA.FLG // Not for Feb. flg.';


COMMENT ON COLUMN MAM_JNL_PTN.MON03_INVALID_FLG IS '３月対象外ＦＬＧ // #MA.FLG // Not for Mar. flg.';


COMMENT ON COLUMN MAM_JNL_PTN.MON04_INVALID_FLG IS '４月対象外ＦＬＧ // #MA.FLG // Not for Apr. flg.';


COMMENT ON COLUMN MAM_JNL_PTN.MON05_INVALID_FLG IS '５月対象外ＦＬＧ // #MA.FLG // Not for May flg.';


COMMENT ON COLUMN MAM_JNL_PTN.MON06_INVALID_FLG IS '６月対象外ＦＬＧ // #MA.FLG // Not for Jun. flg.';


COMMENT ON COLUMN MAM_JNL_PTN.MON07_INVALID_FLG IS '７月対象外ＦＬＧ // #MA.FLG // Not for July flg.';


COMMENT ON COLUMN MAM_JNL_PTN.MON08_INVALID_FLG IS '８月対象外ＦＬＧ // #MA.FLG // Not for Aug. flg.';


COMMENT ON COLUMN MAM_JNL_PTN.MON09_INVALID_FLG IS '９月対象外ＦＬＧ // #MA.FLG // Not for Sep. flg.';


COMMENT ON COLUMN MAM_JNL_PTN.MON10_INVALID_FLG IS '１０月対象外ＦＬＧ // #MA.FLG // Not for Oct. flg.';


COMMENT ON COLUMN MAM_JNL_PTN.MON11_INVALID_FLG IS '１１月対象外ＦＬＧ // #MA.FLG // Not for Nov. flg.';


COMMENT ON COLUMN MAM_JNL_PTN.MON12_INVALID_FLG IS '１２月対象外ＦＬＧ // #MA.FLG // Not for Dec. flg.';


COMMENT ON COLUMN MAM_JNL_PTN.MEMO1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN MAM_JNL_PTN.MEMO2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN MAM_JNL_PTN.MEMO3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN MAM_JNL_PTN.DEL_FLG IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN MAM_JNL_PTN.DEL_USR_ID IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN MAM_JNL_PTN.DEL_USR_NM IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN MAM_JNL_PTN.DEL_TS IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN MAM_JNL_PTN.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MAM_JNL_PTN.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MAM_JNL_PTN.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MAM_JNL_PTN.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MAM_JNL_PTN.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MAM_JNL_PTN.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MAM_JNL_PTN.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MAM_JNL_PTN.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MAM_JNL_PTN.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MAM_JNL_PTN.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

