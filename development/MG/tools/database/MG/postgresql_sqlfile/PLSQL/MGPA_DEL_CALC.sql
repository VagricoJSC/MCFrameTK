\encoding UTF-8

CREATE OR REPLACE PROCEDURE mgpa_del_calc$p_chk_del()
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	削除前チェック
<REMARKS>
	削除不可の場合はエラーを返す
<ARGUMENTS>

<HISTORY>
**********************************************************/
DECLARE
	x1 RECORD ;
	x2 RECORD ;
	x3 RECORD ;
	l_msg VARCHAR[] ;
BEGIN
	FOR x1 IN
		SELECT	w.calc_grp_cd,
			w.calc_no
		FROM	mgw_del_calc w
		WHERE	0=0
		AND EXISTS (
				SELECT 'X'
				FROM	mgt_act_alc_amt x
				WHERE	0=0
				AND x.trd_calc_grp_cd = w.calc_grp_cd
				AND x.trd_calc_no = w.calc_no
			)
	LOOP
		l_msg := fcpa_err$msg_binder(x1.calc_grp_cd, x1.calc_no) ;
		CALL fcpa_err$raise_app_err('MGBDD0010', l_msg) ;
	END LOOP ;

	FOR x2 IN
		SELECT	w.calc_grp_cd,
			w.calc_no
		FROM	mgw_del_calc w
		WHERE	0=0
		AND EXISTS (
				SELECT	'X'
				FROM	mgt_pln_alc_amt x
				WHERE	0=0
				AND x.trd_calc_grp_cd = w.calc_grp_cd
				AND x.trd_calc_no = w.calc_no
			)
	LOOP
		l_msg := fcpa_err$msg_binder(x2.calc_grp_cd, x2.calc_no) ;
		CALL fcpa_err$raise_app_err('MGBDD0010', l_msg) ;
	END LOOP ;

	FOR x3 IN
		SELECT w.calc_grp_cd,
			w.calc_no
		FROM	mgw_del_calc w
		WHERE	0=0
		AND EXISTS (
				SELECT	'X'
				FROM	mgt_std_alc_rate x
				WHERE	0=0
				AND x.calc_grp_cd = w.calc_grp_cd
				AND x.calc_no = w.calc_no
			)
	LOOP
		l_msg := fcpa_err$msg_binder(x3.calc_grp_cd, x3.calc_no) ;
		CALL fcpa_err$raise_app_err('MGBDD0011', l_msg) ;
	END LOOP ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_del_calc$p_del_ym_no()
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	MGT_YM_NOの削除処理
<REMARKS>

<ARGUMENTS>

<HISTORY>
**********************************************************/
DECLARE
	x RECORD ;
BEGIN
	/* 削除対象のレコードにMGT_YM_NOが存在する場合はMGT_YM_NOを再作成する必要がある */
	FOR x IN
		SELECT	w.calc_grp_cd,
			w.calc_no,
			fcpa_postgres_util$add_months(t.end_ym, - 1) AS ym
		FROM	mgw_del_calc w, mgt_arg t
		WHERE	0=0
		AND EXISTS (
				SELECT 'X'
				FROM	mgt_ym_no m
				WHERE	0=0
				AND m.calc_grp_cd = w.calc_grp_cd
				AND m.calc_no = w.calc_no
			)
		AND w.calc_grp_cd = t.calc_grp_cd
		AND w.calc_no = t.calc_no
		ORDER BY w.calc_grp_cd, t.end_ym DESC, w.calc_no DESC
	LOOP
		CALL mgpa_calc_fix$p_remake_ym_no(x.calc_grp_cd, x.calc_no, x.ym) ;
	END LOOP ;

	DELETE FROM	mgt_ym_no	t WHERE EXISTS (SELECT 'X' FROM	mgw_del_calc w WHERE w.calc_grp_cd = t.calc_grp_cd AND w.calc_no = t.calc_no) ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_del_calc$p_restore_arg(
	IN i_arg mgt_arg[],
	IN i_msg VARCHAR[]
)
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	例外発生時のmgt_arg復元処理
<REMARKS>

<ARGUMENTS>

<HISTORY>
**********************************************************/
BEGIN
	INSERT INTO mgt_arg SELECT * FROM UNNEST(i_arg) ;
	COMMIT ;

	CALL fcpa_err$raise_app_err('MGBXD0004', i_msg) ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_del_calc$p_main()
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	削除メイン処理
<REMARKS>
	MGW_DEL_CALCに対象となるデータを設定しておく必要がある
<ARGUMENTS>

<HISTORY>
**********************************************************/
DECLARE
	arg	mgt_arg[] ;

	rec	mgw_del_calc[] ;
	tmp_rec mgw_del_calc%ROWTYPE ;
	i INTEGER ;

	x RECORD ;
