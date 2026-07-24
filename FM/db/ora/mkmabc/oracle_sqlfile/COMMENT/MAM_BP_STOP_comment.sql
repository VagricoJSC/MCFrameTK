
COMMENT ON TABLE MAM_BP_STOP IS '取引先禁止マスタ // BP prohibit master';


COMMENT ON COLUMN MAM_BP_STOP.BP_CD IS '取引先ＣＤ // #MA.BP_CD // BP cd.';


COMMENT ON COLUMN MAM_BP_STOP.SLO_STOP_DT IS '受注禁止日 // #MA.DT // Sales order prohibit date';


COMMENT ON COLUMN MAM_BP_STOP.PO_STOP_DT IS '発注禁止日 // #MA.DT // PO prohibit date';


COMMENT ON COLUMN MAM_BP_STOP.SLS_STOP_DT IS '売上・出荷禁止日 // #MA.DT // Sales/shipping prohibit date';


COMMENT ON COLUMN MAM_BP_STOP.PURC_STOP_DT IS '仕入・入荷禁止日 // #MA.DT // Purchase and receipt prohibit date';


COMMENT ON COLUMN MAM_BP_STOP.ORDER_STOP_DT IS '所要・オーダ禁止日 // #MA.DT // Requirements/order prohibit date';


COMMENT ON COLUMN MAM_BP_STOP.MFG_INST_STOP_DT IS '製造指図禁止日 // #MA.DT // Mfg. order prohibit date';


COMMENT ON COLUMN MAM_BP_STOP.SHIP_INST_STOP_DT IS '出荷指図禁止日 // #MA.DT // Shipping order prohibit date';


COMMENT ON COLUMN MAM_BP_STOP.XFR_STOP_DT IS '移送・移動禁止日 // #MA.DT // Transport/movement prohibit date';


COMMENT ON COLUMN MAM_BP_STOP.MEMO1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN MAM_BP_STOP.MEMO2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN MAM_BP_STOP.MEMO3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN MAM_BP_STOP.DEL_FLG IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN MAM_BP_STOP.DEL_USR_ID IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN MAM_BP_STOP.DEL_USR_NM IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN MAM_BP_STOP.DEL_TS IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN MAM_BP_STOP.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MAM_BP_STOP.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MAM_BP_STOP.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MAM_BP_STOP.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MAM_BP_STOP.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MAM_BP_STOP.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MAM_BP_STOP.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MAM_BP_STOP.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MAM_BP_STOP.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MAM_BP_STOP.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

