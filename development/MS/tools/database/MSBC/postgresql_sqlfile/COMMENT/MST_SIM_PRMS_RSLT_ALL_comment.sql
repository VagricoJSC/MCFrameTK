\encoding UTF-8

COMMENT ON TABLE mst_sim_prms_rslt_all IS '納期回答用シミュレーション結果 // Simulation result for order promising';


COMMENT ON COLUMN mst_sim_prms_rslt_all.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mst_sim_prms_rslt_all.wg_rqst_no IS 'ＷＧ間依頼ＮＯ // #MA.WG_RQST_NO // No. of inventory request from other WG';


COMMENT ON COLUMN mst_sim_prms_rslt_all.slo_d_no IS '受注明細ＮＯ // #MA.SLO_D_NO // Sales order details No.';


COMMENT ON COLUMN mst_sim_prms_rslt_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mst_sim_prms_rslt_all.sim_alloc_pln_typ IS 'シミュレーション引当予定区分 // #MS.SIM_ALLOC_PLN_TYP // Simulation allocation schedule type';


COMMENT ON COLUMN mst_sim_prms_rslt_all.sub_char1 IS '予備１ // #MS.SIM_PRMS_RSLT_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_sim_prms_rslt_all.sub_char2 IS '予備２ // #MS.SIM_PRMS_RSLT_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_sim_prms_rslt_all.sub_char3 IS '予備３ // #MS.SIM_PRMS_RSLT_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_sim_prms_rslt_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_sim_prms_rslt_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_sim_prms_rslt_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_sim_prms_rslt_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_sim_prms_rslt_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_sim_prms_rslt_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_sim_prms_rslt_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_sim_prms_rslt_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_sim_prms_rslt_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_sim_prms_rslt_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

