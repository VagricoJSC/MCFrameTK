package mcframe.serverMSUC.MSUCL0130;

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
import static mcframe.serverCore.requester.MCRequestObject.object;
import mcframe.commonFXUC.FXUCC0030.FXUCC_Divide;
import mcframe.commonMA.meta.MA_META;
import mcframe.serverMSUC.MSUCL0020.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSUCL_AmtUtil"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSUCL_AmtUtil_MC extends MSUCL_AmtUtil_MC_A{
	//FMCB CUSTOM START
	protected static final Class<MSUCL_AmtUtil> CLAZZ = MSUCL_AmtUtil.class;
	
	/**
	 * 消費税差額取得<br />
	 * 伝票単位に算出した消費税額と、明細単位の消費税額の合計の差額を取得する。
	 * @param amtL 金額を格納したリスト。<br />
	 * @param tax_rnd_typ 税端数処理区分<br />
	 * @param amt_dec_place 金額小数部有効桁数<br />
	 * @param tax_rate 税率
	 * @param xrate 為替レート
	 *  取引通貨の税差額を取得する場合、NULLを指定する<br />
	 *  基準通貨の税差額を取得する場合、必須<br />
	 * @param total_tax_amt 明細単位の消費税額の合計
	 * @return 伝票単位の消費税額と、明細単位の消費税額の合計との差額
	 */
	public static MCNumber getTaxDiff(MCList<?>amtL, String tax_rnd_typ, MCNumber amt_dec_place, MCNumber tax_rate, MCNumber xrate, MCNumber total_tax_amt) {
		return object(CLAZZ)._getTaxDiff(amtL, tax_rnd_typ, amt_dec_place, tax_rate, xrate, total_tax_amt);
	}
	protected MCNumber _getTaxDiff(MCList<?>amtL, String tax_rnd_typ, MCNumber amt_dec_place, MCNumber tax_rate, MCNumber xrate, MCNumber total_tax_amt) {
		MCNumber taxAmtBySlip = getTaxAmtBySlip(amtL, tax_rnd_typ, amt_dec_place, tax_rate, xrate);
		return taxAmtBySlip.subtract(total_tax_amt);
	}
	/**
	 * 消費税額取得<br />
	 * 伝票単位に算出した消費税額を取得する。
	 * @param amtL 金額を格納したリスト。<br />
	 * @param tax_rnd_typ 税端数処理区分<br />
	 * @param amt_dec_place 金額小数部有効桁数<br />
	 * @param tax_rate 税率
	 * @param xrate 為替レート
	 *  取引通貨の税差額を取得する場合、NULLを指定する<br />
	 *  基準通貨の税差額を取得する場合、必須<br />
	 * @return 伝票単位の消費税額
	 */
	public static MCNumber getTaxAmtBySlip(MCList<?>amtL, String tax_rnd_typ, MCNumber amt_dec_place, MCNumber tax_rate, MCNumber xrate) {
		return object(CLAZZ)._getTaxAmtBySlip(amtL, tax_rnd_typ, amt_dec_place, tax_rate, xrate);
	}
	protected MCNumber _getTaxAmtBySlip(MCList<?>amtL, String tax_rnd_typ, MCNumber amt_dec_place, MCNumber tax_rate, MCNumber xrate) {
		MCNumber wkTaxAmt = getTaxAmt(amtL, tax_rate);
		MCNumber taxAmtBySlip = MCNumber.ZERO;
		taxAmtBySlip = wkTaxAmt.multiply(isNull(xrate) ? MCNumber.valueOf(1) : xrate, amt_dec_place.intValue(), MAC_RND_TYP.toMC(tax_rnd_typ));
		return taxAmtBySlip;
	}
	/**
	 * 消費税額の合計を計算する
	 * 
	 * @param amtL 金額を格納したリスト
	 * @param taxRate 税率
	 * @return 消費税額の合計
	 */
	protected MCNumber getTaxAmt(MCList<?> amtL, MCNumber taxRate) {
		MCNumber taxAmt = MCNumber.ZERO;
		if (!isNull(amtL) && !amtL.isEmpty()) {
			MCNumber totalAmt = amtL.sum("amt");
			taxAmt = taxAmt.add(totalAmt.multiply(taxRate.divide(100)));
		}
		return taxAmt;
	}
	/**
	 * AmtUtil_Calc01オペレーション.<p>
	 *
	 * 金額に関するユーティリティを提供します。<br>
	 */
	public class AmtUtil_Calc01 extends MSUCL_AmtUtil_MC_A.AmtUtil_Calc01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			ivTaxAmtBySlip(up0(), up1());
			setDown();
		}
		
		protected void setDown() {
			down0().setAll(up1());
		}
		
		/*
		 * インボイス単位税調整を行い、金額を計算する
		 */
		protected void ivTaxAmtBySlip(AmtUtil_Calc01_HdrR hdrR, MCList<AmtUtil_Calc01_DtlR> dtlL) {
			MCList<AmtUtil_Calc01_DtlR> taxRateL = dtlL.groupBy(AmtUtil_Calc01_DtlR.$tax_rate);
			taxRateL.sort(AmtUtil_Calc01_DtlR.$tax_rate);
			
			// 税率ごとに消費税再計算
			MCIndexKey taxRateIdx = dtlL.createIndex(AmtUtil_Calc01_DtlR.$tax_rate);
			for (AmtUtil_Calc01_DtlR taxRateR : taxRateL) {
				MCList<AmtUtil_Calc01_DtlR> up1Sub = dtlL.subList(taxRateIdx, taxRateR.tax_rate());
				
				// 税を案分する対象。値引品目以外の明細
				MCList<AmtUtil_Calc01_DtlR> divL = up1Sub.createInstance();
				// 合計値引額(値引品目による値引の合計)
				MCNumber ttlDscntTaxAmt = MCNumber.ZERO;
				
				// 明細の合計額(金額、値引額)を求める
				for (AmtUtil_Calc01_DtlR r : up1Sub) {
					MCNumber dtlDscntAmt = r.trd_cur_dscnt_amt();
					if (isNull(dtlDscntAmt)) {
						dtlDscntAmt = MCNumber.ZERO;
					}
					if ((isPurcTypDecideInSrvs(r) && !isNull(r.mfg_inst_no()))
							|| (!isDscntTrdPtn(r.trd_ptn_typ()) && !isNull(r.purc_typ()) && !MAC_PURC_TYP.isPURC_ITM(r.purc_typ()))){
						r.setBooleanNE("outsrc_flg", true);
					}
					MCNumber taxAblAmt = r.trd_cur_amt();
					if(hdrR.repurc_obli_flg()) {
						if (r.getBooleanNE("outsrc_flg")) {
							taxAblAmt = r.trd_cur_proc_amt();
						}
					}
					r.tax_abl_amt(taxAblAmt);
					if (r.dscnt_itm_flg()) {
						ttlDscntTaxAmt = ttlDscntTaxAmt.add(r.trd_cur_tax_amt());
					}
					else {
						divL.add(r);
					}
				}
				
				// 合計額(金額、値引額)から税額を求める
				// 値引前の金額を連携する必要がある
				// amt は内税・外税関係なく常に税抜金額
				MCList<AmtUtil_Calc01_DtlR> taxAmtL = up1Sub.clone();
				for (AmtUtil_Calc01_DtlR r : taxAmtL) {
					if (r.dscnt_itm_flg()) {
						r.addNumberColumn("amt", r.tax_abl_amt().negate());
					}
					else {
						r.addNumberColumn("amt", r.tax_abl_amt());
					}
				}
				
				if (isNull(taxRateR.tax_rate())) {
					taxRateR.tax_rate(0);
				}
				MCNumber ttlTaxAmt = MSUCL_AmtUtil.getTaxAmtBySlip(taxAmtL,
						hdrR.tax_rnd_typ(), hdrR.amt_dec_place(), taxRateR.tax_rate(), null);
				ttlTaxAmt = ttlTaxAmt.add(ttlDscntTaxAmt);
				
				// 消費税額がゼロの場合は案分不要
				if (ttlTaxAmt.isZero()) {
					continue;
				}
				
				// 明細の金額の比率で消費税を明細に案分する
				FXUCC_Divide.prop(divL, ttlTaxAmt, hdrR.amt_dec_place().intValue(), AmtUtil_Calc01_DtlR.$tax_abl_amt, "tmp_cur_tax_amt");
				
				for (AmtUtil_Calc01_DtlR dtlR : up1Sub) {
					if (!dtlR.dscnt_itm_flg()) {
						if (dtlR.inc_tax_flg()) {
							dtlR.trd_cur_amt(dtlR.trd_cur_amt().add(dtlR.trd_cur_tax_amt())
									.subtract(dtlR.getNumber("tmp_cur_tax_amt")));
							if (dtlR.getBooleanNE("outsrc_flg")) {
								if(hdrR.repurc_obli_flg()) {
									dtlR.trd_cur_proc_amt(
										dtlR.trd_cur_amt().subtract(
											nvl(dtlR.trd_cur_onr_prov_amt(), MCNumber.ZERO)
										)
									);
								}
								else {
									MCList<MCRow> amtL =
										MSUCL_ConvQtyAmtUtil.calcPropOutSrcUpri(
											dtlR.trd_cur_amt(), hdrR.amt_dec_place(),
											dtlR.trd_cur_onr_prov_upri(), dtlR.trd_cur_proc_upri(), dtlR.trd_cur_dscnt_amt());
									dtlR.trd_cur_onr_prov_amt(amtL.get(0).getNumberNE("amt"));
									dtlR.trd_cur_proc_amt(amtL.get(1).getNumberNE("amt"));
								}
							}
						}
						dtlR.trd_cur_tax_amt(dtlR.getNumber("tmp_cur_tax_amt"));
					}
					
					// インボイス表記金額
					if(!isNull(dtlR.trd_cur_upri()) && !dtlR.trd_cur_upri().isZero()) {
						dtlR.iv_amt(dtlR.trd_cur_amt());
					}
					
					// 基準通貨金額、基準通貨税額の計算
					if (!isNull(hdrR.xrate())) {
						if (isSame(hdrR.trd_cur_cd(), getCo().base_cur_cd())) {
							dtlR.base_cur_amt(dtlR.trd_cur_amt());
							dtlR.base_cur_tax_amt(dtlR.trd_cur_tax_amt());
							dtlR.base_cur_proc_amt(dtlR.trd_cur_proc_amt());
							dtlR.base_cur_onr_prov_amt(dtlR.trd_cur_onr_prov_amt());
						}
						else {
							dtlR.base_cur_amt(convToBaseCur(dtlR.trd_cur_amt(), 
									hdrR.xrate(),
									getBaseCur().amt_dec_place(),
									getCo().xrate_rnd_typ()));
							
							dtlR.base_cur_tax_amt(convToBaseCur(dtlR.trd_cur_tax_amt(), 
									hdrR.xrate(),
									getBaseCur().amt_dec_place(),
									getCo().xrate_rnd_typ()));
							
							dtlR.base_cur_proc_amt(convToBaseCur(dtlR.trd_cur_proc_amt(), 
									hdrR.xrate(),
									getBaseCur().amt_dec_place(),
									getCo().xrate_rnd_typ()));
							
							dtlR.base_cur_onr_prov_amt(convToBaseCur(dtlR.trd_cur_onr_prov_amt(), 
									hdrR.xrate(),
									getBaseCur().amt_dec_place(),
									getCo().xrate_rnd_typ()));
						}
					}
					
					//納税通貨金額、納税通貨税額の計算
					if (!isNull(hdrR.ptax_xrate())) {
						dtlR.ptax_cur_amt(convCur(dtlR.trd_cur_amt(), 
								hdrR.ptax_xrate(),
								getPtaxCur().amt_dec_place(), 
								getCo().xrate_rnd_typ()));
						
						dtlR.ptax_cur_tax_amt(convCur(dtlR.trd_cur_tax_amt(), 
								hdrR.ptax_xrate(),
								getPtaxCur().amt_dec_place(), 
								getCo().xrate_rnd_typ()));
						
						dtlR.ptax_cur_proc_amt(convCur(dtlR.trd_cur_proc_amt(), 
								hdrR.ptax_xrate(),
								getPtaxCur().amt_dec_place(),
								getCo().xrate_rnd_typ()));
						
						dtlR.ptax_cur_onr_prov_amt(convCur(dtlR.trd_cur_onr_prov_amt(), 
								hdrR.ptax_xrate(),
								getPtaxCur().amt_dec_place(),
								getCo().xrate_rnd_typ()));
					}
					
					//源泉税額の計算
					if(!isNull(dtlR.wtax_rate()) && isSame(hdrR.trd_cur_cd(), getBaseCur().cur_cd()) &&
							(isSame(hdrR.trd_cur_cd(), getPtaxCur().cur_cd()) || isNull(getPtaxCur().cur_cd()))) {
						//源泉税額＝取引通貨金額×源泉税率÷100（通貨が一致している前提なので、どの通貨の値を使ってもよい）
						dtlR.wtax_amt(dtlR.trd_cur_amt().multiply(dtlR.wtax_rate()).divide(100,
									getBaseCur().amt_dec_place().intValue(), MAC_RND_TYP.toMC(getCo().wtax_rnd_typ())));
					}
				}
			}
		}
		/**
		 * 購買区分をサービスで決めるか
		 * @return true:サービスで購買区分を決める, false:上り電文の購買区分を採用する
		 */
		protected boolean isPurcTypDecideInSrvs(AmtUtil_Calc01_DtlR r) {
			if (MAC_TRD_PTN_TYP.isPURC(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isPURC_XPNS(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isPURC_VMI(r.trd_ptn_typ())) {
				return true;
			}
			else {
				return false;
			}
		}
		/**
		 * 仕入値引もしくは仕入値増かどうか
		 * @return 仕入値引もしくは仕入値増の場合、trueを返す
		 */
		protected boolean isDscntTrdPtn(String trdPtnTyp){
			return MAC_TRD_PTN_TYP.isPURC_DSCNT(trdPtnTyp) || 
					MAC_TRD_PTN_TYP.isPURC_DSCNT_XPNS(trdPtnTyp) ||
					MAC_TRD_PTN_TYP.isPURC_XTRA(trdPtnTyp) ||
					MAC_TRD_PTN_TYP.isPURC_XTRA_XPNS(trdPtnTyp);
		}
	}

	//FMCB CUSTOM END
}