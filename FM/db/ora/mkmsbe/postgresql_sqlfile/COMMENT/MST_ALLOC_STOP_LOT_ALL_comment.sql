\encoding UTF-8

COMMENT ON TABLE mst_alloc_stop_lot_all IS '引当禁止ロット情報 // Unallocatable lot info.';


COMMENT ON COLUMN mst_alloc_stop_lot_all.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mst_alloc_stop_lot_all.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mst_alloc_stop_lot_all.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mst_alloc_stop_lot_all.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mst_alloc_stop_lot_all.lot_no IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN mst_alloc_stop_lot_all.sublot_no IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN mst_alloc_stop_lot_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mst_alloc_stop_lot_all.stop_dt IS '禁止日 // #MA.DT // Prohibit date';


COMMENT ON COLUMN mst_alloc_stop_lot_all.stop_usr_cd IS '禁止登録者ＣＤ // #MA.USR_CD // Prohibit entry PIC cd.';


COMMENT ON COLUMN mst_alloc_stop_lot_all.stop_rmrks IS '禁止備考 // #MS.ALLOC_STOP_LOT_RMRKS // Prohibit remark';


COMMENT ON COLUMN mst_alloc_stop_lot_all.rel_dt IS '解除日 // #MA.DT // Release date';


COMMENT ON COLUMN mst_alloc_stop_lot_all.rel_usr_cd IS '解除登録者ＣＤ // #MA.USR_CD // Release entry PIC cd.';


COMMENT ON COLUMN mst_alloc_stop_lot_all.rel_rmrks IS '解除備考 // #MS.ALLOC_STOP_LOT_REL_RMRKS // Release remarks';


COMMENT ON COLUMN mst_alloc_stop_lot_all.sub_char1 IS '予備１ // #MS.ALLOC_STOP_LOT_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_alloc_stop_lot_all.sub_char2 IS '予備２ // #MS.ALLOC_STOP_LOT_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_alloc_stop_lot_all.sub_char3 IS '予備３ // #MS.ALLOC_STOP_LOT_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_alloc_stop_lot_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_alloc_stop_lot_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_alloc_stop_lot_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_alloc_stop_lot_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_alloc_stop_lot_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_alloc_stop_lot_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_alloc_stop_lot_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_alloc_stop_lot_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_alloc_stop_lot_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_alloc_stop_lot_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

