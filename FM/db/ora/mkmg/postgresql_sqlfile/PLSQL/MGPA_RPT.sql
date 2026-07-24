\encoding UTF-8

CREATE OR REPLACE FUNCTION mgpa_rpt$f_check_row_cd (
	IN i_rpt_row_cd	VARCHAR,
	IN i_recx	mgt_rpt[]
)
RETURNS INTEGER
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	指定された行番号を持つi_recxに対しての格納番号を返す
<REMARKS>
	まだ未作成のときは0を返す
<ARGUMENTS>
<IN>	i_rpt_row_cd
		レポート行ＣＤ
<IN>	i_recx
		mgt_rptの配列
<RETURNVALUE>
	対象となる格納番号
<HISTORY>
**********************************************************/
BEGIN
	IF COALESCE(array_length(i_recx, 1), 0) > 0 THEN
		FOR i in 1 ..COALESCE(array_length(i_recx, 1), 0) LOOP
			IF i_recx[i].rpt_row_cd = i_rpt_row_cd THEN
				RETURN i ;
			END IF ;
		END LOOP ;
	END IF ;

	RETURN 0 ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_rpt$p_get_val (
	IN i_rpt_key	RECORD,
	IN i_rpt_ptn_cd	VARCHAR,
	IN i_rpt_row_cd	VARCHAR,
	IN i_wg_cd	VARCHAR,
	IN i_arg	mgt_arg,
	INOUT o_recx	mgt_rpt[],
	INOUT o_val	NUMERIC
)
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	指定された行番号を持つo_recxに対するレポート値を返す
	まだ未作成のときは対象となる値を作成したのちにその値を返す
<REMARKS>
<ARGUMENTS>
<IN>	i_rpt_key
		レポートキー
<IN>	i_rpt_ptn_cd
		レポートパタンＣＤ
<IN>	i_rpt_row_cd
		レポート行ＣＤ
<IN>	i_wg_cd
		ワーキンググループＣＤ
<IN>	i_arg
		mgt_argのレコード
<INOUT>	o_recx
		mgt_rptの配列
<INOUT>	o_val
		対象となるレポート値
<HISTORY>
**********************************************************/
DECLARE
	c_itm_grp1	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP1') ;
	c_itm_grp2	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP2') ;
	c_itm_grp3	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP3') ;
	c_itm_grp4	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP4') ;
	c_itm_grp5	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP5') ;
	c_itm_grp6	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP6') ;
	c_itm_grp7	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP7') ;
	c_itm_grp8	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP8') ;
	c_itm_grp9	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP9') ;
	c_itm_grp10	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP10') ;

	c_rpt_tgt_alc	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_RPT_TGT_TYP','ALC') ;
	c_rpt_tgt_stk_loss	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_RPT_TGT_TYP','STK_LOSS') ;
	c_rpt_tgt_in_onr_diff	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_RPT_TGT_TYP','IN_ONR_DIFF') ;
	c_rpt_tgt_st_diff	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_RPT_TGT_TYP','ST_DIFF') ;
	c_rpt_tgt_purc_amt	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_RPT_TGT_TYP','PURC_AMT') ;
	c_rpt_tgt_sls_amt	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_RPT_TGT_TYP','SLS_AMT') ;
	c_rpt_tgt_io_amt	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_RPT_TGT_TYP','IO_AMT') ;
	c_rpt_tgt_outsrc_amt	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_RPT_TGT_TYP','OUTSRC_AMT') ;
	c_rpt_tgt_outsrc_pay_amt	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_RPT_TGT_TYP','OUTSRC_PAY_AMT') ;
	c_rpt_tgt_st_stk	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_RPT_TGT_TYP','ST_STK') ;
	c_rpt_tgt_st_wip	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_RPT_TGT_TYP','ST_WIP') ;
	c_rpt_tgt_st_stkwip	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_RPT_TGT_TYP','ST_STKWIP') ;
	c_rpt_tgt_end_stk	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_RPT_TGT_TYP','END_STK') ;
	c_rpt_tgt_end_wip	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_RPT_TGT_TYP','END_WIP') ;
	c_rpt_tgt_end_stkwip	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_RPT_TGT_TYP','END_STKWIP') ;
	c_rpt_tgt_gp_alc	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_RPT_TGT_TYP','GP_ALC') ;
	c_rpt_tgt_diff_qty	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_RPT_TGT_TYP','DIFF_QTY') ;
	c_rpt_tgt_diff_up	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_RPT_TGT_TYP','DIFF_UP') ;
	c_rpt_tgt_diff_outsrc	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_RPT_TGT_TYP','DIFF_OUTSRC') ;
	c_rpt_tgt_diff_ss	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_RPT_TGT_TYP','DIFF_SS') ;
	c_rpt_tgt_diff_wk	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_RPT_TGT_TYP','DIFF_WK') ;
	c_rpt_tgt_diff_a	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_RPT_TGT_TYP','DIFF_A') ;
	c_rpt_tgt_diff_b	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_RPT_TGT_TYP','DIFF_B') ;
	c_rpt_tgt_diff_c	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_RPT_TGT_TYP','DIFF_C') ;
	c_rpt_tgt_diff_d	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_RPT_TGT_TYP','DIFF_D') ;
	c_rpt_tgt_diff_e	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_RPT_TGT_TYP','DIFF_E') ;
	c_rpt_tgt_diff_rt	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_RPT_TGT_TYP','DIFF_RT') ;
	c_rpt_tgt_diff_std	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_RPT_TGT_TYP','DIFF_STD') ;
	c_rpt_tgt_diff_inst	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_RPT_TGT_TYP','DIFF_INST') ;
	c_rpt_tgt_diff_io_pri	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_RPT_TGT_TYP','DIFF_IO_PRI') ;
	c_rpt_tgt_diff_qty_chd	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_RPT_TGT_TYP','DIFF_QTY_CHD') ;
	c_rpt_tgt_diff_up_chd	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_RPT_TGT_TYP','DIFF_UP_CHD') ;
	c_rpt_tgt_diff_ss_chd	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_RPT_TGT_TYP','DIFF_SS_CHD') ;

	c_ac_slip_in_ss	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','IN_SS') ;

	c_calc_rec_st_stk	CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_CALC_REC_TYP','ST_STK') ;
	c_calc_rec_purc	CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_CALC_REC_TYP','PURC') ;
	c_calc_rec_io	CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_CALC_REC_TYP','IO') ;
	c_calc_rec_inpt	CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_CALC_REC_TYP','INPT') ;
	c_calc_rec_sls	CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_CALC_REC_TYP','SLS') ;
	c_calc_rec_end_stk	CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_CALC_REC_TYP','END_STK') ;
	c_calc_rec_st_wip	CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_CALC_REC_TYP','ST_WIP') ;
	c_calc_rec_end_wip	CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_CALC_REC_TYP','END_WIP') ;
	c_calc_rec_inst	CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_CALC_REC_TYP','INST') ;
	c_calc_rec_gp_alc	CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_CALC_REC_TYP','GP_ALC') ;

	c_rndoff	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_RND_TYP','RNDOFF') ;

	c_qty_unit_dim	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_QTY_UNIT_TYP','DIM') ;
	c_qty_unit_wt	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_QTY_UNIT_TYP','WT') ;
	c_qty_unit_conts	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_QTY_UNIT_TYP','CONTS') ;

	c_asst_prod	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ASST_TYP','CO_PROD') ;
	c_asst_sls	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ASST_TYP','CO_SLS') ;
	c_asst_oth	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ASST_TYP','OTH') ;

	l_row	mam_rpt_conf%ROWTYPE ;
	l_tmp_rpt	mgt_rpt%ROWTYPE ;

	l_tmp	NUMERIC := 0 ;

	l_ym	mgt_acc_top.ym%TYPE ;

	l_calc_rec_typ	mgt_acc_top.calc_rec_typ%TYPE ;
	l_calc_rec_typ1	mgt_acc_top.calc_rec_typ%TYPE ;
	l_calc_rec_typ2	mgt_acc_top.calc_rec_typ%TYPE ;
	l_stk_calc_grp_cd	mam_calc_grp.calc_grp_cd%TYPE ;

	idx	INTEGER := 0 ;
	l_itm_flg	CHAR(1) ;
	l_alc_flg	CHAR(1) ;
	l_msg	VARCHAR[] ;
	x	RECORD ;
