\encoding UTF-8

COMMENT ON VIEW mam_insp_spec IS '品目検査規格マスタ // Item inspection specific master';


COMMENT ON COLUMN mam_insp_spec.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mam_insp_spec.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mam_insp_spec.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mam_insp_spec.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mam_insp_spec.insp_ptn_cd IS '検査パタンＣＤ // #MA.INSP_PTN_CD // Inspection pattern cd.';


COMMENT ON COLUMN mam_insp_spec.insp_seq IS '検査順序 // #MA.INSP_SEQ // Inspection sequence';


COMMENT ON COLUMN mam_insp_spec.st_dt IS '適用開始日 // #MA.DT // Application start date';


COMMENT ON COLUMN mam_insp_spec.end_dt IS '適用終了日 // #MA.DT // Application end date';


COMMENT ON COLUMN mam_insp_spec.insp_point_cd IS '検査項目ＣＤ // #MA.INSP_POINT_CD // Inspection checkpoint cd.';


COMMENT ON COLUMN mam_insp_spec.pre_insp_inf_typ IS '先行検査引継区分 // #MA.PRE_INSP_INF_TYP // Prior inspection copy type';


COMMENT ON COLUMN mam_insp_spec.insp_qlqn_typ IS '定性定量区分 // #MA.INSP_QLQN_TYP // Qualitative/quantitative type';


COMMENT ON COLUMN mam_insp_spec.ql_std_val IS '定性規格値 // #MA.QL_STD_VAL // Qualitative specific value';


COMMENT ON COLUMN mam_insp_spec.unit_cd IS '単位ＣＤ // #MA.UNIT_CD // Unit cd.';


COMMENT ON COLUMN mam_insp_spec.qn_int_digit IS '定量値整数部桁数 // #MA.INT_DIGIT // Quantitative integer digits';


COMMENT ON COLUMN mam_insp_spec.qn_int_frac IS '定量値小数部桁数 // #MA.INT_DIGIT // Quantitative decimal digits';


COMMENT ON COLUMN mam_insp_spec.qn_out_min IS '外規格下限値 // #MA.QN_INSP_VAL // Lower limit of external specification';


COMMENT ON COLUMN mam_insp_spec.sign_out_min_typ IS '外規格下限符号区分 // #MA.SIGN_TYP // Sign type (Lower limit of external specification)';


COMMENT ON COLUMN mam_insp_spec.sign_out_max_typ IS '外規格上限符号区分 // #MA.SIGN_TYP // Sign type (Upper limit of external specification)';


COMMENT ON COLUMN mam_insp_spec.qn_out_max IS '外規格上限値 // #MA.QN_INSP_VAL // Upper limit of external specification';


COMMENT ON COLUMN mam_insp_spec.qn_in_min IS '内規格下限値 // #MA.QN_INSP_VAL // Lower limit of internal specification';


COMMENT ON COLUMN mam_insp_spec.sign_in_min_typ IS '内規格下限符号区分 // #MA.SIGN_TYP // Sign type (Lower limit of internal specification)';


COMMENT ON COLUMN mam_insp_spec.sign_in_max_typ IS '内規格上限符号区分 // #MA.SIGN_TYP // Sign type (Upper limit of internal specification)';


COMMENT ON COLUMN mam_insp_spec.qn_in_max IS '内規格上限値 // #MA.QN_INSP_VAL // Upper limit of internal specification';


COMMENT ON COLUMN mam_insp_spec.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_insp_spec.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_insp_spec.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_insp_spec.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_insp_spec.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_insp_spec.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_insp_spec.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_insp_spec.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_insp_spec.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_insp_spec.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_insp_spec.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_insp_spec.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_insp_spec.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_insp_spec.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_insp_spec.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_insp_spec.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_insp_spec.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

