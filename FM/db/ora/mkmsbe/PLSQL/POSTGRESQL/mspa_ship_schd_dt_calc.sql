CREATE OR REPLACE PROCEDURE mspa_ship_schd_dt_calc$p_upd_wk()
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	出荷予定日計算ワークの更新
<REMARKS>
	計算に必要なマスタ情報をワークに更新する
<ARGUMENTS>
<HISTORY>
**********************************************************/
DECLARE
	c_null_val CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL');
	c_ship_to_id_typ_loc CONSTANT VARCHAR := fcpa_const$get_const_val('MSC_SHIP_TO_ID_TYP','LOC');
BEGIN
	UPDATE msw_ship_schd_dt_calc w
	SET (xfr_lt, fin_cl_time, ship_wk_grp_cd) = (
			SELECT
				CASE WHEN m1.fr_lg_grp_cd IS NULL THEN m2.xfr_lt ELSE m1.xfr_lt END,
				CASE WHEN m1.fr_lg_grp_cd IS NULL THEN m2.fin_cl_time ELSE m1.fin_cl_time END,
				CASE WHEN m1.fr_lg_grp_cd IS NULL THEN m2.ship_wk_grp_cd ELSE m1.ship_wk_grp_cd END
			FROM	msw_ship_schd_dt_calc w1
				LEFT JOIN mam_lg_ctl m1 ON (
					m1.fr_lg_grp_cd = w1.ship_fr_lg_grp_cd
					AND m1.to_lg_grp_cd = w1.ship_to_lg_grp_cd
					AND m1.ship_term_cd = w1.ship_term_cd
					AND m1.del_flg = '0'
				)
				LEFT JOIN mam_lg_ctl m2 ON (
					m2.fr_lg_grp_cd = w1.ship_fr_lg_grp_cd
					AND m2.to_lg_grp_cd = w1.ship_to_lg_grp_cd
					AND m2.ship_term_cd = c_null_val
					AND m2.del_flg = '0'
				)
			WHERE w1.peg_no = w.peg_no
		),
		to_cal_cd = CASE w.ship_to_id_typ
			WHEN c_ship_to_id_typ_loc
			THEN (
				SELECT COALESCE(m2.cal_cd, (SELECT std_cal_cd FROM mam_co))
				FROM mam_loc m1
					LEFT JOIN mam_lg_grp m2 ON (m2.lg_grp_cd = m1.lg_grp_cd)
				WHERE m1.loc_cd = w.ship_to_id_cd) 
			ELSE (
				SELECT dlv_cal_cd FROM mam_bp WHERE bp_cd = w.ship_to_id_cd) 
			END,
		fr_cal_cd = (
			SELECT COALESCE(cal_cd, (SELECT std_cal_cd FROM mam_co))
			FROM	mam_lg_grp WHERE lg_grp_cd = w.ship_fr_lg_grp_cd
		);
	UPDATE msw_ship_schd_dt_calc w
	SET (ship_wk_cd, ship_schd_time) = (
			SELECT m.ship_wk_cd, m.ship_schd_time
			FROM	mam_ship_wk_grp m
			WHERE m.ship_wk_grp_cd = w.ship_wk_grp_cd
		);
	/* 出荷作業カレンダ、最早出荷日加算日数を取得 */
	UPDATE msw_ship_schd_dt_calc w
	SET ship_cal_cd = (
			SELECT m.cal_cd
			FROM mam_ship_wk m
			WHERE m.ship_wk_cd = w.ship_wk_cd
				AND m.del_flg = '0'
		);
	UPDATE msw_ship_schd_dt_calc w
	SET early_ship_dt_add_days = (
		SELECT
			CASE WHEN m1.fr_lg_grp_cd IS NULL THEN COALESCE(m2.early_ship_dt_add_days, (SELECT early_ship_dt_add_days FROM mam_co), 0)
				ELSE COALESCE(m1.early_ship_dt_add_days, (SELECT early_ship_dt_add_days FROM mam_co), 0) END
		FROM msw_ship_schd_dt_calc w1
			LEFT JOIN mam_lg_ctl m1 ON (
				m1.fr_lg_grp_cd = w1.ship_fr_lg_grp_cd
				AND m1.to_lg_grp_cd = w1.ship_to_lg_grp_cd
				AND m1.ship_term_cd = w1.ship_term_cd
				AND m1.del_flg = '0'
			)
			LEFT JOIN mam_lg_ctl m2 ON (
				m2.fr_lg_grp_cd = w1.ship_fr_lg_grp_cd
				AND m2.to_lg_grp_cd = w1.ship_to_lg_grp_cd
				AND m2.ship_term_cd = c_null_val
				AND m2.del_flg = '0'
			)
		WHERE w1.peg_no = w.peg_no
		);
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mspa_ship_schd_dt_calc$f_get_hm(
	 IN i_tm TIMESTAMP WITHOUT TIME ZONE
)
RETURNS VARCHAR
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	引数の日時から時刻を取得する
<REMARKS>
	時刻が00:00の場合はNULLを返却する
<ARGUMENTS>
<IN>	i_tm
		時刻を含む日付
<RETURN VALUE>
	時刻（HH24MI）
<HISTORY>
**********************************************************/
DECLARE
	l_hm varchar;
BEGIN
	l_hm := TO_CHAR(i_tm, 'HH24MI');

	IF l_hm = '0000' THEN
		l_hm := NULL;
	END IF;
	RETURN l_hm;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mspa_ship_schd_dt_calc$f_get_ship_cl(
	 IN i_calc msw_ship_schd_dt_calc,
	 IN i_ss_tm TIMESTAMP WITHOUT TIME ZONE
)
RETURNS mam_ship_cl
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	出荷締時間マスタを取得する
<REMARKS>
	取得できなかった場合、物流制御マスタの情報を
	補完して返却する
<ARGUMENTS>
<IN>	i_calc
		出荷予定日計算対象
<IN>	i_ss_tm
		出荷予定日時
<RETURN VALUE>
	出荷締時間マスタ
<HISTORY>
**********************************************************/
DECLARE
	c_null_val CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL');
	l_cl mam_ship_cl%ROWTYPE;
