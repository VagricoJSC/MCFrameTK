CREATE OR REPLACE PROCEDURE mapa_sls_upri$p_calc_sls_upri(
	IN i_itm_cd VARCHAR,
	IN i_itm_sub1 VARCHAR,
	IN i_itm_sub2 VARCHAR,
	IN i_itm_sub3 VARCHAR,
	IN i_unit_cd VARCHAR,
	IN i_cur_cd VARCHAR,
	IN i_wg_cd VARCHAR,
	IN i_dt TIMESTAMP WITHOUT TIME ZONE,
	IN i_qty NUMERIC,
	IN i_upri_rate NUMERIC,
	IN i_dec_place NUMERIC,
	IN i_rnd_typ VARCHAR,
	IN i_peg_no NUMERIC,
	IN i_not_err_flg CHARACTER,
	INOUT cnf_cnt INTEGER,
	INOUT o_sls_upri NUMERIC
)
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	掛率から販売単価を計算する
<REMARKS>
	標準販売単価マスタが存在しない場合、
	i_not_err_flg：0　エラーを返す
	i_not_err_flg：1　NULLを返す
<ARGUMENTS>
<IN>	i_itm_cd
		品目ＣＤ
<IN>	i_itm_sub1
		枝番１
<IN>	i_itm_sub2
		枝番２
<IN>	i_itm_sub3
		枝番３
<IN>	i_unit_cd
		単位ＣＤ
<IN>	i_cur_cd
		通貨ＣＤ
<IN>	i_wg_cd
		ワーキンググループＣＤ
<IN>	i_dt
		基準日
<IN>	i_qty
		数量
<IN>	i_upri_rate
		掛率
<IN>	i_dec_place
		単価小数部有効桁
<IN>	i_rnd_typ
		端数処理区分
<IN>	i_peg_no
		紐付きＮＯ
<IN>	i_not_err_flg
		エラーなしＦＬＧ
<INOUT>
	cnf_cnt
		インデックス値
<INOUT>
	o_sls_upri
		掛率と標準販売単価マスタから計算される販売単価
<HISTORY>
**********************************************************/
DECLARE
	l_bind VARCHAR[] ;
	l_parm mam_sys_parm.parm_val%TYPE ;

	x RECORD ;
BEGIN
	o_sls_upri := NULL ;

	FOR x IN
		SELECT	m.upri,
			m.row_id
		FROM	mam_std_sls_upri m
		WHERE	0=0
		AND	m.itm_cd = i_itm_cd
		AND	m.itm_sub1 = i_itm_sub1
		AND	m.itm_sub2 = i_itm_sub2
		AND	m.itm_sub3 = i_itm_sub3
		AND	m.unit_cd = i_unit_cd
		AND	m.cur_cd = i_cur_cd
		AND	m.wg_cd = i_wg_cd
		AND	m.st_dt <= i_dt
		AND	m.end_dt >= i_dt
		AND	m.lot_qty <= i_qty
		ORDER BY m.lot_qty DESC
	LOOP
		o_sls_upri := mapa_calc$f_rnd(i_upri_rate * x.UPRI / 100, i_dec_place, i_rnd_typ) ;

		cnf_cnt := cnf_cnt + 1 ;
		INSERT INTO mapa_sls_upri$g_cnf (
			peg_no,
			mst_nm,
			row_id,
			_index_
			)
		VALUES (
			i_peg_no,
			'MAM_STD_SLS_UPRI',
			x.row_id,
			cnf_cnt
			)
		;

		EXIT ;
	END LOOP ;

	IF o_sls_upri IS NULL THEN
		IF i_not_err_flg = '1' THEN
			RETURN ;
		END IF ;

		SELECT	MAX(m.parm_val)
		INTO	STRICT l_parm
		FROM	mam_sys_parm m
		WHERE	0=0
		AND	m.parm_key = 'ITM_SUB_TYP'
		AND	m.del_flg = '0'
		;

		l_bind := fcpa_err$msg_binder (
				mapa_comm$f_to_disp_itm(i_itm_cd, i_itm_sub1, i_itm_sub2, i_itm_sub3, CAST(l_parm AS VARCHAR)), 
				i_unit_cd, i_cur_cd, i_wg_cd, 
				fcpa_date_util$f_to_char(i_dt, fcpa_date_util$y4md()), 
				CAST(i_qty AS VARCHAR)
				) ;
		CALL fcpa_err$raise_app_err('MABSD0001', l_bind) ;
	END IF ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_sls_upri$f_get_sls_upri_rank(
	 IN i_cst_cd VARCHAR,
	 IN i_dlv_cd VARCHAR,
	 IN i_dest_cd1 VARCHAR,
	 IN i_dest_cd2 VARCHAR,
	 IN i_dest_cd3 VARCHAR,
	 IN i_dt TIMESTAMP WITHOUT TIME ZONE)
RETURNS VARCHAR
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	販売単価ランクＣＤを取得する
<REMARKS>
	得意先販売単価ランクマスタが存在しない場合はＮＵＬＬを返す
<ARGUMENTS>
<IN>	i_cst_cd
		得意先ＣＤ
<IN>	i_dlv_cd
		納品先ＣＤ
<IN>	i_dest_cd1
		仕向先ＣＤ１
<IN>	i_dest_cd2
		仕向先ＣＤ２
<IN>	i_dest_cd3
		仕向先ＣＤ３
<IN>	i_dt
		基準日
<RETURNVALUE>
	販売単価ランクＣＤ
<HISTORY>
**********************************************************/
DECLARE
	c_null_val	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL') ;

	l_sls_upri_rank_cd	mam_cst_sls_upri_rank.sls_upri_rank_cd%TYPE ;
	x	RECORD ;
