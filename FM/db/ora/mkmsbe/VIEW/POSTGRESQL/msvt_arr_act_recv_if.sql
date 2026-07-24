SELECT
	msvt_arr_act_recv_if_mst_eship_act_recv_if_if.data_lno,					/* データ行ＮＯ */
	msvt_arr_act_recv_if_mst_eship_act_recv_if_if.data_no,					/* データＮＯ */
	msvt_arr_act_recv_if_mst_eship_act_recv_if_if.exe_sts_typ,					/* ＰＧ実行状況区分 */
	msvt_arr_act_recv_if_mst_eship_act_recv_if_if.data_crud_typ,				/* データ更新区分 */
	msvt_arr_act_recv_if_mst_eship_act_recv_if_if.ext_sys_cd,					/* 外部システムＣＤ */
	msvt_arr_act_recv_if_mst_eship_act_recv_if_if.ext_data_no,					/* 外部システムデータＮＯ */
	msvt_arr_act_recv_if_mst_eship_act_recv_if_if.ext_data_lno,				/* 外部システムデータ行ＮＯ */
	msvt_arr_act_recv_if_mst_eship_act_recv_if_if.data_make_dt,				/* 送信元レコード作成日時 */
	msvt_arr_act_recv_if_mst_eship_act_recv_if_if.imp_flg,					/* 取込対象ＦＬＧ */
	msvt_arr_act_recv_if_mst_eship_act_recv_if_if.recv_dt,					/* 受信日 */
	msvt_arr_act_recv_if_mst_eship_act_recv_if_if.sppl_cd,					/* 発注先 */
	msvt_arr_act_recv_if_mst_eship_act_recv_if_if.iv_flg,					/* インボイスＦＬＧ */
	fcpa_const$get_const_val('MAC_IF_PROC_TYP','SHIP_ACT_RECV') AS if_proc_typ,	/* ＩＦ処理区分 */
	NULL AS arr_schd_no,				/* 入荷予定ＮＯ */
	msvt_arr_act_recv_if_mst_eship_act_recv_if_if.po_no,					/* 発注ＮＯ */
	msvt_arr_act_recv_if_mst_eship_act_recv_if_if.po_d_no,					/* 発注明細ＮＯ */
	NULL AS prms_rcpt_d_no,				/* 納期回答受領明細ＮＯ */
	msvt_arr_act_recv_if_mst_eship_act_recv_if_if.dlv_inst_no,					/* 納入指示ＮＯ */
	msvt_arr_act_recv_if_mst_eship_act_recv_if_if.dlv_inst_d_no,				/* 納入指示明細ＮＯ */
	NULL AS rcpt_iv_d_no,				/* 受領インボイス明細ＮＯ */
	NULL AS sls_ret_schd_d_no,			/* 売上返品予定明細ＮＯ */
	NULL AS dlv_slip_d_no,				/* 納品書明細ＮＯ */
	NULL AS iv_d_no,				/* インボイス明細ＮＯ */
	CONCAT_WS('', msvt_arr_act_recv_if_mst_eship_act_recv_if_if.sppl_cd, '-', msvt_arr_act_recv_if_mst_eship_act_recv_if_if.po_d_no, '-', msvt_arr_act_recv_if_mst_eship_act_recv_if_if.bp_dlv_slip_no, '-', msvt_arr_act_recv_if_mst_eship_act_recv_if_if.bp_dlv_slip_d_no) AS ext_arr_act_no,	/* 外部入荷実績ＮＯ */
	msvt_arr_act_recv_if_mst_eship_act_recv_if_if.dlv_schd_tm AS arr_tm,			/* 入荷日時 */
	NULL AS arr_dpt_cd,				/* 入荷部門ＣＤ */
	NULL AS arr_usr_cd,				/* 入荷担当者ＣＤ */
	msvt_arr_act_recv_if_mam_loc_loc.lg_grp_cd AS arr_lg_grp_cd,			/* 入荷物流グループＣＤ */
	msvt_arr_act_recv_if_mst_eship_act_recv_if_if.in_to_id_cd AS arr_loc_cd,			/* 入荷場所ＣＤ */
	NULL AS arr_str_ln_cd,				/* 入荷棚・ラインＣＤ */
	msvt_arr_act_recv_if_mst_eship_act_recv_if_if.itm_cd,					/* 品目ＣＤ */
	msvt_arr_act_recv_if_mst_eship_act_recv_if_if.itm_sub1,					/* 枝番１ */
	msvt_arr_act_recv_if_mst_eship_act_recv_if_if.itm_sub2,					/* 枝番２ */
	msvt_arr_act_recv_if_mst_eship_act_recv_if_if.itm_sub3,					/* 枝番３ */
	msvt_arr_act_recv_if_mst_eship_act_recv_if_if.lot_no,					/* ロットＮＯ */
	msvt_arr_act_recv_if_mst_eship_act_recv_if_if.sublot_no,					/* サブロットＮＯ */
	NULL AS ver_no,					/* 版ＮＯ */
	NULL AS gd_cd,					/* 格付ＣＤ */
	msvt_arr_act_recv_if_mst_eship_act_recv_if_if.trd_unit_qty,				/* 取引単位数量 */
	msvt_arr_act_recv_if_mst_eship_act_recv_if_if.trd_unit_cd,					/* 取引単位ＣＤ */
	'0' AS abort_flg,				/* 打切ＦＬＧ */
	msvt_arr_act_recv_if_mst_eship_act_recv_if_if.lot_no AS bp_lot_no,				/* 業者ロットＮＯ */
	msvt_arr_act_recv_if_mst_eship_act_recv_if_if.bp_dlv_slip_no,				/* 業者納品書ＮＯ */
	msvt_arr_act_recv_if_mst_eship_act_recv_if_if.bp_dlv_slip_rev,				/* 業者納品書改訂番号 */
	msvt_arr_act_recv_if_mst_eship_act_recv_if_if.bp_dlv_slip_d_no,				/* 業者納品書明細ＮＯ */
	msvt_arr_act_recv_if_mst_eship_act_recv_if_if.ship_fr_valid_dt,				/* 出荷元期限 */
	NULL AS insp_cnt_rmrks,				/* 検査連絡備考 */
	NULL AS intr_rmrks,				/* 内部備考 */
	msvt_arr_act_recv_if_mst_eship_act_recv_if_if.sub_char1,					/* 予備ＣＨＡＲ項目１ */
	msvt_arr_act_recv_if_mst_eship_act_recv_if_if.sub_char2,					/* 予備ＣＨＡＲ項目２ */
	msvt_arr_act_recv_if_mst_eship_act_recv_if_if.sub_char3,					/* 予備ＣＨＡＲ項目３ */
	msvt_arr_act_recv_if_mst_eship_act_recv_if_if.sub_char4,					/* 予備ＣＨＡＲ項目４ */
	msvt_arr_act_recv_if_mst_eship_act_recv_if_if.sub_char5,					/* 予備ＣＨＡＲ項目５ */
	msvt_arr_act_recv_if_mst_eship_act_recv_if_if.sub_char6,					/* 予備ＣＨＡＲ項目６ */
	msvt_arr_act_recv_if_mst_eship_act_recv_if_if.sub_char7,					/* 予備ＣＨＡＲ項目７ */
	msvt_arr_act_recv_if_mst_eship_act_recv_if_if.sub_char8,					/* 予備ＣＨＡＲ項目８ */
	msvt_arr_act_recv_if_mst_eship_act_recv_if_if.sub_char9,					/* 予備ＣＨＡＲ項目９ */
	msvt_arr_act_recv_if_mst_eship_act_recv_if_if.sub_char10,					/* 予備ＣＨＡＲ項目１０ */
	msvt_arr_act_recv_if_mst_eship_act_recv_if_if.sub_char11,					/* 予備ＣＨＡＲ項目１１ */
	msvt_arr_act_recv_if_mst_eship_act_recv_if_if.sub_char12,					/* 予備ＣＨＡＲ項目１２ */
	msvt_arr_act_recv_if_mst_eship_act_recv_if_if.sub_char13,					/* 予備ＣＨＡＲ項目１３ */
	msvt_arr_act_recv_if_mst_eship_act_recv_if_if.sub_char14,					/* 予備ＣＨＡＲ項目１４ */
	msvt_arr_act_recv_if_mst_eship_act_recv_if_if.sub_char15,					/* 予備ＣＨＡＲ項目１５ */
	msvt_arr_act_recv_if_mst_eship_act_recv_if_if.sub_char16,					/* 予備ＣＨＡＲ項目１６ */
	msvt_arr_act_recv_if_mst_eship_act_recv_if_if.sub_char17,					/* 予備ＣＨＡＲ項目１７ */
	msvt_arr_act_recv_if_mst_eship_act_recv_if_if.sub_char18,					/* 予備ＣＨＡＲ項目１８ */
	msvt_arr_act_recv_if_mst_eship_act_recv_if_if.sub_char19,					/* 予備ＣＨＡＲ項目１９ */
	msvt_arr_act_recv_if_mst_eship_act_recv_if_if.sub_char20,					/* 予備ＣＨＡＲ項目２０ */
	msvt_arr_act_recv_if_mst_eship_act_recv_if_if.sub_char21,					/* 予備ＣＨＡＲ項目２１ */
	msvt_arr_act_recv_if_mst_eship_act_recv_if_if.sub_char22,					/* 予備ＣＨＡＲ項目２２ */
	msvt_arr_act_recv_if_mst_eship_act_recv_if_if.sub_char23,					/* 予備ＣＨＡＲ項目２３ */
	msvt_arr_act_recv_if_mst_eship_act_recv_if_if.sub_char24,					/* 予備ＣＨＡＲ項目２４ */
	msvt_arr_act_recv_if_mst_eship_act_recv_if_if.sub_char25,					/* 予備ＣＨＡＲ項目２５ */
	msvt_arr_act_recv_if_mst_eship_act_recv_if_if.sub_char26,					/* 予備ＣＨＡＲ項目２６ */
	msvt_arr_act_recv_if_mst_eship_act_recv_if_if.sub_char27,					/* 予備ＣＨＡＲ項目２７ */
	msvt_arr_act_recv_if_mst_eship_act_recv_if_if.sub_char28,					/* 予備ＣＨＡＲ項目２８ */
	msvt_arr_act_recv_if_mst_eship_act_recv_if_if.sub_char29,					/* 予備ＣＨＡＲ項目２９ */
	msvt_arr_act_recv_if_mst_eship_act_recv_if_if.sub_char30,					/* 予備ＣＨＡＲ項目３０ */
	msvt_arr_act_recv_if_mst_eship_act_recv_if_if.sub_num1,					/* 予備ＮＵＭ項目１ */
	msvt_arr_act_recv_if_mst_eship_act_recv_if_if.sub_num2,					/* 予備ＮＵＭ項目２ */
	msvt_arr_act_recv_if_mst_eship_act_recv_if_if.sub_num3,					/* 予備ＮＵＭ項目３ */
	msvt_arr_act_recv_if_mst_eship_act_recv_if_if.sub_num4,					/* 予備ＮＵＭ項目４ */
	msvt_arr_act_recv_if_mst_eship_act_recv_if_if.sub_num5,					/* 予備ＮＵＭ項目５ */
	msvt_arr_act_recv_if_mst_eship_act_recv_if_if.sub_dt1,					/* 予備ＤＡＴＥ項目１ */
	msvt_arr_act_recv_if_mst_eship_act_recv_if_if.sub_dt2,					/* 予備ＤＡＴＥ項目２ */
	msvt_arr_act_recv_if_mst_eship_act_recv_if_if.sub_dt3,					/* 予備ＤＡＴＥ項目３ */
	msvt_arr_act_recv_if_mst_eship_act_recv_if_if.sub_dt4,					/* 予備ＤＡＴＥ項目４ */
	msvt_arr_act_recv_if_mst_eship_act_recv_if_if.sub_dt5,					/* 予備ＤＡＴＥ項目５ */
	msvt_arr_act_recv_if_mst_eship_act_recv_if_if.batch_log_no,				/* ログＮＯ */
	msvt_arr_act_recv_if_mst_eship_act_recv_if_if.log_sub_key1,				/* ログサブキー１ */
	msvt_arr_act_recv_if_mst_eship_act_recv_if_if.log_sub_key2,				/* ログサブキー２ */
	msvt_arr_act_recv_if_mst_eship_act_recv_if_if.ins_usr_id,					/* 登録ユーザＩＤ */
	msvt_arr_act_recv_if_mst_eship_act_recv_if_if.ins_usr_nm,					/* 登録ユーザ名 */
	msvt_arr_act_recv_if_mst_eship_act_recv_if_if.ins_ts,					/* 登録日時 */
	msvt_arr_act_recv_if_mst_eship_act_recv_if_if.ins_func_id,					/* 登録機能ＩＤ */
	msvt_arr_act_recv_if_mst_eship_act_recv_if_if.upd_cntr,					/* 更新カウンタ */
	msvt_arr_act_recv_if_mst_eship_act_recv_if_if.upd_usr_id,					/* 更新ユーザＩＤ */
	msvt_arr_act_recv_if_mst_eship_act_recv_if_if.upd_usr_nm,					/* 更新ユーザ名 */
	msvt_arr_act_recv_if_mst_eship_act_recv_if_if.upd_ts,					/* 更新日時 */
	msvt_arr_act_recv_if_mst_eship_act_recv_if_if.upd_func_id,					/* 更新機能ＩＤ */
	msvt_arr_act_recv_if_mst_eship_act_recv_if_if.upd_srv_req_no				/* 更新リクエストＮＯ */
