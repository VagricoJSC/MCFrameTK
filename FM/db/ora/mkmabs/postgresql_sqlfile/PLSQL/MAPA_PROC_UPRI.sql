\encoding UTF-8

CREATE OR REPLACE PROCEDURE mapa_proc_upri$p_set_proc_upri_wk()
AS 
$BODY$
/*********************************************************
<SYNOPSIS>
	加工単価を取得してmaw_proc_upri_srvにセットする
<REMARKS>
	加工単価を取得する対象は呼び出し前にmaw_proc_upri_srvにデータを作成する
<ARGUMENTS>
<HISTORY>
**********************************************************/
DECLARE
	c_null_val CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL') ;
	c_proc_upri_typ_itm CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_PROC_UPRI_TYP','ITM') ;

	l_qty	maw_proc_upri_srv.qty%TYPE ;

	l_idx	INTEGER[] ;
	i	INTEGER ;
	cnf_cnt INTEGER ;
	idx	INTEGER ;
	max_idx	INTEGER ;
	x1	RECORD ;
	x2	RECORD ;
	x3	RECORD ;
	t1	RECORD ;
	t2	RECORD ;
	t4	RECORD ;
BEGIN
	CALL fcpa_postgres_util$type_is_table_row('mapa_proc_upri$p_set_proc_upri_wk$l_dtl', 'maw_proc_upri_srv', 'integer') ;
	CALL fcpa_postgres_util$type_is_table_row('mapa_proc_upri$p_set_proc_upri_wk$g_cnf', 'maw_upri_cnf', 'integer') ;
	cnf_cnt := 0 ;
	TRUNCATE TABLE mapa_proc_upri$p_set_proc_upri_wk$g_cnf ;

	FOR x1 IN
		SELECT DISTINCT
			w.itm_cd,
			w.itm_sub1,
			w.itm_sub2,
			w.itm_sub3,
			w.sppl_cd,
			w.maker_cd,
			w.unit_cd,
			w.cur_cd,
			w.proc_upri_typ,
			w.grp_no
		FROM	maw_proc_upri_srv w
		WHERE	0=0
		AND	w.upri IS NULL
	LOOP
		i := 0 ;
		TRUNCATE TABLE mapa_proc_upri$p_set_proc_upri_wk$l_dtl ;
		FOR x2 IN
			SELECT	w.*
			FROM	maw_proc_upri_srv$temp w
				LEFT OUTER JOIN mam_proc_upri m ON 0=0
					AND	m.itm_cd = w.itm_cd
					AND	m.itm_sub1 = w.itm_sub1
					AND	m.itm_sub2 = w.itm_sub2
					AND	m.itm_sub3 = w.itm_sub3
					AND	m.sppl_cd = w.sppl_cd
					AND	(m.maker_cd = w.maker_cd OR m.maker_cd = c_null_val)
					AND	m.unit_cd = w.unit_cd
					AND	m.cur_cd = w.cur_cd
					AND	(m.loc_cd = w.loc_cd OR m.loc_cd = c_null_val)
					AND	(m.dlv_cd = w.dlv_cd OR m.dlv_cd = c_null_val)
					AND	m.proc_upri_typ = COALESCE(w.proc_upri_typ, c_proc_upri_typ_itm)
					AND	m.wg_cd = w.wg_cd
					AND	m.st_dt <= w.dt
					AND	m.end_dt >= w.dt
					AND	m.lot_qty <= w.qty
			WHERE	0=0
			AND	w.itm_cd = x1.itm_cd
			AND	w.itm_sub1 = x1.itm_sub1
			AND	w.itm_sub2 = x1.itm_sub2
			AND	w.itm_sub3 = x1.itm_sub3
			AND	w.sppl_cd = x1.sppl_cd
			AND	w.maker_cd = x1.maker_cd
			AND	w.unit_cd = x1.unit_cd
			AND	w.cur_cd = x1.cur_cd
			AND	(w.proc_upri_typ = x1.proc_upri_typ OR w.proc_upri_typ IS NULL AND x1.proc_upri_typ IS NULL)
			AND	(w.grp_no = x1.grp_no OR w.grp_no IS NULL AND x1.grp_no IS NULL)
			AND	w.upri IS NULL
			ORDER BY CONCAT_WS('',
				CASE COALESCE(w.maker_cd, c_null_val)
					WHEN c_null_val THEN '1'
					ELSE '0'
				END,
				CASE COALESCE(w.loc_cd, c_null_val)
					WHEN c_null_val THEN '1'
					ELSE '0'
				END,
				CASE COALESCE(w.dlv_cd, c_null_val)
					WHEN c_null_val THEN '1'
					ELSE '0'
				END
				), w.peg_no
		LOOP
			<<NEXT_X2>>
			BEGIN
				IF i > 0 THEN
					FOR t4 IN 
						SELECT * FROM mapa_proc_upri$p_set_proc_upri_wk$l_dtl ORDER BY _index_ ASC
					LOOP
						IF t4.peg_no = x2.peg_no THEN
							EXIT NEXT_X2 ;
						END IF ;
					END LOOP ;
				END IF ;

				i := i + 1 ;
				INSERT INTO mapa_proc_upri$p_set_proc_upri_wk$l_dtl (
					peg_no, itm_cd, itm_sub1, itm_sub2, itm_sub3, sppl_cd, 
					maker_cd, unit_cd, qty, cur_cd, loc_cd, dlv_cd, proc_upri_typ, 
					wg_cd, dt, grp_no, upri, interim_flg, _index_
				) VALUES (
					x2.peg_no, x2.itm_cd, x2.itm_sub1, x2.itm_sub2, x2.itm_sub3, x2.sppl_cd, 
					x2.maker_cd, x2.unit_cd, x2.qty, x2.cur_cd, x2.loc_cd, x2.dlv_cd, x2.proc_upri_typ, 
					x2.wg_cd, x2.dt, x2.grp_no, x2.upri, x2.interim_flg, i
				) ;
			END ;
		END LOOP ;

		SELECT	MAX(_index_) 
		INTO STRICT max_idx
		FROM	mapa_proc_upri$p_set_proc_upri_wk$l_dtl
		WHERE	0=0
		;

		FOR t1 IN SELECT * FROM mapa_proc_upri$p_set_proc_upri_wk$l_dtl ORDER BY _index_ ASC
		LOOP
			<<NEXT_T1>>
			BEGIN
				IF (SELECT upri FROM mapa_proc_upri$p_set_proc_upri_wk$l_dtl WHERE _index_ = t1._index_) IS NOT NULL THEN
					EXIT NEXT_T1 ;
				END IF ;

				BEGIN
					FOR x3 IN 
						SELECT	m.maker_cd,
							m.loc_cd,
							m.dlv_cd,
							m.lot_qty,
							m.upri,
							m.interim_flg,
							m.st_dt,
							m.end_dt,
							m.row_id,
							m.org_wg_cd
						FROM	mam_proc_upri m
						WHERE	0=0
						AND	m.itm_cd = t1.itm_cd
						AND	m.itm_sub1 = t1.itm_sub1
						AND	m.itm_sub2 = t1.itm_sub2
						AND	m.itm_sub3 = t1.itm_sub3
						AND	m.sppl_cd = t1.sppl_cd
						AND	(m.maker_cd = t1.maker_cd OR m.maker_cd = c_null_val)
						AND	m.unit_cd = t1.unit_cd
						AND	m.cur_cd = t1.cur_cd
						AND	(m.loc_cd = t1.loc_cd OR m.loc_cd = c_null_val)
						AND	(m.dlv_cd = t1.dlv_cd OR m.dlv_cd = c_null_val)
						AND	m.proc_upri_typ = COALESCE(t1.proc_upri_typ, c_proc_upri_typ_itm)
						AND	m.wg_cd = t1.wg_cd
						AND	m.st_dt <= t1.dt
						AND	m.end_dt >= t1.dt
						ORDER BY CONCAT_WS('',
							CASE m.maker_cd
								WHEN c_null_val THEN '1'
								ELSE '0'
							END,
							CASE m.loc_cd
								WHEN c_null_val THEN '1'
								ELSE '0'
							END,
							CASE m.dlv_cd
								WHEN c_null_val THEN '1'
								ELSE '0'
							END),
							m.lot_qty DESC
					LOOP
						l_qty := t1.qty ;

						IF t1._index_ = max_idx THEN
							IF x3.lot_qty <= l_qty THEN
								UPDATE	mapa_proc_upri$p_set_proc_upri_wk$l_dtl
								SET	upri = x3.upri, 
									interim_flg = x3.interim_flg
								WHERE	0=0
								AND	_index_ = t1._index_
								;

								cnf_cnt := cnf_cnt + 1 ;
								INSERT INTO mapa_proc_upri$p_set_proc_upri_wk$g_cnf 
									(_index_, peg_no, mst_nm, row_id) 
								VALUES (cnf_cnt, t1.peg_no, 'MAM_PROC_UPRI', x3.row_id)
								;

								EXIT NEXT_T1 ;
							END IF ;
						ELSE
							l_idx := '{}' ;

							FOR t2 IN 
								SELECT	w.*
								FROM	mapa_proc_upri$p_set_proc_upri_wk$l_dtl w
								WHERE	w._index_ >= t1._index_ + 1
								ORDER BY w._index_ ASC 
							LOOP
								IF t2.upri IS NULL
								AND (x3.maker_cd = t2.maker_cd OR x3.maker_cd = c_null_val)
								AND (x3.loc_cd = t2.loc_cd OR x3.loc_cd = c_null_val)
								AND (x3.dlv_cd = t2.dlv_cd OR x3.dlv_cd = c_null_val)
								AND x3.st_dt <= t2.dt
								AND x3.end_dt >= t2.dt
								AND (x3.org_wg_cd = c_null_val OR x3.org_wg_cd = t2.wg_cd)
								THEN
									l_qty := l_qty + t2.qty ;
									l_idx := array_append(l_idx, t2._index_) ;
								END IF ;
							END LOOP ;

							IF x3.lot_qty <= l_qty THEN
								UPDATE	mapa_proc_upri$p_set_proc_upri_wk$l_dtl 
								SET	upri = x3.upri, 
									interim_flg = x3.interim_flg
								WHERE	_index_ = t1._index_
								;

								cnf_cnt := cnf_cnt + 1 ;
								INSERT INTO mapa_proc_upri$p_set_proc_upri_wk$g_cnf 
									(_index_, peg_no, mst_nm, row_id) 
								VALUES (cnf_cnt, t1.peg_no, 'MAM_PROC_UPRI', x3.row_id)
								;

								IF COALESCE(array_length(l_idx, 1), 0)  > 0 THEN
									FOR t3 IN 1..array_length(l_idx, 1) LOOP
										idx := l_idx[t3] ;
										UPDATE	mapa_proc_upri$p_set_proc_upri_wk$l_dtl 
										SET	upri = x3.upri, 
											interim_flg = x3.interim_flg
										WHERE	_index_ = idx
										;

										cnf_cnt := cnf_cnt + 1 ;
										INSERT INTO mapa_proc_upri$p_set_proc_upri_wk$g_cnf (
											_index_,
											peg_no,
											mst_nm,
											row_id
											) 
										VALUES (cnf_cnt, 
											(SELECT peg_no FROM mapa_proc_upri$p_set_proc_upri_wk$l_dtl WHERE _index_ = idx), 
											'MAM_PROC_UPRI',
											x3.row_id
											) ;
									END LOOP ;
								END IF ;

								EXIT NEXT_T1 ;
							END IF ;
						END IF ;
					END LOOP ;
				END ;
			END ;
		END LOOP ;

		IF i > 0 THEN
			UPDATE /*+ Leading(p w) NestLoop(p w) IndexScan(w) */
				maw_proc_upri_srv$temp w
			SET	upri = p.upri,
				interim_flg = p.interim_flg
			FROM	mapa_proc_upri$p_set_proc_upri_wk$l_dtl p
			WHERE	0=0
			AND	w.peg_no = p.peg_no
			AND	(w.upri IS NULL OR p.peg_no IS NULL) -- peg_noの条件は、実行計画がうまくいくように入れている
			;
		END IF ;

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
		FROM	mapa_proc_upri$p_set_proc_upri_wk$g_cnf t
		ORDER BY t._index_
		;
	END IF ;

	TRUNCATE TABLE mapa_proc_upri$p_set_proc_upri_wk$g_cnf ;
	TRUNCATE TABLE mapa_proc_upri$p_set_proc_upri_wk$l_dtl ;
END ;
$BODY$
LANGUAGE plpgsql
;

