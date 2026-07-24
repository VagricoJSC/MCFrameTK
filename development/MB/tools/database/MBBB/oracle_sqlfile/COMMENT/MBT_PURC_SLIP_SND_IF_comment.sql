
COMMENT ON TABLE MBT_PURC_SLIP_SND_IF IS '仕入伝票送信ＩＦ // Purchase slip export IF';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.DATA_LNO IS 'データ行ＮＯ // #MA.IF_DATA_LNO // Data row No.';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.DATA_NO IS 'データＮＯ // #MA.IF_DATA_NO // Data No.';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.EXE_STS_TYP IS 'ＰＧ実行状況区分 // #MA.EXE_STS_TYP // PG execution status type';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.DATA_CRUD_TYP IS 'データ更新区分 // #MA.DATA_CRUD_TYP // Data update type';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.EXT_SYS_CD IS '外部システムＣＤ // #MA.EXT_SYS_CD // External system cd.';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.PURC_ACT_NO IS '仕入実績ＮＯ // #MA.PURC_ACT_NO // Purchase result No.';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.PURC_ACT_SEQ IS '仕入実績連番 // #MA.SLIP_SEQ // Purchase result sequence number';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.PURC_ACT_REV IS '仕入実績改訂番号 // #MA.SLIP_REV // Purchase result rev. number';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.PURC_SLIP_NO IS '仕入伝票ＮＯ // #MA.PURC_SLIP_NO // Purchase slip No.';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.SLIP_STS_TYP IS '伝票状況区分 // #MA.SLIP_STS_TYP // Slip status type';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.TRD_CD IS '取引ＣＤ // #MA.TRD_CD // Transaction cd.';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.TRD_PTN_TYP IS '取引パタン区分 // #MA.TRD_PTN_TYP // Transaction pattern type';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.AC_YM IS '計上年月 // #MA.YM // Recording month';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.AC_DT IS '計上日 // #MA.DT // Recording date';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.DPT_CD IS '部門ＣＤ // #MA.DPT_CD // Dept. cd.';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.USR_CD IS '担当者ＣＤ // #MA.USR_CD // PIC cd.';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.SPPL_CD IS '発注先ＣＤ // #MA.BP_CD // Supplier cd.';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.TAX_CALC_TYP IS '税計算区分 // #MA.TAX_CALC_TYP // Tax calculation type';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.IV_FLG IS 'インボイスＦＬＧ // #MA.FLG // Invoice flg.';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.RCPT_IV_NO IS '受領インボイスＮＯ // #MA.IV_NO // Purchase invoice No.';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.RCPT_IV_MNG_NO IS '受領インボイス管理ＮＯ // #MA.RCPT_IV_MNG_NO // Purchase invoice management No.';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.PURC_RET_ACT_NO IS '仕入返品実績ＮＯ // #MA.PURC_RET_ACT_NO // Purchase return result No.';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.PURC_RET_ACT_REV IS '仕入返品実績改訂番号 // #MA.SLIP_REV // Purchase return result rev. number';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.CRED_CD IS '与信管理先ＣＤ // #MA.BP_CD // Credit managed BP cd.';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.BSPPL_CD IS '支払予定管理先ＣＤ // #MA.BP_CD // Scheduled payee cd.';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.BSPPL_DPT_CD IS '支払予定管理先担当部門ＣＤ // #MA.DPT_CD // Cd. of dept. in charge of scheduled payee';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.AP_DPT_CD IS '債務部門ＣＤ // #MA.DPT_CD // AP dept. cd.';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.TRD_CUR_CD IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.BASE_CUR_CD IS '基準通貨ＣＤ // #MA.CUR_CD // Base currency cd.';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.XRATE_CD IS '為替レートＣＤ // #MA.XRATE_CD // Exchange rate cd.';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.ARR_LG_GRP_CD IS '入荷物流グループＣＤ // #MA.LG_GRP_CD // Receipt distribution group cd.';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.XRATE IS '為替レート // #MA.MONEY // Exchange rate';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.AP_STTL_CD IS '債務決済方法ＣＤ // #MA.STTL_CD // AP settlement method cd.';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.PAY_SCHD_DT IS '支払予定日 // #MA.DT // Scheduled payment date';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.PURC_ACT_D_NO IS '仕入実績明細ＮＯ // #MA.ACT_D_NO // Purchase result details No.';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.PURC_ACT_D_SEQ IS '仕入実績明細連番 // #MA.SLIP_SEQ // Purchase result details sequence number';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.PURC_RET_ACT_D_NO IS '仕入返品実績明細ＮＯ // #MA.PURC_RET_ACT_D_NO // Purchase return result details No.';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.PURC_SLIP_LNO IS '仕入伝票行ＮＯ // #MA.PURC_SLIP_LNO // Purchase slip row No.';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.ITM_NM IS '品名 // #MA.ITM_NM // Item name';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.STK_MNG_TYP IS '在庫管理区分 // #MA.STK_MNG_TYP // Inventory management type';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.ITM_JNL_CD IS '品目仕訳ＣＤ // #MA.ITM_JNL_CD // Item journal cd.';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.TRD_UNIT_CD IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.TRD_UNIT_QTY IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.BASE_UNIT_CD IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.BASE_UNIT_QTY IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.TAX_CD IS '税ＣＤ // #MA.TAX_CD // Tax cd.';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.INC_TAX_FLG IS '内税ＦＬＧ // #MA.FLG // Tax inclusive flg.';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.TAX_TYP IS '税区分 // #MA.TAX_TYP // Tax type';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.TRD_CUR_UPRI IS '取引通貨単価 // #MA.MONEY // Unit price (Transaction currency)';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.TRD_CUR_AMT IS '取引通貨金額 // #MA.MONEY // Amount (Transaction currency)';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.TRD_CUR_TAX_AMT IS '取引通貨税額 // #MA.MONEY // Tax amount (Transaction currency)';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.TRD_CUR_DSCNT_AMT IS '取引通貨値引額 // #MA.MONEY // Discount amount (Transaction currency)';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.BASE_CUR_UPRI IS '基準通貨単価 // #MA.MONEY // Unit price (Base currency)';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.BASE_CUR_AMT IS '基準通貨金額 // #MA.MONEY // Amount (Base currency)';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.BASE_CUR_TAX_AMT IS '基準通貨税額 // #MA.MONEY // Tax amount (Base currency)';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.BASE_CUR_DSCNT_AMT IS '基準通貨値引額 // #MA.MONEY // Discount amount (Base currency)';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.DTL_DSCNT_FLG IS '明細値引ＦＬＧ // #MA.FLG // Details discount flg.';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.PURC_ADJ_FLG IS '仕入調整ＦＬＧ // #MA.FLG // Purchase adjustment flg.';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.RE_SND_FLG IS '再送信ＦＬＧ // #MA.FLG // Resend flg.';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.NOT_SND_FLG IS '送信対象外ＦＬＧ // #MA.FLG // Not to be exported flg.';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.SND_TO_ERR_FLG IS '送信先エラーＦＬＧ // #MA.FLG // Send-to error flg.';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.IF_SUB_CHAR1 IS 'ＩＦ予備ＣＨＡＲ項目１ // #MA.IF_SUB_CHAR1 // IF spare CHAR column 1';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.IF_SUB_CHAR2 IS 'ＩＦ予備ＣＨＡＲ項目２ // #MA.IF_SUB_CHAR2 // IF spare CHAR column 2';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.IF_SUB_CHAR3 IS 'ＩＦ予備ＣＨＡＲ項目３ // #MA.IF_SUB_CHAR3 // IF spare CHAR column 3';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.IF_SUB_CHAR4 IS 'ＩＦ予備ＣＨＡＲ項目４ // #MA.IF_SUB_CHAR4 // IF spare CHAR column 4';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.IF_SUB_CHAR5 IS 'ＩＦ予備ＣＨＡＲ項目５ // #MA.IF_SUB_CHAR5 // IF spare CHAR column 5';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.IF_SUB_CHAR6 IS 'ＩＦ予備ＣＨＡＲ項目６ // #MA.IF_SUB_CHAR6 // IF spare CHAR column 6';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.IF_SUB_CHAR7 IS 'ＩＦ予備ＣＨＡＲ項目７ // #MA.IF_SUB_CHAR7 // IF spare CHAR column 7';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.IF_SUB_CHAR8 IS 'ＩＦ予備ＣＨＡＲ項目８ // #MA.IF_SUB_CHAR8 // IF spare CHAR column 8';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.IF_SUB_CHAR9 IS 'ＩＦ予備ＣＨＡＲ項目９ // #MA.IF_SUB_CHAR9 // IF spare CHAR column 9';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.IF_SUB_CHAR10 IS 'ＩＦ予備ＣＨＡＲ項目１０ // #MA.IF_SUB_CHAR10 // IF spare CHAR column 10';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.IF_SUB_CHAR11 IS 'ＩＦ予備ＣＨＡＲ項目１１ // #MA.IF_SUB_CHAR11 // IF spare CHAR column 11';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.IF_SUB_CHAR12 IS 'ＩＦ予備ＣＨＡＲ項目１２ // #MA.IF_SUB_CHAR12 // IF spare CHAR column 12';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.IF_SUB_CHAR13 IS 'ＩＦ予備ＣＨＡＲ項目１３ // #MA.IF_SUB_CHAR13 // IF spare CHAR column 13';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.IF_SUB_CHAR14 IS 'ＩＦ予備ＣＨＡＲ項目１４ // #MA.IF_SUB_CHAR14 // IF spare CHAR column 14';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.IF_SUB_CHAR15 IS 'ＩＦ予備ＣＨＡＲ項目１５ // #MA.IF_SUB_CHAR15 // IF spare CHAR column 15';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.IF_SUB_CHAR16 IS 'ＩＦ予備ＣＨＡＲ項目１６ // #MA.IF_SUB_CHAR16 // IF spare CHAR column 16';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.IF_SUB_CHAR17 IS 'ＩＦ予備ＣＨＡＲ項目１７ // #MA.IF_SUB_CHAR17 // IF spare CHAR column 17';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.IF_SUB_CHAR18 IS 'ＩＦ予備ＣＨＡＲ項目１８ // #MA.IF_SUB_CHAR18 // IF spare CHAR column 18';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.IF_SUB_CHAR19 IS 'ＩＦ予備ＣＨＡＲ項目１９ // #MA.IF_SUB_CHAR19 // IF spare CHAR column 19';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.IF_SUB_CHAR20 IS 'ＩＦ予備ＣＨＡＲ項目２０ // #MA.IF_SUB_CHAR20 // IF spare CHAR column 20';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.IF_SUB_CHAR21 IS 'ＩＦ予備ＣＨＡＲ項目２１ // #MA.IF_SUB_CHAR21 // IF spare CHAR column 21';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.IF_SUB_CHAR22 IS 'ＩＦ予備ＣＨＡＲ項目２２ // #MA.IF_SUB_CHAR22 // IF spare CHAR column 22';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.IF_SUB_CHAR23 IS 'ＩＦ予備ＣＨＡＲ項目２３ // #MA.IF_SUB_CHAR23 // IF spare CHAR column 23';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.IF_SUB_CHAR24 IS 'ＩＦ予備ＣＨＡＲ項目２４ // #MA.IF_SUB_CHAR24 // IF spare CHAR column 24';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.IF_SUB_CHAR25 IS 'ＩＦ予備ＣＨＡＲ項目２５ // #MA.IF_SUB_CHAR25 // IF spare CHAR column 25';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.IF_SUB_CHAR26 IS 'ＩＦ予備ＣＨＡＲ項目２６ // #MA.IF_SUB_CHAR26 // IF spare CHAR column 26';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.IF_SUB_CHAR27 IS 'ＩＦ予備ＣＨＡＲ項目２７ // #MA.IF_SUB_CHAR27 // IF spare CHAR column 27';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.IF_SUB_CHAR28 IS 'ＩＦ予備ＣＨＡＲ項目２８ // #MA.IF_SUB_CHAR28 // IF spare CHAR column 28';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.IF_SUB_CHAR29 IS 'ＩＦ予備ＣＨＡＲ項目２９ // #MA.IF_SUB_CHAR29 // IF spare CHAR column 29';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.IF_SUB_CHAR30 IS 'ＩＦ予備ＣＨＡＲ項目３０ // #MA.IF_SUB_CHAR30 // IF spare CHAR column 30';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.IF_SUB_NUM1 IS 'ＩＦ予備ＮＵＭ項目１ // #MA.IF_SUB_NUM1 // IF spare NUM column 1';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.IF_SUB_NUM2 IS 'ＩＦ予備ＮＵＭ項目２ // #MA.IF_SUB_NUM2 // IF spare NUM column 2';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.IF_SUB_NUM3 IS 'ＩＦ予備ＮＵＭ項目３ // #MA.IF_SUB_NUM3 // IF spare NUM column 3';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.IF_SUB_NUM4 IS 'ＩＦ予備ＮＵＭ項目４ // #MA.IF_SUB_NUM4 // IF spare NUM column 4';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.IF_SUB_NUM5 IS 'ＩＦ予備ＮＵＭ項目５ // #MA.IF_SUB_NUM5 // IF spare NUM column 5';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.IF_SUB_DT1 IS 'ＩＦ予備ＤＡＴＥ項目１ // #MA.DT // IF spare DATE column 1';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.IF_SUB_DT2 IS 'ＩＦ予備ＤＡＴＥ項目２ // #MA.DT // IF spare DATE column 2';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.IF_SUB_DT3 IS 'ＩＦ予備ＤＡＴＥ項目３ // #MA.DT // IF spare DATE column 3';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.IF_SUB_DT4 IS 'ＩＦ予備ＤＡＴＥ項目４ // #MA.DT // IF spare DATE column 4';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.IF_SUB_DT5 IS 'ＩＦ予備ＤＡＴＥ項目５ // #MA.DT // IF spare DATE column 5';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.BATCH_LOG_NO IS 'ログＮＯ // #MA.BATCH_LOG_NO // Log No.';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.LOG_SUB_KEY1 IS 'ログサブキー１ // #MA.BATCH_LOG_SUB_KEY1 // Log sub key 1';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.LOG_SUB_KEY2 IS 'ログサブキー２ // #MA.BATCH_LOG_SUB_KEY2 // Log sub key 2';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MBT_PURC_SLIP_SND_IF.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

