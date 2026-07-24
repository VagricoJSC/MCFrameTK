
COMMENT ON TABLE MST_PAY_CHK_ALL IS '支払照合ヘッダ // Payment collation header';


COMMENT ON COLUMN MST_PAY_CHK_ALL.PAY_CHK_MNG_NO IS '支払照合管理ＮＯ // #MA.PAY_CHK_MNG_NO // Payment collation management No.';


COMMENT ON COLUMN MST_PAY_CHK_ALL.CO_CD IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN MST_PAY_CHK_ALL.PAY_CHK_NO IS '支払照合ＮＯ // #MA.PAY_CHK_NO // Payment collation No.';


COMMENT ON COLUMN MST_PAY_CHK_ALL.PAY_NTC_REV IS '支払通知書改訂番号 // #MA.SLIP_REV // Payment notice rev. number';


COMMENT ON COLUMN MST_PAY_CHK_ALL.REG_DT IS '登録日 // #MA.DT // Entry date';


COMMENT ON COLUMN MST_PAY_CHK_ALL.BSPPL_CD IS '支払予定管理先ＣＤ // #MA.BP_CD // Scheduled payee cd.';


COMMENT ON COLUMN MST_PAY_CHK_ALL.BSPPL_USR_CD IS '支払予定管理先担当者ＣＤ // #MA.USR_CD // Scheduled payee PIC cd.';


COMMENT ON COLUMN MST_PAY_CHK_ALL.BSPPL_DPT_CD IS '支払予定管理先担当部門ＣＤ // #MA.DPT_CD // Cd. of dept. in charge of scheduled payee';


COMMENT ON COLUMN MST_PAY_CHK_ALL.PURC_ACT_NO IS '仕入実績ＮＯ // #MA.PURC_ACT_NO // Purchase result No.';


COMMENT ON COLUMN MST_PAY_CHK_ALL.RCPT_IV_MNG_NO IS '受領インボイス管理ＮＯ // #MA.RCPT_IV_MNG_NO // Purchase invoice management No.';


COMMENT ON COLUMN MST_PAY_CHK_ALL.RCPT_IV_NO IS '受領インボイスＮＯ // #MA.IV_NO // Purchase invoice No.';


COMMENT ON COLUMN MST_PAY_CHK_ALL.WRK_NO IS '案件ＮＯ // #MA.WRK_NO // Sales project No.';


COMMENT ON COLUMN MST_PAY_CHK_ALL.PAY_SPOT_FLG IS '都度支払ＦＬＧ // #MA.FLG // Payment per transaction flg.';


COMMENT ON COLUMN MST_PAY_CHK_ALL.BSPPL_CL_DT IS '支払予定管理先締年月日 // #MA.DT // Scheduled payee closing year, month, and date';


COMMENT ON COLUMN MST_PAY_CHK_ALL.BSPPL_CL_DAY IS '支払予定管理先締日 // #MA.CL_DAY // Scheduled payee closing date';


COMMENT ON COLUMN MST_PAY_CHK_ALL.TRD_CUR_CD IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN MST_PAY_CHK_ALL.PRNT_FLG IS '発行済ＦＬＧ // #MA.FLG // Issued flg.';


COMMENT ON COLUMN MST_PAY_CHK_ALL.PAY_XRATE IS '支払照合為替レート // #MA.MONEY // Payment collation exchange rate';


COMMENT ON COLUMN MST_PAY_CHK_ALL.AMT IS '金額 // #MA.MONEY // Amount';


COMMENT ON COLUMN MST_PAY_CHK_ALL.COM_PAID IS '手数料 // #MA.MONEY // Fee';


COMMENT ON COLUMN MST_PAY_CHK_ALL.COM_PAID_TAX_AMT IS '手数料税額 // #MA.MONEY // Fee tax amount';


COMMENT ON COLUMN MST_PAY_CHK_ALL.LAST_PAY_SCHD_AMT IS '前回支払予定額 // #MA.MONEY // Last payment schedule amount';


COMMENT ON COLUMN MST_PAY_CHK_ALL.BFW_AMT IS '今回繰越額 // #MA.MONEY // Current carry-over amount';


COMMENT ON COLUMN MST_PAY_CHK_ALL.PURC_AMT IS '今回仕入額 // #MA.MONEY // Current purchase amount';


COMMENT ON COLUMN MST_PAY_CHK_ALL.PURC_RET_AMT IS '今回仕入返品額 // #MA.MONEY // Current purchase return amount';


COMMENT ON COLUMN MST_PAY_CHK_ALL.PURC_DSCNT_AMT IS '今回仕入値引額 // #MA.MONEY // Current purchase discount amount';


