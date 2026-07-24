\encoding UTF-8

COMMENT ON TABLE mst_sim_alloc_pln_all IS 'シミュレーション引当予定情報 // Simulation allocation schedule info.';


COMMENT ON COLUMN mst_sim_alloc_pln_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mst_sim_alloc_pln_all.rqmt_no IS '所要ＮＯ // #MA.RQMT_NO // Requirements No.';


COMMENT ON COLUMN mst_sim_alloc_pln_all.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mst_sim_alloc_pln_all.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mst_sim_alloc_pln_all.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mst_sim_alloc_pln_all.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mst_sim_alloc_pln_all.ver_no IS '版ＮＯ // #MA.VER_NO // Version No.';


COMMENT ON COLUMN mst_sim_alloc_pln_all.lot_no IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN mst_sim_alloc_pln_all.sublot_no IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN mst_sim_alloc_pln_all.loc_cd IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN mst_sim_alloc_pln_all.io_schd_pr_no IS '受払進捗管理ＮＯ // #MA.IO_SCHD_PR_NO // GR/GI progress management No.';


COMMENT ON COLUMN mst_sim_alloc_pln_all.schd_alloc_qty IS '引当予定数量 // #MA.QTY // Allocation scheduled qty.';


COMMENT ON COLUMN mst_sim_alloc_pln_all.gi_schd_dt IS '出庫予定日 // #MA.DT // Scheduled GI date';


COMMENT ON COLUMN mst_sim_alloc_pln_all.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN mst_sim_alloc_pln_all.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN mst_sim_alloc_pln_all.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN mst_sim_alloc_pln_all.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN mst_sim_alloc_pln_all.alloc_avl_dt IS '引当可能日 // #MA.DT // Allocatable date';


COMMENT ON COLUMN mst_sim_alloc_pln_all.avl_qty IS '使用可能数量 // #MA.QTY // Available qty.';


COMMENT ON COLUMN mst_sim_alloc_pln_all.lmt_dt IS '期限切れ日 // #MA.DT // Expired date';


COMMENT ON COLUMN mst_sim_alloc_pln_all.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mst_sim_alloc_pln_all.sim_mrp_no IS 'シミュレーションＮＯ // #MA.SIM_MRP_NO // Simulation No.';


COMMENT ON COLUMN mst_sim_alloc_pln_all.intr_rmrks IS '内部備考 // #MS.ALLOC_PLN_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN mst_sim_alloc_pln_all.sub_char1 IS '予備１ // #MS.ALLOC_PLN_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_sim_alloc_pln_all.sub_char2 IS '予備２ // #MS.ALLOC_PLN_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_sim_alloc_pln_all.sub_char3 IS '予備３ // #MS.ALLOC_PLN_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_sim_alloc_pln_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_sim_alloc_pln_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_sim_alloc_pln_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_sim_alloc_pln_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_sim_alloc_pln_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_sim_alloc_pln_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_sim_alloc_pln_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_sim_alloc_pln_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_sim_alloc_pln_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_sim_alloc_pln_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