BEGIN
	BEGIN
 		SELECT * INTO STRICT l_cl
 		FROM	mam_ship_cl
		WHERE	0=0
		AND	fr_lg_grp_cd = i_calc.ship_fr_lg_grp_cd
		AND	to_lg_grp_cd = i_calc.ship_to_lg_grp_cd
		AND	ship_term_cd = i_calc.ship_term_cd
		AND	day_week_typ = mapa_dt$f_to_day_week_typ(i_ss_tm)
		AND	del_flg = '0'
		;
	EXCEPTION
		WHEN no_data_found THEN
			BEGIN
				SELECT * INTO STRICT l_cl
				FROM	mam_ship_cl
				WHERE	0=0
				AND	fr_lg_grp_cd = i_calc.ship_fr_lg_grp_cd
				AND	to_lg_grp_cd = i_calc.ship_to_lg_grp_cd
				AND	ship_term_cd = c_null_val
				AND	day_week_typ = mapa_dt$f_to_day_week_typ(i_ss_tm)
				AND	del_flg = '0'
				;
			EXCEPTION
				WHEN no_data_found THEN
					l_cl.fin_cl_time := i_calc.fin_cl_time;
					l_cl.no_ship_flg := '0';
			END;
	END;
	RETURN l_cl;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mspa_ship_schd_dt_calc$p_get_wk_jdg(
	 IN i_calc msw_ship_schd_dt_calc,
	 INOUT o_adj NUMERIC,
	 INOUT o_jdg mam_ship_wk_jdg
)
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	出荷作業判定マスタを取得する
<REMARKS>
	取得できなかった場合、出荷作業グループマスタの情報を
	補完して返却する
<ARGUMENTS>
<IN>	i_calc
		出荷予定日計算対象
<INOUT>	o_adj
		呼出元の出荷予定日を前日以降の稼働日にスライドさせるか
<INOUT>	o_jdg
		出荷予定時刻が格納される
<HISTORY>
**********************************************************/
DECLARE
	l_jdg mam_ship_wk_jdg%ROWTYPE;
	l_hm varchar;
BEGIN

	o_adj := 0;
	l_hm := mspa_ship_schd_dt_calc$f_get_hm(i_calc.dlv_rqst_tm);

	IF l_hm IS NULL THEN
		/* 納入希望時刻が指定されていない場合は出荷作業Ｇマスタの情報を返却する */
		l_jdg.ship_wk_cd := i_calc.ship_wk_cd;
		l_jdg.ship_schd_time := i_calc.ship_schd_time;
		o_jdg := l_jdg;
		RETURN;
	END IF;

	BEGIN
		SELECT * INTO STRICT l_jdg
		FROM	mam_ship_wk_jdg m
		WHERE	0=0
		AND	m.ship_wk_grp_cd = i_calc.ship_wk_grp_cd
		AND	m.dlv_ded_time = (
			SELECT	MAX(w.dlv_ded_time)
			FROM	mam_ship_wk_jdg w
			WHERE	0=0
			AND	w.ship_wk_grp_cd = m.ship_wk_grp_cd
			AND	w.del_flg = '0'
			)
		AND	m.del_flg = '0'
		;
	EXCEPTION
		WHEN no_data_found THEN
			/* 出荷作業判定マスタが存在しない場合、出荷作業Ｇマスタの情報を返却する */
			l_jdg.ship_wk_cd := i_calc.ship_wk_cd;
			l_jdg.ship_schd_time := i_calc.ship_schd_time;
			o_jdg := l_jdg;
			RETURN;
	END;

	BEGIN
		SELECT * INTO STRICT l_jdg
		FROM	mam_ship_wk_jdg m
		WHERE	0=0
		AND	m.ship_wk_grp_cd = i_calc.ship_wk_grp_cd
		AND	m.dlv_ded_time = (
			SELECT	MAX(w.dlv_ded_time)
			FROM	mam_ship_wk_jdg w
			WHERE	0=0
			AND	w.ship_wk_grp_cd = m.ship_wk_grp_cd
			AND	w.dlv_ded_time <= TO_CHAR(i_calc.dlv_rqst_tm, 'HH24MI')
			AND	w.del_flg = '0'
			)
		AND	m.del_flg = '0'
		;

		IF l_jdg.dlv_ded_time < l_jdg.ship_schd_time THEN
			o_adj := 1;
		END IF;
	EXCEPTION
		WHEN no_data_found THEN
			/* 納入希望時刻より前の納入締切時刻が存在しない場合、 */
			/* 前日の最後の納入締切時刻を採用する */
			l_jdg.ship_wk_cd := l_jdg.ship_wk_cd;
			l_jdg.ship_schd_time := l_jdg.ship_schd_time;

			/* 呼出元の出荷予定日を前日以降の稼働日にスライドさせる */
			o_adj := 1;
	END;
	o_jdg := l_jdg;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mspa_ship_schd_dt_calc$f_gt_close_tm(
	 IN i_calc msw_ship_schd_dt_calc,
	 IN i_ss_tm TIMESTAMP WITHOUT TIME ZONE,
	 IN i_today TIMESTAMP WITHOUT TIME ZONE,
	 IN i_sys_now TIMESTAMP WITHOUT TIME ZONE
)
RETURNS BOOLEAN
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	当日出荷の予定に対して出荷締時間を過ぎているか判定する
<REMARKS>
<ARGUMENTS>
<IN>	i_calc
		出荷予定日計算対象
<IN>	i_ss_tm
		出荷予定日時
<IN>	i_today
		運用日付
<IN>	i_sys_now
		計算開始時のシステム日時
<RETURN VALUE>
	TRUE：締時間超過、FALSE：締時間未達
<HISTORY>
**********************************************************/
DECLARE
	l_cl mam_ship_cl%ROWTYPE;
