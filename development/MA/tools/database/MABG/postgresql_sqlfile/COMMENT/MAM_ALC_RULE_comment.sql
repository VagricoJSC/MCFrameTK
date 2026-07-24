\encoding UTF-8

COMMENT ON VIEW mam_alc_rule IS '配賦方法マスタ // Allocation basis Master';


COMMENT ON COLUMN mam_alc_rule.alc_ptn_cd IS '配賦パタンＣＤ // #MA.ALC_PTN_CD // Allocation pattern cd.';


COMMENT ON COLUMN mam_alc_rule.term IS '期 // #MA.YM // Term';


COMMENT ON COLUMN mam_alc_rule.alc_tgt_typ IS '配賦対象区分 // #MA.ALC_TGT_TYP // Allocation target type';


COMMENT ON COLUMN mam_alc_rule.alc_rule_typ IS '配賦方法区分 // #MA.ALC_RULE_TYP // Allocation basis type';


COMMENT ON COLUMN mam_alc_rule.expns_cd IS '費目ＣＤ // #MA.EXPNS_CD // Cost element cd.';


COMMENT ON COLUMN mam_alc_rule.diff_calc_typ IS '差異計算区分 // #MA.DIFF_CALC_TYP // Variance calculation type';


COMMENT ON COLUMN mam_alc_rule.rnd_typ IS '端数処理区分 // #MA.RND_TYP // Rounding type';


COMMENT ON COLUMN mam_alc_rule.dec_place IS '小数部有効桁数 // #MA.DEC_PLACE // Number of decimal places';


COMMENT ON COLUMN mam_alc_rule.alc_coef_cd IS '配賦係数ＣＤ // #MA.ALC_COEF_CD // Allocation coefficient cd.';


COMMENT ON COLUMN mam_alc_rule.coef_limit_flg IS '配賦係数限定ＦＬＧ // #MA.FLG // Allocation coefficient limit flg.';


COMMENT ON COLUMN mam_alc_rule.asst_typ IS '資産区分 // #MA.ASST_TYP // Asset type';


COMMENT ON COLUMN mam_alc_rule.non_minus_flg IS 'マイナス対象外ＦＬＧ // #MA.FLG // Not for minus flg.';


COMMENT ON COLUMN mam_alc_rule.non_os_flg IS '外注対象外ＦＬＧ // #MA.FLG // Not for subcontracting flg.';


COMMENT ON COLUMN mam_alc_rule.scst_alc_flg IS '納品先配賦ＦＬＧ // #MA.FLG // Delivery destination allocation flg.';


COMMENT ON COLUMN mam_alc_rule.std_alc_flg IS '標準配賦ＦＬＧ // #MA.FLG // Standard allocation flg.';


COMMENT ON COLUMN mam_alc_rule.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_alc_rule.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_alc_rule.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_alc_rule.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_alc_rule.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_alc_rule.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_alc_rule.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_alc_rule.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_alc_rule.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_alc_rule.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_alc_rule.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_alc_rule.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_alc_rule.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_alc_rule.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_alc_rule.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_alc_rule.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_alc_rule.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

