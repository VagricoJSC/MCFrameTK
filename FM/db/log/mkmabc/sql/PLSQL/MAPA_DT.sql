SET SQLBLANKLINES ON

CREATE OR REPLACE PACKAGE          MAPA_DT
/*********************************************************
<SYNOPSIS>
		日付関連ユーティリティ
<REMARKS>
<ARGUMENTS>
<HISTORY>
**********************************************************/
IS
	FUNCTION F_TO_DAY_WEEK_TYP (
		I_DT		IN MAPA_META.DT%TYPE
	) RETURN MAPA_META.DAY_WEEK_TYP%TYPE ;
	/*********************************************************
	<SYNOPSIS>
			日付を曜日区分に変換する
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_DT
			日付
	<RETURNVALUE>
			曜日区分
	<HISTORY>
	**********************************************************/

	FUNCTION F_GET_PERIOD_ST_DT_NE
	(
		I_DT IN MAPA_META.DT%TYPE,
		I_PERIOD_TYP IN MAPA_META.PERIOD_TYP%TYPE,
		I_CL_DAY IN MAPA_META.CL_DAY%TYPE
	)
	RETURN MAPA_META.DT%TYPE;
	/*********************************************************
	<SYNOPSIS>
			会計締日から、対象日付の属する期間の開始日となる年月日を取得する。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_DT
			対象日付
	<IN>	I_PERIOD_TYP
			期間区分
	<IN>	I_CL_DAY
			会計締日
	<RETURNVALUE>
			対象日付の属する期間の開始日
	<HISTORY>
	**********************************************************/

	FUNCTION F_GET_PERIOD_END_DT_NE
	(
		I_DT IN MAPA_META.DT%TYPE,
		I_PERIOD_TYP IN MAPA_META.PERIOD_TYP%TYPE,
		I_CL_DAY IN MAPA_META.CL_DAY%TYPE
	)
	RETURN MAPA_META.DT%TYPE;
	/*********************************************************
	<SYNOPSIS>
			会計締日から、対象日付の属する期間の終了日となる年月日を取得する。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_DT
			対象日付
	<IN>	I_PERIOD_TYP
			期間区分
	<IN>	I_CL_DAY
			会計締日
	<RETURNVALUE>
			対象日付の属する期間の終了日
	<HISTORY>
	**********************************************************/

	FUNCTION F_ADD_PERIOD_ST_DT_NE
	(
		I_DT IN MAPA_META.DT%TYPE,
		I_PERIOD_TYP IN MAPA_META.PERIOD_TYP%TYPE,
		I_ADD IN INTEGER,
		I_CL_DAY IN MAPA_META.CL_DAY%TYPE
	)
	RETURN MAPA_META.DT%TYPE;
	/*********************************************************
	<SYNOPSIS>
			会計締日から、対象日付の属する期間の開始日から加算期間先の開始日となる年月日を取得する。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_DT
			対象日付
	<IN>	I_PERIOD_TYP
			期間区分
	<IN>	I_ADD
			加算期間
	<IN>	I_CL_DAY
			会計締日
	<RETURNVALUE>
			対象日付の属する期間の開始日から加算期間先の開始日
	<HISTORY>
	**********************************************************/

	FUNCTION F_ADD_PERIOD_END_DT_NE
	(
		I_DT IN MAPA_META.DT%TYPE,
		I_PERIOD_TYP IN MAPA_META.PERIOD_TYP%TYPE,
		I_ADD IN INTEGER,
		I_CL_DAY IN MAPA_META.CL_DAY%TYPE
	)
	RETURN MAPA_META.DT%TYPE;
	/*********************************************************
	<SYNOPSIS>
			会計締日から、対象日付の属する期間の開始日から加算期間先の終了日となる年月日を取得する。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_DT
			対象日付
	<IN>	I_PERIOD_TYP
			期間区分
	<IN>	I_ADD
			加算期間
	<IN>	I_CL_DAY
			会計締日
	<RETURNVALUE>
			対象日付の属する期間の終了日から加算期間先の終了日
	<HISTORY>
	**********************************************************/

	FUNCTION F_GET_YM_ST_DT_NE
	(
		I_YM IN MAPA_META.YM%TYPE,
		I_PERIOD_TYP IN MAPA_META.PERIOD_TYP%TYPE,
		I_CL_DAY IN MAPA_META.CL_DAY%TYPE,
		I_CL_MON_BASE IN MAPA_META.CL_MON_BASE%TYPE
	)
	RETURN MAPA_META.DT%TYPE;
	/*********************************************************
	<SYNOPSIS>
			会計締日と会計月度基準から、年月の属する期間の開始日となる年月日を取得する。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_YM
			対象年月
	<IN>	I_PERIOD_TYP
			期間区分
	<IN>	I_CL_DAY
			会計締日
	<IN>	I_CL_MON_BASE
			会計月度基準
	<RETURNVALUE>
			年月の属する期間の開始日
	<HISTORY>
	**********************************************************/

	FUNCTION F_GET_YM_END_DT_NE
	(
		I_YM IN MAPA_META.YM%TYPE,
		I_PERIOD_TYP IN MAPA_META.PERIOD_TYP%TYPE,
		I_CL_DAY IN MAPA_META.CL_DAY%TYPE,
		I_CL_MON_BASE IN MAPA_META.CL_MON_BASE%TYPE
	)
	RETURN MAPA_META.DT%TYPE;
	/*********************************************************
	<SYNOPSIS>
			会計締日と会計月度基準から、年月の属する期間の終了日となる年月日を取得する。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_YM
			対象年月
	<IN>	I_PERIOD_TYP
			期間区分
	<IN>	I_CL_DAY
			会計締日
	<IN>	I_CL_MON_BASE
			会計月度基準
	<RETURNVALUE>
			年月の属する期間の終了日
	<HISTORY>
	**********************************************************/

	FUNCTION F_GET_YM_ST_DT_NE
	(
		I_YM IN MAPA_META.YM%TYPE,
		I_CL_DAY IN MAPA_META.CL_DAY%TYPE,
		I_CL_MON_BASE IN MAPA_META.CL_MON_BASE%TYPE
	)
	RETURN MAPA_META.DT%TYPE;
	/*********************************************************
	<SYNOPSIS>
			会計締日と会計月度基準から、年月の月度の開始日となる年月日を取得する。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_YM
			対象年月
	<IN>	I_CL_DAY
			会計締日
	<IN>	I_CL_MON_BASE
			会計月度基準
	<RETURNVALUE>
			年月の月度の開始日
	<HISTORY>
	**********************************************************/

	FUNCTION F_GET_YM_END_DT_NE
	(
		I_YM IN MAPA_META.YM%TYPE,
		I_CL_DAY IN MAPA_META.CL_DAY%TYPE,
		I_CL_MON_BASE IN MAPA_META.CL_MON_BASE%TYPE
	)
	RETURN MAPA_META.DT%TYPE;
	/*********************************************************
	<SYNOPSIS>
			会計締日と会計月度基準から、年月の月度の終了日となる年月日を取得する。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_YM
			対象年月
	<IN>	I_CL_DAY
			会計締日
	<IN>	I_CL_MON_BASE
			会計月度基準
	<RETURNVALUE>
			年月の月度の終了日
	<HISTORY>
	**********************************************************/

	FUNCTION F_GET_YM_ST_DT_NE
	(
		I_YM IN MAPA_META.YM%TYPE,
		I_PERIOD_TYP IN MAPA_META.PERIOD_TYP%TYPE,
		I_POS IN INTEGER,
		I_CL_DAY IN MAPA_META.CL_DAY%TYPE,
		I_CL_MON_BASE IN MAPA_META.CL_MON_BASE%TYPE
	)
	RETURN MAPA_META.DT%TYPE;
	/*********************************************************
	<SYNOPSIS>
			会計締日と会計月度基準から、年月の属する期間の開始位置の開始日となる年月日を取得する。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_YM
			対象年月
	<IN>	I_PERIOD_TYP
			期間区分
	<IN>	I_POS
			開始位置
	<IN>	I_CL_DAY
			会計締日
	<IN>	I_CL_MON_BASE
			会計月度基準
	<RETURNVALUE>
			年月の属する期間の開始位置の開始日
	<HISTORY>
	**********************************************************/

	FUNCTION F_GET_YM_END_DT_NE
	(
		I_YM IN MAPA_META.YM%TYPE,
		I_PERIOD_TYP IN MAPA_META.PERIOD_TYP%TYPE,
		I_POS IN INTEGER,
		I_CL_DAY IN MAPA_META.CL_DAY%TYPE,
		I_CL_MON_BASE IN MAPA_META.CL_MON_BASE%TYPE
	)
	RETURN MAPA_META.DT%TYPE;
	/*********************************************************
	<SYNOPSIS>
			会計締日と会計月度基準から、年月の属する期間の開始位置の終了日となる年月日を取得する。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_YM
			対象年月
	<IN>	I_PERIOD_TYP
			期間区分
	<IN>	I_POS
			開始位置
	<IN>	I_CL_DAY
			会計締日
	<IN>	I_CL_MON_BASE
			会計月度基準
	<RETURNVALUE>
			年月の属する期間の開始位置の終了日
	<HISTORY>
	**********************************************************/

	FUNCTION F_GET_AC_YM
	(
		I_DT IN MAPA_META.DT%TYPE
	)
	RETURN MAPA_META.YM%TYPE;
	/*********************************************************
	<SYNOPSIS>
			日付に対応する計上月度を取得する。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_DT
			対象日付
	<RETURNVALUE>
			計上月度
	<HISTORY>
	**********************************************************/
	FUNCTION F_GET_AC_YM
	(
		I_DT IN MAPA_META.DT%TYPE,
		I_CL_DAY MAPA_META.CL_DAY%TYPE,
		I_CL_MON_BASE MAPA_META.CL_MON_BASE%TYPE
	)
	RETURN MAPA_META.YM%TYPE;
	/*********************************************************
	<SYNOPSIS>
			日付に対応する計上月度を取得する。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_DT
			対象日付
	<IN>	I_CL_DAY
			会社マスタの会計締日
	<IN>	I_CL_MON_BASE
			会社マスタの会計月度基準
	<RETURNVALUE>
			計上月度
	<HISTORY>
	**********************************************************/
	FUNCTION F_CAL_DAYS
	(
		I_FR_DT IN MAPA_META.DT%TYPE ,
		I_TO_DT IN MAPA_META.DT%TYPE ,
		I_CAL_CD IN MAPA_META.CAL_CD%TYPE
	)
	RETURN NUMBER;
	/*********************************************************
	<SYNOPSIS>
			指定期間に含まれるカレンダの稼働日の日数を求める。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_FR_DT
			指定期間の開始日付
	<IN>	I_TO_DT
			指定期間の終了日付
	<IN>	I_CAL_CD
			カレンダコード
	<RETURNVALUE>
			稼働日の日数
	<HISTORY>
	**********************************************************/

	FUNCTION F_CAL_DATE_LT
	(
		I_BASE_DT IN MAPA_META.DT%TYPE ,
		I_LT IN MAPA_META.LT%TYPE ,
		I_FWD_FLG IN MAPA_META.FLG%TYPE DEFAULT '1',
		I_CAL_CD IN MAPA_META.CAL_CD%TYPE
	)
	RETURN MAPA_META.DT%TYPE;
	/*********************************************************
	<SYNOPSIS>
			カレンダの休日を考慮してリードタイム計算を行う。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_BASE_DT
			計算元の基準日付
	<IN>	I_LT
			リードタイム日数
	<IN>	I_FWD_FLG
			リードタイムが０で基準日付が休日のとき、直後の稼働日を返すか、直前の稼働日を返すかのＦＬＧ
			I_FWD_FLG='1'：直後の稼働日
			I_FWD_FLG='0'：直前の稼働日
	<IN>	I_CAL_CD
			カレンダコード
	<RETURNVALUE>
			リードタイム計算後の日付
	<HISTORY>
	**********************************************************/

	FUNCTION F_CAL_DATE
	(
		I_BASE_DT IN MAPA_META.DT%TYPE ,
		I_LT IN MAPA_META.LT%TYPE ,
		I_FWD_FLG IN MAPA_META.FLG%TYPE DEFAULT '1',
		I_CAL_CD IN MAPA_META.CAL_CD%TYPE,
		I_XFR_FLG IN MAPA_META.FLG%TYPE
	)
	RETURN MAPA_META.DT%TYPE;
	/*********************************************************
	<SYNOPSIS>
			カレンダの休日を考慮してリードタイム計算を行う。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_BASE_DT
			計算元の基準日付
	<IN>	I_LT
			リードタイム日数
	<IN>	I_FWD_FLG
			リードタイムが０で基準日付が休日のとき、直後の稼働日を返すか、直前の稼働日を返すかのＦＬＧ
			I_FWD_FLG='1'：直後の稼働日
			I_FWD_FLG='0'：直前の稼働日
	<IN>	I_CAL_CD
			カレンダコード
	<IN>	I_XFR_FLG
			移動用ＦＬＧ
			I_XFR_FLG='1'：休日をリードタイムに含めない（移動用）
			I_XFR_FLG='0'：休日をリードタイムに含める（製造用）
	<RETURNVALUE>
			リードタイム計算後の日付
	<HISTORY>
	**********************************************************/

	FUNCTION F_CAL_DATE_LOC
	(
		I_BASE_DT IN MAPA_META.DT%TYPE ,
		I_LT IN MAPA_META.LT%TYPE ,
		I_FWD_FLG IN MAPA_META.FLG%TYPE DEFAULT '1',
		I_LOC_CD IN MAPA_META.LOC_CD%TYPE,
		I_XFR_FLG IN MAPA_META.FLG%TYPE
	)
	RETURN MAPA_META.DT%TYPE;
	/*********************************************************
	<SYNOPSIS>
			場所コードからカレンダを取得し、カレンダの休日を考慮してリードタイム計算を行う。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_BASE_DT
			計算元の基準日付
	<IN>	I_LT
			リードタイム日数
	<IN>	I_FWD_FLG
			リードタイムが０で基準日付が休日のとき、直後の稼働日を返すか、直前の稼働日を返すかのＦＬＧ
			I_FWD_FLG='1'：直後の稼働日
			I_FWD_FLG='0'：直前の稼働日
	<IN>	I_LOC_CD
			場所コード
	<IN>	I_XFR_FLG
			移動用ＦＬＧ
			I_XFR_FLG='1'：休日をリードタイムに含めない（移動用）
			I_XFR_FLG='0'：休日をリードタイムに含める（製造用）
	<RETURNVALUE>
			リードタイム計算後の日付
	<HISTORY>
	**********************************************************/

	FUNCTION F_CAL_DATE_MOVE
	(
		I_BASE_DT IN MAPA_META.DT%TYPE ,
		I_LT IN MAPA_META.LT%TYPE ,
		I_FWD_FLG IN MAPA_META.FLG%TYPE DEFAULT '1',
		I_F_CAL_CD IN MAPA_META.CAL_CD%TYPE,
		I_F_LOC_CD IN MAPA_META.LOC_CD%TYPE,
		I_T_CAL_CD IN MAPA_META.CAL_CD%TYPE,
		I_T_LOC_CD IN MAPA_META.LOC_CD%TYPE
	)
	RETURN MAPA_META.DT%TYPE;
	/*********************************************************
	<SYNOPSIS>
			移動のリードタイム計算を行う。基準日付に対して
			移動元カレンダ（もしくは移動元場所）の稼働日を移動元の日付として、
			リードタイム計算を行い格納予定日を求める。
	<REMARKS>
			移動専用のリードタイム計算となり、基準日付に対して移動元カレンダ（もしくは移動元場所）
			の稼働日を移動元の日付として、リードタイム計算を行い格納予定日を求める
	<ARGUMENTS>
	<IN>	I_BASE_DT
			計算元の基準日付
	<IN>	I_LT
			リードタイム日数
	<IN>	I_FWD_FLG
			リードタイムが０で基準日付が休日のとき、直後の稼働日を返すか、直前の稼働日を返すかのＦＬＧ
			I_FWD_FLG='1'：直後の稼働日
			I_FWD_FLG='0'：直前の稼働日
	<IN>	I_F_CAL_CD
			移動元カレンダコード（NULLの場合、移動元場所コードが必須）
	<IN>	I_F_LOC_CD
			移動元場所コード
	<IN>	I_T_CAL_CD
			移動先カレンダコード（NULLの場合、移動先場所コードが必須）
	<IN>	I_T_LOC_CD
			移動先場所コード
	<RETURNVALUE>
			リードタイム計算後の日付
	<HISTORY>
	**********************************************************/

	FUNCTION F_TO_YM(
		I_DATE IN DATE
	)
	RETURN MAPA_META.YM%TYPE;
	/*********************************************************
	<SYNOPSIS>
			日付の「日」以降を切り捨てて、年月を返します。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_DATE
			日付
	<RETURNVALUE>
			年月
	<HISTORY>
	**********************************************************/

	FUNCTION F_TO_DATE (
		I_YM	IN MAPA_META.YM%TYPE,
		I_DAYS	IN NUMBER
	)
	RETURN DATE;
	/*********************************************************
	<SYNOPSIS>
			年月と日にちを合わせて日付にして返します。
	<REMARKS>
			引数の何れかがNULL、日にちが０以下、
			年月の最終日より大きい場合はNULLを返します。
	<ARGUMENTS>
	<IN>	I_YM
			年月
	<IN>	I_DAYS
			日にち
	<RETURNVALUE>
			日付
	<HISTORY>
	**********************************************************/

	FUNCTION F_IS_WRKDAY
	(
		I_DT IN MAPA_META.DT%TYPE,
		I_CAL_CD IN MAPA_META.CAL_CD%TYPE
	)
	RETURN MAPA_META.FLG%TYPE;
	/*********************************************************
	<SYNOPSIS>
			日付とカレンダＣＤから稼働日かどうかを判断する。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_DT
			日付
	<IN>	I_CAL_CD
			カレンダＣＤ
	<RETURNVALUE>
			'1'：稼働日、'0'：非稼動日（休日）
	<HISTORY>
	**********************************************************/

	FUNCTION F_IS_BEFORE_AFTER
	(
		I_DT1 IN MAPA_META.DT%TYPE,
		I_DT2 IN MAPA_META.DT%TYPE
	)
	RETURN MAPA_META.FLG%TYPE;
	/*********************************************************
	<SYNOPSIS>
			日時比較、対象日時のどちらかの時刻が00:00ならば、日付で比較。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_DT1
			本来小さい日時
	<IN>	I_DT2
			本来大きい日時
	<RETURNVALUE>
			'1'：正常、'0'：異常
	<HISTORY>
	**********************************************************/