COMMENT ON COLUMN MST_PAY_CHK_ALL.SW_TO_AMT IS '今回振替額（振替先） // #MA.MONEY // Current transfer amount (Transfer destination)';


COMMENT ON COLUMN MST_PAY_CHK_ALL.TAX_AMT IS '今回税額 // #MA.MONEY // Current tax amount';


COMMENT ON COLUMN MST_PAY_CHK_ALL.ACCOUNT_AMT IS '今回預金支払額 // #MA.MONEY // Current payment amount from deposit';


COMMENT ON COLUMN MST_PAY_CHK_ALL.CASH_AMT IS '今回現金支払額 // #MA.MONEY // Current cash payment amount';


COMMENT ON COLUMN MST_PAY_CHK_ALL.NOTE_AMT IS '今回手形支払額 // #MA.MONEY // Current notes payment amount';


COMMENT ON COLUMN MST_PAY_CHK_ALL.SETOFF_AMT IS '今回相殺支払額 // #MA.MONEY // Current offset payment amount';


COMMENT ON COLUMN MST_PAY_CHK_ALL.SETOFF_TAX_AMT IS '今回相殺支払税額 // #MA.MONEY // Current offset payment tax amount';


COMMENT ON COLUMN MST_PAY_CHK_ALL.SW_AMT IS '今回振替額 // #MA.MONEY // Current transfer amount';


COMMENT ON COLUMN MST_PAY_CHK_ALL.SCHD_PAY_AMT IS '今回支払予定額 // #MA.MONEY // Current scheduled payment amount';


COMMENT ON COLUMN MST_PAY_CHK_ALL.ADV_PAY_AMT IS '前渡金支払額 // #MA.MONEY // Advance payment amount';


COMMENT ON COLUMN MST_PAY_CHK_ALL.ADV_PAY_SETOFF_AMT IS '前渡金相殺額 // #MA.MONEY // Advance payment offset amount';


COMMENT ON COLUMN MST_PAY_CHK_ALL.ADV_PAY_SETOFF_TAX_AMT IS '前渡金相殺税額 // #MA.MONEY // Advance payment offset tax amount';


COMMENT ON COLUMN MST_PAY_CHK_ALL.ADV_PAY_BAL IS '前渡金残高 // #MA.MONEY // Advance payment balance';


COMMENT ON COLUMN MST_PAY_CHK_ALL.PAY_STS_TYP IS '支払状況区分 // #MS.PAY_STS_TYP // Payment status type';


COMMENT ON COLUMN MST_PAY_CHK_ALL.BATCH_PAY_SCHD_CL_FLG IS 'バッチ支払予定締ＦＬＧ // #MA.FLG // Batch payment schedule closing flg.';


COMMENT ON COLUMN MST_PAY_CHK_ALL.MAN_REG_FLG IS 'マニュアル登録ＦＬＧ // #MA.FLG // Manual entry flg.';


COMMENT ON COLUMN MST_PAY_CHK_ALL.APRV_FLG IS '承認対象ＦＬＧ // #MA.FLG // For approval flg.';


COMMENT ON COLUMN MST_PAY_CHK_ALL.APRV_NO IS '承認ＮＯ // #MA.APRV_NO // Approval No.';


COMMENT ON COLUMN MST_PAY_CHK_ALL.APRV_STS_TYP IS '承認状況区分 // #MA.APRV_STS_TYP // Approval status type';


COMMENT ON COLUMN MST_PAY_CHK_ALL.PAY_SCHD_D_PRINT_RMRKS IS '支払予定明細備考 // #MS.PAY_SCHD_D_PRINT_HDR_RMRKS // Payment schedule details remarks';


COMMENT ON COLUMN MST_PAY_CHK_ALL.INTR_RMRKS IS '内部備考 // #MS.PAY_CHK_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN MST_PAY_CHK_ALL.SUB_CHAR1 IS '予備１ // #MS.PAY_CHK_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MST_PAY_CHK_ALL.SUB_CHAR2 IS '予備２ // #MS.PAY_CHK_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MST_PAY_CHK_ALL.SUB_CHAR3 IS '予備３ // #MS.PAY_CHK_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MST_PAY_CHK_ALL.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_PAY_CHK_ALL.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_PAY_CHK_ALL.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_PAY_CHK_ALL.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_PAY_CHK_ALL.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_PAY_CHK_ALL.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_PAY_CHK_ALL.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_PAY_CHK_ALL.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_PAY_CHK_ALL.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_PAY_CHK_ALL.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

