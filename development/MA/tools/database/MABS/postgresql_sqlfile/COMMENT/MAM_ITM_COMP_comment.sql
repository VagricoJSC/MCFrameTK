\encoding UTF-8

COMMENT ON VIEW mam_itm_comp IS '品目構成マスタ // Item configuration master';


COMMENT ON COLUMN mam_itm_comp.core_itm_cd IS '主品目ＣＤ // #MA.ITM_CD // Main item cd.';


COMMENT ON COLUMN mam_itm_comp.core_itm_sub1 IS '主枝番１ // #MA.ITM_SUB1 // Main branch No. 1';


COMMENT ON COLUMN mam_itm_comp.core_itm_sub2 IS '主枝番２ // #MA.ITM_SUB2 // Main branch No. 2';


COMMENT ON COLUMN mam_itm_comp.core_itm_sub3 IS '主枝番３ // #MA.ITM_SUB3 // Main branch No. 3';


COMMENT ON COLUMN mam_itm_comp.comp_itm_cd IS '構成品目ＣＤ // #MA.ITM_CD // Component item cd.';


COMMENT ON COLUMN mam_itm_comp.comp_itm_sub1 IS '構成枝番１ // #MA.ITM_SUB1 // Configuration branch 1';


COMMENT ON COLUMN mam_itm_comp.comp_itm_sub2 IS '構成枝番２ // #MA.ITM_SUB2 // Configuration branch 2';


COMMENT ON COLUMN mam_itm_comp.comp_itm_sub3 IS '構成枝番３ // #MA.ITM_SUB3 // Configuration branch 3';


COMMENT ON COLUMN mam_itm_comp.core_itm_qty IS '主品目数量 // #MA.QTY // Main item qty.';


COMMENT ON COLUMN mam_itm_comp.comp_itm_unit_cd IS '構成品目単位ＣＤ // #MA.UNIT_CD // Component item unit cd.';


COMMENT ON COLUMN mam_itm_comp.comp_itm_qty IS '構成品目数量 // #MA.QTY // Component item qty.';


COMMENT ON COLUMN mam_itm_comp.itm_comp_grp_cd IS '品目構成グループＣＤ // #MA.ITM_COMP_GRP_CD // Item configuration group cd.';


COMMENT ON COLUMN mam_itm_comp.def_flg IS '通常構成ＦＬＧ // #MA.FLG // Normal configuration flg.';


COMMENT ON COLUMN mam_itm_comp.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_itm_comp.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_itm_comp.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_itm_comp.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_itm_comp.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_itm_comp.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_itm_comp.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_itm_comp.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_itm_comp.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_itm_comp.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_itm_comp.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_itm_comp.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_itm_comp.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_itm_comp.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_itm_comp.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_itm_comp.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_itm_comp.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

