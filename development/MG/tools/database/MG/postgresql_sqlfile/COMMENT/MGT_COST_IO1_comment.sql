\encoding UTF-8

COMMENT ON VIEW mgt_cost_io1 IS '原価個別受払表１ // Custom T account list 1';


COMMENT ON COLUMN mgt_cost_io1.calc_no IS '原価計算ＮＯ // #MA.CALC_NO // Calculation No.';


COMMENT ON COLUMN mgt_cost_io1.calc_grp_cd IS '計算グループＣＤ // #MA.CALC_GRP_CD // Calculation group cd.';


COMMENT ON COLUMN mgt_cost_io1.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mgt_cost_io1.ym IS '年月 // #MA.YM // Year month';


COMMENT ON COLUMN mgt_cost_io1.mng_dpt_cd IS '管理部門ＣＤ // #MA.COST_DPT_CD // Management dept. cd.';


COMMENT ON COLUMN mgt_cost_io1.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mgt_cost_io1.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mgt_cost_io1.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mgt_cost_io1.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mgt_cost_io1.lot_no IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN mgt_cost_io1.sublot_no IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN mgt_cost_io1.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN mgt_cost_io1.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN mgt_cost_io1.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN mgt_cost_io1.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN mgt_cost_io1.bp_cd IS '取引先ＣＤ // #MA.BP_CD // BP cd.';


COMMENT ON COLUMN mgt_cost_io1.asst_typ IS '資産区分 // #MA.ASST_TYP // Asset type';


COMMENT ON COLUMN mgt_cost_io1.qty01 IS '数量０１ // #MA.QTY // Quantity 01';


COMMENT ON COLUMN mgt_cost_io1.amt01 IS '金額０１ // #MA.MONEY // Amount 01';


COMMENT ON COLUMN mgt_cost_io1.std01 IS '標準０１ // #MA.MONEY // Standard 01';


COMMENT ON COLUMN mgt_cost_io1.qty02 IS '数量０２ // #MA.QTY // Quantity 02';


COMMENT ON COLUMN mgt_cost_io1.amt02 IS '金額０２ // #MA.MONEY // Amount 02';


COMMENT ON COLUMN mgt_cost_io1.std02 IS '標準０２ // #MA.MONEY // Standard 02';


COMMENT ON COLUMN mgt_cost_io1.qty03 IS '数量０３ // #MA.QTY // Quantity 03';


COMMENT ON COLUMN mgt_cost_io1.amt03 IS '金額０３ // #MA.MONEY // Amount 03';


COMMENT ON COLUMN mgt_cost_io1.std03 IS '標準０３ // #MA.MONEY // Standard 03';


COMMENT ON COLUMN mgt_cost_io1.qty04 IS '数量０４ // #MA.QTY // Quantity 04';


COMMENT ON COLUMN mgt_cost_io1.amt04 IS '金額０４ // #MA.MONEY // Amount 04';


COMMENT ON COLUMN mgt_cost_io1.std04 IS '標準０４ // #MA.MONEY // Standard 04';


COMMENT ON COLUMN mgt_cost_io1.qty05 IS '数量０５ // #MA.QTY // Quantity 05';


COMMENT ON COLUMN mgt_cost_io1.amt05 IS '金額０５ // #MA.MONEY // Amount 05';


COMMENT ON COLUMN mgt_cost_io1.std05 IS '標準０５ // #MA.MONEY // Standard 05';


COMMENT ON COLUMN mgt_cost_io1.qty06 IS '数量０６ // #MA.QTY // Quantity 06';


COMMENT ON COLUMN mgt_cost_io1.amt06 IS '金額０６ // #MA.MONEY // Amount 06';


COMMENT ON COLUMN mgt_cost_io1.std06 IS '標準０６ // #MA.MONEY // Standard 06';


COMMENT ON COLUMN mgt_cost_io1.qty07 IS '数量０７ // #MA.QTY // Quantity 07';


COMMENT ON COLUMN mgt_cost_io1.amt07 IS '金額０７ // #MA.MONEY // Amount 07';


COMMENT ON COLUMN mgt_cost_io1.std07 IS '標準０７ // #MA.MONEY // Standard 07';


COMMENT ON COLUMN mgt_cost_io1.qty08 IS '数量０８ // #MA.QTY // Quantity 08';


COMMENT ON COLUMN mgt_cost_io1.amt08 IS '金額０８ // #MA.MONEY // Amount 08';


COMMENT ON COLUMN mgt_cost_io1.std08 IS '標準０８ // #MA.MONEY // Standard 08';


COMMENT ON COLUMN mgt_cost_io1.qty09 IS '数量０９ // #MA.QTY // Quantity 09';


