\encoding UTF-8

COMMENT ON VIEW mst_sim_oper_order IS 'シミュレーション工程オーダ情報 // Simulation operation order info.';


COMMENT ON COLUMN mst_sim_oper_order.oper_ord_no IS '工程オーダＮＯ // #MA.OPER_ORD_NO // Operation order No.';


COMMENT ON COLUMN mst_sim_oper_order.st_schd_tm IS '工程着手予定日時 // #MA.TM // Scheduled operation start date and time';


COMMENT ON COLUMN mst_sim_oper_order.inst_st_schd_tm IS '工程着手予定日時（指図） // #MA.TM // Scheduled operation start date and time (Order)';


COMMENT ON COLUMN mst_sim_oper_order.act_st_tm IS '工程着手実績日時 // #MA.TM // Actual operation start date and time';


COMMENT ON COLUMN mst_sim_oper_order.end_schd_tm IS '工程終了予定日時 // #MA.TM // Scheduled operation end date and time';


COMMENT ON COLUMN mst_sim_oper_order.inst_end_schd_tm IS '工程終了予定日時（指図） // #MA.TM // Scheduled operation end date and time (Order)';


COMMENT ON COLUMN mst_sim_oper_order.act_end_tm IS '工程終了実績日時 // #MA.TM // Actual operation end date and time';


COMMENT ON COLUMN mst_sim_oper_order.oper_lt IS '工程ＬＴ // #MA.LT // Operation LT';


COMMENT ON COLUMN mst_sim_oper_order.act_oper_lt IS '工程ＬＴ（実績） // #MA.LT // Operation LT (Result)';


COMMENT ON COLUMN mst_sim_oper_order.oper_offst_typ IS '工程オフセット区分 // #MA.OFFST_TYP // Operation offset type';


COMMENT ON COLUMN mst_sim_oper_order.oper_offst IS '工程オフセット // #MA.OFFST // Operation offset';


COMMENT ON COLUMN mst_sim_oper_order.oper_schd_qty IS '工程指図予定数量 // #MA.QTY // Operation order scheduled qty.';


COMMENT ON COLUMN mst_sim_oper_order.not_oper_schd_qty IS '工程未指図数量 // #MA.QTY // Operation unordered qty.';


COMMENT ON COLUMN mst_sim_oper_order.itm_ord_no IS '品目オーダＮＯ // #MA.ITM_ORD_NO // Item order No.';


COMMENT ON COLUMN mst_sim_oper_order.disp_seq IS '工順 // #MA.INT // Routing';


COMMENT ON COLUMN mst_sim_oper_order.oper_ptn IS '工程パタン // #MA.OPER_PTN // Operation pattern';


COMMENT ON COLUMN mst_sim_oper_order.oper_cd IS '工程ＣＤ // #MA.OPER_CD // Operation cd.';


COMMENT ON COLUMN mst_sim_oper_order.oper_seq IS '工程連番 // #MA.OPER_SEQ // Operation sequence number';


COMMENT ON COLUMN mst_sim_oper_order.loc_cd IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN mst_sim_oper_order.oper_ord_sts_typ IS '工程オーダ状況区分 // #MS.OPER_ORD_STS_TYP // Operation order status type';


COMMENT ON COLUMN mst_sim_oper_order.itm_ord_sts_typ IS '品目オーダ状況区分 // #MS.ITM_ORD_STS_TYP // Item order status type';


COMMENT ON COLUMN mst_sim_oper_order.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mst_sim_oper_order.yield_oper_flg IS '出来高計上工程ＦＬＧ // #MA.FLG // Create inventory flg.';


COMMENT ON COLUMN mst_sim_oper_order.sim_mrp_no IS 'シミュレーションＮＯ // #MA.SIM_MRP_NO // Simulation No.';


COMMENT ON COLUMN mst_sim_oper_order.oper_rsrc IS '工程資源 // #MA.OPER_RSRC // Operation resources';


COMMENT ON COLUMN mst_sim_oper_order.intr_rmrks IS '内部備考 // #MS.OORDER_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN mst_sim_oper_order.sub_char1 IS '予備１ // #MS.OORDER_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_sim_oper_order.sub_char2 IS '予備２ // #MS.OORDER_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_sim_oper_order.sub_char3 IS '予備３ // #MS.OORDER_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_sim_oper_order.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_sim_oper_order.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_sim_oper_order.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_sim_oper_order.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_sim_oper_order.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_sim_oper_order.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_sim_oper_order.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_sim_oper_order.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_sim_oper_order.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_sim_oper_order.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

