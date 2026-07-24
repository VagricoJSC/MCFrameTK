\encoding UTF-8

COMMENT ON TABLE mam_grp_ptn_all IS '計算グループパタンマスタ // Calculation group pattern master';


COMMENT ON COLUMN mam_grp_ptn_all.calc_ptn_cd IS '計算パタンＣＤ // #MA.CALC_PTN_CD // Calculation pattern cd.';


COMMENT ON COLUMN mam_grp_ptn_all.calc_grp_cd IS '計算グループＣＤ // #MA.CALC_GRP_CD // Calculation group cd.';


COMMENT ON COLUMN mam_grp_ptn_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mam_grp_ptn_all.mfg_purc_typ IS '製造購買区分 // #MA.MFG_PURC_TYP // Mfg. purchase type';


COMMENT ON COLUMN mam_grp_ptn_all.eval_typ IS '金額評価区分 // #MA.EVAL_TYP // Amount evaluation type';


COMMENT ON COLUMN mam_grp_ptn_all.dpt_typ IS '部門計算区分 // #MA.UNIT_CALC_TYP // Dept. calculation type';


COMMENT ON COLUMN mam_grp_ptn_all.lot_typ IS 'ロットＮＯ計算区分 // #MA.UNIT_CALC_TYP // Lot No. calculation type';


COMMENT ON COLUMN mam_grp_ptn_all.sublot_typ IS 'サブロットＮＯ計算区分 // #MA.UNIT_CALC_TYP // Sublot No. calculation type';


COMMENT ON COLUMN mam_grp_ptn_all.sno1_typ IS '手配ＮＯ１計算区分 // #MA.UNIT_CALC_TYP // SEIBAN No. 1 calculation type';


COMMENT ON COLUMN mam_grp_ptn_all.sno2_typ IS '手配ＮＯ２計算区分 // #MA.UNIT_CALC_TYP // SEIBAN No. 2 calculation type';


COMMENT ON COLUMN mam_grp_ptn_all.sno3_typ IS '手配ＮＯ３計算区分 // #MA.UNIT_CALC_TYP // SEIBAN No. 3 calculation type';


COMMENT ON COLUMN mam_grp_ptn_all.sno4_typ IS '手配ＮＯ４計算区分 // #MA.UNIT_CALC_TYP // SEIBAN No. 4 calculation type';


COMMENT ON COLUMN mam_grp_ptn_all.lot_exp_typ IS 'ロットＮＯ展開区分 // #MA.EXP_SET_TYP // Lot No. explosion type';


COMMENT ON COLUMN mam_grp_ptn_all.sublot_exp_typ IS 'サブロットＮＯ展開区分 // #MA.EXP_SET_TYP // Sublot No. explosion type';


COMMENT ON COLUMN mam_grp_ptn_all.sno1_exp_typ IS '手配ＮＯ１展開区分 // #MA.EXP_SET_TYP // SEIBAN No. 1 explosion type';


COMMENT ON COLUMN mam_grp_ptn_all.sno2_exp_typ IS '手配ＮＯ２展開区分 // #MA.EXP_SET_TYP // SEIBAN No. 2 explosion type';


COMMENT ON COLUMN mam_grp_ptn_all.sno3_exp_typ IS '手配ＮＯ３展開区分 // #MA.EXP_SET_TYP // SEIBAN No. 3 explosion type';


COMMENT ON COLUMN mam_grp_ptn_all.sno4_exp_typ IS '手配ＮＯ４展開区分 // #MA.EXP_SET_TYP // SEIBAN No. 4 explosion type';


COMMENT ON COLUMN mam_grp_ptn_all.std_rnd_typ IS '標準端数処理区分 // #MA.RND_TYP // Rounding type (Standard)';


COMMENT ON COLUMN mam_grp_ptn_all.std_dec_place IS '標準小数部有効桁数 // #MA.DEC_PLACE // Standard number of decimal places';


COMMENT ON COLUMN mam_grp_ptn_all.ave_rnd_typ IS '単価端数処理区分 // #MA.RND_TYP // Rounding type (Unit price)';


COMMENT ON COLUMN mam_grp_ptn_all.ave_dec_place IS '単価小数部有効桁数 // #MA.DEC_PLACE // Unit price number of decimal places';


COMMENT ON COLUMN mam_grp_ptn_all.adj_typ IS '端数調整区分 // #MA.ADJ_TYP // Fraction adjustment type';


COMMENT ON COLUMN mam_grp_ptn_all.wip_typ IS '仕掛区分 // #MA.WIP_TYP // WIP type';


COMMENT ON COLUMN mam_grp_ptn_all.bd_agg_typ IS '内訳集計区分 // #MA.BD_AGG_TYP // Breakdown aggregated type';


COMMENT ON COLUMN mam_grp_ptn_all.mrgn_expns_cd IS '調整費目ＣＤ // #MA.EXPNS_CD // Adjustment cost element cd.';


COMMENT ON COLUMN mam_grp_ptn_all.purc_expns_cd IS '購買費目ＣＤ // #MA.EXPNS_CD // Purchase cost element item cd.';


COMMENT ON COLUMN mam_grp_ptn_all.out_expns_cd IS '外注費目ＣＤ // #MA.EXPNS_CD // Subcontract cost element cd.';


COMMENT ON COLUMN mam_grp_ptn_all.inpt_expns_cd IS '投入費目ＣＤ // #MA.EXPNS_CD // Input cost element cd.';


COMMENT ON COLUMN mam_grp_ptn_all.ss_expns_cd IS '自給費目ＣＤ // #MA.EXPNS_CD // Self supply cost element cd.';


COMMENT ON COLUMN mam_grp_ptn_all.prov_expns_cd IS '有償差額費目ＣＤ // #MA.EXPNS_CD // Cost element cd. for gain or loss of chargeable item';


COMMENT ON COLUMN mam_grp_ptn_all.exp_alloc_typ IS '展開割付区分 // #MA.EXP_ALLOC_TYP // Explosion allocation type';


COMMENT ON COLUMN mam_grp_ptn_all.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_grp_ptn_all.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_grp_ptn_all.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_grp_ptn_all.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_grp_ptn_all.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_grp_ptn_all.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_grp_ptn_all.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_grp_ptn_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_grp_ptn_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_grp_ptn_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_grp_ptn_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_grp_ptn_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_grp_ptn_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_grp_ptn_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_grp_ptn_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_grp_ptn_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_grp_ptn_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