BEGIN
	IF i_ss_tm IS NOT NULL
		AND DATE_TRUNC('DAY', i_ss_tm) = DATE_TRUNC('DAY', i_today) THEN

		/* 運用日付に対する出荷締時間マスタを取得 */
		l_cl := mspa_ship_schd_dt_calc$f_get_ship_cl(i_calc, i_today);

		IF TO_CHAR(i_sys_now, 'HH24MI') > l_cl.fin_cl_time THEN
			RETURN TRUE;
		END IF;
	END IF;
	RETURN FALSE;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mspa_ship_schd_dt_calc$f_can_ship_dt(
	 IN i_calc msw_ship_schd_dt_calc,
	 IN i_ss_tm TIMESTAMP WITHOUT TIME ZONE,
	 IN i_today TIMESTAMP WITHOUT TIME ZONE,
	 IN i_sys_now TIMESTAMP WITHOUT TIME ZONE
)
RETURNS BOOLEAN
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	出荷可能な日かを判定する
<REMARKS>
	下記いずれかに該当する場合は、出荷不可とする
	・出荷締時間マスタ.出荷不可フラグがオン
	・当日、かつシステム日時の時刻＞出荷締時刻
	・過去日付（出荷日チェックがオンの場合のみ）
	・引数の出荷予定日時が非稼働日（出荷日チェックがオンの場合のみ）
	・引数の出荷予定日時が出荷作業の非稼働日（出荷作業カレンダチェックがオンの場合のみ＝自動計算する場合のみ）
<ARGUMENTS>
<IN>	i_calc
		出荷予定日計算対象
<IN>	i_ss_tm
		出荷予定日時
<IN>	i_today
		運用日付
<IN>	i_sys_now
		計算開始時のシステム日時
<RETURN VALUE>
	TRUE：出荷可、FLSE：出荷不可
<HISTORY>
**********************************************************/
DECLARE
	l_cl mam_ship_cl%ROWTYPE;
BEGIN

	/* 出荷予定日時に対する締時間マスタを取得 */
	l_cl := mspa_ship_schd_dt_calc$f_get_ship_cl(i_calc, i_ss_tm);

	IF l_cl.no_ship_flg = '1'
		OR i_calc.cl_time_chk_flg = '1' AND mspa_ship_schd_dt_calc$f_gt_close_tm(i_calc, i_ss_tm, i_today, i_sys_now)
		OR (i_calc.ship_dt_chk_flg = '1'
			AND (DATE_TRUNC('DAY', i_ss_tm) < DATE_TRUNC('DAY', i_today)
				OR mapa_dt$f_is_wrkday(i_ss_tm, i_calc.fr_cal_cd) = '0')) 
		/* 出荷予定日時が出荷作業の非稼働日の場合を追加 */
		OR (i_calc.ship_cal_cd_chk_flg = '1' AND mapa_dt$f_is_wrkday(i_ss_tm, i_calc.ship_cal_cd) = '0') THEN
		RETURN FALSE;
	END IF;

	RETURN TRUE;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mspa_ship_schd_dt_calc$f_get_fst_dt(
	 IN i_calc msw_ship_schd_dt_calc,
	 IN i_dt TIMESTAMP WITHOUT TIME ZONE,
	 IN i_today TIMESTAMP WITHOUT TIME ZONE,
	 IN i_sys_now TIMESTAMP WITHOUT TIME ZONE
)
RETURNS TIMESTAMP WITHOUT TIME ZONE
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	引数の日付以降で最も早く出荷できる日を取得する
<REMARKS>
<ARGUMENTS>
<IN>	i_calc
		出荷予定日計算対象
<IN>	i_dt
		基準日時
<IN>	i_today
		運用日付
<IN>	i_sys_now
		計算開始時のシステム日時
<RETURN VALUE>
	引数の日付以降で最も早く出荷できる日
<HISTORY>
**********************************************************/
DECLARE
	c_limit_days NUMERIC := 365 * 20; -- 基準日から計算対象の上限（基準日＋c_limit_daysを超える計算は行わない）

	l_dt TIMESTAMP WITHOUT TIME ZONE;
	l_msg VARCHAR[];
BEGIN

	l_dt := DATE_TRUNC('DAY', i_dt);
	WHILE (mspa_ship_schd_dt_calc$f_can_ship_dt(i_calc, l_dt, i_today, i_sys_now) = FALSE) LOOP
		IF i_calc.ship_dt_chk_flg = '1' THEN
			/* FWD_FLG：'1'（リードタイム＝０、かつ基準日が非稼働日の場合、直後の稼働日を返す） */
			/* XFR_FLG：'1'（休日はリードタイム計算に含めない（完了日のみ含める）） */
			l_dt := mapa_dt$f_cal_date(l_dt, 1, '1', i_calc.fr_cal_cd, '1');
		ELSE
			l_dt := l_dt + '1 days'::INTERVAL;
		END IF;

		/* 上限以内で出荷できる日が見つからない */
		IF l_dt > i_dt + (c_limit_days || ' days')::INTERVAL THEN

			IF i_calc.dlv_day_week_typ IS NULL THEN
				l_msg := fcpa_err$msg_binder(
					i_calc.ship_to_lg_grp_cd, i_calc.ship_fr_lg_grp_cd, i_calc.ship_term_cd, i_calc.ship_wk_cd);
				/* 出荷可能な日が取得できませんでした。 */
				CALL fcpa_err$raise_app_err('MSBEL1207', l_msg);
			ELSE
				l_msg := fcpa_err$msg_binder(
					i_calc.ship_to_lg_grp_cd, i_calc.ship_fr_lg_grp_cd, i_calc.ship_term_cd, i_calc.dlv_day_week_typ, i_calc.ship_wk_cd);
				/* 出荷可能な日が取得できませんでした。 */
				CALL fcpa_err$raise_app_err('MSBEL1206', l_msg);
			END IF;
		END IF;
	END LOOP;

	/* 最早出荷日加算日数チェックがオンかつ、最早出荷日加算日数が0より大きい場合に最早出荷日加算日数を加算する */
	IF i_calc.early_ship_dt_add_days_chk_flg = '1' AND i_calc.early_ship_dt_add_days > 0 THEN
		l_dt := l_dt + (i_calc.early_ship_dt_add_days || ' days')::INTERVAL;
	
		/* 最早出荷日加算日数を加算した結果出荷できない日に該当した場合に、再び出荷可能日を計算する */
		WHILE (mspa_ship_schd_dt_calc$f_can_ship_dt(i_calc, l_dt, i_today, i_sys_now) = FALSE) LOOP
			IF i_calc.ship_dt_chk_flg = '1' THEN
				/* FWD_FLG：'1'（リードタイム＝０、かつ基準日が非稼働日の場合、直後の稼働日を返す） */
				/* XFR_FLG：'1'（休日はリードタイム計算に含めない（完了日のみ含める）） */
				l_dt := mapa_dt$f_cal_date(l_dt, 1, '1', i_calc.fr_cal_cd, '1');
			ELSE
				l_dt := l_dt + '1 days'::INTERVAL;
			END IF;

			/* 上限以内で出荷できる日が見つからない */
			IF l_dt > i_dt + (c_limit_days || ' days')::INTERVAL THEN

				IF i_calc.dlv_day_week_typ IS NULL THEN
					l_msg := fcpa_err$msg_binder(
						i_calc.ship_to_lg_grp_cd, i_calc.ship_fr_lg_grp_cd, i_calc.ship_term_cd, i_calc.ship_wk_cd);
					/* 出荷可能な日が取得できませんでした。 */
					CALL fcpa_err$raise_app_err('MSBEL1207', l_msg);
				ELSE
					l_msg := fcpa_err$msg_binder(
						i_calc.ship_to_lg_grp_cd, i_calc.ship_fr_lg_grp_cd, i_calc.ship_term_cd, i_calc.dlv_day_week_typ, i_calc.ship_wk_cd);
					/* 出荷可能な日が取得できませんでした。 */
					CALL fcpa_err$raise_app_err('MSBEL1206', l_msg);
				END IF;
			END IF;
		END LOOP;
	END IF;

	RETURN l_dt;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mspa_ship_schd_dt_calc$f_get_est_ss_dt(
	 IN i_calc msw_ship_schd_dt_calc,
	 IN i_today TIMESTAMP WITHOUT TIME ZONE,
	 IN i_sys_now TIMESTAMP WITHOUT TIME ZONE
)
RETURNS TIMESTAMP WITHOUT TIME ZONE
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	基準日から最早出荷予定日を取得する
<REMARKS>
	最早出荷予定日＝基準以降でもっとも早く出荷できる日
