
COMMENT ON TABLE MGVT_MST_MFG_ACT IS '製造実績ビュー // Mfg. result view';


COMMENT ON COLUMN MGVT_MST_MFG_ACT.MFG_ACT_NO IS '製造実績ＮＯ // #MA.MFG_ACT_NO // Mfg. result No.';


COMMENT ON COLUMN MGVT_MST_MFG_ACT.MFG_INST_NO IS '製造指図ＮＯ // #MA.MFG_INST_NO // Mfg. order No.';


COMMENT ON COLUMN MGVT_MST_MFG_ACT.DIV_SEQ IS '分割連番 //  // Split sequence number';


COMMENT ON COLUMN MGVT_MST_MFG_ACT.ITM_MFG_INST_NO IS '品目製造指図ＮＯ // #MA.ITM_MFG_INST_NO // Item mfg. order No.';


COMMENT ON COLUMN MGVT_MST_MFG_ACT.TRD_CD IS '取引ＣＤ // #MA.TRD_CD // Transaction cd.';


COMMENT ON COLUMN MGVT_MST_MFG_ACT.ST_ACT_TM IS '着手実績日時 // #MA.TM // Actual start date and time';


COMMENT ON COLUMN MGVT_MST_MFG_ACT.END_ACT_TM IS '終了実績日時 // #MA.TM // Actual end date and time';


COMMENT ON COLUMN MGVT_MST_MFG_ACT.BASE_UNIT_YIELD_QTY IS '基準単位良品数量 // #MA.QTY // Base unit conforming qty.';


COMMENT ON COLUMN MGVT_MST_MFG_ACT.BASE_UNIT_DFCT_QTY IS '基準単位不良数量 // #MA.QTY // Base unit defective qty.';


COMMENT ON COLUMN MGVT_MST_MFG_ACT.BASE_UNIT_CD IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN MGVT_MST_MFG_ACT.ST_AC_DT IS '着手計上日 // #MA.DT // Start recording date';


COMMENT ON COLUMN MGVT_MST_MFG_ACT.END_AC_DT IS '終了計上日 // #MA.DT // End recording date';


COMMENT ON COLUMN MGVT_MST_MFG_ACT.ITM_YIELD IS '品目実際収率 // #MA.YIELD // Item actual yield';


COMMENT ON COLUMN MGVT_MST_MFG_ACT.MFG_APRV_STS_TYP IS '製造承認状況区分 //  // Mfg. approval status type';


COMMENT ON COLUMN MGVT_MST_MFG_ACT.APRV_DT IS '承認日 // #MA.DT // Approval date';


COMMENT ON COLUMN MGVT_MST_MFG_ACT.APRV_DPT_CD IS '承認部門ＣＤ // #MA.DPT_CD // Approval dept. cd.';


COMMENT ON COLUMN MGVT_MST_MFG_ACT.APRV_USR_CD IS '承認者ＣＤ // #MA.USR_CD // Approver cd.';


COMMENT ON COLUMN MGVT_MST_MFG_ACT.APRV_TM IS '承認日時 // #MA.TM // Approval date and time';


COMMENT ON COLUMN MGVT_MST_MFG_ACT.APRV_RSN IS '承認理由 //  // Approval reason';


COMMENT ON COLUMN MGVT_MST_MFG_ACT.ACT_PRNT_FLG IS '製造記録書発行済ＦＬＧ // #MA.FLG // Mfg. record sheet issued flg.';


COMMENT ON COLUMN MGVT_MST_MFG_ACT.ACT_PRNT_TM IS '製造記録書発行日時 // #MA.TM // Mfg. record sheet issued date and time';


COMMENT ON COLUMN MGVT_MST_MFG_ACT.SEQ IS '製造記録書連番 // #MA.PRNT_SEQ // Mfg. record sheet sequence number';


COMMENT ON COLUMN MGVT_MST_MFG_ACT.ACT_DPT_CD IS '実績部門ＣＤ // #MA.DPT_CD // Result dept. cd.';


COMMENT ON COLUMN MGVT_MST_MFG_ACT.ACT_USR_CD IS '実績責任者ＣＤ // #MA.USR_CD // Result management PIC cd.';


COMMENT ON COLUMN MGVT_MST_MFG_ACT.ARR_PURC_AUTO_REG_FLG IS '入荷・仕入時自動作成ＦＬＧ // #MA.FLG // Auto-create flg. at receipt/purchase';


COMMENT ON COLUMN MGVT_MST_MFG_ACT.INTR_RMRKS IS '内部備考 //  // Internal remarks';


COMMENT ON COLUMN MGVT_MST_MFG_ACT.ACT_RPT_RMRKS IS '記録書備考 //  // Record sheet remarks';


COMMENT ON COLUMN MGVT_MST_MFG_ACT.SUB_CHAR1 IS '予備１ //  // Spare 1';


COMMENT ON COLUMN MGVT_MST_MFG_ACT.SUB_CHAR2 IS '予備２ //  // Spare 2';


COMMENT ON COLUMN MGVT_MST_MFG_ACT.SUB_CHAR3 IS '予備３ //  // Spare 3';


COMMENT ON COLUMN MGVT_MST_MFG_ACT.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MGVT_MST_MFG_ACT.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MGVT_MST_MFG_ACT.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MGVT_MST_MFG_ACT.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MGVT_MST_MFG_ACT.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MGVT_MST_MFG_ACT.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MGVT_MST_MFG_ACT.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MGVT_MST_MFG_ACT.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MGVT_MST_MFG_ACT.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MGVT_MST_MFG_ACT.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

