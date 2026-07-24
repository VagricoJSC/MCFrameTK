package mcframe.serverMAUC.MAUCL0100;

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
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.lang.ref.SoftReference;
//FMCB CUSTOM_IMPORT END

/**
 * "MAUCL_AmtUtil"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MAUCL_AmtUtil_MC extends MAUCL_AmtUtil_MC_A{
	//FMCB CUSTOM START
	/**
	 * static メソッドでのアクセス用フィールド
	 */
	protected static final MAUCL_AmtUtil _amt = new MAUCL_AmtUtil();

	/**
	 * 単価と数量から金額を取得します。
	 * 
	 * @param upri 単価
	 * @param qty 数量
	 * @param decPlace 小数部有効桁数
	 * @param rndTyp 金額端数処理区分
	 * @return 金額
	 */
	public static MCNumber getAmt(MCNumber upri, MCNumber qty, MCNumber decPlace, String rndTyp) {
		return _amt._getAmt(upri, qty, decPlace, rndTyp, null);
	}
	/**
	 * 単価と数量から金額を取得し、値引額を減算して返します。
	 * 
	 * @param upri 単価
	 * @param qty 数量
	 * @param decPlace 小数部有効桁数
	 * @param rndTyp 金額端数処理区分
	 * @param dscntAmt 値引額
	 * @return 金額
	 */
	public static MCNumber getAmt(MCNumber upri, MCNumber qty, MCNumber decPlace, String rndTyp, MCNumber dscntAmt) {
		return _amt._getAmt(upri, qty, decPlace, rndTyp, dscntAmt);
	}
	protected MCNumber _getAmt(MCNumber upri, MCNumber qty, MCNumber decPlace, String rndTyp, MCNumber dscntAmt) {
		
		if (isNullOr(upri, qty)) {
			return null;
		}
		if (upri.isZero() || qty.isZero()) {
			return MCNumber.ZERO;
		}
		if (isNullOr(decPlace, rndTyp)) {
			MCMessage msg = new MCMessage(MAUCL0033);
			msg.addBind(upri, qty);
			msg.addBind(decPlace != null ? decPlace.intValue() : null);
			msg.addBind(rndTyp);
			MCLog.write(msg);
			return null;
		}
		
		return upri.multiply(qty, decPlace.intValue(), MAC_RND_TYP.toMC(rndTyp))
				.subtract(isNull(dscntAmt) ? MCNumber.ZERO : dscntAmt);
	}
	
	/**
	 * 金額と数量から単価を取得します。
	 * 
	 * @param amt 金額
	 * @param qty 数量
	 * @param decPlace 単価小数部有効桁数
	 * @return 単価
	 */
	public static MCNumber getUpri(MCNumber amt, MCNumber qty, MCNumber decPlace) {
		return _amt._getUpri(amt, qty, decPlace, null);
	}
	/**
	 * （金額+値引額）と数量から単価を取得します。
	 * 
	 * @param amt 金額
	 * @param qty 数量
	 * @param decPlace 単価小数部有効桁数
	 * @param dscntAmt 値引額
	 * @return 単価
	 */
	public static MCNumber getUpri(MCNumber amt, MCNumber qty, MCNumber decPlace, MCNumber dscntAmt) {
		return _amt._getUpri(amt, qty, decPlace, dscntAmt);
	}
	protected MCNumber _getUpri(MCNumber amt, MCNumber qty, MCNumber decPlace, MCNumber dscntAmt) {
		
		if (isNullOr(amt, qty)) {
			return null;
		}
		if (amt.isZero() || qty.isZero()) {
			return MCNumber.ZERO;
		}
		if (isNullOr(decPlace)) {
			MCMessage msg = new MCMessage(MAUCL0034);
			msg.addBind(amt, qty);
			msg.addBind(decPlace != null ? decPlace.intValue() : null);
			MCLog.write(msg);
			return null;
		}
		
		return amt.add(isNull(dscntAmt) ? MCNumber.ZERO : dscntAmt).divide(qty,
				decPlace.intValue(), MAC_RND_TYP.RNDOFF.toMC());
	}
	
	/**
	 * 税抜金額と税率から税金額を取得します。<br>
	 * 金額が税抜きであることが前提の場合に使用します。
	 * 
	 * @param amt 税抜金額
	 * @param taxRate 税率
	 * @param decPlace 金額小数部有効桁数
	 * @param rndTyp 税端数処理区分
	 * @return 税金額
	 */
	public static MCNumber getTaxAmt(MCNumber amt, MCNumber taxRate, MCNumber decPlace, String rndTyp) {
		return _amt._getTaxAmt(amt, taxRate, decPlace, rndTyp, null);
	}
	/**
	 * （税抜金額－値引額）と税率から税金額を取得します。<br>
	 * 金額が税抜きであることが前提の場合に使用します。
	 * 
	 * @param amt 税抜金額
	 * @param taxRate 税率
	 * @param decPlace 金額小数部有効桁数
	 * @param rndTyp 税端数処理区分
	 * @param dscntAmt 値引額
	 * @return 税金額
	 */
	public static MCNumber getTaxAmt(MCNumber amt, MCNumber taxRate, MCNumber decPlace, String rndTyp, MCNumber dscntAmt) {
		return _amt._getTaxAmt(amt, taxRate, decPlace, rndTyp, dscntAmt);
	}
	
	protected MCNumber _getTaxAmt(MCNumber amt, MCNumber taxRate, MCNumber decPlace, String rndTyp, MCNumber dscntAmt) {
		
		if (isNullOr(amt, taxRate)) {
			return null;
		}
		if (amt.isZero() || taxRate.isZero()) {
			return MCNumber.ZERO;
		}
		if (isNullOr(decPlace, rndTyp)) {
			MCMessage msg = new MCMessage(MAUCL0035);
			msg.addBind(amt, taxRate);
			msg.addBind(decPlace != null ? decPlace.intValue() : null);
			msg.addBind(rndTyp);
			MCLog.write(msg);
			return null;
		}
		
		return amt.subtract(isNull(dscntAmt) ? MCNumber.ZERO : dscntAmt).multiply(
				taxRate.divide(100), decPlace.intValue(), MAC_RND_TYP.toMC(rndTyp));
	}
	
	/**
	 * 税込金額と税率から税金額を取得します。<br>
	 * 金額が税込みであることが前提の場合に使用します。
	 * 
	 * @param incAmt 税込金額
	 * @param taxRate 税率
	 * @param decPlace 金額小数部有効桁数
	 * @param rndTyp 税端数処理区分
	 * @return 税金額
	 */
	public static MCNumber getIncTaxAmt(MCNumber incAmt, MCNumber taxRate, MCNumber decPlace, String rndTyp) {
		return _amt._getIncTaxAmt(incAmt, taxRate, decPlace, rndTyp, null);
	}
	/**
	 * （税込金額－値引額）と税率から税金額を取得します。<br>
	 * 金額が税込みであることが前提の場合に使用します。
	 * 
	 * @param incAmt 税込金額
	 * @param taxRate 税率
	 * @param decPlace 金額小数部有効桁数
	 * @param rndTyp 税端数処理区分
	 * @param dscntAmt 値引額
	 * @return 税金額
	 */
	public static MCNumber getIncTaxAmt(MCNumber incAmt, MCNumber taxRate, MCNumber decPlace, String rndTyp, MCNumber dscntAmt) {
		return _amt._getIncTaxAmt(incAmt, taxRate, decPlace, rndTyp, dscntAmt);
	}
	protected MCNumber _getIncTaxAmt(MCNumber incAmt, MCNumber taxRate, MCNumber decPlace, String rndTyp, MCNumber dscntAmt) {
		
		if (isNullOr(incAmt, taxRate)) {
			return null;
		}
		if (incAmt.isZero() || taxRate.isZero()) {
			return MCNumber.ZERO;
		}
		if (isNullOr(decPlace, rndTyp)) {
			MCMessage msg = new MCMessage(MAUCL0035);
			msg.addBind(incAmt, taxRate);
			msg.addBind(decPlace != null ? decPlace.intValue() : null);
			msg.addBind(rndTyp);
			MCLog.write(msg);
			return null;
		}
		
		return incAmt.subtract(isNull(dscntAmt) ? MCNumber.ZERO : dscntAmt)
				.multiply(taxRate)
				.divide(taxRate.add(100), decPlace.intValue(), MAC_RND_TYP.toMC(rndTyp));
	}
	
	/**
	 * 金額と税率から税金額を取得します。<br>
	 * 外税・内税に応じた計算をします。
	 * 
	 * @param amt 金額
	 * @param taxRate 税率
	 * @param decPlace 小数部有効桁数
	 * @param rndTyp 端数処理区分
	 * @param incTax 金額が内税（税込）の場合に true
	 * @return 消費税額
	 */
	public static MCNumber getTaxAmt(MCNumber amt, MCNumber taxRate, MCNumber decPlace, String rndTyp, boolean incTax) {
		return _amt._getTaxAmt(amt, taxRate, decPlace, rndTyp, null, incTax);
	}
	/**
	 * （金額－値引額）と税率から税金額を取得します。<br>
	 * 外税・内税に応じた計算をします。
	 * 
	 * @param amt 金額
	 * @param taxRate 税率
	 * @param decPlace 小数部有効桁数
	 * @param rndTyp 端数処理区分
	 * @param dscntAmt 値引額
	 * @param incTax 金額が内税（税込）の場合に true
	 * @return 消費税額
	 */
	public static MCNumber getTaxAmt(MCNumber amt, MCNumber taxRate, MCNumber decPlace, String rndTyp, MCNumber dscntAmt, boolean incTax) {
		return _amt._getTaxAmt(amt, taxRate, decPlace, rndTyp, dscntAmt, incTax);
	}
	protected MCNumber _getTaxAmt(MCNumber amt, MCNumber taxRate, MCNumber decPlace, String rndTyp, MCNumber dscntAmt, boolean incTax) {
		// 内税
		if (incTax) {
			return _getIncTaxAmt(amt, taxRate, decPlace, rndTyp, dscntAmt);
		}
		// 外税
		else {
			return _getTaxAmt(amt, taxRate, decPlace, rndTyp, dscntAmt);
		}
	}
	
	/**
	 * 金額、消費税額と税込金額を取得
	 * 
	 * @param upri 単価
	 * @param qty 数量
	 * @param taxRate 消費税率
	 * @param incTax 内税ＦＬＧ
	 * @param amtDecPlace 金額小数部有効桁数
	 * @param amtRndTyp 金額端数処理区分
	 * @param taxRndTyp 消費税端数処理区分
	 * @return 金額（amt）、消費税額（tax_amt）と税込金額（inc_tax_amt）
	 */
	public static MCRow getAmtAndTax(MCNumber upri, MCNumber qty, MCNumber taxRate, boolean incTax,
			MCNumber amtDecPlace, String amtRndTyp, String taxRndTyp) {
		
		return _amt._getAmtAndTax(upri, qty, taxRate, incTax, amtDecPlace, amtRndTyp, taxRndTyp, null);
	}
	/**
	 * 金額、消費税額と税込金額を取得
	 * 
	 * @param upri 単価
	 * @param qty 数量
	 * @param taxRate 消費税率
	 * @param incTax 内税ＦＬＧ
	 * @param amtDecPlace 金額小数部有効桁数
	 * @param amtRndTyp 金額端数処理区分
	 * @param taxRndTyp 消費税端数処理区分
	 * @param dscntAmt 値引額
	 * @return 金額（amt）、消費税額（tax_amt）と税込金額（inc_tax_amt）
	 */
	public static MCRow getAmtAndTax(MCNumber upri, MCNumber qty, MCNumber taxRate, boolean incTax,
			MCNumber amtDecPlace, String amtRndTyp, String taxRndTyp, MCNumber dscntAmt) {
		
		return _amt._getAmtAndTax(upri, qty, taxRate, incTax, amtDecPlace, amtRndTyp, taxRndTyp, dscntAmt);
	}
	protected MCRow _getAmtAndTax(MCNumber upri, MCNumber qty, MCNumber taxRate, boolean incTax,
			MCNumber amtDecPlace, String amtRndTyp, String taxRndTyp, MCNumber dscntAmt) {
		
		MCRow retR = MCRow.create();
		retR.addNumberColumn("amt");
		retR.addNumberColumn("tax_amt");
		retR.addNumberColumn("inc_tax_amt");
		
		if (incTax && isNullOr(taxRate, taxRndTyp)) {
			return retR;
		}
		
		if (isNullOr(upri, qty, amtDecPlace, amtRndTyp)) {
			return retR;
		}
		
		MCNumber amt = _getAmt(
				upri,
				qty,
				amtDecPlace,
				amtRndTyp,
				dscntAmt);
		
		MCNumber taxAmt = _getTaxAmt(
				amt,
				taxRate,
				amtDecPlace,
				taxRndTyp,
				null,
				incTax);
		
		amt = (incTax && amt != null) ? amt.subtract(taxAmt) : amt;
		
		MCNumber incTaxAmt = (amt != null) ? amt.add(taxAmt) : null;
		
		retR.setValue("amt", amt);
		retR.setValue("tax_amt", taxAmt);
		retR.setValue("inc_tax_amt", incTaxAmt);
		
		return retR;
	}
	
	protected static final Class<MAUCL_AmtUtil> CLAZZ = MAUCL_AmtUtil.class;
	
	/**
	 * 為替レートキャッシュ
	 */
	protected SoftReference<Map<ArrayList<Comparable<?>>, MCNumber>> _dxMap = 
			new SoftReference<>(new HashMap<>());
	
	/**
	 * デフォルトの為替レートを取得します。<br>
	 * 
	 * @param cur_cd_fr 換算元通貨ＣＤ
	 * @param cur_cd_to 換算先通貨ＣＤ
	 * @param xrate_cd 為替レートＣＤ
	 * @param base_dt 基準日
	 * @return デフォルトの為替レート
	 */
	public static MCNumber getDefXrate(String cur_cd_fr, String cur_cd_to, String xrate_cd, MCDate base_dt) {
		
		return object(CLAZZ)._getDefXrate(cur_cd_fr, cur_cd_to, xrate_cd, base_dt);
	}
	protected MCNumber _getDefXrate(String cur_cd_fr, String cur_cd_to, String xrate_cd, MCDate base_dt) {
		if (isNullOr(cur_cd_fr, cur_cd_to)) {
			return null;
		}
		if (isSame(cur_cd_fr, cur_cd_to)) {
			return MCNumber.ONE;
		}
		if (isNullOr(xrate_cd, base_dt)) {
			return null;
		}

		ArrayList<Comparable<?>> k = new ArrayList<>();
		k.add(cur_cd_fr);
		k.add(cur_cd_to);
		k.add(xrate_cd);
		k.add(base_dt);
		
		Map<ArrayList<Comparable<?>>, MCNumber> m = null;
		m = _dxMap.get();
		if (m != null) {
			MCNumber v = m.get(k);
			if (v != null) {
				return v;
			}
		}
		else {
			m = new HashMap<>();
			_dxMap = new SoftReference<>(m); 
		}

		MCRow r = MCRow.create();
		r.addNumberColumn("xrate");

		sql(createSqlId(LOGIC_ID, "MAPA_XCHNG$F_GET_XRATE", "_getDefXrate"))
		.mainQuery()
		.select(MAPA_XCHNG$F_GET_XRATE(value(cur_cd_fr), value(cur_cd_to), value(xrate_cd), value(base_dt))
				.as("xrate"))
		.executeQuery(r);

		MCNumber v = r.getNumberNE("xrate");
		m.put(k, v);
		return v;
	}
	
	/**
	 * デフォルトの為替レートを取得します。<br>
	 * 首都記できない場合は、NULLを返します。
	 * 
	 * @param cur_cd_fr 換算元通貨ＣＤ
	 * @param cur_cd_to 換算先通貨ＣＤ
	 * @param xrate_cd 為替レートＣＤ
	 * @param base_dt 基準日
	 * @return デフォルトの為替レートまたはNULL
	 */
	public static MCNumber getDefXrateNE(String cur_cd_fr, String cur_cd_to, String xrate_cd, MCDate base_dt) {
		
		return object(CLAZZ)._getDefXrateNE(cur_cd_fr, cur_cd_to, xrate_cd, base_dt);
	}
	protected MCNumber _getDefXrateNE(String cur_cd_fr, String cur_cd_to, String xrate_cd, MCDate base_dt) {
		if (isNullOr(cur_cd_fr, cur_cd_to)) {
			return null;
		}
		if (isSame(cur_cd_fr, cur_cd_to)) {
			return MCNumber.ONE;
		}
		if (isNullOr(xrate_cd, base_dt)) {
			return null;
		}

		ArrayList<Comparable<?>> k = new ArrayList<>();
		k.add(cur_cd_fr);
		k.add(cur_cd_to);
		k.add(xrate_cd);
		k.add(base_dt);
		
		Map<ArrayList<Comparable<?>>, MCNumber> m = null;
		m = _dxMap.get();
		if (m != null) {
			MCNumber v = m.get(k);
			if (v != null) {
				return v;
			}
		}
		else {
			m = new HashMap<>();
			_dxMap = new SoftReference<>(m); 
		}

		MCRow r = MCRow.create();
		r.addNumberColumn("xrate");

		sql(createSqlId(LOGIC_ID, "MAPA_XCHNG$F_GET_XRATE_NE", "_getDefXrateNE"))
		.mainQuery()
		.select(MAPA_XCHNG$F_GET_XRATE_NE(value(cur_cd_fr), value(cur_cd_to), value(xrate_cd), value(base_dt))
				.as("xrate"))
		.executeQuery(r);

		MCNumber v = r.getNumberNE("xrate");
		m.put(k, v);
		return v;
	}
	//FMCB CUSTOM END
}