<ARGUMENTS>
<IN>	i_calc
		出荷予定日計算対象
<IN>	i_today
		運用日付
<IN>	i_sys_now
		計算開始時のシステム日時
<RETURN VALUE>
	最早出荷予定日
<HISTORY>
**********************************************************/
BEGIN
	RETURN mspa_ship_schd_dt_calc$f_get_fst_dt(i_calc, i_calc.base_dt::TIMESTAMP, i_today, i_sys_now);
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mspa_ship_schd_dt_calc$p_append_ss_hm(
	 INOUT i_calc msw_ship_schd_dt_calc,
	 IN i_ss_dt TIMESTAMP WITHOUT TIME ZONE,
	 INOUT o_ss_dt TIMESTAMP WITHOUT TIME ZONE
)
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	引数の出荷予定日に対して出荷予定時刻を設定する
<REMARKS>
	出荷作業判定マスタ、または出荷作業グループマスタの
	出荷予定時刻を設定する
<ARGUMENTS>
<INOUT>	i_calc
		出荷予定日計算対象
<IN>	i_ss_dt
		出荷予定日
<INOUT>	o_ss_dt
		出荷予定日時
<HISTORY>
**********************************************************/
DECLARE
	l_jdg mam_ship_wk_jdg%ROWTYPE;
	l_hm varchar;
	l_adj NUMERIC := 0;
	l_ss_dt TIMESTAMP WITHOUT TIME ZONE;
BEGIN
	l_ss_dt := i_ss_dt;

	IF i_calc.dlv_rqst_tm IS NOT NULL THEN
		/* 納入希望日時が指定されている場合は、 */
		/* 出荷作業判定マスタ(または出荷作業Ｇマスタ)から出荷予定時刻を取得する */
		CALL mspa_ship_schd_dt_calc$p_get_wk_jdg(i_calc, l_adj, l_jdg);

		IF l_jdg.ship_schd_time IS NOT NULL THEN
			l_hm := l_jdg.ship_schd_time;
		END IF;

		i_calc.ship_wk_cd := l_jdg.ship_wk_cd;

		IF l_adj > 0 THEN
			l_ss_dt := mapa_dt$f_cal_date(
				l_ss_dt - (l_adj || ' days')::INTERVAL + '1 days'::INTERVAL, - 1, '0', i_calc.fr_cal_cd, '1');
		END IF;
	ELSE
		/* 納入希望日時の指定がない場合は、出荷希望日時の時刻を設定する */
		l_hm := mspa_ship_schd_dt_calc$f_get_hm(i_calc.ship_rqst_tm);
	END IF;

	o_ss_dt := TO_TIMESTAMP(CONCAT(TO_CHAR(l_ss_dt, 'YYYYMMDD'), l_hm), 'YYYYMMDDHH24MI');
END;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE FUNCTION mspa_ship_schd_dt_calc$f_get_days_cannot_xfr(
	IN i_calc msw_ship_schd_dt_calc,
	IN ship_schd_tm timestamp without time zone,
	IN dlv_schd_tm timestamp without time zone)
RETURNS NUMERIC
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	出荷作業カレンダチェックがオン（＝自動計算する）のとき、出荷LTに重なる出荷作業休日の日数を取得する
<REMARKS>
<ARGUMENTS>
<IN>	i_calc
		出荷予定日計算対象
<IN>	ship_schd_tm
		出荷予定日時
<IN>	dlv_schd_tm
		納品予定日時
<RETURN VALUE>
	出荷LTに重なる出荷作業休日の日数
<HISTORY>
**********************************************************/
DECLARE
	cannot_xfr_days NUMERIC := 0;
	count NUMERIC := 0;
	ship_schd TIMESTAMP WITHOUT TIME ZONE;
	dlv_schd TIMESTAMP WITHOUT TIME ZONE;
