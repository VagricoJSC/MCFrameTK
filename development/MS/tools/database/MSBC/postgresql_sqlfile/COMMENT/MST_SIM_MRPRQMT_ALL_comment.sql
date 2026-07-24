\encoding UTF-8

COMMENT ON TABLE mst_sim_mrprqmt_all IS 'シミュレーションＭＲＰ所要情報 // Simulation MRP required info.';


COMMENT ON COLUMN mst_sim_mrprqmt_all.rqmt_no IS '所要ＮＯ // #MA.RQMT_NO // Requirements No.';


COMMENT ON COLUMN mst_sim_mrprqmt_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mst_sim_mrprqmt_all.mrp_rqmt_typ IS 'ＭＲＰ所要区分 // #MS.MRP_RQMT_TYP // MRP required type';


COMMENT ON COLUMN mst_sim_mrprqmt_all.itm_ord_no IS '品目オーダＮＯ // #MA.ITM_ORD_NO // Item order No.';


COMMENT ON COLUMN mst_sim_mrprqmt_all.oper_ord_no IS '工程オーダＮＯ // #MA.OPER_ORD_NO // Operation order No.';


COMMENT ON COLUMN mst_sim_mrprqmt_all.io_schd_typ IS '受払予定区分 // #MS.IO_SCHD_TYP // GR/GI schedule type';


COMMENT ON COLUMN mst_sim_mrprqmt_all.io_schd_sts_typ IS '受払予定状況区分 // #MS.IO_SCHD_STS_TYP // GR/GI schedule status type';


COMMENT ON COLUMN mst_sim_mrprqmt_all.io_schd_no IS '受払予定ＮＯ // #MA.IO_SCHD_NO // GR/GI schedule No.';


COMMENT ON COLUMN mst_sim_mrprqmt_all.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mst_sim_mrprqmt_all.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mst_sim_mrprqmt_all.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mst_sim_mrprqmt_all.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mst_sim_mrprqmt_all.ver_no IS '版ＮＯ // #MA.VER_NO // Version No.';


COMMENT ON COLUMN mst_sim_mrprqmt_all.loc_cd IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN mst_sim_mrprqmt_all.due_dt IS '納期 // #MA.DT // Due date';


COMMENT ON COLUMN mst_sim_mrprqmt_all.net_rqmt_qty IS '正味所要数量 // #MA.QTY // Net requirements qty.';


COMMENT ON COLUMN mst_sim_mrprqmt_all.alt_grp_cd IS '代替グループＣＤ // #MA.ALT_GRP_CD // Alternative group cd.';


COMMENT ON COLUMN mst_sim_mrprqmt_all.alt_grp_seq IS '代替グループ連番 // #MA.INT // Alternative group sequence number';


COMMENT ON COLUMN mst_sim_mrprqmt_all.alt_itm_typ IS '代替品目選択区分 // #MA.ALT_ITM_TYP // Alternative item selection type';


COMMENT ON COLUMN mst_sim_mrprqmt_all.alt_itm_ratio IS '代替品目比率 // #MA.ALT_ITM_RATIO // Alternative item ratio';


COMMENT ON COLUMN mst_sim_mrprqmt_all.alt_alloc_prio IS '代替品目引当優先順位 // #MA.INT // Alternative item allocation priority';


COMMENT ON COLUMN mst_sim_mrprqmt_all.oper_ptn IS '工程パタン // #MA.OPER_PTN // Operation pattern';


COMMENT ON COLUMN mst_sim_mrprqmt_all.oper_cd IS '工程ＣＤ // #MA.OPER_CD // Operation cd.';


COMMENT ON COLUMN mst_sim_mrprqmt_all.oper_seq IS '工程連番 // #MA.OPER_SEQ // Operation sequence number';


COMMENT ON COLUMN mst_sim_mrprqmt_all.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN mst_sim_mrprqmt_all.sno_typ1 IS '手配ＮＯ１区分 // #MA.SNO_TYP // SEIBAN No. 1 type';


COMMENT ON COLUMN mst_sim_mrprqmt_all.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN mst_sim_mrprqmt_all.sno_typ2 IS '手配ＮＯ２区分 // #MA.SNO_TYP // SEIBAN No. 2 type';


COMMENT ON COLUMN mst_sim_mrprqmt_all.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN mst_sim_mrprqmt_all.sno_typ3 IS '手配ＮＯ３区分 // #MA.SNO_TYP // SEIBAN No. 3 type';


COMMENT ON COLUMN mst_sim_mrprqmt_all.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN mst_sim_mrprqmt_all.sno_typ4 IS '手配ＮＯ４区分 // #MA.SNO_TYP // SEIBAN No. 4 type';


COMMENT ON COLUMN mst_sim_mrprqmt_all.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mst_sim_mrprqmt_all.inpt_ctl_typ IS '投入制御区分 // #MA.INPT_CTL_TYP // Input control type';


COMMENT ON COLUMN mst_sim_mrprqmt_all.mrp_proc_typ IS 'ＭＲＰ処理区分 // #MA.MRP_PROC_TYP // MRP process type';


COMMENT ON COLUMN mst_sim_mrprqmt_all.loc_lmt_flg IS '出庫場所限定ＦＬＧ // #MA.FLG // GI location limited flg.';


COMMENT ON COLUMN mst_sim_mrprqmt_all.sim_mrp_no IS 'シミュレーションＮＯ // #MA.SIM_MRP_NO // Simulation No.';


COMMENT ON COLUMN mst_sim_mrprqmt_all.intr_rmrks IS '内部備考 // #MS.MRQMT_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN mst_sim_mrprqmt_all.sub_char1 IS '予備１ // #MS.MRQMT_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_sim_mrprqmt_all.sub_char2 IS '予備２ // #MS.MRQMT_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_sim_mrprqmt_all.sub_char3 IS '予備３ // #MS.MRQMT_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_sim_mrprqmt_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_sim_mrprqmt_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_sim_mrprqmt_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_sim_mrprqmt_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_sim_mrprqmt_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_sim_mrprqmt_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_sim_mrprqmt_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_sim_mrprqmt_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_sim_mrprqmt_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_sim_mrprqmt_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