END;

/
show errors;


CREATE OR REPLACE PACKAGE BODY          MAPA_DT
IS

	TYPE REC_TYPE1 IS RECORD (
		DT_FR MAPA_META.DT%TYPE,
		DT_TO MAPA_META.DT%TYPE
	);
   	TYPE TBL_TYPE_R1 IS TABLE OF REC_TYPE1 INDEX BY BINARY_INTEGER;

	FUNCTION F_TO_DAY_WEEK_TYP (
		I_DT		IN MAPA_META.DT%TYPE
	) RETURN MAPA_META.DAY_WEEK_TYP%TYPE
	/*********************************************************
	<SYNOPSIS>
			日付を曜日区分に変換する
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_DT
			日付
	<RETURNVALUE>
			曜日区分
	<HISTORY>
	**********************************************************/
	IS
		LT_TMP			NUMBER;
		LT_DAY_WEEK		MAPA_META.DAY_WEEK_TYP%TYPE;
	BEGIN
		
		LT_TMP := FCPA_DATE_UTIL.F_GET_WEEK_OF_DAY (I_DT);
		
		IF (LT_TMP = 1) THEN
			RETURN MAC_DAY_WEEK_TYP.SUN;
		ELSIF (LT_TMP = 2) THEN
			RETURN MAC_DAY_WEEK_TYP.MON;
		ELSIF (LT_TMP = 3) THEN
			RETURN MAC_DAY_WEEK_TYP.TUE;
		ELSIF (LT_TMP = 4) THEN
			RETURN MAC_DAY_WEEK_TYP.WED;
		ELSIF (LT_TMP = 5) THEN
			RETURN MAC_DAY_WEEK_TYP.THU;
		ELSIF (LT_TMP = 6) THEN
			RETURN MAC_DAY_WEEK_TYP.FRI;
		ELSIF (LT_TMP = 7) THEN
			RETURN MAC_DAY_WEEK_TYP.SAT;
		END IF;
		
		RETURN NULL;
		
	END F_TO_DAY_WEEK_TYP;

	FUNCTION F_GET_PERIOD_ST_DT_NE
	(
		I_DT IN MAPA_META.DT%TYPE,
		I_PERIOD_TYP IN MAPA_META.PERIOD_TYP%TYPE,
		I_CL_DAY IN MAPA_META.CL_DAY%TYPE
	)
	RETURN MAPA_META.DT%TYPE
	/*********************************************************
	<SYNOPSIS>
			会計締日から、対象日付の属する期間の開始日となる年月日を取得する。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_DT
			対象日付
	<IN>	I_PERIOD_TYP
			期間区分
	<IN>	I_CL_DAY
			会計締日
	<RETURNVALUE>
			対象日付の属する期間の開始日
	<HISTORY>
	**********************************************************/
	IS
		L_I			NUMBER;
		L_FIND		NUMBER;
		L_LDAY_FLG	NUMBER;
		L_DT_FR		MAPA_META.DT%TYPE;
		L_DT_TO		MAPA_META.DT%TYPE;
		L_CL_DT_FR	MAPA_META.DT%TYPE;
		L_CL_DT_TO	MAPA_META.DT%TYPE;
		L_DT_TMP	MAPA_META.DT%TYPE;
		L_WEEK_FR	MAPA_META.DT%TYPE;
		L_WEEK_TO	MAPA_META.DT%TYPE;
		L_TEN_D_FR	MAPA_META.DT%TYPE;
		L_TEN_D_TO	MAPA_META.DT%TYPE;
		L_BASE_YM	MAPA_META.YM%TYPE;
		L_LAST_DAY	MAPA_META.CL_DAY%TYPE;
		L_CL_DAY	MAPA_META.CL_DAY%TYPE;
	BEGIN
		IF	I_DT IS NULL OR
			I_PERIOD_TYP IS NULL OR
			I_CL_DAY IS NULL THEN
			RETURN NULL;
		END IF;

		-- 日次
		IF MAC_PERIOD_TYP.IS_DAILY(I_PERIOD_TYP) = '1' THEN
			RETURN I_DT;
		-- 月次
		ELSIF MAC_PERIOD_TYP.IS_MONTHLY(I_PERIOD_TYP) = '1' THEN
			-- 対象日付が対象範囲に入るように、対象月を前月からにする。
			L_BASE_YM := ADD_MONTHS(TRUNC(I_DT, 'MM'), -1);

			L_CL_DAY := LPAD(I_CL_DAY, 2, '0');
			L_LAST_DAY := TO_CHAR(LAST_DAY(L_BASE_YM), 'DD');
			IF L_CL_DAY > L_LAST_DAY THEN
				L_CL_DAY := L_LAST_DAY;
			END IF;

			L_CL_DT_FR := TO_DATE(TO_CHAR(L_BASE_YM, 'YYYYMM') ||
				'/' || L_CL_DAY, 'YYYYMM/DD') + 1;

			L_LDAY_FLG := 0;
			BEGIN
				IF I_CL_DAY = 99 THEN
					L_LDAY_FLG := 1;
					L_CL_DT_TO := LAST_DAY(ADD_MONTHS(L_BASE_YM, 1));
				ELSE
					L_CL_DT_TO := TO_DATE(TO_CHAR(ADD_MONTHS(L_BASE_YM, 1), 'YYYYMM') ||
						'/' || LPAD(I_CL_DAY, 2, '0'), 'YYYYMM/DD');
				END IF;
			EXCEPTION
				-- 存在しない日付でエラーになった場合、末日を設定
				WHEN OTHERS THEN
					L_LDAY_FLG := 1;
					L_CL_DT_TO := LAST_DAY(ADD_MONTHS(L_BASE_YM, 1));
			END;

			L_FIND := 0;
			WHILE (L_FIND = 0) LOOP
				IF I_DT >= L_CL_DT_FR AND I_DT <= L_CL_DT_TO THEN
					L_FIND := 1;
					EXIT;
				END IF;

				L_CL_DT_FR := L_CL_DT_TO + 1;

				IF L_LDAY_FLG = 1 THEN
					L_CL_DT_TO := LAST_DAY(ADD_MONTHS(L_BASE_YM, 1));
				ELSE
					L_CL_DT_TO := ADD_MONTHS(L_CL_DT_TO, 1);
				END IF;
			END LOOP;

			RETURN L_CL_DT_FR;
		-- 週次
		ELSIF MAC_PERIOD_TYP.IS_WEEKLY(I_PERIOD_TYP) = '1' THEN
			-- 対象日付以前の日曜日を返却（対象日付が日曜日であれば、対象日付を返却）
			RETURN FCPA_DATE_UTIL.F_NEXT_DAY(I_DT - 7, 1);

		-- 旬次
		ELSIF MAC_PERIOD_TYP.IS_TENDAYS(I_PERIOD_TYP) = '1' THEN
			-- 対象日付が対象範囲に入るように、対象月を前月からにする。
			L_BASE_YM := ADD_MONTHS(TRUNC(I_DT, 'MM'), -1);

			L_CL_DAY := LPAD(I_CL_DAY, 2, '0');
			L_LAST_DAY := TO_CHAR(LAST_DAY(L_BASE_YM), 'DD');
			IF L_CL_DAY > L_LAST_DAY THEN
				L_CL_DAY := L_LAST_DAY;
			END IF;

			L_CL_DT_FR := TO_DATE(TO_CHAR(L_BASE_YM, 'YYYYMM') || '/' || L_CL_DAY, 'YYYYMM/DD') + 1;

			L_LDAY_FLG := 0;
			BEGIN
				IF I_CL_DAY = 99 THEN
					L_LDAY_FLG := 1;
					L_CL_DT_TO := LAST_DAY(ADD_MONTHS(L_BASE_YM, 1));
				ELSE
					L_CL_DT_TO := TO_DATE(TO_CHAR(ADD_MONTHS(L_BASE_YM, 1), 'YYYYMM') ||
						'/' || LPAD(I_CL_DAY, 2, '0'), 'YYYYMM/DD');
				END IF;
			EXCEPTION
				-- 存在しない日付でエラーになった場合、末日を設定
				WHEN OTHERS THEN
					L_LDAY_FLG := 1;
					L_CL_DT_TO := LAST_DAY(ADD_MONTHS(L_BASE_YM, 1));
			END;

			L_FIND := 0;
			WHILE (L_FIND = 0) LOOP
				IF I_DT >= L_CL_DT_FR AND I_DT <= L_CL_DT_TO THEN
					L_FIND := 1;
					EXIT;
				END IF;

				L_CL_DT_FR := L_CL_DT_TO + 1;

				IF L_LDAY_FLG = 1 THEN
					L_CL_DT_TO := LAST_DAY(ADD_MONTHS(L_BASE_YM, 1));
				ELSE
					L_CL_DT_TO := ADD_MONTHS(L_CL_DT_TO, 1);
				END IF;
			END LOOP;

			-- 対象日付が属する旬の開始日の年月日取得
			L_I := 1;
			L_TEN_D_FR := L_CL_DT_FR;
			L_TEN_D_TO := L_CL_DT_FR + 9;
			WHILE (L_I <= 3) LOOP
				IF I_DT < L_TEN_D_FR OR I_DT > L_TEN_D_TO THEN
					L_TEN_D_FR := L_TEN_D_TO + 1;
					IF L_I = 1 THEN
						L_TEN_D_TO := L_TEN_D_FR + 9;
					ELSE
						L_TEN_D_TO := L_CL_DT_TO;
					END IF;
					L_I := L_I + 1;
				ELSE
					EXIT;
				END IF;
			END LOOP;

			RETURN L_TEN_D_FR;
		ELSE
			RETURN NULL;
		END IF;

	END F_GET_PERIOD_ST_DT_NE;

	FUNCTION F_GET_PERIOD_END_DT_NE
	(
		I_DT IN MAPA_META.DT%TYPE,
		I_PERIOD_TYP IN MAPA_META.PERIOD_TYP%TYPE,
		I_CL_DAY IN MAPA_META.CL_DAY%TYPE
	)
	RETURN MAPA_META.DT%TYPE
	/*********************************************************
	<SYNOPSIS>
			会計締日から、対象日付の属する期間の終了日となる年月日を取得する。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_DT
			対象日付
	<IN>	I_PERIOD_TYP
			期間区分
	<IN>	I_CL_DAY
			会計締日
	<RETURNVALUE>
			対象日付の属する期間の終了日
	<HISTORY>
	**********************************************************/
	IS
		L_I			NUMBER;
		L_FIND		NUMBER;
		L_LDAY_FLG	NUMBER;
		L_TBK		VARCHAR2(10);
		L_DT_FR		MAPA_META.DT%TYPE;
		L_DT_TO		MAPA_META.DT%TYPE;
		L_CL_DT_FR	MAPA_META.DT%TYPE;
		L_CL_DT_TO	MAPA_META.DT%TYPE;
		L_DT_TMP	MAPA_META.DT%TYPE;
		L_WEEK_FR	MAPA_META.DT%TYPE;
		L_WEEK_TO	MAPA_META.DT%TYPE;
		L_TEN_D_FR	MAPA_META.DT%TYPE;
		L_TEN_D_TO	MAPA_META.DT%TYPE;
		L_BASE_YM	MAPA_META.YM%TYPE;
		L_LAST_DAY	MAPA_META.CL_DAY%TYPE;
		L_CL_DAY	MAPA_META.CL_DAY%TYPE;
	BEGIN
		IF	I_DT IS NULL OR
			I_PERIOD_TYP IS NULL OR
			I_CL_DAY IS NULL THEN
			RETURN NULL;
		END IF;

		-- 日次
		IF MAC_PERIOD_TYP.IS_DAILY(I_PERIOD_TYP) = '1' THEN
			RETURN I_DT;
		-- 月次
		ELSIF MAC_PERIOD_TYP.IS_MONTHLY(I_PERIOD_TYP) = '1' THEN
			-- 対象日付が対象範囲に入るように、対象月を前月からにする。
			L_BASE_YM := ADD_MONTHS(TRUNC(I_DT, 'MM'), -1);

			L_CL_DAY := LPAD(I_CL_DAY, 2, '0');
			L_LAST_DAY := TO_CHAR(LAST_DAY(L_BASE_YM), 'DD');
			IF L_CL_DAY > L_LAST_DAY THEN
				L_CL_DAY := L_LAST_DAY;
			END IF;

			L_CL_DT_FR := TO_DATE(TO_CHAR(L_BASE_YM, 'YYYYMM') ||
				'/' || L_CL_DAY, 'YYYYMM/DD') + 1;

			L_LDAY_FLG := 0;
			BEGIN
				IF I_CL_DAY = 99 THEN
					L_LDAY_FLG := 1;
					L_CL_DT_TO := LAST_DAY(ADD_MONTHS(L_BASE_YM, 1));
				ELSE
					L_CL_DT_TO := TO_DATE(TO_CHAR(ADD_MONTHS(L_BASE_YM, 1), 'YYYYMM') ||
						'/' || LPAD(I_CL_DAY, 2, '0'), 'YYYYMM/DD');
				END IF;
			EXCEPTION
				-- 存在しない日付でエラーになった場合、末日を設定
				WHEN OTHERS THEN
					L_LDAY_FLG := 1;
					L_CL_DT_TO := LAST_DAY(ADD_MONTHS(L_BASE_YM, 1));
			END;

			L_FIND := 0;
			WHILE (L_FIND = 0) LOOP
				IF I_DT >= L_CL_DT_FR AND I_DT <= L_CL_DT_TO THEN
					L_FIND := 1;
					EXIT;
				END IF;

				L_CL_DT_FR := L_CL_DT_TO + 1;

				IF L_LDAY_FLG = 1 THEN
					L_CL_DT_TO := LAST_DAY(ADD_MONTHS(L_BASE_YM, 1));
				ELSE
					L_CL_DT_TO := ADD_MONTHS(L_CL_DT_TO, 1);
				END IF;
			END LOOP;

			RETURN L_CL_DT_TO;
		-- 週次
		ELSIF MAC_PERIOD_TYP.IS_WEEKLY(I_PERIOD_TYP) = '1' THEN
			-- 対象日付以降の土曜日を返却（対象日付が土曜日であれば、対象日付を返却）
			IF FCPA_DATE_UTIL.F_GET_WEEK_OF_DAY(I_DT) = '7' THEN
				RETURN I_DT;
			ELSE
				RETURN FCPA_DATE_UTIL.F_NEXT_DAY(I_DT, 7);
			END IF;

		-- 旬次
		ELSIF MAC_PERIOD_TYP.IS_TENDAYS(I_PERIOD_TYP) = '1' THEN
			-- 対象日付が対象範囲に入るように、対象月を前月からにする。
			L_BASE_YM := ADD_MONTHS(TRUNC(I_DT, 'MM'), -1);

			L_CL_DAY := LPAD(I_CL_DAY, 2, '0');
			L_LAST_DAY := TO_CHAR(LAST_DAY(L_BASE_YM), 'DD');
			IF L_CL_DAY > L_LAST_DAY THEN
				L_CL_DAY := L_LAST_DAY;
			END IF;

			L_CL_DT_FR := TO_DATE(TO_CHAR(L_BASE_YM, 'YYYYMM') || '/' || L_CL_DAY, 'YYYYMM/DD') + 1;

			L_LDAY_FLG := 0;
			BEGIN
				IF I_CL_DAY = 99 THEN
					L_LDAY_FLG := 1;
					L_CL_DT_TO := LAST_DAY(ADD_MONTHS(L_BASE_YM, 1));
				ELSE
					L_CL_DT_TO := TO_DATE(TO_CHAR(ADD_MONTHS(L_BASE_YM, 1), 'YYYYMM') ||
						'/' || LPAD(I_CL_DAY, 2, '0'), 'YYYYMM/DD');
				END IF;
			EXCEPTION
				-- 存在しない日付でエラーになった場合、末日を設定
				WHEN OTHERS THEN
					L_LDAY_FLG := 1;
					L_CL_DT_TO := LAST_DAY(ADD_MONTHS(L_BASE_YM, 1));
			END;

			L_FIND := 0;
			WHILE (L_FIND = 0) LOOP
				IF I_DT >= L_CL_DT_FR AND I_DT <= L_CL_DT_TO THEN
					L_FIND := 1;
					EXIT;
				END IF;

				L_CL_DT_FR := L_CL_DT_TO + 1;

				IF L_LDAY_FLG = 1 THEN
					L_CL_DT_TO := LAST_DAY(ADD_MONTHS(L_BASE_YM, 1));
				ELSE
					L_CL_DT_TO := ADD_MONTHS(L_CL_DT_TO, 1);
				END IF;
			END LOOP;

			-- 対象日付が属する旬の終了日の年月日取得
			L_I := 1;
			L_TEN_D_FR := L_CL_DT_FR;
			L_TEN_D_TO := L_CL_DT_FR + 9;
			WHILE (L_I <= 3) LOOP
				IF I_DT < L_TEN_D_FR OR I_DT > L_TEN_D_TO THEN
					L_TEN_D_FR := L_TEN_D_TO + 1;
					IF L_I = 1 THEN
						L_TEN_D_TO := L_TEN_D_FR + 9;
					ELSE
						L_TEN_D_TO := L_CL_DT_TO;
					END IF;
					L_I := L_I + 1;
				ELSE
					EXIT;
				END IF;
			END LOOP;

			RETURN L_TEN_D_TO;
		ELSE
			RETURN NULL;
		END IF;

	END F_GET_PERIOD_END_DT_NE;

	FUNCTION F_ADD_PERIOD_ST_DT_NE
	(
		I_DT IN MAPA_META.DT%TYPE,
		I_PERIOD_TYP IN MAPA_META.PERIOD_TYP%TYPE,
		I_ADD IN INTEGER,
		I_CL_DAY IN MAPA_META.CL_DAY%TYPE
	)
	RETURN MAPA_META.DT%TYPE
	/*********************************************************
	<SYNOPSIS>
			会計締日から、対象日付の属する期間の開始日から加算期間先の開始日となる年月日を取得する。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_DT
			対象日付
	<IN>	I_PERIOD_TYP
			期間区分
	<IN>	I_ADD
			加算期間
	<IN>	I_CL_DAY
			会計締日
	<RETURNVALUE>
			対象日付の属する期間の開始日から加算期間先の開始日
	<HISTORY>
	**********************************************************/
	IS
		L_I			NUMBER;
		L_DT		MAPA_META.DT%TYPE;
		L_DT_FR		MAPA_META.DT%TYPE;
		L_WEEK_FR	MAPA_META.DT%TYPE;
		L_TEN_D_FR	MAPA_META.DT%TYPE;
		L_TEN_D_TO	MAPA_META.DT%TYPE;
	BEGIN
		IF	I_DT IS NULL OR
			I_PERIOD_TYP IS NULL OR
			I_ADD IS NULL OR
			I_CL_DAY IS NULL THEN
			RETURN NULL;
		END IF;

		-- 日次
		IF MAC_PERIOD_TYP.IS_DAILY(I_PERIOD_TYP) = '1' THEN
			RETURN I_DT + I_ADD;
		-- 月次
		ELSIF MAC_PERIOD_TYP.IS_MONTHLY(I_PERIOD_TYP) = '1' THEN
			L_DT_FR := I_DT;
			L_DT_FR := F_GET_PERIOD_ST_DT_NE(L_DT_FR, I_PERIOD_TYP, I_CL_DAY);
			L_DT_FR := ADD_MONTHS(L_DT_FR, I_ADD);
			RETURN L_DT_FR;
		-- 週次
		ELSIF MAC_PERIOD_TYP.IS_WEEKLY(I_PERIOD_TYP) = '1' THEN
			L_DT := I_DT + (I_ADD * 7);
			L_WEEK_FR := F_GET_PERIOD_ST_DT_NE(L_DT, I_PERIOD_TYP, I_CL_DAY);
			RETURN L_WEEK_FR;
		-- 旬次
		ELSIF MAC_PERIOD_TYP.IS_TENDAYS(I_PERIOD_TYP) = '1' THEN
			L_I := 0;
			L_DT := I_DT;
			IF I_ADD >= 0 THEN
				WHILE (L_I <= I_ADD) LOOP
					L_TEN_D_FR := F_GET_PERIOD_ST_DT_NE(L_DT, I_PERIOD_TYP, I_CL_DAY);
					L_TEN_D_TO := F_GET_PERIOD_END_DT_NE(L_DT, I_PERIOD_TYP, I_CL_DAY);
					L_DT := L_TEN_D_TO + 1;
					L_I := L_I + 1;
				END LOOP;
			ELSE
				WHILE (L_I >= I_ADD) LOOP
					L_TEN_D_FR := F_GET_PERIOD_ST_DT_NE(L_DT, I_PERIOD_TYP, I_CL_DAY);
					L_DT := L_TEN_D_FR - 1;
					L_I := L_I - 1;
				END LOOP;
			END IF;
			RETURN L_TEN_D_FR;
		ELSE
			RETURN NULL;
		END IF;

	END F_ADD_PERIOD_ST_DT_NE;

	FUNCTION F_ADD_PERIOD_END_DT_NE
	(
		I_DT IN MAPA_META.DT%TYPE,
		I_PERIOD_TYP IN MAPA_META.PERIOD_TYP%TYPE,
		I_ADD IN INTEGER,
		I_CL_DAY IN MAPA_META.CL_DAY%TYPE
	)
	RETURN MAPA_META.DT%TYPE
	/*********************************************************
	<SYNOPSIS>
			会計締日から、対象日付の属する期間の開始日から加算期間先の終了日となる年月日を取得する。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_DT
			対象日付
	<IN>	I_PERIOD_TYP
			期間区分
	<IN>	I_ADD
			加算期間
	<IN>	I_CL_DAY
			会計締日
	<RETURNVALUE>
			対象日付の属する期間の終了日から加算期間先の終了日
	<HISTORY>
	**********************************************************/
	IS
		L_I			NUMBER;
		L_DT		MAPA_META.DT%TYPE;
		L_DT_TO		MAPA_META.DT%TYPE;
		L_WEEK_TO	MAPA_META.DT%TYPE;
		L_TEN_D_FR	MAPA_META.DT%TYPE;
		L_TEN_D_TO	MAPA_META.DT%TYPE;
	BEGIN
		IF	I_DT IS NULL OR
			I_PERIOD_TYP IS NULL OR
			I_ADD IS NULL OR
			I_CL_DAY IS NULL THEN
			RETURN NULL;
		END IF;

		-- 日次
		IF MAC_PERIOD_TYP.IS_DAILY(I_PERIOD_TYP) = '1' THEN
			RETURN I_DT + I_ADD;
		-- 月次
		ELSIF MAC_PERIOD_TYP.IS_MONTHLY(I_PERIOD_TYP) = '1' THEN
			L_DT_TO := I_DT;
			L_DT_TO := F_GET_PERIOD_END_DT_NE(L_DT_TO, I_PERIOD_TYP, I_CL_DAY);
			L_DT_TO := ADD_MONTHS(L_DT_TO, I_ADD);
			RETURN L_DT_TO;
		-- 週次
		ELSIF MAC_PERIOD_TYP.IS_WEEKLY(I_PERIOD_TYP) = '1' THEN
			L_DT := I_DT + (I_ADD * 7);
			L_WEEK_TO := F_GET_PERIOD_END_DT_NE(L_DT, I_PERIOD_TYP, I_CL_DAY);
			RETURN L_WEEK_TO;
		-- 旬次
		ELSIF MAC_PERIOD_TYP.IS_TENDAYS(I_PERIOD_TYP) = '1' THEN
			L_I := 0;
			L_DT := I_DT;
			IF I_ADD >= 0 THEN
				WHILE (L_I <= I_ADD) LOOP
					L_TEN_D_TO := F_GET_PERIOD_END_DT_NE(L_DT, I_PERIOD_TYP, I_CL_DAY);
					L_DT := L_TEN_D_TO + 1;
					L_I := L_I + 1;
				END LOOP;
			ELSE
				WHILE (L_I >= I_ADD) LOOP
					L_TEN_D_FR := F_GET_PERIOD_ST_DT_NE(L_DT, I_PERIOD_TYP, I_CL_DAY);
					L_TEN_D_TO := F_GET_PERIOD_END_DT_NE(L_DT, I_PERIOD_TYP, I_CL_DAY);
					L_DT := L_TEN_D_FR - 1;
					L_I := L_I - 1;
				END LOOP;
			END IF;
			RETURN L_TEN_D_TO;
		ELSE
			RETURN NULL;
		END IF;

	END F_ADD_PERIOD_END_DT_NE;

	FUNCTION F_GET_YM_ST_DT_NE
	(
		I_YM IN MAPA_META.YM%TYPE,
		I_PERIOD_TYP IN MAPA_META.PERIOD_TYP%TYPE,
		I_CL_DAY IN MAPA_META.CL_DAY%TYPE,
		I_CL_MON_BASE IN MAPA_META.CL_MON_BASE%TYPE
	)
	RETURN MAPA_META.DT%TYPE
	/*********************************************************
	<SYNOPSIS>
			会計締日と会計月度基準から、年月の属する期間の開始日となる年月日を取得する。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_YM
			対象年月
	<IN>	I_PERIOD_TYP
			期間区分
	<IN>	I_CL_DAY
			会計締日
	<IN>	I_CL_MON_BASE
			会計月度基準
	<RETURNVALUE>
			年月の属する期間の開始日
	<HISTORY>
	**********************************************************/
	IS
		L_DT_FR		MAPA_META.DT%TYPE;
		L_CL_DT_FR	MAPA_META.DT%TYPE;
		L_WEEK_FR	MAPA_META.DT%TYPE;
		L_TEN_D_FR	MAPA_META.DT%TYPE;
		L_BASE_YM	MAPA_META.YM%TYPE;
		L_LAST_DAY	MAPA_META.CL_DAY%TYPE;
		L_CL_DAY	MAPA_META.CL_DAY%TYPE;
	BEGIN
		IF	I_YM IS NULL OR
			I_PERIOD_TYP IS NULL OR
			I_CL_DAY IS NULL OR
			I_CL_MON_BASE IS NULL THEN
			RETURN NULL;
		END IF;

		-- 日次
		IF MAC_PERIOD_TYP.IS_DAILY(I_PERIOD_TYP) = '1' THEN
			RETURN I_YM;
		-- 月次
		ELSIF MAC_PERIOD_TYP.IS_MONTHLY(I_PERIOD_TYP) = '1' THEN
			L_BASE_YM := I_YM;
			IF I_CL_MON_BASE = 0 THEN
				L_BASE_YM := ADD_MONTHS(L_BASE_YM, -1);
			END IF;

			L_CL_DAY := LPAD(I_CL_DAY, 2, '0');
			L_LAST_DAY := TO_CHAR(LAST_DAY(L_BASE_YM), 'DD');
			IF L_CL_DAY > L_LAST_DAY THEN
				L_CL_DAY := L_LAST_DAY;
			END IF;

			L_CL_DT_FR := TO_DATE(TO_CHAR(L_BASE_YM, 'YYYYMM') ||
				'/' || L_CL_DAY, 'YYYYMM/DD') + 1;

			RETURN L_CL_DT_FR;
		-- 週次
		ELSIF MAC_PERIOD_TYP.IS_WEEKLY(I_PERIOD_TYP) = '1' THEN
			L_BASE_YM := I_YM;
			IF I_CL_MON_BASE = 0 THEN
				L_BASE_YM := ADD_MONTHS(L_BASE_YM, -1);
			END IF;

			L_CL_DAY := LPAD(I_CL_DAY, 2, '0');
			L_LAST_DAY := TO_CHAR(LAST_DAY(L_BASE_YM), 'DD');
			IF L_CL_DAY > L_LAST_DAY THEN
				L_CL_DAY := L_LAST_DAY;
			END IF;

			L_WEEK_FR := FCPA_DATE_UTIL.F_NEXT_DAY(TO_DATE(TO_CHAR(L_BASE_YM, 'YYYYMM') ||
				'/' || L_CL_DAY, 'YYYYMM/DD'), 1);

			RETURN L_WEEK_FR;
		-- 旬次
		ELSIF MAC_PERIOD_TYP.IS_TENDAYS(I_PERIOD_TYP) = '1' THEN
			L_BASE_YM := I_YM;
			IF I_CL_MON_BASE = 0 THEN
				L_BASE_YM := ADD_MONTHS(L_BASE_YM, -1);
			END IF;

			L_CL_DAY := LPAD(I_CL_DAY, 2, '0');
			L_LAST_DAY := TO_CHAR(LAST_DAY(L_BASE_YM), 'DD');
			IF L_CL_DAY > L_LAST_DAY THEN
				L_CL_DAY := L_LAST_DAY;
			END IF;

			L_TEN_D_FR := TO_DATE(TO_CHAR(L_BASE_YM, 'YYYYMM') || '/' || L_CL_DAY, 'YYYYMM/DD') + 1;

			RETURN L_TEN_D_FR;
		ELSE
			RETURN NULL;
		END IF;

	END F_GET_YM_ST_DT_NE;

	FUNCTION F_GET_YM_END_DT_NE
	(
		I_YM IN MAPA_META.YM%TYPE,
		I_PERIOD_TYP IN MAPA_META.PERIOD_TYP%TYPE,
		I_CL_DAY IN MAPA_META.CL_DAY%TYPE,
		I_CL_MON_BASE IN MAPA_META.CL_MON_BASE%TYPE
	)
	RETURN MAPA_META.DT%TYPE
	/*********************************************************
	<SYNOPSIS>
			会計締日と会計月度基準から、年月の属する期間の終了日となる年月日を取得する。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_YM
			対象年月
	<IN>	I_PERIOD_TYP
			期間区分
	<IN>	I_CL_DAY
			会計締日
	<IN>	I_CL_MON_BASE
			会計月度基準
	<RETURNVALUE>
			年月の属する期間の終了日
	<HISTORY>
	**********************************************************/
	IS
		L_FIND		NUMBER;
		L_DT_TO		MAPA_META.DT%TYPE;
		L_CL_DT_FR	MAPA_META.DT%TYPE;
		L_CL_DT_TO	MAPA_META.DT%TYPE;
		L_WEEK_FR	MAPA_META.DT%TYPE;
		L_WEEK_TO	MAPA_META.DT%TYPE;
		L_TEN_D_TO	MAPA_META.DT%TYPE;
		L_BASE_YM	MAPA_META.YM%TYPE;
		L_LAST_DAY	MAPA_META.CL_DAY%TYPE;
		L_CL_DAY	MAPA_META.CL_DAY%TYPE;
	BEGIN
		IF	I_YM IS NULL OR
			I_PERIOD_TYP IS NULL OR
			I_CL_DAY IS NULL OR
			I_CL_MON_BASE IS NULL THEN
			RETURN NULL;
		END IF;

		-- 日次
		IF MAC_PERIOD_TYP.IS_DAILY(I_PERIOD_TYP) = '1' THEN
			RETURN I_YM;
		-- 月次
		ELSIF MAC_PERIOD_TYP.IS_MONTHLY(I_PERIOD_TYP) = '1' THEN
			L_BASE_YM := I_YM;
			IF I_CL_MON_BASE = 0 THEN
				L_BASE_YM := ADD_MONTHS(L_BASE_YM, -1);
			END IF;

			L_CL_DAY := LPAD(I_CL_DAY, 2, '0');
			L_LAST_DAY := TO_CHAR(LAST_DAY(L_BASE_YM), 'DD');
			IF L_CL_DAY > L_LAST_DAY THEN
				L_CL_DAY := L_LAST_DAY;
			END IF;

			BEGIN
				IF I_CL_DAY = 99 THEN
					L_CL_DT_TO := LAST_DAY(ADD_MONTHS(L_BASE_YM, 1));
				ELSE
					L_CL_DT_TO := TO_DATE(TO_CHAR(ADD_MONTHS(L_BASE_YM, 1), 'YYYYMM') ||
						'/' || I_CL_DAY, 'YYYYMM/DD');
				END IF;
			EXCEPTION
				-- 存在しない日付でエラーになった場合、末日を設定
				WHEN OTHERS THEN
					L_CL_DT_TO := LAST_DAY(ADD_MONTHS(L_BASE_YM, 1));
			END;

			RETURN L_CL_DT_TO;
		-- 週次
		ELSIF MAC_PERIOD_TYP.IS_WEEKLY(I_PERIOD_TYP) = '1' THEN
			L_BASE_YM := I_YM;
			IF I_CL_MON_BASE = 0 THEN
				L_BASE_YM := ADD_MONTHS(L_BASE_YM, -1);
			END IF;

			L_CL_DAY := LPAD(I_CL_DAY, 2, '0');
			L_LAST_DAY := TO_CHAR(LAST_DAY(L_BASE_YM), 'DD');
			IF L_CL_DAY > L_LAST_DAY THEN
				L_CL_DAY := L_LAST_DAY;
			END IF;

			L_CL_DT_FR := FCPA_DATE_UTIL.F_NEXT_DAY(TO_DATE(TO_CHAR(L_BASE_YM, 'YYYYMM') ||
				'/' || L_CL_DAY, 'YYYYMM/DD'), 1);

			BEGIN
				IF I_CL_DAY = 99 THEN
					L_CL_DT_TO := LAST_DAY(ADD_MONTHS(L_BASE_YM, 1));
				ELSE
					L_CL_DT_TO := TO_DATE(TO_CHAR(ADD_MONTHS(L_BASE_YM, 1), 'YYYYMM') ||
						'/' || I_CL_DAY, 'YYYYMM/DD');
				END IF;
			EXCEPTION
				-- 存在しない日付でエラーになった場合、末日を設定
				WHEN OTHERS THEN
					L_CL_DT_TO := LAST_DAY(ADD_MONTHS(L_BASE_YM, 1));
			END;

			L_FIND := 0;
			L_WEEK_FR := L_CL_DT_FR;
			L_WEEK_TO := L_CL_DT_FR + 6;
			WHILE (L_FIND = 0) LOOP
				IF L_CL_DT_TO >= L_WEEK_FR AND L_CL_DT_TO <= L_WEEK_TO THEN
					L_FIND := 1;
					EXIT;
				ELSE
					L_WEEK_FR := FCPA_DATE_UTIL.F_NEXT_DAY(L_WEEK_TO, 1);
					L_WEEK_TO := L_WEEK_FR + 6;
				END IF;
			END LOOP;

			RETURN L_WEEK_TO;
		-- 旬次
		ELSIF MAC_PERIOD_TYP.IS_TENDAYS(I_PERIOD_TYP) = '1' THEN
			L_BASE_YM := I_YM;
			IF I_CL_MON_BASE = 0 THEN
				L_BASE_YM := ADD_MONTHS(L_BASE_YM, -1);
			END IF;

			L_CL_DAY := LPAD(I_CL_DAY, 2, '0');
			L_LAST_DAY := TO_CHAR(LAST_DAY(L_BASE_YM), 'DD');
			IF L_CL_DAY > L_LAST_DAY THEN
				L_CL_DAY := L_LAST_DAY;
			END IF;

			BEGIN
				IF I_CL_DAY = 99 THEN
					L_TEN_D_TO := LAST_DAY(ADD_MONTHS(L_BASE_YM, 1));
				ELSE
					L_TEN_D_TO := TO_DATE(TO_CHAR(ADD_MONTHS(L_BASE_YM, 1), 'YYYYMM') ||
						'/' || I_CL_DAY, 'YYYYMM/DD');
				END IF;
			EXCEPTION
				-- 存在しない日付でエラーになった場合、末日を設定
				WHEN OTHERS THEN
					L_TEN_D_TO := LAST_DAY(ADD_MONTHS(L_BASE_YM, 1));
			END;

			RETURN L_TEN_D_TO;
		ELSE
			RETURN NULL;
		END IF;

	END F_GET_YM_END_DT_NE;

	FUNCTION F_GET_YM_ST_DT_NE
	(
		I_YM IN MAPA_META.YM%TYPE,
		I_CL_DAY IN MAPA_META.CL_DAY%TYPE,
		I_CL_MON_BASE IN MAPA_META.CL_MON_BASE%TYPE
	)
	RETURN MAPA_META.DT%TYPE
	/*********************************************************
	<SYNOPSIS>
			会計締日と会計月度基準から、年月の月度の開始日となる年月日を取得する。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_YM
			対象年月
	<IN>	I_CL_DAY
			会計締日
	<IN>	I_CL_MON_BASE
			会計月度基準
	<RETURNVALUE>
			年月の月度の開始日
	<HISTORY>
	**********************************************************/
	IS
	BEGIN
		IF	I_YM IS NULL OR
			I_CL_DAY IS NULL OR
			I_CL_MON_BASE IS NULL THEN
			RETURN NULL;
		END IF;

		RETURN F_GET_YM_ST_DT_NE(I_YM, MAC_PERIOD_TYP.MONTHLY, I_CL_DAY, I_CL_MON_BASE);

	END F_GET_YM_ST_DT_NE;

	FUNCTION F_GET_YM_END_DT_NE
	(
		I_YM IN MAPA_META.YM%TYPE,
		I_CL_DAY IN MAPA_META.CL_DAY%TYPE,
		I_CL_MON_BASE IN MAPA_META.CL_MON_BASE%TYPE
	)
	RETURN MAPA_META.DT%TYPE
	/*********************************************************
	<SYNOPSIS>
			会計締日と会計月度基準から、年月の月度の終了日となる年月日を取得する。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_YM
			対象年月
	<IN>	I_CL_DAY
			会計締日
	<IN>	I_CL_MON_BASE
			会計月度基準
	<RETURNVALUE>
			年月の月度の終了日
	<HISTORY>
	**********************************************************/
	IS
	BEGIN
		IF	I_YM IS NULL OR
			I_CL_DAY IS NULL OR
			I_CL_MON_BASE IS NULL THEN
			RETURN NULL;
		END IF;

		RETURN F_GET_YM_END_DT_NE(I_YM, MAC_PERIOD_TYP.MONTHLY, I_CL_DAY, I_CL_MON_BASE);

	END F_GET_YM_END_DT_NE;

	FUNCTION F_GET_YM_ST_DT_NE
	(
		I_YM IN MAPA_META.YM%TYPE,
		I_PERIOD_TYP IN MAPA_META.PERIOD_TYP%TYPE,
		I_POS IN INTEGER,
		I_CL_DAY IN MAPA_META.CL_DAY%TYPE,
		I_CL_MON_BASE IN MAPA_META.CL_MON_BASE%TYPE
	)
	RETURN MAPA_META.DT%TYPE
	/*********************************************************
	<SYNOPSIS>
			会計締日と会計月度基準から、年月の属する期間の開始位置の開始日となる年月日を取得する。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_YM
			対象年月
	<IN>	I_PERIOD_TYP
			期間区分
	<IN>	I_POS
			開始位置
	<IN>	I_CL_DAY
			会計締日
	<IN>	I_CL_MON_BASE
			会計月度基準
	<RETURNVALUE>
			年月の属する期間の開始位置の開始日
	<HISTORY>
	**********************************************************/
	IS
		DT_LST TBL_TYPE_R1;

		L_I			NUMBER;
		L_CNT		INTEGER;
		L_CL_DT_FR	MAPA_META.DT%TYPE;
		L_CL_DT_TO	MAPA_META.DT%TYPE;
		L_DT_TMP	MAPA_META.DT%TYPE;
		L_DT_FR		MAPA_META.DT%TYPE;
		L_DT_TO		MAPA_META.DT%TYPE;
		L_BASE_YM	MAPA_META.YM%TYPE;
	BEGIN
		IF	I_YM IS NULL OR
			I_PERIOD_TYP IS NULL OR
			I_POS IS NULL OR
			I_CL_DAY IS NULL OR
			I_CL_MON_BASE IS NULL THEN
			RETURN NULL;
		END IF;

		-- 月次
		IF MAC_PERIOD_TYP.IS_MONTHLY(I_PERIOD_TYP) = '1' THEN
			IF I_POS = 1 THEN
				RETURN F_GET_YM_ST_DT_NE(I_YM, I_PERIOD_TYP, I_CL_DAY, I_CL_MON_BASE);
			ELSE
				RETURN NULL;
			END IF;
		-- 週次
		ELSIF MAC_PERIOD_TYP.IS_WEEKLY(I_PERIOD_TYP) = '1' THEN
			IF I_POS < 1 OR I_POS > 5 THEN
				RETURN NULL;
			END IF;

			L_CL_DT_FR := F_GET_YM_ST_DT_NE(I_YM, I_PERIOD_TYP, I_CL_DAY, I_CL_MON_BASE);
			L_BASE_YM := TRUNC(L_CL_DT_FR, 'MM');

			BEGIN
				L_DT_TMP := TO_DATE(TO_CHAR(ADD_MONTHS(L_BASE_YM, 1), 'YYYYMM') ||
					'/' || I_CL_DAY, 'YYYYMM/DD');
			EXCEPTION
				WHEN OTHERS THEN
					L_DT_TMP := LAST_DAY(ADD_MONTHS(L_BASE_YM, 1));
			END;

			L_I := 1;
			L_CNT := 0;
			L_DT_FR := L_CL_DT_FR;
			L_DT_TO := L_CL_DT_FR + 6;
			WHILE (L_I = 1) LOOP
				DT_LST(L_CNT).DT_FR := L_DT_FR;
				DT_LST(L_CNT).DT_TO := L_DT_TO;

				IF L_DT_TMP >= L_DT_FR AND L_DT_TMP <= L_DT_TO THEN
					L_I := 0;
					EXIT;
				ELSE
					L_DT_FR := FCPA_DATE_UTIL.F_NEXT_DAY(L_DT_TO, 1);
					L_DT_TO := L_DT_FR + 6;
				END IF;

				L_CNT := L_CNT + 1;
			END LOOP;

			IF I_POS > DT_LST.COUNT THEN
				RETURN NULL;
			ELSE
				RETURN DT_LST(I_POS - 1).DT_FR;
			END IF;
		-- 旬次
		ELSIF MAC_PERIOD_TYP.IS_TENDAYS(I_PERIOD_TYP) = '1' THEN
			IF I_POS < 1 OR I_POS > 3 THEN
				RETURN NULL;
			END IF;

			L_CL_DT_FR := F_GET_YM_ST_DT_NE(I_YM, I_PERIOD_TYP, I_CL_DAY, I_CL_MON_BASE);
			L_BASE_YM := TRUNC(L_CL_DT_FR, 'MM');

			BEGIN
				L_CL_DT_TO := TO_DATE(TO_CHAR(ADD_MONTHS(L_BASE_YM, 1), 'YYYYMM') ||
					'/' || I_CL_DAY, 'YYYYMM/DD');
			EXCEPTION
				WHEN OTHERS THEN
					L_CL_DT_TO := LAST_DAY(ADD_MONTHS(L_BASE_YM, 1));
			END;

			L_I := 1;
			L_CNT := 0;
			L_DT_FR := L_CL_DT_FR;
			L_DT_TO := L_CL_DT_FR + 9;
			WHILE (L_I <= 3) LOOP
				DT_LST(L_CNT).DT_FR := L_DT_FR;
				DT_LST(L_CNT).DT_TO := L_DT_TO;

				L_DT_FR := L_DT_TO + 1;

				IF L_I = 1 THEN
					L_DT_TO := L_DT_FR + 9;
				ELSE
					L_DT_TO := L_CL_DT_TO;
				END IF;

				L_I := L_I + 1;
				L_CNT := L_CNT + 1;
			END LOOP;

			RETURN DT_LST(I_POS - 1).DT_FR;
		ELSE
			RETURN NULL;
		END IF;

	END F_GET_YM_ST_DT_NE;

	FUNCTION F_GET_YM_END_DT_NE
	(
		I_YM IN MAPA_META.YM%TYPE,
		I_PERIOD_TYP IN MAPA_META.PERIOD_TYP%TYPE,
		I_POS IN INTEGER,
		I_CL_DAY IN MAPA_META.CL_DAY%TYPE,
		I_CL_MON_BASE IN MAPA_META.CL_MON_BASE%TYPE
	)
	RETURN MAPA_META.DT%TYPE
	/*********************************************************
	<SYNOPSIS>
			会計締日と会計月度基準から、年月の属する期間の開始位置の終了日となる年月日を取得する。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_YM
			対象年月
	<IN>	I_PERIOD_TYP
			期間区分
	<IN>	I_POS
			開始位置
	<IN>	I_CL_DAY
			会計締日
	<IN>	I_CL_MON_BASE
			会計月度基準
	<RETURNVALUE>
			年月の属する期間の開始位置の終了日
	<HISTORY>
	**********************************************************/
	IS
		DT_LST TBL_TYPE_R1;

		L_I			NUMBER;
		L_CNT		INTEGER;
		L_CL_DT_FR	MAPA_META.DT%TYPE;
		L_CL_DT_TO	MAPA_META.DT%TYPE;
		L_DT_TMP	MAPA_META.DT%TYPE;
		L_DT_FR		MAPA_META.DT%TYPE;
		L_DT_TO		MAPA_META.DT%TYPE;
		L_BASE_YM	MAPA_META.YM%TYPE;
	BEGIN
		IF	I_YM IS NULL OR
			I_PERIOD_TYP IS NULL OR
			I_POS IS NULL OR
			I_CL_DAY IS NULL OR
			I_CL_MON_BASE IS NULL THEN
			RETURN NULL;
		END IF;

		-- 月次
		IF MAC_PERIOD_TYP.IS_MONTHLY(I_PERIOD_TYP) = '1' THEN
			IF I_POS = 1 THEN
				RETURN F_GET_YM_END_DT_NE(I_YM, I_PERIOD_TYP, I_CL_DAY, I_CL_MON_BASE);
			ELSE
				RETURN NULL;
			END IF;
		-- 週次
		ELSIF MAC_PERIOD_TYP.IS_WEEKLY(I_PERIOD_TYP) = '1' THEN
			IF I_POS < 1 OR I_POS > 5 THEN
				RETURN NULL;
			END IF;

			L_CL_DT_FR := F_GET_YM_ST_DT_NE(I_YM, I_PERIOD_TYP, I_CL_DAY, I_CL_MON_BASE);
			L_BASE_YM := TRUNC(L_CL_DT_FR, 'MM');

			L_DT_TMP := F_GET_YM_END_DT_NE(I_YM, I_PERIOD_TYP, I_CL_DAY, I_CL_MON_BASE);

			L_I := 1;
			L_CNT := 0;
			L_DT_FR := L_CL_DT_FR;
			L_DT_TO := L_CL_DT_FR + 6;
			WHILE (L_I = 1) LOOP
				DT_LST(L_CNT).DT_FR := L_DT_FR;
				DT_LST(L_CNT).DT_TO := L_DT_TO;

				IF L_DT_TMP >= L_DT_FR AND L_DT_TMP <= L_DT_TO THEN
					L_I := 0;
					EXIT;
				ELSE
					L_DT_FR := FCPA_DATE_UTIL.F_NEXT_DAY(L_DT_TO, 1);
					L_DT_TO := L_DT_FR + 6;
				END IF;

				L_CNT := L_CNT + 1;
			END LOOP;

			IF I_POS > DT_LST.COUNT THEN
				RETURN NULL;
			ELSE
				RETURN DT_LST(I_POS - 1).DT_TO;
			END IF;
		-- 旬次
		ELSIF MAC_PERIOD_TYP.IS_TENDAYS(I_PERIOD_TYP) = '1' THEN
			IF I_POS < 1 OR I_POS > 3 THEN
				RETURN NULL;
			END IF;

			L_CL_DT_FR := F_GET_YM_ST_DT_NE(I_YM, I_PERIOD_TYP, I_CL_DAY, I_CL_MON_BASE);
			L_BASE_YM := TRUNC(L_CL_DT_FR, 'MM');

            L_CL_DT_TO := F_GET_YM_END_DT_NE(I_YM, I_PERIOD_TYP, I_CL_DAY, I_CL_MON_BASE);

			L_I := 1;
			L_CNT := 0;
			L_DT_FR := L_CL_DT_FR;
			L_DT_TO := L_CL_DT_FR + 9;
			WHILE (L_I <= 3) LOOP
				DT_LST(L_CNT).DT_FR := L_DT_FR;
				DT_LST(L_CNT).DT_TO := L_DT_TO;

				L_DT_FR := L_DT_TO + 1;

				IF L_I = 1 THEN
					L_DT_TO := L_DT_FR + 9;
				ELSE
					L_DT_TO := L_CL_DT_TO;
				END IF;

				L_I := L_I + 1;
				L_CNT := L_CNT + 1;
			END LOOP;

			RETURN DT_LST(I_POS - 1).DT_TO;
		ELSE
			RETURN NULL;
		END IF;

	END F_GET_YM_END_DT_NE;

	FUNCTION F_GET_AC_YM
	(
		I_DT IN MAPA_META.DT%TYPE
	)
	RETURN MAPA_META.YM%TYPE
	/*********************************************************
	<SYNOPSIS>
			日付に対応する計上月度を取得する。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_DT
			対象日付
	<RETURNVALUE>
			計上月度
	<HISTORY>
	**********************************************************/
	IS
		L_BASE_YM		MAPA_META.YM%TYPE;
		L_CL_DAY		MAPA_META.CL_DAY%TYPE;
		L_DT_DAY		MAPA_META.CL_DAY%TYPE;
		L_CL_MON_BASE	MAPA_META.CL_MON_BASE%TYPE;
	BEGIN

		IF I_DT IS NULL THEN
			RETURN NULL;
		END IF;

		--会社マスタより会計締日、会計月度基準を取得
		SELECT 
			AC_CL_DAY, AC_CL_MON_BASE
		INTO  
			L_CL_DAY, L_CL_MON_BASE
		FROM 
			MAM_CO;

		IF L_CL_DAY IS NULL THEN
			RETURN NULL;
		END IF;

		-- 基準月度(L_BASE_YM)を求める
		L_DT_DAY := TO_NUMBER(TO_CHAR(I_DT, 'DD'));
		IF L_CL_DAY < L_DT_DAY THEN
			L_BASE_YM := ADD_MONTHS(TRUNC(I_DT, 'MM'), 1);
		ELSE
			L_BASE_YM := TRUNC(I_DT, 'MM');
		END IF;

		RETURN ADD_MONTHS(L_BASE_YM, L_CL_MON_BASE);

	END F_GET_AC_YM;
	FUNCTION F_GET_AC_YM
	(
		I_DT IN MAPA_META.DT%TYPE,
		I_CL_DAY MAPA_META.CL_DAY%TYPE,
		I_CL_MON_BASE MAPA_META.CL_MON_BASE%TYPE
	)
	RETURN MAPA_META.YM%TYPE
	/*********************************************************
	<SYNOPSIS>
			日付に対応する計上月度を取得する。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_DT
			対象日付
	<IN>	I_CL_DAY
			会社マスタの会計締日
	<IN>	I_CL_MON_BASE
			会社マスタの会計月度基準
	<RETURNVALUE>
			計上月度
	<HISTORY>
	**********************************************************/
	IS
		L_BASE_YM		MAPA_META.YM%TYPE;
		L_DT_DAY		MAPA_META.CL_DAY%TYPE;
	BEGIN

		IF I_DT IS NULL THEN
			RETURN NULL;
		END IF;

		IF I_CL_DAY IS NULL THEN
			RETURN NULL;
		END IF;

		-- 基準月度(L_BASE_YM)を求める
		L_DT_DAY := TO_NUMBER(TO_CHAR(I_DT, 'DD'));
		IF I_CL_DAY < L_DT_DAY THEN
			L_BASE_YM := ADD_MONTHS(TRUNC(I_DT, 'MM'), 1);
		ELSE
			L_BASE_YM := TRUNC(I_DT, 'MM');
		END IF;

		RETURN ADD_MONTHS(L_BASE_YM, I_CL_MON_BASE);

	END F_GET_AC_YM;
	FUNCTION F_CAL_DAYS
	(
		I_FR_DT IN MAPA_META.DT%TYPE ,
		I_TO_DT IN MAPA_META.DT%TYPE ,
		I_CAL_CD IN MAPA_META.CAL_CD%TYPE
	)
	RETURN NUMBER
	/*********************************************************
	<SYNOPSIS>
			指定期間に含まれるカレンダの稼働日の日数を求める
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_FR_DT
			指定期間の開始日付
	<IN>	I_TO_DT
			指定期間の終了日付
	<IN>	I_CAL_CD
			カレンダコード
	<RETURNVALUE>
			稼働日の日数
	<HISTORY>
	**********************************************************/
	IS
		TYPE CALARRAY IS TABLE OF NUMBER INDEX BY VARCHAR2(10);
		L_CAL_ARRY CALARRAY;                            -- テンポラリ勤休カレンダ
		L_SUM NUMBER := 0;                              -- 勤務日合計のテンポラリ変数
		L_TMP_DT MAPA_META.DT%TYPE;                      -- 日付ループ用テンポラリ変数
		L_TMP_NUM NUMBER;                               -- 曜日算出用テンポラリ変数
		L_YYYYMMDD CONSTANT VARCHAR2(8) := 'YYYYMMDD' ; -- 日付型変換のための定数

	BEGIN
		-- 指定期間にNULLが含まれる場合NULLをリターン
		IF I_FR_DT IS NULL OR I_TO_DT IS NULL THEN
			RETURN NULL;
		END IF;

		-- テンポラリ勤休カレンダの初期化（例外としてNULLで埋める）
		L_TMP_DT := I_FR_DT;
		WHILE(L_TMP_DT <= I_TO_DT) LOOP
			L_CAL_ARRY(TO_CHAR(L_TMP_DT,L_YYYYMMDD)) := NULL;
			L_TMP_DT := L_TMP_DT + 1;
		END LOOP;

		-- 臨時カレンダの勤休取得
		FOR W_CAL IN (
		SELECT TO_CHAR(T1.DT,L_YYYYMMDD) "DT", DECODE(T1.OFF_FLG,'1',0,1) "NUM"
		FROM MAM_CAL_EXT T1
		WHERE T1.CAL_CD = I_CAL_CD
		AND T1.DT >= I_FR_DT
		AND T1.DT <= I_TO_DT
		AND T1.DEL_FLG = '0'
		) LOOP
			L_CAL_ARRY(W_CAL."DT") := W_CAL."NUM";
		END LOOP;

		-- 通常カレンダの勤休取得
		FOR W_CAL IN
			(
			SELECT
			 GREATEST(T1.ST_DT,I_FR_DT) "ST_DT",
			 LEAST(T1.END_DT,I_TO_DT) "END_DT",
			 DECODE(T1.SUN_OFF_FLG,'1',0,1) "SUN",
			 DECODE(T1.MON_OFF_FLG,'1',0,1) "MON",
			 DECODE(T1.TUE_OFF_FLG,'1',0,1) "TUE",
			 DECODE(T1.WED_OFF_FLG,'1',0,1) "WED",
			 DECODE(T1.THU_OFF_FLG,'1',0,1) "THU",
			 DECODE(T1.FRI_OFF_FLG,'1',0,1) "FRI",
			 DECODE(T1.SAT_OFF_FLG,'1',0,1) "SAT"
			FROM MAM_CAL T1
			WHERE T1.CAL_CD = I_CAL_CD
			AND T1.ST_DT <= I_TO_DT
			AND T1.END_DT >= I_FR_DT
			AND T1.DEL_FLG = '0'
			ORDER BY T1.ST_DT
			)
		LOOP
			L_TMP_DT := W_CAL."ST_DT";
			WHILE(L_TMP_DT <= W_CAL."END_DT") LOOP
				-- 臨時カレンダの勤休が取得できなかった日付のみ対象
				IF L_CAL_ARRY(TO_CHAR(L_TMP_DT,L_YYYYMMDD)) IS NULL THEN
					SELECT
						DECODE(F_TO_DAY_WEEK_TYP(L_TMP_DT),
						 MAC_DAY_WEEK_TYP.SUN,W_CAL."SUN",
						 MAC_DAY_WEEK_TYP.MON,W_CAL."MON",
						 MAC_DAY_WEEK_TYP.TUE,W_CAL."TUE",
						 MAC_DAY_WEEK_TYP.WED,W_CAL."WED",
						 MAC_DAY_WEEK_TYP.THU,W_CAL."THU",
						 MAC_DAY_WEEK_TYP.FRI,W_CAL."FRI",
						 MAC_DAY_WEEK_TYP.SAT,W_CAL."SAT"
						)
					INTO L_TMP_NUM FROM DUAL;
					L_CAL_ARRY(TO_CHAR(L_TMP_DT,L_YYYYMMDD)) := L_TMP_NUM;
				END IF;
				L_TMP_DT := L_TMP_DT + 1;
			END LOOP;
		END LOOP;

		-- ワークカレンダの勤務日合計値を計算
		L_TMP_DT := I_FR_DT;
		WHILE(L_TMP_DT <= I_TO_DT) LOOP
				-- カレンダが存在しない日付の判定としてNULLを使用
				IF L_CAL_ARRY(TO_CHAR(L_TMP_DT,L_YYYYMMDD)) IS NULL THEN
				-- カレンダが存在しないときは稼働扱い
				L_SUM := L_SUM + 1;
			ELSE
				L_SUM := L_SUM + L_CAL_ARRY(TO_CHAR(L_TMP_DT,L_YYYYMMDD));
			END IF;
			L_TMP_DT := L_TMP_DT + 1;
		END LOOP;

		RETURN L_SUM;

	END F_CAL_DAYS;

	FUNCTION F_CAL_DATE_LT
	(
		I_BASE_DT IN MAPA_META.DT%TYPE ,
		I_LT IN MAPA_META.LT%TYPE ,
		I_FWD_FLG IN MAPA_META.FLG%TYPE DEFAULT '1',
		I_CAL_CD IN MAPA_META.CAL_CD%TYPE
	)
	RETURN MAPA_META.DT%TYPE
	/*********************************************************
	<SYNOPSIS>
			カレンダの休日を考慮してリードタイム計算を行う
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_BASE_DT
			計算元の基準日付
	<IN>	I_LT
			リードタイム日数
	<IN>	I_FWD_FLG
			リードタイムが０で基準日付が休日のとき、直後の稼働日を返すか、直前の稼働日を返すかのＦＬＧ
			I_FWD_FLG='1'：直後の稼働日
			I_FWD_FLG='0'：直前の稼働日
	<IN>	I_CAL_CD
			カレンダコード
	<RETURNVALUE>
			リードタイム計算後の日付
	<HISTORY>
	**********************************************************/
	IS
		TYPE CALARRAY IS TABLE OF NUMBER INDEX BY VARCHAR2(10);
		L_CAL_ARRY CALARRAY;							-- テンポラリ勤休カレンダ
		L_SUM NUMBER := 0;								-- 勤務日合計のテンポラリ変数
		L_TMP_DT MAPA_META.DT%TYPE;						-- 日付ループ用テンポラリ変数
		L_TMP_NUM NUMBER;								-- 曜日算出用テンポラリ変数
		L_TMP_DT1 MAPA_META.DT%TYPE;					-- リードタイム＝０における稼働日算出用テンポラリ変数１
		L_YYYYMMDD CONSTANT VARCHAR2(8) := 'YYYYMMDD' ;	-- 日付型変換のための定数
		L_TRUE CHAR(1) := '1';
		L_RET_DT MAPA_META.DT%TYPE;						-- リターン日付用テンポラリ変数
		L_TMP_NUM2 NUMBER;								-- 臨時カレンダの休日チェック用テンポラリ変数

	BEGIN

		-- 基準日付がNULLの場合NULLをリターン
		IF I_BASE_DT IS NULL THEN
			RETURN NULL;
		END IF;

		-- リードタイムがNULLの場合NULLをリターン
		IF I_LT IS NULL THEN
			RETURN NULL;
		END IF;

		-- リードタイムが正の場合
		IF I_LT > 0 THEN
			-- テンポラリ勤休カレンダの初期化（例外としてNULLで埋める）
			L_TMP_DT := I_BASE_DT;
			WHILE(L_TMP_DT <= I_BASE_DT + I_LT) LOOP
				L_CAL_ARRY(TO_CHAR(L_TMP_DT,L_YYYYMMDD)) := NULL;
				L_TMP_DT := L_TMP_DT + 1;
			END LOOP;

		    -- 臨時カレンダの勤休取得
			FOR W_CAL IN (
			SELECT TO_CHAR(T1.DT,L_YYYYMMDD) "DT", DECODE(T1.OFF_FLG,'1',0,1) "NUM"
			FROM MAM_CAL_EXT T1
			WHERE T1.CAL_CD = I_CAL_CD
			AND T1.DT >= TRUNC(I_BASE_DT)
			AND T1.DT <= TRUNC(I_BASE_DT) + I_LT
			AND T1.DEL_FLG = '0'
			) LOOP
				L_CAL_ARRY(W_CAL."DT") := W_CAL."NUM";
			END LOOP;

			-- 通常カレンダの勤休取得
			FOR W_CAL IN
				(
				SELECT
				 GREATEST(T1.ST_DT,I_BASE_DT) "ST_DT",
				 LEAST(T1.END_DT,I_BASE_DT+I_LT) "END_DT",
				 DECODE(T1.SUN_OFF_FLG,'1',0,1) "SUN",
				 DECODE(T1.MON_OFF_FLG,'1',0,1) "MON",
				 DECODE(T1.TUE_OFF_FLG,'1',0,1) "TUE",
				 DECODE(T1.WED_OFF_FLG,'1',0,1) "WED",
				 DECODE(T1.THU_OFF_FLG,'1',0,1) "THU",
				 DECODE(T1.FRI_OFF_FLG,'1',0,1) "FRI",
				 DECODE(T1.SAT_OFF_FLG,'1',0,1) "SAT"
				FROM MAM_CAL T1
				WHERE T1.CAL_CD = I_CAL_CD
				AND T1.ST_DT <= I_BASE_DT + I_LT
				AND T1.END_DT >= I_BASE_DT
				AND T1.DEL_FLG = '0'
				ORDER BY T1.ST_DT
				)
			LOOP
				L_TMP_DT := W_CAL."ST_DT";
				WHILE(L_TMP_DT <= W_CAL."END_DT") LOOP
					-- 臨時カレンダの勤休が取得できなかった日付のみ対象
					IF L_CAL_ARRY(TO_CHAR(L_TMP_DT,L_YYYYMMDD)) IS NULL THEN
						CASE F_TO_DAY_WEEK_TYP(L_TMP_DT)
							WHEN MAC_DAY_WEEK_TYP.SUN THEN L_TMP_NUM := W_CAL."SUN";
							WHEN MAC_DAY_WEEK_TYP.MON THEN L_TMP_NUM := W_CAL."MON";
							WHEN MAC_DAY_WEEK_TYP.TUE THEN L_TMP_NUM := W_CAL."TUE";
							WHEN MAC_DAY_WEEK_TYP.WED THEN L_TMP_NUM := W_CAL."WED";
							WHEN MAC_DAY_WEEK_TYP.THU THEN L_TMP_NUM := W_CAL."THU";
							WHEN MAC_DAY_WEEK_TYP.FRI THEN L_TMP_NUM := W_CAL."FRI";
							WHEN MAC_DAY_WEEK_TYP.SAT THEN L_TMP_NUM := W_CAL."SAT";
						END CASE;
						L_CAL_ARRY(TO_CHAR(L_TMP_DT,L_YYYYMMDD)) := L_TMP_NUM;
					END IF;
					L_TMP_DT := L_TMP_DT + 1;
				END LOOP;
			END LOOP;

			-- ワークカレンダの勤務日合計値を計算
			L_TMP_DT := I_BASE_DT + 1;
			WHILE(L_TMP_DT <= I_BASE_DT + I_LT) LOOP
				-- カレンダが存在しない日付の判定としてNULLを使用
				IF L_CAL_ARRY(TO_CHAR(L_TMP_DT,L_YYYYMMDD)) IS NULL THEN
					-- カレンダが存在しないときは稼働扱い
					L_SUM := L_SUM + 1;
				ELSE
					L_SUM := L_SUM + L_CAL_ARRY(TO_CHAR(L_TMP_DT,L_YYYYMMDD));
				END IF;
				L_TMP_DT := L_TMP_DT + 1;
			END LOOP;

			-- リードタイムと勤務日合計値が一致すれば日付を返す
			IF L_SUM = I_LT THEN
				RETURN I_BASE_DT + I_LT;
			ELSE
				-- リードタイムと勤務日合計値が一致しなければ休日分をリードタイムとして再計算
				RETURN F_CAL_DATE_LT(I_BASE_DT + I_LT, I_LT - L_SUM ,I_FWD_FLG,I_CAL_CD);
			END IF;

		-- リードタイムが負の場合
		ELSIF I_LT < 0 THEN
			-- テンポラリ勤休カレンダの初期化（NULL文字で埋める）
			L_TMP_DT := I_BASE_DT;
			WHILE(L_TMP_DT >= I_BASE_DT + I_LT) LOOP
				L_CAL_ARRY(TO_CHAR(L_TMP_DT,L_YYYYMMDD)) := NULL;
				L_TMP_DT := L_TMP_DT - 1;
			END LOOP;

		    -- 臨時カレンダの勤休取得
			FOR W_CAL IN (
			SELECT TO_CHAR(T1.DT,L_YYYYMMDD) "DT", DECODE(T1.OFF_FLG,'1',0,1) "NUM"
			FROM MAM_CAL_EXT T1
			WHERE T1.CAL_CD = I_CAL_CD
			AND T1.DT <= TRUNC(I_BASE_DT)
			AND T1.DT >= TRUNC(I_BASE_DT) + I_LT
			AND T1.DEL_FLG = '0'
			) LOOP
				L_CAL_ARRY(W_CAL."DT") := W_CAL."NUM";
			END LOOP;

			-- 通常カレンダの勤休取得
			FOR W_CAL IN
				(
				SELECT
				 GREATEST(T1.ST_DT,I_BASE_DT + I_LT) "ST_DT",
				 LEAST(T1.END_DT,I_BASE_DT) "END_DT",
				 DECODE(T1.SUN_OFF_FLG,'1',0,1) "SUN",
				 DECODE(T1.MON_OFF_FLG,'1',0,1) "MON",
				 DECODE(T1.TUE_OFF_FLG,'1',0,1) "TUE",
				 DECODE(T1.WED_OFF_FLG,'1',0,1) "WED",
				 DECODE(T1.THU_OFF_FLG,'1',0,1) "THU",
				 DECODE(T1.FRI_OFF_FLG,'1',0,1) "FRI",
				 DECODE(T1.SAT_OFF_FLG,'1',0,1) "SAT"
				FROM MAM_CAL T1
				WHERE T1.CAL_CD = I_CAL_CD
				AND T1.ST_DT <= I_BASE_DT
				AND T1.END_DT >= I_BASE_DT + I_LT
				AND T1.DEL_FLG = '0'
				ORDER BY T1.ST_DT DESC
				)
			LOOP
				L_TMP_DT := W_CAL."END_DT";
				WHILE(L_TMP_DT >= W_CAL."ST_DT") LOOP
					-- 臨時カレンダが存在しない日付の判定としてNULLを使用
					IF L_CAL_ARRY(TO_CHAR(L_TMP_DT,L_YYYYMMDD)) IS NULL THEN
						CASE F_TO_DAY_WEEK_TYP(L_TMP_DT)
							WHEN MAC_DAY_WEEK_TYP.SUN THEN L_TMP_NUM := W_CAL."SUN";
							WHEN MAC_DAY_WEEK_TYP.MON THEN L_TMP_NUM := W_CAL."MON";
							WHEN MAC_DAY_WEEK_TYP.TUE THEN L_TMP_NUM := W_CAL."TUE";
							WHEN MAC_DAY_WEEK_TYP.WED THEN L_TMP_NUM := W_CAL."WED";
							WHEN MAC_DAY_WEEK_TYP.THU THEN L_TMP_NUM := W_CAL."THU";
							WHEN MAC_DAY_WEEK_TYP.FRI THEN L_TMP_NUM := W_CAL."FRI";
							WHEN MAC_DAY_WEEK_TYP.SAT THEN L_TMP_NUM := W_CAL."SAT";
						END CASE;
						L_CAL_ARRY(TO_CHAR(L_TMP_DT,L_YYYYMMDD)) := L_TMP_NUM;
					END IF;
					L_TMP_DT := L_TMP_DT - 1;
				END LOOP;
			END LOOP;

			-- ワークカレンダの勤務日合計値を計算
			L_TMP_DT := I_BASE_DT - 1;
			WHILE(L_TMP_DT >= I_BASE_DT + I_LT) LOOP
				-- カレンダが存在しない日付の判定としてNULLを使用
				IF L_CAL_ARRY(TO_CHAR(L_TMP_DT,L_YYYYMMDD)) IS NULL THEN
					-- カレンダが存在しないときは稼働扱い
					L_SUM := L_SUM + 1;
				ELSE
					L_SUM := L_SUM + L_CAL_ARRY(TO_CHAR(L_TMP_DT,L_YYYYMMDD));
				END IF;
				L_TMP_DT := L_TMP_DT - 1;
			END LOOP;

			-- リードタイムと勤務日合計値が一致すれば日付を返す
			IF L_SUM = - I_LT THEN
				RETURN I_BASE_DT + I_LT;
			ELSE
				-- リードタイムと勤務日合計値が一致しなければ休日分をリードタイムとして再計算
				RETURN F_CAL_DATE_LT(I_BASE_DT + I_LT, I_LT + L_SUM ,I_FWD_FLG,I_CAL_CD);
			END IF;

		-- リードタイムが0の場合
		ELSE
			-- 基準日補正区分が未来方向の場合
			IF I_FWD_FLG = L_TRUE THEN

				-- 臨時カレンダで基準日から直近の稼働日
				SELECT MIN(DT) INTO L_TMP_DT1
				FROM MAM_CAL_EXT
				WHERE CAL_CD = I_CAL_CD
				AND DT >= TRUNC(I_BASE_DT)
				AND DECODE(OFF_FLG,'1',0,1) = 1
				AND DEL_FLG = '0'
				;

				IF L_TMP_DT1 = I_BASE_DT THEN
					RETURN I_BASE_DT;
				END IF;

				-- 通常カレンダで基準日から直近の稼働日
				L_TMP_DT := I_BASE_DT;
				FOR W_CAL IN
					(
					SELECT
					 GREATEST(T1.ST_DT,I_BASE_DT) "ST_DT",
					 T1.END_DT "END_DT",
					 DECODE(T1.SUN_OFF_FLG,'1',0,1) "SUN",
					 DECODE(T1.MON_OFF_FLG,'1',0,1) "MON",
					 DECODE(T1.TUE_OFF_FLG,'1',0,1) "TUE",
					 DECODE(T1.WED_OFF_FLG,'1',0,1) "WED",
					 DECODE(T1.THU_OFF_FLG,'1',0,1) "THU",
					 DECODE(T1.FRI_OFF_FLG,'1',0,1) "FRI",
					 DECODE(T1.SAT_OFF_FLG,'1',0,1) "SAT"
					FROM MAM_CAL T1
					WHERE T1.CAL_CD = I_CAL_CD
					AND T1.END_DT >= I_BASE_DT
					AND T1.DEL_FLG = '0'
					ORDER BY T1.ST_DT
					)
				LOOP
					IF L_TMP_DT <> W_CAL."ST_DT" THEN
						L_TMP_NUM := 1;
						EXIT;
					END IF;

					WHILE (L_TMP_DT <= W_CAL."END_DT") LOOP
						CASE F_TO_DAY_WEEK_TYP(L_TMP_DT)
							WHEN MAC_DAY_WEEK_TYP.SUN THEN L_TMP_NUM := W_CAL."SUN";
							WHEN MAC_DAY_WEEK_TYP.MON THEN L_TMP_NUM := W_CAL."MON";
							WHEN MAC_DAY_WEEK_TYP.TUE THEN L_TMP_NUM := W_CAL."TUE";
							WHEN MAC_DAY_WEEK_TYP.WED THEN L_TMP_NUM := W_CAL."WED";
							WHEN MAC_DAY_WEEK_TYP.THU THEN L_TMP_NUM := W_CAL."THU";
							WHEN MAC_DAY_WEEK_TYP.FRI THEN L_TMP_NUM := W_CAL."FRI";
							WHEN MAC_DAY_WEEK_TYP.SAT THEN L_TMP_NUM := W_CAL."SAT";
						END CASE;
						EXIT WHEN L_TMP_NUM = 1;
						L_TMP_DT := L_TMP_DT + 1;
					END LOOP;
					EXIT WHEN L_TMP_NUM = 1;
				END LOOP;

				IF (L_TMP_DT1 IS NULL) AND (L_TMP_DT IS NULL) THEN
					L_RET_DT := I_BASE_DT;
				ELSIF (L_TMP_DT1 IS NULL) OR (L_TMP_DT1 > L_TMP_DT) THEN
					L_RET_DT := L_TMP_DT;
				ELSE
					RETURN L_TMP_DT1;
				END IF;

				-- 臨時カレンダで休日の場合、再計算が必要
				SELECT COUNT(CAL_CD) INTO L_TMP_NUM2
				FROM MAM_CAL_EXT
				WHERE CAL_CD = I_CAL_CD
				AND DT = TRUNC(L_RET_DT)
				AND DECODE(OFF_FLG,'1',0,1) = 0
				AND DEL_FLG = '0'
				;

				IF L_TMP_NUM2 = 0 THEN
					RETURN L_RET_DT;
				ELSE
					RETURN F_CAL_DATE_LT(L_RET_DT + 1, 0 ,I_FWD_FLG,I_CAL_CD);
				END IF;

			-- 基準日補正区分が過去方向の場合
			ELSE
				-- 臨時カレンダで基準日から直後の稼働日
				SELECT MAX(DT) INTO L_TMP_DT1
				FROM MAM_CAL_EXT
				WHERE CAL_CD = I_CAL_CD
				AND DT <= TRUNC(I_BASE_DT)
				AND DECODE(OFF_FLG,'1',0,1) = 1
				AND DEL_FLG = '0'
				;

				-- 通常カレンダで基準日から直後の稼働日
				L_TMP_DT := I_BASE_DT;

				FOR W_CAL IN
					(
					SELECT
					 T1.ST_DT "ST_DT",
					 LEAST(T1.END_DT, I_BASE_DT) "END_DT",
					 DECODE(T1.SUN_OFF_FLG,'1',0,1) "SUN",
					 DECODE(T1.MON_OFF_FLG,'1',0,1) "MON",
					 DECODE(T1.TUE_OFF_FLG,'1',0,1) "TUE",
					 DECODE(T1.WED_OFF_FLG,'1',0,1) "WED",
					 DECODE(T1.THU_OFF_FLG,'1',0,1) "THU",
					 DECODE(T1.FRI_OFF_FLG,'1',0,1) "FRI",
					 DECODE(T1.SAT_OFF_FLG,'1',0,1) "SAT"
					FROM MAM_CAL T1
					WHERE T1.CAL_CD = I_CAL_CD
					AND T1.ST_DT <= I_BASE_DT
					AND T1.DEL_FLG = '0'
					ORDER BY T1.ST_DT DESC
					)
				LOOP
					IF L_TMP_DT <> W_CAL."END_DT" THEN
						L_TMP_NUM := 1;
						EXIT;
					END IF;

					WHILE (L_TMP_DT >= W_CAL."ST_DT") LOOP
						CASE F_TO_DAY_WEEK_TYP(L_TMP_DT)
							WHEN MAC_DAY_WEEK_TYP.SUN THEN L_TMP_NUM := W_CAL."SUN";
							WHEN MAC_DAY_WEEK_TYP.MON THEN L_TMP_NUM := W_CAL."MON";
							WHEN MAC_DAY_WEEK_TYP.TUE THEN L_TMP_NUM := W_CAL."TUE";
							WHEN MAC_DAY_WEEK_TYP.WED THEN L_TMP_NUM := W_CAL."WED";
							WHEN MAC_DAY_WEEK_TYP.THU THEN L_TMP_NUM := W_CAL."THU";
							WHEN MAC_DAY_WEEK_TYP.FRI THEN L_TMP_NUM := W_CAL."FRI";
							WHEN MAC_DAY_WEEK_TYP.SAT THEN L_TMP_NUM := W_CAL."SAT";
						END CASE;
						EXIT WHEN L_TMP_NUM = 1;
						L_TMP_DT := L_TMP_DT - 1;
					END LOOP;
					EXIT WHEN L_TMP_NUM = 1;
				END LOOP;

				IF (L_TMP_DT1 IS NULL) AND (L_TMP_DT IS NULL) THEN
					L_RET_DT := I_BASE_DT;
				ELSIF (L_TMP_DT1 IS NULL) OR (L_TMP_DT1 < L_TMP_DT) THEN
					L_RET_DT := L_TMP_DT;
				ELSE
					L_RET_DT := L_TMP_DT1;
				END IF;

				-- 臨時カレンダで休日の場合、再計算が必要
				SELECT COUNT(CAL_CD) INTO L_TMP_NUM2
				FROM MAM_CAL_EXT
				WHERE CAL_CD = I_CAL_CD
				AND DT = TRUNC(L_RET_DT)
				AND DECODE(OFF_FLG,'1',0,1) = 0
				AND DEL_FLG = '0'
				;

				IF L_TMP_NUM2 = 0 THEN
					RETURN L_RET_DT;
				ELSE
					RETURN F_CAL_DATE_LT(L_RET_DT - 1, 0 ,I_FWD_FLG,I_CAL_CD);
				END IF;
			END IF;

		END IF;
	END F_CAL_DATE_LT;

	FUNCTION F_CAL_DATE
	(
		I_BASE_DT IN MAPA_META.DT%TYPE ,
		I_LT IN MAPA_META.LT%TYPE ,
		I_FWD_FLG IN MAPA_META.FLG%TYPE DEFAULT '1',
		I_CAL_CD IN MAPA_META.CAL_CD%TYPE,
		I_XFR_FLG IN MAPA_META.FLG%TYPE
	)
	RETURN MAPA_META.DT%TYPE
	/*********************************************************
	<SYNOPSIS>
			カレンダの休日を考慮してリードタイム計算を行う
	<REMARKS>
			休日をリードタイムに含める（全期間考慮）ケースでは計算元の基準日付
			から与えられたカレンダの稼働日を元としてリードタイム計算を行う。
			休日をリードタイムに含めない（完了日のみ）ケースでは与えられた基準日付
			を元としてリードタイム計算を行う。（常に移動元の稼働日を基準にする場合は
			F_CAL_DATE_MOVEを用いる）
	<ARGUMENTS>
	<IN>	I_BASE_DT
			計算元の基準日付
	<IN>	I_LT
			リードタイム日数
	<IN>	I_FWD_FLG
			リードタイムが０で基準日付が休日のとき、直後の稼働日を返すか、直前の稼働日を返すかのＦＬＧ
			I_FWD_FLG='1'：直後の稼働日
			I_FWD_FLG='0'：直前の稼働日
	<IN>	I_CAL_CD
			カレンダコード
	<IN>	I_XFR_FLG
			移動用ＦＬＧ
			I_XFR_FLG='1'：休日をリードタイムに含めない（移動用）
			I_XFR_FLG='0'：休日をリードタイムに含める（製造用）
	<RETURNVALUE>
			リードタイム計算後の日付
	<HISTORY>
	**********************************************************/
	IS
		L_TRUE CHAR(1) := '1';
		L_FALSE CHAR(1) := '0';
		F_BASE_DT MAPA_META.DT%TYPE;
	BEGIN

		IF  I_XFR_FLG = L_FALSE THEN
		-- 休日をリードタイムに含める（全期間考慮）場合
			-- 基準日付が休日であった場合、直近稼働日を基準日付にする
				IF I_LT = 0 THEN
					F_BASE_DT := F_CAL_DATE_LT(I_BASE_DT, 0 ,I_FWD_FLG,I_CAL_CD);
				ELSIF I_LT > 0 THEN
					F_BASE_DT := F_CAL_DATE_LT(I_BASE_DT, 0 ,L_TRUE,I_CAL_CD);
				ELSE
					F_BASE_DT := F_CAL_DATE_LT(I_BASE_DT, 0 ,L_FALSE,I_CAL_CD);
			END IF;

			RETURN F_CAL_DATE_LT(F_BASE_DT, I_LT ,I_FWD_FLG,I_CAL_CD);
		ELSE
		-- 休日をリードタイムに含めない（完了日のみ）場合
			-- 基準日付そのままで計算する
			F_BASE_DT := I_BASE_DT;

			IF I_LT = 0 THEN
				RETURN F_CAL_DATE_LT(F_BASE_DT + I_LT, 0 ,I_FWD_FLG,I_CAL_CD);
			ELSIF I_LT > 0 THEN
				RETURN F_CAL_DATE_LT(F_BASE_DT + I_LT, 0 ,L_TRUE,I_CAL_CD);
			ELSE
				RETURN F_CAL_DATE_LT(F_BASE_DT + I_LT, 0 ,L_FALSE,I_CAL_CD);
			END IF;
		END IF;
	END F_CAL_DATE;



	FUNCTION F_CAL_DATE_LOC
	(
		I_BASE_DT IN MAPA_META.DT%TYPE ,
		I_LT IN MAPA_META.LT%TYPE ,
		I_FWD_FLG IN MAPA_META.FLG%TYPE DEFAULT '1',
		I_LOC_CD IN MAPA_META.LOC_CD%TYPE,
		I_XFR_FLG IN MAPA_META.FLG%TYPE
	)
	RETURN MAPA_META.DT%TYPE
	/*********************************************************
	<SYNOPSIS>
			場所コードからカレンダを取得し、カレンダの休日を考慮してリードタイム計算を行う
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_BASE_DT
			計算元の基準日付
	<IN>	I_LT
			リードタイム日数
	<IN>	I_FWD_FLG
			リードタイムが０で基準日付が休日のとき、直後の稼働日を返すか、直前の稼働日を返すかのＦＬＧ
			I_FWD_FLG='1'：直後の稼働日
			I_FWD_FLG='0'：直前の稼働日
	<IN>	I_LOC_CD
			場所コード
	<IN>	I_XFR_FLG
			移動用ＦＬＧ
			I_XFR_FLG='1'：休日をリードタイムに含めない（移動用）
			I_XFR_FLG='0'：休日をリードタイムに含める（製造用）
	<RETURNVALUE>
			リードタイム計算後の日付
	<HISTORY>
	**********************************************************/
	IS
		L_CAL_CD	MAM_LOC.CAL_CD%TYPE;
		L_MSG		FCPA_ERR.MSG_BINDER;
	BEGIN
		BEGIN
			SELECT CAL_CD INTO L_CAL_CD FROM MAM_LOC T1 WHERE LOC_CD = I_LOC_CD ;
		EXCEPTION
			WHEN NO_DATA_FOUND THEN
				L_MSG := FCPA_ERR.MSG_BINDER (I_LOC_CD);
				FCPA_ERR.RAISE_APP_ERR ('MAUCD0008', L_MSG);
		END;

		IF L_CAL_CD IS NULL THEN
			L_CAL_CD := MAPA_CO.F_GET_CO_REC().STD_CAL_CD ;
		END IF;

		RETURN F_CAL_DATE(I_BASE_DT,I_LT,I_FWD_FLG,L_CAL_CD,I_XFR_FLG);

	END F_CAL_DATE_LOC;

	FUNCTION F_CAL_DATE_MOVE
	(
		I_BASE_DT IN MAPA_META.DT%TYPE ,
		I_LT IN MAPA_META.LT%TYPE ,
		I_FWD_FLG IN MAPA_META.FLG%TYPE DEFAULT '1',
		I_F_CAL_CD IN MAPA_META.CAL_CD%TYPE,
		I_F_LOC_CD IN MAPA_META.LOC_CD%TYPE,
		I_T_CAL_CD IN MAPA_META.CAL_CD%TYPE,
		I_T_LOC_CD IN MAPA_META.LOC_CD%TYPE
	)
	RETURN MAPA_META.DT%TYPE
	/*********************************************************
	<SYNOPSIS>
			移動のリードタイム計算を求める。
	<REMARKS>
			移動専用のリードタイム計算となり、基準日付に対して移動元カレンダ（もしくは移動元場所）
			の稼働日を移動元の日付として、リードタイム計算を行い格納予定日を求める
	<ARGUMENTS>
	<IN>	I_BASE_DT
			計算元の基準日付
	<IN>	I_LT
			リードタイム日数
	<IN>	I_FWD_FLG
			リードタイムが０で基準日付が休日のとき、直後の稼働日を返すか、直前の稼働日を返すかのＦＬＧ
			I_FWD_FLG='1'：直後の稼働日
			I_FWD_FLG='0'：直前の稼働日
	<IN>	I_F_CAL_CD
			移動元カレンダコード（NULLの場合、移動元場所コードが必須）
	<IN>	I_F_LOC_CD
			移動元場所コード
	<IN>	I_T_CAL_CD
			移動先カレンダコード（NULLの場合、移動先場所コードが必須）
	<IN>	I_T_LOC_CD
			移動先場所コード
	<RETURNVALUE>
			リードタイム計算後の日付
	<HISTORY>
	**********************************************************/
	IS
		L_F_CAL_CD MAM_LOC.CAL_CD%TYPE;
		L_T_CAL_CD MAM_LOC.CAL_CD%TYPE;
		L_MSG FCPA_ERR.MSG_BINDER;
		L_TRUE CHAR(1) := '1';
		F_BASE_DT MAPA_META.DT%TYPE;
	BEGIN

		-- 移動元カレンダを取得
		IF I_F_CAL_CD IS NULL THEN
			BEGIN
				SELECT CAL_CD INTO L_F_CAL_CD FROM MAM_LOC T1 WHERE LOC_CD = I_F_LOC_CD ;
			EXCEPTION
				WHEN NO_DATA_FOUND THEN
					L_F_CAL_CD := NULL;
			END;
		ELSE
			L_F_CAL_CD := I_F_CAL_CD;
		END IF;

		IF L_F_CAL_CD IS NULL THEN
			L_F_CAL_CD := MAPA_CO.F_GET_CO_REC().STD_CAL_CD ;
		END IF;

		-- 移動先カレンダを取得
		IF I_T_CAL_CD IS NULL THEN
			BEGIN
	 			SELECT CAL_CD INTO L_T_CAL_CD FROM MAM_LOC T1 WHERE LOC_CD = I_T_LOC_CD ;
			EXCEPTION
				WHEN NO_DATA_FOUND THEN
					L_T_CAL_CD := NULL;
			END;
		ELSE
			L_T_CAL_CD := I_T_CAL_CD;
		END IF;

		IF L_T_CAL_CD IS NULL THEN
			L_T_CAL_CD := MAPA_CO.F_GET_CO_REC().STD_CAL_CD ;
		END IF;

		-- 移動元カレンダにおける基準日付の直近稼働日を算出
		IF I_LT = 0 THEN
			F_BASE_DT := F_CAL_DATE_LT(I_BASE_DT, 0 ,I_FWD_FLG,L_F_CAL_CD);
		ELSIF I_LT > 0 THEN
			F_BASE_DT := F_CAL_DATE_LT(I_BASE_DT, 0 ,'1',L_F_CAL_CD);
		ELSE
			F_BASE_DT := F_CAL_DATE_LT(I_BASE_DT, 0 ,'0',L_F_CAL_CD);
		END IF;

		-- リードタイム計算
		IF I_LT = 0 THEN
			RETURN F_CAL_DATE_LT(F_BASE_DT + I_LT, 0 ,I_FWD_FLG,L_T_CAL_CD);
		ELSIF I_LT > 0 THEN
			RETURN F_CAL_DATE_LT(F_BASE_DT + I_LT, 0 ,'1',L_T_CAL_CD);
		ELSE
			RETURN F_CAL_DATE_LT(F_BASE_DT + I_LT, 0 ,'0',L_T_CAL_CD);
		END IF;

	END F_CAL_DATE_MOVE;


	FUNCTION F_TO_YM (
		I_DATE IN DATE
	) RETURN MAPA_META.YM%TYPE
	/*********************************************************
	<SYNOPSIS>
			日付の「日」以降を切り捨てて、年月を返します。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_DATE
			日付
	<RETURNVALUE>
			年月
	<HISTORY>
	**********************************************************/
	IS
	BEGIN
		RETURN TRUNC(I_DATE, 'MM');
	END F_TO_YM;

	FUNCTION F_TO_DATE (
		I_YM	IN MAPA_META.YM%TYPE,
		I_DAYS	IN NUMBER
	) RETURN DATE
	/*********************************************************
	<SYNOPSIS>
			年月と日にちを合わせて日付にして返します。
	<REMARKS>
			引数の何れかがNULL、日にちが０以下、
			年月の最終日より大きい場合はNULLを返します。
	<ARGUMENTS>
	<IN>	I_YM
			年月
	<IN>	I_DAYS
			日にち
	<RETURNVALUE>
			日付
	<HISTORY>
	**********************************************************/
	IS
	BEGIN

		IF I_YM IS NULL OR I_DAYS IS NULL THEN
			RETURN TO_DATE(NULL);
		END IF;

		IF I_DAYS <= 0 OR EXTRACT(DAY FROM LAST_DAY(I_YM)) < I_DAYS THEN
			RETURN TO_DATE(NULL);
		END IF;

		RETURN TRUNC(I_YM, 'MM') + (I_DAYS - 1) ;
	END F_TO_DATE;

	FUNCTION F_IS_WRKDAY
	(
		I_DT IN MAPA_META.DT%TYPE,
		I_CAL_CD IN MAPA_META.CAL_CD%TYPE
	)
	RETURN MAPA_META.FLG%TYPE
	/*********************************************************
	<SYNOPSIS>
			日付とカレンダＣＤから稼働日かどうかを判断する。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_DT
			日付
	<IN>	I_CAL_CD
			カレンダＣＤ
	<RETURNVALUE>
			'1'：稼働日、'0'：非稼動日（休日）
	<HISTORY>
	**********************************************************/
	IS
		CNT			NUMBER;
		RET			MAPA_META.FLG%TYPE;
		R_SUN		MAPA_META.FLG%TYPE;
		R_MON		MAPA_META.FLG%TYPE;
		R_TUE		MAPA_META.FLG%TYPE;
		R_WED		MAPA_META.FLG%TYPE;
		R_THU		MAPA_META.FLG%TYPE;
		R_FRI		MAPA_META.FLG%TYPE;
		R_SAT		MAPA_META.FLG%TYPE;
		WEEK_TYP	VARCHAR2(1);
		L_TRUE		CHAR(1) := '1';
	BEGIN
		-- 臨時カレンダで休日かどうかを判断
		SELECT COUNT(CAL_CD) INTO CNT
		FROM MAM_CAL_EXT
		WHERE CAL_CD = I_CAL_CD
		AND DT = TRUNC(I_DT)
		AND DEL_FLG = '0'
		;

		IF CNT > 0 THEN
			-- 臨時カレンダで基準日からカレンダー勤休区分取得
			SELECT DECODE(OFF_FLG,  L_TRUE, '0', '1') INTO RET
			FROM MAM_CAL_EXT
			WHERE CAL_CD = I_CAL_CD
			AND DT = TRUNC(I_DT)
			AND DEL_FLG = '0'
			;

			RETURN RET;
		-- カレンダマスタで休日かどうかを判断
		ELSE
			BEGIN
				SELECT
					 DECODE(SUN_OFF_FLG, L_TRUE, '0', '1') "SUN",
					 DECODE(MON_OFF_FLG, L_TRUE, '0', '1') "MON",
					 DECODE(TUE_OFF_FLG, L_TRUE, '0', '1') "TUE",
					 DECODE(WED_OFF_FLG, L_TRUE, '0', '1') "WED",
					 DECODE(THU_OFF_FLG, L_TRUE, '0', '1') "THU",
					 DECODE(FRI_OFF_FLG, L_TRUE, '0', '1') "FRI",
					 DECODE(SAT_OFF_FLG, L_TRUE, '0', '1') "SAT"
				INTO R_SUN, R_MON, R_TUE, R_WED, R_THU, R_FRI, R_SAT
				FROM MAM_CAL
				WHERE CAL_CD = I_CAL_CD
				AND ST_DT <= I_DT
				AND END_DT >= I_DT
				AND DEL_FLG = '0'
				;

				WEEK_TYP := F_TO_DAY_WEEK_TYP(I_DT);

				IF (MAC_DAY_WEEK_TYP.IS_SUN(WEEK_TYP) = L_TRUE) THEN
					RETURN R_SUN;
				ELSIF (MAC_DAY_WEEK_TYP.IS_MON(WEEK_TYP) = L_TRUE) THEN
					RETURN R_MON;
				ELSIF (MAC_DAY_WEEK_TYP.IS_TUE(WEEK_TYP) = L_TRUE) THEN
					RETURN R_TUE;
				ELSIF (MAC_DAY_WEEK_TYP.IS_WED(WEEK_TYP) = L_TRUE) THEN
					RETURN R_WED;
				ELSIF (MAC_DAY_WEEK_TYP.IS_THU(WEEK_TYP) = L_TRUE) THEN
					RETURN R_THU;
				ELSIF (MAC_DAY_WEEK_TYP.IS_FRI(WEEK_TYP) = L_TRUE) THEN
					RETURN R_FRI;
				ELSIF (MAC_DAY_WEEK_TYP.IS_SAT(WEEK_TYP) = L_TRUE) THEN
					RETURN R_SAT;
				END IF;

			EXCEPTION
				-- カレンダマスタに存在しない場合は稼働日扱い
				WHEN NO_DATA_FOUND THEN
					RETURN '1';
			END;
		END IF;

	END F_IS_WRKDAY;

	FUNCTION F_IS_BEFORE_AFTER
	(
		I_DT1 IN MAPA_META.DT%TYPE,
		I_DT2 IN MAPA_META.DT%TYPE
	)
	RETURN MAPA_META.FLG%TYPE
	/*********************************************************
	<SYNOPSIS>
			日時比較、対象日時のどちらかの時刻が00:00ならば、日付で比較。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_DT1
			本来小さい日時
	<IN>	I_DT2
			本来大きい日時
	<RETURNVALUE>
			'1'：正常、'0'：異常
	<HISTORY>
	**********************************************************/
	IS
		L_TRUE	CHAR(1) := '1';
		L_FALSE	CHAR(1) := '0';
		L_DT1	MAPA_META.DT%TYPE;
		L_DT2	MAPA_META.DT%TYPE;
	BEGIN
		IF I_DT1 IS NULL OR I_DT2 IS NULL THEN
			RETURN L_TRUE;
		END IF;

		L_DT1 := I_DT1;
		L_DT2 := I_DT2;

		IF L_DT1 = TRUNC(L_DT1, 'DD') OR L_DT2 = TRUNC(L_DT2, 'DD') THEN
			L_DT1 := TRUNC(L_DT1, 'DD');
			L_DT2 := TRUNC(L_DT2, 'DD');
		END IF;

		IF L_DT2 < L_DT1 THEN
			RETURN L_FALSE;
		END IF;

		RETURN L_TRUE;
	END F_IS_BEFORE_AFTER;

END MAPA_DT;

/
show errors;


