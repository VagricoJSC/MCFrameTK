
COMMENT ON TABLE MST_XFR_INST IS '移動指図ヘッダ // Movement order header';


COMMENT ON COLUMN MST_XFR_INST.XFR_INST_NO IS '移動指図ＮＯ // #MA.XFR_INST_NO // Movement order No.';


COMMENT ON COLUMN MST_XFR_INST.TRD_CD IS '取引ＣＤ // #MA.TRD_CD // Transaction cd.';


COMMENT ON COLUMN MST_XFR_INST.TRD_PTN_TYP IS '取引パタン区分 // #MA.TRD_PTN_TYP // Transaction pattern type';


COMMENT ON COLUMN MST_XFR_INST.WG_CD IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN MST_XFR_INST.LG_GRP_CD IS '物流グループＣＤ // #MA.LG_GRP_CD // Distribution group cd.';


COMMENT ON COLUMN MST_XFR_INST.GR_LOC_CD IS '入庫場所ＣＤ // #MA.LOC_CD // GR location cd.';


COMMENT ON COLUMN MST_XFR_INST.GR_STK_ARRV_BP_CD IS '入庫在庫着荷先ＣＤ // #MA.BP_CD // GR inventory arriving point cd.';


COMMENT ON COLUMN MST_XFR_INST.XFR_SCHD_DT IS '移動予定日 // #MA.DT // Scheduled movement date';


COMMENT ON COLUMN MST_XFR_INST.XFR_INST_DT IS '移動指図日 // #MA.DT // Movement order date';


COMMENT ON COLUMN MST_XFR_INST.INST_USR_CD IS '指図担当者ＣＤ // #MA.USR_CD // Order PIC cd.';


COMMENT ON COLUMN MST_XFR_INST.INST_DPT_CD IS '指図部門ＣＤ // #MA.DPT_CD // Order dept. cd.';


COMMENT ON COLUMN MST_XFR_INST.INST_PRNT_FLG IS '指図書発行済ＦＬＧ // #MA.FLG // Order sheet issued flg.';


COMMENT ON COLUMN MST_XFR_INST.INST_PRNT_TM IS '指図書発行日時 // #MA.TM // Order sheet issued date and time';


COMMENT ON COLUMN MST_XFR_INST.PICK_PRNT_FLG IS 'ピッキングリスト発行済ＦＬＧ // #MA.FLG // Picking list issued flg.';


COMMENT ON COLUMN MST_XFR_INST.PICK_PRNT_TM IS 'ピッキングリスト発行日時 // #MA.TM // Picking list issue date and time';


COMMENT ON COLUMN MST_XFR_INST.DLV_PRNT_FLG IS '納品書発行済ＦＬＧ // #MA.FLG // Delivery note issued flg.';


COMMENT ON COLUMN MST_XFR_INST.DLV_PRNT_TM IS '納品書発行日時 // #MA.TM // Delivery note issue date and time';


COMMENT ON COLUMN MST_XFR_INST.TRD_RMRKS IS '取引備考 // #MA.TRD_RMRKS // Transaction remarks';


COMMENT ON COLUMN MST_XFR_INST.INST_RMRKS IS '指図備考 // #MS.XFR_INST_RMRKS // Order remarks';


COMMENT ON COLUMN MST_XFR_INST.INTR_RMRKS IS '内部備考 // #MS.XFR_INST_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN MST_XFR_INST.SUB_CHAR1 IS '予備１ // #MS.XFR_INST_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MST_XFR_INST.SUB_CHAR2 IS '予備２ // #MS.XFR_INST_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MST_XFR_INST.SUB_CHAR3 IS '予備３ // #MS.XFR_INST_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MST_XFR_INST.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_XFR_INST.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_XFR_INST.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_XFR_INST.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_XFR_INST.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_XFR_INST.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_XFR_INST.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_XFR_INST.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_XFR_INST.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_XFR_INST.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

