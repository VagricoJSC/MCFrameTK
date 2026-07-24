package mcframe.serverMAUC.MAUCL0020;

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
import mcframe.serverMAUC.MAUCL0060.ElmArgsR;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
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
import mcframe.serverMA.dbc.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.commonCore.login.MCAuth;
import mcframe.serverCore.login.MCUserAuthAgent;
import static mcframe.serverCore.requester.MCRequestObject.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MAUCL_AppSys"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MAUCL_AppSys_MC extends MAUCL_AppSys_MC_A{
	//FMCB CUSTOM START

	// スレッドセーフ対応（ここから）
	/**
	 * このクラス（スレッドセーフ対応用）
	 */
	protected static final Class<MAUCL_AppSys> CLAZZ = MAUCL_AppSys.class;

	// スレッドセーフ対応（ここまで）

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 会社情報の取得（クライアントとの通信用）<br>
	 */
	public class Srch01 extends MAUCL_AppSys_MC_A.Srch01 {
		@Override
		protected void call() {
			MCRow.copyall(down0().co(), getCo());
		}
	}

	/**
	 * 自社情報を取得する<br>
	 * 二回目の呼び出しからはキャッシュから自社情報を返す
	 *
	 * @return 自社情報
	 */
	public static MAM_CO_R getCo() {
		MAUCL_AppSys clazz = object(CLAZZ);
		if (clazz == null) {
			return MAM_CO_R.create();
		}
		return object(CLAZZ)._getCo();
	}

	/** 自社情報キャッシュ用 */
	protected MAM_CO_R _co = null;

	/**
	 * 自社情報を取得する<br>
	 * 二回目の呼び出しからはキャッシュから自社情報を返す
	 *
	 * @return 自社情報
	 */
	protected MAM_CO_R _getCo() {
		if (_co == null) {
			MAM_CO_R coR = MAM_CO_R.create();
			MAM_CO_R t = MAM_CO_R.create("T");
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
			builder.addSelect(t.getColumn$(MAM_CO_R.$co_nm));
			int ret = dbSelect(createSqlId(LOGIC_ID, t, "S01"), coR, builder);
			if (ret == 0) {
				throw new MCAppException(msgCoNotFoundInDB());
			}
			_co = coR;
		}
		return _co;
	}

	/**
	 * 自社情報がＤＢから取得できない場合のメッセージ
	 *
	 * @return
	 */
	protected MCMessage msgCoNotFoundInDB() {
		return new MCMessage(MAUCL0004);
	}

	/**
	 * Srch02オペレーション.<p>
	 *
	 * システムパラメータを取得します。<br>
	 */
	public class Srch02 extends MAUCL_AppSys_MC_A.Srch02 {
		@Override
		protected void call() {
				
			MCList<SysParmR> sysParmL = MCList.create(SysParmR.class);
			_getSysParmAll();
			
			for(MAM_SYS_PARM_R r: _sysParm){
				SysParmR sysParmR = SysParmR.create();
				sysParmR.parm_key(r.parm_key());
				sysParmR.parm_val(r.parm_val());
				sysParmL.add(sysParmR);
			}
			down0().setAll(sysParmL);
		}
	}

	/**
	 * システムパラメータを取得する
	 * 
	 *@param parm_key パラメータキー
	 * @return システムパラメータ
	 */
	public static String getSysParm(String parm_key) {
		MAUCL_AppSys clazz = object(CLAZZ);
		if (clazz == null) {
			return null;
		}
		String sysParm = object(CLAZZ)._getSysParm(parm_key);

		if (isSame(parm_key, "ITM_SUB_TYP") || isSame(parm_key, "SNO_TYP") || isSame(parm_key, "BASE_CUR_FLG")) {
			try {
				Integer.parseInt(sysParm);
			}
			catch (NumberFormatException e) {
				sysParm = "0";
			}
		}

		return sysParm;
	}
	/**
	 * システムパラメータを取得する（エラーなし）
	 * 
	 *@param parm_key パラメータキー
	 * @return システムパラメータ
	 */
	public static String getSysParmNE(String parm_key) {
		try {
			return getSysParm(parm_key);
		} catch (MCAppException e) {
			return null;
		}
	}
	/** システムパラメータ */
	MCList<MAM_SYS_PARM_R> _sysParm = MCList.create(MAM_SYS_PARM_R.class);

	/**
	 * システムパラメータを取得する
	 * 
	 * @param parm_key パラメータキー
	 * @return システムパラメータ
	 */
	protected String _getSysParm(String parm_key) {

		return getParmVal(_getSysParmAll(), parm_key);
	}

	/**
	 * システムパラメータを全て取得する
	 * 
	 * @return システムパラメータ
	 */
	protected MCList<MAM_SYS_PARM_R> _getSysParmAll() {

		if (!_sysParm.isEmpty()) {
			return _sysParm;
		}

		MCList<MAM_SYS_PARM_R> dbcL = MCList.create(MAM_SYS_PARM_R.class);
		MAM_SYS_PARM_R t = MAM_SYS_PARM_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
		builder.setWhere(t.del_flg.eq(value(false)));
		builder.setSelect(t.parm_key);
		builder.addSelect(t.parm_val);
		dbSelect(createSqlId(LOGIC_ID, t, "S01"), dbcL, builder);

		MAM_SYS_PARM_R dbc;
		boolean isLicenseEnable = MCUserAuthAgent.usableProduct(MCAuth.PROD_MEDICINE);
		// 版管理機能有効化ＦＬＧ
		dbc = dbcL.getFirst(MAM_SYS_PARM_R.$parm_key, "VER_ENABLE_FLG");
		if (dbc != null) {
			dbc.parm_val(isLicenseEnable && isSame(dbc.parm_val(), "1") ? "1" : "0");
		}
		else {
			MAM_SYS_PARM_R r = MAM_SYS_PARM_R.create();
			r.parm_key("VER_ENABLE_FLG");
			r.parm_val("0");
			dbcL.add(r);
		}
		// 有効成分機能有効化ＦＬＧ
		dbc = dbcL.getFirst(MAM_SYS_PARM_R.$parm_key, "CONT_FCTR_ENABLE_FLG");
		if (dbc != null) {
			dbc.parm_val(isLicenseEnable && isSame(dbc.parm_val(), "1") ? "1" : "0");
		}
		else {
			MAM_SYS_PARM_R r = MAM_SYS_PARM_R.create();
			r.parm_key("CONT_FCTR_ENABLE_FLG");
			r.parm_val("0");
			dbcL.add(r);
		}
		// 製造承認・市場出荷判定・検査承認機能有効化ＦＬＧ
		dbc = dbcL.getFirst(MAM_SYS_PARM_R.$parm_key, "MFG_APRV_ENABLE_FLG");
		if (dbc != null) {
			dbc.parm_val(isLicenseEnable && isSame(dbc.parm_val(), "1") ? "1" : "0");
		}
		else {
			MAM_SYS_PARM_R r = MAM_SYS_PARM_R.create();
			r.parm_key("MFG_APRV_ENABLE_FLG");
			r.parm_val("0");
			dbcL.add(r);
		}
		// 収率機能有効化ＦＬＧ
		dbc = dbcL.getFirst(MAM_SYS_PARM_R.$parm_key, "YIELD_ENABLE_FLG");
		if (dbc != null) {
			dbc.parm_val(isLicenseEnable && isSame(dbc.parm_val(), "1") ? "1" : "0");
		}
		else {
			MAM_SYS_PARM_R r = MAM_SYS_PARM_R.create();
			r.parm_key("YIELD_ENABLE_FLG");
			r.parm_val("0");
			dbcL.add(r);
		}
		// 検査中使用許可使用ＦＬＧ
		dbc = dbcL.getFirst(MAM_SYS_PARM_R.$parm_key, "IN_PRMT_INSP_ENABLE_FLG");
		if (dbc != null) {
			dbc.parm_val(isSame(dbc.parm_val(), "1") ? "1" : "0");
		}
		else {
			MAM_SYS_PARM_R r = MAM_SYS_PARM_R.create();
			r.parm_key("IN_PRMT_INSP_ENABLE_FLG");
			r.parm_val("0");
			dbcL.add(r);
		}
		// 移動実績マイナス在庫許可ＦＬＧ
		dbc = dbcL.getFirst(MAM_SYS_PARM_R.$parm_key, "MINUS_STK_XFR_FLG");
		if (dbc != null) {
			dbc.parm_val(isSame(dbc.parm_val(), "1") ? "1" : "0");
		}
		else {
			MAM_SYS_PARM_R r = MAM_SYS_PARM_R.create();
			r.parm_key("MINUS_STK_XFR_FLG");
			r.parm_val("0");
			dbcL.add(r);
		}
		// 出荷実績マイナス在庫許可ＦＬＧ
		dbc = dbcL.getFirst(MAM_SYS_PARM_R.$parm_key, "MINUS_STK_SHIP_FLG");
		if (dbc != null) {
			dbc.parm_val(isSame(dbc.parm_val(), "1") ? "1" : "0");
		}
		else {
			MAM_SYS_PARM_R r = MAM_SYS_PARM_R.create();
			r.parm_key("MINUS_STK_SHIP_FLG");
			r.parm_val("0");
			dbcL.add(r);
		}

		_sysParm.addAll(dbcL);
		return _sysParm;
	}
	
	protected String getParmVal(MCList<MAM_SYS_PARM_R>sysParmL, String parm_key) {
		if (sysParmL.isEmpty()) {
			throw new MCAppException(MAUCL0106, parm_key);
		}

		MAM_SYS_PARM_R sysParmR = sysParmL.getFirst(MAM_SYS_PARM_R.$parm_key, parm_key);
		if (sysParmR == null) {
			throw new MCAppException(MAUCL0106, parm_key);
		}
		else {
			return sysParmR.parm_val();
		}
	}
	/**
	 * システムパラメータ(BASE_CUR_FLG)が設定されているか判定する。
	 * @return 判定結果
	 */
	public static boolean isBaseCurFlg() {
		String paramVal = getSysParmNE("BASE_CUR_FLG");
		if (isSame(paramVal, "1")) {
			return true;
		}
		return false;
	}
	/**
	 * システムパラメータ(WRK_ENABLE_FLG)が有効か判定する。
	 * @return 判定結果
	 */
	public static boolean isWrkEnableFlg() {
		String paramVal = getSysParmNE("WRK_ENABLE_FLG");	
		if (isSame(paramVal, "1")) {
			return true;
		}
		return false;
	}
	/**
	 * システムパラメータ（SNO_TYP）を返します。
	 * 
	 * @return システムパラメータ（SNO_TYP）
	 */
	public static int getSnoTyp() {
		String param = getSysParmNE("SNO_TYP");
		if (!isNull(param)) {
			int result = Integer.parseInt(param);
			if (result >= 1 && result <= 4) {
				return result;
			}
		}
		return 0;
	}
	/**
	 * Srch03オペレーション.<p>
	 *
	 * 対象期間マスタを取得します。<br>
	 */
	public class Srch03 extends MAUCL_AppSys_MC_A.Srch03 {
		@Override
		protected void call() {
			termInfo();
		}

		protected void termInfo() {
			
			down0().setAll(MCList.createByName(TermR.class, getTermList()));
		}
	}

	/**
	 * 対象期間マスタのキャッシュ
	 * <P>
	 * {@link MAM_TERM_R#$term} の昇順にソートされている
	 */
	protected MCList<MAM_TERM_R> _termList;

	/**
	 * 対象期間マスタ情報を返します
	 * @return 対象期間マスタ情報
	 */
	public static MCList<MAM_TERM_R> getTermList() {
		return object(CLAZZ)._getTermList();
	}
	protected MCList<MAM_TERM_R> _getTermList() {
		if (_termList == null) {
			MCList<MAM_TERM_R> dbc = MCList.create(MAM_TERM_R.class);
			MAM_TERM_R t = MAM_TERM_R.create("T");
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
			builder.addOrderByAsc(t.term);
			dbSelect(createSqlId(LOGIC_ID, t, "S01"), dbc, builder);
			_termList = dbc;
		}
		return _termList;
	}

	/**
	 * 年月が含まれる対象期間の情報を返します
	 * @param ym 年月
	 * @return 対象期間レコード
	 */
	public static MAM_TERM_R getTermInfoYM(MCDate ym) {
		return object(CLAZZ)._getTermInfoYM(ym, 0);
	}

	/**
	 * 年月が含まれる対象期間の情報を返す。
	 * <P>
	 * 年月が含まれる対象期間から期間調整 で指定された
	 * 期間進めた（＝未来）期間を返す。<br>
	 * 期間調整が 負の値の場合は、指定された数値の分だけ前（＝過去）の
	 * 期間を返す。
	 * @param ym 年月
	 * @param diff 期間調整
	 * @return 対象期間レコード
	 */
	protected MAM_TERM_R _getTermInfoYM(MCDate ym, int diff) {
		if (ym == null) {
			return null;
		}

		MCList<MAM_TERM_R> tList = _getTermList();

		int rowIndex;

		for (rowIndex = 0; rowIndex < tList.size(); rowIndex++) {
			MAM_TERM_R currentTerm = tList.get(rowIndex);
			if (ym.gte(currentTerm.term())
					&& ym.lt(currentTerm.term_end_ym())) {
				break;
			}
		}
		int ansIndex = rowIndex + diff;
		if (ansIndex < 0 || ansIndex >= _termList.size()) {
			return null;
		}
		return _termList.get(ansIndex);
	}

	/**
	 * 日付に対応する計上月度を取得する
	 * @param base_dt 日付(YMD)
	 * @return 計上月度(YM)
	 */
	public static MCDate getAcYm(MCDate base_dt) {
		return object(CLAZZ)._getAcYm(base_dt);
	}

	protected MCDate _getAcYm(MCDate base_dt) {
		MAM_CO_R dbc = getCo();

		if (isNull(base_dt)) {
			return null;
		}
		MCDate tmpym;
		if (dbc.ac_cl_day().lt(base_dt.getDay())) {
			tmpym = base_dt.trunc(MCDateFieldType.MONTH).addMonth(1);
		}
		else {
			tmpym = base_dt.trunc(MCDateFieldType.MONTH);
		}
		MCDate acYm = tmpym.addMonth(dbc.ac_cl_mon_base());
		return acYm;
	}

	/**
	 * Srch04オペレーション.<p>
	 *
	 * 基準通貨情報の取得（クライアントとの通信用）<br>
	 */
	public class Srch04 extends MAUCL_AppSys_MC_A.Srch04 {
		@Override
		protected void call() {
			MCRow.copyall(down0().bc(), getBaseCur());
		}
	}

	/**
	 * 基準通貨情報を取得する<br>
	 * 二回目の呼び出しからはキャッシュから基準通貨情報を返す
	 *
	 * @return 基準通貨情報
	 */
	public static MAM_CUR_R getBaseCur() {
		return object(CLAZZ)._getBaseCur();
	}

	/** 基準通貨情報キャッシュ用 */
	protected MAM_CUR_R _baseCur = null;

	/**
	 * 基準通貨情報を取得する<br>
	 * 二回目の呼び出しからはキャッシュから基準通貨情報を返す
	 *
	 * @return 基準通貨情報
	 */
	protected MAM_CUR_R _getBaseCur() {
		if (_baseCur == null) {
			MAM_CUR_R baseCurR = MAM_CUR_R.create();
			MAM_CUR_R t = MAM_CUR_R.create("T");
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
			int ret = dbSelectKey(createSqlId(LOGIC_ID, t, "S01"), baseCurR, builder, getCo().base_cur_cd());
			if (ret == 0) {
				throw new MCAppException(msgBaseCurNotFoundInDB());
			}
			_baseCur = baseCurR;
		}
		return _baseCur;
	}

	/**
	 * 基準通貨情報がＤＢから取得できない場合のメッセージ
	 *
	 * @return
	 */
	protected MCMessage msgBaseCurNotFoundInDB() {
		return new MCMessage(MAUCL0005);
	}

	/**
	 * Srch05オペレーション.<p>
	 *
	 * 納税通貨情報の取得（クライアントとの通信用）<br>
	 */
	public class Srch05 extends MAUCL_AppSys_MC_A.Srch05 {
		@Override
		protected void call() {
			MCRow.copyall(down0().pc(), getPtaxCur());
		}
	}

	/**
	 * 納税通貨情報を取得する<br>
	 * 二回目の呼び出しからはキャッシュから納税通貨情報を返す
	 *
	 * @return 納税通貨情報
	 */
	public static MAM_CUR_R getPtaxCur() {
		return object(CLAZZ)._getPtaxCur();
	}

	/** 納税通貨情報キャッシュ用 */
	protected MAM_CUR_R _ptaxCur = null;

	/**
	 * 納税通貨情報を取得する<br>
	 * 二回目の呼び出しからはキャッシュから納税通貨情報を返す
	 *
	 * @return 納税通貨情報
	 */
	protected MAM_CUR_R _getPtaxCur() {
		if (_ptaxCur == null) {
			if (isNull(getCo().ptax_cur_cd())) {
				return _ptaxCur = MAM_CUR_R.create();
			}
			MAM_CUR_R ptaxCurR = MAM_CUR_R.create();
			MAM_CUR_R t = MAM_CUR_R.create("T");
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
			int ret = dbSelectKey(createSqlId(LOGIC_ID, t, "S02"), ptaxCurR, builder, getCo().ptax_cur_cd());
			if (ret == 0) {
				throw new MCAppException(msgPtaxCurNotFoundInDB());
			}
			_ptaxCur = ptaxCurR;
		}
		return _ptaxCur;
	}

	/**
	 * 納税通貨情報がＤＢから取得できない場合のメッセージ
	 *
	 * @return
	 */
	protected MCMessage msgPtaxCurNotFoundInDB() {
		return new MCMessage(MAUCL0009);
	}

	/**
	 * Srch06オペレーション.<p>
	 *
	 * デフォルトの格付情報の取得（クライアントとの通信用）<br>
	 */
	public class Srch06 extends MAUCL_AppSys_MC_A.Srch06 {
		@Override
		protected void call() {
			MCRow.copyall(down0().gd(), getDefaultFeedStkGd());
		}
	}

	/**
	 * デフォルト格付情報を取得する<br>
	 * 二回目の呼び出しからはキャッシュからデフォルト格付情報を返す
	 *
	 * @return デフォルト格付情報
	 */
	public static MAM_STK_GD_R getDefaultFeedStkGd() {
		return object(CLAZZ)._getDefaultFeedStkGd();
	}

	/**
	 * デフォルト格付キャッシュ用
	 */
	protected MAM_STK_GD_R _defaultFeedStkGd = null;

	/**
	 * デフォルト格付情報を取得する<br>
	 * 二回目の呼び出しからはキャッシュからデフォルト格付情報を返す
	 *
	 * @return デフォルト格付情報
	 */
	protected MAM_STK_GD_R _getDefaultFeedStkGd() {
		if (_defaultFeedStkGd == null) {
			MAM_STK_GD_R stkGdR = MAM_STK_GD_R.create();
			MAM_STK_GD_R t = MAM_STK_GD_R.create("T");
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
			builder.setWhere(t.gd_cd.eq(MAPA_UTIL$F_GET_DEF_GD_CD()));
			dbSelect(createSqlId(LOGIC_ID, t, "S01"), stkGdR, builder);

			_defaultFeedStkGd = stkGdR;
		}
		return _defaultFeedStkGd;
	}
	
	/**
	 * Srch07オペレーション.<p>
	 *
	 * ライセンス情報の取得（クライアントとの通信用）<br>
	 */
	public class Srch07 extends MAUCL_AppSys_MC_A.Srch07 {
		@Override
		protected void call() {
			down0().medicine_enable_flg(MCUserAuthAgent.usableProduct(MCAuth.PROD_MEDICINE));
			down0().plmlink_enable_flg(MCUserAuthAgent.usableProduct(MCAuth.PROD_PLMLINK));
		}
		
	}

	/**
	 * Srch08オペレーション.<p>
	 *
	 * マスタ参照用データベースリンク情報の取得（クライアントとの通信用）<br>
	 */
	public class Srch08 extends MAUCL_AppSys_MC_A.Srch08 {
		@Override
		protected void call() {
			MCRow.copyall(down0().db(), getMstDblink());
		}
	}
	/**
	 * マスタ参照用データベースリンク情報を取得する<br>
	 * 二回目の呼び出しからはキャッシュから返す
	 *
	 * @return マスタ参照用データベースリンク情報
	 */
	public static MAM_MST_DBLINK_R getMstDblink() {
		return object(CLAZZ)._getMstDblink();
	}
	/**
	 * マスタ参照用データベースリンク情報キャッシュ用
	 */
	protected MAM_MST_DBLINK_R _mstDblink = null;
	/**
	 * マスタ参照用データベースリンク情報を取得する<br>
	 * 二回目の呼び出しからはキャッシュから返す
	 *
	 * @return マスタ参照用データベースリンク情報
	 */
	protected MAM_MST_DBLINK_R _getMstDblink() {
		if (_mstDblink == null) {
			MAM_MST_DBLINK_R dbc = MAM_MST_DBLINK_R.create();
			MAM_MST_DBLINK_R t = MAM_MST_DBLINK_R.create("T");
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
			builder.addMax(t.dblink_nm, MAM_MST_DBLINK_R.$dblink_nm);
			dbSelect(createSqlId(LOGIC_ID, t, "S01"), dbc, builder);
			_mstDblink = dbc;
		}
		return _mstDblink;
	}
	/**
	 * Srch09オペレーション.<p>
	 *
	 * 原価会社パラメータ情報の取得（クライアントとの通信用）<br>
	 */
	public class Srch09 extends MAUCL_AppSys_MC_A.Srch09 {
		@Override
		protected void call() {
			MCRow.copyall(down0().co(), getCoParm());
		}
	}
	/**
	 * 原価会社パラメータ情報を取得する<br>
	 *
	 * @return 原価会社パラメータ情報
	 */
	public static MAM_CO_PARM_R getCoParm() {
		return object(CLAZZ)._getCoParm();
	}

	/** 原価会社パラメータ情報キャッシュ用 */
	protected MAM_CO_PARM_R _coParm = null;

	/**
	 * 原価会社パラメータ情報を取得する<br>
	 * 二回目の呼び出しからはキャッシュから返す
	 *
	 * @return 原価会社パラメータ
	 */
	protected MAM_CO_PARM_R _getCoParm() {
		if (_coParm == null) {
			MCList<MAM_CO_PARM_R> dbc = MCList.create(MAM_CO_PARM_R.class);
			MAM_CO_PARM_R t = MAM_CO_PARM_R.create("T");
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
			int ret = dbSelect(createSqlId(LOGIC_ID, t, "S01"), dbc, builder);
			if (ret == 0) {
				throw new MCAppException(msgCoParmNotFoundInDB());
			}
			_coParm = dbc.get(0);
		}
		return _coParm;
	}

	/**
	 * 原価会社パラメータ情報がＤＢから取得できない場合のメッセージ
	 */
	protected MCMessage msgCoParmNotFoundInDB() {
		return new MCMessage(MAUCL0037);
	}
	/**
	 * Srch10オペレーション.<p>
	 *
	 * ログインユーザ担当者権限マスタ取得（クライアントとの通信用）<br>
	 */
	public class Srch10 extends MAUCL_AppSys_MC_A.Srch10 {
		@Override
		protected void call() {
			MCRow.copyall(down0().usr(), getUsrAcl());
		}
	}

	/**
	 * 担当者権限情報を取得する<br>
	 * 二回目の呼び出しからはキャッシュから担当者権限情報を返す
	 *
	 * @return 担当者権限情報
	 */
	public static MAM_USR_ACL_R getUsrAcl() {
		return object(CLAZZ)._getUsrAcl();
	}

	/** 担当者権限情報キャッシュ用 */
	protected MAM_USR_ACL_R _usrAcl = null;

	/**
	 * 担当者権限情報を取得する<br>
	 * 二回目の呼び出しからはキャッシュから担当者権限情報を返す
	 *
	 * @return 担当者権限情報
	 */
	protected MAM_USR_ACL_R _getUsrAcl() {
		if (_usrAcl == null) {
			MAM_USR_ACL_R usrAclR = MAM_USR_ACL_R.create();
			MAM_USR_ACL_R t = MAM_USR_ACL_R.create("T");
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
			builder.setWhere(t.usr_cd.eq(bind("1")), mcframe.serverCore.sys.MCSys.user.ID());
			builder.addWhereWithAnd(t.st_dt.lte(bind("1")), getToday());
			builder.addWhereWithAnd(t.end_dt.gte(bind("1")), getToday());
			dbSelect(createSqlId(LOGIC_ID, t, "S01"), usrAclR, builder);

			_usrAcl = usrAclR;
		}
		return _usrAcl;
	}
	
	
	/**
	 * 外部システムＣＤ、ログインユーザＣＤを元に外部システムユーザマスタ情報を取得する<br>
	 * @param ext_sys_cd 外部システムＣＤ
	 * @return 外部システムユーザマスタ情報
	 * usr_cdにはログインユーザのユーザＣＤを設定する。
	 */
	public static MAM_EXT_SYS_USR_R getExtSysUsrNE(String ext_sys_cd) {
		return object(CLAZZ)._getExtSysUsrNE(ext_sys_cd, mcframe.serverCore.sys.MCSys.user.ID());
	}
	
	/**
	 * 外部システムＣＤ、mcframeのユーザＣＤを元に外部システムユーザマスタ情報を取得する<br>
	 * @param ext_sys_cd 外部システムＣＤ
	 * @param usr_cd mcframeのユーザＣＤ
	 * @return 外部システムユーザマスタ情報
	 * usr_cdにはmcframeのユーザＣＤを設定する。
	 */
	public static MAM_EXT_SYS_USR_R getExtSysUsrNE(String ext_sys_cd, String usr_cd) {
		return object(CLAZZ)._getExtSysUsrNE(ext_sys_cd, usr_cd);
	}
	
	/**
	 * 外部システムＣＤ、mcframeのユーザＣＤを元に外部システムユーザマスタ情報を取得する<br>
	 * @param ext_sys_cd 外部システムＣＤ
	 * @param usr_cd mcframeのユーザＣＤ
	 * @return 外部システムユーザマスタ情報
	 */
	protected MAM_EXT_SYS_USR_R _getExtSysUsrNE(String ext_sys_cd, String usr_cd) {
		if(isNullOr(ext_sys_cd,usr_cd)) {
			return null;
		}
		MCList<MAM_EXT_SYS_USR_R> extSysUsrL = MCList.create(MAM_EXT_SYS_USR_R.class);
		MAM_EXT_SYS_USR_R t = MAM_EXT_SYS_USR_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
		builder.setWhere(t.del_flg.eq(value(false)));
		builder.addWhereWithAnd(t.ext_sys_cd.eq(bind("1")),ext_sys_cd);
		builder.addWhereWithAnd(t.usr_cd.eq(bind("1")).or(t.usr_cd.eq(value(MAC_STR.NULL_VAL.value()))),usr_cd); 
		dbSelect(createSqlId(LOGIC_ID, t, "S01"), extSysUsrL, builder);
		
		MAM_EXT_SYS_USR_R extSysUsrR = extSysUsrL.getFirst(MAM_EXT_SYS_USR_R.$usr_cd, usr_cd);
		if( extSysUsrR != null) {
			return extSysUsrR;
		}
		extSysUsrR = extSysUsrL.getFirst(MAM_EXT_SYS_USR_R.$usr_cd, MAC_STR.NULL_VAL.value());
		if( extSysUsrR != null) {
			//usr_cdを補完し返す
			extSysUsrR.usr_cd(usr_cd);
			return extSysUsrR;
		}
		return null;
	}

	//FMCB CUSTOM END
}