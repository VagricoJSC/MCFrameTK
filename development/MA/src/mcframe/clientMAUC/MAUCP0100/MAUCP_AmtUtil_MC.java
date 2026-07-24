package mcframe.clientMAUC.MAUCP0100;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import mcframe.clientCore.beans.action.*;
import mcframe.clientCore.beans.combobox.*;
import mcframe.clientCore.beans.*;
import mcframe.clientCore.event.*;
import mcframe.commonCore.lang.*;
import mcframe.commonCore.notice.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.container.MCRow.Status;
import mcframe.commonCore.container.MCList.SortType;
import mcframe.clientCore.beans.table.*;
import mcframe.clientCore.beans.tree.*;
import mcframe.clientCore.container.MCConstRow;


import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START

import mcframe.commonCore.meta.MCMeta;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MAUCP_AmtUtil"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MAUCP_AmtUtil_MC extends MAUCP_AmtUtil_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	/**
	 * static メソッドでのアクセス用フィールド
	 */
	protected static MAUCP_AmtUtil _amt = new MAUCP_AmtUtil();
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUCP_AmtUtil_MC() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START

		//FMCB CUSTOM_CONSTRUCTOR END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START
	/**
	 * MCNumberからint値を取得する<br>
	 * nullの場合はゼロを返す
	 * 
	 * @param num 変換対象のMCNumber値
	 * @return int値
	 */
	public static int nullToZero(MCNumber num) {
		
		return _amt._nullToZero(num);
	}
	
	protected int _nullToZero(MCNumber num) {
		
		return (num != null) ? num.intValue() : 0;
	}
	
	/**
	 * 金額の桁数を取得する
	 * 
	 * @param meta メタ
	 * @param decPlace 小数部有効桁数
	 * @return 桁数
	 */
	public static int getAmtLength(MCMeta meta, int decPlace) {
		
		return _amt._getAmtLength(meta, decPlace);
	}
	
	protected int _getAmtLength(MCMeta meta, int decPlace) {
		
		return meta.length() - meta.scale() + decPlace;
	}
	
	/**
	 * 金額の桁数を取得する
	 * 
	 * @param meta メタ
	 * @param decPlace 小数部有効桁数
	 * @return 桁数
	 */
	public static int getAmtLength(MCMeta meta, MCNumber decPlace) {
		
		return _amt._getAmtLength(meta, decPlace);
	}
	
	protected int _getAmtLength(MCMeta meta, MCNumber decPlace) {
		
		return decPlace == null ? 0 : _getAmtLength(meta, decPlace.intValue());
	}
	
	/**
	 * 金額フィールドの桁数を設定する
	 * 
	 * @param compo 金額フィールド
	 * @param decPlace 小数部有効桁数
	 */
	public static void setAmtLength(MCNumberField compo, MCNumber decPlace) {
		
		_amt._setAmtLength(compo, decPlace);
	}
	
	protected void _setAmtLength(MCNumberField compo, MCNumber decPlace) {
		
		int scale = _nullToZero(decPlace);
		int length = _getAmtLength(compo.getMeta(), decPlace);
		
		compo.setLength(length);
		compo.setScale(scale);
	}
	
	/**
	 * 金額フィールドの桁数を設定する
	 * 
	 * @param compo 金額フィールド
	 * @param decPlace 小数部有効桁数
	 */
	public static void setAmtLength(MCColumnConfig compo, MCNumber decPlace) {
		
		_amt._setAmtLength(compo, decPlace);
	}
	
	protected void _setAmtLength(MCColumnConfig compo, MCNumber decPlace) {
		
		int scale = _nullToZero(decPlace);
		int length = _getAmtLength(compo.getMeta(), decPlace);
		
		compo.setLength(length);
		compo.setScale(scale);
	}
	
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
			MCMessage msg = new MCMessage(MAUCP0047);
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
			MCMessage msg = new MCMessage(MAUCP0048);
			msg.addBind(amt, qty);
			msg.addBind(decPlace != null ? decPlace.intValue() : null);
			MCLog.write(msg);
			return null;
		}
		
		return amt.add(isNull(dscntAmt) ? MCNumber.ZERO : dscntAmt).divide(qty,
				decPlace.intValue(), MAC_RND_TYP.RNDOFF.toMC());
	}
	
	/**
	 * 税抜金額と税率から税額を取得します。<br>
	 * 金額が税抜きであることが前提の場合に使用します。
	 * 
	 * @param amt 税抜金額
	 * @param taxRate 税率
	 * @param decPlace 金額小数部有効桁数
	 * @param rndTyp 税額端数処理区分
	 * @return 税額
	 */
	public static MCNumber getTaxAmt(MCNumber amt, MCNumber taxRate, MCNumber decPlace, String rndTyp) {
		return _amt._getTaxAmt(amt, taxRate, decPlace, rndTyp, null);
	}
	/**
	 * （税抜金額－値引額）と税率から税額を取得します。<br>
	 * 値引き後の金額から算出する場合は、値引き額を指定しないシグニチャのユーティリティを使用してください。
	 * 金額が税抜きであることが前提の場合に使用します。
	 * 
	 * @param amt 税抜金額
	 * @param taxRate 税率
	 * @param decPlace 金額小数部有効桁数
	 * @param rndTyp 税額端数処理区分
	 * @param dscntAmt 値引額
	 * @return 税額
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
			MCMessage msg = new MCMessage(MAUCP0049);
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
	 * 税込金額と税率から税額を取得します。<br>
	 * 金額が税込みであることが前提の場合に使用します。
	 * 
	 * @param incAmt 税込金額
	 * @param taxRate 税率
	 * @param decPlace 金額小数部有効桁数
	 * @param rndTyp 税額端数処理区分
	 * @return 税額
	 */
	public static MCNumber getIncTaxAmt(MCNumber incAmt, MCNumber taxRate, MCNumber decPlace, String rndTyp) {
		return _amt._getIncTaxAmt(incAmt, taxRate, decPlace, rndTyp, null);
	}
	/**
	 * （税込金額－値引額）と税率から税額を取得します。<br>
	 * 値引き後の金額から算出する場合は、値引き額を指定しないシグニチャのユーティリティを使用してください。
	 * 金額が税込みであることが前提の場合に使用します。
	 * 
	 * @param incAmt 税込金額
	 * @param taxRate 税率
	 * @param decPlace 金額小数部有効桁数
	 * @param rndTyp 税額端数処理区分
	 * @param dscntAmt 値引額
	 * @return 税額
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
			MCMessage msg = new MCMessage(MAUCP0049);
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
	 * 金額と税率から税額を取得します。<br>
	 * 外税・内税に応じた計算をします。
	 * 
	 * @param amt 金額
	 * @param taxRate 税率
	 * @param decPlace 小数部有効桁数
	 * @param rndTyp 端数処理区分
	 * @param incTax 金額が内税（税込）の場合に true
	 * @return 税額
	 */
	public static MCNumber getTaxAmt(MCNumber amt, MCNumber taxRate, MCNumber decPlace, String rndTyp, boolean incTax) {
		return _amt._getTaxAmt(amt, taxRate, decPlace, rndTyp, null, incTax);
	}
	/**
	 * （金額－値引額）と税率から税額を取得します。<br>
	 * 外税・内税に応じた計算をします。
	 * 
	 * @param amt 金額
	 * @param taxRate 税率
	 * @param decPlace 小数部有効桁数
	 * @param rndTyp 端数処理区分
	 * @param dscntAmt 値引額
	 * @param incTax 金額が内税（税込）の場合に true
	 * @return 税額
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
	 * 金額、税額と税込金額を取得
	 * 
	 * @param upri 単価
	 * @param qty 数量
	 * @param taxRate 税率
	 * @param incTax 内税ＦＬＧ
	 * @param amtDecPlace 金額小数部有効桁数
	 * @param amtRndTyp 金額端数処理区分
	 * @param taxRndTyp 税額端数処理区分
	 * @return 金額（amt）、税額（tax_amt）と税込金額（inc_tax_amt）
	 */
	public static MCRow getAmtAndTax(MCNumber upri, MCNumber qty, MCNumber taxRate, boolean incTax,
			MCNumber amtDecPlace, String amtRndTyp, String taxRndTyp) {
		
		return _amt._getAmtAndTax(upri, qty, taxRate, incTax, amtDecPlace, amtRndTyp, taxRndTyp, null);
	}	
	/**
	 * 金額、税額と税込金額を取得
	 * 
	 * @param upri 単価
	 * @param qty 数量
	 * @param taxRate 税率
	 * @param incTax 内税ＦＬＧ
	 * @param amtDecPlace 金額小数部有効桁数
	 * @param amtRndTyp 金額端数処理区分
	 * @param taxRndTyp 税額端数処理区分
	 * @param dscntAmt 値引額
	 * @return 金額（amt）、税額（tax_amt）と税込金額（inc_tax_amt）
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
	/**
	 * デフォルトの為替レートを取得します。<br>
	 * 
	 * @param cur_cd_fr 換算元通貨ＣＤ
	 * @param cur_cd_to 換算先通貨ＣＤ
	 * @param xrate_cd 為替レートＣＤ
	 * @param base_dt 基準日
	 * @param panel 画面
	 */
	public static MCNumber getDefXrate(String cur_cd_fr, String cur_cd_to, String xrate_cd, MCDate base_dt, MCRootPanel panel) {
		return MAUCP_AmtUtilListLogic.getDefXrate(cur_cd_fr, cur_cd_to, xrate_cd, base_dt, panel).getNumberNE("xrate");
	}
	
	/**
	 * デフォルトの為替レートを取得します。<br>
	 * 取得できない場合は、NULLを返します。
	 * 
	 * @param cur_cd_fr 換算元通貨ＣＤ
	 * @param cur_cd_to 換算先通貨ＣＤ
	 * @param xrate_cd 為替レートＣＤ
	 * @param base_dt 基準日
	 * @param panel 画面
	 */
	public static MCNumber getDefXrateNE(String cur_cd_fr, String cur_cd_to, String xrate_cd, MCDate base_dt, MCRootPanel panel) {
		return MAUCP_AmtUtilListLogic.getDefXrateNE(cur_cd_fr, cur_cd_to, xrate_cd, base_dt, panel).getNumberNE("xrate");
	}

}