\encoding UTF-8

COMMENT ON VIEW mam_lot_inh_dest IS 'ロット継承先マスタ // Lot copy master (To)';


COMMENT ON COLUMN mam_lot_inh_dest.par_itm_cd IS '親品目ＣＤ // #MA.ITM_CD // Parent item cd.';


COMMENT ON COLUMN mam_lot_inh_dest.par_itm_sub1 IS '親枝番１ // #MA.ITM_SUB1 // Parent branch No. 1';


COMMENT ON COLUMN mam_lot_inh_dest.par_itm_sub2 IS '親枝番２ // #MA.ITM_SUB2 // Parent branch No. 2';


COMMENT ON COLUMN mam_lot_inh_dest.par_itm_sub3 IS '親枝番３ // #MA.ITM_SUB3 // Parent branch No. 3';


COMMENT ON COLUMN mam_lot_inh_dest.bom_ptn IS '構成パタン // #MA.BOM_PTN // BOM pattern';


COMMENT ON COLUMN mam_lot_inh_dest.lot_inh_col_typ IS '継承項目区分 // #MA.LOT_INH_COL_TYP // Copy column type';


COMMENT ON COLUMN mam_lot_inh_dest.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mam_lot_inh_dest.lot_inh_typ IS '継承方法区分 // #MA.LOT_INH_TYP // Copy method type';


COMMENT ON COLUMN mam_lot_inh_dest.add_concat_col IS '追加結合項目 // #MA.LOT_INH_COL_TYP // Additional join column';


COMMENT ON COLUMN mam_lot_inh_dest.overflow_err_flg IS '桁数超過時エラーＦＬＧ // #MA.FLG // Exceeding digits error flg.';


COMMENT ON COLUMN mam_lot_inh_dest.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_lot_inh_dest.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_lot_inh_dest.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_lot_inh_dest.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_lot_inh_dest.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_lot_inh_dest.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_lot_inh_dest.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_lot_inh_dest.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_lot_inh_dest.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_lot_inh_dest.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_lot_inh_dest.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_lot_inh_dest.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_lot_inh_dest.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_lot_inh_dest.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_lot_inh_dest.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_lot_inh_dest.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_lot_inh_dest.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

