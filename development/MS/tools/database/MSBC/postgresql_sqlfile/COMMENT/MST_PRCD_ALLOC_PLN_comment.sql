\encoding UTF-8

COMMENT ON VIEW mst_prcd_alloc_pln IS '先行手配引当予定情報 // Long LT allocation schedule info.';


COMMENT ON COLUMN mst_prcd_alloc_pln.rqmt_no IS '所要ＮＯ // #MA.RQMT_NO // Requirements No.';


COMMENT ON COLUMN mst_prcd_alloc_pln.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mst_prcd_alloc_pln.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mst_prcd_alloc_pln.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mst_prcd_alloc_pln.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mst_prcd_alloc_pln.ver_no IS '版ＮＯ // #MA.VER_NO // Version No.';


COMMENT ON COLUMN mst_prcd_alloc_pln.lot_no IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN mst_prcd_alloc_pln.sublot_no IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN mst_prcd_alloc_pln.loc_cd IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN mst_prcd_alloc_pln.io_schd_pr_no IS '受払進捗管理ＮＯ // #MA.IO_SCHD_PR_NO // GR/GI progress management No.';


COMMENT ON COLUMN mst_prcd_alloc_pln.schd_alloc_qty IS '引当予定数量 // #MA.QTY // Allocation scheduled qty.';


COMMENT ON COLUMN mst_prcd_alloc_pln.gi_schd_dt IS '出庫予定日 // #MA.DT // Scheduled GI date';


COMMENT ON COLUMN mst_prcd_alloc_pln.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN mst_prcd_alloc_pln.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN mst_prcd_alloc_pln.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN mst_prcd_alloc_pln.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN mst_prcd_alloc_pln.alloc_avl_dt IS '引当可能日 // #MA.DT // Allocatable date';


COMMENT ON COLUMN mst_prcd_alloc_pln.avl_qty IS '使用可能数量 // #MA.QTY // Available qty.';


COMMENT ON COLUMN mst_prcd_alloc_pln.lmt_dt IS '期限切れ日 // #MA.DT // Expired date';


COMMENT ON COLUMN mst_prcd_alloc_pln.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mst_prcd_alloc_pln.sim_mrp_no IS 'シミュレーションＮＯ // #MA.SIM_MRP_NO // Simulation No.';


COMMENT ON COLUMN mst_prcd_alloc_pln.intr_rmrks IS '内部備考 // #MS.ALLOC_PLN_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN mst_prcd_alloc_pln.sub_char1 IS '予備１ // #MS.ALLOC_PLN_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_prcd_alloc_pln.sub_char2 IS '予備２ // #MS.ALLOC_PLN_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_prcd_alloc_pln.sub_char3 IS '予備３ // #MS.ALLOC_PLN_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_prcd_alloc_pln.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_prcd_alloc_pln.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_prcd_alloc_pln.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_prcd_alloc_pln.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_prcd_alloc_pln.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_prcd_alloc_pln.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_prcd_alloc_pln.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_prcd_alloc_pln.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_prcd_alloc_pln.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_prcd_alloc_pln.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