COMMENT ON COLUMN mgt_cost_io1.amt09 IS '金額０９ // #MA.MONEY // Amount 09';


COMMENT ON COLUMN mgt_cost_io1.std09 IS '標準０９ // #MA.MONEY // Standard 09';


COMMENT ON COLUMN mgt_cost_io1.qty10 IS '数量１０ // #MA.QTY // Quantity 10';


COMMENT ON COLUMN mgt_cost_io1.amt10 IS '金額１０ // #MA.MONEY // Amount 10';


COMMENT ON COLUMN mgt_cost_io1.std10 IS '標準１０ // #MA.MONEY // Standard 10';


COMMENT ON COLUMN mgt_cost_io1.qty11 IS '数量１１ // #MA.QTY // Quantity 11';


COMMENT ON COLUMN mgt_cost_io1.amt11 IS '金額１１ // #MA.MONEY // Amount 11';


COMMENT ON COLUMN mgt_cost_io1.std11 IS '標準１１ // #MA.MONEY // Standard 11';


COMMENT ON COLUMN mgt_cost_io1.qty12 IS '数量１２ // #MA.QTY // Quantity 12';


COMMENT ON COLUMN mgt_cost_io1.amt12 IS '金額１２ // #MA.MONEY // Amount 12';


COMMENT ON COLUMN mgt_cost_io1.std12 IS '標準１２ // #MA.MONEY // Standard 12';


COMMENT ON COLUMN mgt_cost_io1.qty13 IS '数量１３ // #MA.QTY // Quantity 13';


COMMENT ON COLUMN mgt_cost_io1.amt13 IS '金額１３ // #MA.MONEY // Amount 13';


COMMENT ON COLUMN mgt_cost_io1.std13 IS '標準１３ // #MA.MONEY // Standard 13';


COMMENT ON COLUMN mgt_cost_io1.qty14 IS '数量１４ // #MA.QTY // Quantity 14';


COMMENT ON COLUMN mgt_cost_io1.amt14 IS '金額１４ // #MA.MONEY // Amount 14';


COMMENT ON COLUMN mgt_cost_io1.std14 IS '標準１４ // #MA.MONEY // Standard 14';


COMMENT ON COLUMN mgt_cost_io1.qty15 IS '数量１５ // #MA.QTY // Quantity 15';


COMMENT ON COLUMN mgt_cost_io1.amt15 IS '金額１５ // #MA.MONEY // Amount 15';


COMMENT ON COLUMN mgt_cost_io1.std15 IS '標準１５ // #MA.MONEY // Standard 15';


COMMENT ON COLUMN mgt_cost_io1.qty16 IS '数量１６ // #MA.QTY // Quantity 16';


COMMENT ON COLUMN mgt_cost_io1.amt16 IS '金額１６ // #MA.MONEY // Amount 16';


COMMENT ON COLUMN mgt_cost_io1.std16 IS '標準１６ // #MA.MONEY // Standard 16';


COMMENT ON COLUMN mgt_cost_io1.qty17 IS '数量１７ // #MA.QTY // Quantity 17';


COMMENT ON COLUMN mgt_cost_io1.amt17 IS '金額１７ // #MA.MONEY // Amount 17';


COMMENT ON COLUMN mgt_cost_io1.std17 IS '標準１７ // #MA.MONEY // Standard 17';


COMMENT ON COLUMN mgt_cost_io1.qty18 IS '数量１８ // #MA.QTY // Quantity 18';


COMMENT ON COLUMN mgt_cost_io1.amt18 IS '金額１８ // #MA.MONEY // Amount 18';


COMMENT ON COLUMN mgt_cost_io1.std18 IS '標準１８ // #MA.MONEY // Standard 18';


COMMENT ON COLUMN mgt_cost_io1.qty19 IS '数量１９ // #MA.QTY // Quantity 19';


COMMENT ON COLUMN mgt_cost_io1.amt19 IS '金額１９ // #MA.MONEY // Amount 19';


COMMENT ON COLUMN mgt_cost_io1.std19 IS '標準１９ // #MA.MONEY // Standard 19';


COMMENT ON COLUMN mgt_cost_io1.qty20 IS '数量２０ // #MA.QTY // Quantity 20';


COMMENT ON COLUMN mgt_cost_io1.amt20 IS '金額２０ // #MA.MONEY // Amount 20';


COMMENT ON COLUMN mgt_cost_io1.std20 IS '標準２０ // #MA.MONEY // Standard 20';


COMMENT ON COLUMN mgt_cost_io1.qty21 IS '数量２１ // #MA.QTY // Quantity 21';