BEGIN
	 IF i_calc.ship_cal_cd_chk_flg = '0' THEN
		RETURN 0;
	END IF;
	
	IF ship_schd_tm IS NOT NULL THEN /* ship_schd_tmがNOT NULL => 出荷予定日時を基準に移動LT分出荷作業休日の日数をcannot_xfr_daysにカウントする */
		ship_schd := DATE_TRUNC('DAY', ship_schd_tm);
		WHILE (count < i_calc.xfr_lt) LOOP
			ship_schd := ship_schd + '1 days'::INTERVAL;
			IF mapa_dt$f_is_wrkday(ship_schd, i_calc.ship_cal_cd) = '0' THEN
				cannot_xfr_days := cannot_xfr_days + 1;
			ELSE
				count := count + 1;
			END IF;
		END LOOP;
	ELSE /* ship_schd_tmがNULL => 納品予定日時を基準に移動LT分遡って出荷作業休日の日数をcannot_xfr_daysにカウントする */
		dlv_schd := DATE_TRUNC('DAY', dlv_schd_tm);
		WHILE (count < i_calc.xfr_lt) LOOP
			dlv_schd := dlv_schd - '1 days'::INTERVAL;
			IF mapa_dt$f_is_wrkday(dlv_schd, i_calc.ship_cal_cd) = '0' THEN
				cannot_xfr_days := cannot_xfr_days + 1;
			ELSE
				count := count + 1;
			END IF;
		END LOOP;
	END IF;
	RETURN cannot_xfr_days;
END;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE PROCEDURE mspa_ship_schd_dt_calc$p_set_ss_tm_gr(
	 INOUT i_calc msw_ship_schd_dt_calc,
	 IN i_today TIMESTAMP WITHOUT TIME ZONE,
	 IN i_sys_now TIMESTAMP WITHOUT TIME ZONE
)
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	出荷予定日時を計算する（着荷基準）
<REMARKS>
	納品予定日時からリードタイムとLTに重なる出荷作業休日を減算して出荷予定日時を計算する
	計算した出荷予定日時が出荷できる日でない場合は、
	その日以前で出荷できる日にスライドする
<ARGUMENTS>
<INOUT>	i_calc
		出荷予定日計算対象
<IN>	i_today
		運用日付
<IN>	i_sys_now
		計算開始時のシステム日時
<HISTORY>
**********************************************************/
DECLARE
	l_ss_dt TIMESTAMP WITHOUT TIME ZONE;
	l_ss_dt2 TIMESTAMP WITHOUT TIME ZONE;
	l_ds_dt TIMESTAMP WITHOUT TIME ZONE;
	i NUMERIC := 0;
BEGIN

	l_ds_dt := DATE_TRUNC('DAY', i_calc.dlv_schd_tm);
	LOOP
		IF i = 0 THEN
			l_ss_dt := mapa_dt$f_cal_date(l_ds_dt, 0, '0', i_calc.fr_cal_cd, '1');
		ELSE
			l_ss_dt := mapa_dt$f_cal_date(l_ds_dt - (i || ' days')::INTERVAL + '1 days'::INTERVAL, - 1, '0', i_calc.fr_cal_cd, '1');
		END IF;

		/* 最早出荷予定日より前になった時点で計算終了 */
		/* →「その他」のパタンで再計算する */
		IF l_ss_dt < i_calc.est_ship_schd_dt THEN
			EXIT;

		/* 出荷できない日はその日以前にスライドする */
		ELSIF mspa_ship_schd_dt_calc$f_can_ship_dt(i_calc, l_ss_dt, i_today, i_sys_now) = FALSE THEN
			NULL;

		/* ＬＴとＬＴに重なる出荷作業休日を加味した日以前になったら終了 */
		ELSIF DATE_TRUNC('DAY', l_ss_dt) <= l_ds_dt - (i_calc.xfr_lt || ' days')::INTERVAL
			 - (mspa_ship_schd_dt_calc$f_get_days_cannot_xfr(i_calc, NULL, l_ds_dt) || ' days')::INTERVAL THEN
			EXIT;
		END IF;
		i := i + 1;
	END LOOP;

	/* 出荷予定時刻を付与 */
	CALL mspa_ship_schd_dt_calc$p_append_ss_hm(i_calc, l_ss_dt, l_ss_dt2);
	i_calc.ship_schd_tm := l_ss_dt2;

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mspa_ship_schd_dt_calc$p_set_ss_tm_gi(
	 INOUT i_calc msw_ship_schd_dt_calc,
	 IN i_today TIMESTAMP WITHOUT TIME ZONE,
	 IN i_sys_now TIMESTAMP WITHOUT TIME ZONE
)
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	出荷予定日時を計算する（出荷基準）
<REMARKS>
	出荷希望日と基準日を比較して遅い日を出荷予定日時とする
	求めた出荷予定日時が出荷できる日でない場合は、
	その日以降で出荷できる日にスライドする
<ARGUMENTS>
<INOUT>	i_calc
		出荷予定日計算対象
<IN>	i_today
		運用日付
<IN>	i_sys_now
		計算開始時のシステム日時
<HISTORY>
**********************************************************/
DECLARE
	l_ss_dt TIMESTAMP WITHOUT TIME ZONE;
	l_ss_dt2 TIMESTAMP WITHOUT TIME ZONE;
	l_sr_dt TIMESTAMP WITHOUT TIME ZONE;
BEGIN

	IF i_calc.ship_dt_chk_flg = '0' THEN
		i_calc.ship_schd_tm := i_calc.ship_rqst_tm;
		RETURN;
	END IF;

	l_ss_dt := DATE_TRUNC('DAY', i_calc.base_dt);
	l_sr_dt := DATE_TRUNC('DAY', i_calc.ship_rqst_tm);
	IF l_sr_dt > i_calc.base_dt THEN
		l_ss_dt := l_sr_dt;
	END IF;
	l_ss_dt := mspa_ship_schd_dt_calc$f_get_fst_dt(i_calc, l_ss_dt, i_today, i_sys_now);

	/* 出荷予定時刻を付与 */
	CALL mspa_ship_schd_dt_calc$p_append_ss_hm(i_calc, l_ss_dt, l_ss_dt2);
	i_calc.ship_schd_tm := l_ss_dt2;

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mspa_ship_schd_dt_calc$p_set_ds_tm_gr(
	 INOUT i_calc msw_ship_schd_dt_calc,
	 IN i_off BOOLEAN DEFAULT TRUE
)
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	納品予定日を取得する（着日基準）
<REMARKS>
	下記いずれかの条件に従って計算する
	－希望納期が指定されている場合、希望納期と基準日を比較して遅い日
	－着曜日が指定されている場合、基準日以降で着曜日と一致する曜日の日
	－希望納期、着曜日ともに指定されている場合、希望納期と基準日を
	　比較して遅い日以降で着曜日と一致す曜日の日
