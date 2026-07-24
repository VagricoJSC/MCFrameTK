\encoding UTF-8

COMMENT ON VIEW mam_stk_rpl IS '在庫補充マスタ // Inventory replenishment master';


COMMENT ON COLUMN mam_stk_rpl.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mam_stk_rpl.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mam_stk_rpl.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mam_stk_rpl.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mam_stk_rpl.loc_cd IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN mam_stk_rpl.st_dt IS '適用開始日 // #MA.DT // Application start date';


COMMENT ON COLUMN mam_stk_rpl.end_dt IS '適用終了日 // #MA.DT // Application end date';


COMMENT ON COLUMN mam_stk_rpl.buf_qty IS '安全在庫数量 // #MA.QTY // Fluctuation inventory qty.';


COMMENT ON COLUMN mam_stk_rpl.rord_stk_qty IS '発注点在庫数量 // #MA.QTY // Reorder point inventory qty.';


COMMENT ON COLUMN mam_stk_rpl.gi_schd_flg IS '出庫予定含むＦＬＧ // #MA.FLG // GI schedule including flg.';


COMMENT ON COLUMN mam_stk_rpl.rord_rqst_qty IS '発注点依頼数量 // #MA.QTY // Reorder point request qty.';


COMMENT ON COLUMN mam_stk_rpl.lot_sizing_flg IS 'ロットサイジングＦＬＧ // #MA.FLG // Lot sizing flg.';


COMMENT ON COLUMN mam_stk_rpl.gi_loc_cd IS '発注点出庫場所ＣＤ // #MA.LOC_CD // GI location at reorder point cd.';


COMMENT ON COLUMN mam_stk_rpl.gi_str_ln_cd IS '発注点出庫棚・ラインＣＤ // #MA.STR_LN_CD // GI rack/line at reorder point cd.';


COMMENT ON COLUMN mam_stk_rpl.inpt_gi_loc_cd IS '投入品出庫場所ＣＤ // #MA.LOC_CD // Input item GI location cd.';


COMMENT ON COLUMN mam_stk_rpl.inpt_gi_str_ln_cd IS '投入品出庫棚・ラインＣＤ // #MA.STR_LN_CD // Input item GI rack/line cd.';


COMMENT ON COLUMN mam_stk_rpl.ship_gi_loc_cd IS '出荷品出庫場所ＣＤ // #MA.LOC_CD // Shipping item GI location cd.';


COMMENT ON COLUMN mam_stk_rpl.ship_gi_str_ln_cd IS '出荷品出庫棚・ラインＣＤ // #MA.STR_LN_CD // Shipping item GI rack/line cd.';


COMMENT ON COLUMN mam_stk_rpl.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_stk_rpl.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_stk_rpl.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_stk_rpl.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_stk_rpl.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_stk_rpl.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_stk_rpl.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_stk_rpl.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_stk_rpl.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_stk_rpl.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_stk_rpl.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_stk_rpl.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_stk_rpl.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_stk_rpl.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_stk_rpl.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_stk_rpl.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_stk_rpl.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

