\encoding UTF-8

COMMENT ON VIEW mgt_act_inst_wip_if IS '指図仕掛実績ＩＦ // In process order result IF';


COMMENT ON COLUMN mgt_act_inst_wip_if.data_lno IS 'データ行ＮＯ // #MA.IF_DATA_LNO // Data row No.';


COMMENT ON COLUMN mgt_act_inst_wip_if.calc_ctg_cd IS '計算カテゴリＣＤ // #MA.CALC_CTG_CD // Calculation category cd.';


COMMENT ON COLUMN mgt_act_inst_wip_if.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mgt_act_inst_wip_if.ym IS '年月 // #MA.YM // Year month';


COMMENT ON COLUMN mgt_act_inst_wip_if.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mgt_act_inst_wip_if.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mgt_act_inst_wip_if.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mgt_act_inst_wip_if.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mgt_act_inst_wip_if.itm_mfg_inst_no IS '品目製造指図ＮＯ // #MA.ITM_MFG_INST_NO // Item mfg. order No.';


COMMENT ON COLUMN mgt_act_inst_wip_if.mfg_act_no IS '製造実績ＮＯ // #MA.MFG_ACT_NO // Mfg. result No.';


COMMENT ON COLUMN mgt_act_inst_wip_if.oper_act_no IS '工程実績ＮＯ // #MA.OPER_ACT_NO // Operation result No.';


COMMENT ON COLUMN mgt_act_inst_wip_if.loc_cd IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN mgt_act_inst_wip_if.str_ln_cd IS 'ラインＣＤ // #MA.STR_LN_CD // Line cd.';


COMMENT ON COLUMN mgt_act_inst_wip_if.ac_rsn_cd IS '会計理由ＣＤ // #MA.AC_RSN_CD // Accounting reason cd.';


COMMENT ON COLUMN mgt_act_inst_wip_if.wip_qty IS '仕掛数量 // #MA.QTY // WIP qty.';


COMMENT ON COLUMN mgt_act_inst_wip_if.wip_per IS '仕掛進捗度 // #MA.RATE // WIP progress';


COMMENT ON COLUMN mgt_act_inst_wip_if.scm_if_flg IS 'ＳＣＭインターフェースＦＬＧ // #MA.FLG // SCM interface flg.';


COMMENT ON COLUMN mgt_act_inst_wip_if.rmrks IS '備考 // #MG.ACT_INST_WIP_IF_RMRKS // Remarks';


COMMENT ON COLUMN mgt_act_inst_wip_if.sub_char1 IS '予備１ // #MG.ACT_INST_WIP_IF_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mgt_act_inst_wip_if.sub_char2 IS '予備２ // #MG.ACT_INST_WIP_IF_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mgt_act_inst_wip_if.sub_char3 IS '予備３ // #MG.ACT_INST_WIP_IF_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mgt_act_inst_wip_if.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mgt_act_inst_wip_if.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mgt_act_inst_wip_if.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mgt_act_inst_wip_if.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mgt_act_inst_wip_if.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mgt_act_inst_wip_if.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mgt_act_inst_wip_if.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mgt_act_inst_wip_if.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mgt_act_inst_wip_if.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mgt_act_inst_wip_if.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

