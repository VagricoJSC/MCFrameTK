
COMMENT ON TABLE MBT_APRV IS '承認情報ヘッダ // Approval info. header';


COMMENT ON COLUMN MBT_APRV.APRV_NO IS '承認ＮＯ // #MA.APRV_NO // Approval No.';


COMMENT ON COLUMN MBT_APRV.APRV_NO_SEQ IS '承認ＮＯ連番 // #MA.APRV_NO_SEQ // Approval sequence number';


COMMENT ON COLUMN MBT_APRV.APRV_STS_TYP IS '承認状況区分 // #MA.APRV_STS_TYP // Approval status type';


COMMENT ON COLUMN MBT_APRV.LAST_APRV_USR_CD IS '最終承認者ＣＤ // #MA.USR_CD // Final approver cd.';


COMMENT ON COLUMN MBT_APRV.LAST_APRV_TM IS '最終承認日時 // #MA.TM // Final approver date and time';


COMMENT ON COLUMN MBT_APRV.NEXT_OPR_FLG IS '次処理済ＦＬＧ // #MA.FLG // Next process completed flg.';


COMMENT ON COLUMN MBT_APRV.INS_DT IS '登録日 // #MA.DT // Entry date';


COMMENT ON COLUMN MBT_APRV.BIZ_USR_CD IS '業務担当者ＣＤ // #MA.USR_CD // Business PIC cd.';


COMMENT ON COLUMN MBT_APRV.SRC_INS_USR_CD IS '登録担当者ＣＤ // #MA.USR_CD // Entry PIC cd.';


COMMENT ON COLUMN MBT_APRV.MASTER_DT IS '承認マスタ適用日 // #MA.DT // Approval master application date';


COMMENT ON COLUMN MBT_APRV.APRV_FUNC_TYP IS '承認機能区分 // #MA.APRV_FUNC_TYP // Approval function type';


COMMENT ON COLUMN MBT_APRV.APRV_RT_PTN IS '承認ルートパタン // #MA.APRV_RT_PTN // Approval route pattern';


COMMENT ON COLUMN MBT_APRV.APRV_ROW_NUM IS '承認行番号 // #MA.APRV_ROW_NUM // Approver row number';


COMMENT ON COLUMN MBT_APRV.SRC_ITM_CD IS '承認作成元品目ＣＤ // #MA.ITM_CD // Approval creating source item cd.';


COMMENT ON COLUMN MBT_APRV.SRC_ITM_SUB1 IS '承認作成元枝番１ // #MA.ITM_SUB1 // Approval creating source branch No. 1';


COMMENT ON COLUMN MBT_APRV.SRC_ITM_SUB2 IS '承認作成元枝番２ // #MA.ITM_SUB2 // Approval creating source branch No. 2';


COMMENT ON COLUMN MBT_APRV.SRC_ITM_SUB3 IS '承認作成元枝番３ // #MA.ITM_SUB3 // Approval creating source branch No. 3';


COMMENT ON COLUMN MBT_APRV.SRC_DPT_CD IS '承認作成元部門ＣＤ // #MA.DPT_CD // Approval creating source dept. cd.';


COMMENT ON COLUMN MBT_APRV.SRC_BP_CD IS '承認作成元取引先ＣＤ // #MA.BP_CD // Approval creating source customer cd.';


COMMENT ON COLUMN MBT_APRV.SRC_CUR_CD1 IS '承認作成元通貨ＣＤ１ // #MA.CUR_CD // Approval creating source base currency cd. 1';


COMMENT ON COLUMN MBT_APRV.SRC_AMT1 IS '承認作成元金額１ // #MA.MONEY // Approval creating source amount 1';


COMMENT ON COLUMN MBT_APRV.SRC_CUR_CD2 IS '承認作成元通貨ＣＤ２ // #MA.CUR_CD // Approval creating source base currency cd. 2';


COMMENT ON COLUMN MBT_APRV.SRC_AMT2 IS '承認作成元金額２ // #MA.MONEY // Approval creating source amount 2';


COMMENT ON COLUMN MBT_APRV.SRC_CUR_CD3 IS '承認作成元通貨ＣＤ３ // #MA.CUR_CD // Approval creating source base currency cd. 3';


COMMENT ON COLUMN MBT_APRV.SRC_AMT3 IS '承認作成元金額３ // #MA.MONEY // Approval created-from amount 3';


COMMENT ON COLUMN MBT_APRV.SRC_EXT_KEY1 IS '承認作成元拡張項目１ // #MA.APRV_EXT_KEY1 // Approval creating source extended column 1';


COMMENT ON COLUMN MBT_APRV.SRC_EXT_KEY2 IS '承認作成元拡張項目２ // #MA.APRV_EXT_KEY2 // Approval creating source extended column 2';


COMMENT ON COLUMN MBT_APRV.SRC_EXT_KEY3 IS '承認作成元拡張項目３ // #MA.APRV_EXT_KEY3 // Approval created-from expanded column 3';


COMMENT ON COLUMN MBT_APRV.APRV_SRC_NO1 IS '承認作成元ＮＯ１ // #MA.APRV_SRC_NO // Approval creating source No. 1';


COMMENT ON COLUMN MBT_APRV.APRV_SRC_NO2 IS '承認作成元ＮＯ２ // #MA.APRV_SRC_NO // Approval creating source No. 2';


COMMENT ON COLUMN MBT_APRV.APRV_UPD_FLG IS '更新可能ＦＬＧ // #MA.FLG // Updatable flg.';


COMMENT ON COLUMN MBT_APRV.APRV_CAN_FLG IS '取消可能ＦＬＧ // #MA.FLG // Cancelable flg.';


COMMENT ON COLUMN MBT_APRV.CAN_FLG IS '取消ＦＬＧ // #MA.FLG // Cancel flg.';


COMMENT ON COLUMN MBT_APRV.SUB_CHAR1 IS '予備１ // #MA.APRV_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MBT_APRV.SUB_CHAR2 IS '予備２ // #MA.APRV_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MBT_APRV.SUB_CHAR3 IS '予備３ // #MA.APRV_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MBT_APRV.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MBT_APRV.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MBT_APRV.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MBT_APRV.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MBT_APRV.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MBT_APRV.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MBT_APRV.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MBT_APRV.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MBT_APRV.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MBT_APRV.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