<ARGUMENTS>
<INOUT>	i_calc
		出荷予定日計算対象
<IN>	i_off
		着曜日に対する非稼働日を考慮するか（TRUE：考慮する、FALSE：考慮しない）
<HISTORY>
**********************************************************/
DECLARE
	l_ds_tm TIMESTAMP WITHOUT TIME ZONE;
	l_limit_dt TIMESTAMP WITHOUT TIME ZONE;
	l_hm varchar;
	l_msg VARCHAR[];
	c_limit_days NUMERIC := 365 * 20; -- 基準日から計算対象の上限（基準日＋c_limit_daysを超える計算は行わない）
	new_dlv_rqst_tm TIMESTAMP WITHOUT TIME ZONE;
BEGIN

	new_dlv_rqst_tm := i_calc.dlv_rqst_tm;
	/* 出荷作業カレンダチェックがオン（＝自動計算する場合）で、納入希望日が出荷作業休日の場合にその日以前で納品できる日を設定する */
	IF i_calc.ship_cal_cd_chk_flg = '1' THEN
		LOOP
			IF mapa_dt$f_is_wrkday(new_dlv_rqst_tm, i_calc.ship_cal_cd) = '0' THEN
				new_dlv_rqst_tm := new_dlv_rqst_tm - '1 days'::INTERVAL;
			ELSE
				EXIT;
			END IF;
		END LOOP;
	END IF;

	/* 希望日αと基準日とで遅い日を候補 */
	IF new_dlv_rqst_tm >= i_calc.base_dt THEN
		l_ds_tm := new_dlv_rqst_tm;
	ELSE
		l_limit_dt := i_calc.base_dt + (c_limit_days || ' days')::INTERVAL;	/* 上限を設ける */
		
		/* 基準日が非稼働日の場合 */
		IF i_calc.dlv_rqst_tm IS NULL THEN
			/* 以降の稼働日にずらす */
			l_ds_tm := mapa_dt$f_cal_date(i_calc.base_dt, 0, '1', i_calc.to_cal_cd, '1');
			
			/* 納品予定候補日が納品先休日または出荷作業休日の場合、さらに直後の稼働日にずらす */
			WHILE (mapa_dt$f_is_wrkday(l_ds_tm, i_calc.to_cal_cd) = '0' OR mapa_dt$f_is_wrkday(l_ds_tm, i_calc.ship_cal_cd) = '0') LOOP
				IF mapa_dt$f_is_wrkday(l_ds_tm, i_calc.to_cal_cd) = '0' THEN
					l_ds_tm := mapa_dt$f_cal_date(l_ds_tm, 0, '1', i_calc.to_cal_cd, '1');
				ELSE
					l_ds_tm := mapa_dt$f_cal_date(l_ds_tm, 0, '1', i_calc.ship_cal_cd, '1');
				END IF;
				/* 計算の上限を超えた場合　*/
				IF l_ds_tm > l_limit_dt THEN
					l_msg := fcpa_err$msg_binder(i_calc.ship_to_lg_grp_cd, i_calc.ship_fr_lg_grp_cd, i_calc.ship_term_cd, i_calc.ship_wk_cd);
					/* 納品可能な日が取得できませんでした。 */
					CALL fcpa_err$raise_app_err('MSBEL1209', l_msg);
				END IF;
			END LOOP;
		ELSE
			/* 直前の稼働日にずらす（希望納期を尊重する） */
			l_ds_tm := mapa_dt$f_cal_date(i_calc.base_dt, 0, '0', i_calc.to_cal_cd, '1');
			
			/* 納品予定候補日が納品先休日または出荷作業休日の場合、さらに直前の稼働日にずらす */
			WHILE (mapa_dt$f_is_wrkday(l_ds_tm, i_calc.to_cal_cd) = '0' OR mapa_dt$f_is_wrkday(l_ds_tm, i_calc.ship_cal_cd) = '0') LOOP
				IF mapa_dt$f_is_wrkday(l_ds_tm, i_calc.to_cal_cd) = '0' THEN
					l_ds_tm := mapa_dt$f_cal_date(l_ds_tm, 0, '0', i_calc.to_cal_cd, '1');
				ELSE
					l_ds_tm := mapa_dt$f_cal_date(l_ds_tm, 0, '0', i_calc.ship_cal_cd, '1');
				END IF;

				/* 最早出荷予定日まで遡っても非稼働日の場合、基準日以降にずらす */
				IF i_calc.est_ship_schd_dt > l_ds_tm THEN
					/* 以降の稼働日にずらす */
					l_ds_tm := mapa_dt$f_cal_date(i_calc.base_dt, 0, '1', i_calc.to_cal_cd, '1');
			
					/* 納品予定候補日が納品先休日または出荷作業休日の場合、さらに直後の稼働日にずらす */
					WHILE (mapa_dt$f_is_wrkday(l_ds_tm, i_calc.to_cal_cd) = '0' OR mapa_dt$f_is_wrkday(l_ds_tm, i_calc.ship_cal_cd) = '0') LOOP
						IF mapa_dt$f_is_wrkday(l_ds_tm, i_calc.to_cal_cd) = '0' THEN
							l_ds_tm := mapa_dt$f_cal_date(l_ds_tm, 0, '1', i_calc.to_cal_cd, '1');
						ELSE
							l_ds_tm := mapa_dt$f_cal_date(l_ds_tm, 0, '1', i_calc.ship_cal_cd, '1');
						END IF;
							/* 計算の上限を超えた場合　*/
							IF l_ds_tm > l_limit_dt THEN
								l_msg := fcpa_err$msg_binder(i_calc.ship_to_lg_grp_cd, i_calc.ship_fr_lg_grp_cd, i_calc.ship_term_cd, i_calc.ship_wk_cd);
								/* 納品可能な日が取得できませんでした。 */
								CALL fcpa_err$raise_app_err('MSBEL1209', l_msg);
							END IF;
					END LOOP;
				END IF;
			END LOOP;
			
			l_hm := mspa_ship_schd_dt_calc$f_get_hm(i_calc.dlv_rqst_tm);
			IF l_hm IS NOT NULL THEN
				l_ds_tm := TO_TIMESTAMP(CONCAT(TO_CHAR(l_ds_tm, 'YYYYMMDD'), l_hm), 'YYYYMMDDHH24MI');
			END IF;
		END IF;
	END IF;

	/* 着曜日あり */
	IF i_calc.dlv_day_week_typ IS NOT NULL THEN

		/* 曜日を合わせる */
		IF i_calc.dlv_day_week_typ <> fcpa_date_util$f_get_week_of_day(l_ds_tm)::VARCHAR THEN
			l_ds_tm := fcpa_date_util$f_next_day(l_ds_tm, i_calc.dlv_day_week_typ::NUMERIC);
		END IF;
		l_limit_dt := i_calc.base_dt + (c_limit_days || ' days')::INTERVAL;	/* 上限を設ける */

		WHILE (l_ds_tm <= l_limit_dt) LOOP
			/* 納入希望日時と同日、または稼働日 */
			/* ※希望日αと同日の場合は、稼働日・非稼働日は問わない */
			IF DATE_TRUNC('DAY', l_ds_tm) = DATE_TRUNC('DAY', new_dlv_rqst_tm)
				OR NOT i_off 
				OR i_off AND mapa_dt$f_is_wrkday(l_ds_tm, i_calc.to_cal_cd) = '1' AND mapa_dt$f_is_wrkday(l_ds_tm, i_calc.ship_cal_cd) = '1' THEN
				EXIT;
			END IF;
			l_ds_tm := fcpa_date_util$f_next_day(l_ds_tm, i_calc.dlv_day_week_typ::NUMERIC);
		END LOOP;

		/* 計算の上限を超えた場合（着曜日が全て非稼働日） */
		IF l_ds_tm > l_limit_dt THEN

			l_msg := fcpa_err$msg_binder(i_calc.ship_to_lg_grp_cd, i_calc.ship_fr_lg_grp_cd, i_calc.ship_term_cd, i_calc.dlv_day_week_typ, i_calc.ship_wk_cd);
			/* 納品可能な日が取得できませんでした。 */
			CALL fcpa_err$raise_app_err('MSBEL1208', l_msg);
		END IF;
	END IF;
	i_calc.dlv_schd_tm := l_ds_tm;

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mspa_ship_schd_dt_calc$p_set_ds_tm_gi(
	 INOUT i_calc msw_ship_schd_dt_calc,
	 IN i_today TIMESTAMP WITHOUT TIME ZONE,
	 IN i_sys_now TIMESTAMP WITHOUT TIME ZONE
)
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	納品予定日時を計算する（出荷基準）
<REMARKS>
	出荷予定日時にリードタイムとLTに重なる出荷作業休日を加算して納品予定日を計算する
	出荷予定日時が出荷希望日時と同じ場合、
	納品予定日が非稼働日であっても、稼働日にスライドしない