BEGIN
	l_sls_upri_rank_cd := NULL ;

	FOR x IN
		SELECT	m.sls_upri_rank_cd
		FROM	mam_cst_sls_upri_rank m
		WHERE	0=0
		AND	m.cst_cd = i_cst_cd
		AND	(m.dlv_cd = i_dlv_cd OR m.dlv_cd = c_null_val)
		AND	(m.dest_cd1 = i_dest_cd1 OR m.dest_cd1 = c_null_val)
		AND	(m.dest_cd2 = i_dest_cd2 OR m.dest_cd2 = c_null_val)
		AND	(m.dest_cd3 = i_dest_cd3 OR m.dest_cd3 = c_null_val)
		AND	m.st_dt <= i_dt
		AND	m.end_dt >= i_dt
		AND	m.del_flg = '0'
		ORDER BY CONCAT_WS('',
			CASE m.dlv_cd
				WHEN c_null_val THEN '1'
				ELSE '0'
			END,
			CASE m.dest_cd1
				WHEN c_null_val THEN '1'
				ELSE '0'
			END,
			CASE m.dest_cd2
				WHEN c_null_val THEN '1'
				ELSE '0'
			END,
			CASE m.dest_cd3
				WHEN c_null_val THEN '1'
				ELSE '0'
			END)
	LOOP
		l_sls_upri_rank_cd := x.sls_upri_rank_cd ;
		EXIT ;
	END LOOP ;

	RETURN l_sls_upri_rank_cd ;

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mapa_sls_upri$p_set_sls_upri (
	IN i_not_err_flg CHARACTER DEFAULT '0'
)
AS 
$BODY$
/*********************************************************
<SYNOPSIS>
	販売単価を取得してMAW_SLS_UPRI_SRVにセットする
<REMARKS>
	販売単価を取得する対象は呼び出し前にMAW_SLS_UPRI_SRVにデータを作成する
<ARGUMENTS>
<IN>	i_not_err_flg
		エラーなしＦＬＧ
<HISTORY>
**********************************************************/
DECLARE
	c_null_val	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL') ;
	c_rndoff	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_RND_TYP','RNDOFF') ;

	l_idx	INTEGER[] ;
	l_qty	maw_sls_upri_srv.qty%TYPE ;
	cnf_cnt	INTEGER ;
	i	INTEGER ;
	idx	INTEGER ;
	max_idx	INTEGER ;

	l_cnt	INTEGER ;
	l_tmp_cnt INTEGER ;
	l_co_cd	mam_co.co_cd%TYPE ;
	l_upri	NUMERIC ;

	l_sls_upri_rank_cd	mam_cst_sls_upri_rank.sls_upri_rank_cd%TYPE ;

	x1 RECORD ;
	x2 RECORD ;
	x3 RECORD ;
	y2 RECORD ;
	y3 RECORD ;
	t1 RECORD ;
	t2 RECORD ;
	t4 RECORD ;
	t5 RECORD ;
	s1 RECORD ;
