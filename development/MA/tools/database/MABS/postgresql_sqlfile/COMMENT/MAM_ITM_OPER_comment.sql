\encoding UTF-8

COMMENT ON VIEW mam_itm_oper IS '品目工程マスタ // Item operation master';


COMMENT ON COLUMN mam_itm_oper.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mam_itm_oper.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mam_itm_oper.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mam_itm_oper.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mam_itm_oper.loc_cd IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN mam_itm_oper.oper_ptn IS '工程パタン // #MA.OPER_PTN // Operation pattern';


COMMENT ON COLUMN mam_itm_oper.oper_cd IS '工程ＣＤ // #MA.OPER_CD // Operation cd.';


COMMENT ON COLUMN mam_itm_oper.oper_seq IS '工程連番 // #MA.OPER_SEQ // Operation sequence number';


COMMENT ON COLUMN mam_itm_oper.st_dt IS '適用開始日 // #MA.DT // Application start date';


COMMENT ON COLUMN mam_itm_oper.end_dt IS '適用終了日 // #MA.DT // Application end date';


COMMENT ON COLUMN mam_itm_oper.disp_seq IS '工順 // #MA.INT // Routing';


COMMENT ON COLUMN mam_itm_oper.oper_lt IS '工程ＬＴ // #MA.LT // Operation LT';


COMMENT ON COLUMN mam_itm_oper.oper_lt_add_qty IS '工程ＬＴ加算基準数量 // #MA.QTY // Operation LT add base qty.';


COMMENT ON COLUMN mam_itm_oper.oper_offst_typ IS '工程オフセット区分 // #MA.OFFST_TYP // Operation offset type';


COMMENT ON COLUMN mam_itm_oper.oper_offst IS '工程オフセット // #MA.OFFST // Operation offset';


COMMENT ON COLUMN mam_itm_oper.oper_offst_add_qty IS '工程オフセット加算基準数量 // #MA.QTY // Operation offset add base qty.';


COMMENT ON COLUMN mam_itm_oper.oper_unit_cd IS '工程管理単位ＣＤ // #MA.UNIT_CD // Operation management unit cd.';


COMMENT ON COLUMN mam_itm_oper.oper_std_qty IS '工程基準単位数量 // #MA.QTY // Operation base unit qty.';


COMMENT ON COLUMN mam_itm_oper.oper_conv_qty IS '工程換算単位数量 // #MA.QTY // Operation conversion unit qty.';


COMMENT ON COLUMN mam_itm_oper.dec_place IS '小数部有効桁数 // #MA.DEC_PLACE // Number of decimal places';


COMMENT ON COLUMN mam_itm_oper.unit_conv_rnd_typ IS '換算端数処理区分 // #MA.RND_TYP // Rounding type (Conversion)';


COMMENT ON COLUMN mam_itm_oper.yield_oper_flg IS '出来高計上工程ＦＬＧ // #MA.FLG // Create inventory flg.';


COMMENT ON COLUMN mam_itm_oper.yield_oper_ratio IS '出来高工程比率 // #MA.YIELD_OPER_RATIO // Output operation ratio';


COMMENT ON COLUMN mam_itm_oper.oper_inst_grp IS '工程指図グループ // #MA.OPER_INST_GRP // Operation order group';


COMMENT ON COLUMN mam_itm_oper.oper_loc_cd IS '工程場所ＣＤ // #MA.LOC_CD // Operation location cd.';


COMMENT ON COLUMN mam_itm_oper.lmt_fr_dt_flg IS '期限起算日使用工程ＦＬＧ // #MA.FLG // Expiration base date use operation flg.';


COMMENT ON COLUMN mam_itm_oper.oper_lower_yield IS '工程下限収率 // #MA.YIELD // Operation min. yield';


COMMENT ON COLUMN mam_itm_oper.oper_std_yield IS '工程標準収率 // #MA.YIELD // Operation standard yield';


COMMENT ON COLUMN mam_itm_oper.oper_upper_yield IS '工程上限収率 // #MA.YIELD // Operation max. yield';


COMMENT ON COLUMN mam_itm_oper.wip_rate IS '仕掛進捗率 // #MA.RATE // WIP progress rate';


COMMENT ON COLUMN mam_itm_oper.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN mam_itm_oper.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN mam_itm_oper.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN mam_itm_oper.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN mam_itm_oper.not_cost_flg IS '原価対象外ＦＬＧ // #MA.FLG // Not costing flg.';


COMMENT ON COLUMN mam_itm_oper.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_itm_oper.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_itm_oper.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_itm_oper.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_itm_oper.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_itm_oper.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_itm_oper.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_itm_oper.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_itm_oper.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_itm_oper.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_itm_oper.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_itm_oper.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_itm_oper.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_itm_oper.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_itm_oper.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_itm_oper.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_itm_oper.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

