\encoding UTF-8

COMMENT ON VIEW mgvt_msvt_lot_list IS 'ロット・サブロットリストビュー // Lot sublot list view';


COMMENT ON COLUMN mgvt_msvt_lot_list.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mgvt_msvt_lot_list.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mgvt_msvt_lot_list.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mgvt_msvt_lot_list.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mgvt_msvt_lot_list.lot_no IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN mgvt_msvt_lot_list.sublot_no IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN mgvt_msvt_lot_list.schd_flg IS '予定ＦＬＧ // #MA.FLG // Schedule flg.';


COMMENT ON COLUMN mgvt_msvt_lot_list.ver_no IS '版ＮＯ // #MA.VER_NO // Version No.';


COMMENT ON COLUMN mgvt_msvt_lot_list.first_gr_dt IS '最古入庫日 // #MA.DT // Oldest GR date';


COMMENT ON COLUMN mgvt_msvt_lot_list.base_gr_dt IS '基準入庫日 // #MA.DT // Standard GR date';


COMMENT ON COLUMN mgvt_msvt_lot_list.unreg_lmt_flg IS '期限未設定ＦＬＧ // #MA.FLG // Without expiration flg.';


COMMENT ON COLUMN mgvt_msvt_lot_list.vld_dt IS '有効期限 // #MA.DT // Expiration date';


COMMENT ON COLUMN mgvt_msvt_lot_list.lmt_dt IS '使用期限 // #MA.DT // Usage expiration date';


COMMENT ON COLUMN mgvt_msvt_lot_list.lot_mng_typ IS 'ロット管理区分 // #MA.LOT_MNG_TYP // Lot management type';


COMMENT ON COLUMN mgvt_msvt_lot_list.sublot_mng_typ IS 'サブロット管理区分 // #MA.SUBLOT_MNG_TYP // Sublot management type';


COMMENT ON COLUMN mgvt_msvt_lot_list.bp_lot_no IS '業者ロットＮＯ // #MA.BP_LOT_NO // Vendor lot No.';


COMMENT ON COLUMN mgvt_msvt_lot_list.stk_insp_typ IS '在庫検査区分 //  // Inventory inspection type';


COMMENT ON COLUMN mgvt_msvt_lot_list.quality_typ IS '良品区分 // #MA.QUALITY_TYP // Conforming type';


COMMENT ON COLUMN mgvt_msvt_lot_list.mfg_aprv_sts_typ IS '製造承認状況区分 //  // Mfg. approval status type';


COMMENT ON COLUMN mgvt_msvt_lot_list.insp_aprv_sts_typ IS '検査承認状況区分 //  // Inspection approval status type';


COMMENT ON COLUMN mgvt_msvt_lot_list.plnt_aprv_sts_typ IS '工場出荷承認状況区分 //  // Factory release approval status type';


COMMENT ON COLUMN mgvt_msvt_lot_list.mrkt_judg_sts_typ IS '市場出荷判定状況区分 //  // Market release decision status type';


COMMENT ON COLUMN mgvt_msvt_lot_list.first_gr_dt_save_flg IS '最古日保存ＦＬＧ // #MA.FLG // Oldest date saving flg.';


COMMENT ON COLUMN mgvt_msvt_lot_list.act_cont_fctr IS '実際有効成分係数 // #MA.ACT_CONT_FCTR // Actual active ingredient coefficient';


COMMENT ON COLUMN mgvt_msvt_lot_list.lmt_dt_frm_typ IS '期限起算日区分 // #MA.LMT_DT_FRM_TYP // Expiration base date type';


COMMENT ON COLUMN mgvt_msvt_lot_list.lmt_dt_frm IS '起算日 // #MA.DT // Base date';


COMMENT ON COLUMN mgvt_msvt_lot_list.lot_seq IS 'ロットシーケンス // #MA.LOT_SEQ // Lot sequence';


COMMENT ON COLUMN mgvt_msvt_lot_list.lot_rmrks IS 'ロット備考 //  // Lot remarks';


COMMENT ON COLUMN mgvt_msvt_lot_list.lot_sub_char1 IS 'ロット予備（文字列）１ //  // Lot spare (String) 1';


COMMENT ON COLUMN mgvt_msvt_lot_list.lot_sub_char2 IS 'ロット予備（文字列）２ //  // Lot spare (String) 2';


COMMENT ON COLUMN mgvt_msvt_lot_list.lot_sub_char3 IS 'ロット予備（文字列）３ //  // Lot spare (String) 3';


COMMENT ON COLUMN mgvt_msvt_lot_list.lot_sub_char4 IS 'ロット予備（文字列）４ //  // Lot spare (String) 4';


COMMENT ON COLUMN mgvt_msvt_lot_list.lot_sub_char5 IS 'ロット予備（文字列）５ //  // Lot spare (String) 5';


COMMENT ON COLUMN mgvt_msvt_lot_list.lot_sub_num1 IS 'ロット予備（数値）１ //  // Lot spare (Numerical value) 1';


COMMENT ON COLUMN mgvt_msvt_lot_list.lot_sub_num2 IS 'ロット予備（数値）２ //  // Lot spare (Numerical value) 2';


COMMENT ON COLUMN mgvt_msvt_lot_list.lot_sub_num3 IS 'ロット予備（数値）３ //  // Lot spare (Numerical value) 3';


COMMENT ON COLUMN mgvt_msvt_lot_list.lot_sub_num4 IS 'ロット予備（数値）４ //  // Lot spare (Numerical value) 4';


COMMENT ON COLUMN mgvt_msvt_lot_list.lot_sub_num5 IS 'ロット予備（数値）５ //  // Lot spare (Numerical value) 5';


COMMENT ON COLUMN mgvt_msvt_lot_list.lot_sub_dt1 IS 'ロット予備（日付）１ // #MA.DT // Lot spare (Date) 1';


COMMENT ON COLUMN mgvt_msvt_lot_list.lot_sub_dt2 IS 'ロット予備（日付）２ // #MA.DT // Lot spare (Date) 2';


COMMENT ON COLUMN mgvt_msvt_lot_list.lot_sub_dt3 IS 'ロット予備（日付）３ // #MA.DT // Lot spare (Date) 3';


COMMENT ON COLUMN mgvt_msvt_lot_list.lot_sub_dt4 IS 'ロット予備（日付）４ // #MA.DT // Lot spare (Date) 4';


COMMENT ON COLUMN mgvt_msvt_lot_list.lot_sub_dt5 IS 'ロット予備（日付）５ // #MA.DT // Lot spare (Date) 5';


COMMENT ON COLUMN mgvt_msvt_lot_list.lot_sub_flg1 IS 'ロット予備（ＦＬＧ）１ // #MA.FLG // Lot spare (flg.) 1';


COMMENT ON COLUMN mgvt_msvt_lot_list.lot_sub_flg2 IS 'ロット予備（ＦＬＧ）２ // #MA.FLG // Lot spare (flg.) 2';


COMMENT ON COLUMN mgvt_msvt_lot_list.lot_sub_flg3 IS 'ロット予備（ＦＬＧ）３ // #MA.FLG // Lot spare (flg.) 3';


COMMENT ON COLUMN mgvt_msvt_lot_list.lot_sub_flg4 IS 'ロット予備（ＦＬＧ）４ // #MA.FLG // Lot spare (flg.) 4';


COMMENT ON COLUMN mgvt_msvt_lot_list.lot_sub_flg5 IS 'ロット予備（ＦＬＧ）５ // #MA.FLG // Lot spare (flg.) 5';