BEGIN
	CALL fcpa_postgres_util$type_is_table_row('mapa_sls_upri$g_cnf', 'maw_upri_cnf', 'integer') ;
	CALL fcpa_postgres_util$type_is_table_row('mapa_sls_upri$p_set_sls_upri$l_dtl', 'maw_sls_upri_srv', 'integer') ;

	cnf_cnt := 0 ;
	TRUNCATE TABLE mapa_sls_upri$g_cnf ;
	l_co_cd := fcpa_context$f_get_co_cd() ;

	FOR x1 IN
		SELECT	DISTINCT
			w.itm_cd,
			w.itm_sub1,
			w.itm_sub2,
			w.itm_sub3,
			w.cst_cd,
			w.unit_cd,
			w.cur_cd,
			w.grp_no,
			w.wg_cd,
			m1.upri_dec_place,
			COALESCE(m2.sls_upri_rnd_typ, c_rndoff) sls_upri_rnd_typ,
			m3.sls_upri_grp_cd
		FROM	maw_sls_upri_srv w
			LEFT OUTER JOIN mam_cur m1 ON m1.cur_cd = w.cur_cd
			LEFT OUTER JOIN mam_bp m2 ON m2.bp_cd = w.cst_cd
			LEFT OUTER JOIN mam_itm_com m3 ON m3.del_flg = '0' AND m3.co_cd = l_co_cd AND 
				m3.itm_cd = w.itm_cd AND m3.itm_sub1 = w.itm_sub1 AND m3.itm_sub2 = w.itm_sub2 AND m3.itm_sub3 = w.itm_sub3
		WHERE	0=0
		AND	w.sls_upri_flg = '1'
		AND	w.sls_upri IS NULL
	LOOP
		/* 得意先販売単価マスタの存在チェック */
		<<SKIP_CST_SLS_UPRI>>
		BEGIN
			SELECT	COUNT(*)
			INTO	STRICT l_cnt
			FROM	(
				SELECT	m1.*
				FROM	mam_cst_sls_upri m1
				WHERE	0=0
				AND	m1.itm_cd = x1.itm_cd
				AND	m1.itm_sub1 = x1.itm_sub1
				AND	m1.itm_sub2 = x1.itm_sub2
				AND	m1.itm_sub3 = x1.itm_sub3
				AND	m1.cst_cd = x1.cst_cd
				UNION ALL
				SELECT	m2.*
				FROM	mam_cst_sls_upri m2
				WHERE	0=0
				AND	m2.sls_upri_grp_cd = x1.sls_upri_grp_cd
				AND	m2.cst_cd = x1.cst_cd
				) m
			WHERE	0=0
			AND	m.unit_cd = x1.unit_cd
			AND	m.cur_cd = x1.cur_cd
			AND	m.wg_cd = x1.wg_cd
			AND	(m.upri IS NOT NULL OR m.upri_rate IS NOT NULL)
			;

			IF l_cnt = 0 THEN
				EXIT SKIP_CST_SLS_UPRI ;
			END IF;

			/* 得意先販売単価マスタからの取得 */
			i := 0 ;
			TRUNCATE TABLE mapa_sls_upri$p_set_sls_upri$l_dtl ;
			FOR x2 IN
				SELECT	w.*
				FROM	maw_sls_upri_srv$temp w
					LEFT OUTER JOIN mam_cst_sls_upri m ON 0=0
						AND	(
							m.itm_cd = x1.itm_cd AND m.itm_sub1 = x1.itm_sub1 AND m.itm_sub2 = x1.itm_sub2 AND m.itm_sub3 = x1.itm_sub3
							OR
							m.sls_upri_grp_cd = x1.sls_upri_grp_cd
							)
						AND	m.cst_cd = x1.cst_cd
						AND	(m.dlv_cd = w.dlv_cd OR m.dlv_cd = c_null_val)
						AND	(m.dest_cd1 = w.dest_cd1 OR m.dest_cd1 = c_null_val)
						AND	(m.dest_cd2 = w.dest_cd2 OR m.dest_cd2 = c_null_val)
						AND	(m.dest_cd3 = w.dest_cd3 OR m.dest_cd3 = c_null_val)
						AND	m.unit_cd = x1.unit_cd
						AND	m.cur_cd = x1.cur_cd
						AND	m.wg_cd = x1.wg_cd
						AND	m.st_dt <= w.dt
						AND	m.end_dt >= w.dt
						AND	m.lot_qty <= w.qty
						AND	(m.upri IS NOT NULL OR m.upri_rate IS NOT NULL)
				WHERE	0=0
				AND	w.itm_cd = x1.itm_cd
				AND	w.itm_sub1 = x1.itm_sub1
				AND	w.itm_sub2 = x1.itm_sub2
				AND	w.itm_sub3 = x1.itm_sub3
				AND	w.cst_cd = x1.cst_cd
				AND	w.unit_cd = x1.unit_cd
				AND	w.cur_cd = x1.cur_cd
				AND	(w.grp_no = x1.grp_no OR w.grp_no IS NULL AND x1.grp_no IS NULL)
				AND	w.wg_cd = x1.wg_cd
				AND	w.sls_upri_flg = '1'
				AND	w.sls_upri IS NULL
				ORDER BY CONCAT_WS('',
					CASE COALESCE(m.dlv_cd, c_null_val)
						WHEN c_null_val THEN '1'
						ELSE '0'
					END,
					CASE COALESCE(m.dest_cd1, c_null_val)
						WHEN c_null_val THEN '1'
						ELSE '0'
					END,
					CASE COALESCE(m.dest_cd2, c_null_val)
						WHEN c_null_val THEN '1'
						ELSE '0'
					END,
					CASE COALESCE(m.dest_cd3, c_null_val)
						WHEN c_null_val THEN '1'
						ELSE '0'
					END), 
					w.peg_no
			LOOP
				<<NEXT_X2>>
				BEGIN
					IF i > 0 THEN
						FOR t5 IN
							SELECT * from mapa_sls_upri$p_set_sls_upri$l_dtl ORDER BY _index_
						LOOP
							IF t5.peg_no = x2.peg_no THEN
								EXIT NEXT_X2 ;
							END IF ;
						END LOOP ;
					END IF ;

					i := i + 1;
					INSERT INTO mapa_sls_upri$p_set_sls_upri$l_dtl (
						peg_no,
						itm_cd,
						itm_sub1,
						itm_sub2,
						itm_sub3,
						cst_cd,
						dlv_cd,
						dest_cd1,
						dest_cd2,
						dest_cd3,
						unit_cd,
						qty,
						cur_cd,
						wg_cd,
						dt,
						grp_no,
						sls_upri,
						std_sls_upri,
						std_upri,
						interim_flg,
						sls_upri_flg,
						std_sls_upri_flg,
						std_upri_flg,
						std_upri_wg_cd,
						_index_
						)
					VALUES (
						x2.peg_no,
						x2.itm_cd,
						x2.itm_sub1,
						x2.itm_sub2,
						x2.itm_sub3,
						x2.cst_cd,
						x2.dlv_cd,
						x2.dest_cd1,
						x2.dest_cd2,
						x2.dest_cd3,
						x2.unit_cd,
						x2.qty,
						x2.cur_cd,
						x2.wg_cd,
						x2.dt,
						x2.grp_no,
						x2.sls_upri,
						x2.std_sls_upri,
						x2.std_upri,
						x2.interim_flg,
						x2.sls_upri_flg,
						x2.std_sls_upri_flg,
						x2.std_upri_flg,
						x2.std_upri_wg_cd,
						i
					)
					;
				END ;
			END LOOP ;

			SELECT	MAX(_index_)
			INTO STRICT max_idx
			FROM	mapa_sls_upri$p_set_sls_upri$l_dtl
			WHERE	0=0
			;
			
			FOR t1 IN
				SELECT * FROM mapa_sls_upri$p_set_sls_upri$l_dtl ORDER BY _index_ ASC
			LOOP
				<<NEXT_T1>>
				BEGIN
					IF (SELECT sls_upri FROM mapa_sls_upri$p_set_sls_upri$l_dtl WHERE _index_ = t1._index_) IS NOT NULL THEN
						EXIT NEXT_T1;
					END IF;

					FOR x3 IN
						SELECT
							m.dlv_cd,
							m.dest_cd1,
							m.dest_cd2,
							m.dest_cd3,
							m.lot_qty,
							m.st_dt,
							m.end_dt,
							m.upri,
							m.upri_rate,
							m.interim_flg,
							m.row_id
						FROM	(
							SELECT	m1.*
							FROM	mam_cst_sls_upri m1
							WHERE	0=0
							AND	m1.itm_cd = t1.itm_cd
							AND	m1.itm_sub1 = t1.itm_sub1
							AND	m1.itm_sub2 = t1.itm_sub2
							AND	m1.itm_sub3 = t1.itm_sub3
							AND	m1.cst_cd = t1.cst_cd
							UNION ALL
							SELECT	m2.*
							FROM	mam_cst_sls_upri m2
							WHERE	0=0
							AND	m2.sls_upri_grp_cd = x1.sls_upri_grp_cd
							AND	m2.cst_cd = t1.cst_cd
							) m
						WHERE	0=0
						AND	(m.dlv_cd = t1.dlv_cd OR m.dlv_cd = c_null_val)
						AND	(m.dest_cd1 = t1.dest_cd1 OR m.dest_cd1 = c_null_val)
						AND	(m.dest_cd2 = t1.dest_cd2 OR m.dest_cd2 = c_null_val)
						AND	(m.dest_cd3 = t1.dest_cd3 OR m.dest_cd3 = c_null_val)
						AND	m.unit_cd = t1.unit_cd
						AND	m.cur_cd = t1.cur_cd
						AND	m.wg_cd = t1.wg_cd
						AND	m.st_dt <= t1.dt
						AND	m.end_dt >= t1.dt
						AND	(m.upri IS NOT NULL OR m.upri_rate IS NOT NULL)
						ORDER BY CONCAT_WS('',
							CASE m.dlv_cd
								WHEN c_null_val THEN '1'
								ELSE '0'
							END,
							CASE m.dest_cd1
								WHEN c_null_val THEN '1'
								ELSE '0'
							END,
							CASE m.dest_cd2
								WHEN c_null_val THEN '1'
								ELSE '0'
							END,
							CASE m.dest_cd3
								WHEN c_null_val THEN '1'
								ELSE '0'
							END), 
							CONCAT_WS('',
							CASE m.itm_cd
								WHEN c_null_val THEN '1'
								ELSE '0'
							END,
							CASE m.sls_upri_grp_cd
								WHEN c_null_val THEN '1'
								ELSE '0'
							END), 
							m.lot_qty DESC
					LOOP
						l_qty := t1.qty ;

						IF t1._index_ = max_idx THEN
							IF x3.lot_qty <= l_qty THEN
								IF x3.upri IS NOT NULL THEN
									l_upri := x3.upri ;
								ELSE
									CALL mapa_sls_upri$p_calc_sls_upri(t1.itm_cd, t1.itm_sub1, t1.itm_sub2, t1.itm_sub3,
											t1.unit_cd, t1.cur_cd, t1.wg_cd, t1.dt,
											l_qty, x3.upri_rate, x1.upri_dec_place, x1.sls_upri_rnd_typ, t1.peg_no, i_not_err_flg,
											cnf_cnt, l_upri) ;

								END IF ;

								UPDATE	mapa_sls_upri$p_set_sls_upri$l_dtl 
								SET	sls_upri = l_upri,
									interim_flg = x3.interim_flg
								WHERE	_index_ = t1._index_
								;

								cnf_cnt := cnf_cnt + 1 ;
								INSERT INTO mapa_sls_upri$g_cnf (
									peg_no,
									mst_nm,
									row_id,
									_index_
									)
								VALUES (
									t1.peg_no,
									'MAM_CST_SLS_UPRI',
									x3.row_id,
									cnf_cnt
									)
								;

								EXIT NEXT_T1 ;
							END IF;
						ELSE
							l_idx := '{}' ;

							FOR t2 IN
								SELECT w.* FROM mapa_sls_upri$p_set_sls_upri$l_dtl w WHERE w._index_ >= t1._index_ + 1 ORDER BY w._index_ ASC
							LOOP
								IF t2.sls_upri IS NULL
								AND (x3.dlv_cd = t2.dlv_cd OR x3.dlv_cd = c_null_val)
								AND (x3.dest_cd1 = t2.dest_cd1 OR x3.dest_cd1 = c_null_val)
								AND (x3.dest_cd2 = t2.dest_cd2 OR x3.dest_cd2 = c_null_val)
								AND (x3.dest_cd3 = t2.dest_cd3 OR x3.dest_cd3 = c_null_val)
								AND x3.st_dt  <= t2.dt
								AND x3.end_dt >= t2.dt
								THEN
									l_qty := l_qty + t2.qty ;
									l_idx := array_append(l_idx, t2._index_) ;
								END IF ;
							END LOOP ;

							IF x3.lot_qty <= l_qty THEN
								IF x3.upri IS NOT NULL THEN
									l_upri := x3.upri ;
								ELSE
									CALL mapa_sls_upri$p_calc_sls_upri(t1.itm_cd, t1.itm_sub1, t1.itm_sub2, t1.itm_sub3,
											t1.unit_cd, t1.cur_cd, t1.wg_cd, t1.dt,
											l_qty, x3.upri_rate, x1.upri_dec_place, x1.sls_upri_rnd_typ, t1.peg_no, i_not_err_flg,
											cnf_cnt, l_upri);

								END IF ;

								UPDATE	mapa_sls_upri$p_set_sls_upri$l_dtl
								SET	sls_upri = l_upri,
									interim_flg = x3.interim_flg
								WHERE	_index_ = t1._index_
								;

								cnf_cnt := cnf_cnt + 1 ;
								INSERT INTO mapa_sls_upri$g_cnf (
									peg_no,
									mst_nm,
									row_id,
									_index_
									)
								VALUES (
									t1.peg_no,
									'MAM_CST_SLS_UPRI',
									x3.row_id,
									cnf_cnt
									)
								;

								IF COALESCE(array_length(l_idx, 1), 0)  > 0 THEN
									FOR t3 IN 1..array_length(l_idx, 1) LOOP
										idx := l_idx[t3] ;
										UPDATE	mapa_sls_upri$p_set_sls_upri$l_dtl 
										SET	sls_upri = l_upri,
											interim_flg = x3.interim_flg
										WHERE	_index_ = idx
										;

										l_tmp_cnt := cnf_cnt ;
										FOR t4 IN
											SELECT * FROM mapa_sls_upri$g_cnf ORDER BY _index_
										LOOP
											IF t4.peg_no = t1.peg_no THEN
												cnf_cnt := cnf_cnt + 1 ;
												INSERT INTO mapa_sls_upri$g_cnf (
													peg_no,
													mst_nm,
													row_id,
													_index_
													)
												VALUES (
													(SELECT peg_no FROM mapa_sls_upri$p_set_sls_upri$l_dtl WHERE _index_ = idx),
													t4.mst_nm,
													t4.row_id,
													cnf_cnt
													)
												;
											END IF ;
										END LOOP ;
									END LOOP ;
								END IF ;

								EXIT NEXT_T1;
							END IF ;
						END IF ;
					END LOOP ;
				END ;
			END LOOP ;

			IF i > 0 THEN
				UPDATE /*+ Leading(p w) NestLoop(p w) IndexScan(w) */
					maw_sls_upri_srv$temp w
				SET	sls_upri = p.sls_upri,
					interim_flg = p.interim_flg
				FROM	mapa_sls_upri$p_set_sls_upri$l_dtl p
				WHERE	0=0
				AND	w.peg_no = p.peg_no
				AND	(w.sls_upri_flg = '1' AND w.sls_upri IS NULL OR p.peg_no IS NULL)  -- peg_noの条件は、実行計画がうまくいくように入れている
				;
			END IF ;
		END ;

		<<NEXT_X1>>
		BEGIN
			/* 品目販売単価マスタの存在チェック */
			SELECT	COUNT(*)
			INTO	STRICT l_cnt
			FROM	(
				SELECT	m1.*
				FROM	mam_itm_sls_upri m1
				WHERE	0=0
				AND	m1.itm_cd = x1.itm_cd
				AND	m1.itm_sub1 = x1.itm_sub1
				AND	m1.itm_sub2 = x1.itm_sub2
				AND	m1.itm_sub3 = x1.itm_sub3
				UNION ALL
				SELECT	m2.*
				FROM	mam_itm_sls_upri m2
				WHERE	0=0
				AND	m2.sls_upri_grp_cd = x1.sls_upri_grp_cd
				) m
			WHERE	0=0
			AND	m.unit_cd = x1.unit_cd
			AND	m.cur_cd = x1.cur_cd
			AND	m.wg_cd = x1.wg_cd
			AND	(m.upri IS NOT NULL OR m.upri_rate IS NOT NULL)
			;

			IF l_cnt = 0 THEN
				EXIT NEXT_X1 ;
			END IF;
			
			/* 品目販売単価マスタからの取得 */
			i := 0;
			TRUNCATE TABLE mapa_sls_upri$p_set_sls_upri$l_dtl ;

			FOR y2 IN
				SELECT	w.*
				FROM	maw_sls_upri_srv$temp w
					LEFT OUTER JOIN mam_itm_sls_upri m ON 0=0
						AND	(
							m.itm_cd = x1.itm_cd AND m.itm_sub1 = x1.itm_sub1 AND m.itm_sub2 = x1.itm_sub2 AND m.itm_sub3 = x1.itm_sub3
							OR
							m.sls_upri_grp_cd = x1.sls_upri_grp_cd
							)
						AND	(
							m.sls_upri_rank_cd = c_null_val
							OR
							m.sls_upri_rank_cd = mapa_sls_upri$f_get_sls_upri_rank(w.cst_cd, w.dlv_cd, w.dest_cd1, w.dest_cd2, w.dest_cd3, w.dt)
							)
						AND	m.unit_cd = x1.unit_cd
						AND	m.cur_cd = x1.cur_cd
						AND	m.wg_cd = x1.wg_cd
						AND	m.st_dt <= w.dt
						AND	m.end_dt >= w.dt
						AND	m.lot_qty <= w.qty
						AND	(m.upri IS NOT NULL OR m.upri_rate IS NOT NULL)
				WHERE	0=0
				AND	w.itm_cd = x1.itm_cd
				AND	w.itm_sub1 = x1.itm_sub1
				AND	w.itm_sub2 = x1.itm_sub2
				AND	w.itm_sub3 = x1.itm_sub3
				AND	w.cst_cd = x1.cst_cd
				AND	w.unit_cd = x1.unit_cd
				AND	w.cur_cd = x1.cur_cd
				AND	(w.grp_no = x1.grp_no OR w.grp_no IS NULL AND x1.grp_no IS NULL)
				AND	w.wg_cd = x1.wg_cd
				AND	w.sls_upri_flg = '1'
				AND	w.sls_upri IS NULL
				ORDER BY
					CASE m.sls_upri_rank_cd WHEN c_null_val THEN '1' ELSE '0' END, 
					w.peg_no
			LOOP
				<<NEXT_Y2>>
				BEGIN
					IF i > 0 THEN
						FOR t5 IN
							SELECT * FROM mapa_sls_upri$p_set_sls_upri$l_dtl ORDER BY _index_
						LOOP
							IF t5.peg_no = y2.peg_no THEN
								EXIT NEXT_Y2 ;
							END IF ;
						END LOOP ;
					END IF ;

					i := i + 1 ;
					INSERT INTO mapa_sls_upri$p_set_sls_upri$l_dtl (
						peg_no,
						itm_cd,
						itm_sub1,
						itm_sub2,
						itm_sub3,
						cst_cd,
						dlv_cd,
						dest_cd1,
						dest_cd2,
						dest_cd3,
						unit_cd,
						qty,
						cur_cd,
						wg_cd,
						dt,
						grp_no,
						sls_upri,
						std_sls_upri,
						std_upri,
						interim_flg,
						sls_upri_flg,
						std_sls_upri_flg,
						std_upri_flg,
						std_upri_wg_cd,
						_index_
						)
					VALUES (
						y2.peg_no,
						y2.itm_cd,
						y2.itm_sub1,
						y2.itm_sub2,
						y2.itm_sub3,
						y2.cst_cd,
						y2.dlv_cd,
						y2.dest_cd1,
						y2.dest_cd2,
						y2.dest_cd3,
						y2.unit_cd,
						y2.qty,
						y2.cur_cd,
						y2.wg_cd,
						y2.dt,
						y2.grp_no,
						y2.sls_upri,
						y2.std_sls_upri,
						y2.std_upri,
						y2.interim_flg,
						y2.sls_upri_flg,
						y2.std_sls_upri_flg,
						y2.std_upri_flg,
						y2.std_upri_wg_cd,
						i
						)
					;
				END ;
			END LOOP ;

			IF i = 0 THEN
				EXIT NEXT_X1 ;
			END IF ;

			SELECT	MAX(_index_)
			INTO STRICT max_idx
			FROM	mapa_sls_upri$p_set_sls_upri$l_dtl
			WHERE	0=0
			;

			FOR s1 IN
				SELECT * FROM mapa_sls_upri$p_set_sls_upri$l_dtl ORDER BY _index_
			LOOP
				<<NEXT_S1>>
				BEGIN
					IF (SELECT sls_upri FROM mapa_sls_upri$p_set_sls_upri$l_dtl WHERE _index_ = s1._index_) IS NOT NULL THEN
						EXIT NEXT_S1 ;
					END IF ;

					l_sls_upri_rank_cd := mapa_sls_upri$f_get_sls_upri_rank(s1.cst_cd, s1.dlv_cd, s1.dest_cd1, s1.dest_cd2, s1.dest_cd3, s1.dt) ;
					FOR y3 IN
						SELECT	m.sls_upri_rank_cd,
							m.lot_qty,
							m.st_dt,
							m.end_dt,
							m.upri,
							m.upri_rate,
							m.interim_flg,
							m.row_id
						FROM	(
							SELECT	m1.*
							FROM	mam_itm_sls_upri m1
							WHERE	0=0
							AND	m1.itm_cd = s1.itm_cd
							AND	m1.itm_sub1 = s1.itm_sub1
							AND	m1.itm_sub2 = s1.itm_sub2
							AND	m1.itm_sub3 = s1.itm_sub3
							UNION ALL
							SELECT	m2.*
							FROM	mam_itm_sls_upri m2
							WHERE	0=0
							AND	m2.sls_upri_grp_cd = x1.sls_upri_grp_cd
							) m
						WHERE	0=0
						AND	(m.sls_upri_rank_cd = l_sls_upri_rank_cd OR m.sls_upri_rank_cd = c_null_val)
						AND	m.unit_cd = s1.unit_cd
						AND	m.cur_cd = s1.cur_cd
						AND	m.wg_cd = s1.wg_cd
						AND	m.st_dt <= s1.dt
						AND	m.end_dt >= s1.dt
						AND	(m.upri is NOT NULL OR m.upri_rate IS NOT NULL)
						ORDER BY
							CASE m.sls_upri_rank_cd WHEN c_null_val THEN '1' ELSE '0'END, 
							CONCAT_WS('',
							CASE m.itm_cd
								WHEN c_null_val THEN '1'
								ELSE '0'
							END,
							CASE m.sls_upri_grp_cd WHEN c_null_val THEN '1' ELSE '0' END), 
							m.lot_qty DESC
					LOOP
						l_qty := s1.qty ;

						IF s1._index_ = max_idx THEN
							IF y3.lot_qty <= l_qty THEN
								IF y3.upri IS NOT NULL THEN
									l_upri := y3.upri ;
								ELSE
									CALL mapa_sls_upri$p_calc_sls_upri(s1.itm_cd, s1.itm_sub1, s1.itm_sub2, s1.itm_sub3,
												s1.unit_cd, s1.cur_cd, s1.wg_cd, s1.dt,
												l_qty, y3.upri_rate, x1.upri_dec_place, x1.sls_upri_rnd_typ, s1.peg_no, i_not_err_flg,
												cnf_cnt, l_upri) ;

								END IF ;

								UPDATE	mapa_sls_upri$p_set_sls_upri$l_dtl 
								SET	sls_upri = l_upri,
									interim_flg = y3.interim_flg
								WHERE	_index_ = s1._index_
								;

								cnf_cnt := cnf_cnt + 1 ;
								INSERT INTO mapa_sls_upri$g_cnf (
									peg_no,
									mst_nm,
									row_id,
									_index_
									)
								VALUES	(
									s1.peg_no,
									'MAM_ITM_SLS_UPRI',
									y3.row_id,
									cnf_cnt
									)
								;

								EXIT NEXT_S1 ;
							END IF ;
						ELSE
							l_idx := '{}' ;

							FOR t2 IN
								SELECT * FROM mapa_sls_upri$p_set_sls_upri$l_dtl WHERE _index_ >= s1._index_ + 1 ORDER BY _index_
							LOOP
								IF t2.sls_upri IS NULL
								AND (y3.sls_upri_rank_cd = c_null_val 
									OR y3.sls_upri_rank_cd = mapa_sls_upri$f_get_sls_upri_rank(t2.cst_cd, t2.dlv_cd, 
													t2.dest_cd1, t2.dest_cd2, t2.dest_cd3, t2.dt)
									)
								AND y3.st_dt  <=  t2.dt
								AND y3.end_dt >=  t2.dt
								THEN
									l_qty := l_qty + t2.qty ;
									l_idx := array_append(l_idx, t2._index_) ;
								END IF ;
							END LOOP ;

							IF y3.lot_qty <= l_qty THEN
								IF y3.upri IS NOT NULL THEN
									l_upri := y3.upri ;
								ELSE
									CALL mapa_sls_upri$p_calc_sls_upri(s1.itm_cd, s1.itm_sub1, s1.itm_sub2, s1.itm_sub3,
												s1.unit_cd, s1.cur_cd, s1.wg_cd, s1.dt,
												l_qty, y3.upri_rate, x1.upri_dec_place, x1.sls_upri_rnd_typ, s1.peg_no, i_not_err_flg,
												cnf_cnt, l_upri) ;

								END IF ;

								UPDATE	mapa_sls_upri$p_set_sls_upri$l_dtl 
								SET	sls_upri = l_upri,
									interim_flg = y3.interim_flg
								WHERE	_index_ = s1._index_
								;

								cnf_cnt := cnf_cnt + 1 ;
								INSERT INTO mapa_sls_upri$g_cnf (
									peg_no,
									mst_nm,
									row_id,
									_index_
									)
								VALUES	(
									s1.peg_no,
									'MAM_ITM_SLS_UPRI',
									y3.row_id,
									cnf_cnt
									)
								;

								IF COALESCE(array_length(l_idx, 1), 0)  > 0 THEN
									FOR t3 IN 1..array_length(l_idx, 1) LOOP
										idx := l_idx[t3] ;
										UPDATE	mapa_sls_upri$p_set_sls_upri$l_dtl 
										SET	sls_upri = l_upri, 
											interim_flg = y3.interim_flg
										WHERE	_index_ = idx
										;

										l_tmp_cnt := cnf_cnt ;
										FOR t4 IN
											SELECT * FROM mapa_sls_upri$g_cnf ORDER BY _index_
										LOOP
											IF t4.peg_no = s1.peg_no THEN
												cnf_cnt := cnf_cnt + 1 ;
												INSERT INTO mapa_sls_upri$g_cnf (
													peg_no,
													mst_nm,
													row_id,
													_index_
													)
												VALUES (
													(SELECT peg_no FROM mapa_sls_upri$p_set_sls_upri$l_dtl WHERE _index_ = idx),
													t4.mst_nm,
													t4.row_id,
													cnf_cnt
													)
												;
											END IF ;
										END LOOP ;
									END LOOP ;
								END IF ;

								EXIT NEXT_S1 ;
							END IF ;
						END IF ;
					END LOOP ;
				END ;
			END LOOP ;

			IF i > 0 THEN
				UPDATE /*+ Leading(q w) NestLoop(q w) IndexScan(w) */
					maw_sls_upri_srv w
				SET	sls_upri = q.sls_upri,
					interim_flg = q.interim_flg
				FROM	mapa_sls_upri$p_set_sls_upri$l_dtl q
				WHERE	0=0
				AND	w.peg_no = q.peg_no
				AND	(w.sls_upri_flg = '1' AND w.sls_upri IS NULL OR q.peg_no IS NULL)  -- peg_noの条件は、実行計画がうまくいくように入れている
				;
			END IF ;
		END ;
	END LOOP ;

	IF cnf_cnt > 0 THEN
		CALL fcpa_postgres_util$p_truncate_work('maw_upri_cnf') ;

		INSERT INTO maw_upri_cnf
			(
			peg_no,
			mst_nm,
			row_id
			)
		SELECT	t.peg_no,
			t.mst_nm,
			t.row_id
		FROM	mapa_sls_upri$g_cnf t
		ORDER BY _index_
		;
	END IF ;

	TRUNCATE TABLE mapa_sls_upri$g_cnf ;
	TRUNCATE TABLE mapa_sls_upri$p_set_sls_upri$l_dtl ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mapa_sls_upri$p_set_sls_std_upri()