BEGIN
	<<PROC_END>>
	BEGIN
		CALL fcpa_batch_log$p_proc_log('MGBXD0001', 'MGPA_DEL_CALC.P_MAIN') ;

		arg := '{}' ;
		rec := '{}' ;
		i := 0 ;
		FOR x IN
			SELECT t.*
			FROM	mgt_arg t
			WHERE	0=0
			AND	EXISTS (
					SELECT	'X'
					FROM	mgw_del_calc w
					WHERE	0=0
					AND w.calc_grp_cd = t.calc_grp_cd
					AND w.calc_no = t.calc_no
				)
		LOOP
			i := i + 1 ;
			arg[i] := x ;

			tmp_rec.calc_no := x.calc_no ;
			tmp_rec.calc_grp_cd := x.calc_grp_cd ;
			rec[i] := tmp_rec ;
		END LOOP ;

		IF i = 0 THEN
			EXIT PROC_END ;
		END IF ;

		CALL mgpa_del_calc$p_chk_del() ;

		CALL mgpa_del_calc$p_del_ym_no() ;

		BEGIN
			FOR j IN 1..i LOOP DELETE FROM mgt_arg t WHERE t.calc_grp_cd = rec[j].calc_grp_cd AND t.calc_no = rec[j].calc_no ; END LOOP ;
		EXCEPTION
			WHEN others THEN CALL fcpa_err$raise_app_err('MGBXD0004', fcpa_err$msg_binder(SQLERRM)) ;
		END ;
		COMMIT ;

		BEGIN
			FOR j IN 1..i LOOP DELETE FROM mgt_calc_ptn t WHERE t.calc_grp_cd = rec[j].calc_grp_cd AND t.calc_no = rec[j].calc_no ; END LOOP ;
		EXCEPTION
			WHEN others THEN call mgpa_del_calc$p_restore_arg(arg, fcpa_err$msg_binder(SQLERRM)) ;
		END ;
		COMMIT ;

		BEGIN
			FOR j IN 1..i LOOP DELETE FROM mgt_calc_itm t WHERE t.calc_grp_cd = rec[j].calc_grp_cd AND t.calc_no = rec[j].calc_no ; END LOOP ;
		EXCEPTION
			WHEN others THEN call mgpa_del_calc$p_restore_arg(arg, fcpa_err$msg_binder(SQLERRM)) ;
		END ;
		COMMIT ;

		BEGIN
			FOR j IN 1..i LOOP DELETE FROM mgt_calc_itm_dtl t WHERE t.calc_grp_cd = rec[j].calc_grp_cd AND t.calc_no = rec[j].calc_no ; END LOOP ;
		EXCEPTION
			WHEN others THEN call mgpa_del_calc$p_restore_arg(arg, fcpa_err$msg_binder(SQLERRM)) ;
		END ;
		COMMIT ;

		BEGIN
			FOR j IN 1..i LOOP DELETE FROM mgt_calc_itm_oper t WHERE t.calc_grp_cd = rec[j].calc_grp_cd AND t.calc_no = rec[j].calc_no ; END LOOP ;
		EXCEPTION
			WHEN others THEN call mgpa_del_calc$p_restore_arg(arg, fcpa_err$msg_binder(SQLERRM)) ;
		END ;
		COMMIT ;

		BEGIN
			FOR j IN 1..i LOOP DELETE FROM mgt_calc_bom t WHERE t.calc_grp_cd = rec[j].calc_grp_cd AND t.calc_no = rec[j].calc_no ; END LOOP ;
		EXCEPTION
			WHEN others THEN call mgpa_del_calc$p_restore_arg(arg, fcpa_err$msg_binder(SQLERRM)) ;
		END ;
		COMMIT ;

		BEGIN
			FOR j IN 1..i LOOP DELETE FROM mgt_calc_itm_wk t WHERE t.calc_grp_cd = rec[j].calc_grp_cd AND t.calc_no = rec[j].calc_no ; END LOOP ;
		EXCEPTION
			WHEN others THEN call mgpa_del_calc$p_restore_arg(arg, fcpa_err$msg_binder(SQLERRM)) ;
		END ;
		COMMIT ;

		BEGIN
			FOR j IN 1..i LOOP DELETE FROM mgt_calc_itm_purc t WHERE t.calc_grp_cd = rec[j].calc_grp_cd AND t.calc_no = rec[j].calc_no ; END LOOP ;
		EXCEPTION
			WHEN others THEN call mgpa_del_calc$p_restore_arg(arg, fcpa_err$msg_binder(SQLERRM)) ;
		END ;
		COMMIT ;

		BEGIN
			FOR j IN 1..i LOOP DELETE FROM mgt_calc_itm_proc t WHERE t.calc_grp_cd = rec[j].calc_grp_cd AND t.calc_no = rec[j].calc_no ; END LOOP ;
		EXCEPTION
			WHEN others THEN call mgpa_del_calc$p_restore_arg(arg, fcpa_err$msg_binder(SQLERRM)) ;
		END ;
		COMMIT ;

		BEGIN
			FOR j IN 1..i LOOP DELETE FROM mgt_calc_itm_prov t WHERE t.calc_grp_cd = rec[j].calc_grp_cd AND t.calc_no = rec[j].calc_no ; END LOOP ;
		EXCEPTION
			WHEN others THEN call mgpa_del_calc$p_restore_arg(arg, fcpa_err$msg_binder(SQLERRM)) ;
		END ;
		COMMIT ;

		BEGIN
			FOR j IN 1..i LOOP DELETE FROM mgt_calc_itm_sls t WHERE t.calc_grp_cd = rec[j].calc_grp_cd AND t.calc_no = rec[j].calc_no ; END LOOP ;
		EXCEPTION
			WHEN others THEN call mgpa_del_calc$p_restore_arg(arg, fcpa_err$msg_binder(SQLERRM)) ;
		END ;
		COMMIT ;

		BEGIN
			FOR j IN 1..i LOOP DELETE FROM mgt_calc_itm_fix t WHERE t.calc_grp_cd = rec[j].calc_grp_cd AND t.calc_no = rec[j].calc_no ; END LOOP ;
		EXCEPTION
			WHEN others THEN call mgpa_del_calc$p_restore_arg(arg, fcpa_err$msg_binder(SQLERRM)) ;
		END ;
		COMMIT ;

		BEGIN
			FOR j IN 1..i LOOP DELETE FROM mgt_calc_xrate t WHERE t.calc_grp_cd = rec[j].calc_grp_cd AND t.calc_no = rec[j].calc_no ; END LOOP ;
		EXCEPTION
			WHEN others THEN call mgpa_del_calc$p_restore_arg(arg, fcpa_err$msg_binder(SQLERRM)) ;
		END ;
		COMMIT ;

		BEGIN
			FOR j IN 1..i LOOP DELETE FROM mgt_calc_parm t WHERE t.calc_grp_cd = rec[j].calc_grp_cd AND t.calc_no = rec[j].calc_no ; END LOOP ;
		EXCEPTION
			WHEN others THEN call mgpa_del_calc$p_restore_arg(arg, fcpa_err$msg_binder(SQLERRM)) ;
		END ;
		COMMIT ;

		BEGIN
			FOR j IN 1..i LOOP DELETE FROM mgt_calc_cur_parm t WHERE t.calc_grp_cd = rec[j].calc_grp_cd AND t.calc_no = rec[j].calc_no ; END LOOP ;
		EXCEPTION
			WHEN others THEN call mgpa_del_calc$p_restore_arg(arg, fcpa_err$msg_binder(SQLERRM)) ;
		END ;
		COMMIT ;

		BEGIN
			FOR j IN 1..i LOOP DELETE FROM mgt_calc_std_alc_rate t WHERE t.calc_grp_cd = rec[j].calc_grp_cd AND t.calc_no = rec[j].calc_no ; END LOOP ;
		EXCEPTION
			WHEN others THEN call mgpa_del_calc$p_restore_arg(arg, fcpa_err$msg_binder(SQLERRM)) ;
		END ;
		COMMIT ;

		BEGIN
			FOR j IN 1..i LOOP DELETE FROM mgt_calc_pre_alc_amt t WHERE t.calc_grp_cd = rec[j].calc_grp_cd AND t.calc_no = rec[j].calc_no ; END LOOP ;
		EXCEPTION
			WHEN others THEN call mgpa_del_calc$p_restore_arg(arg, fcpa_err$msg_binder(SQLERRM)) ;
		END ;
		COMMIT ;

		BEGIN
			FOR j IN 1..i LOOP DELETE FROM mgt_calc_alc_amt t WHERE t.calc_grp_cd = rec[j].calc_grp_cd AND t.calc_no = rec[j].calc_no ; END LOOP ;
		EXCEPTION
			WHEN others THEN call mgpa_del_calc$p_restore_arg(arg, fcpa_err$msg_binder(SQLERRM)) ;
		END ;
		COMMIT ;

		BEGIN
			FOR j IN 1..i LOOP DELETE FROM mgt_calc_rqmt t WHERE t.calc_grp_cd = rec[j].calc_grp_cd AND t.calc_no = rec[j].calc_no ; END LOOP ;
		EXCEPTION
			WHEN others THEN call mgpa_del_calc$p_restore_arg(arg, fcpa_err$msg_binder(SQLERRM)) ;
		END ;
		COMMIT ;

		BEGIN
			FOR j IN 1..i LOOP DELETE FROM mgt_calc_mfg t WHERE t.calc_grp_cd = rec[j].calc_grp_cd AND t.calc_no = rec[j].calc_no ; END LOOP ;
		EXCEPTION
			WHEN others THEN call mgpa_del_calc$p_restore_arg(arg, fcpa_err$msg_binder(SQLERRM)) ;
		END ;
		COMMIT ;

		BEGIN
			FOR j IN 1..i LOOP DELETE FROM mgt_calc_purc t WHERE t.calc_grp_cd = rec[j].calc_grp_cd AND t.calc_no = rec[j].calc_no ; END LOOP ;
		EXCEPTION
			WHEN others THEN call mgpa_del_calc$p_restore_arg(arg, fcpa_err$msg_binder(SQLERRM)) ;
		END ;
		COMMIT ;

		BEGIN
			FOR j IN 1..i LOOP DELETE FROM mgt_calc_inpt t WHERE t.calc_grp_cd = rec[j].calc_grp_cd AND t.calc_no = rec[j].calc_no ; END LOOP ;
		EXCEPTION
			WHEN others THEN call mgpa_del_calc$p_restore_arg(arg, fcpa_err$msg_binder(SQLERRM)) ;
		END ;
		COMMIT ;

		BEGIN
			FOR j IN 1..i LOOP DELETE FROM mgt_calc_wk t WHERE t.calc_grp_cd = rec[j].calc_grp_cd AND t.calc_no = rec[j].calc_no ; END LOOP ;
		EXCEPTION
			WHEN others THEN call mgpa_del_calc$p_restore_arg(arg, fcpa_err$msg_binder(SQLERRM)) ;
		END ;
		COMMIT ;

		BEGIN
			FOR j IN 1..i LOOP DELETE FROM mgt_calc_other_wk t WHERE t.calc_grp_cd = rec[j].calc_grp_cd AND t.calc_no = rec[j].calc_no ; END LOOP ;
		EXCEPTION
			WHEN others THEN call mgpa_del_calc$p_restore_arg(arg, fcpa_err$msg_binder(SQLERRM)) ;
		END ;
		COMMIT ;

		BEGIN
			FOR j IN 1..i LOOP DELETE FROM mgt_calc_sls t WHERE t.calc_grp_cd = rec[j].calc_grp_cd AND t.calc_no = rec[j].calc_no ; END LOOP ;
		EXCEPTION
			WHEN others THEN call mgpa_del_calc$p_restore_arg(arg, fcpa_err$msg_binder(SQLERRM)) ;
		END ;
		COMMIT ;

		BEGIN
			FOR j IN 1..i LOOP DELETE FROM mgt_calc_io t WHERE t.calc_grp_cd = rec[j].calc_grp_cd AND t.calc_no = rec[j].calc_no ; END LOOP ;
		EXCEPTION
			WHEN others THEN call mgpa_del_calc$p_restore_arg(arg, fcpa_err$msg_binder(SQLERRM)) ;
		END ;
		COMMIT ;

		BEGIN
			FOR j IN 1..i LOOP DELETE FROM mgt_calc_inst_wip t WHERE t.calc_grp_cd = rec[j].calc_grp_cd AND t.calc_no = rec[j].calc_no ; END LOOP ;
		EXCEPTION
			WHEN others THEN call mgpa_del_calc$p_restore_arg(arg, fcpa_err$msg_binder(SQLERRM)) ;
		END ;
		COMMIT ;

		BEGIN
			FOR j IN 1..i LOOP DELETE FROM mgt_calc_itm_mfg_inst t WHERE t.calc_grp_cd = rec[j].calc_grp_cd AND t.calc_no = rec[j].calc_no ; END LOOP ;
		EXCEPTION
			WHEN others THEN call mgpa_del_calc$p_restore_arg(arg, fcpa_err$msg_binder(SQLERRM)) ;
		END ;
		COMMIT ;

		BEGIN
			FOR j IN 1..i LOOP DELETE FROM mgt_calc_io_expns_amt t WHERE t.calc_grp_cd = rec[j].calc_grp_cd AND t.calc_no = rec[j].calc_no ; END LOOP ;
		EXCEPTION
			WHEN others THEN call mgpa_del_calc$p_restore_arg(arg, fcpa_err$msg_binder(SQLERRM)) ;
		END ;
		COMMIT ;

		BEGIN
			FOR j IN 1..i LOOP DELETE FROM mgt_calc_io_trd t WHERE t.calc_grp_cd = rec[j].calc_grp_cd AND t.calc_no = rec[j].calc_no ; END LOOP ;
		EXCEPTION
			WHEN others THEN call mgpa_del_calc$p_restore_arg(arg, fcpa_err$msg_binder(SQLERRM)) ;
		END ;
		COMMIT ;

		BEGIN
			FOR j IN 1..i LOOP DELETE FROM mgt_calc_trd_calc_no t WHERE t.calc_grp_cd = rec[j].calc_grp_cd AND t.calc_no = rec[j].calc_no ; END LOOP ;
		EXCEPTION
			WHEN others THEN call mgpa_del_calc$p_restore_arg(arg, fcpa_err$msg_binder(SQLERRM)) ;
		END ;
		COMMIT ;

		BEGIN
			FOR j IN 1..i LOOP DELETE FROM mgt_calc_gp_alc t WHERE t.calc_grp_cd = rec[j].calc_grp_cd AND t.calc_no = rec[j].calc_no ; END LOOP ;
		EXCEPTION
			WHEN others THEN call mgpa_del_calc$p_restore_arg(arg, fcpa_err$msg_binder(SQLERRM)) ;
		END ;
		COMMIT ;

		BEGIN
			FOR j IN 1..i LOOP DELETE FROM mgt_pre_alc t WHERE t.calc_grp_cd = rec[j].calc_grp_cd AND t.calc_no = rec[j].calc_no ; END LOOP ;
		EXCEPTION
			WHEN others THEN call mgpa_del_calc$p_restore_arg(arg, fcpa_err$msg_binder(SQLERRM)) ;
		END ;
		COMMIT ;

		BEGIN
			FOR j IN 1..i LOOP DELETE FROM mgt_pre_alc_path t WHERE t.calc_grp_cd = rec[j].calc_grp_cd AND t.calc_no = rec[j].calc_no ; END LOOP ;
		EXCEPTION
			WHEN others THEN call mgpa_del_calc$p_restore_arg(arg, fcpa_err$msg_binder(SQLERRM)) ;
		END ;
		COMMIT ;

		BEGIN
			FOR j IN 1..i LOOP DELETE FROM mgt_exp_mfg_purc t WHERE t.calc_grp_cd = rec[j].calc_grp_cd AND t.calc_no = rec[j].calc_no ; END LOOP ;
		EXCEPTION
			WHEN others THEN call mgpa_del_calc$p_restore_arg(arg, fcpa_err$msg_binder(SQLERRM)) ;
		END ;
		COMMIT ;

		BEGIN
			FOR j IN 1..i LOOP DELETE FROM mgt_exp_oper t WHERE t.calc_grp_cd = rec[j].calc_grp_cd AND t.calc_no = rec[j].calc_no ; END LOOP ;
		EXCEPTION
			WHEN others THEN call mgpa_del_calc$p_restore_arg(arg, fcpa_err$msg_binder(SQLERRM)) ;
		END ;
		COMMIT ;

		BEGIN
			FOR j IN 1..i LOOP DELETE FROM mgt_exp_inpt t WHERE t.calc_grp_cd = rec[j].calc_grp_cd AND t.calc_no = rec[j].calc_no ; END LOOP ;
		EXCEPTION
			WHEN others THEN call mgpa_del_calc$p_restore_arg(arg, fcpa_err$msg_binder(SQLERRM)) ;
		END ;
		COMMIT ;

		BEGIN
			FOR j IN 1..i LOOP DELETE FROM mgt_exp_wk t WHERE t.calc_grp_cd = rec[j].calc_grp_cd AND t.calc_no = rec[j].calc_no ; END LOOP ;
		EXCEPTION
			WHEN others THEN call mgpa_del_calc$p_restore_arg(arg, fcpa_err$msg_binder(SQLERRM)) ;
		END ;
		COMMIT ;

		BEGIN
			FOR j IN 1..i LOOP DELETE FROM mgt_exp_prov t WHERE t.calc_grp_cd = rec[j].calc_grp_cd AND t.calc_no = rec[j].calc_no ; END LOOP ;
		EXCEPTION
			WHEN others THEN call mgpa_del_calc$p_restore_arg(arg, fcpa_err$msg_binder(SQLERRM)) ;
		END ;
		COMMIT ;

		BEGIN
			FOR j IN 1..i LOOP DELETE FROM mgt_alc_calc_rate t WHERE t.calc_grp_cd = rec[j].calc_grp_cd AND t.calc_no = rec[j].calc_no ; END LOOP ;
		EXCEPTION
			WHEN others THEN call mgpa_del_calc$p_restore_arg(arg, fcpa_err$msg_binder(SQLERRM)) ;
		END ;
		COMMIT ;

		BEGIN
			FOR j IN 1..i LOOP DELETE FROM mgt_alc_calc_err t WHERE t.calc_grp_cd = rec[j].calc_grp_cd AND t.calc_no = rec[j].calc_no ; END LOOP ;
		EXCEPTION
			WHEN others THEN call mgpa_del_calc$p_restore_arg(arg, fcpa_err$msg_binder(SQLERRM)) ;
		END ;
		COMMIT ;

		BEGIN
			FOR j IN 1..i LOOP DELETE FROM mgt_alc_calc_dtl t WHERE t.calc_grp_cd = rec[j].calc_grp_cd AND t.calc_no = rec[j].calc_no ; END LOOP ;
		EXCEPTION
			WHEN others THEN call mgpa_del_calc$p_restore_arg(arg, fcpa_err$msg_binder(SQLERRM)) ;
		END ;
		COMMIT ;

		BEGIN
			FOR j IN 1..i LOOP DELETE FROM mgt_std_top t WHERE t.calc_grp_cd = rec[j].calc_grp_cd AND t.calc_no = rec[j].calc_no ; END LOOP ;
		EXCEPTION
			WHEN others THEN call mgpa_del_calc$p_restore_arg(arg, fcpa_err$msg_binder(SQLERRM)) ;
		END ;
		COMMIT ;

		BEGIN
			FOR j IN 1..i LOOP DELETE FROM mgt_std_oper t WHERE t.calc_grp_cd = rec[j].calc_grp_cd AND t.calc_no = rec[j].calc_no ; END LOOP ;
		EXCEPTION
			WHEN others THEN call mgpa_del_calc$p_restore_arg(arg, fcpa_err$msg_binder(SQLERRM)) ;
		END ;
		COMMIT ;

		BEGIN
			FOR j IN 1..i LOOP DELETE FROM mgt_std_wk t WHERE t.calc_grp_cd = rec[j].calc_grp_cd AND t.calc_no = rec[j].calc_no ; END LOOP ;
		EXCEPTION
			WHEN others THEN call mgpa_del_calc$p_restore_arg(arg, fcpa_err$msg_binder(SQLERRM)) ;
		END ;
		COMMIT ;

		BEGIN
			FOR j IN 1..i LOOP DELETE FROM mgt_std_inpt t WHERE t.calc_grp_cd = rec[j].calc_grp_cd AND t.calc_no = rec[j].calc_no ; END LOOP ;
		EXCEPTION
			WHEN others THEN call mgpa_del_calc$p_restore_arg(arg, fcpa_err$msg_binder(SQLERRM)) ;
		END ;
		COMMIT ;

		BEGIN
			FOR j IN 1..i LOOP DELETE FROM mgt_std_cost t WHERE t.calc_grp_cd = rec[j].calc_grp_cd AND t.calc_no = rec[j].calc_no ; END LOOP ;
		EXCEPTION
			WHEN others THEN call mgpa_del_calc$p_restore_arg(arg, fcpa_err$msg_binder(SQLERRM)) ;
		END ;
		COMMIT ;

		BEGIN
			FOR j IN 1..i LOOP DELETE FROM mgt_std_sml_cost t WHERE t.calc_grp_cd = rec[j].calc_grp_cd AND t.calc_no = rec[j].calc_no ; END LOOP ;
		EXCEPTION
			WHEN others THEN call mgpa_del_calc$p_restore_arg(arg, fcpa_err$msg_binder(SQLERRM)) ;
		END ;
		COMMIT ;

		BEGIN
			FOR j IN 1..i LOOP DELETE FROM mgt_std_alc t WHERE t.calc_grp_cd = rec[j].calc_grp_cd AND t.calc_no = rec[j].calc_no ; END LOOP ;
		EXCEPTION
			WHEN others THEN call mgpa_del_calc$p_restore_arg(arg, fcpa_err$msg_binder(SQLERRM)) ;
		END ;
		COMMIT ;

		BEGIN
			FOR j IN 1..i LOOP DELETE FROM mgt_std_fix t WHERE t.calc_grp_cd = rec[j].calc_grp_cd AND t.calc_no = rec[j].calc_no ; END LOOP ;
		EXCEPTION
			WHEN others THEN call mgpa_del_calc$p_restore_arg(arg, fcpa_err$msg_binder(SQLERRM)) ;
		END ;
		COMMIT ;

		BEGIN
			FOR j IN 1..i LOOP DELETE FROM mgt_acc_top t WHERE t.calc_grp_cd = rec[j].calc_grp_cd AND t.calc_no = rec[j].calc_no ; END LOOP ;
		EXCEPTION
			WHEN others THEN call mgpa_del_calc$p_restore_arg(arg, fcpa_err$msg_binder(SQLERRM)) ;
		END ;
		COMMIT ;

		BEGIN
			FOR j IN 1..i LOOP DELETE FROM mgt_acc_wk t WHERE t.calc_grp_cd = rec[j].calc_grp_cd AND t.calc_no = rec[j].calc_no ; END LOOP ;
		EXCEPTION
			WHEN others THEN call mgpa_del_calc$p_restore_arg(arg, fcpa_err$msg_binder(SQLERRM)) ;
		END ;
		COMMIT ;

		BEGIN
			FOR j IN 1..i LOOP DELETE FROM mgt_acc_inpt t WHERE t.calc_grp_cd = rec[j].calc_grp_cd AND t.calc_no = rec[j].calc_no ; END LOOP ;
		EXCEPTION
			WHEN others THEN call mgpa_del_calc$p_restore_arg(arg, fcpa_err$msg_binder(SQLERRM)) ;
		END ;
		COMMIT ;

		BEGIN
			FOR j IN 1..i LOOP DELETE FROM mgt_acc_cost t WHERE t.calc_grp_cd = rec[j].calc_grp_cd AND t.calc_no = rec[j].calc_no ; END LOOP ;
		EXCEPTION
			WHEN others THEN call mgpa_del_calc$p_restore_arg(arg, fcpa_err$msg_binder(SQLERRM)) ;
		END ;
		COMMIT ;

		BEGIN
			FOR j IN 1..i LOOP DELETE FROM mgt_acc_sml_cost t WHERE t.calc_grp_cd = rec[j].calc_grp_cd AND t.calc_no = rec[j].calc_no ; END LOOP ;
		EXCEPTION
			WHEN others THEN call mgpa_del_calc$p_restore_arg(arg, fcpa_err$msg_binder(SQLERRM)) ;
		END ;
		COMMIT ;

		BEGIN
			FOR j IN 1..i LOOP DELETE FROM mgt_acc_trd t WHERE t.calc_grp_cd = rec[j].calc_grp_cd AND t.calc_no = rec[j].calc_no ; END LOOP ;
		EXCEPTION
			WHEN others THEN call mgpa_del_calc$p_restore_arg(arg, fcpa_err$msg_binder(SQLERRM)) ;
		END ;
		COMMIT ;

		BEGIN
			FOR j IN 1..i LOOP DELETE FROM mgt_ave_fix t WHERE t.calc_grp_cd = rec[j].calc_grp_cd AND t.calc_no = rec[j].calc_no ; END LOOP ;
		EXCEPTION
			WHEN others THEN call mgpa_del_calc$p_restore_arg(arg, fcpa_err$msg_binder(SQLERRM)) ;
		END ;
		COMMIT ;

		BEGIN
			FOR j IN 1..i LOOP DELETE FROM mgt_wip_loc t WHERE t.calc_grp_cd = rec[j].calc_grp_cd AND t.calc_no = rec[j].calc_no ; END LOOP ;
		EXCEPTION
			WHEN others THEN call mgpa_del_calc$p_restore_arg(arg, fcpa_err$msg_binder(SQLERRM)) ;
		END ;
		COMMIT ;

		BEGIN
			FOR j IN 1..i LOOP DELETE FROM mgt_stk_loss t WHERE t.calc_grp_cd = rec[j].calc_grp_cd AND t.calc_no = rec[j].calc_no ; END LOOP ;
		EXCEPTION
			WHEN others THEN call mgpa_del_calc$p_restore_arg(arg, fcpa_err$msg_binder(SQLERRM)) ;
		END ;
		COMMIT ;

		BEGIN
			FOR j IN 1..i LOOP DELETE FROM mgt_rpt t WHERE t.calc_grp_cd = rec[j].calc_grp_cd AND t.calc_no = rec[j].calc_no ; END LOOP ;
		EXCEPTION
			WHEN others THEN call mgpa_del_calc$p_restore_arg(arg, fcpa_err$msg_binder(SQLERRM)) ;
		END ;
		COMMIT ;

		BEGIN
			FOR j IN 1..i LOOP DELETE FROM mgt_io t WHERE t.calc_grp_cd = rec[j].calc_grp_cd AND t.calc_no = rec[j].calc_no ; END LOOP ;
		EXCEPTION
			WHEN others THEN call mgpa_del_calc$p_restore_arg(arg, fcpa_err$msg_binder(SQLERRM)) ;
		END ;
		COMMIT ;

		BEGIN
			FOR j IN 1..i LOOP DELETE FROM mgt_cost_io1 t WHERE t.calc_grp_cd = rec[j].calc_grp_cd AND t.calc_no = rec[j].calc_no ; END LOOP ;
		EXCEPTION
			WHEN others THEN call mgpa_del_calc$p_restore_arg(arg, fcpa_err$msg_binder(SQLERRM)) ;
		END ;
		COMMIT ;

		BEGIN
			FOR j IN 1..i LOOP DELETE FROM mgt_cost_io2 t WHERE t.calc_grp_cd = rec[j].calc_grp_cd AND t.calc_no = rec[j].calc_no ; END LOOP ;
		EXCEPTION
			WHEN others THEN call mgpa_del_calc$p_restore_arg(arg, fcpa_err$msg_binder(SQLERRM)) ;
		END ;
		COMMIT ;

		BEGIN
			FOR j IN 1..i LOOP DELETE FROM mgt_cost_io3 t WHERE t.calc_grp_cd = rec[j].calc_grp_cd AND t.calc_no = rec[j].calc_no ; END LOOP ;
		EXCEPTION
			WHEN others THEN call mgpa_del_calc$p_restore_arg(arg, fcpa_err$msg_binder(SQLERRM)) ;
		END ;
		COMMIT ;

		BEGIN
			FOR j IN 1..i LOOP DELETE FROM mgt_cost_io4 t WHERE t.calc_grp_cd = rec[j].calc_grp_cd AND t.calc_no = rec[j].calc_no ; END LOOP ;
		EXCEPTION
			WHEN others THEN call mgpa_del_calc$p_restore_arg(arg, fcpa_err$msg_binder(SQLERRM)) ;
		END ;
		COMMIT ;

		BEGIN
			FOR j IN 1..i LOOP DELETE FROM mgt_cost_io5 t WHERE t.calc_grp_cd = rec[j].calc_grp_cd AND t.calc_no = rec[j].calc_no ; END LOOP ;
		EXCEPTION
			WHEN others THEN call mgpa_del_calc$p_restore_arg(arg, fcpa_err$msg_binder(SQLERRM)) ;
		END ;
		COMMIT ;

		BEGIN
			FOR j IN 1..i LOOP DELETE FROM mgt_cost_io6 t WHERE t.calc_grp_cd = rec[j].calc_grp_cd AND t.calc_no = rec[j].calc_no ; END LOOP ;
		EXCEPTION
			WHEN others THEN call mgpa_del_calc$p_restore_arg(arg, fcpa_err$msg_binder(SQLERRM)) ;
		END ;
		COMMIT ;

		BEGIN
			FOR j IN 1..i LOOP DELETE FROM mgt_cost_io7 t WHERE t.calc_grp_cd = rec[j].calc_grp_cd AND t.calc_no = rec[j].calc_no ; END LOOP ;
		EXCEPTION
			WHEN others THEN call mgpa_del_calc$p_restore_arg(arg, fcpa_err$msg_binder(SQLERRM)) ;
		END ;
		COMMIT ;

		BEGIN
			FOR j IN 1..i LOOP DELETE FROM mgt_cost_io8 t WHERE t.calc_grp_cd = rec[j].calc_grp_cd AND t.calc_no = rec[j].calc_no ; END LOOP ;
		EXCEPTION
			WHEN others THEN call mgpa_del_calc$p_restore_arg(arg, fcpa_err$msg_binder(SQLERRM)) ;
		END ;
		COMMIT ;

		BEGIN
			FOR j IN 1..i LOOP DELETE FROM mgt_cost_io9 t WHERE t.calc_grp_cd = rec[j].calc_grp_cd AND t.calc_no = rec[j].calc_no ; END LOOP ;
		EXCEPTION
			WHEN others THEN call mgpa_del_calc$p_restore_arg(arg, fcpa_err$msg_binder(SQLERRM)) ;
		END ;
		COMMIT ;

		BEGIN
			FOR j IN 1..i LOOP DELETE FROM mgt_cost_io10 t WHERE t.calc_grp_cd = rec[j].calc_grp_cd AND t.calc_no = rec[j].calc_no ; END LOOP ;
		EXCEPTION
			WHEN others THEN call mgpa_del_calc$p_restore_arg(arg, fcpa_err$msg_binder(SQLERRM)) ;
		END ;
		COMMIT ;

		BEGIN
			FOR j IN 1..i LOOP DELETE FROM mgt_cost_io11 t WHERE t.calc_grp_cd = rec[j].calc_grp_cd AND t.calc_no = rec[j].calc_no ; END LOOP ;
		EXCEPTION
			WHEN others THEN call mgpa_del_calc$p_restore_arg(arg, fcpa_err$msg_binder(SQLERRM)) ;
		END ;
		COMMIT ;

		BEGIN
			FOR j IN 1..i LOOP DELETE FROM mgt_cost_io12 t WHERE t.calc_grp_cd = rec[j].calc_grp_cd AND t.calc_no = rec[j].calc_no ; END LOOP ;
		EXCEPTION
			WHEN others THEN call mgpa_del_calc$p_restore_arg(arg, fcpa_err$msg_binder(SQLERRM)) ;
		END ;
		COMMIT ;

		BEGIN
			FOR j IN 1..i LOOP DELETE FROM mgt_cost_io13 t WHERE t.calc_grp_cd = rec[j].calc_grp_cd AND t.calc_no = rec[j].calc_no ; END LOOP ;
		EXCEPTION
			WHEN others THEN call mgpa_del_calc$p_restore_arg(arg, fcpa_err$msg_binder(SQLERRM)) ;
		END ;
		COMMIT ;

		BEGIN
			FOR j IN 1..i LOOP DELETE FROM mgt_cost_io14 t WHERE t.calc_grp_cd = rec[j].calc_grp_cd AND t.calc_no = rec[j].calc_no ; END LOOP ;
		EXCEPTION
			WHEN others THEN call mgpa_del_calc$p_restore_arg(arg, fcpa_err$msg_binder(SQLERRM)) ;
		END ;
		COMMIT ;

		BEGIN
			FOR j IN 1..i LOOP DELETE FROM mgt_cost_io15 t WHERE t.calc_grp_cd = rec[j].calc_grp_cd AND t.calc_no = rec[j].calc_no ; END LOOP ;
		EXCEPTION
			WHEN others THEN call mgpa_del_calc$p_restore_arg(arg, fcpa_err$msg_binder(SQLERRM)) ;
		END ;
		COMMIT ;

		BEGIN
			FOR j IN 1..i LOOP DELETE FROM mgt_cost_io16 t WHERE t.calc_grp_cd = rec[j].calc_grp_cd AND t.calc_no = rec[j].calc_no ; END LOOP ;
		EXCEPTION
			WHEN others THEN call mgpa_del_calc$p_restore_arg(arg, fcpa_err$msg_binder(SQLERRM)) ;
		END ;
		COMMIT ;

		BEGIN
			FOR j IN 1..i LOOP DELETE FROM mgt_cost_io17 t WHERE t.calc_grp_cd = rec[j].calc_grp_cd AND t.calc_no = rec[j].calc_no ; END LOOP ;
		EXCEPTION
			WHEN others THEN call mgpa_del_calc$p_restore_arg(arg, fcpa_err$msg_binder(SQLERRM)) ;
		END ;
		COMMIT ;

		BEGIN
			FOR j IN 1..i LOOP DELETE FROM mgt_cost_io18 t WHERE t.calc_grp_cd = rec[j].calc_grp_cd AND t.calc_no = rec[j].calc_no ; END LOOP ;
		EXCEPTION
			WHEN others THEN call mgpa_del_calc$p_restore_arg(arg, fcpa_err$msg_binder(SQLERRM)) ;
		END ;
		COMMIT ;

		BEGIN
			FOR j IN 1..i LOOP DELETE FROM mgt_cost_io19 t WHERE t.calc_grp_cd = rec[j].calc_grp_cd AND t.calc_no = rec[j].calc_no ; END LOOP ;
		EXCEPTION
			WHEN others THEN call mgpa_del_calc$p_restore_arg(arg, fcpa_err$msg_binder(SQLERRM)) ;
		END ;
		COMMIT ;

		BEGIN
			FOR j IN 1..i LOOP DELETE FROM mgt_cost_io20 t WHERE t.calc_grp_cd = rec[j].calc_grp_cd AND t.calc_no = rec[j].calc_no ; END LOOP ;
		EXCEPTION
			WHEN others THEN  call mgpa_del_calc$p_restore_arg(arg, fcpa_err$msg_binder(SQLERRM)) ;
		END ;
		COMMIT ;

		BEGIN
			FOR j IN 1..i LOOP DELETE FROM mgt_wg_fix t WHERE t.calc_grp_cd = rec[j].calc_grp_cd AND EXISTS (SELECT 'X' FROM mgt_calc_fix w WHERE w.calc_grp_cd = t.calc_grp_cd and w.calc_no = rec[j].calc_no and w.ym = t.ym) ; END LOOP ;
		EXCEPTION
			WHEN others THEN call mgpa_del_calc$p_restore_arg(arg, fcpa_err$msg_binder(SQLERRM)) ;
		END ;
		COMMIT ;

		BEGIN
			FOR j IN 1..i LOOP DELETE FROM mgt_ctg_fix t WHERE t.calc_grp_cd = rec[j].calc_grp_cd AND EXISTS (SELECT 'X' FROM mgt_calc_fix w WHERE w.calc_grp_cd = t.calc_grp_cd and w.calc_no = rec[j].calc_no and w.ym = t.ym) ; END LOOP ;
		EXCEPTION
			WHEN others THEN call mgpa_del_calc$p_restore_arg(arg, fcpa_err$msg_binder(SQLERRM)) ;
		END ;
		COMMIT ;

		BEGIN
			FOR j IN 1..i LOOP DELETE FROM mgt_calc_fix t WHERE t.calc_grp_cd = rec[j].calc_grp_cd AND t.calc_no = rec[j].calc_no ; END LOOP ;
		EXCEPTION
			WHEN others THEN call mgpa_del_calc$p_restore_arg(arg, fcpa_err$msg_binder(SQLERRM)) ;
		END ;
		COMMIT ;

		BEGIN
			FOR j IN 1..i LOOP DELETE FROM mgt_calc_log t WHERE t.calc_grp_cd = rec[j].calc_grp_cd AND t.calc_no = rec[j].calc_no ; END LOOP ;
		EXCEPTION
			WHEN others THEN call mgpa_del_calc$p_restore_arg(arg, fcpa_err$msg_binder(SQLERRM)) ;
		END ;
		COMMIT ;

		BEGIN
			FOR j IN 1..i LOOP DELETE FROM mgt_acc_top_tmp t WHERE t.calc_grp_cd = rec[j].calc_grp_cd AND t.calc_no = rec[j].calc_no ; END LOOP ;
		EXCEPTION
			WHEN others THEN call mgpa_del_calc$p_restore_arg(arg, fcpa_err$msg_binder(SQLERRM)) ;
		END ;
		COMMIT ;

		BEGIN
			FOR j IN 1..i LOOP DELETE FROM mgt_acc_sml_cost_tmp t WHERE t.calc_grp_cd = rec[j].calc_grp_cd AND t.calc_no = rec[j].calc_no ; END LOOP ;
		EXCEPTION
			WHEN others THEN call mgpa_del_calc$p_restore_arg(arg, fcpa_err$msg_binder(SQLERRM)) ;
		END ;
		COMMIT ;
	END ; -- <<PROC_END>>

	DELETE FROM	mgw_del_calc ;

	arg := '{}' ;
	rec := '{}' ;

	CALL fcpa_batch_log$p_proc_log('MGBXD0002', 'MGPA_DEL_CALC.P_MAIN') ;

END ;
$BODY$
LANGUAGE plpgsql
;

