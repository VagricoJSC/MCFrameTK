
COMMENT ON TABLE MGVT_MST_MFG_INST IS '製造指図ビュー // Mfg. order view';


COMMENT ON COLUMN MGVT_MST_MFG_INST.MFG_INST_NO IS '製造指図ＮＯ // #MA.MFG_INST_NO // Mfg. order No.';


COMMENT ON COLUMN MGVT_MST_MFG_INST.MFG_INST_REV IS '製造指図改訂番号 // #MA.SLIP_REV // Mfg. order rev. number';


COMMENT ON COLUMN MGVT_MST_MFG_INST.ITM_MFG_INST_NO IS '品目製造指図ＮＯ // #MA.ITM_MFG_INST_NO // Item mfg. order No.';


COMMENT ON COLUMN MGVT_MST_MFG_INST.PO_D_NO IS '発注明細ＮＯ // #MA.PO_D_NO // PO details No.';


COMMENT ON COLUMN MGVT_MST_MFG_INST.BASE_UNIT_YIELD_QTY IS '基準単位出来高予定数量 // #MA.QTY // Base unit output scheduled qty.';


COMMENT ON COLUMN MGVT_MST_MFG_INST.BASE_UNIT_INST_QTY IS '基準単位製造指図数量 // #MA.QTY // Base unit mfg. order qty.';


COMMENT ON COLUMN MGVT_MST_MFG_INST.BASE_UNIT_CD IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN MGVT_MST_MFG_INST.ST_SCHD_TM IS '着手予定日時 // #MA.TM // Scheduled start date and time';


COMMENT ON COLUMN MGVT_MST_MFG_INST.END_SCHD_TM IS '終了予定日時 // #MA.TM // Scheduled end date and time';


COMMENT ON COLUMN MGVT_MST_MFG_INST.RQST_DLV_RQST_TM IS '納入希望日時 // #MA.TM // Desired delivery date and time';


COMMENT ON COLUMN MGVT_MST_MFG_INST.INST_DT IS '指図日 // #MA.DT // Order date';


COMMENT ON COLUMN MGVT_MST_MFG_INST.INST_PRNT_TM IS '指図書発行日時 // #MA.TM // Order sheet issued date and time';


COMMENT ON COLUMN MGVT_MST_MFG_INST.INST_PRNT_FLG IS '指図書発行済ＦＬＧ // #MA.FLG // Order sheet issued flg.';


COMMENT ON COLUMN MGVT_MST_MFG_INST.APRV_FLG IS '承認対象ＦＬＧ // #MA.FLG // For approval flg.';


COMMENT ON COLUMN MGVT_MST_MFG_INST.MFG_APRV_STS_TYP IS '製造承認状況区分 //  // Mfg. approval status type';


COMMENT ON COLUMN MGVT_MST_MFG_INST.APRV_DT IS '承認日 // #MA.DT // Approval date';


COMMENT ON COLUMN MGVT_MST_MFG_INST.APRV_DPT_CD IS '承認部門ＣＤ // #MA.DPT_CD // Approval dept. cd.';


COMMENT ON COLUMN MGVT_MST_MFG_INST.APRV_USR_CD IS '承認者ＣＤ // #MA.USR_CD // Approver cd.';


COMMENT ON COLUMN MGVT_MST_MFG_INST.APRV_TM IS '承認日時 // #MA.TM // Approval date and time';


COMMENT ON COLUMN MGVT_MST_MFG_INST.APRV_RSN IS '承認理由 //  // Approval reason';


COMMENT ON COLUMN MGVT_MST_MFG_INST.MFG_APRV_ROLE_CD IS '製造承認役割ＣＤ // #MA.APRV_ROLE_CD // Mfg. approval role cd.';


COMMENT ON COLUMN MGVT_MST_MFG_INST.DISP_PD IS '印字用表示期限 //  // Display expiration for print';


COMMENT ON COLUMN MGVT_MST_MFG_INST.INST_DPT_CD IS '指図部門ＣＤ // #MA.DPT_CD // Order dept. cd.';


COMMENT ON COLUMN MGVT_MST_MFG_INST.INST_USR_CD IS '指図担当者ＣＤ // #MA.USR_CD // Order PIC cd.';


COMMENT ON COLUMN MGVT_MST_MFG_INST.CAN_FLG IS '取消ＦＬＧ // #MA.FLG // Cancel flg.';


COMMENT ON COLUMN MGVT_MST_MFG_INST.ABORT_FLG IS '打切ＦＬＧ // #MA.FLG // Cancel remaining flg.';


COMMENT ON COLUMN MGVT_MST_MFG_INST.SCHD_CHG_FLG IS '計画変更ＦＬＧ // #MA.FLG // Plan changed flg.';


COMMENT ON COLUMN MGVT_MST_MFG_INST.PO_LOCKED_FLG IS '発注訂正・取消不可ＦＬＧ // #MA.FLG // Do not allow PO correction/cancel flg.';


COMMENT ON COLUMN MGVT_MST_MFG_INST.PO_AUTO_REG_FLG IS '発注時自動作成ＦＬＧ // #MA.FLG // Auto-creation at PO flg.';


COMMENT ON COLUMN MGVT_MST_MFG_INST.MFG_INST_UNIT_TYP IS '製造指図単位区分 // #MA.MFG_INST_UNIT_TYP // Mfg. order unit type';


COMMENT ON COLUMN MGVT_MST_MFG_INST.INTR_RMRKS IS '内部備考 //  // Internal remarks';


COMMENT ON COLUMN MGVT_MST_MFG_INST.INST_RPT_RMRKS IS '指図書備考 //  // Order sheet remarks';


COMMENT ON COLUMN MGVT_MST_MFG_INST.INST_PO_CNT_RMRKS IS '指図・発注連絡備考 //  // Order/PO contact remarks';


COMMENT ON COLUMN MGVT_MST_MFG_INST.SUB_CHAR1 IS '予備１ //  // Spare 1';


COMMENT ON COLUMN MGVT_MST_MFG_INST.SUB_CHAR2 IS '予備２ //  // Spare 2';


COMMENT ON COLUMN MGVT_MST_MFG_INST.SUB_CHAR3 IS '予備３ //  // Spare 3';


COMMENT ON COLUMN MGVT_MST_MFG_INST.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MGVT_MST_MFG_INST.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MGVT_MST_MFG_INST.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MGVT_MST_MFG_INST.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MGVT_MST_MFG_INST.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MGVT_MST_MFG_INST.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MGVT_MST_MFG_INST.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MGVT_MST_MFG_INST.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MGVT_MST_MFG_INST.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MGVT_MST_MFG_INST.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

