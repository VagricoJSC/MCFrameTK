\encoding UTF-8

COMMENT ON VIEW mgvt_mst_sim_mrp IS 'シミュレーション管理情報ビュー // Simulation management info. view';


COMMENT ON COLUMN mgvt_mst_sim_mrp.sim_mrp_no IS 'シミュレーションＮＯ // #MA.SIM_MRP_NO // Simulation No.';


COMMENT ON COLUMN mgvt_mst_sim_mrp.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mgvt_mst_sim_mrp.sim_mrp_typ IS 'シミュレーションＭＲＰ区分 //  // Simulation MRP type';


COMMENT ON COLUMN mgvt_mst_sim_mrp.sim_usr_cd IS 'シミュレーション担当者ＣＤ // #MA.USR_CD // Simulation PIC cd.';


COMMENT ON COLUMN mgvt_mst_sim_mrp.dly_rqmt_flg IS '日次生産依頼 // #MA.FLG // Daily production request';


COMMENT ON COLUMN mgvt_mst_sim_mrp.stk_flg IS '在庫 // #MA.FLG // Inventory';


COMMENT ON COLUMN mgvt_mst_sim_mrp.gr_flg IS '入庫予定 // #MA.FLG // GR schedule';


COMMENT ON COLUMN mgvt_mst_sim_mrp.gi_flg IS '出庫予定(出荷予定除く) // #MA.FLG // GI schedule (Except shipping schedule)';


COMMENT ON COLUMN mgvt_mst_sim_mrp.ship_flg IS '出荷予定 // #MA.FLG // Shipping schedule';


COMMENT ON COLUMN mgvt_mst_sim_mrp.tree_lvl IS '階層 // #MA.TREE_LVL // Hierarchy';


COMMENT ON COLUMN mgvt_mst_sim_mrp.mrp_proc_dt IS 'ＭＲＰ実行日 // #MA.DT // MRP run date';


COMMENT ON COLUMN mgvt_mst_sim_mrp.intr_rmrks IS '内部備考 //  // Internal remarks';


COMMENT ON COLUMN mgvt_mst_sim_mrp.sub_char1 IS '予備１ //  // Spare 1';


COMMENT ON COLUMN mgvt_mst_sim_mrp.sub_char2 IS '予備２ //  // Spare 2';


COMMENT ON COLUMN mgvt_mst_sim_mrp.sub_char3 IS '予備３ //  // Spare 3';


COMMENT ON COLUMN mgvt_mst_sim_mrp.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mgvt_mst_sim_mrp.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mgvt_mst_sim_mrp.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mgvt_mst_sim_mrp.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mgvt_mst_sim_mrp.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mgvt_mst_sim_mrp.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mgvt_mst_sim_mrp.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mgvt_mst_sim_mrp.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mgvt_mst_sim_mrp.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mgvt_mst_sim_mrp.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