BEGIN
	<<FUNC_FIN>>
	BEGIN
		o_val := 0 ;
		BEGIN
			SELECT	m.*
			INTO STRICT	l_row
			FROM	mam_rpt_conf m
			WHERE	0=0
			AND	m.rpt_ptn_cd = i_rpt_ptn_cd
			AND	m.rpt_row_cd = i_rpt_row_cd
			AND	m.del_flg = '0'
			;
		EXCEPTION
			WHEN others THEN
				RETURN ;
		END ;

		IF l_row.sml_flg = '1' THEN
			FOR x IN
				SELECT	m.tgt_rpt_row_cd,
					m.minus_flg
				FROM	mam_rpt_row_sml m
				WHERE	0=0
				AND	m.rpt_ptn_cd = l_row.rpt_ptn_cd
				AND	m.sml_rpt_row_cd = l_row.rpt_row_cd
			LOOP
				idx := mgpa_rpt$f_check_row_cd(x.tgt_rpt_row_cd, o_recx) ;
				IF idx = 0 THEN
					IF (SELECT COUNT(*) FROM mgpa_rpt$rpt_row_loop WHERE _index_ = x.tgt_rpt_row_cd) > 0 THEN
						l_msg := fcpa_err$msg_binder(l_row.rpt_ptn_cd, l_row.rpt_row_cd, x.tgt_rpt_row_cd) ;
						CALL fcpa_err$raise_app_err('MGBXD0024', l_msg) ;
					ELSE
						INSERT INTO mgpa_rpt$rpt_row_loop (_elem_, _index_) VALUES ('1', x.tgt_rpt_row_cd) ;
					END IF ;

					CALL mgpa_rpt$p_get_val(i_rpt_key, i_rpt_ptn_cd, x.tgt_rpt_row_cd, i_wg_cd, i_arg, o_recx, l_tmp) ;

					DELETE FROM	mgpa_rpt$rpt_row_loop t WHERE t._index_ = x.tgt_rpt_row_cd ;
				ELSE
					l_tmp := o_recx[idx].rpt_val ;
				END IF ;

				IF x.minus_flg = '0' THEN
					o_val := o_val + l_tmp ;
				ELSE
					o_val := o_val - l_tmp ;
				END IF ;
			END LOOP ;

			EXIT FUNC_FIN ;
		END IF ;

		IF l_row.itm_jnl_cd IS NULL
		AND l_row.itm_grp_cd1 IS NULL
		AND l_row.itm_grp_cd2 IS NULL
		AND l_row.itm_grp_cd3 IS NULL
		AND l_row.itm_grp_cd4 IS NULL
		AND l_row.itm_grp_cd5 IS NULL
		AND l_row.itm_grp_cd6 IS NULL
		AND l_row.itm_grp_cd7 IS NULL
		AND l_row.itm_grp_cd8 IS NULL
		AND l_row.itm_grp_cd9 IS NULL
		AND l_row.itm_grp_cd10 IS NULL
		AND i_rpt_key.itm_jnl_cd IS NULL
		AND i_rpt_key.itm_grp_typ IS NULL
		THEN
			l_itm_flg := '0' ;
		ELSE
			l_itm_flg := '1' ;
		END IF ;

		IF l_row.alc_ac_grp_cd1 IS NULL
		AND l_row.alc_ac_grp_cd2 IS NULL
		AND l_row.alc_ac_grp_cd3 IS NULL
		THEN
			l_alc_flg := '0' ;
		ELSE
			l_alc_flg := '1' ;
		END IF ;

		IF l_row.rpt_tgt_typ = c_rpt_tgt_alc THEN
			IF l_row.qty_unit_typ IS NOT NULL THEN
				EXIT FUNC_FIN ;
			END IF ;

			IF l_itm_flg = '0' THEN

				IF l_alc_flg = '0' THEN
					SELECT /*+ IndexScan(mgt_alc_calc_dtl_mgt_alc_calc_dtl_all_org mgt_alc_calc_dtl_all_ie02) */
						CASE l_row.std_flg
							WHEN '1' THEN SUM(t1.std_alc_amt)
							ELSE SUM(t1.alc_amt + t1.adj_amt)
						END
					INTO STRICT	o_val
					FROM	mgt_alc_calc_dtl t1, mgt_alc_calc_rate t2,
						mam_expns m2
					WHERE	0=0
					AND	t1.calc_no = i_arg.calc_no
					AND	t1.calc_grp_cd = i_arg.calc_grp_cd
					AND	t1.wg_cd = i_wg_cd
					AND	t2.calc_no = i_arg.calc_no
					AND	t2.calc_grp_cd = i_arg.calc_grp_cd
					AND	t1.calc_no = t2.calc_no
					AND	t1.calc_grp_cd = t2.calc_grp_cd
					AND	t1.alc_grp_id = t2.alc_grp_id
					AND	t2.expns_cd = m2.expns_cd
					AND	m2.del_flg = '0'
					AND	(l_row.ac_slip_typ IS NULL OR l_row.ac_slip_typ = t1.ac_slip_typ)
					AND	(l_row.ac_rsn_cd IS NULL OR l_row.ac_rsn_cd = t1.ac_rsn_cd)
					AND	(l_row.expns_typ IS NULL OR l_row.expns_typ = m2.expns_typ)
					AND	(l_row.direct_typ IS NULL OR l_row.direct_typ = m2.direct_typ)
					AND	(l_row.var_typ IS NULL OR l_row.var_typ = m2.var_typ)
					AND	(l_row.expns_grp_cd IS NULL OR l_row.expns_grp_cd = m2.expns_grp_cd)
					AND	(l_row.expns_cd IS NULL OR l_row.expns_cd = t2.expns_cd)
					AND	(l_row.alc_ac_cd IS NULL OR l_row.alc_ac_cd = t2.alc_ac_cd)
					AND	(l_row.asst_typ IS NULL OR l_row.asst_typ = t1.asst_typ)
					AND	(i_rpt_key.dpt_cd IS NULL OR i_rpt_key.dpt_cd = t1.mng_dpt_cd)
					AND	(i_rpt_key.itm_cd IS NULL OR i_rpt_key.itm_cd = t1.itm_cd)
					AND	(i_rpt_key.itm_sub1 IS NULL OR i_rpt_key.itm_sub1 = t1.itm_sub1)
					AND	(i_rpt_key.itm_sub2 IS NULL OR i_rpt_key.itm_sub2 = t1.itm_sub2)
					AND	(i_rpt_key.itm_sub3 IS NULL OR i_rpt_key.itm_sub3 = t1.itm_sub3)
					;
				ELSE
					SELECT /*+ IndexScan(mgt_alc_calc_dtl_mgt_alc_calc_dtl_all_org mgt_alc_calc_dtl_all_ie02) */
						CASE l_row.std_flg
							WHEN '1' THEN SUM(t1.std_alc_amt)
							ELSE SUM(t1.alc_amt + t1.adj_amt)
						END
					INTO STRICT	o_val
					FROM	mgt_alc_calc_dtl t1, mgt_alc_calc_rate t2,
						mam_expns m2, mam_alc_ac m3
					WHERE	0=0
					AND	t1.calc_no = i_arg.calc_no
					AND	t1.calc_grp_cd = i_arg.calc_grp_cd
					AND	t1.wg_cd = i_wg_cd
					AND	t2.calc_no = i_arg.calc_no
					AND	t2.calc_grp_cd = i_arg.calc_grp_cd
					AND	t1.calc_no = t2.calc_no
					AND	t1.calc_grp_cd = t2.calc_grp_cd
					AND	t1.alc_grp_id = t2.alc_grp_id
					AND	t2.expns_cd = m2.expns_cd
					AND	m2.del_flg = '0'
					AND	t2.alc_ac_cd = m3.alc_ac_cd
					AND	m3.del_flg = '0'
					AND	(l_row.ac_slip_typ IS NULL OR l_row.ac_slip_typ = t1.ac_slip_typ)
					AND	(l_row.ac_rsn_cd IS NULL OR l_row.ac_rsn_cd = t1.ac_rsn_cd)
					AND	(l_row.expns_typ IS NULL OR l_row.expns_typ = m2.expns_typ)
					AND	(l_row.direct_typ IS NULL OR l_row.direct_typ = m2.direct_typ)
					AND	(l_row.var_typ IS NULL OR l_row.var_typ = m2.var_typ)
					AND	(l_row.expns_grp_cd IS NULL OR l_row.expns_grp_cd = m2.expns_grp_cd)
					AND	(l_row.expns_cd IS NULL OR l_row.expns_cd = t2.expns_cd)
					AND	(l_row.alc_ac_grp_cd1 IS NULL OR l_row.alc_ac_grp_cd1 = m3.alc_ac_grp_cd1)
					AND	(l_row.alc_ac_grp_cd2 IS NULL OR l_row.alc_ac_grp_cd2 = m3.alc_ac_grp_cd2)
					AND	(l_row.alc_ac_grp_cd3 IS NULL OR l_row.alc_ac_grp_cd3 = m3.alc_ac_grp_cd3)
					AND	(l_row.alc_ac_cd IS NULL OR l_row.alc_ac_cd = t2.alc_ac_cd)
					AND	(l_row.asst_typ IS NULL OR l_row.asst_typ = t1.asst_typ)
					AND	(i_rpt_key.dpt_cd IS NULL OR i_rpt_key.dpt_cd = t1.mng_dpt_cd)
					AND	(i_rpt_key.itm_cd IS NULL OR i_rpt_key.itm_cd = t1.itm_cd)
					AND	(i_rpt_key.itm_sub1 IS NULL OR i_rpt_key.itm_sub1 = t1.itm_sub1)
					AND	(i_rpt_key.itm_sub2 IS NULL OR i_rpt_key.itm_sub2 = t1.itm_sub2)
					AND	(i_rpt_key.itm_sub3 IS NULL OR i_rpt_key.itm_sub3 = t1.itm_sub3)
					;
				END IF ;
			ELSE
				IF l_alc_flg = '0' THEN
					SELECT /*+ IndexScan(mgt_alc_calc_dtl_mgt_alc_calc_dtl_all_org mgt_alc_calc_dtl_all_ie02) */
						CASE l_row.std_flg
							WHEN '1' THEN SUM(t1.std_alc_amt)
							ELSE SUM(t1.alc_amt + t1.adj_amt)
						END
					INTO STRICT	o_val
					FROM	mgt_alc_calc_dtl t1, mgt_alc_calc_rate t2,
						mam_itm_srch m1, mam_expns m2
					WHERE	0=0
					AND	t1.calc_no = i_arg.calc_no
					AND	t1.calc_grp_cd = i_arg.calc_grp_cd
					AND	t1.wg_cd = i_wg_cd
					AND	t2.calc_no = i_arg.calc_no
					AND	t2.calc_grp_cd = i_arg.calc_grp_cd
					AND	t1.calc_no = t2.calc_no
					AND	t1.calc_grp_cd = t2.calc_grp_cd
					AND	t1.alc_grp_id = t2.alc_grp_id
					AND	t1.itm_cd = m1.itm_cd
					AND	t1.itm_sub1 = m1.itm_sub1
					AND	t1.itm_sub2 = m1.itm_sub2
					AND	t1.itm_sub3 = m1.itm_sub3
					AND	m1.release_flg = '1'
					AND	t2.expns_cd = m2.expns_cd
					AND	m2.del_flg = '0'
					AND	(l_row.itm_jnl_cd IS NULL OR l_row.itm_jnl_cd = m1.itm_jnl_cd)
					AND	(l_row.itm_grp_cd1 IS NULL OR l_row.itm_grp_cd1 = m1.itm_grp_cd1)
					AND	(l_row.itm_grp_cd2 IS NULL OR l_row.itm_grp_cd2 = m1.itm_grp_cd2)
					AND	(l_row.itm_grp_cd3 IS NULL OR l_row.itm_grp_cd3 = m1.itm_grp_cd3)
					AND	(l_row.itm_grp_cd4 IS NULL OR l_row.itm_grp_cd4 = m1.itm_grp_cd4)
					AND	(l_row.itm_grp_cd5 IS NULL OR l_row.itm_grp_cd5 = m1.itm_grp_cd5)
					AND	(l_row.itm_grp_cd6 IS NULL OR l_row.itm_grp_cd6 = m1.itm_grp_cd6)
					AND	(l_row.itm_grp_cd7 IS NULL OR l_row.itm_grp_cd7 = m1.itm_grp_cd7)
					AND	(l_row.itm_grp_cd8 IS NULL OR l_row.itm_grp_cd8 = m1.itm_grp_cd8)
					AND	(l_row.itm_grp_cd9 IS NULL OR l_row.itm_grp_cd9 = m1.itm_grp_cd9)
					AND	(l_row.itm_grp_cd10 IS NULL OR l_row.itm_grp_cd10 = m1.itm_grp_cd10)
					AND	(l_row.ac_slip_typ IS NULL OR l_row.ac_slip_typ = t1.ac_slip_typ)
					AND	(l_row.ac_rsn_cd IS NULL OR l_row.ac_rsn_cd = t1.ac_rsn_cd)
					AND	(l_row.expns_typ IS NULL OR l_row.expns_typ = m2.expns_typ)
					AND	(l_row.direct_typ IS NULL OR l_row.direct_typ = m2.direct_typ)
					AND	(l_row.var_typ IS NULL OR l_row.var_typ = m2.var_typ)
					AND	(l_row.expns_grp_cd IS NULL OR l_row.expns_grp_cd = m2.expns_grp_cd)
					AND	(l_row.expns_cd IS NULL OR l_row.expns_cd = t2.expns_cd)
					AND	(l_row.alc_ac_cd IS NULL OR l_row.alc_ac_cd = t2.alc_ac_cd)
					AND	(l_row.asst_typ IS NULL OR l_row.asst_typ = t1.asst_typ)
					AND	(i_rpt_key.dpt_cd IS NULL OR i_rpt_key.dpt_cd = t1.mng_dpt_cd)
					AND	(i_rpt_key.itm_cd IS NULL OR i_rpt_key.itm_cd = t1.itm_cd)
					AND	(i_rpt_key.itm_sub1 IS NULL OR i_rpt_key.itm_sub1 = t1.itm_sub1)
					AND	(i_rpt_key.itm_sub2 IS NULL OR i_rpt_key.itm_sub2 = t1.itm_sub2)
					AND	(i_rpt_key.itm_sub3 IS NULL OR i_rpt_key.itm_sub3 = t1.itm_sub3)
					AND	(i_rpt_key.itm_jnl_cd IS NULL OR i_rpt_key.itm_jnl_cd = m1.itm_jnl_cd)
					AND	(i_rpt_key.itm_grp_typ IS NULL OR
							i_rpt_key.itm_grp_cd =
								CASE
									WHEN i_rpt_key.itm_grp_typ = c_itm_grp1 THEN m1.itm_grp_cd1
									WHEN i_rpt_key.itm_grp_typ = c_itm_grp2 THEN m1.itm_grp_cd2
									WHEN i_rpt_key.itm_grp_typ = c_itm_grp3 THEN m1.itm_grp_cd3
									WHEN i_rpt_key.itm_grp_typ = c_itm_grp4 THEN m1.itm_grp_cd4
									WHEN i_rpt_key.itm_grp_typ = c_itm_grp5 THEN m1.itm_grp_cd5
									WHEN i_rpt_key.itm_grp_typ = c_itm_grp6 THEN m1.itm_grp_cd6
									WHEN i_rpt_key.itm_grp_typ = c_itm_grp7 THEN m1.itm_grp_cd7
									WHEN i_rpt_key.itm_grp_typ = c_itm_grp8 THEN m1.itm_grp_cd8
									WHEN i_rpt_key.itm_grp_typ = c_itm_grp9 THEN m1.itm_grp_cd9
									WHEN i_rpt_key.itm_grp_typ = c_itm_grp10 THEN m1.itm_grp_cd10
									ELSE NULL
								END
						)
					;
				ELSE
					SELECT /*+ IndexScan(mgt_alc_calc_dtl_mgt_alc_calc_dtl_all_org mgt_alc_calc_dtl_all_ie02) */
						CASE l_row.std_flg
							WHEN '1' THEN SUM(t1.std_alc_amt)
							ELSE SUM(t1.alc_amt + t1.adj_amt)
						END
					INTO STRICT	o_val
					FROM	mgt_alc_calc_dtl t1, mgt_alc_calc_rate t2,
						mam_itm_srch m1, mam_expns m2, mam_alc_ac m3
					WHERE	0=0
					AND	t1.calc_no = i_arg.calc_no
					AND	t1.calc_grp_cd = i_arg.calc_grp_cd
					AND	t1.wg_cd = i_wg_cd
					AND	t2.calc_no = i_arg.calc_no
					AND	t2.calc_grp_cd = i_arg.calc_grp_cd
					AND	t1.calc_no = t2.calc_no
					AND	t1.calc_grp_cd = t2.calc_grp_cd
					AND	t1.alc_grp_id = t2.alc_grp_id
					AND	t1.itm_cd = m1.itm_cd
					AND	t1.itm_sub1 = m1.itm_sub1
					AND	t1.itm_sub2 = m1.itm_sub2
					AND	t1.itm_sub3 = m1.itm_sub3
					AND	m1.release_flg = '1'
					AND	t2.expns_cd = m2.expns_cd
					AND	m2.del_flg = '0'
					AND	t2.alc_ac_cd = m3.alc_ac_cd
					AND	m3.del_flg = '0'
					AND	(l_row.itm_jnl_cd IS NULL OR l_row.itm_jnl_cd = m1.itm_jnl_cd)
					AND	(l_row.itm_grp_cd1 IS NULL OR l_row.itm_grp_cd1 = m1.itm_grp_cd1)
					AND	(l_row.itm_grp_cd2 IS NULL OR l_row.itm_grp_cd2 = m1.itm_grp_cd2)
					AND	(l_row.itm_grp_cd3 IS NULL OR l_row.itm_grp_cd3 = m1.itm_grp_cd3)
					AND	(l_row.itm_grp_cd4 IS NULL OR l_row.itm_grp_cd4 = m1.itm_grp_cd4)
					AND	(l_row.itm_grp_cd5 IS NULL OR l_row.itm_grp_cd5 = m1.itm_grp_cd5)
					AND	(l_row.itm_grp_cd6 IS NULL OR l_row.itm_grp_cd6 = m1.itm_grp_cd6)
					AND	(l_row.itm_grp_cd7 IS NULL OR l_row.itm_grp_cd7 = m1.itm_grp_cd7)
					AND	(l_row.itm_grp_cd8 IS NULL OR l_row.itm_grp_cd8 = m1.itm_grp_cd8)
					AND	(l_row.itm_grp_cd9 IS NULL OR l_row.itm_grp_cd9 = m1.itm_grp_cd9)
					AND	(l_row.itm_grp_cd10 IS NULL OR l_row.itm_grp_cd10 = m1.itm_grp_cd10)
					AND	(l_row.ac_slip_typ IS NULL OR l_row.ac_slip_typ = t1.ac_slip_typ)
					AND	(l_row.ac_rsn_cd IS NULL OR l_row.ac_rsn_cd = t1.ac_rsn_cd)
					AND	(l_row.expns_typ IS NULL OR l_row.expns_typ = m2.expns_typ)
					AND	(l_row.direct_typ IS NULL OR l_row.direct_typ = m2.direct_typ)
					AND	(l_row.var_typ IS NULL OR l_row.var_typ = m2.var_typ)
					AND	(l_row.expns_grp_cd IS NULL OR l_row.expns_grp_cd = m2.expns_grp_cd)
					AND	(l_row.expns_cd IS NULL OR l_row.expns_cd = t2.expns_cd)
					AND	(l_row.alc_ac_grp_cd1 IS NULL OR l_row.alc_ac_grp_cd1 = m3.alc_ac_grp_cd1)
					AND	(l_row.alc_ac_grp_cd2 IS NULL OR l_row.alc_ac_grp_cd2 = m3.alc_ac_grp_cd2)
					AND	(l_row.alc_ac_grp_cd3 IS NULL OR l_row.alc_ac_grp_cd3 = m3.alc_ac_grp_cd3)
					AND	(l_row.alc_ac_cd IS NULL OR l_row.alc_ac_cd = t2.alc_ac_cd)
					AND	(l_row.asst_typ IS NULL OR l_row.asst_typ = t1.asst_typ)
					AND	(i_rpt_key.dpt_cd IS NULL OR i_rpt_key.dpt_cd = t1.mng_dpt_cd)
					AND	(i_rpt_key.itm_cd IS NULL OR i_rpt_key.itm_cd = t1.itm_cd)
					AND	(i_rpt_key.itm_sub1 IS NULL OR i_rpt_key.itm_sub1 = t1.itm_sub1)
					AND	(i_rpt_key.itm_sub2 IS NULL OR i_rpt_key.itm_sub2 = t1.itm_sub2)
					AND	(i_rpt_key.itm_sub3 IS NULL OR i_rpt_key.itm_sub3 = t1.itm_sub3)
					AND	(i_rpt_key.itm_jnl_cd IS NULL OR i_rpt_key.itm_jnl_cd = m1.itm_jnl_cd)
					AND	(i_rpt_key.itm_grp_typ IS NULL OR
							i_rpt_key.itm_grp_cd =
								CASE
									WHEN i_rpt_key.itm_grp_typ = c_itm_grp1 THEN m1.itm_grp_cd1
									WHEN i_rpt_key.itm_grp_typ = c_itm_grp2 THEN m1.itm_grp_cd2
									WHEN i_rpt_key.itm_grp_typ = c_itm_grp3 THEN m1.itm_grp_cd3
									WHEN i_rpt_key.itm_grp_typ = c_itm_grp4 THEN m1.itm_grp_cd4
									WHEN i_rpt_key.itm_grp_typ = c_itm_grp5 THEN m1.itm_grp_cd5
									WHEN i_rpt_key.itm_grp_typ = c_itm_grp6 THEN m1.itm_grp_cd6
									WHEN i_rpt_key.itm_grp_typ = c_itm_grp7 THEN m1.itm_grp_cd7
									WHEN i_rpt_key.itm_grp_typ = c_itm_grp8 THEN m1.itm_grp_cd8
									WHEN i_rpt_key.itm_grp_typ = c_itm_grp9 THEN m1.itm_grp_cd9
									WHEN i_rpt_key.itm_grp_typ = c_itm_grp10 THEN m1.itm_grp_cd10
									ELSE NULL
								END
						)
					;
				END IF ;

			END IF ;

			EXIT FUNC_FIN ;
		END IF ;

		IF l_row.rpt_tgt_typ = c_rpt_tgt_stk_loss THEN
			IF l_row.qty_unit_typ IS NOT NULL THEN
				EXIT FUNC_FIN ;
			END IF ;

			IF l_itm_flg = '0' THEN
				SELECT	SUM(t1.amt)
				INTO STRICT	o_val
				FROM	mgt_stk_loss t1
				WHERE	0=0
				AND	t1.calc_no = i_arg.calc_no
				AND	t1.calc_grp_cd = i_arg.calc_grp_cd
				AND	t1.wg_cd = i_wg_cd
				AND	(l_row.asst_typ IS NULL OR l_row.asst_typ = t1.asst_typ)
				AND	(i_rpt_key.dpt_cd IS NULL OR i_rpt_key.dpt_cd = t1.mng_dpt_cd)
				AND	(i_rpt_key.itm_cd IS NULL OR i_rpt_key.itm_cd = t1.itm_cd)
				AND	(i_rpt_key.itm_sub1 IS NULL OR i_rpt_key.itm_sub1 = t1.itm_sub1)
				AND	(i_rpt_key.itm_sub2 IS NULL OR i_rpt_key.itm_sub2 = t1.itm_sub2)
				AND	(i_rpt_key.itm_sub3 IS NULL OR i_rpt_key.itm_sub3 = t1.itm_sub3)
				;
			ELSE
				SELECT
					SUM(t1.amt)
				INTO STRICT	o_val
				FROM	mgt_stk_loss t1, mam_itm_srch m1
				WHERE	0=0
				AND	t1.calc_no = i_arg.calc_no
				AND	t1.calc_grp_cd = i_arg.calc_grp_cd
				AND	t1.wg_cd = i_wg_cd
				AND	t1.itm_cd = m1.itm_cd
				AND	t1.itm_sub1 = m1.itm_sub1
				AND	t1.itm_sub2 = m1.itm_sub2
				AND	t1.itm_sub3 = m1.itm_sub3
				AND	m1.release_flg = '1'
				AND	(l_row.itm_jnl_cd IS NULL OR l_row.itm_jnl_cd = m1.itm_jnl_cd)
				AND	(l_row.itm_grp_cd1 IS NULL OR l_row.itm_grp_cd1 = m1.itm_grp_cd1)
				AND	(l_row.itm_grp_cd2 IS NULL OR l_row.itm_grp_cd2 = m1.itm_grp_cd2)
				AND	(l_row.itm_grp_cd3 IS NULL OR l_row.itm_grp_cd3 = m1.itm_grp_cd3)
				AND	(l_row.itm_grp_cd4 IS NULL OR l_row.itm_grp_cd4 = m1.itm_grp_cd4)
				AND	(l_row.itm_grp_cd5 IS NULL OR l_row.itm_grp_cd5 = m1.itm_grp_cd5)
				AND	(l_row.itm_grp_cd6 IS NULL OR l_row.itm_grp_cd6 = m1.itm_grp_cd6)
				AND	(l_row.itm_grp_cd7 IS NULL OR l_row.itm_grp_cd7 = m1.itm_grp_cd7)
				AND	(l_row.itm_grp_cd8 IS NULL OR l_row.itm_grp_cd8 = m1.itm_grp_cd8)
				AND	(l_row.itm_grp_cd9 IS NULL OR l_row.itm_grp_cd9 = m1.itm_grp_cd9)
				AND	(l_row.itm_grp_cd10 IS NULL OR l_row.itm_grp_cd10 = m1.itm_grp_cd10)
				AND	(l_row.asst_typ IS NULL OR l_row.asst_typ = t1.asst_typ)
				AND	(i_rpt_key.dpt_cd IS NULL OR i_rpt_key.dpt_cd = t1.mng_dpt_cd)
				AND	(i_rpt_key.itm_cd IS NULL OR i_rpt_key.itm_cd = t1.itm_cd)
				AND	(i_rpt_key.itm_sub1 IS NULL OR i_rpt_key.itm_sub1 = t1.itm_sub1)
				AND	(i_rpt_key.itm_sub2 IS NULL OR i_rpt_key.itm_sub2 = t1.itm_sub2)
				AND	(i_rpt_key.itm_sub3 IS NULL OR i_rpt_key.itm_sub3 = t1.itm_sub3)
				AND	(i_rpt_key.itm_jnl_cd IS NULL OR i_rpt_key.itm_jnl_cd = m1.itm_jnl_cd)
				AND	(i_rpt_key.itm_grp_typ IS NULL OR
						i_rpt_key.itm_grp_cd =
							CASE
								WHEN i_rpt_key.itm_grp_typ = c_itm_grp1 THEN m1.itm_grp_cd1
								WHEN i_rpt_key.itm_grp_typ = c_itm_grp2 THEN m1.itm_grp_cd2
								WHEN i_rpt_key.itm_grp_typ = c_itm_grp3 THEN m1.itm_grp_cd3
								WHEN i_rpt_key.itm_grp_typ = c_itm_grp4 THEN m1.itm_grp_cd4
								WHEN i_rpt_key.itm_grp_typ = c_itm_grp5 THEN m1.itm_grp_cd5
								WHEN i_rpt_key.itm_grp_typ = c_itm_grp6 THEN m1.itm_grp_cd6
								WHEN i_rpt_key.itm_grp_typ = c_itm_grp7 THEN m1.itm_grp_cd7
								WHEN i_rpt_key.itm_grp_typ = c_itm_grp8 THEN m1.itm_grp_cd8
								WHEN i_rpt_key.itm_grp_typ = c_itm_grp9 THEN m1.itm_grp_cd9
								WHEN i_rpt_key.itm_grp_typ = c_itm_grp10 THEN m1.itm_grp_cd10
								ELSE NULL
							END
					)
				;
			END IF ;

			EXIT FUNC_FIN ;
		END IF ;

		IF l_row.rpt_tgt_typ = c_rpt_tgt_in_onr_diff THEN
			IF l_row.qty_unit_typ IS NOT NULL THEN
				EXIT FUNC_FIN ;
			END IF ;

			IF l_itm_flg = '0' THEN
				SELECT /*+
						IndexScan(mgt_acc_top_mgt_acc_top_all_org mgt_acc_top_all_ie01)
						IndexScan(mgt_acc_sml_cost_mgt_acc_sml_cost_all_org mgt_acc_sml_cost_all_ie01)
						*/
					CASE l_row.std_flg
						WHEN '1' THEN SUM(t.so_std_amt - t.std_cost)
						ELSE SUM(t.so_act_amt - t.act_cost)
					END
				INTO STRICT	o_val
				FROM	(
					SELECT
						t1.top_rec_no,
						COALESCE(t1.so_std_amt, 0) AS so_std_amt,
						COALESCE(t1.so_act_amt, 0) AS so_act_amt,
						COALESCE(SUM(t2.std_cost), 0) AS std_cost,
						COALESCE(SUM(t2.act_cost), 0) AS act_cost
					FROM	mgt_acc_top t1, mgt_acc_sml_cost t2,
						mam_expns m2
					WHERE	0=0
					AND	t1.calc_no = i_arg.calc_no
					AND	t1.calc_grp_cd = i_arg.calc_grp_cd
					AND	t1.calc_rec_typ = c_calc_rec_inpt
					AND	t1.wg_cd = i_wg_cd
					AND	t1.calc_no = t2.calc_no
					AND	t1.calc_grp_cd = t2.calc_grp_cd
					AND	t1.top_rec_no = t2.top_rec_no
					AND	t2.expns_cd = m2.expns_cd
					AND	m2.del_flg = '0'
					AND	(l_row.cost_io_typ IS NULL OR l_row.cost_io_typ = t1.cost_io_typ)
					AND	(l_row.ac_slip_typ IS NULL OR l_row.ac_slip_typ = t1.ac_slip_typ)
					AND	(l_row.ac_rsn_cd IS NULL OR l_row.ac_rsn_cd = t1.ac_rsn_cd)
					AND	(l_row.expns_typ IS NULL OR l_row.expns_typ = m2.expns_typ)
					AND	(l_row.direct_typ IS NULL OR l_row.direct_typ = m2.direct_typ)
					AND	(l_row.var_typ IS NULL OR l_row.var_typ = m2.var_typ)
					AND	(l_row.expns_grp_cd IS NULL OR l_row.expns_grp_cd = m2.expns_grp_cd)
					AND	(l_row.expns_cd IS NULL OR l_row.expns_cd = t2.expns_cd)
					AND	(t1.asst_typ = c_asst_oth OR t1.repurc_obli_flg = '1')
					AND	(i_rpt_key.dpt_cd IS NULL OR i_rpt_key.dpt_cd = t1.mng_dpt_cd)
					AND	(i_rpt_key.itm_cd IS NULL OR i_rpt_key.itm_cd = t1.par_itm_cd)
					AND	(i_rpt_key.itm_sub1 IS NULL OR i_rpt_key.itm_sub1 = t1.par_itm_sub1)
					AND	(i_rpt_key.itm_sub2 IS NULL OR i_rpt_key.itm_sub2 = t1.par_itm_sub2)
					AND	(i_rpt_key.itm_sub3 IS NULL OR i_rpt_key.itm_sub3 = t1.par_itm_sub3)
					GROUP BY t1.top_rec_no, COALESCE(t1.so_std_amt, 0), COALESCE(t1.so_act_amt, 0)
					) t
				WHERE	0=0
				;
			ELSE
				SELECT /*+
						IndexScan(mgt_acc_top_mgt_acc_top_all_org mgt_acc_top_all_ie01)
						IndexScan(mgt_acc_sml_cost_mgt_acc_sml_cost_all_org mgt_acc_sml_cost_all_ie01)
						IndexScan(mam_itm_srch_mam_itm_com_m2)
						IndexScan(mam_itm_cmn__mam_itm_all_org)
						*/
					CASE l_row.std_flg
						WHEN '1' THEN SUM(t.so_std_amt - t.std_cost)
						ELSE SUM(t.so_act_amt - t.act_cost)
					END
				INTO STRICT	o_val
				FROM	(
					SELECT
						t1.top_rec_no,
						COALESCE(t1.so_std_amt, 0) AS so_std_amt,
						COALESCE(t1.so_act_amt, 0) AS so_act_amt,
						COALESCE(SUM(t2.std_cost), 0) AS std_cost,
						COALESCE(SUM(t2.act_cost), 0) AS act_cost
					FROM	mgt_acc_top t1, mgt_acc_sml_cost t2,
						mam_itm_srch m1, mam_expns m2
					WHERE	0=0
					AND	t1.calc_no = i_arg.calc_no
					AND	t1.calc_grp_cd = i_arg.calc_grp_cd
					AND	t1.calc_rec_typ = c_calc_rec_inpt
					AND	t1.wg_cd = i_wg_cd
					AND	t1.calc_no = t2.calc_no
					AND	t1.calc_grp_cd = t2.calc_grp_cd
					AND	t1.top_rec_no = t2.top_rec_no
					AND	t1.par_itm_cd = m1.itm_cd
					AND	t1.par_itm_sub1 = m1.itm_sub1
					AND	t1.par_itm_sub2 = m1.itm_sub2
					AND	t1.par_itm_sub3 = m1.itm_sub3
					AND	m1.release_flg = '1'
					AND	t2.expns_cd = m2.expns_cd
					AND	m2.del_flg = '0'
					AND	(l_row.itm_jnl_cd IS NULL OR l_row.itm_jnl_cd = m1.itm_jnl_cd)
					AND	(l_row.itm_grp_cd1 IS NULL OR l_row.itm_grp_cd1 = m1.itm_grp_cd1)
					AND	(l_row.itm_grp_cd2 IS NULL OR l_row.itm_grp_cd2 = m1.itm_grp_cd2)
					AND	(l_row.itm_grp_cd3 IS NULL OR l_row.itm_grp_cd3 = m1.itm_grp_cd3)
					AND	(l_row.itm_grp_cd4 IS NULL OR l_row.itm_grp_cd4 = m1.itm_grp_cd4)
					AND	(l_row.itm_grp_cd5 IS NULL OR l_row.itm_grp_cd5 = m1.itm_grp_cd5)
					AND	(l_row.itm_grp_cd6 IS NULL OR l_row.itm_grp_cd6 = m1.itm_grp_cd6)
					AND	(l_row.itm_grp_cd7 IS NULL OR l_row.itm_grp_cd7 = m1.itm_grp_cd7)
					AND	(l_row.itm_grp_cd8 IS NULL OR l_row.itm_grp_cd8 = m1.itm_grp_cd8)
					AND	(l_row.itm_grp_cd9 IS NULL OR l_row.itm_grp_cd9 = m1.itm_grp_cd9)
					AND	(l_row.itm_grp_cd10 IS NULL OR l_row.itm_grp_cd10 = m1.itm_grp_cd10)
					AND	(l_row.cost_io_typ IS NULL OR l_row.cost_io_typ = t1.cost_io_typ)
					AND	(l_row.ac_slip_typ IS NULL OR l_row.ac_slip_typ = t1.ac_slip_typ)
					AND	(l_row.ac_rsn_cd IS NULL OR l_row.ac_rsn_cd = t1.ac_rsn_cd)
					AND	(l_row.expns_typ IS NULL OR l_row.expns_typ = m2.expns_typ)
					AND	(l_row.direct_typ IS NULL OR l_row.direct_typ = m2.direct_typ)
					AND	(l_row.var_typ IS NULL OR l_row.var_typ = m2.var_typ)
					AND	(l_row.expns_grp_cd IS NULL OR l_row.expns_grp_cd = m2.expns_grp_cd)
					AND	(l_row.expns_cd IS NULL OR l_row.expns_cd = t2.expns_cd)
					AND	(t1.asst_typ = c_asst_oth OR t1.repurc_obli_flg = '1')
					AND (i_rpt_key.dpt_cd IS NULL OR i_rpt_key.dpt_cd = t1.mng_dpt_cd)
					AND	(i_rpt_key.itm_cd IS NULL OR i_rpt_key.itm_cd = t1.par_itm_cd)
					AND	(i_rpt_key.itm_sub1 IS NULL OR i_rpt_key.itm_sub1 = t1.par_itm_sub1)
					AND	(i_rpt_key.itm_sub2 IS NULL OR i_rpt_key.itm_sub2 = t1.par_itm_sub2)
					AND	(i_rpt_key.itm_sub3 IS NULL OR i_rpt_key.itm_sub3 = t1.par_itm_sub3)
					AND	(i_rpt_key.itm_jnl_cd IS NULL OR i_rpt_key.itm_jnl_cd = m1.itm_jnl_cd)
					AND	(i_rpt_key.itm_grp_typ IS NULL OR
							i_rpt_key.itm_grp_cd =
								CASE
									WHEN i_rpt_key.itm_grp_typ = c_itm_grp1 THEN m1.itm_grp_cd1
									WHEN i_rpt_key.itm_grp_typ = c_itm_grp2 THEN m1.itm_grp_cd2
									WHEN i_rpt_key.itm_grp_typ = c_itm_grp3 THEN m1.itm_grp_cd3
									WHEN i_rpt_key.itm_grp_typ = c_itm_grp4 THEN m1.itm_grp_cd4
									WHEN i_rpt_key.itm_grp_typ = c_itm_grp5 THEN m1.itm_grp_cd5
									WHEN i_rpt_key.itm_grp_typ = c_itm_grp6 THEN m1.itm_grp_cd6
									WHEN i_rpt_key.itm_grp_typ = c_itm_grp7 THEN m1.itm_grp_cd7
									WHEN i_rpt_key.itm_grp_typ = c_itm_grp8 THEN m1.itm_grp_cd8
									WHEN i_rpt_key.itm_grp_typ = c_itm_grp9 THEN m1.itm_grp_cd9
									WHEN i_rpt_key.itm_grp_typ = c_itm_grp10 THEN m1.itm_grp_cd10
									ELSE NULL
								END
						)
					GROUP BY t1.top_rec_no, COALESCE(t1.so_std_amt, 0), COALESCE(t1.so_act_amt, 0)
					) t
				WHERE	0=0
				;
			END IF ;

			EXIT FUNC_FIN ;
		END IF ;

		IF l_row.rpt_tgt_typ = c_rpt_tgt_st_diff THEN
			IF l_row.qty_unit_typ IS NOT NULL THEN
				EXIT FUNC_FIN ;
			END IF ;

			SELECT	COALESCE(MIN(m.parm_val), i_arg.calc_grp_cd)
			INTO STRICT	l_stk_calc_grp_cd
			FROM	mgt_parm m
			WHERE	0=0
			AND	m.calc_grp_cd = i_arg.calc_grp_cd
			AND	m.parm_key = 'ETC_STK_CALC_GRP'
			AND	m.parm_val IS NOT NULL
			;

			IF l_itm_flg = '0' THEN
				SELECT
					SUM(t2.diff_amt)
				INTO STRICT	o_val
				FROM	mgt_st_stk t1, mgt_st_stk_diff t2,
					mam_expns m2
				WHERE	0=0
				AND	t1.calc_grp_cd = l_stk_calc_grp_cd
				AND	t1.wg_cd = i_wg_cd
				AND	t1.ym = i_arg.st_ym
				AND	t1.st_stk_key = t2.st_stk_key
				AND	t2.expns_cd = m2.expns_cd
				AND	m2.del_flg = '0'
				AND	(l_row.expns_typ IS NULL OR l_row.expns_typ = m2.expns_typ)
				AND	(l_row.direct_typ IS NULL OR l_row.direct_typ = m2.direct_typ)
				AND	(l_row.var_typ IS NULL OR l_row.var_typ = m2.var_typ)
				AND	(l_row.expns_grp_cd IS NULL OR l_row.expns_grp_cd = m2.expns_grp_cd)
				AND	(l_row.expns_cd IS NULL OR l_row.expns_cd = t2.expns_cd)
				AND	(l_row.asst_typ IS NULL OR l_row.asst_typ = t1.asst_typ)
				AND	(i_rpt_key.dpt_cd IS NULL OR i_rpt_key.dpt_cd = t1.mng_dpt_cd)
				AND	(i_rpt_key.itm_cd IS NULL OR i_rpt_key.itm_cd = t1.itm_cd)
				AND	(i_rpt_key.itm_sub1 IS NULL OR i_rpt_key.itm_sub1 = t1.itm_sub1)
				AND	(i_rpt_key.itm_sub2 IS NULL OR i_rpt_key.itm_sub2 = t1.itm_sub2)
				AND	(i_rpt_key.itm_sub3 IS NULL OR i_rpt_key.itm_sub3 = t1.itm_sub3)
				;
			ELSE
				SELECT
					SUM(t2.diff_amt)
				INTO STRICT	o_val
				FROM	mgt_st_stk t1, mgt_st_stk_diff t2,
					mam_itm_srch m1, mam_expns m2
				WHERE	0=0
				AND	t1.calc_grp_cd = l_stk_calc_grp_cd
				AND	t1.wg_cd = i_wg_cd
				AND	t1.ym = i_arg.st_ym
				AND	t1.st_stk_key = t2.st_stk_key
				AND	t1.itm_cd = m1.itm_cd
				AND	t1.itm_sub1 = m1.itm_sub1
				AND	t1.itm_sub2 = m1.itm_sub2
				AND	t1.itm_sub3 = m1.itm_sub3
				AND	m1.release_flg = '1'
				AND	t2.expns_cd = m2.expns_cd
				AND	m2.del_flg = '0'
				AND	(l_row.itm_jnl_cd IS NULL OR l_row.itm_jnl_cd = m1.itm_jnl_cd)
				AND	(l_row.itm_grp_cd1 IS NULL OR l_row.itm_grp_cd1 = m1.itm_grp_cd1)
				AND	(l_row.itm_grp_cd2 IS NULL OR l_row.itm_grp_cd2 = m1.itm_grp_cd2)
				AND	(l_row.itm_grp_cd3 IS NULL OR l_row.itm_grp_cd3 = m1.itm_grp_cd3)
				AND	(l_row.itm_grp_cd4 IS NULL OR l_row.itm_grp_cd4 = m1.itm_grp_cd4)
				AND	(l_row.itm_grp_cd5 IS NULL OR l_row.itm_grp_cd5 = m1.itm_grp_cd5)
				AND	(l_row.itm_grp_cd6 IS NULL OR l_row.itm_grp_cd6 = m1.itm_grp_cd6)
				AND	(l_row.itm_grp_cd7 IS NULL OR l_row.itm_grp_cd7 = m1.itm_grp_cd7)
				AND	(l_row.itm_grp_cd8 IS NULL OR l_row.itm_grp_cd8 = m1.itm_grp_cd8)
				AND	(l_row.itm_grp_cd9 IS NULL OR l_row.itm_grp_cd9 = m1.itm_grp_cd9)
				AND	(l_row.itm_grp_cd10 IS NULL OR l_row.itm_grp_cd10 = m1.itm_grp_cd10)
				AND	(l_row.expns_typ IS NULL OR l_row.expns_typ = m2.expns_typ)
				AND	(l_row.direct_typ IS NULL OR l_row.direct_typ = m2.direct_typ)
				AND	(l_row.var_typ IS NULL OR l_row.var_typ = m2.var_typ)
				AND	(l_row.expns_grp_cd IS NULL OR l_row.expns_grp_cd = m2.expns_grp_cd)
				AND	(l_row.expns_cd IS NULL OR l_row.expns_cd = t2.expns_cd)
				AND	(l_row.asst_typ IS NULL OR l_row.asst_typ = t1.asst_typ)
				AND	(i_rpt_key.dpt_cd IS NULL OR i_rpt_key.dpt_cd = t1.mng_dpt_cd)
				AND	(i_rpt_key.itm_cd IS NULL OR i_rpt_key.itm_cd = t1.itm_cd)
				AND	(i_rpt_key.itm_sub1 IS NULL OR i_rpt_key.itm_sub1 = t1.itm_sub1)
				AND	(i_rpt_key.itm_sub2 IS NULL OR i_rpt_key.itm_sub2 = t1.itm_sub2)
				AND	(i_rpt_key.itm_sub3 IS NULL OR i_rpt_key.itm_sub3 = t1.itm_sub3)
				AND	(i_rpt_key.itm_jnl_cd IS NULL OR i_rpt_key.itm_jnl_cd = m1.itm_jnl_cd)
				AND	(i_rpt_key.itm_grp_typ IS NULL OR
						i_rpt_key.itm_grp_cd =
							CASE
								WHEN i_rpt_key.itm_grp_typ = c_itm_grp1 THEN m1.itm_grp_cd1
								WHEN i_rpt_key.itm_grp_typ = c_itm_grp2 THEN m1.itm_grp_cd2
								WHEN i_rpt_key.itm_grp_typ = c_itm_grp3 THEN m1.itm_grp_cd3
								WHEN i_rpt_key.itm_grp_typ = c_itm_grp4 THEN m1.itm_grp_cd4
								WHEN i_rpt_key.itm_grp_typ = c_itm_grp5 THEN m1.itm_grp_cd5
								WHEN i_rpt_key.itm_grp_typ = c_itm_grp6 THEN m1.itm_grp_cd6
								WHEN i_rpt_key.itm_grp_typ = c_itm_grp7 THEN m1.itm_grp_cd7
								WHEN i_rpt_key.itm_grp_typ = c_itm_grp8 THEN m1.itm_grp_cd8
								WHEN i_rpt_key.itm_grp_typ = c_itm_grp9 THEN m1.itm_grp_cd9
								WHEN i_rpt_key.itm_grp_typ = c_itm_grp10 THEN m1.itm_grp_cd10
								ELSE NULL
							END
					)
				;
			END IF ;

			EXIT FUNC_FIN ;
		END IF ;

		IF l_row.rpt_tgt_typ IN (
			c_rpt_tgt_purc_amt,
			c_rpt_tgt_sls_amt,
			c_rpt_tgt_io_amt,
			c_rpt_tgt_outsrc_amt,
			c_rpt_tgt_outsrc_pay_amt
			)
		THEN
			IF l_row.qty_unit_typ IS NOT NULL THEN
				EXIT FUNC_FIN ;
			END IF ;

			IF l_row.rpt_tgt_typ = c_rpt_tgt_purc_amt THEN
				l_calc_rec_typ := c_calc_rec_purc ;

			ELSIF l_row.rpt_tgt_typ = c_rpt_tgt_sls_amt THEN
				l_calc_rec_typ := c_calc_rec_sls ;

			ELSIF l_row.rpt_tgt_typ = c_rpt_tgt_io_amt THEN
				l_calc_rec_typ := c_calc_rec_io ;

			ELSIF l_row.rpt_tgt_typ IN (c_rpt_tgt_outsrc_amt, c_rpt_tgt_outsrc_pay_amt) THEN
				l_calc_rec_typ := c_calc_rec_inst ;

			ELSE
				EXIT FUNC_FIN ;
			END IF ;

			IF l_itm_flg = '0' THEN
				SELECT
					CASE l_row.std_flg
						WHEN '1' THEN
							SUM(CASE l_row.rpt_tgt_typ WHEN c_rpt_tgt_outsrc_pay_amt THEN COALESCE(t1.std_amt, 0) - COALESCE(t1.so_std_amt, 0) ELSE t1.std_amt END)
						ELSE
							SUM(CASE l_row.rpt_tgt_typ WHEN c_rpt_tgt_outsrc_pay_amt THEN COALESCE(t1.amt, 0) - COALESCE(t1.so_act_amt, 0) ELSE t1.amt END)
					END
				INTO STRICT	o_val
				FROM	mgt_acc_top t1
				WHERE	0=0
				AND	t1.calc_no = i_arg.calc_no
				AND	t1.calc_grp_cd = i_arg.calc_grp_cd
				AND	t1.calc_rec_typ = l_calc_rec_typ
				AND	t1.wg_cd = i_wg_cd
				AND	(l_row.cost_io_typ IS NULL OR l_row.cost_io_typ = t1.cost_io_typ)
				AND	(l_row.ac_slip_typ IS NULL OR l_row.ac_slip_typ = t1.ac_slip_typ)
				AND	(l_row.ac_rsn_cd IS NULL OR l_row.ac_rsn_cd = t1.ac_rsn_cd)
				AND	(l_row.asst_typ IS NULL OR l_row.asst_typ = t1.asst_typ)
				AND	(i_rpt_key.dpt_cd IS NULL OR i_rpt_key.dpt_cd = t1.mng_dpt_cd)
				AND	(i_rpt_key.itm_cd IS NULL OR i_rpt_key.itm_cd = t1.itm_cd)
				AND	(i_rpt_key.itm_sub1 IS NULL OR i_rpt_key.itm_sub1 = t1.itm_sub1)
				AND	(i_rpt_key.itm_sub2 IS NULL OR i_rpt_key.itm_sub2 = t1.itm_sub2)
				AND	(i_rpt_key.itm_sub3 IS NULL OR i_rpt_key.itm_sub3 = t1.itm_sub3)
				;
			ELSE
				SELECT /*+
						IndexScan(mam_itm_cmn__mam_itm_all_org)
						IndexScan(mam_itm_srch_mam_itm_com_m2)
						*/
					CASE l_row.std_flg
						WHEN '1' THEN
							SUM(CASE l_row.rpt_tgt_typ WHEN c_rpt_tgt_outsrc_pay_amt THEN COALESCE(t1.std_amt, 0) - COALESCE(t1.so_std_amt, 0) ELSE t1.std_amt END)
						ELSE
							SUM(CASE l_row.rpt_tgt_typ WHEN c_rpt_tgt_outsrc_pay_amt THEN COALESCE(t1.amt, 0) - COALESCE(t1.so_act_amt, 0) ELSE t1.amt END)
					END
				INTO STRICT	o_val
				FROM	mgt_acc_top t1, mam_itm_srch m1
				WHERE	0=0
				AND	t1.calc_no = i_arg.calc_no
				AND	t1.calc_grp_cd = i_arg.calc_grp_cd
				AND	t1.calc_rec_typ = l_calc_rec_typ
				AND	t1.wg_cd = i_wg_cd
				AND	t1.itm_cd = m1.itm_cd
				AND	t1.itm_sub1 = m1.itm_sub1
				AND	t1.itm_sub2 = m1.itm_sub2
				AND	t1.itm_sub3 = m1.itm_sub3
				AND	m1.release_flg = '1'
				AND	(l_row.itm_jnl_cd IS NULL OR l_row.itm_jnl_cd = m1.itm_jnl_cd)
				AND	(l_row.itm_grp_cd1 IS NULL OR l_row.itm_grp_cd1 = m1.itm_grp_cd1)
				AND	(l_row.itm_grp_cd2 IS NULL OR l_row.itm_grp_cd2 = m1.itm_grp_cd2)
				AND	(l_row.itm_grp_cd3 IS NULL OR l_row.itm_grp_cd3 = m1.itm_grp_cd3)
				AND	(l_row.itm_grp_cd4 IS NULL OR l_row.itm_grp_cd4 = m1.itm_grp_cd4)
				AND	(l_row.itm_grp_cd5 IS NULL OR l_row.itm_grp_cd5 = m1.itm_grp_cd5)
				AND	(l_row.itm_grp_cd6 IS NULL OR l_row.itm_grp_cd6 = m1.itm_grp_cd6)
				AND	(l_row.itm_grp_cd7 IS NULL OR l_row.itm_grp_cd7 = m1.itm_grp_cd7)
				AND	(l_row.itm_grp_cd8 IS NULL OR l_row.itm_grp_cd8 = m1.itm_grp_cd8)
				AND	(l_row.itm_grp_cd9 IS NULL OR l_row.itm_grp_cd9 = m1.itm_grp_cd9)
				AND	(l_row.itm_grp_cd10 IS NULL OR l_row.itm_grp_cd10 = m1.itm_grp_cd10)
				AND	(l_row.cost_io_typ IS NULL OR l_row.cost_io_typ = t1.cost_io_typ)
				AND	(l_row.ac_slip_typ IS NULL OR l_row.ac_slip_typ = t1.ac_slip_typ)
				AND	(l_row.ac_rsn_cd IS NULL OR l_row.ac_rsn_cd = t1.ac_rsn_cd)
				AND	(l_row.asst_typ IS NULL OR l_row.asst_typ = t1.asst_typ)
				AND	(i_rpt_key.dpt_cd IS NULL OR i_rpt_key.dpt_cd = t1.mng_dpt_cd)
				AND	(i_rpt_key.itm_cd IS NULL OR i_rpt_key.itm_cd = t1.itm_cd)
				AND	(i_rpt_key.itm_sub1 IS NULL OR i_rpt_key.itm_sub1 = t1.itm_sub1)
				AND	(i_rpt_key.itm_sub2 IS NULL OR i_rpt_key.itm_sub2 = t1.itm_sub2)
				AND	(i_rpt_key.itm_sub3 IS NULL OR i_rpt_key.itm_sub3 = t1.itm_sub3)
				AND	(i_rpt_key.itm_jnl_cd IS NULL OR i_rpt_key.itm_jnl_cd = m1.itm_jnl_cd)
				AND	(i_rpt_key.itm_grp_typ IS NULL OR
						i_rpt_key.itm_grp_cd =
							CASE
								WHEN i_rpt_key.itm_grp_typ = c_itm_grp1 THEN m1.itm_grp_cd1
								WHEN i_rpt_key.itm_grp_typ = c_itm_grp2 THEN m1.itm_grp_cd2
								WHEN i_rpt_key.itm_grp_typ = c_itm_grp3 THEN m1.itm_grp_cd3
								WHEN i_rpt_key.itm_grp_typ = c_itm_grp4 THEN m1.itm_grp_cd4
								WHEN i_rpt_key.itm_grp_typ = c_itm_grp5 THEN m1.itm_grp_cd5
								WHEN i_rpt_key.itm_grp_typ = c_itm_grp6 THEN m1.itm_grp_cd6
								WHEN i_rpt_key.itm_grp_typ = c_itm_grp7 THEN m1.itm_grp_cd7
								WHEN i_rpt_key.itm_grp_typ = c_itm_grp8 THEN m1.itm_grp_cd8
								WHEN i_rpt_key.itm_grp_typ = c_itm_grp9 THEN m1.itm_grp_cd9
								WHEN i_rpt_key.itm_grp_typ = c_itm_grp10 THEN m1.itm_grp_cd10
								ELSE NULL
							END
					)
				;
			END IF ;

			EXIT FUNC_FIN ;
		END IF ;

		IF l_row.rpt_tgt_typ IN (
			c_rpt_tgt_diff_io_pri,
			c_rpt_tgt_diff_outsrc
			)
		THEN
			IF l_row.qty_unit_typ IS NOT NULL THEN
				EXIT FUNC_FIN ;
			END IF ;

			IF l_row.rpt_tgt_typ = c_rpt_tgt_diff_io_pri THEN
				l_calc_rec_typ := c_calc_rec_purc ;

			ELSIF l_row.rpt_tgt_typ = c_rpt_tgt_diff_outsrc THEN
				l_calc_rec_typ := c_calc_rec_inst ;

			ELSE
				EXIT FUNC_FIN ;
			END IF ;

			IF l_itm_flg = '0' THEN
				SELECT
					SUM(CASE l_row.rpt_tgt_typ
							WHEN c_rpt_tgt_diff_io_pri THEN COALESCE(t1.std_amt, 0) - COALESCE(t1.amt, 0)
							ELSE COALESCE(t1.upri_diff, 0) + COALESCE(t1.rate_diff, 0)
						END)
				INTO STRICT	o_val
				FROM	mgt_acc_top t1
				WHERE	0=0
				AND	t1.calc_no = i_arg.calc_no
				AND	t1.calc_grp_cd = i_arg.calc_grp_cd
				AND	t1.calc_rec_typ = l_calc_rec_typ
				AND	t1.wg_cd = i_wg_cd
				AND	(l_row.cost_io_typ IS NULL OR l_row.cost_io_typ = t1.cost_io_typ)
				AND	(l_row.ac_slip_typ IS NULL OR l_row.ac_slip_typ = t1.ac_slip_typ)
				AND	(l_row.ac_rsn_cd IS NULL OR l_row.ac_rsn_cd = t1.ac_rsn_cd)
				AND	(l_row.asst_typ IS NULL OR l_row.asst_typ = t1.asst_typ)
				AND	(i_rpt_key.dpt_cd IS NULL OR i_rpt_key.dpt_cd = t1.mng_dpt_cd)
				AND	(i_rpt_key.itm_cd IS NULL OR i_rpt_key.itm_cd = t1.itm_cd)
				AND	(i_rpt_key.itm_sub1 IS NULL OR i_rpt_key.itm_sub1 = t1.itm_sub1)
				AND	(i_rpt_key.itm_sub2 IS NULL OR i_rpt_key.itm_sub2 = t1.itm_sub2)
				AND	(i_rpt_key.itm_sub3 IS NULL OR i_rpt_key.itm_sub3 = t1.itm_sub3)
				;
			ELSE
				SELECT
					SUM(CASE l_row.rpt_tgt_typ
							WHEN c_rpt_tgt_diff_io_pri THEN COALESCE(t1.std_amt, 0) - COALESCE(t1.amt, 0)
							ELSE COALESCE(t1.upri_diff, 0) + COALESCE(t1.rate_diff, 0)
						END)
				INTO STRICT	o_val
				FROM	mgt_acc_top t1,
					mam_itm_srch m1
				WHERE	0=0
				AND	t1.calc_no = i_arg.calc_no
				AND	t1.calc_grp_cd = i_arg.calc_grp_cd
				AND	t1.calc_rec_typ = l_calc_rec_typ
				AND	t1.wg_cd = i_wg_cd
				AND	t1.itm_cd = m1.itm_cd
				AND	t1.itm_sub1 = m1.itm_sub1
				AND	t1.itm_sub2 = m1.itm_sub2
				AND	t1.itm_sub3 = m1.itm_sub3
				AND	m1.release_flg = '1'
				AND	(l_row.itm_jnl_cd IS NULL OR l_row.itm_jnl_cd = m1.itm_jnl_cd)
				AND	(l_row.itm_grp_cd1 IS NULL OR l_row.itm_grp_cd1 = m1.itm_grp_cd1)
				AND	(l_row.itm_grp_cd2 IS NULL OR l_row.itm_grp_cd2 = m1.itm_grp_cd2)
				AND	(l_row.itm_grp_cd3 IS NULL OR l_row.itm_grp_cd3 = m1.itm_grp_cd3)
				AND	(l_row.itm_grp_cd4 IS NULL OR l_row.itm_grp_cd4 = m1.itm_grp_cd4)
				AND	(l_row.itm_grp_cd5 IS NULL OR l_row.itm_grp_cd5 = m1.itm_grp_cd5)
				AND	(l_row.itm_grp_cd6 IS NULL OR l_row.itm_grp_cd6 = m1.itm_grp_cd6)
				AND	(l_row.itm_grp_cd7 IS NULL OR l_row.itm_grp_cd7 = m1.itm_grp_cd7)
				AND	(l_row.itm_grp_cd8 IS NULL OR l_row.itm_grp_cd8 = m1.itm_grp_cd8)
				AND	(l_row.itm_grp_cd9 IS NULL OR l_row.itm_grp_cd9 = m1.itm_grp_cd9)
				AND	(l_row.itm_grp_cd10 IS NULL OR l_row.itm_grp_cd10 = m1.itm_grp_cd10)
				AND	(l_row.cost_io_typ IS NULL OR l_row.cost_io_typ = t1.cost_io_typ)
				AND	(l_row.ac_slip_typ IS NULL OR l_row.ac_slip_typ = t1.ac_slip_typ)
				AND	(l_row.ac_rsn_cd IS NULL OR l_row.ac_rsn_cd = t1.ac_rsn_cd)
				AND	(l_row.asst_typ IS NULL OR l_row.asst_typ = t1.asst_typ)
				AND	(i_rpt_key.dpt_cd IS NULL OR i_rpt_key.dpt_cd = t1.mng_dpt_cd)
				AND	(i_rpt_key.itm_cd IS NULL OR i_rpt_key.itm_cd = t1.itm_cd)
				AND	(i_rpt_key.itm_sub1 IS NULL OR i_rpt_key.itm_sub1 = t1.itm_sub1)
				AND	(i_rpt_key.itm_sub2 IS NULL OR i_rpt_key.itm_sub2 = t1.itm_sub2)
				AND	(i_rpt_key.itm_sub3 IS NULL OR i_rpt_key.itm_sub3 = t1.itm_sub3)
				AND	(i_rpt_key.itm_jnl_cd IS NULL OR i_rpt_key.itm_jnl_cd = m1.itm_jnl_cd)
				AND	(i_rpt_key.itm_grp_typ IS NULL OR
						i_rpt_key.itm_grp_cd =
							CASE
								WHEN i_rpt_key.itm_grp_typ = c_itm_grp1 THEN m1.itm_grp_cd1
								WHEN i_rpt_key.itm_grp_typ = c_itm_grp2 THEN m1.itm_grp_cd2
								WHEN i_rpt_key.itm_grp_typ = c_itm_grp3 THEN m1.itm_grp_cd3
								WHEN i_rpt_key.itm_grp_typ = c_itm_grp4 THEN m1.itm_grp_cd4
								WHEN i_rpt_key.itm_grp_typ = c_itm_grp5 THEN m1.itm_grp_cd5
								WHEN i_rpt_key.itm_grp_typ = c_itm_grp6 THEN m1.itm_grp_cd6
								WHEN i_rpt_key.itm_grp_typ = c_itm_grp7 THEN m1.itm_grp_cd7
								WHEN i_rpt_key.itm_grp_typ = c_itm_grp8 THEN m1.itm_grp_cd8
								WHEN i_rpt_key.itm_grp_typ = c_itm_grp9 THEN m1.itm_grp_cd9
								WHEN i_rpt_key.itm_grp_typ = c_itm_grp10 THEN m1.itm_grp_cd10
								ELSE NULL
							END
					)
				;
			END IF ;

			EXIT FUNC_FIN ;
		END IF ;

		IF l_row.rpt_tgt_typ IN (
			c_rpt_tgt_diff_qty,
			c_rpt_tgt_diff_wk,
			c_rpt_tgt_diff_a,
			c_rpt_tgt_diff_b,
			c_rpt_tgt_diff_c,
			c_rpt_tgt_diff_d,
			c_rpt_tgt_diff_e,
			c_rpt_tgt_diff_rt,
			c_rpt_tgt_diff_std,
			c_rpt_tgt_diff_inst
			)
		THEN
			IF l_row.qty_unit_typ IS NOT NULL THEN
				EXIT FUNC_FIN ;
			END IF ;

			IF l_row.rpt_tgt_typ IN (
				c_rpt_tgt_diff_qty,
				c_rpt_tgt_diff_wk,
				c_rpt_tgt_diff_inst
				)
			THEN
				l_calc_rec_typ := NULL ;
			ELSE
				l_calc_rec_typ := c_calc_rec_purc ;
			END IF ;

			IF l_itm_flg = '0' THEN
				SELECT /*+
						IndexScan(mgt_acc_top_mgt_acc_top_all_org mgt_acc_top_all_ie01)
						IndexScan(mgt_acc_sml_cost_mgt_acc_sml_cost_all_org mgt_acc_sml_cost_all_ie01)
						*/
					SUM(CASE l_row.rpt_tgt_typ
							WHEN c_rpt_tgt_diff_qty THEN COALESCE(t2.diff_qty, 0)
							WHEN c_rpt_tgt_diff_wk THEN COALESCE(t2.diff_wk, 0)
							WHEN c_rpt_tgt_diff_a THEN COALESCE(t2.diff_a, 0)
							WHEN c_rpt_tgt_diff_b THEN COALESCE(t2.diff_b, 0)
							WHEN c_rpt_tgt_diff_c THEN COALESCE(t2.diff_c, 0)
							WHEN c_rpt_tgt_diff_d THEN COALESCE(t2.diff_d, 0)
							WHEN c_rpt_tgt_diff_e THEN COALESCE(t2.diff_e, 0)
							WHEN c_rpt_tgt_diff_rt THEN COALESCE(t2.diff_rt, 0)
							WHEN c_rpt_tgt_diff_std THEN COALESCE(t2.diff_std, 0)
							ELSE COALESCE(t2.std_cost, 0) - COALESCE(t2.act_cost, 0)
						END)
				INTO STRICT	o_val
				FROM	mgt_acc_top t1, mgt_acc_sml_cost t2, mam_expns m2
				WHERE	0=0
				AND	t1.calc_no = i_arg.calc_no
				AND	t1.calc_grp_cd = i_arg.calc_grp_cd
				AND	t1.calc_rec_typ IN (c_calc_rec_inst, l_calc_rec_typ)
				AND	t1.wg_cd = i_wg_cd
				AND	t1.calc_no = t2.calc_no
				AND	t1.calc_grp_cd = t2.calc_grp_cd
				AND	t1.top_rec_no = t2.top_rec_no
				AND	t2.expns_cd = m2.expns_cd
				AND	m2.del_flg = '0'
				AND	(l_row.cost_io_typ IS NULL OR l_row.cost_io_typ = t1.cost_io_typ)
				AND	(l_row.ac_slip_typ IS NULL OR l_row.ac_slip_typ = t1.ac_slip_typ)
				AND	(l_row.ac_rsn_cd IS NULL OR l_row.ac_rsn_cd = t1.ac_rsn_cd)
				AND	(l_row.asst_typ IS NULL OR l_row.asst_typ = t1.asst_typ)
				AND	(l_row.expns_typ IS NULL OR l_row.expns_typ = m2.expns_typ)
				AND	(l_row.direct_typ IS NULL OR l_row.direct_typ = m2.direct_typ)
				AND	(l_row.var_typ IS NULL OR l_row.var_typ = m2.var_typ)
				AND	(l_row.expns_grp_cd IS NULL OR l_row.expns_grp_cd = m2.expns_grp_cd)
				AND	(l_row.expns_cd IS NULL OR l_row.expns_cd = t2.expns_cd)
				AND	(i_rpt_key.dpt_cd IS NULL OR i_rpt_key.dpt_cd = t1.mng_dpt_cd)
				AND	(i_rpt_key.itm_cd IS NULL OR i_rpt_key.itm_cd = t1.itm_cd)
				AND	(i_rpt_key.itm_sub1 IS NULL OR i_rpt_key.itm_sub1 = t1.itm_sub1)
				AND	(i_rpt_key.itm_sub2 IS NULL OR i_rpt_key.itm_sub2 = t1.itm_sub2)
				AND	(i_rpt_key.itm_sub3 IS NULL OR i_rpt_key.itm_sub3 = t1.itm_sub3)
				;
			ELSE
				SELECT /*+
						IndexScan(mgt_acc_top_mgt_acc_top_all_org mgt_acc_top_all_ie01)
						IndexScan(mgt_acc_sml_cost_mgt_acc_sml_cost_all_org mgt_acc_sml_cost_all_ie01)
						IndexScan(mam_itm_srch_mam_itm_com_m2)
						IndexScan(mam_itm_cmn__mam_itm_all_org)
						*/
					SUM(CASE l_row.rpt_tgt_typ
							WHEN c_rpt_tgt_diff_qty THEN COALESCE(t2.diff_qty, 0)
							WHEN c_rpt_tgt_diff_wk THEN COALESCE(t2.diff_wk, 0)
							WHEN c_rpt_tgt_diff_a THEN COALESCE(t2.diff_a, 0)
							WHEN c_rpt_tgt_diff_b THEN COALESCE(t2.diff_b, 0)
							WHEN c_rpt_tgt_diff_c THEN COALESCE(t2.diff_c, 0)
							WHEN c_rpt_tgt_diff_d THEN COALESCE(t2.diff_d, 0)
							WHEN c_rpt_tgt_diff_e THEN COALESCE(t2.diff_e, 0)
							WHEN c_rpt_tgt_diff_rt THEN COALESCE(t2.diff_rt, 0)
							WHEN c_rpt_tgt_diff_std THEN COALESCE(t2.diff_std, 0)
							ELSE COALESCE(t2.std_cost, 0) - COALESCE(t2.act_cost, 0)
						END)
				INTO STRICT	o_val
				FROM	mgt_acc_top t1, mgt_acc_sml_cost t2,
					mam_itm_srch m1, mam_expns m2
				WHERE	0=0
				AND	t1.calc_no = i_arg.calc_no
				AND	t1.calc_grp_cd = i_arg.calc_grp_cd
				AND	t1.calc_rec_typ IN (c_calc_rec_inst, l_calc_rec_typ)
				AND	t1.wg_cd = i_wg_cd
				AND	t1.calc_no = t2.calc_no
				AND	t1.calc_grp_cd = t2.calc_grp_cd
				AND	t1.top_rec_no = t2.top_rec_no
				AND	t1.itm_cd = m1.itm_cd
				AND	t1.itm_sub1 = m1.itm_sub1
				AND	t1.itm_sub2 = m1.itm_sub2
				AND	t1.itm_sub3 = m1.itm_sub3
				AND	m1.release_flg = '1'
				AND	t2.expns_cd = m2.expns_cd
				AND	m2.del_flg = '0'
				AND	(l_row.itm_jnl_cd IS NULL OR l_row.itm_jnl_cd = m1.itm_jnl_cd)
				AND	(l_row.itm_grp_cd1 IS NULL OR l_row.itm_grp_cd1 = m1.itm_grp_cd1)
				AND	(l_row.itm_grp_cd2 IS NULL OR l_row.itm_grp_cd2 = m1.itm_grp_cd2)
				AND	(l_row.itm_grp_cd3 IS NULL OR l_row.itm_grp_cd3 = m1.itm_grp_cd3)
				AND	(l_row.itm_grp_cd4 IS NULL OR l_row.itm_grp_cd4 = m1.itm_grp_cd4)
				AND	(l_row.itm_grp_cd5 IS NULL OR l_row.itm_grp_cd5 = m1.itm_grp_cd5)
				AND	(l_row.itm_grp_cd6 IS NULL OR l_row.itm_grp_cd6 = m1.itm_grp_cd6)
				AND	(l_row.itm_grp_cd7 IS NULL OR l_row.itm_grp_cd7 = m1.itm_grp_cd7)
				AND	(l_row.itm_grp_cd8 IS NULL OR l_row.itm_grp_cd8 = m1.itm_grp_cd8)
				AND	(l_row.itm_grp_cd9 IS NULL OR l_row.itm_grp_cd9 = m1.itm_grp_cd9)
				AND	(l_row.itm_grp_cd10 IS NULL OR l_row.itm_grp_cd10 = m1.itm_grp_cd10)
				AND	(l_row.cost_io_typ IS NULL OR l_row.cost_io_typ = t1.cost_io_typ)
				AND	(l_row.ac_slip_typ IS NULL OR l_row.ac_slip_typ = t1.ac_slip_typ)
				AND	(l_row.ac_rsn_cd IS NULL OR l_row.ac_rsn_cd = t1.ac_rsn_cd)
				AND	(l_row.asst_typ IS NULL OR l_row.asst_typ = t1.asst_typ)
				AND	(l_row.expns_typ IS NULL OR l_row.expns_typ = m2.expns_typ)
				AND	(l_row.direct_typ IS NULL OR l_row.direct_typ = m2.direct_typ)
				AND	(l_row.var_typ IS NULL OR l_row.var_typ = m2.var_typ)
				AND	(l_row.expns_grp_cd IS NULL OR l_row.expns_grp_cd = m2.expns_grp_cd)
				AND	(l_row.expns_cd IS NULL OR l_row.expns_cd = t2.expns_cd)
				AND	(i_rpt_key.dpt_cd IS NULL OR i_rpt_key.dpt_cd = t1.mng_dpt_cd)
				AND	(i_rpt_key.itm_cd IS NULL OR i_rpt_key.itm_cd = t1.itm_cd)
				AND	(i_rpt_key.itm_sub1 IS NULL OR i_rpt_key.itm_sub1 = t1.itm_sub1)
				AND	(i_rpt_key.itm_sub2 IS NULL OR i_rpt_key.itm_sub2 = t1.itm_sub2)
				AND	(i_rpt_key.itm_sub3 IS NULL OR i_rpt_key.itm_sub3 = t1.itm_sub3)
				AND	(i_rpt_key.itm_jnl_cd IS NULL OR i_rpt_key.itm_jnl_cd = m1.itm_jnl_cd)
				AND	(i_rpt_key.itm_grp_typ IS NULL OR
						i_rpt_key.itm_grp_cd =
							CASE
								WHEN i_rpt_key.itm_grp_typ = c_itm_grp1 THEN m1.itm_grp_cd1
								WHEN i_rpt_key.itm_grp_typ = c_itm_grp2 THEN m1.itm_grp_cd2
								WHEN i_rpt_key.itm_grp_typ = c_itm_grp3 THEN m1.itm_grp_cd3
								WHEN i_rpt_key.itm_grp_typ = c_itm_grp4 THEN m1.itm_grp_cd4
								WHEN i_rpt_key.itm_grp_typ = c_itm_grp5 THEN m1.itm_grp_cd5
								WHEN i_rpt_key.itm_grp_typ = c_itm_grp6 THEN m1.itm_grp_cd6
								WHEN i_rpt_key.itm_grp_typ = c_itm_grp7 THEN m1.itm_grp_cd7
								WHEN i_rpt_key.itm_grp_typ = c_itm_grp8 THEN m1.itm_grp_cd8
								WHEN i_rpt_key.itm_grp_typ = c_itm_grp9 THEN m1.itm_grp_cd9
								WHEN i_rpt_key.itm_grp_typ = c_itm_grp10 THEN m1.itm_grp_cd10
								ELSE NULL
							END
					)
				;
			END IF ;

			EXIT FUNC_FIN ;
		END IF ;

		IF l_row.rpt_tgt_typ IN (
			c_rpt_tgt_diff_up,
			c_rpt_tgt_diff_ss
			)
		THEN
			IF l_row.qty_unit_typ IS NOT NULL THEN
				EXIT FUNC_FIN ;
			END IF ;

			IF l_itm_flg = '0' THEN
				SELECT
					SUM(COALESCE(t3.diff_up, 0))
				INTO STRICT	o_val
				FROM	mgt_acc_top t1, mam_expns m2, mgt_acc_inpt t2
					LEFT OUTER JOIN mgt_acc_cost t3
						ON (t2.calc_no = t3.calc_no AND t2.calc_grp_cd = t3.calc_grp_cd AND t2.inpt_rec_no = t3.sml_inpt_rec_no)
				WHERE	0=0
				AND	t1.calc_no = i_arg.calc_no
				AND	t1.calc_grp_cd = i_arg.calc_grp_cd
				AND	t1.calc_rec_typ = c_calc_rec_inst
				AND	t1.wg_cd = i_wg_cd
				AND	t1.calc_no = t2.calc_no
				AND	t1.calc_grp_cd = t2.calc_grp_cd
				AND	t1.top_rec_no = t2.top_rec_no
				AND	t2.lvl = 1
				AND	(
					(l_row.rpt_tgt_typ = c_rpt_tgt_diff_up AND t2.ac_slip_typ <> c_ac_slip_in_ss)
					OR
					(l_row.rpt_tgt_typ = c_rpt_tgt_diff_ss AND t2.ac_slip_typ = c_ac_slip_in_ss AND t2.asst_typ = c_asst_oth)
				)
				AND	t3.expns_cd = m2.expns_cd
				AND	m2.del_flg = '0'
				AND	(l_row.cost_io_typ IS NULL OR l_row.cost_io_typ = t1.cost_io_typ)
				AND	(l_row.ac_slip_typ IS NULL OR l_row.ac_slip_typ = t1.ac_slip_typ)
				AND	(l_row.ac_rsn_cd IS NULL OR l_row.ac_rsn_cd = t1.ac_rsn_cd)
				AND	(l_row.asst_typ IS NULL OR l_row.asst_typ = t1.asst_typ)
				AND	(l_row.expns_typ IS NULL OR l_row.expns_typ = m2.expns_typ)
				AND	(l_row.direct_typ IS NULL OR l_row.direct_typ = m2.direct_typ)
				AND	(l_row.var_typ IS NULL OR l_row.var_typ = m2.var_typ)
				AND	(l_row.expns_grp_cd IS NULL OR l_row.expns_grp_cd = m2.expns_grp_cd)
				AND	(l_row.expns_cd IS NULL OR l_row.expns_cd = t3.expns_cd)
				AND	(i_rpt_key.dpt_cd IS NULL OR i_rpt_key.dpt_cd = t1.mng_dpt_cd)
				AND	(i_rpt_key.itm_cd IS NULL OR i_rpt_key.itm_cd = t1.itm_cd)
				AND	(i_rpt_key.itm_sub1 IS NULL OR i_rpt_key.itm_sub1 = t1.itm_sub1)
				AND	(i_rpt_key.itm_sub2 IS NULL OR i_rpt_key.itm_sub2 = t1.itm_sub2)
				AND	(i_rpt_key.itm_sub3 IS NULL OR i_rpt_key.itm_sub3 = t1.itm_sub3)
				;
			ELSE
				SELECT
					SUM(COALESCE(t3.diff_up, 0))
				INTO STRICT	o_val
				FROM	mgt_acc_top t1, mam_itm_srch m1, mam_expns m2, mgt_acc_inpt t2
					LEFT OUTER JOIN mgt_acc_cost t3
						ON (t2.calc_no = t3.calc_no AND t2.calc_grp_cd = t3.calc_grp_cd AND t2.inpt_rec_no = t3.sml_inpt_rec_no)
				WHERE	0=0
				AND	t1.calc_no = i_arg.calc_no
				AND	t1.calc_grp_cd = i_arg.calc_grp_cd
				AND	t1.calc_rec_typ = c_calc_rec_inst
				AND	t1.wg_cd = i_wg_cd
				AND	t1.calc_no = t2.calc_no
				AND	t1.calc_grp_cd = t2.calc_grp_cd
				AND	t1.top_rec_no = t2.top_rec_no
				AND	t2.lvl = 1
				AND	(
					(l_row.rpt_tgt_typ = c_rpt_tgt_diff_up AND t2.ac_slip_typ <> c_ac_slip_in_ss)
					OR
					(l_row.rpt_tgt_typ = c_rpt_tgt_diff_ss AND t2.ac_slip_typ = c_ac_slip_in_ss AND t2.asst_typ = c_asst_oth)
				)
				AND	t1.itm_cd = m1.itm_cd
				AND	t1.itm_sub1 = m1.itm_sub1
				AND	t1.itm_sub2 = m1.itm_sub2
				AND	t1.itm_sub3 = m1.itm_sub3
				AND	m1.release_flg = '1'
				AND	t3.expns_cd = m2.expns_cd
				AND	m2.del_flg = '0'
				AND	(l_row.itm_jnl_cd IS NULL OR l_row.itm_jnl_cd = m1.itm_jnl_cd)
				AND	(l_row.itm_grp_cd1 IS NULL OR l_row.itm_grp_cd1 = m1.itm_grp_cd1)
				AND	(l_row.itm_grp_cd2 IS NULL OR l_row.itm_grp_cd2 = m1.itm_grp_cd2)
				AND	(l_row.itm_grp_cd3 IS NULL OR l_row.itm_grp_cd3 = m1.itm_grp_cd3)
				AND	(l_row.itm_grp_cd4 IS NULL OR l_row.itm_grp_cd4 = m1.itm_grp_cd4)
				AND	(l_row.itm_grp_cd5 IS NULL OR l_row.itm_grp_cd5 = m1.itm_grp_cd5)
				AND	(l_row.itm_grp_cd6 IS NULL OR l_row.itm_grp_cd6 = m1.itm_grp_cd6)
				AND	(l_row.itm_grp_cd7 IS NULL OR l_row.itm_grp_cd7 = m1.itm_grp_cd7)
				AND	(l_row.itm_grp_cd8 IS NULL OR l_row.itm_grp_cd8 = m1.itm_grp_cd8)
				AND	(l_row.itm_grp_cd9 IS NULL OR l_row.itm_grp_cd9 = m1.itm_grp_cd9)
				AND	(l_row.itm_grp_cd10 IS NULL OR l_row.itm_grp_cd10 = m1.itm_grp_cd10)
				AND	(l_row.cost_io_typ IS NULL OR l_row.cost_io_typ = t1.cost_io_typ)
				AND	(l_row.ac_slip_typ IS NULL OR l_row.ac_slip_typ = t1.ac_slip_typ)
				AND	(l_row.ac_rsn_cd IS NULL OR l_row.ac_rsn_cd = t1.ac_rsn_cd)
				AND	(l_row.asst_typ IS NULL OR l_row.asst_typ = t1.asst_typ)
				AND	(l_row.expns_typ IS NULL OR l_row.expns_typ = m2.expns_typ)
				AND	(l_row.direct_typ IS NULL OR l_row.direct_typ = m2.direct_typ)
				AND	(l_row.var_typ IS NULL OR l_row.var_typ = m2.var_typ)
				AND	(l_row.expns_grp_cd IS NULL OR l_row.expns_grp_cd = m2.expns_grp_cd)
				AND	(l_row.expns_cd IS NULL OR l_row.expns_cd = t3.expns_cd)
				AND	(i_rpt_key.dpt_cd IS NULL OR i_rpt_key.dpt_cd = t1.mng_dpt_cd)
				AND	(i_rpt_key.itm_cd IS NULL OR i_rpt_key.itm_cd = t1.itm_cd)
				AND	(i_rpt_key.itm_sub1 IS NULL OR i_rpt_key.itm_sub1 = t1.itm_sub1)
				AND	(i_rpt_key.itm_sub2 IS NULL OR i_rpt_key.itm_sub2 = t1.itm_sub2)
				AND	(i_rpt_key.itm_sub3 IS NULL OR i_rpt_key.itm_sub3 = t1.itm_sub3)
				AND	(i_rpt_key.itm_jnl_cd IS NULL OR i_rpt_key.itm_jnl_cd = m1.itm_jnl_cd)
				AND	(i_rpt_key.itm_grp_typ IS NULL OR
						i_rpt_key.itm_grp_cd =
							CASE
								WHEN i_rpt_key.itm_grp_typ = c_itm_grp1 THEN m1.itm_grp_cd1
								WHEN i_rpt_key.itm_grp_typ = c_itm_grp2 THEN m1.itm_grp_cd2
								WHEN i_rpt_key.itm_grp_typ = c_itm_grp3 THEN m1.itm_grp_cd3
								WHEN i_rpt_key.itm_grp_typ = c_itm_grp4 THEN m1.itm_grp_cd4
								WHEN i_rpt_key.itm_grp_typ = c_itm_grp5 THEN m1.itm_grp_cd5
								WHEN i_rpt_key.itm_grp_typ = c_itm_grp6 THEN m1.itm_grp_cd6
								WHEN i_rpt_key.itm_grp_typ = c_itm_grp7 THEN m1.itm_grp_cd7
								WHEN i_rpt_key.itm_grp_typ = c_itm_grp8 THEN m1.itm_grp_cd8
								WHEN i_rpt_key.itm_grp_typ = c_itm_grp9 THEN m1.itm_grp_cd9
								WHEN i_rpt_key.itm_grp_typ = c_itm_grp10 THEN m1.itm_grp_cd10
								ELSE NULL
							END
					)
				;
			END IF ;
			EXIT FUNC_FIN ;
		END IF ;

		IF l_row.rpt_tgt_typ IN (
			c_rpt_tgt_diff_qty_chd,
			c_rpt_tgt_diff_up_chd,
			c_rpt_tgt_diff_ss_chd
			)
		THEN
			IF l_row.qty_unit_typ IS NOT NULL THEN
				EXIT FUNC_FIN ;
			END IF ;

			IF l_itm_flg = '0' THEN
				SELECT
					SUM(CASE l_row.rpt_tgt_typ
							WHEN c_rpt_tgt_diff_qty_chd THEN COALESCE(t3.diff_qty, 0)
							ELSE COALESCE(t3.diff_up, 0)
						END)
				INTO STRICT	o_val
				FROM	mgt_acc_top t1, mam_expns m2, mgt_acc_inpt t2
					LEFT OUTER JOIN mgt_acc_cost t3
						ON (t2.calc_no = t3.calc_no AND t2.calc_grp_cd = t3.calc_grp_cd AND t2.inpt_rec_no = t3.sml_inpt_rec_no)
				WHERE	0=0
				AND	t1.calc_no = i_arg.calc_no
				AND	t1.calc_grp_cd = i_arg.calc_grp_cd
				AND	t1.calc_rec_typ = c_calc_rec_inst
				AND	t1.wg_cd = i_wg_cd
				AND	t1.calc_no = t2.calc_no
				AND	t1.calc_grp_cd = t2.calc_grp_cd
				AND	t1.top_rec_no = t2.top_rec_no
				AND	t2.lvl = 1
				AND	(
					l_row.rpt_tgt_typ = c_rpt_tgt_diff_qty_chd
					OR
					(l_row.rpt_tgt_typ = c_rpt_tgt_diff_up_chd AND t2.ac_slip_typ <> c_ac_slip_in_ss)
					OR
					(l_row.rpt_tgt_typ = c_rpt_tgt_diff_ss_chd AND t2.ac_slip_typ = c_ac_slip_in_ss AND t2.asst_typ = c_asst_oth)
				)
				AND	t3.expns_cd = m2.expns_cd
				AND	m2.del_flg = '0'
				AND	(l_row.cost_io_typ IS NULL OR l_row.cost_io_typ = t1.cost_io_typ)
				AND	(l_row.ac_slip_typ IS NULL OR l_row.ac_slip_typ = t1.ac_slip_typ)
				AND	(l_row.ac_rsn_cd IS NULL OR l_row.ac_rsn_cd = t1.ac_rsn_cd)
				AND	(l_row.asst_typ IS NULL OR l_row.asst_typ = t1.asst_typ)
				AND	(l_row.expns_typ IS NULL OR l_row.expns_typ = m2.expns_typ)
				AND	(l_row.direct_typ IS NULL OR l_row.direct_typ = m2.direct_typ)
				AND	(l_row.var_typ IS NULL OR l_row.var_typ = m2.var_typ)
				AND	(l_row.expns_grp_cd IS NULL OR l_row.expns_grp_cd = m2.expns_grp_cd)
				AND	(l_row.expns_cd IS NULL OR l_row.expns_cd = t3.expns_cd)
				AND	(i_rpt_key.dpt_cd IS NULL OR i_rpt_key.dpt_cd = t1.mng_dpt_cd)
				AND	(i_rpt_key.itm_cd IS NULL OR i_rpt_key.itm_cd = t2.itm_cd)
				AND	(i_rpt_key.itm_sub1 IS NULL OR i_rpt_key.itm_sub1 = t2.itm_sub1)
				AND	(i_rpt_key.itm_sub2 IS NULL OR i_rpt_key.itm_sub2 = t2.itm_sub2)
				AND	(i_rpt_key.itm_sub3 IS NULL OR i_rpt_key.itm_sub3 = t2.itm_sub3)
				;
			ELSE
				SELECT
					SUM(CASE l_row.rpt_tgt_typ
							WHEN c_rpt_tgt_diff_qty_chd THEN COALESCE(t3.diff_qty, 0)
							ELSE COALESCE(t3.diff_up, 0)
						END)
				INTO STRICT	o_val
				FROM	mgt_acc_top t1, mam_itm_srch m1, mam_expns m2, mgt_acc_inpt t2
					LEFT OUTER JOIN mgt_acc_cost t3
						ON (t2.calc_no = t3.calc_no AND t2.calc_grp_cd = t3.calc_grp_cd AND t2.inpt_rec_no = t3.sml_inpt_rec_no)
				WHERE	0=0
				AND	t1.calc_no = i_arg.calc_no
				AND	t1.calc_grp_cd = i_arg.calc_grp_cd
				AND	t1.calc_rec_typ = c_calc_rec_inst
				AND	t1.wg_cd = i_wg_cd
				AND	t1.calc_no = t2.calc_no
				AND	t1.calc_grp_cd = t2.calc_grp_cd
				AND	t1.top_rec_no = t2.top_rec_no
				AND	t2.lvl = 1
				AND	(
					l_row.rpt_tgt_typ = c_rpt_tgt_diff_qty_chd
					OR
					(l_row.rpt_tgt_typ = c_rpt_tgt_diff_up_chd AND t2.ac_slip_typ <> c_ac_slip_in_ss)
					OR
					(l_row.rpt_tgt_typ = c_rpt_tgt_diff_ss_chd AND t2.ac_slip_typ = c_ac_slip_in_ss AND t2.asst_typ = c_asst_oth)
				)
				AND	t2.itm_cd = m1.itm_cd
				AND	t2.itm_sub1 = m1.itm_sub1
				AND	t2.itm_sub2 = m1.itm_sub2
				AND	t2.itm_sub3 = m1.itm_sub3
				AND	m1.release_flg = '1'
				AND	t3.expns_cd = m2.expns_cd
				AND	m2.del_flg = '0'
				AND	(l_row.itm_jnl_cd IS NULL OR l_row.itm_jnl_cd = m1.itm_jnl_cd)
				AND	(l_row.itm_grp_cd1 IS NULL OR l_row.itm_grp_cd1 = m1.itm_grp_cd1)
				AND	(l_row.itm_grp_cd2 IS NULL OR l_row.itm_grp_cd2 = m1.itm_grp_cd2)
				AND	(l_row.itm_grp_cd3 IS NULL OR l_row.itm_grp_cd3 = m1.itm_grp_cd3)
				AND	(l_row.itm_grp_cd4 IS NULL OR l_row.itm_grp_cd4 = m1.itm_grp_cd4)
				AND	(l_row.itm_grp_cd5 IS NULL OR l_row.itm_grp_cd5 = m1.itm_grp_cd5)
				AND	(l_row.itm_grp_cd6 IS NULL OR l_row.itm_grp_cd6 = m1.itm_grp_cd6)
				AND	(l_row.itm_grp_cd7 IS NULL OR l_row.itm_grp_cd7 = m1.itm_grp_cd7)
				AND	(l_row.itm_grp_cd8 IS NULL OR l_row.itm_grp_cd8 = m1.itm_grp_cd8)
				AND	(l_row.itm_grp_cd9 IS NULL OR l_row.itm_grp_cd9 = m1.itm_grp_cd9)
				AND	(l_row.itm_grp_cd10 IS NULL OR l_row.itm_grp_cd10 = m1.itm_grp_cd10)
				AND	(l_row.cost_io_typ IS NULL OR l_row.cost_io_typ = t1.cost_io_typ)
				AND	(l_row.ac_slip_typ IS NULL OR l_row.ac_slip_typ = t1.ac_slip_typ)
				AND	(l_row.ac_rsn_cd IS NULL OR l_row.ac_rsn_cd = t1.ac_rsn_cd)
				AND	(l_row.asst_typ IS NULL OR l_row.asst_typ = t1.asst_typ)
				AND	(l_row.expns_typ IS NULL OR l_row.expns_typ = m2.expns_typ)
				AND	(l_row.direct_typ IS NULL OR l_row.direct_typ = m2.direct_typ)
				AND	(l_row.var_typ IS NULL OR l_row.var_typ = m2.var_typ)
				AND	(l_row.expns_grp_cd IS NULL OR l_row.expns_grp_cd = m2.expns_grp_cd)
				AND	(l_row.expns_cd IS NULL OR l_row.expns_cd = t3.expns_cd)
				AND	(i_rpt_key.dpt_cd IS NULL OR i_rpt_key.dpt_cd = t1.mng_dpt_cd)
				AND	(i_rpt_key.itm_cd IS NULL OR i_rpt_key.itm_cd = t2.itm_cd)
				AND	(i_rpt_key.itm_sub1 IS NULL OR i_rpt_key.itm_sub1 = t2.itm_sub1)
				AND	(i_rpt_key.itm_sub2 IS NULL OR i_rpt_key.itm_sub2 = t2.itm_sub2)
				AND	(i_rpt_key.itm_sub3 IS NULL OR i_rpt_key.itm_sub3 = t2.itm_sub3)
				AND	(i_rpt_key.itm_jnl_cd IS NULL OR i_rpt_key.itm_jnl_cd = m1.itm_jnl_cd)
				AND	(i_rpt_key.itm_grp_typ IS NULL OR
						i_rpt_key.itm_grp_cd =
							CASE
								WHEN i_rpt_key.itm_grp_typ = c_itm_grp1 THEN m1.itm_grp_cd1
								WHEN i_rpt_key.itm_grp_typ = c_itm_grp2 THEN m1.itm_grp_cd2
								WHEN i_rpt_key.itm_grp_typ = c_itm_grp3 THEN m1.itm_grp_cd3
								WHEN i_rpt_key.itm_grp_typ = c_itm_grp4 THEN m1.itm_grp_cd4
								WHEN i_rpt_key.itm_grp_typ = c_itm_grp5 THEN m1.itm_grp_cd5
								WHEN i_rpt_key.itm_grp_typ = c_itm_grp6 THEN m1.itm_grp_cd6
								WHEN i_rpt_key.itm_grp_typ = c_itm_grp7 THEN m1.itm_grp_cd7
								WHEN i_rpt_key.itm_grp_typ = c_itm_grp8 THEN m1.itm_grp_cd8
								WHEN i_rpt_key.itm_grp_typ = c_itm_grp9 THEN m1.itm_grp_cd9
								WHEN i_rpt_key.itm_grp_typ = c_itm_grp10 THEN m1.itm_grp_cd10
								ELSE NULL
							END
					)
				;
			END IF ;

			EXIT FUNC_FIN ;
		END IF ;

		l_ym := NULL ;
		IF l_row.rpt_tgt_typ IN (c_rpt_tgt_st_stk, c_rpt_tgt_st_wip, c_rpt_tgt_st_stkwip) THEN
			l_ym := i_arg.st_ym ;
		ELSIF l_row.rpt_tgt_typ IN (c_rpt_tgt_end_stk, c_rpt_tgt_end_wip, c_rpt_tgt_end_stkwip) THEN
			l_ym := i_arg.end_ym ;
		END IF ;

		l_calc_rec_typ1 := NULL ;
		l_calc_rec_typ2 := NULL ;
		IF l_row.rpt_tgt_typ = c_rpt_tgt_st_stkwip THEN
			l_calc_rec_typ1 := c_calc_rec_st_stk ;
			l_calc_rec_typ2 := c_calc_rec_st_wip ;

		ELSIF l_row.rpt_tgt_typ = c_rpt_tgt_end_stkwip THEN
			l_calc_rec_typ1 := c_calc_rec_end_stk ;
			l_calc_rec_typ2 := c_calc_rec_end_wip ;

		ELSIF l_row.rpt_tgt_typ = c_rpt_tgt_gp_alc THEN
			l_calc_rec_typ1 := c_calc_rec_gp_alc ;
		ELSE
			l_calc_rec_typ1 := l_row.rpt_tgt_typ ;
		END IF ;

		IF l_row.qty_unit_typ IS NOT NULL THEN
			IF l_itm_flg = '0'
			AND l_row.qty_unit_typ NOT IN (c_qty_unit_dim, c_qty_unit_wt, c_qty_unit_conts) THEN
				SELECT
					SUM(t1.qty)
				INTO STRICT	o_val
				FROM	mgt_acc_top t1
				WHERE	0=0
				AND	t1.calc_no = i_arg.calc_no
				AND	t1.calc_grp_cd = i_arg.calc_grp_cd
				AND	COALESCE(l_ym, t1.ym) = t1.ym
				AND	t1.calc_rec_typ IN (l_calc_rec_typ1, l_calc_rec_typ2)
				AND	t1.wg_cd = i_wg_cd
				AND	(l_row.cost_io_typ IS NULL OR l_row.cost_io_typ = t1.cost_io_typ)
				AND	(l_row.ac_slip_typ IS NULL OR l_row.ac_slip_typ = t1.ac_slip_typ)
				AND	(l_row.ac_rsn_cd IS NULL OR l_row.ac_rsn_cd = t1.ac_rsn_cd)
				AND	(l_row.asst_typ IS NULL AND t1.asst_typ IN (c_asst_prod, c_asst_sls) OR l_row.asst_typ = t1.asst_typ)
				AND	(i_rpt_key.dpt_cd IS NULL OR i_rpt_key.dpt_cd = t1.mng_dpt_cd)
				AND	(i_rpt_key.itm_cd IS NULL OR i_rpt_key.itm_cd = t1.itm_cd)
				AND	(i_rpt_key.itm_sub1 IS NULL OR i_rpt_key.itm_sub1 = t1.itm_sub1)
				AND	(i_rpt_key.itm_sub2 IS NULL OR i_rpt_key.itm_sub2 = t1.itm_sub2)
				AND	(i_rpt_key.itm_sub3 IS NULL OR i_rpt_key.itm_sub3 = t1.itm_sub3)
				;
			ELSE
				SELECT
					SUM(CASE l_row.qty_unit_typ
							WHEN c_qty_unit_dim THEN mapa_calc$f_rnd(m1.dim * t1.qty, COALESCE(m2.dec_place, 2), c_rndoff)
							WHEN c_qty_unit_wt THEN mapa_calc$f_rnd(m1.wt * t1.qty, COALESCE(m3.dec_place, 2), c_rndoff)
							WHEN c_qty_unit_conts THEN mapa_calc$f_rnd(m1.conts_qty * t1.qty, COALESCE(m4.dec_place, 2), c_rndoff)
							ELSE t1.qty
						END)
				INTO STRICT	o_val
				FROM	mgt_acc_top t1, mam_itm_srch m1
					LEFT OUTER JOIN mam_unit m2 ON (m1.dim_unit_cd = m2.unit_cd AND m2.del_flg = '0')
					LEFT OUTER JOIN mam_unit m3 ON (m1.wt_unit_cd = m3.unit_cd AND m3.del_flg = '0')
					LEFT OUTER JOIN mam_unit m4 ON (m1.conts_unit_cd = m4.unit_cd AND m4.del_flg = '0')
				WHERE	0=0
				AND	t1.calc_no = i_arg.calc_no
				AND	t1.calc_grp_cd = i_arg.calc_grp_cd
				AND	COALESCE(l_ym, t1.ym) = t1.ym
				AND	t1.calc_rec_typ IN (l_calc_rec_typ1, l_calc_rec_typ2)
				AND	t1.wg_cd = i_wg_cd
				AND	t1.itm_cd = m1.itm_cd
				AND	t1.itm_sub1 = m1.itm_sub1
				AND	t1.itm_sub2 = m1.itm_sub2
				AND	t1.itm_sub3 = m1.itm_sub3
				AND	m1.release_flg = '1'
				AND	(l_row.itm_jnl_cd IS NULL OR l_row.itm_jnl_cd = m1.itm_jnl_cd)
				AND	(l_row.itm_grp_cd1 IS NULL OR l_row.itm_grp_cd1 = m1.itm_grp_cd1)
				AND	(l_row.itm_grp_cd2 IS NULL OR l_row.itm_grp_cd2 = m1.itm_grp_cd2)
				AND	(l_row.itm_grp_cd3 IS NULL OR l_row.itm_grp_cd3 = m1.itm_grp_cd3)
				AND	(l_row.itm_grp_cd4 IS NULL OR l_row.itm_grp_cd4 = m1.itm_grp_cd4)
				AND	(l_row.itm_grp_cd5 IS NULL OR l_row.itm_grp_cd5 = m1.itm_grp_cd5)
				AND	(l_row.itm_grp_cd6 IS NULL OR l_row.itm_grp_cd6 = m1.itm_grp_cd6)
				AND	(l_row.itm_grp_cd7 IS NULL OR l_row.itm_grp_cd7 = m1.itm_grp_cd7)
				AND	(l_row.itm_grp_cd8 IS NULL OR l_row.itm_grp_cd8 = m1.itm_grp_cd8)
				AND	(l_row.itm_grp_cd9 IS NULL OR l_row.itm_grp_cd9 = m1.itm_grp_cd9)
				AND	(l_row.itm_grp_cd10 IS NULL OR l_row.itm_grp_cd10 = m1.itm_grp_cd10)
				AND	(l_row.cost_io_typ IS NULL OR l_row.cost_io_typ = t1.cost_io_typ)
				AND	(l_row.ac_slip_typ IS NULL OR l_row.ac_slip_typ = t1.ac_slip_typ)
				AND	(l_row.ac_rsn_cd IS NULL OR l_row.ac_rsn_cd = t1.ac_rsn_cd)
				AND	(l_row.asst_typ IS NULL AND t1.asst_typ IN (c_asst_prod, c_asst_sls) OR l_row.asst_typ = t1.asst_typ)
				AND	(i_rpt_key.dpt_cd IS NULL OR i_rpt_key.dpt_cd = t1.mng_dpt_cd)
				AND	(i_rpt_key.itm_cd IS NULL OR i_rpt_key.itm_cd = t1.itm_cd)
				AND	(i_rpt_key.itm_sub1 IS NULL OR i_rpt_key.itm_sub1 = t1.itm_sub1)
				AND	(i_rpt_key.itm_sub2 IS NULL OR i_rpt_key.itm_sub2 = t1.itm_sub2)
				AND	(i_rpt_key.itm_sub3 IS NULL OR i_rpt_key.itm_sub3 = t1.itm_sub3)
				AND	(i_rpt_key.itm_jnl_cd IS NULL OR i_rpt_key.itm_jnl_cd = m1.itm_jnl_cd)
				AND	(i_rpt_key.itm_grp_typ IS NULL OR
						i_rpt_key.itm_grp_cd =
							CASE
								WHEN i_rpt_key.itm_grp_typ = c_itm_grp1 THEN m1.itm_grp_cd1
								WHEN i_rpt_key.itm_grp_typ = c_itm_grp2 THEN m1.itm_grp_cd2
								WHEN i_rpt_key.itm_grp_typ = c_itm_grp3 THEN m1.itm_grp_cd3
								WHEN i_rpt_key.itm_grp_typ = c_itm_grp4 THEN m1.itm_grp_cd4
								WHEN i_rpt_key.itm_grp_typ = c_itm_grp5 THEN m1.itm_grp_cd5
								WHEN i_rpt_key.itm_grp_typ = c_itm_grp6 THEN m1.itm_grp_cd6
								WHEN i_rpt_key.itm_grp_typ = c_itm_grp7 THEN m1.itm_grp_cd7
								WHEN i_rpt_key.itm_grp_typ = c_itm_grp8 THEN m1.itm_grp_cd8
								WHEN i_rpt_key.itm_grp_typ = c_itm_grp9 THEN m1.itm_grp_cd9
								WHEN i_rpt_key.itm_grp_typ = c_itm_grp10 THEN m1.itm_grp_cd10
								ELSE NULL
							END
					)
				;
			END IF ;

			EXIT FUNC_FIN ;
		END IF ;

		IF l_itm_flg = '0' THEN
			SELECT /*+
					IndexScan(mgt_acc_top_mgt_acc_top_all_org mgt_acc_top_all_ie01)
					IndexScan(mgt_acc_sml_cost_mgt_acc_sml_cost_all_org mgt_acc_sml_cost_all_ie01)
					*/
				CASE l_row.std_flg
					WHEN '1' THEN SUM(t2.std_cost)
					ELSE SUM(t2.act_cost)
				END
			INTO STRICT	o_val
			FROM	mgt_acc_top t1, mgt_acc_sml_cost t2,
				mam_expns m2
			WHERE	0=0
			AND	t1.calc_no = i_arg.calc_no
			AND	t1.calc_grp_cd = i_arg.calc_grp_cd
			AND	COALESCE(l_ym, t1.ym) = t1.ym
			AND	t1.calc_rec_typ IN (l_calc_rec_typ1, l_calc_rec_typ2)
			AND	t1.wg_cd = i_wg_cd
			AND	t1.calc_no = t2.calc_no
			AND	t1.calc_grp_cd = t2.calc_grp_cd
			AND	t1.top_rec_no = t2.top_rec_no
			AND	t2.expns_cd = m2.expns_cd
			AND	m2.del_flg = '0'
			AND	(l_row.cost_io_typ IS NULL OR l_row.cost_io_typ = t1.cost_io_typ)
			AND	(l_row.ac_slip_typ IS NULL OR l_row.ac_slip_typ = t1.ac_slip_typ)
			AND	(l_row.ac_rsn_cd IS NULL OR l_row.ac_rsn_cd = t1.ac_rsn_cd)
			AND	(l_row.expns_typ IS NULL OR l_row.expns_typ = m2.expns_typ)
			AND	(l_row.direct_typ IS NULL OR l_row.direct_typ = m2.direct_typ)
			AND	(l_row.var_typ IS NULL OR l_row.var_typ = m2.var_typ)
			AND	(l_row.expns_grp_cd IS NULL OR l_row.expns_grp_cd = m2.expns_grp_cd)
			AND	(l_row.expns_cd IS NULL OR l_row.expns_cd = t2.expns_cd)
			AND	(l_row.asst_typ IS NULL AND t1.asst_typ IN (c_asst_prod, c_asst_sls) OR l_row.asst_typ = t1.asst_typ)
			AND	(i_rpt_key.dpt_cd IS NULL OR i_rpt_key.dpt_cd = t1.mng_dpt_cd)
			AND	(i_rpt_key.itm_cd IS NULL OR i_rpt_key.itm_cd = t1.itm_cd)
			AND	(i_rpt_key.itm_sub1 IS NULL OR i_rpt_key.itm_sub1 = t1.itm_sub1)
			AND	(i_rpt_key.itm_sub2 IS NULL OR i_rpt_key.itm_sub2 = t1.itm_sub2)
			AND	(i_rpt_key.itm_sub3 IS NULL OR i_rpt_key.itm_sub3 = t1.itm_sub3)
			;
		ELSE
			SELECT /*+
					IndexScan(mgt_acc_top_mgt_acc_top_all_org mgt_acc_top_all_ie02)
					IndexScan(mgt_acc_sml_cost_mgt_acc_sml_cost_all_org mgt_acc_sml_cost_all_ie01)
					IndexScan(mam_itm_srch_mam_itm_com_m2)
					IndexScan(mam_itm_cmn__mam_itm_all_org)
					IndexScan(mam_expns_mam_expns_all_org)
					*/
				CASE l_row.std_flg
					WHEN '1' THEN SUM(t2.std_cost)
					ELSE SUM(t2.act_cost)
				END
			INTO STRICT	o_val
			FROM	mgt_acc_top t1, mgt_acc_sml_cost t2,
				mam_itm_srch m1, mam_expns m2
			WHERE	0=0
			AND	t1.calc_no = i_arg.calc_no
			AND	t1.calc_grp_cd = i_arg.calc_grp_cd
			AND	COALESCE(l_ym, t1.ym) = t1.ym
			AND	t1.calc_rec_typ IN (l_calc_rec_typ1, l_calc_rec_typ2)
			AND	t1.wg_cd = i_wg_cd
			AND	t1.calc_no = t2.calc_no
			AND	t1.calc_grp_cd = t2.calc_grp_cd
			AND	t1.top_rec_no = t2.top_rec_no
			AND	t1.itm_cd = m1.itm_cd
			AND	t1.itm_sub1 = m1.itm_sub1
			AND	t1.itm_sub2 = m1.itm_sub2
			AND	t1.itm_sub3 = m1.itm_sub3
			AND	m1.release_flg = '1'
			AND	t2.expns_cd = m2.expns_cd
			AND	m2.del_flg = '0'
			AND	(l_row.itm_jnl_cd IS NULL OR l_row.itm_jnl_cd = m1.itm_jnl_cd)
			AND	(l_row.itm_grp_cd1 IS NULL OR l_row.itm_grp_cd1 = m1.itm_grp_cd1)
			AND	(l_row.itm_grp_cd2 IS NULL OR l_row.itm_grp_cd2 = m1.itm_grp_cd2)
			AND	(l_row.itm_grp_cd3 IS NULL OR l_row.itm_grp_cd3 = m1.itm_grp_cd3)
			AND	(l_row.itm_grp_cd4 IS NULL OR l_row.itm_grp_cd4 = m1.itm_grp_cd4)
			AND	(l_row.itm_grp_cd5 IS NULL OR l_row.itm_grp_cd5 = m1.itm_grp_cd5)
			AND	(l_row.itm_grp_cd6 IS NULL OR l_row.itm_grp_cd6 = m1.itm_grp_cd6)
			AND	(l_row.itm_grp_cd7 IS NULL OR l_row.itm_grp_cd7 = m1.itm_grp_cd7)
			AND	(l_row.itm_grp_cd8 IS NULL OR l_row.itm_grp_cd8 = m1.itm_grp_cd8)
			AND	(l_row.itm_grp_cd9 IS NULL OR l_row.itm_grp_cd9 = m1.itm_grp_cd9)
			AND	(l_row.itm_grp_cd10 IS NULL OR l_row.itm_grp_cd10 = m1.itm_grp_cd10)
			AND	(l_row.cost_io_typ IS NULL OR l_row.cost_io_typ = t1.cost_io_typ)
			AND	(l_row.ac_slip_typ IS NULL OR l_row.ac_slip_typ = t1.ac_slip_typ)
			AND	(l_row.ac_rsn_cd IS NULL OR l_row.ac_rsn_cd = t1.ac_rsn_cd)
			AND	(l_row.expns_typ IS NULL OR l_row.expns_typ = m2.expns_typ)
			AND	(l_row.direct_typ IS NULL OR l_row.direct_typ = m2.direct_typ)
			AND	(l_row.var_typ IS NULL OR l_row.var_typ = m2.var_typ)
			AND	(l_row.expns_grp_cd IS NULL OR l_row.expns_grp_cd = m2.expns_grp_cd)
			AND	(l_row.expns_cd IS NULL OR l_row.expns_cd = t2.expns_cd)
			AND	(l_row.asst_typ IS NULL AND t1.asst_typ IN (c_asst_prod, c_asst_sls) OR l_row.asst_typ = t1.asst_typ)
			AND	(i_rpt_key.dpt_cd IS NULL OR i_rpt_key.dpt_cd = t1.mng_dpt_cd)
			AND	(i_rpt_key.itm_cd IS NULL OR i_rpt_key.itm_cd = t1.itm_cd)
			AND	(i_rpt_key.itm_sub1 IS NULL OR i_rpt_key.itm_sub1 = t1.itm_sub1)
			AND	(i_rpt_key.itm_sub2 IS NULL OR i_rpt_key.itm_sub2 = t1.itm_sub2)
			AND	(i_rpt_key.itm_sub3 IS NULL OR i_rpt_key.itm_sub3 = t1.itm_sub3)
			AND	(i_rpt_key.itm_jnl_cd IS NULL OR i_rpt_key.itm_jnl_cd = m1.itm_jnl_cd)
			AND	(i_rpt_key.itm_grp_typ IS NULL OR
					i_rpt_key.itm_grp_cd =
						CASE
							WHEN i_rpt_key.itm_grp_typ = c_itm_grp1 THEN m1.itm_grp_cd1
							WHEN i_rpt_key.itm_grp_typ = c_itm_grp2 THEN m1.itm_grp_cd2
							WHEN i_rpt_key.itm_grp_typ = c_itm_grp3 THEN m1.itm_grp_cd3
							WHEN i_rpt_key.itm_grp_typ = c_itm_grp4 THEN m1.itm_grp_cd4
							WHEN i_rpt_key.itm_grp_typ = c_itm_grp5 THEN m1.itm_grp_cd5
							WHEN i_rpt_key.itm_grp_typ = c_itm_grp6 THEN m1.itm_grp_cd6
							WHEN i_rpt_key.itm_grp_typ = c_itm_grp7 THEN m1.itm_grp_cd7
							WHEN i_rpt_key.itm_grp_typ = c_itm_grp8 THEN m1.itm_grp_cd8
							WHEN i_rpt_key.itm_grp_typ = c_itm_grp9 THEN m1.itm_grp_cd9
							WHEN i_rpt_key.itm_grp_typ = c_itm_grp10 THEN m1.itm_grp_cd10
							ELSE NULL
						END
				)
			;
		END IF ;
	END ;

	l_tmp_rpt.calc_no	:= i_arg.calc_no ;
	l_tmp_rpt.calc_grp_cd	:= i_arg.calc_grp_cd ;
	l_tmp_rpt.ym	:= i_arg.end_ym ;
	l_tmp_rpt.rpt_ptn_cd	:= i_rpt_ptn_cd ;
	l_tmp_rpt.rpt_key_cd	:= i_rpt_key.rpt_key_cd ;
	l_tmp_rpt.rpt_row_cd	:= i_rpt_row_cd ;
	l_tmp_rpt.wg_cd	:= i_wg_cd ;
	l_tmp_rpt.dpt_cd	:= i_rpt_key.dpt_cd ;
	l_tmp_rpt.itm_cd	:= i_rpt_key.itm_cd ;
	l_tmp_rpt.itm_sub1	:= i_rpt_key.itm_sub1 ;
	l_tmp_rpt.itm_sub2	:= i_rpt_key.itm_sub2 ;
	l_tmp_rpt.itm_sub3	:= i_rpt_key.itm_sub3 ;
	l_tmp_rpt.itm_jnl_cd	:= i_rpt_key.itm_jnl_cd ;
	l_tmp_rpt.itm_grp_typ	:= i_rpt_key.itm_grp_typ ;
	l_tmp_rpt.itm_grp_cd	:= i_rpt_key.itm_grp_cd ;
	l_tmp_rpt.rpt_val	:= COALESCE(o_val, 0) ;

	o_recx[COALESCE(array_length(o_recx, 1), 0) + 1] := l_tmp_rpt ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_rpt$p_main (
	IN i_calc_grp_cd	VARCHAR,
	IN i_calc_no	VARCHAR,
	IN i_rpt_ptn_cd	VARCHAR,
	IN i_rpt_key_cd	VARCHAR,
	IN i_lock_flg	CHARACTER DEFAULT '1',
	IN i_dpt_cd	VARCHAR DEFAULT NULL,
	IN i_wg_cd	VARCHAR DEFAULT NULL,
	IN i_itm_cd	VARCHAR DEFAULT NULL,
	IN i_itm_sub1	VARCHAR DEFAULT NULL,
	IN i_itm_sub2	VARCHAR DEFAULT NULL,
	IN i_itm_sub3	VARCHAR DEFAULT NULL,
	IN i_itm_jnl_cd	VARCHAR DEFAULT NULL,
	IN i_itm_grp_typ	VARCHAR DEFAULT NULL,
	IN i_itm_grp_cd	VARCHAR DEFAULT NULL
)
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	原価レポート作成処理
<REMARKS>