COMMENT ON COLUMN mgt_cost_io1.amt21 IS '金額２１ // #MA.MONEY // Amount 21';


COMMENT ON COLUMN mgt_cost_io1.std21 IS '標準２１ // #MA.MONEY // Standard 21';


COMMENT ON COLUMN mgt_cost_io1.qty22 IS '数量２２ // #MA.QTY // Quantity 22';


COMMENT ON COLUMN mgt_cost_io1.amt22 IS '金額２２ // #MA.MONEY // Amount 22';


COMMENT ON COLUMN mgt_cost_io1.std22 IS '標準２２ // #MA.MONEY // Standard 22';


COMMENT ON COLUMN mgt_cost_io1.qty23 IS '数量２３ // #MA.QTY // Quantity 23';


COMMENT ON COLUMN mgt_cost_io1.amt23 IS '金額２３ // #MA.MONEY // Amount 23';


COMMENT ON COLUMN mgt_cost_io1.std23 IS '標準２３ // #MA.MONEY // Standard 23';


COMMENT ON COLUMN mgt_cost_io1.qty24 IS '数量２４ // #MA.QTY // Quantity 24';


COMMENT ON COLUMN mgt_cost_io1.amt24 IS '金額２４ // #MA.MONEY // Amount 24';


COMMENT ON COLUMN mgt_cost_io1.std24 IS '標準２４ // #MA.MONEY // Standard 24';


COMMENT ON COLUMN mgt_cost_io1.qty25 IS '数量２５ // #MA.QTY // Quantity 25';


COMMENT ON COLUMN mgt_cost_io1.amt25 IS '金額２５ // #MA.MONEY // Amount 25';


COMMENT ON COLUMN mgt_cost_io1.std25 IS '標準２５ // #MA.MONEY // Standard 25';


COMMENT ON COLUMN mgt_cost_io1.qty26 IS '数量２６ // #MA.QTY // Quantity 26';


COMMENT ON COLUMN mgt_cost_io1.amt26 IS '金額２６ // #MA.MONEY // Amount 26';


COMMENT ON COLUMN mgt_cost_io1.std26 IS '標準２６ // #MA.MONEY // Standard 26';


COMMENT ON COLUMN mgt_cost_io1.qty27 IS '数量２７ // #MA.QTY // Quantity 27';


COMMENT ON COLUMN mgt_cost_io1.amt27 IS '金額２７ // #MA.MONEY // Amount 27';


COMMENT ON COLUMN mgt_cost_io1.std27 IS '標準２７ // #MA.MONEY // Standard 27';


COMMENT ON COLUMN mgt_cost_io1.qty28 IS '数量２８ // #MA.QTY // Quantity 28';


COMMENT ON COLUMN mgt_cost_io1.amt28 IS '金額２８ // #MA.MONEY // Amount 28';


COMMENT ON COLUMN mgt_cost_io1.std28 IS '標準２８ // #MA.MONEY // Standard 28';


COMMENT ON COLUMN mgt_cost_io1.qty29 IS '数量２９ // #MA.QTY // Quantity 29';


COMMENT ON COLUMN mgt_cost_io1.amt29 IS '金額２９ // #MA.MONEY // Amount 29';


COMMENT ON COLUMN mgt_cost_io1.std29 IS '標準２９ // #MA.MONEY // Standard 29';


COMMENT ON COLUMN mgt_cost_io1.qty30 IS '数量３０ // #MA.QTY // Quantity 30';


COMMENT ON COLUMN mgt_cost_io1.amt30 IS '金額３０ // #MA.MONEY // Amount 30';


COMMENT ON COLUMN mgt_cost_io1.std30 IS '標準３０ // #MA.MONEY // Standard 30';


COMMENT ON COLUMN mgt_cost_io1.diff_qty IS '数量差 // #MA.QTY // Quantity difference';


COMMENT ON COLUMN mgt_cost_io1.diff_amt IS '金額差 // #MA.MONEY // Amount variance';


COMMENT ON COLUMN mgt_cost_io1.diff_std IS '標準差 // #MA.MONEY // Standard variance';


COMMENT ON COLUMN mgt_cost_io1.ave_tgt IS '総平均単価対象 // #MA.INT // For weighted average unit price';


COMMENT ON COLUMN mgt_cost_io1.ym_sub IS '年月サブ // #MA.YM // Year month sub';


COMMENT ON COLUMN mgt_cost_io1.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mgt_cost_io1.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mgt_cost_io1.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mgt_cost_io1.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mgt_cost_io1.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mgt_cost_io1.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mgt_cost_io1.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mgt_cost_io1.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mgt_cost_io1.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mgt_cost_io1.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

