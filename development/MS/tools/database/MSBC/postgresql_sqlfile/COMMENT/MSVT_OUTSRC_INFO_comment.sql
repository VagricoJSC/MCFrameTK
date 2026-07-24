\encoding UTF-8

COMMENT ON VIEW msvt_outsrc_info IS '受払実績用外注製造情報ビュー // Subcontractor mfg. info. view for GR/GI result';


COMMENT ON COLUMN msvt_outsrc_info.purc_act_d_no IS '仕入実績明細ＮＯ // #MA.PURC_ACT_D_NO // Purchase result details No.';


COMMENT ON COLUMN msvt_outsrc_info.purc_act_d_seq IS '仕入実績明細連番 // #MA.SLIP_SEQ // Purchase result details sequence number';


COMMENT ON COLUMN msvt_outsrc_info.itm_mfg_inst_no IS '品目製造指図ＮＯ // #MA.ITM_MFG_INST_NO // Item mfg. order No.';


COMMENT ON COLUMN msvt_outsrc_info.itm_inst_qty IS '品目指図数量 // #MA.QTY // Item order qty.';


COMMENT ON COLUMN msvt_outsrc_info.mfg_inst_no IS '製造指図ＮＯ // #MA.MFG_INST_NO // Mfg. order No.';


COMMENT ON COLUMN msvt_outsrc_info.mfg_act_no IS '製造実績ＮＯ // #MA.MFG_ACT_NO // Mfg. result No.';


COMMENT ON COLUMN msvt_outsrc_info.mfg_st_qty IS '製造着手数量 // #MA.QTY // Mfg. start qty.';


COMMENT ON COLUMN msvt_outsrc_info.outsrc_mfg_loc_cd IS '外注製造場所ＣＤ // #MA.LOC_CD // Subcontracting mfg. location cd.';


COMMENT ON COLUMN msvt_outsrc_info.outsrc_mfg_loc_wg_cd IS '外注製造ワーキンググループＣＤ // #MA.WG_CD // Subcontracting mfg. WG cd.';


COMMENT ON COLUMN msvt_outsrc_info.par_lot_no IS 'ロットＮＯ（品目製造指図） // #MA.LOT_NO // Lot No. (Item mfg. order)';


COMMENT ON COLUMN msvt_outsrc_info.par_sublot_no IS 'サブロットＮＯ（品目製造指図） // #MA.SUBLOT_NO // Sublot No. (Item mfg. order)';