<ARGUMENTS>
<INOUT>	i_calc
		出荷予定日計算対象
<IN>	i_today
		運用日付
<IN>	i_sys_now
		計算開始時のシステム日時
<HISTORY>
**********************************************************/
DECLARE
	l_calc msw_ship_schd_dt_calc%ROWTYPE;
	l_ds_tm TIMESTAMP WITHOUT TIME ZONE;
BEGIN

	IF i_calc.ship_schd_tm = i_calc.ship_rqst_tm THEN
		l_ds_tm := mapa_dt$f_cal_date(
			i_calc.ship_schd_tm + (mspa_ship_schd_dt_calc$f_get_days_cannot_xfr(i_calc, i_calc.ship_schd_tm, NULL) || ' days')::INTERVAL, 
			i_calc.xfr_lt, '1', i_calc.to_cal_cd, '1');
	ELSE
		l_ds_tm := mapa_dt$f_cal_date(i_calc.ship_schd_tm  + (mspa_ship_schd_dt_calc$f_get_days_cannot_xfr(i_calc, i_calc.ship_schd_tm, NULL) || ' days')::INTERVAL, 
			i_calc.xfr_lt, '1', i_calc.to_cal_cd, '1');

		/* 非稼働日によって納品予定日時をスライドしている場合は、 */
		/* 納品予定日時から出荷予定日時を再計算する */
		IF l_ds_tm > i_calc.ship_schd_tm + (i_calc.xfr_lt || ' days')::INTERVAL THEN

			l_calc := i_calc;
			l_calc.dlv_schd_tm := l_ds_tm;

			/* 引数の出荷予定日時を上書きする */
			CALL mspa_ship_schd_dt_calc$p_set_ss_tm_gr(l_calc, i_today, i_sys_now);
			i_calc.ship_schd_tm := l_calc.ship_schd_tm;
		END IF;
	END IF;

	/* 出荷基準で算出する場合、日時は付与しない */
	i_calc.dlv_schd_tm := DATE_TRUNC('DAY', l_ds_tm);
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mspa_ship_schd_dt_calc$p_chk_mst(
	 IN i_calc msw_ship_schd_dt_calc
)
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	出荷予定日計算に必要なマスタ情報が取得できているかチェックする
<REMARKS>
<ARGUMENTS>
<IN>	i_calc
		出荷予定日計算対象
<HISTORY>
**********************************************************/
DECLARE
	l_msg VARCHAR[];
