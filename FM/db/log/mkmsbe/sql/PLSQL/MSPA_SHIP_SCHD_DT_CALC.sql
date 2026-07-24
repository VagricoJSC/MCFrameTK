SET SQLBLANKLINES ON

CREATE OR REPLACE PACKAGE MSPA_SHIP_SCHD_DT_CALC
/**************************************************************************
<SYNOPSIS>
		出荷予定日計算パッケージ
<REMARKS>
<ARGUMENTS>
<HISTORY>
**************************************************************************/
IS

	PROCEDURE P_CAL_SHIP_SCHD_DT;
	/*********************************************************
	<SYNOPSIS>
		出荷予定日計算処理
	<REMARKS>
		ワークテーブル(MSW_SHIP_SCHD_DT_CALC)のデータを対象に
		出荷予定日時、および納品予定日時を計算する。
	<ARGUMENTS>
	<HISTORY>
	**********************************************************/

END MSPA_SHIP_SCHD_DT_CALC;

/
show errors;


CREATE OR REPLACE PACKAGE BODY MSPA_SHIP_SCHD_DT_CALC
IS

	W_TODAY			MAPA_META.TM%TYPE;	-- 運用日付
	W_SYS_NOW		MAPA_META.TM%TYPE;	-- 計算開始時のシステム日時
	W_LIMIT_DAYS	NUMBER := 365 * 20;	-- 基準日から計算対象の上限（基準日＋W_LIMIT_DAYSを超える計算は行わない）


	PROCEDURE P_UPD_WK
	/*********************************************************
	<SYNOPSIS>
		出荷予定日計算ワークの更新
	<REMARKS>
		計算に必要なマスタ情報をワークに更新する
	<ARGUMENTS>
	<HISTORY>
	**********************************************************/
	IS
	BEGIN
		UPDATE MSW_SHIP_SCHD_DT_CALC W
		SET (W.XFR_LT, W.FIN_CL_TIME, W.SHIP_WK_GRP_CD) = (
				SELECT DECODE(M1.FR_LG_GRP_CD, NULL, M2.XFR_LT, M1.XFR_LT),
						DECODE(M1.FR_LG_GRP_CD, NULL, M2.FIN_CL_TIME, M1.FIN_CL_TIME),
						DECODE(M1.FR_LG_GRP_CD, NULL, M2.SHIP_WK_GRP_CD, M1.SHIP_WK_GRP_CD)
				FROM MSW_SHIP_SCHD_DT_CALC W1
				LEFT JOIN MAM_LG_CTL M1 ON (
					M1.FR_LG_GRP_CD = W1.SHIP_FR_LG_GRP_CD
					AND M1.TO_LG_GRP_CD = W1.SHIP_TO_LG_GRP_CD
					AND M1.SHIP_TERM_CD = W1.SHIP_TERM_CD
					AND M1.DEL_FLG = '0'
				)
				LEFT JOIN MAM_LG_CTL M2 ON (
					M2.FR_LG_GRP_CD = W1.SHIP_FR_LG_GRP_CD
					AND M2.TO_LG_GRP_CD = W1.SHIP_TO_LG_GRP_CD
					AND M2.SHIP_TERM_CD = MAC_STR.NULL_VAL
					AND M2.DEL_FLG = '0'
				)
				WHERE W1.PEG_NO = W.PEG_NO
			),
			W.TO_CAL_CD = DECODE(MSC_SHIP_TO_ID_TYP.IS_LOC(W.SHIP_TO_ID_TYP), '1',
				(SELECT NVL(M2.CAL_CD, (SELECT STD_CAL_CD FROM MAM_CO))
				 FROM MAM_LOC M1
				 LEFT JOIN MAM_LG_GRP M2 ON (M2.LG_GRP_CD = M1.LG_GRP_CD)
				 WHERE M1.LOC_CD = W.SHIP_TO_ID_CD),
				(SELECT DLV_CAL_CD FROM MAM_BP WHERE BP_CD = W.SHIP_TO_ID_CD)
			),
			W.FR_CAL_CD = (
				SELECT NVL(CAL_CD, (SELECT STD_CAL_CD FROM MAM_CO))
				FROM MAM_LG_GRP WHERE LG_GRP_CD = W.SHIP_FR_LG_GRP_CD
			);
		UPDATE MSW_SHIP_SCHD_DT_CALC W
		SET (W.SHIP_WK_CD, W.SHIP_SCHD_TIME) = (
				SELECT SHIP_WK_CD, SHIP_SCHD_TIME
				FROM MAM_SHIP_WK_GRP
				WHERE SHIP_WK_GRP_CD = W.SHIP_WK_GRP_CD
			);
		-- 出荷作業カレンダ、最早出荷日加算日数を取得
		UPDATE MSW_SHIP_SCHD_DT_CALC W
		SET SHIP_CAL_CD = (
				SELECT M.CAL_CD
				FROM MAM_SHIP_WK M
				WHERE M.SHIP_WK_CD = W.SHIP_WK_CD
					AND M.DEL_FLG = '0'
			);
		UPDATE MSW_SHIP_SCHD_DT_CALC W
		SET EARLY_SHIP_DT_ADD_DAYS = (
				SELECT
					CASE WHEN M1.FR_LG_GRP_CD IS NULL THEN COALESCE(M2.EARLY_SHIP_DT_ADD_DAYS, (SELECT EARLY_SHIP_DT_ADD_DAYS FROM MAM_CO), 0)
						ELSE COALESCE(M1.EARLY_SHIP_DT_ADD_DAYS, (SELECT EARLY_SHIP_DT_ADD_DAYS FROM MAM_CO), 0) END
				FROM MSW_SHIP_SCHD_DT_CALC W1
					LEFT JOIN MAM_LG_CTL M1 ON (
						M1.FR_LG_GRP_CD = W1.SHIP_FR_LG_GRP_CD
						AND M1.TO_LG_GRP_CD = W1.SHIP_TO_LG_GRP_CD
						AND M1.SHIP_TERM_CD = W1.SHIP_TERM_CD
						AND M1.DEL_FLG = '0'
					)
					LEFT JOIN MAM_LG_CTL M2 ON (
						M2.FR_LG_GRP_CD = W1.SHIP_FR_LG_GRP_CD
						AND M2.TO_LG_GRP_CD = W1.SHIP_TO_LG_GRP_CD
						AND M2.SHIP_TERM_CD = MAC_STR.NULL_VAL
						AND M2.DEL_FLG = '0'
					)
				WHERE W1.PEG_NO = W.PEG_NO
			);
	END;

	FUNCTION F_GET_HM(
		I_TM	IN	MAPA_META.TM%TYPE
	)
	RETURN MAPA_META.CHAR_HM%TYPE
	/*********************************************************
	<SYNOPSIS>
		引数の日時から時刻を取得する
	<REMARKS>
		時刻が00:00の場合はNULLを返却する
	<ARGUMENTS>
	<IN>	I_TM
			時刻を含む日付
	<RETURN VALUE>
		時刻（HH24MI）
	<HISTORY>
	**********************************************************/
	IS
		L_HM	MAPA_META.CHAR_HM%TYPE;
	BEGIN
		L_HM := TO_CHAR(I_TM, 'HH24MI');
		IF L_HM = '0000' THEN
			L_HM := NULL;
		END IF;
		RETURN L_HM;
	END F_GET_HM;


	FUNCTION F_GET_SHIP_CL(
		I_CALC	IN	MSW_SHIP_SCHD_DT_CALC%ROWTYPE,
		I_SS_TM	IN	MAPA_META.TM%TYPE
	)
	RETURN MAM_SHIP_CL%ROWTYPE
	/*********************************************************
	<SYNOPSIS>
		出荷締時間マスタを取得する
	<REMARKS>
		取得できなかった場合、物流制御マスタの情報を
		補完して返却する
	<ARGUMENTS>
	<IN>	I_CALC
			出荷予定日計算対象
	<IN>	I_SS_TM
			出荷予定日時
	<RETURN VALUE>
		出荷締時間マスタ
	<HISTORY>
	**********************************************************/
	IS
		L_CL	MAM_SHIP_CL%ROWTYPE;
	BEGIN
		BEGIN
			SELECT * INTO L_CL
			FROM MAM_SHIP_CL
			WHERE 0=0
			AND FR_LG_GRP_CD = I_CALC.SHIP_FR_LG_GRP_CD
			AND TO_LG_GRP_CD = I_CALC.SHIP_TO_LG_GRP_CD
			AND SHIP_TERM_CD = I_CALC.SHIP_TERM_CD
			AND DAY_WEEK_TYP = MAPA_DT.F_TO_DAY_WEEK_TYP(I_SS_TM)
			AND DEL_FLG = '0'
			;
		EXCEPTION
			WHEN NO_DATA_FOUND THEN
				BEGIN
					SELECT * INTO L_CL
					FROM MAM_SHIP_CL
					WHERE 0=0
					AND FR_LG_GRP_CD = I_CALC.SHIP_FR_LG_GRP_CD
					AND TO_LG_GRP_CD = I_CALC.SHIP_TO_LG_GRP_CD
					AND SHIP_TERM_CD = MAC_STR.NULL_VAL
					AND DAY_WEEK_TYP = MAPA_DT.F_TO_DAY_WEEK_TYP(I_SS_TM)
					AND DEL_FLG = '0'
					;
				EXCEPTION
					WHEN NO_DATA_FOUND THEN
						L_CL.FIN_CL_TIME := I_CALC.FIN_CL_TIME;
						L_CL.NO_SHIP_FLG := '0';
				END;
		END;
		RETURN L_CL;
	END F_GET_SHIP_CL;


	FUNCTION F_GET_WK_JDG(
		I_CALC	IN	MSW_SHIP_SCHD_DT_CALC%ROWTYPE,
		O_ADJ	OUT	NUMBER
	)
	RETURN MAM_SHIP_WK_JDG%ROWTYPE
	/*********************************************************
	<SYNOPSIS>
		出荷作業判定マスタを取得する
	<REMARKS>
		取得できなかった場合、出荷作業グループマスタの情報を
		補完して返却する
	<ARGUMENTS>
	<IN>	I_CALC
			出荷予定日計算対象
	<OUT>	O_ADJ
			呼出元の出荷予定日を前日以降の稼働日にスライドさせるか
	<RETURN VALUE>
		出荷締時間マスタ
	<HISTORY>
	**********************************************************/
	IS
		L_JDG	MAM_SHIP_WK_JDG%ROWTYPE;
		L_HM	MAPA_META.CHAR_HM%TYPE;
	BEGIN

		O_ADJ := 0;
		L_HM := F_GET_HM(I_CALC.DLV_RQST_TM);

		IF L_HM IS NULL THEN
			-- 納入希望時刻が指定されていない場合は出荷作業Ｇマスタの情報を返却する
			L_JDG.SHIP_WK_CD := I_CALC.SHIP_WK_CD;
			L_JDG.SHIP_SCHD_TIME := I_CALC.SHIP_SCHD_TIME;
			RETURN L_JDG;
		END IF;

		BEGIN
			SELECT * INTO L_JDG
			FROM MAM_SHIP_WK_JDG M
			WHERE 0=0
			AND M.SHIP_WK_GRP_CD = I_CALC.SHIP_WK_GRP_CD
			AND M.DLV_DED_TIME = (
				SELECT MAX(W.DLV_DED_TIME)
				FROM MAM_SHIP_WK_JDG W
				WHERE 0=0
				AND W.SHIP_WK_GRP_CD = M.SHIP_WK_GRP_CD
				AND W.DEL_FLG = '0'
			)
			AND M.DEL_FLG = '0'
			;
		EXCEPTION
			WHEN NO_DATA_FOUND THEN
				-- 出荷作業判定マスタが存在しない場合、出荷作業Ｇマスタの情報を返却する
				L_JDG.SHIP_WK_CD := I_CALC.SHIP_WK_CD;
				L_JDG.SHIP_SCHD_TIME := I_CALC.SHIP_SCHD_TIME;
				RETURN L_JDG;
		END;

		BEGIN
			SELECT * INTO L_JDG
			FROM MAM_SHIP_WK_JDG M
			WHERE 0=0
			AND M.SHIP_WK_GRP_CD = I_CALC.SHIP_WK_GRP_CD
			AND M.DLV_DED_TIME = (
				SELECT MAX(W.DLV_DED_TIME)
				FROM MAM_SHIP_WK_JDG W
				WHERE 0=0
				AND W.SHIP_WK_GRP_CD = M.SHIP_WK_GRP_CD
				AND W.DLV_DED_TIME <= TO_CHAR(I_CALC.DLV_RQST_TM, 'HH24MI')
				AND W.DEL_FLG = '0'
			)
			AND M.DEL_FLG = '0'
			;
			IF L_JDG.DLV_DED_TIME < L_JDG.SHIP_SCHD_TIME THEN
				O_ADJ := 1;
			END IF ;
		EXCEPTION
			WHEN NO_DATA_FOUND THEN
				-- 納入希望時刻より前の納入締切時刻が存在しない場合、
				-- 前日の最後の納入締切時刻を採用する
				L_JDG.SHIP_WK_CD := L_JDG.SHIP_WK_CD;
				L_JDG.SHIP_SCHD_TIME := L_JDG.SHIP_SCHD_TIME;

				-- 呼出元の出荷予定日を前日以降の稼働日にスライドさせる
				O_ADJ := 1;
		END;
		RETURN L_JDG;
	END F_GET_WK_JDG;


	FUNCTION F_GT_CLOSE_TM(
		I_CALC	IN	MSW_SHIP_SCHD_DT_CALC%ROWTYPE,
		I_SS_TM	IN	MAPA_META.TM%TYPE
	)
	RETURN BOOLEAN
	/*********************************************************
	<SYNOPSIS>
		当日出荷の予定に対して出荷締時間を過ぎているか判定する
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_CALC
			出荷予定日計算対象
	<IN>	I_SS_TM
			出荷予定日時
	<RETURN VALUE>
		TRUE：締時間超過、FALSE：締時間未達
	<HISTORY>
	**********************************************************/
	IS
		L_CL	MAM_SHIP_CL%ROWTYPE;
	BEGIN
		IF I_SS_TM IS NOT NULL
		 AND TRUNC(I_SS_TM) = TRUNC(W_TODAY) THEN

			-- 運用日付に対する出荷締時間マスタを取得
			L_CL := F_GET_SHIP_CL(I_CALC, W_TODAY);

			IF TO_CHAR(W_SYS_NOW, 'HH24MI') > L_CL.FIN_CL_TIME THEN
				RETURN TRUE;
			END IF;
		END IF;
		RETURN FALSE;
	END F_GT_CLOSE_TM;


	FUNCTION F_CAN_SHIP_DT(
		I_CALC	IN	MSW_SHIP_SCHD_DT_CALC%ROWTYPE,
		I_SS_TM	IN	MAPA_META.TM%TYPE
	)
	RETURN BOOLEAN
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
	<IN>	I_CALC
			出荷予定日計算対象
	<IN>	I_SS_TM
			出荷予定日時
	<RETURN VALUE>
		TRUE：出荷可、FLSE：出荷不可
	<HISTORY>
	**********************************************************/
	IS
		L_CL	MAM_SHIP_CL%ROWTYPE;
	BEGIN

		-- 出荷予定日時に対する締時間マスタを取得
		L_CL := F_GET_SHIP_CL(I_CALC, I_SS_TM);

		IF L_CL.NO_SHIP_FLG = '1'
		 OR I_CALC.CL_TIME_CHK_FLG = '1' AND F_GT_CLOSE_TM(I_CALC, I_SS_TM)
		 OR (I_CALC.SHIP_DT_CHK_FLG = '1'
			 AND (TRUNC(I_SS_TM) < TRUNC(W_TODAY)
				 OR MAPA_DT.F_IS_WRKDAY(I_SS_TM, I_CALC.FR_CAL_CD) = '0'))
			-- 出荷予定日時が出荷作業の非稼働日の場合を追加
			OR (I_CALC.SHIP_CAL_CD_CHK_FLG = '1' AND MAPA_DT.F_IS_WRKDAY(I_SS_TM, I_CALC.SHIP_CAL_CD) = '0') THEN
			RETURN FALSE;
		END IF;

		RETURN TRUE;
	END F_CAN_SHIP_DT;


	FUNCTION F_GET_FST_DT(
		I_CALC	IN	MSW_SHIP_SCHD_DT_CALC%ROWTYPE,
		I_DT	IN	MAPA_META.DT%TYPE
	)
	RETURN DATE
	/*********************************************************
	<SYNOPSIS>
		引数の日付以降で最も早く出荷できる日を取得する
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_CALC
			出荷予定日計算対象
	<IN>	I_DT
			基準日時
	<RETURN VALUE>
		引数の日付以降で最も早く出荷できる日
	<HISTORY>
	**********************************************************/
	IS
		L_DT	MAPA_META.DT%TYPE;
		L_MSG	FCPA_ERR.MSG_BINDER;
	BEGIN

		L_DT := TRUNC(I_DT);
		WHILE (F_CAN_SHIP_DT(I_CALC, L_DT) = FALSE) LOOP
			IF I_CALC.SHIP_DT_CHK_FLG = '1' THEN
				-- FWD_FLG：'1'（リードタイム＝０、かつ基準日が非稼働日の場合、直後の稼働日を返す）
				-- XFR_FLG：'1'（休日はリードタイム計算に含めない（完了日のみ含める））
				L_DT := MAPA_DT.F_CAL_DATE(L_DT, 1, '1', I_CALC.FR_CAL_CD, '1');
			ELSE
				L_DT := L_DT + 1;
			END IF;

			-- 上限以内で出荷できる日が見つからない
			IF L_DT > I_DT + W_LIMIT_DAYS THEN

				IF I_CALC.DLV_DAY_WEEK_TYP IS NULL THEN
					L_MSG := FCPA_ERR.MSG_BINDER(
						I_CALC.SHIP_TO_LG_GRP_CD, I_CALC.SHIP_FR_LG_GRP_CD, I_CALC.SHIP_TERM_CD, I_CALC.SHIP_WK_CD);
					-- 出荷可能な日が取得できませんでした。
					FCPA_ERR.RAISE_APP_ERR ('MSBEL1207', L_MSG);
				ELSE
					L_MSG := FCPA_ERR.MSG_BINDER(
						I_CALC.SHIP_TO_LG_GRP_CD, I_CALC.SHIP_FR_LG_GRP_CD, I_CALC.SHIP_TERM_CD, I_CALC.DLV_DAY_WEEK_TYP, I_CALC.SHIP_WK_CD);
					-- 出荷可能な日が取得できませんでした。
					FCPA_ERR.RAISE_APP_ERR ('MSBEL1206', L_MSG);
				END IF;
			END IF;
		END LOOP;

		-- 最早出荷日加算日数チェックがオンかつ、最早出荷日加算日数が0より大きい場合に最早出荷日加算日数を加算する
		IF I_CALC.EARLY_SHIP_DT_ADD_DAYS_CHK_FLG = '1' AND I_CALC.EARLY_SHIP_DT_ADD_DAYS > 0 THEN
			L_DT := L_DT + I_CALC.EARLY_SHIP_DT_ADD_DAYS;
		
			-- 最早出荷日加算日数を加算した結果出荷できない日に該当した場合に、再び出荷可能日を計算する
			WHILE (F_CAN_SHIP_DT(I_CALC, L_DT) = FALSE) LOOP
				IF I_CALC.SHIP_DT_CHK_FLG = '1' THEN
					-- FWD_FLG：'1'（リードタイム＝０、かつ基準日が非稼働日の場合、直後の稼働日を返す）
					-- XFR_FLG：'1'（休日はリードタイム計算に含めない（完了日のみ含める））
					L_DT := MAPA_DT.F_CAL_DATE(L_DT, 1, '1', I_CALC.FR_CAL_CD, '1');
				ELSE
					L_DT := L_DT + 1;
				END IF;

				-- 上限以内で出荷できる日が見つからない
				IF L_DT > I_DT + W_LIMIT_DAYS THEN

					IF I_CALC.DLV_DAY_WEEK_TYP IS NULL THEN
						L_MSG := FCPA_ERR.MSG_BINDER(
							I_CALC.SHIP_TO_LG_GRP_CD, I_CALC.SHIP_FR_LG_GRP_CD, I_CALC.SHIP_TERM_CD, I_CALC.SHIP_WK_CD);
						-- 出荷可能な日が取得できませんでした。
						FCPA_ERR.RAISE_APP_ERR ('MSBEL1207', L_MSG);
					ELSE
						L_MSG := FCPA_ERR.MSG_BINDER(
							I_CALC.SHIP_TO_LG_GRP_CD, I_CALC.SHIP_FR_LG_GRP_CD, I_CALC.SHIP_TERM_CD, I_CALC.DLV_DAY_WEEK_TYP, I_CALC.SHIP_WK_CD);
						-- 出荷可能な日が取得できませんでした。
						FCPA_ERR.RAISE_APP_ERR ('MSBEL1206', L_MSG);
					END IF;
				END IF;
			END LOOP;
		END IF;

		RETURN L_DT;
	END F_GET_FST_DT;


	FUNCTION F_GET_EST_SS_DT(
		I_CALC	IN	MSW_SHIP_SCHD_DT_CALC%ROWTYPE
	)
	RETURN DATE
	/*********************************************************
	<SYNOPSIS>
		基準日から最早出荷予定日を取得する
	<REMARKS>
		最早出荷予定日＝基準以降でもっとも早く出荷できる日
	<ARGUMENTS>
	<IN>	I_CALC
			出荷予定日計算対象
	<RETURN VALUE>
		最早出荷予定日
	<HISTORY>
	**********************************************************/
	IS
	BEGIN
		RETURN F_GET_FST_DT(I_CALC, I_CALC.BASE_DT);
	END F_GET_EST_SS_DT;


	FUNCTION F_APPEND_SS_HM(
		I_CALC	IN OUT	MSW_SHIP_SCHD_DT_CALC%ROWTYPE,
		I_SS_DT	IN		MAPA_META.DT%TYPE
	)
	/*********************************************************
	<SYNOPSIS>
		引数の出荷予定日に対して出荷予定時刻を設定する
	<REMARKS>
		出荷作業判定マスタ、または出荷作業グループマスタの
		出荷予定時刻を設定する
	<ARGUMENTS>
	<INOUT>	I_CALC
			出荷予定日計算対象
	<IN>	I_SS_DT
			出荷予定日
	<RETURN VALUE>
		出荷予定日時
	<HISTORY>
	**********************************************************/
	RETURN MAPA_META.TM%TYPE
	IS
		L_JDG	MAM_SHIP_WK_JDG%ROWTYPE;
		L_TM	MAPA_META.TM%TYPE;
		L_HM	MAPA_META.CHAR_HM%TYPE;
		L_ADJ	NUMBER := 0;
		L_SS_DT	MAPA_META.DT%TYPE;
	BEGIN
		L_SS_DT := I_SS_DT;

		IF I_CALC.DLV_RQST_TM IS NOT NULL THEN
			-- 納入希望日時が指定されている場合は、
			-- 出荷作業判定マスタ(または出荷作業Ｇマスタ)から出荷予定時刻を取得する
			L_JDG := F_GET_WK_JDG(I_CALC, L_ADJ);

			IF L_JDG.SHIP_SCHD_TIME IS NOT NULL THEN
				L_HM := L_JDG.SHIP_SCHD_TIME;
			END IF;

			I_CALC.SHIP_WK_CD := L_JDG.SHIP_WK_CD;

			IF L_ADJ > 0 THEN
				L_SS_DT := MAPA_DT.F_CAL_DATE(
					L_SS_DT - L_ADJ + 1 , -1, '0', I_CALC.FR_CAL_CD, '1');
			END IF;
		ELSE
			-- 納入希望日時の指定がない場合は、出荷希望日時の時刻を設定する
			L_HM := F_GET_HM(I_CALC.SHIP_RQST_TM);
		END IF;

		RETURN TO_DATE(TO_CHAR(L_SS_DT, 'YYYYMMDD') || L_HM, 'YYYYMMDDHH24MI');
	END F_APPEND_SS_HM;

	FUNCTION F_GET_DAYS_CANNOT_XFR(
		I_CALC	IN	MSW_SHIP_SCHD_DT_CALC%ROWTYPE,
		SHIP_SCHD_TM	IN	MAPA_META.TM%TYPE,
		DLV_SCHD_TM	IN	MAPA_META.TM%TYPE
	)
	RETURN NUMBER
	/*********************************************************
	<SYNOPSIS>
		出荷作業カレンダチェックがオン（＝自動計算する）のとき、出荷LTに重なる出荷作業休日の日数を取得する
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_CALC
			出荷予定日計算対象
	<IN>	SHIP_SCHD_TM
			出荷予定日時
	<IN>	DLV_SCHD_TM
			納品予定日時
	<RETURN VALUE>
		出荷LTに重なる出荷作業休日の日数
	<HISTORY>
	**********************************************************/
	IS
		CANNOT_XFR_DAYS	NUMBER := 0;
		L_COUNT	NUMBER := 0;
		SHIP_SCHD	MAPA_META.TM%TYPE;
		DLV_SCHD	MAPA_META.TM%TYPE;
	BEGIN

		IF I_CALC.SHIP_CAL_CD_CHK_FLG = '0' THEN
			RETURN 0;
		END IF;

		IF SHIP_SCHD_TM IS NOT NULL THEN
			-- SHIP_SCHD_TMがNOT NULL => 出荷予定日時を基準に移動LT分出荷作業休日の日数をCANNOT_XFR_DAYSにカウントする
			SHIP_SCHD := TRUNC(SHIP_SCHD_TM);
			WHILE (L_COUNT < I_CALC.XFR_LT) LOOP
				SHIP_SCHD := SHIP_SCHD + 1;
				IF MAPA_DT.F_IS_WRKDAY(SHIP_SCHD, I_CALC.SHIP_CAL_CD) = '0' THEN
					CANNOT_XFR_DAYS := CANNOT_XFR_DAYS + 1;
				ELSE
					L_COUNT := L_COUNT + 1;
				END IF;
			END LOOP;
		ELSE
			-- SHIP_SCHD_TMがNULL => 納品予定日時を基準に移動LT分遡って出荷作業休日の日数をCANNOT_XFR_DAYSにカウントする
			DLV_SCHD := TRUNC(DLV_SCHD_TM);
			WHILE (L_COUNT < I_CALC.XFR_LT) LOOP
				DLV_SCHD := DLV_SCHD - 1;
				IF MAPA_DT.F_IS_WRKDAY(DLV_SCHD, I_CALC.SHIP_CAL_CD) = '0' THEN
					CANNOT_XFR_DAYS := CANNOT_XFR_DAYS + 1;
				ELSE
					L_COUNT := L_COUNT + 1;
				END IF;
			END LOOP;
		END IF;
		RETURN CANNOT_XFR_DAYS;
	END F_GET_DAYS_CANNOT_XFR;

	PROCEDURE P_SET_SS_TM_GR(
		I_CALC	IN OUT	MSW_SHIP_SCHD_DT_CALC%ROWTYPE
	)
	/*********************************************************
	<SYNOPSIS>
		出荷予定日時を計算する（着荷基準）
	<REMARKS>
		納品予定日時からリードタイムとLTに重なる出荷作業休日を減算して出荷予定日時を計算する
		計算した出荷予定日時が出荷できる日でない場合は、
		その日以前で出荷できる日にスライドする
	<ARGUMENTS>
	<HISTORY>
	**********************************************************/
	IS
		L_SS_DT		MAPA_META.DT%TYPE;
		L_DS_DT		MAPA_META.DT%TYPE;
		I			NUMBER := 0;
	BEGIN

		L_DS_DT := TRUNC(I_CALC.DLV_SCHD_TM);
		LOOP
			IF I = 0 THEN
				L_SS_DT := MAPA_DT.F_CAL_DATE(
					L_DS_DT, 0, '0', I_CALC.FR_CAL_CD, '1');
			ELSE
				L_SS_DT := MAPA_DT.F_CAL_DATE(
					L_DS_DT - I + 1 , -1, '0', I_CALC.FR_CAL_CD, '1');
			END IF;


			-- 最早出荷予定日より前になった時点で計算終了
			-- →「その他」のパタンで再計算する
			IF L_SS_DT < I_CALC.EST_SHIP_SCHD_DT THEN
				EXIT;

			-- 出荷できない日はその日以前にスライドする
			ELSIF F_CAN_SHIP_DT(I_CALC, L_SS_DT) = FALSE THEN
				NULL;

			-- ＬＴとＬＴに重なる出荷作業休日を加味した日以前になったら終了
			ELSIF TRUNC(L_SS_DT) <= L_DS_DT - I_CALC.XFR_LT
				 - F_GET_DAYS_CANNOT_XFR(I_CALC, NULL, L_DS_DT) THEN
				EXIT;
			END IF;

			I := I + 1;
		END LOOP;

		-- 出荷予定時刻を付与
		I_CALC.SHIP_SCHD_TM := F_APPEND_SS_HM(I_CALC, L_SS_DT);

	END P_SET_SS_TM_GR;


	PROCEDURE P_SET_SS_TM_GI(
		I_CALC	IN OUT	MSW_SHIP_SCHD_DT_CALC%ROWTYPE
	)
	/*********************************************************
	<SYNOPSIS>
		出荷予定日時を計算する（出荷基準）
	<REMARKS>
		出荷希望日と基準日を比較して遅い日を出荷予定日時とする
		求めた出荷予定日時が出荷できる日でない場合は、
		その日以降で出荷できる日にスライドする
	<ARGUMENTS>
	<HISTORY>
	**********************************************************/
	IS
		L_SS_DT		MAPA_META.TM%TYPE;
		L_SR_DT		MAPA_META.TM%TYPE;
		I			NUMBER := 0;
	BEGIN

		IF I_CALC.SHIP_DT_CHK_FLG = '0' THEN
			I_CALC.SHIP_SCHD_TM := I_CALC.SHIP_RQST_TM;
			RETURN;
		END IF;

		L_SS_DT := TRUNC(I_CALC.BASE_DT);
		L_SR_DT := TRUNC(I_CALC.SHIP_RQST_TM);
		IF L_SR_DT > I_CALC.BASE_DT THEN
			L_SS_DT := L_SR_DT;
		END IF;
		L_SS_DT := F_GET_FST_DT(I_CALC, L_SS_DT);

		-- 出荷予定時刻を付与
		I_CALC.SHIP_SCHD_TM := F_APPEND_SS_HM(I_CALC, L_SS_DT);

	END P_SET_SS_TM_GI;


	PROCEDURE P_SET_DS_TM_GR(
		I_CALC	IN OUT	MSW_SHIP_SCHD_DT_CALC%ROWTYPE,
		I_OFF	IN	BOOLEAN DEFAULT TRUE
	)
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
	<IN>	I_CALC
			出荷予定日計算対象
			I_OFF
			着曜日に対する非稼働日を考慮するか（TRUE：考慮する、FALSE：考慮しない）
	<HISTORY>
	**********************************************************/
	IS
		L_DS_TM		MAPA_META.TM%TYPE;
		L_LIMIT_DT	MAPA_META.DT%TYPE;
		L_HM		MAPA_META.CHAR_HM%TYPE;
		L_MSG		FCPA_ERR.MSG_BINDER;
		NEW_DLV_RQST_TM MAPA_META.TM%TYPE;
	BEGIN

		NEW_DLV_RQST_TM := I_CALC.DLV_RQST_TM;
		-- 出荷作業カレンダチェックがオン（＝自動計算する場合）で、納入希望日が出荷作業休日の場合にその日以前で納品できる日を設定する
		IF I_CALC.SHIP_CAL_CD_CHK_FLG = '1' THEN
			LOOP
				IF MAPA_DT.F_IS_WRKDAY(NEW_DLV_RQST_TM, I_CALC.SHIP_CAL_CD) = '0' THEN
					NEW_DLV_RQST_TM := NEW_DLV_RQST_TM - 1;
				ELSE
					EXIT;
				END IF;
			END LOOP;
		END IF;

		-- 希望日αと基準日とで遅い日を候補
		IF NEW_DLV_RQST_TM >= I_CALC.BASE_DT THEN
			L_DS_TM := NEW_DLV_RQST_TM;
		ELSE
			L_LIMIT_DT := I_CALC.BASE_DT + W_LIMIT_DAYS;	-- 上限を設ける

			-- 基準日が非稼働日の場合
			IF I_CALC.DLV_RQST_TM IS NULL THEN
				-- 以降の稼働日にずらす
				L_DS_TM := MAPA_DT.F_CAL_DATE(
						I_CALC.BASE_DT, 0, '1', I_CALC.TO_CAL_CD, '1');

				-- 納品予定候補日が納品先休日または出荷作業休日の場合、さらに直後の稼働日にずらす
				WHILE (MAPA_DT.F_IS_WRKDAY(L_DS_TM, I_CALC.TO_CAL_CD) = '0' OR MAPA_DT.F_IS_WRKDAY(L_DS_TM, I_CALC.SHIP_CAL_CD) = '0') LOOP
					IF MAPA_DT.F_IS_WRKDAY(L_DS_TM, I_CALC.TO_CAL_CD) = '0' THEN
						L_DS_TM := MAPA_DT.F_CAL_DATE(L_DS_TM, 0, '1', I_CALC.TO_CAL_CD, '1');
					ELSE
						L_DS_TM := MAPA_DT.F_CAL_DATE(L_DS_TM, 0, '1', I_CALC.SHIP_CAL_CD, '1');
					END IF;
					-- 計算の上限を超えた場合
					IF L_DS_TM > L_LIMIT_DT THEN
						L_MSG := FCPA_ERR.MSG_BINDER(I_CALC.SHIP_TO_LG_GRP_CD, I_CALC.SHIP_FR_LG_GRP_CD, I_CALC.SHIP_TERM_CD, I_CALC.SHIP_WK_CD);
						-- 納品可能な日が取得できませんでした。
						FCPA_ERR.RAISE_APP_ERR ('MSBEL1209', L_MSG);
					END IF;
				END LOOP;
			ELSE
				-- 直前の稼働日にずらす（希望納期を尊重する）
				L_DS_TM := MAPA_DT.F_CAL_DATE(
						I_CALC.BASE_DT, 0, '0', I_CALC.TO_CAL_CD, '1');

				-- 納品予定候補日が納品先休日または出荷作業休日の場合、さらに直前の稼働日にずらす
				WHILE (MAPA_DT.F_IS_WRKDAY(L_DS_TM, I_CALC.TO_CAL_CD) = '0' OR MAPA_DT.F_IS_WRKDAY(L_DS_TM, I_CALC.SHIP_CAL_CD) = '0') LOOP
					IF MAPA_DT.F_IS_WRKDAY(L_DS_TM, I_CALC.TO_CAL_CD) = '0' THEN
						L_DS_TM := MAPA_DT.F_CAL_DATE(L_DS_TM, 0, '0', I_CALC.TO_CAL_CD, '1');
					ELSE
						L_DS_TM := MAPA_DT.F_CAL_DATE(L_DS_TM, 0, '0', I_CALC.SHIP_CAL_CD, '1');
					END IF;

					-- 最早出荷予定日まで遡っても非稼働日の場合、基準日以降にずらす
					IF I_CALC.EST_SHIP_SCHD_DT > L_DS_TM THEN
						-- 以降の稼働日にずらす
						L_DS_TM := MAPA_DT.F_CAL_DATE(I_CALC.BASE_DT, 0, '1', I_CALC.TO_CAL_CD, '1');

						-- 納品予定候補日が納品先休日または出荷作業休日の場合、さらに直後の稼働日にずらす
						WHILE (MAPA_DT.F_IS_WRKDAY(L_DS_TM, I_CALC.TO_CAL_CD) = '0' OR MAPA_DT.F_IS_WRKDAY(L_DS_TM, I_CALC.SHIP_CAL_CD) = '0') LOOP
							IF MAPA_DT.F_IS_WRKDAY(L_DS_TM, I_CALC.TO_CAL_CD) = '0' THEN
								L_DS_TM := MAPA_DT.F_CAL_DATE(L_DS_TM, 0, '1', I_CALC.TO_CAL_CD, '1');
							ELSE
								L_DS_TM := MAPA_DT.F_CAL_DATE(L_DS_TM, 0, '1', I_CALC.SHIP_CAL_CD, '1');
							END IF;

							-- 計算の上限を超えた場合
							IF L_DS_TM > L_LIMIT_DT THEN
								L_MSG := FCPA_ERR.MSG_BINDER(I_CALC.SHIP_TO_LG_GRP_CD, I_CALC.SHIP_FR_LG_GRP_CD, I_CALC.SHIP_TERM_CD, I_CALC.SHIP_WK_CD);
								-- 納品可能な日が取得できませんでした。
								FCPA_ERR.RAISE_APP_ERR ('MSBEL1209', L_MSG);
							END IF;
						END LOOP;
					END IF;
				END LOOP;

				L_HM := F_GET_HM(I_CALC.DLV_RQST_TM);
				IF L_HM IS NOT NULL THEN
					L_DS_TM := TO_DATE(TO_CHAR(L_DS_TM, 'YYYYMMDD') || L_HM, 'YYYYMMDDHH24MI');
				END IF;
			END IF;

		END IF;

		-- 着曜日あり
		IF I_CALC.DLV_DAY_WEEK_TYP IS NOT NULL THEN

			-- 曜日を合わせる
			IF I_CALC.DLV_DAY_WEEK_TYP <> FCPA_DATE_UTIL.F_GET_WEEK_OF_DAY(L_DS_TM) THEN
				L_DS_TM := FCPA_DATE_UTIL.F_NEXT_DAY(L_DS_TM, I_CALC.DLV_DAY_WEEK_TYP);
			END IF;

			L_LIMIT_DT := I_CALC.BASE_DT + W_LIMIT_DAYS;	-- 上限を設ける
			WHILE (L_DS_TM <= L_LIMIT_DT) LOOP
				-- 納入希望日時と同日、または稼働日
				-- ※希望日αと同日の場合は、稼働日・非稼働日は問わない
				IF TRUNC(L_DS_TM) = TRUNC(NEW_DLV_RQST_TM)
				 OR NOT I_OFF
				 OR I_OFF AND MAPA_DT.F_IS_WRKDAY(L_DS_TM, I_CALC.TO_CAL_CD) = '1' AND MAPA_DT.F_IS_WRKDAY(L_DS_TM, I_CALC.SHIP_CAL_CD) = '1' THEN
					EXIT;
				END IF;
				L_DS_TM := FCPA_DATE_UTIL.F_NEXT_DAY(L_DS_TM, I_CALC.DLV_DAY_WEEK_TYP);
			END LOOP;

			-- 計算の上限を超えた場合（着曜日が全て非稼働日）
			IF L_DS_TM > L_LIMIT_DT THEN

				L_MSG := FCPA_ERR.MSG_BINDER(
					I_CALC.SHIP_TO_LG_GRP_CD, I_CALC.SHIP_FR_LG_GRP_CD, I_CALC.SHIP_TERM_CD, I_CALC.DLV_DAY_WEEK_TYP, I_CALC.SHIP_WK_CD);
				-- 納品可能な日が取得できませんでした。
				FCPA_ERR.RAISE_APP_ERR ('MSBEL1208', L_MSG);
			END IF;
		END IF;
		I_CALC.DLV_SCHD_TM := L_DS_TM;

	END P_SET_DS_TM_GR;


	PROCEDURE P_SET_DS_TM_GI(
		I_CALC	IN OUT	MSW_SHIP_SCHD_DT_CALC%ROWTYPE
	)
	/*********************************************************
	<SYNOPSIS>
		納品予定日時を計算する（出荷基準）
	<REMARKS>
		出荷予定日時にリードタイムとLTに重なる出荷作業休日を加算して納品予定日を計算する
		出荷予定日時が出荷希望日時と同じ場合、
		納品予定日が非稼働日であっても、稼働日にスライドしない
	<ARGUMENTS>
	<HISTORY>
	**********************************************************/
	IS
		L_CALC	MSW_SHIP_SCHD_DT_CALC%ROWTYPE;
		L_DS_TM		MAPA_META.TM%TYPE;
		I			NUMBER := 0;
	BEGIN

		IF I_CALC.SHIP_SCHD_TM = I_CALC.SHIP_RQST_TM THEN
			L_DS_TM := MAPA_DT.F_CAL_DATE(
				I_CALC.SHIP_SCHD_TM + F_GET_DAYS_CANNOT_XFR(I_CALC, I_CALC.SHIP_SCHD_TM, NULL), I_CALC.XFR_LT, '1', I_CALC.TO_CAL_CD, '1');
		ELSE
			L_DS_TM := MAPA_DT.F_CAL_DATE(
				I_CALC.SHIP_SCHD_TM + F_GET_DAYS_CANNOT_XFR(I_CALC, I_CALC.SHIP_SCHD_TM, NULL), I_CALC.XFR_LT, '1', I_CALC.TO_CAL_CD, '1');

			-- 非稼働日によって納品予定日時をスライドしている場合は、
			-- 納品予定日時から出荷予定日時を再計算する
			IF L_DS_TM > I_CALC.SHIP_SCHD_TM + I_CALC.XFR_LT THEN

				L_CALC :=I_CALC;
				L_CALC.DLV_SCHD_TM := L_DS_TM;

				-- 引数の出荷予定日時を上書きする
				P_SET_SS_TM_GR(L_CALC);
				I_CALC.SHIP_SCHD_TM := L_CALC.SHIP_SCHD_TM;
			END IF;
		END IF;

		-- 出荷基準で算出する場合、日時は付与しない
		I_CALC.DLV_SCHD_TM := TRUNC(L_DS_TM);
	END P_SET_DS_TM_GI;


	PROCEDURE P_CHK_MST(
		I_CALC	IN	MSW_SHIP_SCHD_DT_CALC%ROWTYPE
	)
	/*********************************************************
	<SYNOPSIS>
		出荷予定日計算に必要なマスタ情報が取得できているかチェックする
	<REMARKS>
	<ARGUMENTS>
	<HISTORY>
	**********************************************************/
	IS
		L_MSG		FCPA_ERR.MSG_BINDER;
	BEGIN

		IF I_CALC.XFR_LT IS NULL OR I_CALC.FIN_CL_TIME IS NULL THEN
			-- 物流制御マスタが登録されていません。
			L_MSG := FCPA_ERR.MSG_BINDER(
				I_CALC.SHIP_TO_LG_GRP_CD, I_CALC.SHIP_FR_LG_GRP_CD, I_CALC.SHIP_TERM_CD);
			FCPA_ERR.RAISE_APP_ERR('MSBEL0155', L_MSG);

		ELSIF I_CALC.FR_CAL_CD IS NULL THEN
			-- 物流グループマスタのカレンダＣＤが設定されていません。
			L_MSG := FCPA_ERR.MSG_BINDER(I_CALC.SHIP_FR_LG_GRP_CD);
			FCPA_ERR.RAISE_APP_ERR('MSBEL0156', L_MSG);

		-- 送付先識別ＣＤ.カレンダＣＤ
		ELSIF I_CALC.TO_CAL_CD IS NULL THEN
			-- 場所マスタのカレンダＣＤが設定されていません。
			-- 取引先マスタの納品先カレンダＣＤが設定されていません。
			L_MSG := FCPA_ERR.MSG_BINDER(I_CALC.SHIP_TO_ID_TYP, I_CALC.SHIP_TO_ID_CD);
			IF MSC_SHIP_TO_ID_TYP.IS_LOC(I_CALC.SHIP_TO_ID_TYP) = '1' THEN
				FCPA_ERR.RAISE_APP_ERR('MSBEL0157', L_MSG);
			ELSE
				-- 納品先カレンダが未設定＝すべて稼働日とみなす
				-- FCPA_ERR.RAISE_APP_ERR('MSBEL0158', L_MSG);
				NULL;
			END IF;
		END IF;
	END P_CHK_MST;


	PROCEDURE P_CAL_SHIP_SCHD_DT
	/*********************************************************
	<SYNOPSIS>
		出荷予定日計算処理
	<REMARKS>
		ワークテーブル(MSW_SHIP_SCHD_DT_CALC)のデータを対象に
		出荷予定日時、および納品予定日時を計算する。
	<ARGUMENTS>
	<HISTORY>
	**********************************************************/
	IS
		TYPE TBL_TYPE_R IS TABLE OF MSW_SHIP_SCHD_DT_CALC%ROWTYPE INDEX BY BINARY_INTEGER;
		L_UPD	TBL_TYPE_R;
		L_HM	MAPA_META.CHAR_HM%TYPE;
		I	BINARY_INTEGER := 0;
	BEGIN

		-- 初期処理
		W_TODAY := FCPA_DATE_UTIL.F_GET_TODAY;
		W_SYS_NOW := FCPA_DATE_UTIL.F_MCSYSDATE;
		P_UPD_WK;

		-- 出荷予定日計算
		FOR x IN (SELECT * FROM MSW_SHIP_SCHD_DT_CALC) LOOP

			-- マスタチェック
			P_CHK_MST(x);

			-- 指図対象外(出荷元物流Ｇなし)
			IF MAC_SHIP_INST_TYP.IS_NON(x.SHIP_INST_TYP) = '1' AND x.SHIP_FR_LG_GRP_CD IS NULL THEN

				P_SET_DS_TM_GR(x, FALSE);
				x.SHIP_SCHD_TM := TRUNC(x.DLV_SCHD_TM);

				L_HM := F_GET_HM(x.SHIP_RQST_TM);
				IF L_HM IS NOT NULL THEN
					x.SHIP_SCHD_TM := TO_DATE(TO_CHAR(x.SHIP_SCHD_TM, 'YYYYMMDD') || L_HM, 'YYYYMMDDHH24MI');
				END IF;

			-- ピッキングなし
			ELSIF MAC_SHIP_INST_TYP.IS_NO_PICK(x.SHIP_INST_TYP) = '1' THEN

				-- 出荷予定日時、納品予定日時はNULL
				x.SHIP_SCHD_TM := NULL;
				x.DLV_SCHD_TM := NULL;

			-- ピッキングあり、または指図対象外(出荷元物流Ｇあり)
			ELSE

				-- 最早出荷予定日
				x.EST_SHIP_SCHD_DT := F_GET_EST_SS_DT(x);

				-- 着日基準
				IF x.DLV_RQST_TM IS NOT NULL
				 OR x.DLV_DAY_WEEK_TYP IS NOT NULL THEN

					-- 基準日＝最早出荷予定日(もしくは出荷希望日時)＋リードタイム＋LTに重なる出荷作業休日
					x.BASE_DT := GREATEST(NVL(x.SHIP_RQST_TM, x.EST_SHIP_SCHD_DT), x.EST_SHIP_SCHD_DT) + x.XFR_LT
						 + F_GET_DAYS_CANNOT_XFR(x, x.EST_SHIP_SCHD_DT, NULL);

					P_SET_DS_TM_GR(x, TRUE);
					P_SET_SS_TM_GR(x);

					-- 計算した出荷予定日時が最早出荷予定日より前になった場合
					IF x.SHIP_SCHD_TM < x.EST_SHIP_SCHD_DT THEN

						-- 最早出荷予定日を元に計算しなおす（「その他」と同様）
						x.SHIP_SCHD_TM := x.EST_SHIP_SCHD_DT;
						P_SET_DS_TM_GI(x);
					END IF;

				-- 出荷基準
				ELSIF x.SHIP_RQST_TM IS NOT NULL THEN

					P_SET_SS_TM_GI(x);
					P_SET_DS_TM_GI(x);

				-- その他
				ELSE

					x.SHIP_SCHD_TM := x.EST_SHIP_SCHD_DT;
					P_SET_DS_TM_GI(x);

				END IF;
			END IF;
			L_UPD(I) := x;
			I := I +1;
		END LOOP;

		-- 出荷予定日時、納品予定日時、出荷作業ＣＤをワークに反映
		FORALL I IN L_UPD.FIRST .. L_UPD.LAST
			UPDATE MSW_SHIP_SCHD_DT_CALC
			SET	SHIP_SCHD_TM = L_UPD(I).SHIP_SCHD_TM,
				DLV_SCHD_TM = L_UPD(I).DLV_SCHD_TM,
				SHIP_WK_CD = L_UPD(I).SHIP_WK_CD
			WHERE PEG_NO = L_UPD(I).PEG_NO;

	END P_CAL_SHIP_SCHD_DT;

END MSPA_SHIP_SCHD_DT_CALC;

/
show errors;


