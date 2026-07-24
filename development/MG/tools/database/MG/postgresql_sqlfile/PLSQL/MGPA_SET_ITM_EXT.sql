\encoding UTF-8

CREATE OR REPLACE PROCEDURE mgpa_set_itm_ext$p_set_itm_ext (
	IN i_arg mgt_arg
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	MGT_CALC_ITMに品目拡張ごとの情報を追加する
	ロットＮＯ、サブロットＮＯ、手配ＮＯ１ -> 手配ＮＯ４を
	品目拡張に設定する
<REMARKS>
<ARGUMENTS>
<IN>	i_arg
		対象となる原価計算設定情報のレコード
<HISTORY>
**************************************************************************/
DECLARE
	c_unit_calc CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_UNIT_CALC_TYP','CALC') ;
	c_null_val CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL') ;
	c_sa_pln CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_SA_TYP','PLN') ;
	c_calc_stk CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_COST_CALC_TYP','CALC_STK') ;
	c_itm_ext CONSTANT VARCHAR := 'ETC_ITM_EXT' ;

	l_ext_no INTEGER ;
	l_itm_ext mgt_calc_itm.itm_ext%TYPE ;
	l_stk_calc_grp_cd	mam_calc_grp.calc_grp_cd%TYPE ;
	l_wip_calc_grp_cd	mam_calc_grp.calc_grp_cd%TYPE ;
	l_cnt INTEGER ;

	i INTEGER ;
	j INTEGER ;

	x RECORD ;
	y0 RECORD ;
	z0 RECORD ;
	y RECORD ;
	z1 RECORD ;
	z2 RECORD ;
	z3 RECORD ;
	z4 RECORD ;
	z5 RECORD ;
	z6 RECORD ;
BEGIN
	CALL fcpa_postgres_util$type_is_table_row('mgpa_set_itm_ext$p_set_itm_ext$l_itm_list', 'mgt_calc_itm', 'INTEGER') ;
	CALL fcpa_postgres_util$type_is_table_col('mgpa_set_itm_ext$p_set_itm_ext$l_itm_ext_list', 'VARCHAR', 'INTEGER') ;

	IF i_arg.sa_typ = c_sa_pln
	OR i_arg.cost_calc_typ <> c_calc_stk THEN
		RETURN ;
	END IF ;

	SELECT
		MAX(
			CASE m.parm_val::NUMERIC
				WHEN 1 THEN 1
				WHEN 2 THEN 2
				WHEN 3 THEN 3
				WHEN 4 THEN 4
				WHEN 5 THEN 5
				WHEN 6 THEN 6
				ELSE NULL
			END
		)
	INTO	STRICT l_ext_no
	FROM	mgt_parm m
	WHERE	0=0
	AND	m.calc_grp_cd = i_arg.calc_grp_cd
	AND	m.parm_key = c_itm_ext
	AND	m.parm_val IS NOT NULL
	;

	IF l_ext_no IS NULL THEN
		RETURN ;
	END IF ;
	SELECT	COALESCE(MIN(m.parm_val), i_arg.calc_grp_cd)
	INTO STRICT	l_stk_calc_grp_cd
	FROM	mgt_parm m
	WHERE	0=0
	AND	m.calc_grp_cd = i_arg.calc_grp_cd
	AND	m.parm_key = 'ETC_STK_CALC_GRP'
	AND	m.parm_val IS NOT NULL
	;

	SELECT	COALESCE(MIN(m.parm_val), i_arg.calc_grp_cd)
	INTO STRICT	l_wip_calc_grp_cd
	FROM	mgt_parm m
	WHERE	0=0
	AND	m.calc_grp_cd = i_arg.calc_grp_cd
	AND	m.parm_key = 'ETC_WIP_CALC_GRP'
	AND	m.parm_val IS NOT NULL
	;

	CALL fcpa_batch_log$p_proc_log('MGBXD0001', 'MGPA_SET_ITM_EXT.P_SET_ITM_EXT') ;

	FOR x IN
		SELECT	t.*
		FROM	mgt_calc_itm t
		WHERE	0=0
		AND	t.calc_no = i_arg.calc_no
		AND	t.calc_grp_cd = i_arg.calc_grp_cd
		AND	t.itm_ext = c_null_val
		AND	EXISTS (
				SELECT	'X'
				FROM	mgt_calc_ptn m
				WHERE	0=0
				AND	m.calc_no = t.calc_no
				AND	m.calc_grp_cd = t.calc_grp_cd
				AND	m.calc_ptn_cd = t.calc_ptn_cd
				AND	(
					l_ext_no = 1 AND m.lot_typ = c_unit_calc
					OR
					l_ext_no = 2 AND m.sublot_typ = c_unit_calc
					OR
					l_ext_no = 3 AND m.sno1_typ = c_unit_calc
					OR
					l_ext_no = 4 AND m.sno2_typ = c_unit_calc
					OR
					l_ext_no = 5 AND m.sno3_typ = c_unit_calc
					OR
					l_ext_no = 6 AND m.sno4_typ = c_unit_calc
					)
			)
	LOOP
		TRUNCATE TABLE mgpa_set_itm_ext$p_set_itm_ext$l_itm_list ;
		TRUNCATE TABLE mgpa_set_itm_ext$p_set_itm_ext$l_itm_ext_list ;
		i := 0 ;
		j := 0 ;
		FOR y0 IN (
			SELECT
				t.*
			FROM	mgt_calc_itm_mfg_inst t
			WHERE	0=0
			AND	t.calc_no = x.calc_no
			AND	t.calc_grp_cd = x.calc_grp_cd
			AND	t.itm_cd = x.itm_cd
			AND	t.itm_sub1 = x.itm_sub1
			AND	t.itm_sub2 = x.itm_sub2
			AND	t.itm_sub3 = x.itm_sub3
			AND	t.itm_ext = x.itm_ext
			AND	t.wg_cd = x.wg_cd
			)
		LOOP
			SELECT	COUNT(*)
			INTO	l_cnt
			FROM	(
				SELECT	DISTINCT
					CASE l_ext_no
						WHEN 1 THEN t.lot_no
						WHEN 2 THEN t.sublot_no
						WHEN 3 THEN t.sno1
						WHEN 4 THEN t.sno2
						WHEN 5 THEN t.sno3
						WHEN 6 THEN t.sno4
						ELSE NULL
					END AS itm_ext
				FROM	mgt_calc_mfg t
				WHERE	0=0
				AND	t.calc_no = y0.calc_no
				AND	t.calc_grp_cd = y0.calc_grp_cd
				AND	t.itm_cd = y0.itm_cd
				AND	t.itm_sub1 = y0.itm_sub1
				AND	t.itm_sub2 = y0.itm_sub2
				AND	t.itm_sub3 = y0.itm_sub3
				AND	t.itm_ext = y0.itm_ext
				AND	t.itm_mfg_inst_no = y0.itm_mfg_inst_no
				AND	t.mfg_act_no = y0.mfg_act_no
				) m
			WHERE	0=0
			;

			IF l_cnt > 1 THEN
				FOR z0 IN (
					SELECT	DISTINCT
						CASE l_ext_no
							WHEN 1 THEN t.lot_no
							WHEN 2 THEN t.sublot_no
							WHEN 3 THEN t.sno1
							WHEN 4 THEN t.sno2
							WHEN 5 THEN t.sno3
							WHEN 6 THEN t.sno4
							ELSE NULL
						END AS itm_ext
					FROM	mgt_calc_mfg t
					WHERE	0=0
					AND	t.calc_no = y0.calc_no
					AND	t.calc_grp_cd = y0.calc_grp_cd
					AND	t.itm_cd = y0.itm_cd
					AND	t.itm_sub1 = y0.itm_sub1
					AND	t.itm_sub2 = y0.itm_sub2
					AND	t.itm_sub3 = y0.itm_sub3
					AND	t.itm_ext = y0.itm_ext
					AND	t.itm_mfg_inst_no = y0.itm_mfg_inst_no
					AND	t.mfg_act_no = y0.mfg_act_no
					)
				LOOP
					IF z0.itm_ext IS NOT NULL AND z0.itm_ext != c_null_val THEN
						j := j + 1 ;
						INSERT INTO mgpa_set_itm_ext$p_set_itm_ext$l_itm_ext_list (_elem_, _index_) VALUES (z0.itm_ext, j) ;
					END IF ;
				END LOOP ;
			END IF ;
		END LOOP ;

		FOR y IN (
			SELECT
				t.*,
				CASE l_ext_no
					WHEN 1 THEN t.lot_no
					WHEN 2 THEN t.sublot_no
					WHEN 3 THEN t.sno1
					WHEN 4 THEN t.sno2
					WHEN 5 THEN t.sno3
					WHEN 6 THEN t.sno4
					ELSE NULL
				END AS inst_itm_ext
			FROM	mgt_calc_itm_mfg_inst t
			WHERE	0=0
			AND	t.calc_no = x.calc_no
			AND	t.calc_grp_cd = x.calc_grp_cd
			AND	t.itm_cd = x.itm_cd
			AND	t.itm_sub1 = x.itm_sub1
			AND	t.itm_sub2 = x.itm_sub2
			AND	t.itm_sub3 = x.itm_sub3
			AND	t.itm_ext = x.itm_ext
			AND	t.wg_cd = x.wg_cd
			)
		LOOP
			<<NEXT_LOOP_Y>>
			BEGIN
				SELECT	MIN(CASE l_ext_no
								WHEN 1 THEN t.lot_no
								WHEN 2 THEN t.sublot_no
								WHEN 3 THEN t.sno1
								WHEN 4 THEN t.sno2
								WHEN 5 THEN t.sno3
								WHEN 6 THEN t.sno4
								ELSE NULL
							END
						)
				INTO	l_itm_ext
				FROM	mgt_calc_mfg t
				WHERE	0=0
				AND	t.calc_no = y.calc_no
				AND	t.calc_grp_cd = y.calc_grp_cd
				AND	t.itm_cd = y.itm_cd
				AND	t.itm_sub1 = y.itm_sub1
				AND	t.itm_sub2 = y.itm_sub2
				AND	t.itm_sub3 = y.itm_sub3
				AND	t.itm_ext = y.itm_ext
				AND	t.itm_mfg_inst_no = y.itm_mfg_inst_no
				AND	t.mfg_act_no = y.mfg_act_no
				;

				IF l_itm_ext IS NULL OR l_itm_ext = c_null_val THEN
					l_itm_ext := y.inst_itm_ext ;
					IF l_itm_ext IS NULL OR l_itm_ext = c_null_val THEN
						EXIT NEXT_LOOP_Y ;
					END IF ;
				END IF ;

				IF j > 0 THEN
					IF (SELECT COUNT(*) FROM mgpa_set_itm_ext$p_set_itm_ext$l_itm_ext_list WHERE _elem_ = l_itm_ext) > 0  THEN
						EXIT NEXT_LOOP_Y ;
					END IF ;
				END IF ;

				UPDATE	mgt_calc_inst_wip t
				SET	itm_ext = l_itm_ext
				WHERE	0=0
				AND	t.calc_no = y.calc_no
				AND	t.calc_grp_cd = y.calc_grp_cd
				AND	t.itm_cd = y.itm_cd
				AND	t.itm_sub1 = y.itm_sub1
				AND	t.itm_sub2 = y.itm_sub2
				AND	t.itm_sub3 = y.itm_sub3
				AND	t.itm_ext = y.itm_ext
				AND	t.itm_mfg_inst_no = y.itm_mfg_inst_no
				AND	t.mfg_act_no = y.mfg_act_no
				;

				UPDATE	mgt_calc_mfg t
				SET	itm_ext = l_itm_ext
				WHERE	0=0
				AND	t.calc_no = y.calc_no
				AND	t.calc_grp_cd = y.calc_grp_cd
				AND	t.itm_cd = y.itm_cd
				AND	t.itm_sub1 = y.itm_sub1
				AND	t.itm_sub2 = y.itm_sub2
				AND	t.itm_sub3 = y.itm_sub3
				AND	t.itm_ext = y.itm_ext
				AND	t.itm_mfg_inst_no = y.itm_mfg_inst_no
				AND	t.mfg_act_no = y.mfg_act_no
				;

				UPDATE	mgt_calc_wk t
				SET	itm_ext = l_itm_ext
				WHERE	0=0
				AND	t.calc_no = y.calc_no
				AND	t.calc_grp_cd = y.calc_grp_cd
				AND	t.itm_cd = y.itm_cd
				AND	t.itm_sub1 = y.itm_sub1
				AND	t.itm_sub2 = y.itm_sub2
				AND	t.itm_sub3 = y.itm_sub3
				AND	t.itm_ext = y.itm_ext
				AND	t.itm_mfg_inst_no = y.itm_mfg_inst_no
				AND	t.mfg_act_no = y.mfg_act_no
				;

				UPDATE	mgt_calc_inpt t
				SET	par_itm_ext = l_itm_ext
				WHERE	0=0
				AND	t.calc_no = y.calc_no
				AND	t.calc_grp_cd = y.calc_grp_cd
				AND	t.par_itm_cd = y.itm_cd
				AND	t.par_itm_sub1 = y.itm_sub1
				AND	t.par_itm_sub2 = y.itm_sub2
				AND	t.par_itm_sub3 = y.itm_sub3
				AND	t.par_itm_ext = y.itm_ext
				AND	t.itm_mfg_inst_no = y.itm_mfg_inst_no
				AND	t.mfg_act_no = y.mfg_act_no
				;

				UPDATE	mgt_st_wip t
				SET	itm_ext = l_itm_ext
				WHERE	0=0
				AND	t.calc_grp_cd = l_wip_calc_grp_cd
				AND	t.ym = i_arg.st_ym
				AND	t.itm_cd = y.itm_cd
				AND	t.itm_sub1 = y.itm_sub1
				AND	t.itm_sub2 = y.itm_sub2
				AND	t.itm_sub3 = y.itm_sub3
				AND	t.itm_ext = y.itm_ext
				AND	t.itm_mfg_inst_no = y.itm_mfg_inst_no
				AND	t.mfg_act_no = y.mfg_act_no
				;

				UPDATE	mgt_calc_itm_mfg_inst t
				SET	itm_ext = l_itm_ext
				WHERE	0=0
				AND	t.calc_no = y.calc_no
				AND	t.calc_grp_cd = y.calc_grp_cd
				AND	t.itm_cd = y.itm_cd
				AND	t.itm_sub1 = y.itm_sub1
				AND	t.itm_sub2 = y.itm_sub2
				AND	t.itm_sub3 = y.itm_sub3
				AND	t.itm_ext = y.itm_ext
				AND	t.itm_mfg_inst_no = y.itm_mfg_inst_no
				AND	t.mfg_act_no = y.mfg_act_no
				;

				IF i > 0 THEN
					IF (SELECT COUNT(*) FROM mgpa_set_itm_ext$p_set_itm_ext$l_itm_list WHERE itm_ext = l_itm_ext) > 0  THEN
						EXIT NEXT_LOOP_Y ;
					END IF ;
				END IF ;

				i := i + 1 ;
				INSERT INTO mgpa_set_itm_ext$p_set_itm_ext$l_itm_list (
					calc_no,
					calc_grp_cd,
					itm_cd,
					itm_sub1,
					itm_sub2,
					itm_sub3,
					itm_ext,
					wg_cd,
					calc_ptn_cd,
					std_qty,
					calc_ctg_cd,
					rmrks,
					sub_char1,
					sub_char2,
					sub_char3,
					_index_
					)
				VALUES (
					x.calc_no,
					x.calc_grp_cd,
					x.itm_cd,
					x.itm_sub1,
					x.itm_sub2,
					x.itm_sub3,
					l_itm_ext,
					x.wg_cd,
					x.calc_ptn_cd,
					x.std_qty,
					x.calc_ctg_cd,
					x.rmrks,
					x.sub_char1,
					x.sub_char2,
					x.sub_char3,
					i
				)
				;

			END ;
		END LOOP ;

		FOR z1 IN (
			SELECT	t.ctid AS row_id,
				CASE l_ext_no
					WHEN 1 THEN t.lot_no
					WHEN 2 THEN t.sublot_no
					WHEN 3 THEN t.sno1
					WHEN 4 THEN t.sno2
					WHEN 5 THEN t.sno3
					WHEN 6 THEN t.sno4
					ELSE t.itm_ext
				END AS itm_ext
			FROM	mgt_calc_purc_all t
			WHERE	0=0
			AND	t.calc_no = x.calc_no
			AND	t.calc_grp_cd = x.calc_grp_cd
			AND	t.itm_cd = x.itm_cd
			AND	t.itm_sub1 = x.itm_sub1
			AND	t.itm_sub2 = x.itm_sub2
			AND	t.itm_sub3 = x.itm_sub3
			AND	t.itm_ext = x.itm_ext
			AND	t.wg_cd = x.wg_cd
			AND	t.co_cd = fcpa_context$f_get_co_cd()
			)
		LOOP
			<<NEXT_LOOP_Z1>>
			BEGIN
				IF z1.itm_ext = c_null_val THEN
					EXIT NEXT_LOOP_Z1 ;
				END IF ;

				IF j > 0 THEN
					IF (SELECT COUNT(*) FROM mgpa_set_itm_ext$p_set_itm_ext$l_itm_ext_list WHERE _elem_ = z1.itm_ext) > 0 THEN
						EXIT NEXT_LOOP_Z1 ;
					END IF ;
				END IF ;

				UPDATE	mgt_calc_purc_all t
				SET	itm_ext = z1.itm_ext
				WHERE	0=0
				AND	t.ctid = z1.row_id
				;

				IF i > 0 THEN
					IF (SELECT COUNT(*) FROM mgpa_set_itm_ext$p_set_itm_ext$l_itm_list WHERE itm_ext = z1.itm_ext) > 0 THEN
						EXIT NEXT_LOOP_Z1 ;
					END IF ;
				END IF ;

				i := i + 1 ;
				INSERT INTO mgpa_set_itm_ext$p_set_itm_ext$l_itm_list (
					calc_no,
					calc_grp_cd,
					itm_cd,
					itm_sub1,
					itm_sub2,
					itm_sub3,
					itm_ext,
					wg_cd,
					calc_ptn_cd,
					std_qty,
					calc_ctg_cd,
					rmrks,
					sub_char1,
					sub_char2,
					sub_char3,
					_index_
					)
				VALUES (
					x.calc_no,
					x.calc_grp_cd,
					x.itm_cd,
					x.itm_sub1,
					x.itm_sub2,
					x.itm_sub3,
					z1.itm_ext,
					x.wg_cd,
					x.calc_ptn_cd,
					x.std_qty,
					x.calc_ctg_cd,
					x.rmrks,
					x.sub_char1,
					x.sub_char2,
					x.sub_char3,
					i
				)
				;

			END ;

		END LOOP ;

		FOR z2 IN (
			SELECT	t.*,
				CASE l_ext_no
					WHEN 1 THEN t.lot_no
					WHEN 2 THEN t.sublot_no
					WHEN 3 THEN t.sno1
					WHEN 4 THEN t.sno2
					WHEN 5 THEN t.sno3
					WHEN 6 THEN t.sno4
					ELSE t.itm_ext
				END AS inpt_itm_ext
			FROM	mgt_calc_inpt t
			WHERE	0=0
			AND	t.calc_no = x.calc_no
			AND	t.calc_grp_cd = x.calc_grp_cd
			AND	t.itm_cd = x.itm_cd
			AND	t.itm_sub1 = x.itm_sub1
			AND	t.itm_sub2 = x.itm_sub2
			AND	t.itm_sub3 = x.itm_sub3
			AND	t.itm_ext = x.itm_ext
			AND	t.wg_cd = x.wg_cd
			)
		LOOP
			<<NEXT_LOOP_Z2>>
			BEGIN
				IF z2.inpt_itm_ext = c_null_val THEN
					EXIT NEXT_LOOP_Z2 ;
				END IF ;

				IF j > 0 THEN
					IF (SELECT COUNT(*) FROM mgpa_set_itm_ext$p_set_itm_ext$l_itm_ext_list WHERE _elem_ = z2.inpt_itm_ext) > 0 THEN
						EXIT NEXT_LOOP_Z2 ;
					END IF ;
				END IF ;

				UPDATE	mgt_calc_inpt t
				SET	itm_ext = z2.inpt_itm_ext
				WHERE	0=0
				AND	t.calc_no = z2.calc_no
				AND	t.calc_grp_cd = z2.calc_grp_cd
				AND	t.act_inpt_id = z2.act_inpt_id
				AND	t.act_inpt_id_sub = z2.act_inpt_id_sub
				;

				IF i > 0 THEN
					IF (SELECT COUNT(*) FROM mgpa_set_itm_ext$p_set_itm_ext$l_itm_list WHERE itm_ext = z2.inpt_itm_ext) > 0 THEN
						EXIT NEXT_LOOP_Z2 ;
					END IF ;
				END IF ;

				i := i + 1 ;
				INSERT INTO mgpa_set_itm_ext$p_set_itm_ext$l_itm_list (
					calc_no,
					calc_grp_cd,
					itm_cd,
					itm_sub1,
					itm_sub2,
					itm_sub3,
					itm_ext,
					wg_cd,
					calc_ptn_cd,
					std_qty,
					calc_ctg_cd,
					rmrks,
					sub_char1,
					sub_char2,
					sub_char3,
					_index_
					)
				VALUES (
					x.calc_no,
					x.calc_grp_cd,
					x.itm_cd,
					x.itm_sub1,
					x.itm_sub2,
					x.itm_sub3,
					z2.inpt_itm_ext,
					x.wg_cd,
					x.calc_ptn_cd,
					x.std_qty,
					x.calc_ctg_cd,
					x.rmrks,
					x.sub_char1,
					x.sub_char2,
					x.sub_char3,
					i
				)
				;

			END ;

		END LOOP ;

		FOR z3 IN (
			SELECT	t.*,
				CASE l_ext_no
					WHEN 1 THEN t.lot_no
					WHEN 2 THEN t.sublot_no
					WHEN 3 THEN t.sno1
					WHEN 4 THEN t.sno2
					WHEN 5 THEN t.sno3
					WHEN 6 THEN t.sno4
					ELSE t.itm_ext
				END AS io_itm_ext
			FROM	mgt_calc_io t
			WHERE	0=0
			AND	t.calc_no = x.calc_no
			AND	t.calc_grp_cd = x.calc_grp_cd
			AND	t.itm_cd = x.itm_cd
			AND	t.itm_sub1 = x.itm_sub1
			AND	t.itm_sub2 = x.itm_sub2
			AND	t.itm_sub3 = x.itm_sub3
			AND	t.itm_ext = x.itm_ext
			AND	t.wg_cd = x.wg_cd
			)
		LOOP
			<<NEXT_LOOP_Z3>>
			BEGIN
				IF z3.io_itm_ext = c_null_val THEN
					EXIT NEXT_LOOP_Z3 ;
				END IF ;

				IF j > 0 THEN
					IF (SELECT COUNT(*) FROM mgpa_set_itm_ext$p_set_itm_ext$l_itm_ext_list WHERE _elem_ = z3.io_itm_ext) > 0 THEN
						EXIT NEXT_LOOP_Z3 ;
					END IF ;
				END IF ;

				UPDATE	mgt_calc_io t
				SET	itm_ext = z3.io_itm_ext
				WHERE	0=0
				AND	t.calc_no = z3.calc_no
				AND	t.calc_grp_cd = z3.calc_grp_cd
				AND	t.act_io_id = z3.act_io_id
				AND	t.act_io_id_sub = z3.act_io_id_sub
				;

				IF i > 0 THEN
					IF (SELECT COUNT(*) FROM mgpa_set_itm_ext$p_set_itm_ext$l_itm_list WHERE itm_ext = z3.io_itm_ext) > 0 THEN
						EXIT NEXT_LOOP_Z3 ;
					END IF ;
				END IF ;

				i := i + 1 ;
				INSERT INTO mgpa_set_itm_ext$p_set_itm_ext$l_itm_list (
					calc_no,
					calc_grp_cd,
					itm_cd,
					itm_sub1,
					itm_sub2,
					itm_sub3,
					itm_ext,
					wg_cd,
					calc_ptn_cd,
					std_qty,
					calc_ctg_cd,
					rmrks,
					sub_char1,
					sub_char2,
					sub_char3,
					_index_
					)
				VALUES (
					x.calc_no,
					x.calc_grp_cd,
					x.itm_cd,
					x.itm_sub1,
					x.itm_sub2,
					x.itm_sub3,
					z3.io_itm_ext,
					x.wg_cd,
					x.calc_ptn_cd,
					x.std_qty,
					x.calc_ctg_cd,
					x.rmrks,
					x.sub_char1,
					x.sub_char2,
					x.sub_char3,
					i
				)
				;

			END ;

		END LOOP ;

		FOR z4 IN (
			SELECT	t.*,
				CASE l_ext_no
					WHEN 1 THEN t.lot_no
					WHEN 2 THEN t.sublot_no
					WHEN 3 THEN t.sno1
					WHEN 4 THEN t.sno2
					WHEN 5 THEN t.sno3
					WHEN 6 THEN t.sno4
					ELSE t.itm_ext
				END AS sls_itm_ext
			FROM	mgt_calc_sls t
			WHERE	0=0
			AND	t.calc_no = x.calc_no
			AND	t.calc_grp_cd = x.calc_grp_cd
			AND	t.itm_cd = x.itm_cd
			AND	t.itm_sub1 = x.itm_sub1
			AND	t.itm_sub2 = x.itm_sub2
			AND	t.itm_sub3 = x.itm_sub3
			AND	t.itm_ext = x.itm_ext
			AND	t.wg_cd = x.wg_cd
			)
		LOOP
			<<NEXT_LOOP_Z4>>
			BEGIN
				IF z4.sls_itm_ext = c_null_val THEN
					EXIT NEXT_LOOP_Z4 ;
				END IF ;

				IF j > 0 THEN
					IF (SELECT COUNT(*) FROM mgpa_set_itm_ext$p_set_itm_ext$l_itm_ext_list WHERE _elem_ = z4.sls_itm_ext) > 0 THEN
						EXIT NEXT_LOOP_Z4 ;
					END IF ;
				END IF ;

				UPDATE	mgt_calc_sls t
				SET	itm_ext = z4.sls_itm_ext
				WHERE	0=0
				AND	t.calc_no = z4.calc_no
				AND	t.calc_grp_cd = z4.calc_grp_cd
				AND	t.act_sls_id = z4.act_sls_id
				AND	t.act_sls_id_sub = z4.act_sls_id_sub
				;

				IF i > 0 THEN
					IF (SELECT COUNT(*) FROM mgpa_set_itm_ext$p_set_itm_ext$l_itm_list WHERE itm_ext = z4.sls_itm_ext) > 0 THEN
						EXIT NEXT_LOOP_Z4 ;
					END IF ;
				END IF ;

				i := i + 1 ;
				INSERT INTO mgpa_set_itm_ext$p_set_itm_ext$l_itm_list (
					calc_no,
					calc_grp_cd,
					itm_cd,
					itm_sub1,
					itm_sub2,
					itm_sub3,
					itm_ext,
					wg_cd,
					calc_ptn_cd,
					std_qty,
					calc_ctg_cd,
					rmrks,
					sub_char1,
					sub_char2,
					sub_char3,
					_index_
					)
				VALUES (
					x.calc_no,
					x.calc_grp_cd,
					x.itm_cd,
					x.itm_sub1,
					x.itm_sub2,
					x.itm_sub3,
					z4.sls_itm_ext,
					x.wg_cd,
					x.calc_ptn_cd,
					x.std_qty,
					x.calc_ctg_cd,
					x.rmrks,
					x.sub_char1,
					x.sub_char2,
					x.sub_char3,
					i
				)
				;

			END ;

		END LOOP ;

		FOR z5 IN (
			SELECT	t.*,
				CASE l_ext_no
					WHEN 1 THEN t.lot_no
					WHEN 2 THEN t.sublot_no
					WHEN 3 THEN t.sno1
					WHEN 4 THEN t.sno2
					WHEN 5 THEN t.sno3
					WHEN 6 THEN t.sno4
					ELSE t.itm_ext
				END AS stk_itm_ext
			FROM	mgt_st_stk t
			WHERE	0=0
			AND	t.ym = i_arg.st_ym
			AND	t.calc_grp_cd = l_stk_calc_grp_cd
			AND	t.itm_cd = x.itm_cd
			AND	t.itm_sub1 = x.itm_sub1
			AND	t.itm_sub2 = x.itm_sub2
			AND	t.itm_sub3 = x.itm_sub3
			AND	t.itm_ext = x.itm_ext
			AND	(
				i_arg.runtime_wg_cd IS NULL AND t.wg_cd = x.wg_cd
				OR
				i_arg.runtime_wg_cd IS NOT NULL AND (
					t.wg_cd = x.wg_cd
					OR
					EXISTS (
						SELECT 'X' FROM mam_grp_wg w
						WHERE w.calc_grp_cd = i_arg.calc_grp_cd
						AND w.wg_cd = t.wg_cd
						)
					)
				)
			)
		LOOP
			<<NEXT_LOOP_Z5>>
			BEGIN
				IF z5.stk_itm_ext = c_null_val THEN
					EXIT NEXT_LOOP_Z5 ;
				END IF ;

				IF j > 0 THEN
					IF (SELECT COUNT(*) FROM mgpa_set_itm_ext$p_set_itm_ext$l_itm_ext_list WHERE _elem_ = z5.stk_itm_ext) > 0 THEN
						EXIT NEXT_LOOP_Z5 ;
					END IF ;
				END IF ;

				UPDATE	mgt_st_stk t
				SET	itm_ext = z5.stk_itm_ext
				WHERE	0=0
				AND	t.st_stk_key = z5.st_stk_key
				;

				IF i > 0 THEN
					IF (SELECT COUNT(*) FROM mgpa_set_itm_ext$p_set_itm_ext$l_itm_list WHERE itm_ext = z5.stk_itm_ext) > 0 THEN
						EXIT NEXT_LOOP_Z5 ;
					END IF ;
				END IF ;

				i := i + 1 ;
				INSERT INTO mgpa_set_itm_ext$p_set_itm_ext$l_itm_list (
					calc_no,
					calc_grp_cd,
					itm_cd,
					itm_sub1,
					itm_sub2,
					itm_sub3,
					itm_ext,
					wg_cd,
					calc_ptn_cd,
					std_qty,
					calc_ctg_cd,
					rmrks,
					sub_char1,
					sub_char2,
					sub_char3,
					_index_
					)
				VALUES (
					x.calc_no,
					x.calc_grp_cd,
					x.itm_cd,
					x.itm_sub1,
					x.itm_sub2,
					x.itm_sub3,
					z5.stk_itm_ext,
					x.wg_cd,
					x.calc_ptn_cd,
					x.std_qty,
					x.calc_ctg_cd,
					x.rmrks,
					x.sub_char1,
					x.sub_char2,
					x.sub_char3,
					i
				)
				;

			END ;

		END LOOP ;

		FOR z6 IN (
			SELECT	t.ctid AS row_id,
				CASE l_ext_no
					WHEN 1 THEN t.lot_no
					WHEN 2 THEN t.sublot_no
					WHEN 3 THEN t.sno1
					WHEN 4 THEN t.sno2
					WHEN 5 THEN t.sno3
					WHEN 6 THEN t.sno4
					ELSE t.itm_ext
				END AS itm_ext
			FROM	mgt_calc_gp_alc_all t
			WHERE	0=0
			AND	t.calc_no = x.calc_no
			AND	t.calc_grp_cd = x.calc_grp_cd
			AND	t.itm_cd = x.itm_cd
			AND	t.itm_sub1 = x.itm_sub1
			AND	t.itm_sub2 = x.itm_sub2
			AND	t.itm_sub3 = x.itm_sub3
			AND	t.itm_ext = x.itm_ext
			AND	t.wg_cd = x.wg_cd
			AND	t.co_cd = fcpa_context$f_get_co_cd()
			)
		LOOP
			<<NEXT_LOOP_Z6>>
			BEGIN
				IF z6.itm_ext = c_null_val THEN
					EXIT NEXT_LOOP_Z6 ;
				END IF ;

				IF j > 0 THEN
					IF (SELECT COUNT(*) FROM mgpa_set_itm_ext$p_set_itm_ext$l_itm_ext_list WHERE _elem_ =  z6.itm_ext) > 0 THEN
						EXIT NEXT_LOOP_Z6 ;
					END IF ;
				END IF ;

				UPDATE	mgt_calc_gp_alc_all t
				SET	itm_ext = z6.itm_ext
				WHERE	0=0
				AND	t.ctid = z6.row_id
				;

				IF i > 0 THEN
					IF (SELECT COUNT(*) FROM mgpa_set_itm_ext$p_set_itm_ext$l_itm_list WHERE itm_ext = z6.itm_ext) > 0 THEN
						EXIT NEXT_LOOP_Z6 ;
					END IF ;
				END IF ;

				i := i + 1 ;
				INSERT INTO mgpa_set_itm_ext$p_set_itm_ext$l_itm_list (
					calc_no,
					calc_grp_cd,
					itm_cd,
					itm_sub1,
					itm_sub2,
					itm_sub3,
					itm_ext,
					wg_cd,
					calc_ptn_cd,
					std_qty,
					calc_ctg_cd,
					rmrks,
					sub_char1,
					sub_char2,
					sub_char3,
					_index_
					)
				VALUES (
					x.calc_no,
					x.calc_grp_cd,
					x.itm_cd,
					x.itm_sub1,
					x.itm_sub2,
					x.itm_sub3,
					z6.itm_ext,
					x.wg_cd,
					x.calc_ptn_cd,
					x.std_qty,
					x.calc_ctg_cd,
					x.rmrks,
					x.sub_char1,
					x.sub_char2,
					x.sub_char3,
					i
				)
				;

			END ;

		END LOOP ;

		IF i > 0 THEN
			INSERT INTO mgt_calc_itm
			(
				calc_no,
				calc_grp_cd,
				itm_cd,
				itm_sub1,
				itm_sub2,
				itm_sub3,
				itm_ext,
				wg_cd,
				calc_ptn_cd,
				std_qty,
				calc_ctg_cd,
				rmrks,
				sub_char1,
				sub_char2,
				sub_char3
			)
			SELECT
				calc_no,
				calc_grp_cd,
				itm_cd,
				itm_sub1,
				itm_sub2,
				itm_sub3,
				itm_ext,
				wg_cd,
				calc_ptn_cd,
				std_qty,
				calc_ctg_cd,
				rmrks,
				sub_char1,
				sub_char2,
				sub_char3
			FROM mgpa_set_itm_ext$p_set_itm_ext$l_itm_list ;
		END IF ;
	END LOOP ;

	TRUNCATE TABLE mgpa_set_itm_ext$p_set_itm_ext$l_itm_list ;
	TRUNCATE TABLE mgpa_set_itm_ext$p_set_itm_ext$l_itm_ext_list ;
	i := 0 ;
	j := 0 ;

	CALL fcpa_batch_log$p_proc_log('MGBXD0002', 'MGPA_SET_ITM_EXT.P_SET_ITM_EXT') ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_set_itm_ext$p_itm_ext_null (
	IN i_arg mgt_arg,
	IN i_sql_no NUMERIC DEFAULT NULL
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	MGT_CALC_ITMに追加したレコードを削除する
	品目拡張にロットＮＯ、サブロットＮＯ、手配ＮＯ１ -> 手配ＮＯ４を
	設定した箇所をNULL文字に変換する
<REMARKS>
<ARGUMENTS>
<IN>	i_arg
		対象となる原価計算設定情報のレコード
<IN>	i_sql_no
<HISTORY>
**************************************************************************/
DECLARE
	c_null_val CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL') ;
	c_itm_ext CONSTANT VARCHAR := 'ETC_ITM_EXT' ;
	l_ext_no INTEGER ;
	l_stk_calc_grp_cd	mam_calc_grp.calc_grp_cd%TYPE ;
	l_wip_calc_grp_cd	mam_calc_grp.calc_grp_cd%TYPE ;
BEGIN
	SELECT
		MAX(
			CASE m.parm_val::NUMERIC
				WHEN 1 THEN 1
				WHEN 2 THEN 2
				WHEN 3 THEN 3
				WHEN 4 THEN 4
				WHEN 5 THEN 5
				WHEN 6 THEN 6
				ELSE NULL
			END
		)
	INTO	STRICT l_ext_no
	FROM	mgt_parm m
	WHERE	0=0
	AND	m.calc_grp_cd = i_arg.calc_grp_cd
	AND	m.parm_key = c_itm_ext
	AND	m.parm_val IS NOT NULL
	;

	IF l_ext_no IS NULL THEN
		RETURN ;
	END IF ;
	SELECT	COALESCE(MIN(m.parm_val), i_arg.calc_grp_cd)
	INTO STRICT	l_stk_calc_grp_cd
	FROM	mgt_parm m
	WHERE	0=0
	AND	m.calc_grp_cd = i_arg.calc_grp_cd
	AND	m.parm_key = 'ETC_STK_CALC_GRP'
	AND	m.parm_val IS NOT NULL
	;

	SELECT	COALESCE(MIN(m.parm_val), i_arg.calc_grp_cd)
	INTO STRICT	l_wip_calc_grp_cd
	FROM	mgt_parm m
	WHERE	0=0
	AND	m.calc_grp_cd = i_arg.calc_grp_cd
	AND	m.parm_key = 'ETC_WIP_CALC_GRP'
	AND	m.parm_val IS NOT NULL
	;

	IF i_sql_no IS NULL THEN
		CALL fcpa_batch_log$p_proc_log('MGBXD0001', 'MGPA_SET_ITM_EXT.P_ITM_EXT_NULL') ;
	ELSE
		CALL fcpa_batch_log$p_proc_log('MGBXD0001', 'MGPA_SET_ITM_EXT.P_ITM_EXT_NULL - ' || i_sql_no) ;
	END IF ;

	IF i_sql_no IS NULL OR i_sql_no = 3 THEN

		DELETE FROM	mgt_calc_itm t
		WHERE	0=0
		AND	t.calc_no = i_arg.calc_no
		AND	t.calc_grp_cd = i_arg.calc_grp_cd
		AND	t.itm_ext != c_null_val
		;

	END IF ;
	IF i_sql_no IS NULL OR i_sql_no = 4 THEN
		UPDATE	mgt_st_stk t
		SET	itm_ext = c_null_val
		WHERE	0=0
		AND	t.ym = i_arg.st_ym
		AND	t.calc_grp_cd = l_stk_calc_grp_cd
		AND	t.itm_ext != c_null_val
		;

	END IF ;
	IF i_sql_no IS NULL OR i_sql_no = 5 THEN
		UPDATE	mgt_st_wip t
		SET	itm_ext = c_null_val
		WHERE	0=0
		AND	t.ym = i_arg.st_ym
		AND	t.calc_grp_cd = l_wip_calc_grp_cd
		AND	t.itm_ext != c_null_val
		;

	END IF ;
	IF i_sql_no IS NULL OR i_sql_no = 6 THEN
		UPDATE	mgt_calc_inst_wip t
		SET	itm_ext = c_null_val
		WHERE	0=0
		AND	t.calc_no = i_arg.calc_no
		AND	t.calc_grp_cd = i_arg.calc_grp_cd
		AND	t.itm_ext != c_null_val
		;

	END IF ;
	IF i_sql_no IS NULL OR i_sql_no = 7 THEN
		UPDATE	mgt_calc_mfg t
		SET	itm_ext = c_null_val
		WHERE	0=0
		AND	t.calc_no = i_arg.calc_no
		AND	t.calc_grp_cd = i_arg.calc_grp_cd
		AND	t.itm_ext != c_null_val
		;

	END IF ;
	IF i_sql_no IS NULL OR i_sql_no = 8 THEN
		UPDATE	mgt_calc_wk t
		SET	itm_ext = c_null_val
		WHERE	0=0
		AND	t.calc_no = i_arg.calc_no
		AND	t.calc_grp_cd = i_arg.calc_grp_cd
		AND	t.itm_ext != c_null_val
		;

	END IF ;
	IF i_sql_no IS NULL OR i_sql_no = 1 THEN
		UPDATE	mgt_calc_inpt t
		SET	par_itm_ext = c_null_val
		WHERE	0=0
		AND	t.calc_no = i_arg.calc_no
		AND	t.calc_grp_cd = i_arg.calc_grp_cd
		AND	t.par_itm_ext != c_null_val
		;

	END IF ;
	IF i_sql_no IS NULL OR i_sql_no = 9 THEN
		UPDATE	mgt_calc_itm_mfg_inst t
		SET	itm_ext = c_null_val
		WHERE	0=0
		AND	t.calc_no = i_arg.calc_no
		AND	t.calc_grp_cd = i_arg.calc_grp_cd
		AND	t.itm_ext != c_null_val
		;

	END IF ;
	IF i_sql_no IS NULL OR i_sql_no = 10 THEN
		UPDATE	mgt_calc_purc t
		SET	itm_ext = c_null_val
		WHERE	0=0
		AND	t.calc_no = i_arg.calc_no
		AND	t.calc_grp_cd = i_arg.calc_grp_cd
		AND	t.itm_ext != c_null_val
		;

	END IF ;
	IF i_sql_no IS NULL OR i_sql_no = 1 THEN
		UPDATE	mgt_calc_inpt t
		SET	itm_ext = c_null_val
		WHERE	0=0
		AND	t.calc_no = i_arg.calc_no
		AND	t.calc_grp_cd = i_arg.calc_grp_cd
		AND	t.itm_ext != c_null_val
		;

	END IF ;
	IF i_sql_no IS NULL OR i_sql_no = 11 THEN
		UPDATE	mgt_calc_io t
		SET	itm_ext = c_null_val
		WHERE	0=0
		AND	t.calc_no = i_arg.calc_no
		AND	t.calc_grp_cd = i_arg.calc_grp_cd
		AND	t.itm_ext != c_null_val
		;

	END IF ;
	IF i_sql_no IS NULL OR i_sql_no = 12 THEN
		UPDATE	mgt_calc_sls t
		SET	itm_ext = c_null_val
		WHERE	0=0
		AND	t.calc_no = i_arg.calc_no
		AND	t.calc_grp_cd = i_arg.calc_grp_cd
		AND	t.itm_ext != c_null_val
		;

	END IF ;
	IF i_sql_no IS NULL OR i_sql_no = 13 THEN
		UPDATE	mgt_calc_gp_alc t
		SET	itm_ext = c_null_val
		WHERE	0=0
		AND	t.calc_no = i_arg.calc_no
		AND	t.calc_grp_cd = i_arg.calc_grp_cd
		AND	t.itm_ext != c_null_val
		;

	END IF ;
	IF i_sql_no IS NULL THEN
		CALL fcpa_batch_log$p_proc_log('MGBXD0002', 'MGPA_SET_ITM_EXT.P_ITM_EXT_NULL') ;
	ELSE
		CALL fcpa_batch_log$p_proc_log('MGBXD0002', 'MGPA_SET_ITM_EXT.P_ITM_EXT_NULL - ' || i_sql_no) ;
	END IF ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_set_itm_ext$p_itm_ext_null (
	IN i_calc_grp_cd VARCHAR,
	IN i_calc_no VARCHAR,
	IN i_st_ym TIMESTAMP WITHOUT TIME ZONE,
	IN i_sql_no NUMERIC
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	MGT_CALC_ITMに追加したレコードを削除する
	品目拡張にロットＮＯ、サブロットＮＯ、手配ＮＯ１ -> 手配ＮＯ４を
	設定した箇所をNULL文字に変換する
<REMARKS>
<ARGUMENTS>
<IN>	i_calc_grp_cd
		対象となる計算グループＣＤ
<IN>	i_calc_no
		対象となる原価計算ＮＯ
<IN>	i_st_ym
		対象となる対象期間先頭年月
<IN>	i_sql_no
<HISTORY>
**************************************************************************/
DECLARE

	l_arg mgt_arg%ROWTYPE ;

BEGIN

	l_arg.calc_grp_cd := i_calc_grp_cd ;
	l_arg.calc_no := i_calc_no ;
	l_arg.st_ym := i_st_ym ;

	CALL mgpa_set_itm_ext$p_itm_ext_null(l_arg, i_sql_no) ;

END ;
$BODY$
LANGUAGE plpgsql
;