AS 
$BODY$
/*********************************************************
<SYNOPSIS>
	標準販売単価を取得してMAW_SLS_UPRI_SRVにセットする
<REMARKS>
	標準販売単価を取得する対象は呼び出し前にMAW_SLS_UPRI_SRVにデータを作成する
<ARGUMENTS>
<HISTORY>
**********************************************************/
DECLARE
	l_qty	maw_sls_upri_srv.qty%TYPE ;
	i	INTEGER ;
	idx	INTEGER ;
	max_idx	INTEGER ;

	l_idx	INTEGER[] ;
	x1 RECORD ;
	x2 RECORD ;
	x3 RECORD ;
	t1 RECORD ;
	t2 RECORD ;
BEGIN
	CALL fcpa_postgres_util$type_is_table_row('mapa_sls_upri$p_set_sls_std_upri$l_dtl', 'maw_sls_upri_srv', 'integer') ;

	FOR x1 IN
		SELECT DISTINCT
			w.itm_cd,
			w.itm_sub1,
			w.itm_sub2,
			w.itm_sub3,
			w.unit_cd,
			w.cur_cd,
			w.grp_no,
			w.wg_cd
		FROM	maw_sls_upri_srv w
		WHERE	0=0
		AND	w.std_sls_upri_flg = '1'
	LOOP
		i := 0;
		TRUNCATE TABLE mapa_sls_upri$p_set_sls_std_upri$l_dtl ;

		FOR x2 IN
			SELECT	w.*
			FROM	maw_sls_upri_srv$temp w
			WHERE	0=0
			AND	w.itm_cd = x1.itm_cd
			AND	w.itm_sub1 = x1.itm_sub1
			AND	w.itm_sub2 = x1.itm_sub2
			AND	w.itm_sub3 = x1.itm_sub3
			AND	w.unit_cd = x1.unit_cd
			AND	w.cur_cd = x1.cur_cd
			AND	(w.grp_no = x1.grp_no OR w.grp_no IS NULL AND x1.grp_no IS NULL)
			AND	w.wg_cd = x1.wg_cd
			AND	w.std_sls_upri_flg = '1'
			ORDER BY w.peg_no
		LOOP
			i := i + 1;
			INSERT INTO mapa_sls_upri$p_set_sls_std_upri$l_dtl (
				peg_no,
				itm_cd,
				itm_sub1,
				itm_sub2,
				itm_sub3,
				cst_cd,
				dlv_cd,
				dest_cd1,
				dest_cd2,
				dest_cd3,
				unit_cd,
				qty,
				cur_cd,
				wg_cd,
				dt,
				grp_no,
				sls_upri,
				std_sls_upri,
				std_upri,
				interim_flg,
				sls_upri_flg,
				std_sls_upri_flg,
				std_upri_flg,
				std_upri_wg_cd,
				_index_
				)
			VALUES (
				x2.peg_no,
				x2.itm_cd,
				x2.itm_sub1,
				x2.itm_sub2,
				x2.itm_sub3,
				x2.cst_cd,
				x2.dlv_cd,
				x2.dest_cd1,
				x2.dest_cd2,
				x2.dest_cd3,
				x2.unit_cd,
				x2.qty,
				x2.cur_cd,
				x2.wg_cd,
				x2.dt,
				x2.grp_no,
				x2.sls_upri,
				x2.std_sls_upri,
				x2.std_upri,
				x2.interim_flg,
				x2.sls_upri_flg,
				x2.std_sls_upri_flg,
				x2.std_upri_flg,
				x2.std_upri_wg_cd,
				i
				)
			;
		END LOOP ;

		SELECT	MAX(_index_)
		INTO STRICT max_idx
		FROM	mapa_sls_upri$p_set_sls_std_upri$l_dtl
		WHERE	0=0
		;

		FOR t1 IN
			SELECT * FROM mapa_sls_upri$p_set_sls_std_upri$l_dtl ORDER BY _index_
		LOOP
			<<NEXT_T1>>
			BEGIN
				IF t1.std_sls_upri IS NOT NULL THEN
					EXIT NEXT_T1 ;
				END IF;

				FOR x3 IN
					SELECT	m.lot_qty,
						m.upri,
						m.st_dt,
						m.end_dt
					FROM	mam_std_sls_upri m
					WHERE	0=0
					AND	m.itm_cd = t1.itm_cd
					AND	m.itm_sub1 = t1.itm_sub1
					AND	m.itm_sub2 = t1.itm_sub2
					AND	m.itm_sub3 = t1.itm_sub3
					AND	m.unit_cd = t1.unit_cd
					AND	m.cur_cd = t1.cur_cd
					AND	m.wg_cd = t1.wg_cd
					AND	m.st_dt  <= t1.dt
					AND	m.end_dt >= t1.dt
					ORDER BY m.lot_qty DESC
				LOOP
					l_qty := t1.qty ;

					IF t1._index_ = max_idx THEN
						IF x3.lot_qty <= l_qty THEN
							UPDATE	mapa_sls_upri$p_set_sls_std_upri$l_dtl 
							SET	std_sls_upri = x3.upri 
							WHERE	_index_ = t1._index_
							;

							EXIT NEXT_T1 ;
						END IF;
					ELSE
						l_idx := '{}' ;

						FOR t2 IN
							SELECT * FROM mapa_sls_upri$p_set_sls_std_upri$l_dtl WHERE _index_ >= t1._index_ + 1 ORDER BY _index_
						LOOP
							IF t1.std_sls_upri IS NULL
							AND x3.st_dt  <=  t2.dt
							AND x3.end_dt >=  t2.dt
							THEN
								l_qty := l_qty + t2.qty ;
								l_idx := array_append(l_idx, t2._index_) ;
							END IF ;
						END LOOP ;

						IF x3.lot_qty <= l_qty THEN
							UPDATE	mapa_sls_upri$p_set_sls_std_upri$l_dtl
							SET	std_sls_upri = x3.upri
							WHERE	_index_ = t1._index_
							;

							IF COALESCE(array_length(l_idx, 1), 0)  > 0 THEN
								FOR t3 IN 1..array_length(l_idx, 1) LOOP
									idx := l_idx[t3] ;
									UPDATE	mapa_sls_upri$p_set_sls_std_upri$l_dtl 
									SET	std_sls_upri = x3.upri
									WHERE	_index_ = idx
									;
								END LOOP ;
							END IF ;

							EXIT NEXT_T1 ;
						END IF ;
					END IF ;
				END LOOP ;
			END ;
		END LOOP ;

		IF i > 0 THEN
			UPDATE /*+ Leading(p t) NestLoop(p t) IndexScan(t) */
				maw_sls_upri_srv$temp t
			SET	std_sls_upri = p.std_sls_upri
			FROM	mapa_sls_upri$p_set_sls_std_upri$l_dtl p
			WHERE	0=0
			AND	t.peg_no = p.peg_no
			AND	(t.std_sls_upri_flg = '1' OR p.peg_no IS NULL)  -- peg_noの条件は、実行計画がうまくいくように入れている
			;
		END IF ;
	END LOOP ;

	TRUNCATE TABLE mapa_sls_upri$p_set_sls_std_upri$l_dtl ;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mapa_sls_upri$p_set_std_upri()