<ARGUMENTS>
<IN>	i_calc_grp_cd
		計算グループＣＤ
<IN>	i_calc_no
		原価計算ＮＯ
<IN>	i_rpt_ptn_cd
		レポートパタンＣＤ
<IN>	i_rpt_key_cd
		レポートキーＣＤ
<IN>	i_lock_flg
		ロックＦＬＧ
<IN>	i_dpt_cd
		部門ＣＤ
<IN>	i_wg_cd
		ワーキンググループＣＤ
<IN>	i_itm_cd
		品目ＣＤ
<IN>	i_itm_sub1
		枝番１
<IN>	i_itm_sub2
		枝番２
<IN>	i_itm_sub3
		枝番３
<IN>	i_itm_jnl_cd
		品目仕訳ＣＤ
<IN>	i_itm_grp_typ
		品目分類区分
<IN>	i_itm_grp_cd
		品目分類ＣＤ
<HISTORY>
**********************************************************/
DECLARE
	c_rpt_key_mng_dpt	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_RPT_KEY_TYP','MNG_DPT') ;
	c_rpt_key_wg	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_RPT_KEY_TYP','WG') ;
	c_rpt_key_itm	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_RPT_KEY_TYP','ITM') ;
	c_rpt_key_itm_jnl	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_RPT_KEY_TYP','ITM_JNL') ;

	cur_rpt_key_config CURSOR (
		ci_rpt_key_cd	VARCHAR
		)
	FOR
		SELECT	DISTINCT
			m1.rpt_key_cd,
			CASE
				WHEN m1.rpt_key_typ = c_rpt_key_mng_dpt THEN m2.dpt_cd
				ELSE NULL
			END AS dpt_cd,
			CASE
				WHEN m1.rpt_key_typ = c_rpt_key_wg THEN m2.wg_cd
				ELSE NULL
			END AS wg_cd,
			CASE
				WHEN m1.rpt_key_typ = c_rpt_key_itm THEN m2.itm_cd
				ELSE NULL
			END AS itm_cd,
			CASE
				WHEN m1.rpt_key_typ = c_rpt_key_itm THEN m2.itm_sub1
				ELSE NULL
			END AS itm_sub1,
			CASE
				WHEN m1.rpt_key_typ = c_rpt_key_itm THEN m2.itm_sub2
				ELSE NULL
			END AS itm_sub2,
			CASE
				WHEN m1.rpt_key_typ = c_rpt_key_itm THEN m2.itm_sub3
				ELSE NULL
			END AS itm_sub3,
			CASE
				WHEN m1.rpt_key_typ = c_rpt_key_itm_jnl THEN m2.itm_jnl_cd
				ELSE NULL
			END AS itm_jnl_cd,
			CASE
				WHEN mac_rpt_key_typ$itm_grp(m1.rpt_key_typ) = m2.itm_grp_typ THEN m2.itm_grp_typ
				ELSE NULL
			END AS itm_grp_typ,
			CASE
				WHEN mac_rpt_key_typ$itm_grp(m1.rpt_key_typ) = m2.itm_grp_typ THEN m2.itm_grp_cd
				ELSE NULL
			END AS itm_grp_cd
		FROM	mam_rpt_key m1, mam_rpt_key_conf m2
		WHERE	0=0
		AND	m1.rpt_key_cd = ci_rpt_key_cd
		AND	m1.rpt_key_cd = m2.rpt_key_cd
		;

	l_recx	mgt_rpt[] ;
	l_arg	mgt_arg%ROWTYPE ;
	l_rpt_key	RECORD ;
	l_cnt	INTEGER ;
	l_tmp	NUMERIC := 0 ;
	l_msg_char	VARCHAR(1000) ;
	l_msg	VARCHAR[] ;
	x	RECORD ;
	z	RECORD ;
	y	RECORD ;
