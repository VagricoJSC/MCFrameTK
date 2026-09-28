\encoding UTF-8

COMMENT ON VIEW mam_item_ship_comp IS '製品出荷構成マスタ // Item shipping configuration master';


COMMENT ON COLUMN mam_item_ship_comp.prod_itm_cd IS '製品ＣＤ // #MA.ITM_CD // ';


COMMENT ON COLUMN mam_item_ship_comp.prod_itm_sub1 IS '製品枝番１ // #MA.ITM_SUB1 // ';


COMMENT ON COLUMN mam_item_ship_comp.prod_itm_sub2 IS '製品枝番２ // #MA.ITM_SUB2 // ';


COMMENT ON COLUMN mam_item_ship_comp.prod_itm_sub3 IS '製品枝番３ // #MA.ITM_SUB3 // ';


COMMENT ON COLUMN mam_item_ship_comp.surv_line_qty IS '測線数 // #MA.SURV_LINE_QTY // ';


COMMENT ON COLUMN mam_item_ship_comp.diameter IS '口径 // #MA.DIAMETER // ';


COMMENT ON COLUMN mam_item_ship_comp.itm_cd IS '構成品目ＣＤ // #MA.ITM_CD // ';


COMMENT ON COLUMN mam_item_ship_comp.itm_sub1 IS '構成品目枝番１ // #MA.ITM_SUB1 // ';


COMMENT ON COLUMN mam_item_ship_comp.itm_sub2 IS '構成品目枝番２ // #MA.ITM_SUB2 // ';


COMMENT ON COLUMN mam_item_ship_comp.itm_sub3 IS '構成品目枝番３ // #MA.ITM_SUB3 // ';


COMMENT ON COLUMN mam_item_ship_comp.qty IS '数量 // #MA.QTY // ';


COMMENT ON COLUMN mam_item_ship_comp.spec_cd IS '仕様ＣＤ // #MA.TK_SPEC_CD // ';


COMMENT ON COLUMN mam_item_ship_comp.disp_seq IS '表示順 // #MA.DISP_SEQ // ';


COMMENT ON COLUMN mam_item_ship_comp.body_flg IS '本体ＦＬＧ // #MA.FLG // ';


COMMENT ON COLUMN mam_item_ship_comp.comp_flg IS '標準構成ＦＬＧ // #MA.FLG // ';


COMMENT ON COLUMN mam_item_ship_comp.ship_prnt_flg IS '出荷帳票出力対象ＦＬＧ // #MA.FLG // ';


COMMENT ON COLUMN mam_item_ship_comp.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_item_ship_comp.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_item_ship_comp.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_item_ship_comp.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_item_ship_comp.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_item_ship_comp.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_item_ship_comp.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_item_ship_comp.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_item_ship_comp.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_item_ship_comp.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_item_ship_comp.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_item_ship_comp.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_item_ship_comp.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_item_ship_comp.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_item_ship_comp.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_item_ship_comp.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_item_ship_comp.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