BEGIN

	IF i_calc.xfr_lt IS NULL OR i_calc.fin_cl_time IS NULL THEN
		/* 物流制御マスタが登録されていません。 */
		l_msg := fcpa_err$msg_binder(
			i_calc.ship_to_lg_grp_cd, i_calc.ship_fr_lg_grp_cd, i_calc.ship_term_cd);
		CALL fcpa_err$raise_app_err('MSBEL0155', l_msg);

	ELSIF i_calc.fr_cal_cd IS NULL THEN
		/* 物流グループマスタのカレンダＣＤが設定されていません。 */
		l_msg := fcpa_err$msg_binder(i_calc.ship_fr_lg_grp_cd);
		CALL fcpa_err$raise_app_err('MSBEL0156', l_msg);

	/* 送付先識別ＣＤ.カレンダＣＤ */
	ELSIF i_calc.to_cal_cd IS NULL THEN
		/* 場所マスタのカレンダＣＤが設定されていません。 */
		/* 取引先マスタの納品先カレンダＣＤが設定されていません。 */
		l_msg := fcpa_err$msg_binder(i_calc.ship_to_id_typ, i_calc.ship_to_id_cd);
		IF fcpa_const$get_const_val('MSC_SHIP_TO_ID_TYP','LOC') = i_calc.ship_to_id_typ THEN
			CALL fcpa_err$raise_app_err('MSBEL0157', l_msg);
		ELSE
			/* 納品先カレンダが未設定＝すべて稼働日とみなす */
			/* fcpa_err$raise_app_err('MSBEL0158', l_msg); */
			NULL;
		END IF;
	END IF;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mspa_ship_schd_dt_calc$p_cal_ship_schd_dt()
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	出荷予定日計算処理
<REMARKS>
	ワークテーブル(msw_ship_schd_dt_calc)のデータを対象に
	出荷予定日時、および納品予定日時を計算する。
<ARGUMENTS>
<HISTORY>
**********************************************************/
DECLARE
	c_ship_inst_typ_non CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_SHIP_INST_TYP','NON');
	c_ship_inst_typ_no_pick CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_SHIP_INST_TYP','NO_PICK');

	l_today TIMESTAMP WITHOUT TIME ZONE; -- 運用日付
	l_sys_now TIMESTAMP WITHOUT TIME ZONE; -- 計算開始時のシステム日時
	l_upd msw_ship_schd_dt_calc[];
	l_hm varchar;
	x msw_ship_schd_dt_calc%ROWTYPE;
BEGIN

	/* 初期処理 */
	l_today := fcpa_date_util$f_get_today();
	l_sys_now := fcpa_date_util$f_mcsysdate();
	CALL mspa_ship_schd_dt_calc$p_upd_wk();

	/* 出荷予定日計算 */
	FOR x IN
		SELECT	*
		FROM	msw_ship_schd_dt_calc
	LOOP

		/* マスタチェック */
		CALL mspa_ship_schd_dt_calc$p_chk_mst(x);

		/* 指図対象外(出荷元物流Ｇなし) */
		IF c_ship_inst_typ_non = x.ship_inst_typ AND x.ship_fr_lg_grp_cd IS NULL THEN

			CALL mspa_ship_schd_dt_calc$p_set_ds_tm_gr(x, FALSE);
			x.ship_schd_tm := DATE_TRUNC('DAY', x.dlv_schd_tm);

			l_hm := mspa_ship_schd_dt_calc$f_get_hm(x.SHIP_RQST_TM);
			IF l_hm IS NOT NULL THEN
				x.ship_schd_tm := TO_TIMESTAMP(CONCAT(TO_CHAR(x.ship_schd_tm, 'YYYYMMDD'), l_hm), 'YYYYMMDDHH24MI');
			END IF;

		/* ピッキングなし */
		ELSIF c_ship_inst_typ_no_pick = x.ship_inst_typ THEN

			/* 出荷予定日時、納品予定日時はNULL */
			x.ship_schd_tm := NULL;
			x.dlv_schd_tm := NULL;

		/* ピッキングあり、または指図対象外(出荷元物流Ｇあり) */
		ELSE
			/* 最早出荷予定日 */
			x.est_ship_schd_dt := mspa_ship_schd_dt_calc$f_get_est_ss_dt(x, l_today, l_sys_now);

			/* 着日基準 */
			IF x.dlv_rqst_tm IS NOT NULL OR x.dlv_day_week_typ IS NOT NULL THEN

				/* 基準日＝最早出荷予定日(もしくは出荷希望日時)＋リードタイム＋LTに重なる出荷作業休日 */
				x.base_dt := fcpa_postgres_util$greatest(COALESCE(x.ship_rqst_tm, x.est_ship_schd_dt), x.est_ship_schd_dt) + (x.xfr_lt || ' days')::INTERVAL
					 + (mspa_ship_schd_dt_calc$f_get_days_cannot_xfr(x, x.est_ship_schd_dt, NULL) || ' days')::INTERVAL;
				CALL mspa_ship_schd_dt_calc$p_set_ds_tm_gr(x, TRUE);
				CALL mspa_ship_schd_dt_calc$p_set_ss_tm_gr(x, l_today, l_sys_now);

				/* 計算した出荷予定日時が最早出荷予定日より前になった場合 */
				IF x.ship_schd_tm < x.est_ship_schd_dt THEN

					/* 最早出荷予定日を元に計算しなおす（「その他」と同様） */
					x.ship_schd_tm := x.est_ship_schd_dt;
					CALL mspa_ship_schd_dt_calc$p_set_ds_tm_gi(x, l_today, l_sys_now);
				END IF;

			/* 出荷基準 */
			ELSIF x.SHIP_RQST_TM IS NOT NULL THEN

				CALL mspa_ship_schd_dt_calc$p_set_ss_tm_gi(x, l_today, l_sys_now);
				CALL mspa_ship_schd_dt_calc$p_set_ds_tm_gi(x, l_today, l_sys_now);

			/* その他 */
			ELSE

				x.ship_schd_tm := x.est_ship_schd_dt;
				CALL mspa_ship_schd_dt_calc$p_set_ds_tm_gi(x, l_today, l_sys_now);
			END IF;
		END IF;

		l_upd[COALESCE(array_length(l_upd, 1), 0)+1] := x;
	END LOOP;

	/* 出荷予定日時、納品予定日時、出荷作業ＣＤをワークに反映 */
	UPDATE msw_ship_schd_dt_calc t
	SET
		ship_schd_tm = w.ship_schd_tm,
		dlv_schd_tm = w.dlv_schd_tm,
		ship_wk_cd = w.ship_wk_cd
	FROM UNNEST(l_upd) w
	WHERE t.peg_no = w.peg_no;

END;
$BODY$
LANGUAGE plpgsql
;
