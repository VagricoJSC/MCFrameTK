package mcframe.serverMSBH.MSBHL5010;

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
import mcframe.serverMB.dbc.*;
import mcframe.serverMS.dbc.*;
import mcframe.serverMAUC.MAUCL0060.ElmArgsR;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;
import mcframe.commonMB.constant.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.serverMBUC.MBUCL0010.MBUCL_MCDataUtil.*;
import mcframe.commonMS.constant.*;
import static mcframe.commonMS.notice.MS_Msg.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMS.dbc.MSFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBCFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;
import static mcframe.serverMS.dbc.MSBAFunction.*;
import static mcframe.serverMS.dbc.MSBBFunction.*;
import static mcframe.serverMS.dbc.MSBCFunction.*;
import static mcframe.serverMS.dbc.MSBDFunction.*;
import static mcframe.serverMS.dbc.MSBEFunction.*;
import static mcframe.serverMS.dbc.MSBFFunction.*;
import static mcframe.serverMS.dbc.MSBGFunction.*;
import static mcframe.serverMS.dbc.MSBHFunction.*;
import static mcframe.serverMS.dbc.MSBIFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import static mcframe.serverCore.requester.MCRequestObject.*;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import mcframe.serverFXUC.FXUCL0030.*;
import mcframe.serverFXUC.FXUCL0030.FXUCL_Cache;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCacheStEnd;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBHL_ApUtil"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBHL_ApUtil_MC extends MSBHL_ApUtil_MC_A{
	//FMCB CUSTOM START

	/**
	 * このクラス（スレッドセーフ対応用）
	 */
	protected static final Class<MSBHL_ApUtil> CLAZZ = MSBHL_ApUtil.class;

	/**
	 * 債務共通サービス内で計算するために値引品目ＦＬＧを考慮した符号反転用の数値を取得します。
	 *
	 * @param trdPtnTyp 取引パタン区分
	 * @param dscntItmFlg 値引品目ＦＬＧ
	 * @return 1（符号反転しない場合） 、-1（符号反転する場合）
	 */
	public static MCNumber getDscntItmPm(String trdPtnTyp, boolean dscntItmFlg) {
		return object(CLAZZ)._getDscntItmPm(trdPtnTyp, dscntItmFlg);
	}

	protected MCNumber _getDscntItmPm(String trdPtnTyp, boolean dscntItmFlg) {
		if (isDscntItmUpriSignRvrsTrd(trdPtnTyp) && dscntItmFlg) {
			return new MCNumber(-1);
		}
		return MCNumber.ONE;
	}

	/**
	 * 値引品目に対する符号を反転する取引かを判定します。
	 * 
	 * @param trdPtnTyp
	 * @return
	 */
	protected boolean isDscntItmUpriSignRvrsTrd (String trdPtnTyp) {
		
		// 値引系取引は含めない。値引取引かつ値引品目はマイナスで表示するため。
		if (MAC_TRD_PTN_TYP.isPURC(trdPtnTyp) 
		 || MAC_TRD_PTN_TYP.isPURC_VMI(trdPtnTyp) 
		 || MAC_TRD_PTN_TYP.isPURC_XPNS(trdPtnTyp) 
		 || MAC_TRD_PTN_TYP.isPURC_RTN(trdPtnTyp) 
		 || MAC_TRD_PTN_TYP.isPURC_RTN_XPNS(trdPtnTyp) 
		 ) {
			return true;
		}
		else {
			return false;
		}
	}

	/** 税マスタ取得 */
	protected FXUCL_MCDbcCache<MAM_TAX_R> _tax;
	/**
	 * 税ＣＤから税マスタ情報を取得する。
	 * 
	 * @param taxCd
	 */
	public static MAM_TAX_R getTax(String taxCd) {
		return object(CLAZZ)._getTax(taxCd);
	}
	protected MAM_TAX_R _getTax(String taxCd) {
		if (_tax == null) {
			MAM_TAX_R t = MAM_TAX_R.create("T");
			MCQueryApiBuilder taxR_bldr = MCQueryApiBuilder.create(t);
			_tax = new FXUCL_MCDbcCache<MAM_TAX_R>(taxR_bldr);
		}
		return _tax.get(taxCd);
	}
	/** 決済方法マスタ取得 */
	protected FXUCL_MCDbcCache<MAM_STTL_R> _sttl;
	/**
	 * 債務決済方法ＣＤから決済方法マスタ情報を取得する。
	 * 
	 * @param taxCd
	 */
	public static MAM_STTL_R getSttl(String apSttlCd) {
		return object(CLAZZ)._getSttl(apSttlCd);
	}
	protected MAM_STTL_R _getSttl(String apSttlCd) {
		if (_sttl == null) {
			MAM_STTL_R t = MAM_STTL_R.create("T");
			MCQueryApiBuilder sttlR_bldr = MCQueryApiBuilder.create(t);
			sttlR_bldr.addWhereWithAnd(t.del_flg.eq(value(false)));
			_sttl = new FXUCL_MCDbcCache<MAM_STTL_R>(sttlR_bldr);
		}
		return _sttl.get(apSttlCd);
	}

	/**
	 * 相殺・手数料税ＣＤの取得
	 * 会社マスタから売上税または仕入税ＣＤを取得する。
	 * 
	 * @param baseDt 基準日
	 * @return 税ＣＤ
	 */
	protected Map<MCDate, String> _com_paid_and_setoff_tax_map = new HashMap<>();
	public static String getComPaidAndSetoffTaxCd(MCDate baseDt) {
		return object(CLAZZ)._getComPaidAndSetoffTaxCd(baseDt);
	}
	protected String _getComPaidAndSetoffTaxCd(MCDate baseDt) {
		if (!_com_paid_and_setoff_tax_map.containsKey(baseDt)) {
			String taxCd = execFuncString(createSqlId(LOGIC_ID, "MAPA_TAX$F_GET_PURC_TAX_CD", "01"),
					MAPA_TAX$F_GET_PURC_TAX_CD(nullValue(), nullValue(), nullValue(),
							nullValue(), nullValue(), value(baseDt)));
			MAM_TAX_R taxR = MSBHL_ApUtil.getTax(taxCd);
			if (!taxR.inc_tax_flg() && MAC_TAX_TYP.isTAX_ABL(taxR.tax_typ())) {
				taxCd = srchTaxCd(taxR.tax_rate());
			}
			_com_paid_and_setoff_tax_map.put(baseDt, taxCd);
		}
		return _com_paid_and_setoff_tax_map.get(baseDt);
	}

	/**
	 * 税率が同じ内税の税ＣＤを取得する
	 * 
	 * @param taxRate 税率
	 * @return 税ＣＤ
	 */
	protected String srchTaxCd(MCNumber taxRate) {
		MAM_TAX_R t = MAM_TAX_R.create("T");
		MCList<MAM_TAX_R> taxL = MCList.create(MAM_TAX_R.class);
		MCQueryApiBuilder taxL_bldr = MCQueryApiBuilder.create(t);
		taxL_bldr.setSelect(t.tax_cd);
		taxL_bldr.setWhere(t.inc_tax_flg.eq(value(true)));
		taxL_bldr.addWhereWithAnd(t.purc_flg.eq(value(true)));
		taxL_bldr.addWhereWithAnd(t.tax_rate.eq(bind("1")), taxRate);
		taxL_bldr.setOrderByAsc(t.tax_cd);
		dbSelect("MSBHL5010_MAM_TAX_S01", taxL, taxL_bldr);
		if (taxL.isEmpty()) {
			return null;
		}
		return taxL.get(0).tax_cd();
	}

	/**
	 * 支払予定管理先締日の設定<br />
	 * 
	 * 支払起算日／支払繰越回数から支払予定管理先締年月日を算出し、設定する。
	 */
	public static <T extends MCRow> void setBspplClDt(MCList<T> list,
			String bsppl_cd_col, String pay_basis_dt_col, String pay_crryovr_times_col,
			String bsppl_cl_dt_col, String bsppl_cl_ym_col, String bsppl_cl_day_col) {
		object(CLAZZ)._setBspplClDt(list,
				bsppl_cd_col, pay_basis_dt_col, pay_crryovr_times_col,
				bsppl_cl_dt_col, bsppl_cl_ym_col, bsppl_cl_day_col);
	}
	
	protected <T extends MCRow> void _setBspplClDt(MCList<T> list,
			String bsppl_cd_col, String pay_basis_dt_col, String pay_crryovr_times_col,
			String bsppl_cl_dt_col, String bsppl_cl_ym_col, String bsppl_cl_day_col) {
		
		// 支払予定管理先締日計算対象リスト
		MCList<T> tgtlist = list.shallowClone();
		tgtlist.clear();
		// 支払予定管理先締日計算対象外リスト
		MCList<T> errlist = tgtlist.shallowClone();
		
		for (T r : list) {
			if (isNull(r.getDateNE(pay_basis_dt_col))) {
				errlist.add(r);
			}
			else {
				tgtlist.add(r);
			}
		}
		
		// 取引先マスタを一括で取得
		MAM_BP_R t = MAM_BP_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setSelect(t.bp_cd);
		dbc_bldr.addSelect(t.psppl_cl_day1);
		dbc_bldr.addSelect(t.psppl_cl_day2);
		dbc_bldr.addSelect(t.psppl_cl_day3);
		dbc_bldr.addSelect(t.psppl_cl_day4);
		dbc_bldr.addSelect(t.psppl_cl_day5);
		FXUCL_MCDbcCache<MAM_BP_R> bpCache = new FXUCL_MCDbcCache<MAM_BP_R>(dbc_bldr, tgtlist, bsppl_cd_col);
		
		for (T r : tgtlist) {
			
			MAM_BP_R bspplR = bpCache.get(r.getString(bsppl_cd_col));
			
			// 締日のリストを取得
			List<MCNumber> clDayL = getClDayL(bspplR, MAM_BP_R.$psppl_cl_day1, MAM_BP_R.$psppl_cl_day2, MAM_BP_R.$psppl_cl_day3, MAM_BP_R.$psppl_cl_day4, MAM_BP_R.$psppl_cl_day5);
			if (clDayL.isEmpty()) {
				errlist.add(r);
				continue;
			}
			
			// 締日ごとの処理
			Comparable<?>[] data = getBspplClDt(r, pay_basis_dt_col, pay_crryovr_times_col, clDayL);
			if (data == null) {
				errlist.add(r);
				continue;
			}
			MCDate pspplDt = (MCDate)data[0];
			MCNumber clDayMst = (MCNumber)data[1];
			
			if (!isNull(bsppl_cl_dt_col)) {
				r.setDateNE(bsppl_cl_dt_col, pspplDt);
			}
			if (!isNull(bsppl_cl_ym_col)) {
				r.setDateNE(bsppl_cl_ym_col, pspplDt.startOfMonth());
			}
			if (!isNull(bsppl_cl_day_col)) {
				r.setNumberNE(bsppl_cl_day_col, clDayMst);
			}
		}
		
		for (T r : errlist) {
			if (!isNull(bsppl_cl_dt_col)) {
				r.setDateNE(bsppl_cl_dt_col, null);
			}
			if (!isNull(bsppl_cl_ym_col)) {
				r.setDateNE(bsppl_cl_ym_col, null);
			}
			if (!isNull(bsppl_cl_day_col)) {
				r.setNumberNE(bsppl_cl_day_col, null);
			}
		}
	}
	
	/**
	 * 支払予定管理先締日の取得<br />
	 * 
	 * 支払起算日／支払繰越回数から支払予定管理先締年月日を算出しする。
	 */
	public static <T extends MCRow> Comparable<?>[] getBspplClDt(T r,
			String pay_basis_dt_col, String pay_crryovr_times_col, MCRow bspplR,
			String psppl_cl_day1_col, String psppl_cl_day2_col, String psppl_cl_day3_col,
			String psppl_cl_day4_col, String psppl_cl_day5_col) {
		return object(CLAZZ)._getBspplClDt(r, pay_basis_dt_col, pay_crryovr_times_col,
				bspplR, psppl_cl_day1_col, psppl_cl_day2_col, psppl_cl_day3_col,
				psppl_cl_day4_col, psppl_cl_day5_col);
	}
	
	protected <T extends MCRow> Comparable<?>[] _getBspplClDt(T r,
			String pay_basis_dt_col, String pay_crryovr_times_col, MCRow bspplR,
			String psppl_cl_day1_col, String psppl_cl_day2_col, String psppl_cl_day3_col,
			String psppl_cl_day4_col, String psppl_cl_day5_col) {
		List<MCNumber> clDayL = getClDayL(bspplR, psppl_cl_day1_col, psppl_cl_day2_col, psppl_cl_day3_col, psppl_cl_day4_col, psppl_cl_day5_col);
		return _getBspplClDt(r, pay_basis_dt_col, pay_crryovr_times_col, clDayL);
	}
	
	protected <T extends MCRow> Comparable<?>[] getBspplClDt(T r, String pay_basis_dt_col,
			String pay_crryovr_times_col, List<MCNumber> clDayL) {
		return _getBspplClDt(r, pay_basis_dt_col, pay_crryovr_times_col, clDayL);
	}
	
	/**
	 * 支払予定管理先締日の取得<br />
	 * 
	 * 支払起算日／支払繰越回数から支払予定管理先締年月日を算出しする。
	 */
	protected <T extends MCRow> Comparable<?>[] _getBspplClDt(T r, String pay_basis_dt_col,
			String pay_crryovr_times_col, List<MCNumber> clDayL) {
		if (clDayL == null || clDayL.isEmpty()) {
			return null;
		}
		
		// 締日ごとの処理
		MCDate pspplDt = null;
		int clDayMst = 0;
		MCDate baseDt = r.getDateNE(pay_basis_dt_col);
		final int ini =
			nvl(r.getNumberNE(pay_crryovr_times_col), MCNumber.ZERO).add(MCNumber.ONE).intValue();
		for (int crryovrCnt = ini; crryovrCnt > 0; baseDt = toYM(baseDt).addMonth(1)) {
			for (int i = 0; i < clDayL.size() && crryovrCnt > 0; i++) {
				int clDay = clDayL.get(i).intValue();
				// 支払締日が月末の場合、無条件で月末が支払予定管理先締日
				if (baseDt.endOfMonth().getDay() <= clDay) {
					pspplDt = baseDt.endOfMonth();
					clDayMst = clDay;
					crryovrCnt--;
				}
				// 基準日が締まっていない場合、基準日の月の支払締日が支払予定管理先締日
				else if (baseDt.getDay() <= clDay) {
					pspplDt = baseDt.modDay(clDay);
					clDayMst = clDay;
					crryovrCnt--;
				}
			}
		}
		return new Comparable<?>[] {pspplDt, MCNumber.valueOf(clDayMst)};
	}

	/**
	 * 締日リスト取得<br />
	 * 
	 * 引数の取引先（支払予定管理先）より締日を抽出して返す
	 */
	protected List<MCNumber> getClDayL(MCRow r, 
			String psppl_cl_day1_col, String psppl_cl_day2_col, 
			String psppl_cl_day3_col, String psppl_cl_day4_col, String psppl_cl_day5_col) {
		List<MCNumber> l = new ArrayList<>();
		
		if (r != null) {
			String[] cols = {psppl_cl_day1_col, psppl_cl_day2_col, psppl_cl_day3_col, psppl_cl_day4_col, psppl_cl_day5_col};
			for (String col : cols) {
				if (!isNull(col)) {
					MCNumber val = r.getNumberNE(col);
					if (!isNull(val)) {
						l.add(val);
					}
				}
			}
			Collections.sort(l);
		}
		
		return l;
	}
	
	/**
	 * 為替レート評価替履歴と買掛明細から、次の用途に適した為替レートを取得する
	 * <br>
	 * <li>支払実績登録時の為替差損益の計算に使用する為替レート</li>
	 * <li>残高振替の払出／受入の支払実績に設定する為替レート</li>
	 * <li>為替レート評価替で評価替えを行う前の為替レート</li>
	 */
	public static MCRow getXRate(MST_AP_XRATE_REV_HIS_R hisXrateR, MCList<MST_AP_D_R> apDL) {
		return object(CLAZZ)._getXRate(hisXrateR, apDL);
	}
	protected MCRow _getXRate(MST_AP_XRATE_REV_HIS_R hisXrateR, MCList<MST_AP_D_R> apDL) {
		MCList<MST_AP_D_R>
			wkApDL = apDL.shallowClone(),
			crtL = MCList.create(MST_AP_D_R.class), swToL = MCList.create(MST_AP_D_R.class);
		
		wkApDL.sort(SortType.DESC, MST_AP_D_R.$ap_d_no);
		for (MST_AP_D_R r : wkApDL) {
			if (MAC_SLIP_STS_TYP.isCRT(r.slip_sts_typ())) {
				crtL.add(r);
			}
			if (!isNull(r.sw_src_ap_appl_schd_no()) || !isNull(r.sw_src_ap_d_no())) {
				swToL.add(r);
			}
		}
		
		MCRow row = MCRow.create();
		row.setNumberNE(MST_AP_D_R.$xrate, isNull(wkApDL) ? null : wkApDL.get(0).xrate());
		
		if ( !(isNull(hisXrateR) || hisXrateR.isEmpty()) ) {
			if (swToL.isEmpty()
				|| ((MCDate) swToL.max(MST_AP_D_R.$ac_ym)).lte(hisXrateR.ac_ym())) {
				row.setNumberNE(MST_AP_D_R.$xrate, hisXrateR.new_xrate());
				row.setBooleanNE("hisXrate", true);		// 評価替のレートを使用（呼出元の支払実績登録ＳＶで使用）
				return row;
			}
		}
		if (!swToL.isEmpty()) {
			row.setNumberNE(MST_AP_D_R.$xrate, swToL.get(0).xrate());
		}
		else if (!crtL.isEmpty()) {
			row.setNumberNE(MST_AP_D_R.$xrate, crtL.get(0).xrate());
		}
		
		return row;
	}
	
	
	/**
	 * 取引先が国内か国外か判定する<br>
	 * 
	 * <li>国内の場合、falseを返却</li>
	 * <li>国外の場合、trueを返却</li>
	 * 
	 * @param bpCd 取引先ＣＤ
	 * 
	 * @return 判定結果
	 */
	public static boolean isForeign(String bpCd) {
		return object(CLAZZ)._isForeign(bpCd);
	}

	protected boolean _isForeign(String pspplCd) {
		return !isSame(getBp(pspplCd).cntry_cd(), getCo().cntry_cd());
	}
	
	/** 取引先マスタ取得 */
	protected FXUCL_Cache<MAM_BP_R> _bp;
	/**
	 * 取引先ＣＤから取引先マスタ情報を取得する。
	 * 
	 * @param bpCd
	 */
	public static MAM_BP_R getBp(String bpCd) {
		return object(CLAZZ)._getBp(bpCd);
	}

	protected MAM_BP_R _getBp(String bpCd) {
		if (_bp == null) {
			_bp = new FXUCL_Cache<MAM_BP_R>();
			_bp.setFixMaxCacheSize(-1);
		}
		if (isNull(_bp.getCache(bpCd))) {
			MAM_BP_R dbc = MAM_BP_R.create();
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(MAM_BP_R.create("T"));
			dbSelectKey("MSBHL5010_MAM_BP_S01", dbc, dbc_bldr, bpCd);
			_setBp(dbc);
		}
		return _bp.getCache(bpCd);
	}
	
	/**
	 * 取引先マスタのＤＢコンテナをキャッシュに設定する
	 * 
	 * @param dbcL DBコンテナ
	 */
	public static void setBp(MCList<MAM_BP_R> dbcL) {
		for (MAM_BP_R dbc : dbcL) {
			object(CLAZZ)._setBp(dbc);
		}
	}

	/**
	 * 取引先マスタのＤＢコンテナをキャッシュに設定する
	 * 
	 * @param dbc DBコンテナ
	 */
	public static void setBp(MAM_BP_R dbc) {
		object(CLAZZ)._setBp(dbc);
	}

	protected void _setBp(MAM_BP_R dbc) {
		if (_bp == null) {
			_initBp();
		}
		_bp.putCache(new String [] {dbc.bp_cd()}, dbc);
	}

	/**
	 * 取引先マスタのキャッシュを初期化する
	 */
	public static void initBp() {
		object(CLAZZ)._initBp();
	}

	protected void _initBp() {
		_bp = new FXUCL_Cache<MAM_BP_R>();
		_bp.setFixMaxCacheSize(-1);
	}
	
	/** 部門マスタのキャッシュ */
	protected FXUCL_MCDbcCacheStEnd<MAM_DPT_R> _dpt;

	/**
	 * 部門ＣＤと適用日に対応した部門マスタを取得する。<br>
	 * キャッシュに存在する場合、キャッシュから取得して返却する。
	 * 
	 * @param dptCd 部門ＣＤ
	 * @param stDt 適用開始日
	 * 
	 * @return 部門マスタ情報
	 */
	public static MAM_DPT_R getDpt(String dptCd, MCDate stDt) {
		return object(CLAZZ)._getDptCache().get(stDt, dptCd);
	}

	protected FXUCL_MCDbcCacheStEnd<MAM_DPT_R> _getDptCache() {
		MCList<MCRow> bindL = MCList.create(MCRow.class);
		if (_dpt == null){
			MAM_DPT_R t = MAM_DPT_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			_dpt = new FXUCL_MCDbcCacheStEnd<MAM_DPT_R>(dbc_bldr, bindL, MAM_DPT_R.$dpt_cd);
		}
		return _dpt;
	}

	/**
	 * ワーキンググループＣＤ取得<br />
	 * 部門ＣＤと適用開始日をもとに部門マスタからワーキンググループＣＤを取得する
	 * 
	 * @param dptCd 部門ＣＤ
	 * @param dt 適用開始日
	 * 
	 * @return ワーキンググループＣＤ
	 */
	public static String getWgCd(String dptCd, MCDate dt) {
		return object(CLAZZ)._getWgCd(dptCd, dt);
	}

	protected String _getWgCd(String dptCd, MCDate dt) {
		return getDpt(dptCd, dt).wg_cd();
	}
	
	/** 通貨マスタ取得 */
	protected FXUCL_MCDbcCache<MAM_CUR_R> _cur;
	/**
	 * 通貨ＣＤから通貨マスタ情報を取得する。
	 * 
	 * @param curCd
	 */
	public static MAM_CUR_R getCur(String curCd) {
		return object(CLAZZ)._getCur(curCd);
	}
	protected MAM_CUR_R _getCur(String curCd) {
		if (_cur == null) {
			MAM_CUR_R t = MAM_CUR_R.create("T");
			MCQueryApiBuilder curR_bldr = MCQueryApiBuilder.create(t);
			_cur = new FXUCL_MCDbcCache<MAM_CUR_R>(curR_bldr);
		}
		return _cur.get(curCd);
	}
	//FMCB CUSTOM END
}