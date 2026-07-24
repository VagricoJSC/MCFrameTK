\encoding UTF-8

COMMENT ON VIEW mgvt_mst_oper_inst IS '工程指図ビュー // Operation order view';


COMMENT ON COLUMN mgvt_mst_oper_inst.oper_inst_no IS '工程指図ＮＯ // #MA.OPER_INST_NO // Operation order No.';


COMMENT ON COLUMN mgvt_mst_oper_inst.mfg_inst_no IS '製造指図ＮＯ // #MA.MFG_INST_NO // Mfg. order No.';


COMMENT ON COLUMN mgvt_mst_oper_inst.itm_mfg_inst_no IS '品目製造指図ＮＯ // #MA.ITM_MFG_INST_NO // Item mfg. order No.';


COMMENT ON COLUMN mgvt_mst_oper_inst.oper_ord_no IS '工程オーダＮＯ // #MA.OPER_ORD_NO // Operation order No.';


COMMENT ON COLUMN mgvt_mst_oper_inst.disp_seq IS '工順 // #MA.INT // Routing';


COMMENT ON COLUMN mgvt_mst_oper_inst.oper_cd IS '工程ＣＤ // #MA.OPER_CD // Operation cd.';


COMMENT ON COLUMN mgvt_mst_oper_inst.oper_seq IS '工程連番 // #MA.OPER_SEQ // Operation sequence number';


COMMENT ON COLUMN mgvt_mst_oper_inst.st_schd_tm IS '着手予定日時 // #MA.TM // Scheduled start date and time';


COMMENT ON COLUMN mgvt_mst_oper_inst.end_schd_tm IS '終了予定日時 // #MA.TM // Scheduled end date and time';


COMMENT ON COLUMN mgvt_mst_oper_inst.oper_loc_cd IS '工程場所ＣＤ // #MA.LOC_CD // Operation location cd.';


COMMENT ON COLUMN mgvt_mst_oper_inst.oper_str_ln_cd IS '工程棚・ラインＣＤ // #MA.STR_LN_CD // Operation rack/line cd.';


COMMENT ON COLUMN mgvt_mst_oper_inst.base_unit_qty IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN mgvt_mst_oper_inst.base_unit_cd IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN mgvt_mst_oper_inst.oper_std_qty IS '工程基準単位数量 // #MA.QTY // Operation base unit qty.';


COMMENT ON COLUMN mgvt_mst_oper_inst.oper_conv_qty IS '工程換算単位数量 // #MA.QTY // Operation conversion unit qty.';


COMMENT ON COLUMN mgvt_mst_oper_inst.oper_unit_cd IS '工程単位ＣＤ // #MA.UNIT_CD // Operation unit cd.';


COMMENT ON COLUMN mgvt_mst_oper_inst.oper_unit_conv_rnd_typ IS '工程換算端数処理区分 // #MA.RND_TYP // Operation conversion rounding type';


COMMENT ON COLUMN mgvt_mst_oper_inst.oper_unit_dec_place IS '工程単位小数部有効桁数 // #MA.DEC_PLACE // Operation unit number of decimal places';


COMMENT ON COLUMN mgvt_mst_oper_inst.unschd_inst_flg IS '計画外指図ＦＬＧ // #MA.FLG // Unplanned order flg.';


COMMENT ON COLUMN mgvt_mst_oper_inst.unschd_act_flg IS '計画外実績ＦＬＧ // #MA.FLG // Unplanned result flg.';


COMMENT ON COLUMN mgvt_mst_oper_inst.bkf_flg IS 'バックフラッシュ許可ＦＬＧ // #MA.FLG // Allow backflush flg.';


COMMENT ON COLUMN mgvt_mst_oper_inst.wk_cost_calc_flg IS '自動工数計算ＦＬＧ // #MA.FLG // Auto man-hour calculation flg.';


COMMENT ON COLUMN mgvt_mst_oper_inst.oper_inst_grp IS '工程指図グループ // #MA.OPER_INST_GRP // Operation order group';


COMMENT ON COLUMN mgvt_mst_oper_inst.usr_cd IS '担当者ＣＤ // #MA.USR_CD // PIC cd.';


COMMENT ON COLUMN mgvt_mst_oper_inst.oper_lt IS '工程ＬＴ // #MA.LT // Operation LT';


COMMENT ON COLUMN mgvt_mst_oper_inst.oper_lt_add_qty IS '工程ＬＴ加算基準数量 // #MA.QTY // Operation LT add base qty.';


COMMENT ON COLUMN mgvt_mst_oper_inst.oper_offst_typ IS '工程オフセット区分 // #MA.OFFST_TYP // Operation offset type';


COMMENT ON COLUMN mgvt_mst_oper_inst.oper_offst IS '工程オフセット // #MA.OFFST // Operation offset';


COMMENT ON COLUMN mgvt_mst_oper_inst.oper_offst_add_qty IS '工程オフセット加算基準数量 // #MA.QTY // Operation offset add base qty.';


COMMENT ON COLUMN mgvt_mst_oper_inst.lmt_fr_dt_flg IS '期限起算日使用工程ＦＬＧ // #MA.FLG // Expiration base date use operation flg.';


COMMENT ON COLUMN mgvt_mst_oper_inst.oper_lower_yield IS '工程下限収率 // #MA.YIELD // Operation min. yield';


COMMENT ON COLUMN mgvt_mst_oper_inst.oper_std_yield IS '工程標準収率 // #MA.YIELD // Operation standard yield';


COMMENT ON COLUMN mgvt_mst_oper_inst.oper_upper_yield IS '工程上限収率 // #MA.YIELD // Operation max. yield';


COMMENT ON COLUMN mgvt_mst_oper_inst.wip_rate IS '仕掛進捗度 // #MA.RATE // WIP progress';


COMMENT ON COLUMN mgvt_mst_oper_inst.yield_oper_flg IS '出来高計上工程ＦＬＧ // #MA.FLG // Create inventory flg.';


COMMENT ON COLUMN mgvt_mst_oper_inst.yield_oper_ratio IS '出来高工程比率 // #MA.YIELD_OPER_RATIO // Output operation ratio';


COMMENT ON COLUMN mgvt_mst_oper_inst.can_flg IS '取消ＦＬＧ // #MA.FLG // Cancel flg.';


COMMENT ON COLUMN mgvt_mst_oper_inst.oper_abort_flg IS '工程打切ＦＬＧ // #MA.FLG // Cancel remaining operation flg.';


COMMENT ON COLUMN mgvt_mst_oper_inst.mes_flg IS 'ＭＥＳＦＬＧ // #MA.FLG // MES flg.';


COMMENT ON COLUMN mgvt_mst_oper_inst.intr_rmrks IS '内部備考 //  // Internal remarks';


COMMENT ON COLUMN mgvt_mst_oper_inst.inst_rpt_rmrks IS '指図書備考 //  // Order sheet remarks';


COMMENT ON COLUMN mgvt_mst_oper_inst.sub_char1 IS '予備１ //  // Spare 1';


COMMENT ON COLUMN mgvt_mst_oper_inst.sub_char2 IS '予備２ //  // Spare 2';


COMMENT ON COLUMN mgvt_mst_oper_inst.sub_char3 IS '予備３ //  // Spare 3';


COMMENT ON COLUMN mgvt_mst_oper_inst.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mgvt_mst_oper_inst.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mgvt_mst_oper_inst.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mgvt_mst_oper_inst.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mgvt_mst_oper_inst.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mgvt_mst_oper_inst.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mgvt_mst_oper_inst.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mgvt_mst_oper_inst.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mgvt_mst_oper_inst.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mgvt_mst_oper_inst.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

