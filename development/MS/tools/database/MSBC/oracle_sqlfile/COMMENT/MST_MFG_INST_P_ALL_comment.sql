
COMMENT ON TABLE MST_MFG_INST_P_ALL IS '製造指図（改訂履歴） // Mfg. order (Rev. history)';


COMMENT ON COLUMN MST_MFG_INST_P_ALL.MFG_INST_NO IS '製造指図ＮＯ // #MA.MFG_INST_NO // Mfg. order No.';


COMMENT ON COLUMN MST_MFG_INST_P_ALL.CO_CD IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN MST_MFG_INST_P_ALL.MFG_INST_REV IS '製造指図改訂番号 // #MA.SLIP_REV // Mfg. order rev. number';


COMMENT ON COLUMN MST_MFG_INST_P_ALL.ITM_MFG_INST_NO IS '品目製造指図ＮＯ // #MA.ITM_MFG_INST_NO // Item mfg. order No.';


COMMENT ON COLUMN MST_MFG_INST_P_ALL.PO_D_NO IS '発注明細ＮＯ // #MA.PO_D_NO // PO details No.';


COMMENT ON COLUMN MST_MFG_INST_P_ALL.BASE_UNIT_YIELD_QTY IS '基準単位出来高予定数量 // #MA.QTY // Base unit output scheduled qty.';


COMMENT ON COLUMN MST_MFG_INST_P_ALL.BASE_UNIT_INST_QTY IS '基準単位製造指図数量 // #MA.QTY // Base unit mfg. order qty.';


COMMENT ON COLUMN MST_MFG_INST_P_ALL.BASE_UNIT_CD IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN MST_MFG_INST_P_ALL.ST_SCHD_TM IS '着手予定日時 // #MA.TM // Scheduled start date and time';


COMMENT ON COLUMN MST_MFG_INST_P_ALL.END_SCHD_TM IS '終了予定日時 // #MA.TM // Scheduled end date and time';


COMMENT ON COLUMN MST_MFG_INST_P_ALL.RQST_DLV_RQST_TM IS '納入希望日時 // #MA.TM // Desired delivery date and time';


COMMENT ON COLUMN MST_MFG_INST_P_ALL.INST_DT IS '指図日 // #MA.DT // Order date';


COMMENT ON COLUMN MST_MFG_INST_P_ALL.INST_PRNT_TM IS '指図書発行日時 // #MA.TM // Order sheet issued date and time';


COMMENT ON COLUMN MST_MFG_INST_P_ALL.INST_PRNT_FLG IS '指図書発行済ＦＬＧ // #MA.FLG // Order sheet issued flg.';


COMMENT ON COLUMN MST_MFG_INST_P_ALL.APRV_FLG IS '承認対象ＦＬＧ // #MA.FLG // For approval flg.';


COMMENT ON COLUMN MST_MFG_INST_P_ALL.MFG_APRV_STS_TYP IS '製造承認状況区分 // #MS.MFG_APRV_STS_TYP // Mfg. approval status type';


COMMENT ON COLUMN MST_MFG_INST_P_ALL.APRV_DT IS '承認日 // #MA.DT // Approval date';


COMMENT ON COLUMN MST_MFG_INST_P_ALL.APRV_DPT_CD IS '承認部門ＣＤ // #MA.DPT_CD // Approval dept. cd.';


COMMENT ON COLUMN MST_MFG_INST_P_ALL.APRV_USR_CD IS '承認者ＣＤ // #MA.USR_CD // Approver cd.';


COMMENT ON COLUMN MST_MFG_INST_P_ALL.APRV_TM IS '承認日時 // #MA.TM // Approval date and time';


COMMENT ON COLUMN MST_MFG_INST_P_ALL.APRV_RSN IS '承認理由 // #MS.APRV_RSN // Approval reason';


COMMENT ON COLUMN MST_MFG_INST_P_ALL.MFG_APRV_ROLE_CD IS '製造承認役割ＣＤ // #MA.APRV_ROLE_CD // Mfg. approval role cd.';


COMMENT ON COLUMN MST_MFG_INST_P_ALL.DISP_PD IS '印字用表示期限 // #MS.DISP_PD // Display expiration for print';


COMMENT ON COLUMN MST_MFG_INST_P_ALL.INST_DPT_CD IS '指図部門ＣＤ // #MA.DPT_CD // Order dept. cd.';


COMMENT ON COLUMN MST_MFG_INST_P_ALL.INST_USR_CD IS '指図担当者ＣＤ // #MA.USR_CD // Order PIC cd.';


COMMENT ON COLUMN MST_MFG_INST_P_ALL.CAN_FLG IS '取消ＦＬＧ // #MA.FLG // Cancel flg.';


COMMENT ON COLUMN MST_MFG_INST_P_ALL.ABORT_FLG IS '打切ＦＬＧ // #MA.FLG // Cancel remaining flg.';


COMMENT ON COLUMN MST_MFG_INST_P_ALL.SCHD_CHG_FLG IS '計画変更ＦＬＧ // #MA.FLG // Plan changed flg.';


COMMENT ON COLUMN MST_MFG_INST_P_ALL.PO_LOCKED_FLG IS '発注訂正・取消不可ＦＬＧ // #MA.FLG // Do not allow PO correction/cancel flg.';


COMMENT ON COLUMN MST_MFG_INST_P_ALL.PO_AUTO_REG_FLG IS '発注時自動作成ＦＬＧ // #MA.FLG // Auto-creation at PO flg.';


COMMENT ON COLUMN MST_MFG_INST_P_ALL.MFG_INST_UNIT_TYP IS '製造指図単位区分 // #MA.MFG_INST_UNIT_TYP // Mfg. order unit type';


COMMENT ON COLUMN MST_MFG_INST_P_ALL.INTR_RMRKS IS '内部備考 // #MS.MFG_INST_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN MST_MFG_INST_P_ALL.INST_RPT_RMRKS IS '指図書備考 // #MS.MFG_INST_RPT_RMRKS // Order sheet remarks';


COMMENT ON COLUMN MST_MFG_INST_P_ALL.INST_PO_CNT_RMRKS IS '指図・発注連絡備考 // #MS.INST_PO_CNT_RMRKS // Order/PO contact remarks';


COMMENT ON COLUMN MST_MFG_INST_P_ALL.SUB_CHAR1 IS '予備１ // #MS.MFG_INST_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MST_MFG_INST_P_ALL.SUB_CHAR2 IS '予備２ // #MS.MFG_INST_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MST_MFG_INST_P_ALL.SUB_CHAR3 IS '予備３ // #MS.MFG_INST_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MST_MFG_INST_P_ALL.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_MFG_INST_P_ALL.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_MFG_INST_P_ALL.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_MFG_INST_P_ALL.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_MFG_INST_P_ALL.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_MFG_INST_P_ALL.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_MFG_INST_P_ALL.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_MFG_INST_P_ALL.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_MFG_INST_P_ALL.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_MFG_INST_P_ALL.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

