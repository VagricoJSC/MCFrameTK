
COMMENT ON TABLE MST_XFR_ACT IS '移動実績ヘッダ // Movement result header';


COMMENT ON COLUMN MST_XFR_ACT.XFR_ACT_NO IS '移動実績ＮＯ // #MA.XFR_ACT_NO // Movement result No.';


COMMENT ON COLUMN MST_XFR_ACT.XFR_INST_NO IS '移動指図ＮＯ // #MA.XFR_INST_NO // Movement order No.';


COMMENT ON COLUMN MST_XFR_ACT.TRD_CD IS '取引ＣＤ // #MA.TRD_CD // Transaction cd.';


COMMENT ON COLUMN MST_XFR_ACT.TRD_PTN_TYP IS '取引パタン区分 // #MA.TRD_PTN_TYP // Transaction pattern type';


COMMENT ON COLUMN MST_XFR_ACT.WG_CD IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN MST_XFR_ACT.LG_GRP_CD IS '物流グループＣＤ // #MA.LG_GRP_CD // Distribution group cd.';


COMMENT ON COLUMN MST_XFR_ACT.GR_LOC_CD IS '入庫場所ＣＤ // #MA.LOC_CD // GR location cd.';


COMMENT ON COLUMN MST_XFR_ACT.GR_STK_ARRV_BP_CD IS '入庫在庫着荷先ＣＤ // #MA.BP_CD // GR inventory arriving point cd.';


COMMENT ON COLUMN MST_XFR_ACT.XFR_DT IS '移動日 // #MA.DT // Movement day';


COMMENT ON COLUMN MST_XFR_ACT.AC_DT IS '計上日 // #MA.DT // Recording date';


COMMENT ON COLUMN MST_XFR_ACT.ACT_USR_CD IS '実施担当者ＣＤ // #MA.USR_CD // Implementation PIC cd.';


COMMENT ON COLUMN MST_XFR_ACT.ACT_DPT_CD IS '実施部門ＣＤ // #MA.DPT_CD // Implement dept. cd.';


COMMENT ON COLUMN MST_XFR_ACT.DLV_PRNT_FLG IS '納品書発行済ＦＬＧ // #MA.FLG // Delivery note issued flg.';


COMMENT ON COLUMN MST_XFR_ACT.DLV_PRNT_TM IS '納品書発行日時 // #MA.TM // Delivery note issue date and time';


COMMENT ON COLUMN MST_XFR_ACT.INTR_RMRKS IS '内部備考 // #MS.XFR_ACT_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN MST_XFR_ACT.TRD_RMRKS IS '取引備考 // #MA.TRD_RMRKS // Transaction remarks';


COMMENT ON COLUMN MST_XFR_ACT.SUB_CHAR1 IS '予備１ // #MS.XFR_ACT_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MST_XFR_ACT.SUB_CHAR2 IS '予備２ // #MS.XFR_ACT_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MST_XFR_ACT.SUB_CHAR3 IS '予備３ // #MS.XFR_ACT_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MST_XFR_ACT.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_XFR_ACT.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_XFR_ACT.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_XFR_ACT.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_XFR_ACT.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_XFR_ACT.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_XFR_ACT.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_XFR_ACT.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_XFR_ACT.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_XFR_ACT.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

