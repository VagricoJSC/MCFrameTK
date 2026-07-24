\encoding UTF-8

COMMENT ON VIEW mgt_st_wip IS '月初仕掛数 // Beginning WIP qty.';


COMMENT ON COLUMN mgt_st_wip.st_wip_key IS '月初仕掛キー // #MG.ROW_NO // Beginning WIP key';


COMMENT ON COLUMN mgt_st_wip.calc_grp_cd IS '計算グループＣＤ // #MA.CALC_GRP_CD // Calculation group cd.';


COMMENT ON COLUMN mgt_st_wip.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mgt_st_wip.ym IS '年月 // #MA.YM // Year month';


COMMENT ON COLUMN mgt_st_wip.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mgt_st_wip.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mgt_st_wip.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mgt_st_wip.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mgt_st_wip.itm_ext IS '品目拡張 // #MG.ITM_EXT // Item extension';


COMMENT ON COLUMN mgt_st_wip.itm_mfg_inst_no IS '品目製造指図ＮＯ // #MA.ITM_MFG_INST_NO // Item mfg. order No.';


COMMENT ON COLUMN mgt_st_wip.mfg_act_no IS '製造実績ＮＯ // #MA.MFG_ACT_NO // Mfg. result No.';


COMMENT ON COLUMN mgt_st_wip.oper_act_no IS '工程実績ＮＯ // #MA.OPER_ACT_NO // Operation result No.';


COMMENT ON COLUMN mgt_st_wip.loc_cd IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN mgt_st_wip.str_ln_cd IS 'ラインＣＤ // #MA.STR_LN_CD // Line cd.';


COMMENT ON COLUMN mgt_st_wip.oper_cd IS '工程ＣＤ // #MA.OPER_CD // Operation cd.';


COMMENT ON COLUMN mgt_st_wip.oper_seq IS '工程連番 // #MA.OPER_SEQ // Operation sequence number';


COMMENT ON COLUMN mgt_st_wip.wip_qty IS '仕掛数量 // #MA.QTY // WIP qty.';


COMMENT ON COLUMN mgt_st_wip.wip_per IS '仕掛進捗度 // #MA.RATE // WIP progress';


COMMENT ON COLUMN mgt_st_wip.rmrks IS '備考 // #MG.ST_WIP_RMRKS // Remarks';


COMMENT ON COLUMN mgt_st_wip.sub_char1 IS '予備１ // #MG.ST_WIP_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mgt_st_wip.sub_char2 IS '予備２ // #MG.ST_WIP_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mgt_st_wip.sub_char3 IS '予備３ // #MG.ST_WIP_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mgt_st_wip.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mgt_st_wip.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mgt_st_wip.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mgt_st_wip.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mgt_st_wip.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mgt_st_wip.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mgt_st_wip.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mgt_st_wip.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mgt_st_wip.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mgt_st_wip.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

