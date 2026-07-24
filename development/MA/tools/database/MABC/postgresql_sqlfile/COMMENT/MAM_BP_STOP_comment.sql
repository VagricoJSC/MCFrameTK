\encoding UTF-8

COMMENT ON VIEW mam_bp_stop IS '取引先禁止マスタ // BP prohibit master';


COMMENT ON COLUMN mam_bp_stop.bp_cd IS '取引先ＣＤ // #MA.BP_CD // BP cd.';


COMMENT ON COLUMN mam_bp_stop.slo_stop_dt IS '受注禁止日 // #MA.DT // Sales order prohibit date';


COMMENT ON COLUMN mam_bp_stop.po_stop_dt IS '発注禁止日 // #MA.DT // PO prohibit date';


COMMENT ON COLUMN mam_bp_stop.sls_stop_dt IS '売上・出荷禁止日 // #MA.DT // Sales/shipping prohibit date';


COMMENT ON COLUMN mam_bp_stop.purc_stop_dt IS '仕入・入荷禁止日 // #MA.DT // Purchase and receipt prohibit date';


COMMENT ON COLUMN mam_bp_stop.order_stop_dt IS '所要・オーダ禁止日 // #MA.DT // Requirements/order prohibit date';


COMMENT ON COLUMN mam_bp_stop.mfg_inst_stop_dt IS '製造指図禁止日 // #MA.DT // Mfg. order prohibit date';


COMMENT ON COLUMN mam_bp_stop.ship_inst_stop_dt IS '出荷指図禁止日 // #MA.DT // Shipping order prohibit date';


COMMENT ON COLUMN mam_bp_stop.xfr_stop_dt IS '移送・移動禁止日 // #MA.DT // Transport/movement prohibit date';


COMMENT ON COLUMN mam_bp_stop.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_bp_stop.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_bp_stop.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_bp_stop.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_bp_stop.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_bp_stop.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_bp_stop.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_bp_stop.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_bp_stop.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_bp_stop.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_bp_stop.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_bp_stop.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_bp_stop.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_bp_stop.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_bp_stop.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_bp_stop.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_bp_stop.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

