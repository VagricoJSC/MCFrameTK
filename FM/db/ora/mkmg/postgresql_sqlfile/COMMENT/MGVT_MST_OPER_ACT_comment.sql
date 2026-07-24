\encoding UTF-8

COMMENT ON VIEW mgvt_mst_oper_act IS '工程実績ビュー // Operation result view';


COMMENT ON COLUMN mgvt_mst_oper_act.oper_act_no IS '工程実績ＮＯ // #MA.OPER_ACT_NO // Operation result No.';


COMMENT ON COLUMN mgvt_mst_oper_act.mfg_act_no IS '製造実績ＮＯ // #MA.MFG_ACT_NO // Mfg. result No.';


COMMENT ON COLUMN mgvt_mst_oper_act.itm_mfg_inst_no IS '品目製造指図ＮＯ // #MA.ITM_MFG_INST_NO // Item mfg. order No.';


COMMENT ON COLUMN mgvt_mst_oper_act.oper_inst_no IS '工程指図ＮＯ // #MA.OPER_INST_NO // Operation order No.';


COMMENT ON COLUMN mgvt_mst_oper_act.div_seq IS '分割連番 //  // Split sequence number';


COMMENT ON COLUMN mgvt_mst_oper_act.arr_act_no IS '入荷実績ＮＯ // #MA.ARR_ACT_NO // Receipt result No.';


COMMENT ON COLUMN mgvt_mst_oper_act.purc_act_io_no IS '仕入実績受払ＮＯ // #MA.PURC_ACT_IO_NO // Purchase result GR/GI No.';


COMMENT ON COLUMN mgvt_mst_oper_act.disp_seq IS '工順 // #MA.INT // Routing';


COMMENT ON COLUMN mgvt_mst_oper_act.st_act_tm IS '着手実績日時 // #MA.TM // Actual start date and time';


COMMENT ON COLUMN mgvt_mst_oper_act.end_act_tm IS '終了実績日時 // #MA.TM // Actual end date and time';


COMMENT ON COLUMN mgvt_mst_oper_act.base_unit_qty IS '基準単位実績数量 // #MA.QTY // Base unit result qty.';


COMMENT ON COLUMN mgvt_mst_oper_act.base_unit_cd IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN mgvt_mst_oper_act.oper_unit_qty IS '工程単位実績数量 // #MA.QTY // Operation unit result qty.';


COMMENT ON COLUMN mgvt_mst_oper_act.oper_unit_cd IS '工程単位ＣＤ // #MA.UNIT_CD // Operation unit cd.';


COMMENT ON COLUMN mgvt_mst_oper_act.bkf_ctl_flg IS 'バックフラッシュ更新許可ＦＬＧ // #MA.FLG // Allow backflush update flg.';


COMMENT ON COLUMN mgvt_mst_oper_act.wk_cost_calc_ctl_flg IS '自動工数計算更新許可ＦＬＧ // #MA.FLG // Auto man-hour calculation update permission flg.';


COMMENT ON COLUMN mgvt_mst_oper_act.oper_yield IS '工程実際収率 // #MA.YIELD // Operation actual yield';


COMMENT ON COLUMN mgvt_mst_oper_act.bkf_not_ref_flg IS 'バックフラッシュ未反映ＦＬＧ // #MA.FLG // Not applied backflush flg.';


COMMENT ON COLUMN mgvt_mst_oper_act.data_no IS 'データＮＯ // #MA.IF_DATA_NO // Data No.';


COMMENT ON COLUMN mgvt_mst_oper_act.mes_id IS 'ＭＥＳＩＤ //  // MES ID';


COMMENT ON COLUMN mgvt_mst_oper_act.mes_flg IS 'ＭＥＳＦＬＧ // #MA.FLG // MES flg.';


COMMENT ON COLUMN mgvt_mst_oper_act.ext_sys_cd IS '外部システムＣＤ // #MA.EXT_SYS_CD // External system cd.';


COMMENT ON COLUMN mgvt_mst_oper_act.ext_oper_act_no IS '外部工程実績ＮＯ // #MA.EXT_OPER_ACT_NO // External operation result No.';


COMMENT ON COLUMN mgvt_mst_oper_act.if_auto_reg_flg IS 'ＩＦ自動作成ＦＬＧ // #MA.FLG // IF auto-create flg.';


COMMENT ON COLUMN mgvt_mst_oper_act.intr_rmrks IS '内部備考 //  // Internal remarks';


COMMENT ON COLUMN mgvt_mst_oper_act.act_rpt_rmrks IS '記録書備考 //  // Record sheet remarks';


COMMENT ON COLUMN mgvt_mst_oper_act.sub_char1 IS '予備１ //  // Spare 1';


COMMENT ON COLUMN mgvt_mst_oper_act.sub_char2 IS '予備２ //  // Spare 2';


COMMENT ON COLUMN mgvt_mst_oper_act.sub_char3 IS '予備３ //  // Spare 3';


COMMENT ON COLUMN mgvt_mst_oper_act.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mgvt_mst_oper_act.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mgvt_mst_oper_act.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mgvt_mst_oper_act.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mgvt_mst_oper_act.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mgvt_mst_oper_act.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mgvt_mst_oper_act.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mgvt_mst_oper_act.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mgvt_mst_oper_act.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mgvt_mst_oper_act.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