AS 
$BODY$
/*********************************************************
<SYNOPSIS>
	標準単価を取得してMAW_SLS_UPRI_SRVにセットする
<REMARKS>
	標準単価を取得する対象は呼び出し前にMAW_SLS_UPRI_SRVにデータを作成する
<ARGUMENTS>
<HISTORY>
**********************************************************/
DECLARE
	l_std_upri_typ mam_co.gm_std_upri_typ%TYPE ;
BEGIN
	l_std_upri_typ := (mapa_co$f_get_co_rec()).gm_std_upri_typ ;

	UPDATE	maw_sls_upri_srv t
	SET	std_upri 
			= mapa_std_cost$f_get_std_upri(t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3, t.dt, t.std_upri_wg_cd, l_std_upri_typ)
	WHERE	0=0
	AND	t.std_upri_flg = '1'
	AND	t.std_upri_wg_cd IS NOT NULL
	;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mapa_sls_upri$p_set_sls_upri_wk()
AS 
$BODY$
/*********************************************************
<SYNOPSIS>
	販売単価・標準販売単価・標準単価を取得してMAW_SLS_UPRI_SRV
	にセットする
<REMARKS>
	販売単価を取得する対象は呼び出し前にMAW_SLS_UPRI_SRVにデータを作成する
<ARGUMENTS>
<HISTORY>
**********************************************************/
BEGIN

	CALL mapa_sls_upri$p_set_sls_upri() ;

	CALL mapa_sls_upri$p_set_sls_std_upri() ;

	CALL mapa_sls_upri$p_set_std_upri() ;

END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE PROCEDURE mapa_sls_upri$p_set_sls_upri_wk_ne()
AS 
$BODY$
/*********************************************************
<SYNOPSIS>
	販売単価・標準販売単価・標準単価を取得してMAW_SLS_UPRI_SRV
	にセットする
<REMARKS>
	販売単価を取得する対象は呼び出し前にMAW_SLS_UPRI_SRVにデータを作成する
	P_SET_SLS_UPRI_WK：標準販売単価マスタが存在しない場合はエラー
	P_SET_SLS_UPRI_WK_NE：標準販売単価マスタが存在しない場合は単価がNULL
<ARGUMENTS>
<HISTORY>
**********************************************************/
BEGIN

	CALL mapa_sls_upri$p_set_sls_upri('1') ;

	CALL mapa_sls_upri$p_set_sls_std_upri() ;

	CALL mapa_sls_upri$p_set_std_upri() ;

END ;
$BODY$
LANGUAGE plpgsql
;
