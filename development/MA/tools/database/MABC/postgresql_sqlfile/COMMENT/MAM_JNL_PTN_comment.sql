\encoding UTF-8

COMMENT ON VIEW mam_jnl_ptn IS '自動仕訳パタンマスタ // Auto-journal pattern master';


COMMENT ON COLUMN mam_jnl_ptn.jnl_ptn_cd IS '仕訳パタンＣＤ // #MA.JNL_PTN_CD // Journal pattern cd.';


COMMENT ON COLUMN mam_jnl_ptn.jnl_seq IS '連番 // #MA.INT4 // Sequence number';


COMMENT ON COLUMN mam_jnl_ptn.dr_dpt_typ IS '借方部門区分 // #MA.DPT_TYP // Debit dept. type';


COMMENT ON COLUMN mam_jnl_ptn.cr_dpt_typ IS '貸方部門区分 // #MA.DPT_TYP // Credit dept. type';


COMMENT ON COLUMN mam_jnl_ptn.dr_dpt_cd IS '借方部門ＣＤ // #MA.AC_DPT_CD // Debit dept. cd.';


COMMENT ON COLUMN mam_jnl_ptn.cr_dpt_cd IS '貸方部門ＣＤ // #MA.AC_DPT_CD // Credit dept. cd.';


COMMENT ON COLUMN mam_jnl_ptn.dr_ptn_typ IS '借方パタン区分 // #MA.PTN_TYP // Debit pattern type';


COMMENT ON COLUMN mam_jnl_ptn.dr_grp_cd IS '借方仕訳グループＣＤ // #MA.JNL_GRP_CD // Debit journal group cd.';


COMMENT ON COLUMN mam_jnl_ptn.cr_ptn_typ IS '貸方パタン区分 // #MA.PTN_TYP // Credit pattern type';


COMMENT ON COLUMN mam_jnl_ptn.cr_grp_cd IS '貸方仕訳グループＣＤ // #MA.JNL_GRP_CD // Credit journal group cd.';


COMMENT ON COLUMN mam_jnl_ptn.dr_ac_cd IS '借方勘定科目ＣＤ // #MA.AC_CD // Debit account cd.';


COMMENT ON COLUMN mam_jnl_ptn.dr_sub_ac_cd IS '借方補助勘定科目ＣＤ // #MA.SUB_AC_CD // Debit subsidiary account cd.';


COMMENT ON COLUMN mam_jnl_ptn.cr_ac_cd IS '貸方勘定科目ＣＤ // #MA.AC_CD // Credit account cd.';


COMMENT ON COLUMN mam_jnl_ptn.cr_sub_ac_cd IS '貸方補助勘定科目ＣＤ // #MA.SUB_AC_CD // Credit subsidiary account cd.';


COMMENT ON COLUMN mam_jnl_ptn.dr_ac_tax_cd IS '借方会計税ＣＤ // #MA.AC_TAX_CD // Debit accounting tax cd.';


COMMENT ON COLUMN mam_jnl_ptn.cr_ac_tax_cd IS '貸方会計税ＣＤ // #MA.AC_TAX_CD // Credit accounting tax cd.';


COMMENT ON COLUMN mam_jnl_ptn.dr_bp_typ IS '借方取引先区分 // #MA.BP_SET_TYP // Debit BP type';


COMMENT ON COLUMN mam_jnl_ptn.cr_bp_typ IS '貸方取引先区分 // #MA.BP_SET_TYP // Credit BP type';


COMMENT ON COLUMN mam_jnl_ptn.dr_bp_cd IS '借方取引先ＣＤ // #MA.BP_CD // Debit BP cd.';


COMMENT ON COLUMN mam_jnl_ptn.cr_bp_cd IS '貸方取引先ＣＤ // #MA.BP_CD // Credit company cd.';


COMMENT ON COLUMN mam_jnl_ptn.dr_itm_typ IS '借方品目区分 // #MA.ITM_SET_TYP // Debit item type';


