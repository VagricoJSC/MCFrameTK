\encoding UTF-8

COMMENT ON TABLE mgt_std_inpt_all IS '数量展開情報（標準計算結果） // Quantity explosion info. (Standard calculation result)';


COMMENT ON COLUMN mgt_std_inpt_all.calc_no IS '原価計算ＮＯ // #MA.CALC_NO // Calculation No.';


COMMENT ON COLUMN mgt_std_inpt_all.calc_grp_cd IS '計算グループＣＤ // #MA.CALC_GRP_CD // Calculation group cd.';


COMMENT ON COLUMN mgt_std_inpt_all.inpt_rec_no IS '投入レコードＮＯ // #MG.INPT_REC_NO // Input record No.';


COMMENT ON COLUMN mgt_std_inpt_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mgt_std_inpt_all.top_rec_no IS '最上位レコードＮＯ // #MG.TOP_REC_NO // Top record No.';


COMMENT ON COLUMN mgt_std_inpt_all.lvl IS 'レベル // #MG.CALC_LVL // Level';


COMMENT ON COLUMN mgt_std_inpt_all.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mgt_std_inpt_all.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mgt_std_inpt_all.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mgt_std_inpt_all.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mgt_std_inpt_all.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mgt_std_inpt_all.mfg_purc_typ IS '製造購買区分 // #MA.MFG_PURC_TYP // Mfg. purchase type';


COMMENT ON COLUMN mgt_std_inpt_all.oper_cd IS '工程ＣＤ // #MA.OPER_CD // Operation cd.';


COMMENT ON COLUMN mgt_std_inpt_all.oper_seq IS '工程連番 // #MA.OPER_SEQ // Operation sequence number';


COMMENT ON COLUMN mgt_std_inpt_all.disp_seq IS '工順 // #MA.INT // Routing';


COMMENT ON COLUMN mgt_std_inpt_all.loc_cd IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN mgt_std_inpt_all.sppl_cd IS '発注先ＣＤ // #MA.BP_CD // Supplier cd.';


COMMENT ON COLUMN mgt_std_inpt_all.prov_typ IS '支給区分 // #MA.PROV_TYP // Supply type';


COMMENT ON COLUMN mgt_std_inpt_all.std_qty IS '標準使用数量 // #MA.QTY // Standard use qty.';


COMMENT ON COLUMN mgt_std_inpt_all.the_qty IS '理論使用数量 // #MA.QTY // Ideal used qty.';


COMMENT ON COLUMN mgt_std_inpt_all.req_qty IS '理論必要数量 // #MA.QTY // Ideal required qty.';


COMMENT ON COLUMN mgt_std_inpt_all.bottom_flg IS '最下位ＦＬＧ // #MA.FLG // Bottom flg.';


COMMENT ON COLUMN mgt_std_inpt_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mgt_std_inpt_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mgt_std_inpt_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mgt_std_inpt_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mgt_std_inpt_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mgt_std_inpt_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mgt_std_inpt_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mgt_std_inpt_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mgt_std_inpt_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mgt_std_inpt_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