FROM
	mst_eship_act_recv_if msvt_arr_act_recv_if_mst_eship_act_recv_if_if
	LEFT OUTER JOIN mam_loc msvt_arr_act_recv_if_mam_loc_loc ON (msvt_arr_act_recv_if_mst_eship_act_recv_if_if.in_to_id_cd = msvt_arr_act_recv_if_mam_loc_loc.loc_cd)
UNION ALL
SELECT
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.data_lno,					/* データ行ＮＯ */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.data_no,					/* データＮＯ */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.exe_sts_typ,					/* ＰＧ実行状況区分 */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.data_crud_typ,				/* データ更新区分 */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.ext_sys_cd,					/* 外部システムＣＤ */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.ext_data_no,					/* 外部システムデータＮＯ */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.ext_data_lno,					/* 外部システムデータ行ＮＯ */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.data_make_dt,					/* 送信元レコード作成日時 */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.imp_flg,					/* 取込対象ＦＬＧ */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.recv_dt,					/* 受信日 */
	NULL AS sppl_cd,				/* 発注先 */
	'0' AS iv_flg,					/* インボイスＦＬＧ */
	fcpa_const$get_const_val('MAC_IF_PROC_TYP','WMS_ARR_ACT_RECV') AS if_proc_typ,		/* ＩＦ処理区分 */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.arr_schd_no,					/* 入荷予定ＮＯ */
	NULL AS po_no,					/* 発注ＮＯ */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.po_d_no,					/* 発注明細ＮＯ */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.prms_rcpt_d_no,				/* 納期回答受領明細ＮＯ */
	NULL AS dlv_inst_no,				/* 納入指示ＮＯ */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.dlv_inst_d_no,				/* 納入指示明細ＮＯ */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.rcpt_iv_d_no,					/* 受領インボイス明細ＮＯ */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.sls_ret_schd_d_no,				/* 売上返品予定明細ＮＯ */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.dlv_slip_d_no,				/* 納品書明細ＮＯ */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.iv_d_no,					/* インボイス明細ＮＯ */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.ext_arr_act_no,				/* 外部入荷実績ＮＯ */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.arr_tm,					/* 入荷日時 */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.arr_dpt_cd,					/* 入荷部門ＣＤ */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.arr_usr_cd,					/* 入荷担当者ＣＤ */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.arr_lg_grp_cd,				/* 入荷物流グループＣＤ */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.arr_loc_cd,					/* 入荷場所ＣＤ */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.arr_str_ln_cd,				/* 入荷棚・ラインＣＤ */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.itm_cd,					/* 品目ＣＤ */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.itm_sub1,					/* 枝番１ */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.itm_sub2,					/* 枝番２ */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.itm_sub3,					/* 枝番３ */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.lot_no,					/* ロットＮＯ */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.sublot_no,					/* サブロットＮＯ */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.ver_no,					/* 版ＮＯ */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.gd_cd,					/* 格付ＣＤ */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.trd_unit_qty,					/* 取引単位数量 */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.trd_unit_cd,					/* 取引単位ＣＤ */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.abort_flg,					/* 打切ＦＬＧ */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.bp_lot_no,					/* 業者ロットＮＯ */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.bp_dlv_slip_no,				/* 業者納品書ＮＯ */
	NULL AS bp_dlv_slip_rev,			/* 業者納品書改訂番号 */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.bp_dlv_slip_d_no,				/* 業者納品書明細ＮＯ */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.ship_fr_valid_dt,				/* 出荷元期限 */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.insp_cnt_rmrks,				/* 検査連絡備考 */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.intr_rmrks,					/* 内部備考 */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.sub_char1,					/* 予備ＣＨＡＲ項目１ */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.sub_char2,					/* 予備ＣＨＡＲ項目２ */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.sub_char3,					/* 予備ＣＨＡＲ項目３ */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.sub_char4,					/* 予備ＣＨＡＲ項目４ */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.sub_char5,					/* 予備ＣＨＡＲ項目５ */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.sub_char6,					/* 予備ＣＨＡＲ項目６ */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.sub_char7,					/* 予備ＣＨＡＲ項目７ */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.sub_char8,					/* 予備ＣＨＡＲ項目８ */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.sub_char9,					/* 予備ＣＨＡＲ項目９ */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.sub_char10,					/* 予備ＣＨＡＲ項目１０ */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.sub_char11,					/* 予備ＣＨＡＲ項目１１ */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.sub_char12,					/* 予備ＣＨＡＲ項目１２ */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.sub_char13,					/* 予備ＣＨＡＲ項目１３ */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.sub_char14,					/* 予備ＣＨＡＲ項目１４ */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.sub_char15,					/* 予備ＣＨＡＲ項目１５ */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.sub_char16,					/* 予備ＣＨＡＲ項目１６ */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.sub_char17,					/* 予備ＣＨＡＲ項目１７ */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.sub_char18,					/* 予備ＣＨＡＲ項目１８ */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.sub_char19,					/* 予備ＣＨＡＲ項目１９ */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.sub_char20,					/* 予備ＣＨＡＲ項目２０ */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.sub_char21,					/* 予備ＣＨＡＲ項目２１ */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.sub_char22,					/* 予備ＣＨＡＲ項目２２ */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.sub_char23,					/* 予備ＣＨＡＲ項目２３ */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.sub_char24,					/* 予備ＣＨＡＲ項目２４ */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.sub_char25,					/* 予備ＣＨＡＲ項目２５ */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.sub_char26,					/* 予備ＣＨＡＲ項目２６ */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.sub_char27,					/* 予備ＣＨＡＲ項目２７ */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.sub_char28,					/* 予備ＣＨＡＲ項目２８ */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.sub_char29,					/* 予備ＣＨＡＲ項目２９ */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.sub_char30,					/* 予備ＣＨＡＲ項目３０ */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.sub_num1,					/* 予備ＮＵＭ項目１ */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.sub_num2,					/* 予備ＮＵＭ項目２ */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.sub_num3,					/* 予備ＮＵＭ項目３ */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.sub_num4,					/* 予備ＮＵＭ項目４ */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.sub_num5,					/* 予備ＮＵＭ項目５ */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.sub_dt1,					/* 予備ＤＡＴＥ項目１ */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.sub_dt2,					/* 予備ＤＡＴＥ項目２ */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.sub_dt3,					/* 予備ＤＡＴＥ項目３ */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.sub_dt4,					/* 予備ＤＡＴＥ項目４ */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.sub_dt5,					/* 予備ＤＡＴＥ項目５ */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.batch_log_no,					/* ログＮＯ */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.log_sub_key1,					/* ログサブキー１ */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.log_sub_key2,					/* ログサブキー２ */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.ins_usr_id,					/* 登録ユーザＩＤ */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.ins_usr_nm,					/* 登録ユーザ名 */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.ins_ts,					/* 登録日時 */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.ins_func_id,					/* 登録機能ＩＤ */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.upd_cntr,					/* 更新カウンタ */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.upd_usr_id,					/* 更新ユーザＩＤ */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.upd_usr_nm,					/* 更新ユーザ名 */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.upd_ts,					/* 更新日時 */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.upd_func_id,					/* 更新機能ＩＤ */
	msvt_arr_act_recv_if_mst_arr_act_recv_if_t.upd_srv_req_no				/* 更新リクエストＮＯ */
FROM
	mst_arr_act_recv_if msvt_arr_act_recv_if_mst_arr_act_recv_if_t
;
