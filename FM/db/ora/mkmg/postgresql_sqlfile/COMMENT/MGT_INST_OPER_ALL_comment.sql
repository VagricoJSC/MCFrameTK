\encoding UTF-8

COMMENT ON TABLE mgt_inst_oper_all IS '指図工程情報 // Order operation info.';


COMMENT ON COLUMN mgt_inst_oper_all.calc_ctg_cd IS '計算カテゴリＣＤ // #MA.CALC_CTG_CD // Calculation category cd.';


COMMENT ON COLUMN mgt_inst_oper_all.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mgt_inst_oper_all.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mgt_inst_oper_all.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mgt_inst_oper_all.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mgt_inst_oper_all.itm_mfg_inst_no IS '品目製造指図ＮＯ // #MA.ITM_MFG_INST_NO // Item mfg. order No.';


COMMENT ON COLUMN mgt_inst_oper_all.mfg_act_no IS '製造実績ＮＯ // #MA.MFG_ACT_NO // Mfg. result No.';


COMMENT ON COLUMN mgt_inst_oper_all.oper_act_no IS '工程実績ＮＯ // #MA.OPER_ACT_NO // Operation result No.';


COMMENT ON COLUMN mgt_inst_oper_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mgt_inst_oper_all.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mgt_inst_oper_all.mng_dpt_cd IS '管理部門ＣＤ // #MA.COST_DPT_CD // Management dept. cd.';


COMMENT ON COLUMN mgt_inst_oper_all.oper_cd IS '工程ＣＤ // #MA.OPER_CD // Operation cd.';


COMMENT ON COLUMN mgt_inst_oper_all.oper_seq IS '工程連番 // #MA.OPER_SEQ // Operation sequence number';


COMMENT ON COLUMN mgt_inst_oper_all.disp_seq IS '工順 // #MA.INT // Routing';


COMMENT ON COLUMN mgt_inst_oper_all.qty IS '数量 // #MA.QTY // Quantity';


COMMENT ON COLUMN mgt_inst_oper_all.schd_st_dt IS '着手予定日 // #MA.DT // Scheduled start date';


COMMENT ON COLUMN mgt_inst_oper_all.schd_end_dt IS '終了予定日 // #MA.DT // Scheduled end date';


COMMENT ON COLUMN mgt_inst_oper_all.act_st_dt IS '着手実績日 // #MA.DT // Actual start date';


COMMENT ON COLUMN mgt_inst_oper_all.act_end_dt IS '終了実績日 // #MA.DT // Actual end date';


COMMENT ON COLUMN mgt_inst_oper_all.rmrks IS '備考 // #MG.INST_OPER_RMRKS // Remarks';


COMMENT ON COLUMN mgt_inst_oper_all.sub_char1 IS '予備１ // #MG.INST_OPER_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mgt_inst_oper_all.sub_char2 IS '予備２ // #MG.INST_OPER_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mgt_inst_oper_all.sub_char3 IS '予備３ // #MG.INST_OPER_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mgt_inst_oper_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mgt_inst_oper_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mgt_inst_oper_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mgt_inst_oper_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mgt_inst_oper_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mgt_inst_oper_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mgt_inst_oper_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mgt_inst_oper_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mgt_inst_oper_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mgt_inst_oper_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

