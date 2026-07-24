\encoding UTF-8

COMMENT ON VIEW mam_calc_grp IS '計算グループマスタ // Calculation group master';


COMMENT ON COLUMN mam_calc_grp.calc_grp_cd IS '計算グループＣＤ // #MA.CALC_GRP_CD // Calculation group cd.';


COMMENT ON COLUMN mam_calc_grp.calc_grp_nm IS '計算グループ名 // #MA.CALC_GRP_NM // Calculation group name';


COMMENT ON COLUMN mam_calc_grp.base_calc_grp_nm IS '計算グループ名（ベース） // #MA.CALC_GRP_NM // Calculation group name(Base)';


COMMENT ON COLUMN mam_calc_grp.cost_calc_typ IS '計算区分 // #MA.COST_CALC_TYP // Cost calculation type';


COMMENT ON COLUMN mam_calc_grp.eval_typ IS '金額評価区分 // #MA.EVAL_TYP // Amount evaluation type';


COMMENT ON COLUMN mam_calc_grp.max_mons IS '最大計算月数 // #MA.MAX_MONS // Max. calculation months';


COMMENT ON COLUMN mam_calc_grp.calc_cnt IS '計算回数 // #MA.INT2 // Calculation count';


COMMENT ON COLUMN mam_calc_grp.sa_typ IS '予実区分 // #MA.SA_TYP // Plan/Result type';


COMMENT ON COLUMN mam_calc_grp.exp_calc_typ IS '展開計算区分 // #MA.EXP_CALC_TYP // BOM explosion calculation type';


COMMENT ON COLUMN mam_calc_grp.pre_alc_calc_typ IS '一次配賦計算区分 // #MA.PRE_ALC_CALC_TYP // Departmental alloc. calculation type';


COMMENT ON COLUMN mam_calc_grp.alc_calc_typ IS '配賦率計算区分 // #MA.ALC_CALC_TYP // Allocation rate calculation type';


COMMENT ON COLUMN mam_calc_grp.inpt_calc_flg IS '投入計算ＦＬＧ // #MA.FLG // Input calculation flg.';


COMMENT ON COLUMN mam_calc_grp.wk_calc_flg IS '工数計算ＦＬＧ // #MA.FLG // Man-hour calculation flg.';


COMMENT ON COLUMN mam_calc_grp.prov_calc_flg IS '支給計算ＦＬＧ // #MA.FLG // Supply calculation flg.';


COMMENT ON COLUMN mam_calc_grp.xfr_calc_flg IS '移動計算ＦＬＧ // #MA.FLG // Movement calculation flg.';


COMMENT ON COLUMN mam_calc_grp.xrate_cd IS '為替レートＣＤ // #MA.XRATE_CD // Exchange rate cd.';


COMMENT ON COLUMN mam_calc_grp.calc_seq_grp IS '計算順序グループ // #MA.CALC_SEQ_GRP // Calculation sequence group';


COMMENT ON COLUMN mam_calc_grp.calc_seq IS '計算順序 // #MA.INT3 // Calculation sequence';


COMMENT ON COLUMN mam_calc_grp.runtime_wg_cd IS '実行時ワーキンググループＣＤ // #MA.WG_CD // Execution working group cd.';


COMMENT ON COLUMN mam_calc_grp.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_calc_grp.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_calc_grp.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_calc_grp.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_calc_grp.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_calc_grp.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_calc_grp.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_calc_grp.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_calc_grp.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_calc_grp.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_calc_grp.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_calc_grp.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_calc_grp.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_calc_grp.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_calc_grp.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_calc_grp.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_calc_grp.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