BEGIN
	CALL fcpa_postgres_util$type_is_table_col('mgpa_rpt$rpt_row_loop', 'CHAR', 'VARCHAR') ;

	IF i_dpt_cd IS NOT NULL THEN
		l_msg_char := i_dpt_cd ;
	ELSIF i_wg_cd IS NOT NULL THEN
		l_msg_char := i_wg_cd ;
	ELSIF i_itm_cd IS NOT NULL THEN
		l_msg_char := mapa_comm$f_to_disp_itm(i_itm_cd, i_itm_sub1, i_itm_sub2, i_itm_sub3, mapa_comm$f_get_parm('ITM_SUB_TYP')) ;
	ELSIF i_itm_jnl_cd IS NOT NULL THEN
		l_msg_char := i_itm_jnl_cd ;
	ELSIF i_itm_grp_typ IS NOT NULL THEN
		l_msg_char := CONCAT_WS(' - ', i_itm_grp_typ, i_itm_grp_cd) ;
	END IF ;
	IF l_msg_char IS NULL THEN
		CALL fcpa_batch_log$p_proc_log('MGBXD0012', i_calc_grp_cd, i_calc_no, i_rpt_ptn_cd, i_rpt_key_cd) ;
	ELSE
		CALL fcpa_batch_log$p_proc_log('MGBXD0012', i_calc_grp_cd, i_calc_no, i_rpt_ptn_cd, CONCAT_WS(' - ', i_rpt_key_cd, l_msg_char)) ;
	END IF ;

	l_cnt := 0 ;
	IF i_lock_flg = '0' THEN
		FOR x IN
			SELECT	m.calc_grp_cd
			FROM	mam_calc_rpt_ptn m
			WHERE	0=0
			AND	m.calc_grp_cd = i_calc_grp_cd
			AND	m.rpt_ptn_cd = i_rpt_ptn_cd
			AND	m.rpt_key_cd = i_rpt_key_cd
		LOOP
			l_cnt := 1 ;
		END LOOP ;
	ELSE
		BEGIN
			FOR x IN
				SELECT	m.calc_grp_cd
				FROM	mam_calc_rpt_ptn m
				WHERE	0=0
				AND	m.calc_grp_cd = i_calc_grp_cd
				AND	m.rpt_ptn_cd = i_rpt_ptn_cd
				AND	m.rpt_key_cd = i_rpt_key_cd
				FOR UPDATE NOWAIT
			LOOP
				l_cnt := 1 ;
			END LOOP ;
		EXCEPTION
			WHEN lock_not_available THEN
				l_msg := fcpa_err$msg_binder(i_calc_grp_cd, i_calc_no) ;
				CALL fcpa_err$raise_app_err('MGBXD0009', l_msg) ;
		END ;
	END IF ;

	IF l_cnt = 0 THEN
		l_msg := fcpa_err$msg_binder(i_calc_grp_cd, i_rpt_ptn_cd, i_rpt_key_cd) ;
		CALL fcpa_err$raise_app_err('MGBXD0017', l_msg) ;
	END IF ;

	/*** 同一のデータがあれば削除 ***/
	DELETE FROM	mgt_rpt t
	WHERE	0=0
	AND	t.calc_no = i_calc_no
	AND	t.calc_grp_cd = i_calc_grp_cd
	AND	t.rpt_ptn_cd = i_rpt_ptn_cd
	AND	t.rpt_key_cd = i_rpt_key_cd
	AND	(i_dpt_cd IS NULL OR t.dpt_cd = i_dpt_cd)
	AND	(i_wg_cd IS NULL OR t.wg_cd = i_wg_cd)
	AND	(i_itm_cd IS NULL OR t.itm_cd = i_itm_cd)
	AND	(i_itm_sub1 IS NULL OR t.itm_sub1 = i_itm_sub1)
	AND	(i_itm_sub2 IS NULL OR t.itm_sub2 = i_itm_sub2)
	AND	(i_itm_sub3 IS NULL OR t.itm_sub3 = i_itm_sub3)
	AND	(i_itm_jnl_cd IS NULL OR t.itm_jnl_cd = i_itm_jnl_cd)
	AND	(i_itm_grp_typ IS NULL OR t.itm_grp_typ = i_itm_grp_typ)
	AND	(i_itm_grp_cd IS NULL OR t.itm_grp_cd = i_itm_grp_cd)
	;

	/*** 計算情報の取得 ***/
	l_arg := mgpa_arg$f_get_arg(i_calc_grp_cd, i_calc_no) ;

	DELETE FROM maw_wg_key ;
	IF l_arg.runtime_wg_cd IS NULL THEN
		INSERT INTO maw_wg_key
		SELECT	m.wg_cd
		FROM	mam_grp_wg m
		WHERE	0=0
		AND	m.calc_grp_cd = i_calc_grp_cd
		AND	m.del_flg = '0'
		AND	(i_wg_cd IS NULL OR m.wg_cd = i_wg_cd)
		;
	ELSE
		INSERT INTO maw_wg_key VALUES (l_arg.runtime_wg_cd) ;
	END IF ;

	FOR z IN
		SELECT m.wg_cd FROM maw_wg_key m
	LOOP
		BEGIN
			FOR x IN cur_rpt_key_config (i_rpt_key_cd) LOOP
				l_rpt_key := x ;

				IF l_rpt_key.wg_cd IS NOT NULL AND l_rpt_key.wg_cd <> z.wg_cd THEN
					CONTINUE ;
				END IF ;
				IF (i_dpt_cd IS NOT NULL AND i_dpt_cd <> l_rpt_key.dpt_cd)
					OR (i_wg_cd IS NOT NULL AND i_wg_cd <> l_rpt_key.wg_cd)
					OR (i_itm_cd IS NOT NULL AND i_itm_cd <> l_rpt_key.itm_cd)
					OR (i_itm_suB1 IS NOT NULL AND i_itm_sub1 <> l_rpt_key.itm_sub1)
					OR (i_itm_suB2 IS NOT NULL AND i_itm_sub2 <> l_rpt_key.itm_sub2)
					OR (i_itm_suB3 IS NOT NULL AND i_itm_sub3 <> l_rpt_key.itm_sub3)
					OR (i_itm_jnl_cd IS NOT NULL AND i_itm_jnl_cd <> l_rpt_key.itm_jnl_cd)
					OR (i_itm_grp_typ IS NOT NULL AND i_itm_grp_typ <> l_rpt_key.itm_grp_typ)
					OR (i_itm_grp_cd IS NOT NULL AND i_itm_grp_cd <> l_rpt_key.itm_grp_cd)
				THEN
					CONTINUE ;
				END IF ;

				l_recx := '{}' ;

				FOR y IN
					SELECT	m.rpt_row_cd,
						m.sml_flg
					FROM	mam_rpt_conf m
					WHERE	0=0
					AND	m.rpt_ptn_cd = i_rpt_ptn_cd
					AND	m.del_flg = '0'
					ORDER BY m.sml_flg
				LOOP
					TRUNCATE TABLE mgpa_rpt$rpt_row_loop ;
					IF y.sml_flg = '0' OR mgpa_rpt$f_check_row_cd(y.rpt_row_cd, l_recx) = 0 THEN
						CALL mgpa_rpt$p_get_val(l_rpt_key, i_rpt_ptn_cd, y.rpt_row_cd, z.wg_cd, l_arg, l_recx, l_tmp) ;
					END IF ;
					TRUNCATE TABLE mgpa_rpt$rpt_row_loop ;
				END LOOP ;

				IF COALESCE(array_length(l_recx, 1), 0) > 0 THEN
					INSERT INTO mgt_rpt SELECT * FROM UNNEST(l_recx) ;
				END IF ;

			END LOOP ;
		END ;

		l_recx := '{}' ;

	END LOOP ;

	COMMIT ;

	IF l_msg_char IS NULL THEN
		CALL fcpa_batch_log$p_proc_log('MGBXD0002', CONCAT_WS(' - ', 'MGPA_RPT.P_MAIN', i_rpt_ptn_cd, i_rpt_key_cd)) ;
	ELSE
		CALL fcpa_batch_log$p_proc_log('MGBXD0002', CONCAT_WS(' - ', 'MGPA_RPT.P_MAIN', i_rpt_ptn_cd, i_rpt_key_cd, l_msg_char)) ;
	END IF ;
END ;
$BODY$
LANGUAGE plpgsql
;

