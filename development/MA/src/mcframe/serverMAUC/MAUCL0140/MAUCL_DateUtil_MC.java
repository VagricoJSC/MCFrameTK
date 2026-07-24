package mcframe.serverMAUC.MAUCL0140;

import mcframe.commonCore.lang.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.container.MCList.SortType;
import mcframe.commonCore.notice.*;
import mcframe.serverCore.logic.*;
import mcframe.serverCore.notice.MCMessagePool;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.serverMA.dbc.*;
import mcframe.serverMAUC.MAUCL0060.ElmArgsR;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import static mcframe.serverCore.requester.MCRequestObject.object;

import mcframe.serverCore.resource.MCConst;
import java.util.HashMap;
import java.util.Map;
//FMCB CUSTOM_IMPORT END

/**
 * "MAUCL_DateUtil"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MAUCL_DateUtil_MC extends MAUCL_DateUtil_MC_A{
	//FMCB CUSTOM START
	/**
	 * このクラス（スレッドセーフ対応用）
	 */
	protected static final Class<MAUCL_DateUtil> CLAZZ = MAUCL_DateUtil.class;

	/**
	 * 対象年月の属する開始日を取得します。
	 * 会計締日と会計月度基準は、自社マスタの値を使用します。
	 *
	 * @param ym 対象年月
	 * @return 開始日付
	 */
	public static MCDate getYmStDt(
		MCDate ym) {
		return object(CLAZZ)._getYmStDt(ym);
	}
	
	protected MCDate _getYmStDt(MCDate ym) {
		if (isNull(ym)) {
			return null;
		}

		MCNumber tmpDay = getCo().ac_cl_day();
		MCNumber clMonbase = getCo().ac_cl_mon_base();

		MCDate baseYm = ym.startOfMonth();
		if (clMonbase.eq(MCNumber.ZERO)) {
			baseYm = baseYm.addMonth(-1);
		}

		int clDay;
		int lastDay = baseYm.endOfMonth().getDay();
		if (tmpDay.gt(lastDay)) {
			clDay = lastDay;
		}
		else {
			clDay = tmpDay.intValue();
		}

		if (tmpDay.eq(99)) {
			return baseYm.addMonth(1);
		}
		else {
			return baseYm.addDay(clDay);
		}
	}

	/**
	 * 対象年月の終了日を取得します。
	 * 会計締日と会計月度基準は、自社マスタの値を使用します。
	 *
	 * @param ym 対象年月
	 * @return 終了日付
	 */
	public static MCDate getYmEndDt(
		MCDate ym) {
		return object(CLAZZ)._getYmEndDt(ym);
	}
	
	protected MCDate _getYmEndDt(MCDate ym) {
		if (isNull(ym)) {
			return null;
		}

		MCNumber clMonbase = getCo().ac_cl_mon_base();

		MCDate baseYm = ym;
		if (clMonbase.eq(MCNumber.ZERO)) {
			baseYm = baseYm.addMonth(-1);
		}

		MCNumber tmpDay = getCo().ac_cl_day();
		int clDay = tmpDay.intValue();

		int lastDay = baseYm.endOfMonth().getDay();
		if (clDay > lastDay) {
			clDay = lastDay;
		}

		if (tmpDay.eq(99)) {
			return baseYm.addMonth(1).endOfMonth();
		}
		else {
			if (clDay > baseYm.addMonth(1).endOfMonth().getDay()) {
				return baseYm.addMonth(1).endOfMonth();
			}
			else {
				return baseYm.endOfMonth().addDay(tmpDay.intValue());
			}
		}
	}

	/**
	 * 対象日付の属する年月の開始日を取得します。
	 * 会計締日は、自社マスタの値を使用します。
	 *
	 * @param dt 対象日付
	 * @param period_typ 期間区分
	 * @return 開始日付
	 */
	public static MCDate getPeriodStDt(
		MCDate dt,
		String period_typ) {
		return object(CLAZZ)._getPeriodStDt(dt, period_typ);
	}
	
	protected MCDate _getPeriodStDt(
			MCDate dt, 
			String period_typ) {
		return object(CLAZZ)._getPeriodStDt(dt, period_typ, getCo().ac_cl_day());
	}
	
	/**
	 * 対象日付の属する期間の終了日を取得します。
	 * 会計締日は、自社マスタの値を使用します。
	 *
	 * @param dt 対象日付
	 * @param period_typ 期間区分
	 * @return 終了日付
	 */
	public static MCDate getPeriodEndDt(
		MCDate dt,
		String period_typ) {
		return object(CLAZZ)._getPeriodEndDt(dt, period_typ);
	}
	
	protected MCDate _getPeriodEndDt(
			MCDate dt, 
			String period_typ) {
		return object(CLAZZ)._getPeriodEndDt(dt, period_typ, getCo().ac_cl_day());
	}
	
	/**
	 * 対象日付の属する期間の開始日を取得します。
	 *
	 * @param dt 対象日付
	 * @param period_typ 期間区分
	 * @param cl_day 会計締日
	 * @return 終了日付
	 */
	public static MCDate getPeriodStDt(
		MCDate dt,
		String period_typ,
		MCNumber cl_day) {
		return object(CLAZZ)._getPeriodStDt(dt, period_typ, cl_day);
	}
	
	protected MCDate _getPeriodStDt(
			MCDate dt,
			String period_typ,
			MCNumber cl_day) {

		if (isNull(dt) || isNull(period_typ) || isNull(cl_day)) {
			return null;
		}

		// 日次
		if (MAC_PERIOD_TYP.isDAILY(period_typ)) {
			return dt;
		}
		// 月次
		else if (MAC_PERIOD_TYP.isMONTHLY(period_typ)) {
			MCDate baseYm = dt.startOfMonth();
			baseYm = baseYm.addMonth(-1);

			int clDay;
			int lastDay = baseYm.endOfMonth().getDay();
			if (cl_day.gt(lastDay)) {
				clDay = lastDay;
			}
			else {
				clDay = cl_day.intValue();
			}

			MCDate clDtFr = baseYm.addDay(clDay);
			MCDate clDtTo = null;
			boolean lastDayFlg = false;
			if (cl_day.eq(99)) {
				lastDayFlg = true;
				clDtTo = baseYm.addMonth(1).endOfMonth();
			}
			else {
				if (cl_day.intValue() > baseYm.addMonth(1).endOfMonth().getDay()) {
					lastDayFlg = true;
					clDtTo = baseYm.addMonth(1).endOfMonth();
				}
				else {
					clDtTo = baseYm.endOfMonth().addDay(cl_day.intValue());
				}
			}

			int find = 0;
			while (find == 0) {
				if (dt.gteDate(clDtFr) && dt.lteDate(clDtTo)) {
					find = 1;
				}
				else {
					clDtFr = clDtTo.addDay(1);
					if (lastDayFlg) {
						clDtTo = clDtTo.addMonth(1).endOfMonth();
					}
					else {
						clDtTo = clDtTo.addMonth(1);
					}
				}
			}
			return clDtFr;
		}
		// 週次
		else if (MAC_PERIOD_TYP.isWEEKLY(period_typ)) {
			if (dt.getDayOfWeek() == MCDate.SUNDAY) {
				return dt;
			}
			else {
				MCDate dtTmp = dt;
				MCDate weekDtFr = null;
				while(isNull(weekDtFr)) {
					dtTmp = dtTmp.addDay(-1);
					if(dtTmp.getDayOfWeek() == MCDate.SUNDAY){
						weekDtFr = dtTmp;
					}
				}
				return weekDtFr;
			}
		}
		// 旬次
		else if (MAC_PERIOD_TYP.isTENDAYS(period_typ)) {
			MCDate baseYm = dt.startOfMonth();
			baseYm = baseYm.addMonth(-1);

			int clDay;
			int lastDay = baseYm.endOfMonth().getDay();
			if (cl_day.gt(lastDay)) {
				clDay = lastDay;
			}
			else {
				clDay = cl_day.intValue();
			}

			MCDate clDtFr = baseYm.addDay(clDay);
			MCDate clDtTo = null;
			boolean lastDayFlg = false;
			if (cl_day.eq(99)) {
				lastDayFlg = true;
				clDtTo = baseYm.addMonth(1).endOfMonth();
			}
			else {
				if (cl_day.intValue() > baseYm.addMonth(1).endOfMonth().getDay()) {
					lastDayFlg = true;
					clDtTo = baseYm.addMonth(1).endOfMonth();
				}
				else {
					clDtTo = baseYm.endOfMonth().addDay(cl_day.intValue());
				}
			}

			int find = 0;
			while (find == 0) {
				if (dt.gteDate(clDtFr) && dt.lteDate(clDtTo)) {
					find = 1;
				}
				else {
					clDtFr = clDtTo.addDay(1);
					if (lastDayFlg) {
						clDtTo = clDtTo.addMonth(1).endOfMonth();
					}
					else {
						clDtTo = clDtTo.addMonth(1);
					}
				}
			}

			int i = 1;
			MCDate tenDtFr = clDtFr;
			MCDate tenDtTo = clDtFr.addDay(9);
			while (i <= 3) {
				if (dt.lt(tenDtFr) || dt.gt(tenDtTo)) {
					tenDtFr = tenDtTo.addDay(1);
					if (i == 1) {
						tenDtTo = tenDtFr.addDay(9);
					}
					else {
						tenDtTo = clDtTo;
					}
					i++;
				}
				else {
					break;
				}
			}
			return tenDtFr;
		}

		return null;
	}

	/**
	 * 対象日付の属する期間の終了日を取得します。
	 *
	 * @param dt 対象日付
	 * @param period_typ 期間区分
	 * @param cl_day 会計締日
	 * @return 終了日付
	 */
	public static MCDate getPeriodEndDt(
		MCDate dt,
		String period_typ,
		MCNumber cl_day) {
		return object(CLAZZ)._getPeriodEndDt(dt, period_typ, cl_day);
	}
	
	protected MCDate _getPeriodEndDt(
			MCDate dt,
			String period_typ,
			MCNumber cl_day) {

		if (isNull(dt) || isNull(period_typ) || isNull(cl_day)) {
			return null;
		}

		// 日次
		if (MAC_PERIOD_TYP.isDAILY(period_typ)) {
			return dt;
		}
		// 月次
		else if (MAC_PERIOD_TYP.isMONTHLY(period_typ)) {
			MCDate baseYm = dt.startOfMonth();
			baseYm = baseYm.addMonth(-1);

			int clDay;
			int lastDay = baseYm.endOfMonth().getDay();
			if (cl_day.gt(lastDay)) {
				clDay = lastDay;
			}
			else {
				clDay = cl_day.intValue();
			}

			MCDate clDtFr = baseYm.addDay(clDay);
			MCDate clDtTo = null;
			boolean lastDayFlg = false;
			if (cl_day.eq(99)) {
				lastDayFlg = true;
				clDtTo = baseYm.addMonth(1).endOfMonth();
			}
			else {
				if (cl_day.intValue() > baseYm.addMonth(1).endOfMonth().getDay()) {
					lastDayFlg = true;
					clDtTo = baseYm.addMonth(1).endOfMonth();
				}
				else {
					clDtTo = baseYm.endOfMonth().addDay(cl_day.intValue());
				}
			}

			int find = 0;
			while (find == 0) {
				if (dt.gteDate(clDtFr) && dt.lteDate(clDtTo)) {
					find = 1;
				}
				else {
					clDtFr = clDtTo.addDay(1);
					if (lastDayFlg) {
						clDtTo = clDtTo.addMonth(1).endOfMonth();
					}
					else {
						clDtTo = clDtTo.addMonth(1);
					}
				}
			}
			return clDtTo;
		}
		// 週次
		else if (MAC_PERIOD_TYP.isWEEKLY(period_typ)) {
			if (dt.getDayOfWeek() == MCDate.SATURDAY) {
				return dt;
			}
			else {
				MCDate dtTmp = dt;
				MCDate weekDtTo = null;
				while(isNull(weekDtTo)) {
					dtTmp = dtTmp.addDay(+1);
					if(dtTmp.getDayOfWeek() == MCDate.SATURDAY){
						weekDtTo = dtTmp;
					}
				}
				return weekDtTo;
			}
		}
		// 旬次
		else if (MAC_PERIOD_TYP.isTENDAYS(period_typ)) {
			MCDate baseYm = dt.startOfMonth();
			baseYm = baseYm.addMonth(-1);

			int clDay;
			int lastDay = baseYm.endOfMonth().getDay();
			if (cl_day.gt(lastDay)) {
				clDay = lastDay;
			}
			else {
				clDay = cl_day.intValue();
			}

			MCDate clDtFr = baseYm.addDay(clDay);
			MCDate clDtTo = null;
			boolean lastDayFlg = false;
			if (cl_day.eq(99)) {
				lastDayFlg = true;
				clDtTo = baseYm.addMonth(1).endOfMonth();
			}
			else {
				if (cl_day.intValue() > baseYm.addMonth(1).endOfMonth().getDay()) {
					lastDayFlg = true;
					clDtTo = baseYm.addMonth(1).endOfMonth();
				}
				else {
					clDtTo = baseYm.endOfMonth().addDay(cl_day.intValue());
				}
			}

			int find = 0;
			while (find == 0) {
				if (dt.gteDate(clDtFr) && dt.lteDate(clDtTo)) {
					find = 1;
				}
				else {
					clDtFr = clDtTo.addDay(1);
					if (lastDayFlg) {
						clDtTo = clDtTo.addMonth(1).endOfMonth();
					}
					else {
						clDtTo = clDtTo.addMonth(1);
					}
				}
			}

			int i = 1;
			MCDate tenDtFr = clDtFr;
			MCDate tenDtTo = clDtFr.addDay(9);
			while (i <= 3) {
				if (dt.lt(tenDtFr) || dt.gt(tenDtTo)) {
					tenDtFr = tenDtTo.addDay(1);
					if (i == 1) {
						tenDtTo = tenDtFr.addDay(9);
					}
					else {
						tenDtTo = clDtTo;
					}
					i++;
				}
				else {
					break;
				}
			}
			return tenDtTo;
		}

		return null;
	}
	
	/**
	 * 期間の開始日に、加算期間数を追加した開始日を取得します。
	 * 会計締日は、自社マスタの値を使用します。
	 * 
	 * @param dt 対象日付
	 * @param period_typ 期間区分
	 * @param add 加算期間
	 * @return 開始日付
	 */
	public static MCDate addPeriodStDt(
		MCDate dt,
		String period_typ,
		int add) {
		return object(CLAZZ)._addPeriodStDt(dt, period_typ, add);
	}
	
	protected MCDate _addPeriodStDt(
			MCDate stDt,
			String periodTyp,
			int add) {

		if (isNull(stDt) || isNull(periodTyp) || isNull(add)) {
			return null;
		}

		MCNumber clDt = getCo().ac_cl_day();

		// 日次
		if (MAC_PERIOD_TYP.isDAILY(periodTyp)) {
			return stDt.addDay(add);
		}
		// 月次
		else if (MAC_PERIOD_TYP.isMONTHLY(periodTyp)) {
			MCDate dtFr = getPeriodStDt(stDt, periodTyp, clDt);
			return dtFr.addMonth(add);
		}
		// 週次
		else if (MAC_PERIOD_TYP.isWEEKLY(periodTyp)) {
			MCDate dt = stDt.addDay(add * 7);
			return getPeriodStDt(dt, periodTyp, clDt);
		}
		// 旬次
		else if (MAC_PERIOD_TYP.isTENDAYS(periodTyp)) {
			int i = 0;
			MCDate dt = stDt;
			MCDate tenDtFr = null;
			MCDate tenDtTo = null;
			if (add >= 0) {
				while (i <= add) {
					tenDtFr = getPeriodStDt(dt, periodTyp, clDt);
					tenDtTo = getPeriodEndDt(dt, periodTyp, clDt);
					dt = tenDtTo.addDay(1);
					i++;
				}
			}
			else {
				while (i >= add) {
					tenDtFr = getPeriodStDt(dt, periodTyp, clDt);
					dt = tenDtFr.addDay(-1);
					i--;
				}
			}
			return tenDtFr;
		}

		return null;
	}
	
	/**
	 * 指定期間に含まれるカレンダの稼働日の日数を求めます。
	 *
	 * @return 稼働日の日数
	 */
	public static MCNumber getCalDays(
		MCDate dt_fr,
		MCDate dt_to,
		String cal_cd) {
		return object(CLAZZ)._getCalDays(dt_fr, dt_to, cal_cd);
	}
	
	protected MCNumber _getCalDays(MCDate dt_fr, MCDate dt_to, String cal_cd) {
		MCRow r = MCRow.create();
		sql(createSqlId(LOGIC_ID, "MAPA_DT$F_CAL_DAYS", "_getCalDays"))
				.mainQuery()
				.select(MAPA_DT$F_CAL_DAYS(value(dt_fr), value(dt_to), value(cal_cd))
						.as("cal_days"))
				.executeQuery(r);
		return r.getNumberNE("cal_days");
	}
	/**
	 * 指定期間に含まれるカレンダの稼働日の日数を求めます。
	 * @param resultCol	ファンクション実行結果を受けるカラム名
	 * @param resultL	ファンクション実行結果を受けるリスト
	 * @param bindCols	ファンクション実行条件
	 */
	public static void execCalDaysBatch(String resultCol, MCList<? extends MCRow> resultL, String... bindCols) {
		execDbFuncBatch(
				createSqlId("MAUDL0140", "MAPA_DT$F_CAL_DAYS", "execCalDaysBatch"),
				MABCFunction.getFunctionExecuter("MAPA_DT$F_CAL_DAYS"), resultCol,
				resultL, bindCols);
	}
	/**
	 * カレンダの休日を考慮してリードタイム計算を行います。
	 *
	 * @return リードタイム計算後の日付
	 */
	public static MCDate getCalDate(
		MCDate base_dt,
		MCNumber lt,
		boolean fwd_flg,
		String cal_cd,
		boolean xfr_flg) {
		return object(CLAZZ)._getCalDate(base_dt, lt, fwd_flg, cal_cd, xfr_flg);
	}
	
	protected MCDate _getCalDate(
			MCDate base_dt, 
			MCNumber lt, 
			boolean fwd_flg,
			String cal_cd, 
			boolean xfr_flg) {

		MCRow r = MCRow.create();
		sql(createSqlId(LOGIC_ID, "MAPA_DT$F_CAL_DATE", "_getCalDate"))
				.mainQuery()
				.select(MAPA_DT$F_CAL_DATE(value(base_dt), value(lt), value(fwd_flg), value(cal_cd), value(xfr_flg))
						.as("cal_date"))
				.executeQuery(r);
		return r.getDateNE("cal_date");
	}
	/**
	 * カレンダの休日を考慮してリードタイム計算を行います。
	 * @param resultCol	ファンクション実行結果を受けるカラム名
	 * @param resultL	ファンクション実行結果を受けるリスト
	 * @param bindCols	ファンクション実行条件
	 */
	public static void execCalDateBatch(String resultCol, MCList<? extends MCRow> resultL, String... bindCols) {
		execDbFuncBatch(
				createSqlId("MAUDL0140", "MAPA_DT$F_CAL_DATE", "execCalDateBatch"),
				MABCFunction.getFunctionExecuter("MAPA_DT$F_CAL_DATE"), resultCol,
				resultL, bindCols);
	}
	/**
	 * 場所のカレンダの休日を考慮してリードタイム計算を行います。
	 *
	 * @return リードタイム計算後の日付
	 */
	public static MCDate getCalDateLoc(
		MCDate base_dt,
		MCNumber lt,
		boolean fwd_flg,
		String loc_cd,
		boolean xfr_flg) {

		return object(CLAZZ)._getCalDateLoc(base_dt, lt, fwd_flg, loc_cd, xfr_flg);
	}
	
	protected MCDate _getCalDateLoc(
			MCDate base_dt,
			MCNumber lt,
			boolean fwd_flg,
			String loc_cd,
			boolean xfr_flg) {

		MCRow r = MCRow.create();
		sql(createSqlId(LOGIC_ID, "MAPA_DT$F_CAL_DATE_LOC", "_getCalDateLoc"))
				.mainQuery()
				.select(MAPA_DT$F_CAL_DATE_LOC(value(base_dt), value(lt), value(fwd_flg), value(loc_cd), value(xfr_flg))
						.as("cal_date"))
				.executeQuery(r);
		return r.getDateNE("cal_date");
	}
	
	/**
	 * カレンダの休日を考慮して移動用リードタイム計算を行います。
	 *
	 * @return リードタイム計算後の日付
	 */
	public static MCDate getCalDateMove(
		MCDate base_dt,
		MCNumber lt,
		boolean fwd_flg,
		String fr_cal_cd,
		String fr_loc_cd,
		String to_cal_cd,
		String to_loc_cd) {
		return object(CLAZZ)._getCalDateMove(base_dt, lt, fwd_flg, fr_cal_cd, fr_loc_cd,
				to_cal_cd, to_loc_cd);
	}

	protected MCDate _getCalDateMove(
		MCDate base_dt,
		MCNumber lt,
		boolean fwd_flg,
		String fr_cal_cd,
		String fr_loc_cd,
		String to_cal_cd,
		String to_loc_cd) {

		MCRow r = MCRow.create();
		sql(createSqlId(LOGIC_ID, "MAPA_DT$F_CAL_DATE_MOVE", "_getCalDateMove"))
				.mainQuery()
				.select(MAPA_DT$F_CAL_DATE_MOVE(value(base_dt), value(lt), value(fwd_flg), value(fr_cal_cd), value(fr_loc_cd), value(to_cal_cd), value(to_loc_cd))
						.as("cal_date"))
				.executeQuery(r);
		return r.getDateNE("cal_date");
	}

	/**
	 * 日時比較、対象日時のどちらかの時刻が00:00ならば、日付で比較。
	 * @param dt1 本来小さい日時
	 * @param dt2 本来大きい日時
	 * @return 本来大きい日時が本来小さい日時より小さい場合は、falseを返却。
	 */
	public static boolean isBeforeAfter(MCDate dt1, MCDate dt2) {
		return object(CLAZZ)._isBeforeAfter(dt1, dt2);
	}

	protected boolean _isBeforeAfter(MCDate dt1, MCDate dt2) {
		if (dt1 == null || dt2 == null) {
			return true;
		}

		MCDate c1 = dt1;
		MCDate c2 = dt2;

		if (c1.eqTime(c1.trunc(MCDateFieldType.DAY)) ||
			c2.eqTime(c2.trunc(MCDateFieldType.DAY))) {
			c1 = c1.trunc(MCDateFieldType.DAY);
			c2 = c2.trunc(MCDateFieldType.DAY);
		}

		if (c2.lt(c1)) {
			return false;
		}

		return true;
	}
	/**
	 * 実績日時から会社マスタの日付切替時間を考慮した計上日を取得します。
	 * @param dt 対象日時
	 * @return 日付切替時間を考慮した計上日
	 */
	public static MCDate getAcDt(MCDate dt) {
		return object(CLAZZ)._getAcDt(dt);
	}

	protected MCDate _getAcDt(MCDate dt) {
		if (dt == null) {
			return dt;
		}
		MCNumber offset = nvl(getCo().dt_switch_time(), MCNumber.ZERO);
		return dt.addHour(offset.intValue() * -1).startTimeOfDay();
	}

	/**
	 * 日付項目と時分項目から日時に変換する
	 * 
	 * @param ymd
	 * @param hm
	 * @return
	 */
	public static MCDate getYmdHm(MCDate ymd, MCDate hm) {
		return object(CLAZZ)._getYmdHm(ymd, hm);
	}

	protected MCDate _getYmdHm(MCDate ymd, MCDate hm) {
		if (isNull(ymd)) {
			return null;
		}
		MCDate dt = ymd.startTimeOfDay();
		if (isNull(hm)) {
			return dt;
		}
		else {
			int hour = hm.getHour();
			int minute = hm.getMinute();
			
			return dt.addHour(hour).addMinute(minute);
		}
	}
	
	/**
	 * 日時項目を時分項目に変換する。
	 * 00:00の場合は時刻管理しないとみなしてnullにする
	 * 
	 * @param tm
	 * @return
	 */
	public static MCDate getHm(MCDate tm) {
		return object(CLAZZ)._getHm(tm);
	}
	
	protected MCDate _getHm(MCDate tm) {
		if (isNull(tm)) {
			return null;
		}
		else {
			String charHm = tm.toString("HHmm");
			if (isSame(charHm, "0000")) {
				return null;
			}
			return tm;
		}
	}
	
	/**
	 * 日時項目を日付項目に変換する。
	 * 
	 * @param tm
	 * @return
	 */
	public static MCDate getDt(MCDate tm) {
		return object(CLAZZ)._getDt(tm);
	}
	
	protected MCDate _getDt(MCDate tm) {
		if (isNull(tm)) {
			return null;
		}
		else {
			return tm.trunc(MCDateFieldType.DAY);
		}
	}

	// ///////////////////////////////////////////////
	// getBusinessDay関連（ここから）
	// ///////////////////////////////////////////////
	/**
	 * カレンダを一度に作成するサイズ。<br>
	 * この日数分のカレンダを作成し、営業日が見つからない場合は営業日が見つかるまで、この日数ずつカレンダを作成します。
	 */
	protected int _getCalExSize = MCConst.app.getInteger("MA.MAUCL0140.srch_cal_limit_days", 7);

	/**
	 * 指定されたカレンダにおいて基準日から直近の営業日を返す。<br>
	 * カレンダＣＤが2つ渡された場合、両方のカレンダが営業日の日付を営業日として扱う。
	 * @param baseDt 基準日
	 * @param baTyp 前後区分
	 * @param calCd1 カレンダＣＤ１
	 * @param calCd2 カレンダＣＤ２
	 * @return
	 */
	public static MCDate getBusinessDay(MCDate baseDt, String baTyp, String calCd1, String calCd2) {
		return object(CLAZZ)._getBusinessDay(baseDt, baTyp, calCd1, calCd2);
	}

	// カレンダマスタのキャッシュ Map<カレンダＣＤ, Set<日付、営業日:1/休日:0>>
	protected Map<String, Map<MCDate, MCNumber>> _allCalMap;

	protected MCDate _getBusinessDay(MCDate baseDt, String baTyp, String calCd1, String calCd2) {

		if (isNullAnd(calCd1, calCd2) || null == baTyp || isNull(baseDt)) {
			return baseDt;
		}
		if (null == _allCalMap) {
			_allCalMap = new HashMap<String, Map<MCDate, MCNumber>>();
		}
		// 片方のカレンダＣＤがNULLの場合はもう片方のカレンダＣＤのみで営業日を決定する
		if (isNull(calCd2)) {
			return getBusinessDaySub(baseDt, baTyp, calCd1);
		}
		if (isNull(calCd1)) {
			return getBusinessDaySub(baseDt, baTyp, calCd2);
		}
		// 同じカレンダＣＤの場合
		if (isSame(calCd1, calCd2)) {
			return getBusinessDaySub(baseDt, baTyp, calCd1);
		}
		// 異なるカレンダＣＤの場合は両方のカレンダで営業日となる日付を求める
		return mergeBusinessDay(baseDt, baTyp, calCd1, calCd2);

	}

	protected MCDate mergeBusinessDay(MCDate baseDt, String baTyp, String calCd1, String calCd2) {

		MCDate businessDay1 = getBusinessDaySub(baseDt, baTyp, calCd1);
		MCDate businessDay2 = getBusinessDaySub(baseDt, baTyp, calCd2);
		if (isSame(businessDay1, businessDay2)) {
			return businessDay1;
		}
		// 前倒しの場合は早いほうの日付で再取得
		if (MAC_BA_TYP.isBF(baTyp)) {
			MCDate newTempDt = businessDay1.lt(businessDay2) ? businessDay1 : businessDay2;
			return mergeBusinessDay(newTempDt, baTyp, calCd1, calCd2);
		}
		// 後ろ倒しの場合は遅いほうの日付で再取得
		else {
			MCDate newTempDt = businessDay1.lt(businessDay2) ? businessDay2 : businessDay1;
			return mergeBusinessDay(newTempDt, baTyp, calCd1, calCd2);
		}
	}

	protected MCDate getBusinessDaySub(MCDate baseDt, String baTyp, String calCd) {

		Map<MCDate, MCNumber> calMap = _allCalMap.get(calCd);
		if (null == calMap) {
			createCalCache(baseDt, baTyp, calCd, calMap);
			calMap = _allCalMap.get(calCd);
		}
		MCDate tempDt = baseDt;
		int moveCnt = MAC_BA_TYP.isBF(baTyp) ? -1 : 1;
		while (true) {
			MCNumber isBusinessDay = calMap.get(tempDt);
			if (!isNull(isBusinessDay)) {
				// 営業日の場合は該当の日付を返す
				if (isSame(isBusinessDay, MCNumber.ONE)) {
					return tempDt;
				}
				tempDt = tempDt.addDay(moveCnt);
			}
			else {
				createCalCache(tempDt, baTyp, calCd, calMap);
			}
		}
	}

	protected void createCalCache(MCDate baseDt, String baTyp, String calCd, Map<MCDate, MCNumber> calMap) {

		// カレンダ毎の初回の検索
		if (null == calMap) {
			calMap = new HashMap<MCDate, MCNumber>();
			_allCalMap.put(calCd, calMap);
			if (MAC_BA_TYP.isBF(baTyp)) {
				MCDate minDt = baseDt.addDay(-1 * _getCalExSize);
				setCalMap(minDt, baseDt, calCd, baTyp, calMap);
			}
			else {
				MCDate maxDt = baseDt.addDay(_getCalExSize);
				setCalMap(baseDt, maxDt, calCd, baTyp, calMap);
			}
		}
		else {
			if (calMap.containsKey(baseDt)) {
				// 既に検索済みの基準日
				return;
			}
			else {
				if (MAC_BA_TYP.isBF(baTyp)) {
					MCDate minDt = baseDt.addDay(-1 * _getCalExSize);
					setCalMap(minDt, baseDt, calCd, baTyp, calMap);
				}
				else {
					MCDate maxDt = baseDt.addDay(_getCalExSize);
					setCalMap(baseDt, maxDt, calCd, baTyp, calMap);
				}
			}
		}
	}

	/**
	 * カレンダ情報のキャッシュを作成する
	 * 
	 * @param stDt 作成開始日
	 * @param endDt 作成終了日
	 * @param calCd カレンダＣＤ
	 * @param calMap キャッシュ
	 */
	protected void setCalMap(MCDate stDt, MCDate endDt, String calCd, String baTyp,
			Map<MCDate, MCNumber> calMap) {
		
		MCList<MAM_CAL_R> calL = srchCal(stDt, endDt, calCd);
		MCList<MAM_CAL_EXT_R> extL = srchCalExt(stDt, endDt, calCd);
		MCIndexKey extKey = extL.createIndex(MAM_CAL_EXT_R.$dt);
		MCDate tempDt = stDt;
		// カレンダマスタが0件の場合
		if (calL.isEmpty()) {
			for (; tempDt.lte(endDt); tempDt = tempDt.addDay(1)) {
				calMap.put(tempDt, getCalStsNumber(tempDt, extL, extKey, null));
			}
			return;
		}
		// カレンダマスタが1件以上存在する場合
		for (int i = 0; i < calL.size(); i++) {
			MAM_CAL_R calR = calL.get(i);
			for (; tempDt.lte(endDt); tempDt = tempDt.addDay(1)) {
				// カレンダ作成対象日付が開始日終了日の範囲内か
				if (calR.st_dt().lte(tempDt) && tempDt.lte(calR.end_dt())) {
					calMap.put(tempDt, getCalStsNumber(tempDt, extL, extKey, calR));
				}
				else if (tempDt.gt(calR.end_dt()) && i < calL.size() - 1) {
					// カレンダ作成対象日付が終了日よりも後で、次のカレンダが存在するの場合は次のカレンダを処理する
					// カレンダの開始日よりも前の場合はカレンダ作成対象日付を1日進めて処理を継続する
					break;
				}
				else {
					// カレンダ作成対象期間内で、処理するカレンダが残っていない場合
					calMap.put(tempDt, getCalStsNumber(tempDt, extL, extKey, null));
				}
			}
		}
	}

	protected MCList<MAM_CAL_R> srchCal(MCDate stDt, MCDate endDt, String calCd) {
		MCList<MAM_CAL_R> calL = MCList.create(MAM_CAL_R.class);
		MAM_CAL_R t = MAM_CAL_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
		builder.setWhere(
				t.st_dt.between(bind("1"), bind("2"))
						.or(t.end_dt.between(bind("1"), bind("2")))
						.or(t.st_dt.lte(bind("1"))).and(bind("2").lte(t.end_dt)),
				stDt, endDt);
		builder.addWhereWithAnd(t.cal_cd.eq(bind("1")), calCd);
		builder.setOrderByAsc(t.st_dt);
		dbSelect(createSqlId(LOGIC_ID, t, "S01"), calL, builder);
		return calL;
	}

	protected MCList<MAM_CAL_EXT_R> srchCalExt(MCDate stDt, MCDate endDt, String calCd) {
		MCList<MAM_CAL_EXT_R> extL = MCList.create(MAM_CAL_EXT_R.class);
		MAM_CAL_EXT_R t = MAM_CAL_EXT_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
		builder.setWhere(t.cal_cd.eq(bind("1")), calCd);
		builder.addWhereWithAnd(t.dt.between(bind("1"), bind("2")), stDt, endDt);
		dbSelect(createSqlId(LOGIC_ID, t, "S02"), extL, builder);
		return extL;
	}
	
	/**
	 * 臨時カレンダマスタ、カレンダマスタの設定に応じて基準日が営業日（=1）か休日（=0）かを返す
	 * @param baseDt 基準日
	 * @param extL 臨時カレンダ
	 * @param extKey 臨時カレンダのインデックス
	 * @param calR カレンダマスタ。無い場合はNULL。
	 * @return 営業日：1、休日：0
	 */
	protected MCNumber getCalStsNumber(MCDate baseDt,MCList<MAM_CAL_EXT_R> extL, MCIndexKey extKey, MAM_CAL_R calR) {

		MAM_CAL_EXT_R extR = extL.getFirst(extKey, baseDt);
		// 臨時カレンダによる判定
		if (!isNull(extR)) {
			if (extR.off_flg()) {
				return MCNumber.ZERO;
			}
			else {
				return MCNumber.ONE;
			}
		}
		else {
			// カレンダマスタによる判定
			if (!isNull(calR)) {
				if (isCalBusinessDay(baseDt, calR)) {
					return MCNumber.ONE;
				}
				else {
					return MCNumber.ZERO;
				}
			}
			// カレンダマスタが無い期間
			else {
				if (isNoCalAsBusinessDay()) {
					return MCNumber.ONE;
				}
				else {
					return MCNumber.ZERO;
				}
			}
		}
	}

	protected boolean isCalBusinessDay(MCDate baseDt, MAM_CAL_R calR) {

		MAC_DAY_WEEK_TYP typ = MAC_DAY_WEEK_TYP.toDayWeekTyp(baseDt);
		if (MAC_DAY_WEEK_TYP.isSUN(typ)) {
			return calR.sun_off_flg() ? false : true;
		}
		else if (MAC_DAY_WEEK_TYP.isMON(typ)) {
			return calR.mon_off_flg() ? false : true;
		}
		else if (MAC_DAY_WEEK_TYP.isTUE(typ)) {
			return calR.tue_off_flg() ? false : true;
		}
		else if (MAC_DAY_WEEK_TYP.isWED(typ)) {
			return calR.wed_off_flg() ? false : true;
		}
		else if (MAC_DAY_WEEK_TYP.isTHU(typ)) {
			return calR.thu_off_flg() ? false : true;
		}
		else if (MAC_DAY_WEEK_TYP.isFRI(typ)) {
			return calR.fri_off_flg() ? false : true;
		}
		else {
			return calR.sat_off_flg() ? false : true;
		}
	}

	/**
	 * カレンダマスタが存在しない日付を営業日として扱う場合にtrueを返す。
	 * 休日として扱う場合はカスタマイズ。
	 * @return
	 */
	protected boolean isNoCalAsBusinessDay() {
		// true固定
		return true;
	}
	// ///////////////////////////////////////////////
	// getBusinessDay関連（ここまで）
	// ///////////////////////////////////////////////
	
	
	/**
	 * Srch01オペレーション.<p>
	 *
	 * DUMMY<br>
	 */
	public class Srch01 extends MAUCL_DateUtil_MC_A.Srch01 {
		@Override
		protected void call() {
			// オペレーションの実装
		}
	}

	//FMCB CUSTOM END
}