\encoding UTF-8

COMMENT ON VIEW mst_itm_lnk IS '品目オーダ順序情報 // Item order sequence info.';


COMMENT ON COLUMN mst_itm_lnk.itm_ord_no IS '品目オーダＮＯ // #MA.ITM_ORD_NO // Item order No.';


COMMENT ON COLUMN mst_itm_lnk.par_itm_ord_no IS '親品目オーダＮＯ // #MA.ITM_ORD_NO // Parent item order No.';


COMMENT ON COLUMN mst_itm_lnk.par_oper_ord_no IS '親工程オーダＮＯ // #MA.OPER_ORD_NO // Parent operation order No.';


COMMENT ON COLUMN mst_itm_lnk.sim_mrp_no IS 'シミュレーションＮＯ // #MA.SIM_MRP_NO // Simulation No.';


COMMENT ON COLUMN mst_itm_lnk.oper_ptn IS '工程パタン // #MA.OPER_PTN // Operation pattern';


COMMENT ON COLUMN mst_itm_lnk.oper_cd IS '工程ＣＤ // #MA.OPER_CD // Operation cd.';


COMMENT ON COLUMN mst_itm_lnk.oper_seq IS '工程連番 // #MA.OPER_SEQ // Operation sequence number';


COMMENT ON COLUMN mst_itm_lnk.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mst_itm_lnk.intr_rmrks IS '内部備考 // #MS.ITM_LNK_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN mst_itm_lnk.sub_char1 IS '予備１ // #MS.ITM_LNK_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_itm_lnk.sub_char2 IS '予備２ // #MS.ITM_LNK_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_itm_lnk.sub_char3 IS '予備３ // #MS.ITM_LNK_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_itm_lnk.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_itm_lnk.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_itm_lnk.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_itm_lnk.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_itm_lnk.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_itm_lnk.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_itm_lnk.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_itm_lnk.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_itm_lnk.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_itm_lnk.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