COMMENT ON COLUMN mam_jnl_ptn.cr_itm_typ IS '貸方品目区分 // #MA.ITM_SET_TYP // Credit item type';


COMMENT ON COLUMN mam_jnl_ptn.dr_amt_typ IS '借方金額区分 // #MA.AMT_TYP // Debit amount type';


COMMENT ON COLUMN mam_jnl_ptn.cr_amt_typ IS '貸方金額区分 // #MA.AMT_TYP // Credit amount type';


COMMENT ON COLUMN mam_jnl_ptn.dr_abs_typ IS '借方摘要区分 // #MA.ABS_TYP // Debit abstract type';


COMMENT ON COLUMN mam_jnl_ptn.dr_abstract IS '借方摘要 // #MA.ABSTRACT_M // Debit summary';


COMMENT ON COLUMN mam_jnl_ptn.cr_abs_typ IS '貸方摘要区分 // #MA.ABS_TYP // Credit abstract type';


COMMENT ON COLUMN mam_jnl_ptn.cr_abstract IS '貸方摘要 // #MA.ABSTRACT_M // Credit summary';


COMMENT ON COLUMN mam_jnl_ptn.dr_trd_sml_flg IS '借方振替先集計ＦＬＧ // #MA.FLG // Debit transfer destination aggregation flg.';


COMMENT ON COLUMN mam_jnl_ptn.cr_trd_sml_flg IS '貸方振替先集計ＦＬＧ // #MA.FLG // Credit transfer destination aggregation flg.';


COMMENT ON COLUMN mam_jnl_ptn.carry_flg IS '繰越仕訳ＦＬＧ // #MA.FLG // Carry-over journal flg.';


COMMENT ON COLUMN mam_jnl_ptn.minus_flg IS 'マイナスＦＬＧ // #MA.FLG // Minus flg.';


COMMENT ON COLUMN mam_jnl_ptn.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mam_jnl_ptn.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mam_jnl_ptn.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mam_jnl_ptn.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mam_jnl_ptn.itm_jnl_cd IS '品目仕訳ＣＤ // #MA.ITM_JNL_CD // Item journal cd.';


COMMENT ON COLUMN mam_jnl_ptn.ac_rsn_cd IS '会計理由ＣＤ // #MA.AC_RSN_CD // Accounting reason cd.';


COMMENT ON COLUMN mam_jnl_ptn.purc_typ IS '購買区分 // #MA.PURC_TYP // Purchase type';


COMMENT ON COLUMN mam_jnl_ptn.un_fix_typ IS '金額未確定区分 // #MA.UN_FIX_TYP // Amount unfirm type';


COMMENT ON COLUMN mam_jnl_ptn.foreign_typ IS '国外取引区分 // #MA.FOREIGN_TYP // Foreign transaction type';


COMMENT ON COLUMN mam_jnl_ptn.cur_cd IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN mam_jnl_ptn.asst_typ IS '資産区分 // #MA.ASST_TYP // Asset type';


COMMENT ON COLUMN mam_jnl_ptn.quality_typ IS '在庫良品区分 // #MA.QUALITY_TYP // Inventory conforming type';


COMMENT ON COLUMN mam_jnl_ptn.inv_loc_typ IS '在庫場所区分 // #MA.INV_LOC_TYP // Inventory location type';


COMMENT ON COLUMN mam_jnl_ptn.amt_sign_typ IS '金額符号区分 // #MA.AMT_SIGN_TYP // Amount sign type';


COMMENT ON COLUMN mam_jnl_ptn.jnl_key1 IS '仕訳キー項目１ // #MA.JNL_KEY1 // Journal key column 1';


COMMENT ON COLUMN mam_jnl_ptn.jnl_key2 IS '仕訳キー項目２ // #MA.JNL_KEY2 // Journal key column 2';


