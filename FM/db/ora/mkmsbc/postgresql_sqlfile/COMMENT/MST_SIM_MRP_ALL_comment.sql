\encoding UTF-8

COMMENT ON TABLE mst_sim_mrp_all IS 'シミュレーション管理情報 // Simulation management info.';


COMMENT ON COLUMN mst_sim_mrp_all.sim_mrp_no IS 'シミュレーションＮＯ // #MA.SIM_MRP_NO // Simulation No.';


COMMENT ON COLUMN mst_sim_mrp_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mst_sim_mrp_all.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mst_sim_mrp_all.sim_mrp_typ IS 'シミュレーションＭＲＰ区分 // #MS.SIM_MRP_TYP // Simulation MRP type';


COMMENT ON COLUMN mst_sim_mrp_all.sim_usr_cd IS 'シミュレーション担当者ＣＤ // #MA.USR_CD // Simulation PIC cd.';


COMMENT ON COLUMN mst_sim_mrp_all.dly_rqmt_flg IS '日次生産依頼 // #MA.FLG // Daily production request';


COMMENT ON COLUMN mst_sim_mrp_all.stk_flg IS '在庫 // #MA.FLG // Inventory';


COMMENT ON COLUMN mst_sim_mrp_all.gr_flg IS '入庫予定 // #MA.FLG // GR schedule';


COMMENT ON COLUMN mst_sim_mrp_all.gi_flg IS '出庫予定(出荷予定除く) // #MA.FLG // GI schedule (Except shipping schedule)';


COMMENT ON COLUMN mst_sim_mrp_all.ship_flg IS '出荷予定 // #MA.FLG // Shipping schedule';


COMMENT ON COLUMN mst_sim_mrp_all.tree_lvl IS '階層 // #MA.TREE_LVL // Hierarchy';


COMMENT ON COLUMN mst_sim_mrp_all.mrp_proc_dt IS 'ＭＲＰ実行日 // #MA.DT // MRP run date';


COMMENT ON COLUMN mst_sim_mrp_all.intr_rmrks IS '内部備考 // #MS.SIM_MRP_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN mst_sim_mrp_all.sub_char1 IS '予備１ // #MS.SIM_MRP_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_sim_mrp_all.sub_char2 IS '予備２ // #MS.SIM_MRP_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_sim_mrp_all.sub_char3 IS '予備３ // #MS.SIM_MRP_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_sim_mrp_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_sim_mrp_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_sim_mrp_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_sim_mrp_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_sim_mrp_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_sim_mrp_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_sim_mrp_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_sim_mrp_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_sim_mrp_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_sim_mrp_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