COMMENT ON COLUMN mam_jnl_ptn.jnl_key3 IS '仕訳キー項目３ // #MA.JNL_KEY3 // Journal key column 3';


COMMENT ON COLUMN mam_jnl_ptn.jnl_key4 IS '仕訳キー項目４ // #MA.JNL_KEY4 // Journal key column 4';


COMMENT ON COLUMN mam_jnl_ptn.jnl_key5 IS '仕訳キー項目５ // #MA.JNL_KEY5 // Journal key column 5';


COMMENT ON COLUMN mam_jnl_ptn.jnl_key6 IS '仕訳キー項目６ // #MA.JNL_KEY6 // Journal key column 6';


COMMENT ON COLUMN mam_jnl_ptn.jnl_key7 IS '仕訳キー項目７ // #MA.JNL_KEY7 // Journal key column 7';


COMMENT ON COLUMN mam_jnl_ptn.jnl_key8 IS '仕訳キー項目８ // #MA.JNL_KEY8 // Journal key column 8';


COMMENT ON COLUMN mam_jnl_ptn.jnl_key9 IS '仕訳キー項目９ // #MA.JNL_KEY9 // Journal key column 9';


COMMENT ON COLUMN mam_jnl_ptn.jnl_key10 IS '仕訳キー項目１０ // #MA.JNL_KEY10 // Journal key column 10';


COMMENT ON COLUMN mam_jnl_ptn.mon01_invalid_flg IS '１月対象外ＦＬＧ // #MA.FLG // Not for Jan. flg.';


COMMENT ON COLUMN mam_jnl_ptn.mon02_invalid_flg IS '２月対象外ＦＬＧ // #MA.FLG // Not for Feb. flg.';


COMMENT ON COLUMN mam_jnl_ptn.mon03_invalid_flg IS '３月対象外ＦＬＧ // #MA.FLG // Not for Mar. flg.';


COMMENT ON COLUMN mam_jnl_ptn.mon04_invalid_flg IS '４月対象外ＦＬＧ // #MA.FLG // Not for Apr. flg.';


COMMENT ON COLUMN mam_jnl_ptn.mon05_invalid_flg IS '５月対象外ＦＬＧ // #MA.FLG // Not for May flg.';


COMMENT ON COLUMN mam_jnl_ptn.mon06_invalid_flg IS '６月対象外ＦＬＧ // #MA.FLG // Not for Jun. flg.';


COMMENT ON COLUMN mam_jnl_ptn.mon07_invalid_flg IS '７月対象外ＦＬＧ // #MA.FLG // Not for July flg.';


COMMENT ON COLUMN mam_jnl_ptn.mon08_invalid_flg IS '８月対象外ＦＬＧ // #MA.FLG // Not for Aug. flg.';


COMMENT ON COLUMN mam_jnl_ptn.mon09_invalid_flg IS '９月対象外ＦＬＧ // #MA.FLG // Not for Sep. flg.';


COMMENT ON COLUMN mam_jnl_ptn.mon10_invalid_flg IS '１０月対象外ＦＬＧ // #MA.FLG // Not for Oct. flg.';


COMMENT ON COLUMN mam_jnl_ptn.mon11_invalid_flg IS '１１月対象外ＦＬＧ // #MA.FLG // Not for Nov. flg.';


COMMENT ON COLUMN mam_jnl_ptn.mon12_invalid_flg IS '１２月対象外ＦＬＧ // #MA.FLG // Not for Dec. flg.';


COMMENT ON COLUMN mam_jnl_ptn.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_jnl_ptn.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_jnl_ptn.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_jnl_ptn.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_jnl_ptn.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_jnl_ptn.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_jnl_ptn.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_jnl_ptn.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_jnl_ptn.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_jnl_ptn.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_jnl_ptn.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_jnl_ptn.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_jnl_ptn.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_jnl_ptn.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_jnl_ptn.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_jnl_ptn.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_jnl_ptn.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

