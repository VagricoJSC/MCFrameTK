package mcframe.clientMSUC.MSUCP0020;

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
import mcframe.clientMAUD.MAUDP0080.MAUDP_CellConfig;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;
import mcframe.commonMB.constant.*;
import static mcframe.commonMB.notice.MB_Msg.*;
//import static mcframe.commonMBUA.MBUAC0010.MBUAC_List.*;
import static mcframe.commonMBUD.MBUDC0120.MBUDC_ListLogicBase.*;
import static mcframe.clientMBUC.MBUCP0010.MBUCP_MCDataUtil.*;
import mcframe.commonMS.constant.*;
import static mcframe.commonMS.notice.MS_Msg.*;
import static mcframe.commonMSUA.MSUAC0010.MSUAC_List.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import java.math.RoundingMode;
import static mcframe.clientMAUC.MAUCP0100.MAUCP_AmtUtil.*;
import mcframe.commonFXUC.FXUCC0030.FXUCC_Divide;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSUCP_ConvQtyAmtUtil"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSUCP_ConvQtyAmtUtil_MC extends MSUCP_ConvQtyAmtUtil_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	/**
	 * static メソッドのアクセス用フィールド
	 */
	protected static MSUCP_ConvQtyAmtUtil _util = new MSUCP_ConvQtyAmtUtil();
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSUCP_ConvQtyAmtUtil_MC() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START

		//FMCB CUSTOM_CONSTRUCTOR END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START
	/**
	 * 上段リストの金額を計算する。<br>
	 * ※MSUCL0020.Calc02のクライアント版<br>
	 * <br>
	 * ＜リストの定義＞<br>
	 * hdrL:ヘッダリスト<br>
	 * dtl1L:上段リスト(例：明細)<br>
	 * ＜備考＞<br>
	 * 通常とは異なる金額計算であるため、仕入・売上での使用を想定する。<br>
	 * ＜引数リストの必須項目＞<br>
	 * ■hdrL<br>
	 *  peg_no<BR>
	 *  trd_unit_cd<BR>
	 *  trd_unit_qty<BR>
	 *  trd_cur_upri<BR>
	 *  trd_cur_dscnt_amt<BR>
	 *  trd_cur_proc_upri<BR>
	 *  trd_cur_onr_prov_upri<BR>
	 *  trd_cur_amt<BR>
	 *  trd_cur_proc_amt<BR>
	 *  trd_cur_onr_prov_amt<BR>
	 *  trd_cur_tax_amt<BR>
	 *  trd_cur_inc_tax_amt<BR>
	 *  wtax_amt<BR>
	 *  base_unit_dec_place<BR>
	 *  base_unit_rnd_typ<BR>
	 *  trd_unit_conv_qty :基準単位に換算する際の換算数量。trd_unit_cdが基準単位の場合は「1」を渡す<BR>
	 *  trd_unit_conv_base_qty :基準単位に換算する際の換算基準数量。trd_unit_cdが基準単位の場合は「1」を渡す<BR>
	 *  trd_cur_cd<BR>
	 *  tax_rate：常に受発注時の税率を渡す<BR>
	 *  wtax_rate<BR>
	 *  inc_tax_flg：常に受発注時の税の内税ＦＬＧを渡す<BR>
	 *  act_tax_rate：画面の税率を渡す<BR>
	 *  act_inc_tax_flg：画面の税の内税ＦＬＧを渡す<BR>
	 *  amt_dec_place<BR>
	 *  upri_dec_place<BR>
	 *  amt_rnd_typ<BR>
	 *  tax_rnd_typ<BR>
	 *  wtax_rnd_typ<BR>
	 * ■dtl1L<br>
	 *  peg_no<br>
	 *  hdr_peg_no<br>
	 *  trd_unit_qty<br>
	 *  trd_unit_cd<br>
	 * ＜当処理で設定される項目＞<br>
	 * ■dtl1L<br>
	 *  trd_cur_amt<BR>
	 *  trd_cur_upri<BR>
	 *  trd_cur_proc_upri<BR>
	 *  trd_cur_onr_prov_upri<BR>
	 *  trd_cur_dscnt_amt<BR>
	 *  trd_cur_tax_amt<BR>
	 *  trd_cur_inc_tax_amt<BR>
	 *  trd_cur_proc_amt<BR>
	 *  trd_cur_onr_prov_amt<BR>
	 *  trd_cur_tax_amt<BR>
	 *  trd_cur_inc_tax_amt<BR>
	 *  wtax_amt
	 * <br>
	 * @param hdrL ヘッダリスト
	 * @param dtl1L 上段リスト(明細)
	 */
	public static void setAmtToDtlL(MCList<ConvQtyAmtUtil_HdrR> hdrL, MCList<ConvQtyAmtUtil_DtlR> dtl1L) {

		_util._setAmtToDtlL(hdrL,dtl1L);
	}

	protected void _setAmtToDtlL(MCList<ConvQtyAmtUtil_HdrR> hdrL, MCList<ConvQtyAmtUtil_DtlR> dtl1L) {

		MCIndexKey key = dtl1L.createIndex(ConvQtyAmtUtil_DtlR.$hdr_peg_no);
		for(ConvQtyAmtUtil_HdrR hdrR : hdrL){
			//ヘッダに対応する上段リストの取得
			MCList<ConvQtyAmtUtil_DtlR> subDtlL = dtl1L.subList(key, hdrR.peg_no());
			//明細が1件で、受発注単位と同じ、全数仕入の場合、金額項目は全て受発注と同じ
			if (subDtlL.size() == 1) {
				ConvQtyAmtUtil_DtlR dtl1R = subDtlL.get(0);
				// 税が受発注時と実績時で異なる場合、実績時の税で再計算（金額、税額、税込金額）
				// hdrR.act_tax_rate()がNULLの場合は受発注時と同じとみなす
				boolean isCalcAmt = !isSame(dtl1R.trd_cur_dscnt_amt(), hdrR.trd_cur_dscnt_amt()) ||
							!isNull(hdrR.act_tax_rate()) && 
							!isSame(hdrR.act_inc_tax_flg(), hdrR.inc_tax_flg());
				if (isSame(hdrR.trd_unit_cd(), dtl1R.trd_unit_cd()) && isSame(hdrR.trd_unit_qty(), dtl1R.trd_unit_qty())) {
					if (isCalcAmt) {
						MCRow amtTax = getAmtAndTax(hdrR.trd_cur_upri(), hdrR.trd_unit_qty(), hdrR.act_tax_rate(), hdrR.act_inc_tax_flg(),
								hdrR.amt_dec_place(), hdrR.amt_rnd_typ(), hdrR.tax_rnd_typ(), hdrR.trd_cur_dscnt_amt());
						dtl1R.trd_cur_amt(amtTax.getNumberNE("amt"));
						dtl1R.trd_cur_tax_amt(amtTax.getNumberNE("tax_amt"));
						dtl1R.trd_cur_inc_tax_amt(amtTax.getNumberNE("inc_tax_amt"));
							
					}else{
						if (hdrR.inc_tax_flg()) {
							dtl1R.trd_cur_inc_tax_amt(hdrR.trd_cur_inc_tax_amt());
							
							if(!isNull(hdrR.act_tax_rate()) && !isSame(hdrR.act_tax_rate(), hdrR.tax_rate())) {
								dtl1R.trd_cur_tax_amt(getIncTaxAmt(dtl1R.trd_cur_inc_tax_amt(), hdrR.act_tax_rate(),
										hdrR.amt_dec_place(), hdrR.amt_rnd_typ()));
								dtl1R.trd_cur_amt(hdrR.trd_cur_inc_tax_amt() != null ? hdrR.trd_cur_inc_tax_amt().subtract(dtl1R.trd_cur_tax_amt()) : null);
							}
							else {
								dtl1R.trd_cur_tax_amt(hdrR.trd_cur_tax_amt());
								dtl1R.trd_cur_amt(hdrR.trd_cur_amt());
							}
						}
						else {
							dtl1R.trd_cur_amt(hdrR.trd_cur_amt());
							
							if(!isNull(hdrR.act_tax_rate()) && !isSame(hdrR.act_tax_rate(), hdrR.tax_rate())) {
								dtl1R.trd_cur_tax_amt(getTaxAmt(dtl1R.trd_cur_amt(), hdrR.act_tax_rate(),
										hdrR.amt_dec_place(), hdrR.amt_rnd_typ()));
								dtl1R.trd_cur_inc_tax_amt(hdrR.trd_cur_amt() != null ? hdrR.trd_cur_amt().add(nvl(dtl1R.trd_cur_tax_amt(), MCNumber.ZERO)) : null);
							}
							else {
								dtl1R.trd_cur_tax_amt(hdrR.trd_cur_tax_amt());
								dtl1R.trd_cur_inc_tax_amt(hdrR.trd_cur_inc_tax_amt());
							}
						}
					}

					dtl1R.trd_cur_upri(hdrR.trd_cur_upri());
					dtl1R.trd_cur_proc_upri(hdrR.trd_cur_proc_upri());
					dtl1R.trd_cur_onr_prov_upri(hdrR.trd_cur_onr_prov_upri());
					dtl1R.trd_cur_dscnt_amt(hdrR.trd_cur_dscnt_amt());
					dtl1R.trd_cur_proc_amt(hdrR.trd_cur_proc_amt());
					dtl1R.trd_cur_onr_prov_amt(hdrR.trd_cur_onr_prov_amt());
					MCNumber wtaxRate = dtl1R.wtax_rate();
					if (isNull(dtl1R.wtax_rate())) {
						wtaxRate = hdrR.wtax_rate();
					}
					if (!isNull(wtaxRate)) {
						dtl1R.wtax_amt(getTaxAmt(dtl1R.trd_cur_amt(), wtaxRate, hdrR.amt_dec_place(), hdrR.wtax_rnd_typ()));	
					}
					continue;
				}
				else if (!isCalcAmt) {
					// 取引単位を基準単位に換算した数量（１取引単位あたり基準単位数量）
					MCNumber trdUnitBaseUnitQty = convToBaseUnit(MCNumber.ONE, dtl1R.trd_unit_conv_base_qty(), dtl1R.trd_unit_conv_qty(),
							hdrR.base_unit_dec_place(), hdrR.base_unit_rnd_typ());
					// 受発注（予定）単位・数量を基準単位に換算した数量
					MCNumber hdrBaseUnitQty = convToBaseUnit(hdrR.trd_unit_qty(), hdrR.trd_unit_conv_base_qty(), hdrR.trd_unit_conv_qty(),
							hdrR.base_unit_dec_place(), hdrR.base_unit_rnd_typ());
					// 取引単位・数量を基準単位に換算した数量
					MCNumber trdBaseUnitQty = convToBaseUnit(dtl1R.trd_unit_qty(), dtl1R.trd_unit_conv_base_qty(), dtl1R.trd_unit_conv_qty(),
							hdrR.base_unit_dec_place(), hdrR.base_unit_rnd_typ());
					if (isSame(hdrBaseUnitQty, trdBaseUnitQty)) {
						
						//単価
						//（金額＋値引額）/数量
						//※単価×数量=金額とならない。
						//※明細によって単価は異なる。
						if (hdrR.inc_tax_flg()) {
							dtl1R.trd_cur_inc_tax_amt(hdrR.trd_cur_inc_tax_amt());
							
							if(isNull(hdrR.act_tax_rate()) || isSame(hdrR.act_tax_rate(), hdrR.tax_rate())) {
								dtl1R.trd_cur_tax_amt(hdrR.trd_cur_tax_amt());
								dtl1R.trd_cur_amt(hdrR.trd_cur_amt());
							}
							else {
								dtl1R.trd_cur_tax_amt(getIncTaxAmt(dtl1R.trd_cur_inc_tax_amt(), hdrR.act_tax_rate(),
										hdrR.amt_dec_place(), hdrR.amt_rnd_typ()));
								dtl1R.trd_cur_amt(hdrR.trd_cur_inc_tax_amt() != null ? hdrR.trd_cur_inc_tax_amt().subtract(nvl(dtl1R.trd_cur_tax_amt(), MCNumber.ZERO)) : null);
							}
							
							if (!isNull(dtl1R.trd_cur_inc_tax_amt()) && !isNull(dtl1R.trd_unit_qty()) && !dtl1R.trd_unit_qty().isZero()) {
								dtl1R.trd_cur_upri((dtl1R.trd_cur_inc_tax_amt().add(nvl(dtl1R.trd_cur_dscnt_amt(), MCNumber.ZERO)))
										.divide(dtl1R.trd_unit_qty(), hdrR.upri_dec_place().intValue(), toRoundingMode(hdrR.amt_rnd_typ())));
							}
						}
						else {
							dtl1R.trd_cur_amt(hdrR.trd_cur_amt());
							
							if(isNull(hdrR.act_tax_rate()) || isSame(hdrR.act_tax_rate(), hdrR.tax_rate())) {
								dtl1R.trd_cur_tax_amt(hdrR.trd_cur_tax_amt());
								dtl1R.trd_cur_inc_tax_amt(hdrR.trd_cur_inc_tax_amt());
							}
							else {
								dtl1R.trd_cur_tax_amt(getTaxAmt(dtl1R.trd_cur_amt(), hdrR.act_tax_rate(),
										hdrR.amt_dec_place(), hdrR.amt_rnd_typ()));
								dtl1R.trd_cur_inc_tax_amt(hdrR.trd_cur_amt() != null ? hdrR.trd_cur_amt().add(nvl(dtl1R.trd_cur_tax_amt(), MCNumber.ZERO)) : null);
							}
							
							if (!isNull(dtl1R.trd_cur_amt()) && !isNull(dtl1R.trd_unit_qty()) && !dtl1R.trd_unit_qty().isZero()) {
								dtl1R.trd_cur_upri((dtl1R.trd_cur_amt().add(nvl(dtl1R.trd_cur_dscnt_amt(), MCNumber.ZERO))).divide(dtl1R.trd_unit_qty(),
										hdrR.upri_dec_place().intValue(), toRoundingMode(hdrR.amt_rnd_typ())));
							}
						}
						// 加工単価（受発注加工金額/受発注基準単位数量)×１取引単位あたり基準単位数量
						if (!isNull(hdrR.trd_cur_proc_amt()) && !isNull(dtl1R.trd_unit_qty())) {
							dtl1R.trd_cur_proc_upri(hdrR.trd_cur_proc_amt().multiply(trdUnitBaseUnitQty).divide(
									hdrBaseUnitQty, hdrR.upri_dec_place().intValue(), toRoundingMode(hdrR.amt_rnd_typ())));
						}
						// 有償支給単価（受発注有償支給金額/受発注基準単位数量)×１取引単位あたり基準単位数量
						if (!isNull(hdrR.trd_cur_onr_prov_amt()) && !isNull(dtl1R.trd_unit_qty())) {
							dtl1R.trd_cur_onr_prov_upri(hdrR.trd_cur_onr_prov_amt().multiply(trdUnitBaseUnitQty).divide(
									hdrBaseUnitQty, hdrR.upri_dec_place().intValue(),
									toRoundingMode(hdrR.amt_rnd_typ())));
						}
						dtl1R.trd_cur_dscnt_amt(hdrR.trd_cur_dscnt_amt());
						dtl1R.trd_cur_proc_amt(hdrR.trd_cur_proc_amt());
						dtl1R.trd_cur_onr_prov_amt(hdrR.trd_cur_onr_prov_amt());
						
						MCNumber wtaxRate = dtl1R.wtax_rate();
						if (isNull(dtl1R.wtax_rate())) {
							wtaxRate = hdrR.wtax_rate();
						}
						if (!isNull(wtaxRate)) {
							dtl1R.wtax_amt(getTaxAmt(dtl1R.trd_cur_amt(), wtaxRate, hdrR.amt_dec_place(), hdrR.wtax_rnd_typ()));	
						}
						continue;
					}
				}

			}

			for (ConvQtyAmtUtil_DtlR dtl1R : subDtlL) {
				
				// 受発注（予定）単位を基準単位に換算した数量（１受発注単位あたり基準単位数量）
				MCNumber hdrUnitBaseUnitQty = convToBaseUnit(MCNumber.ONE, hdrR.trd_unit_conv_base_qty(), hdrR.trd_unit_conv_qty(),
						hdrR.base_unit_dec_place(), hdrR.base_unit_rnd_typ());
				// 取引単位を基準単位に換算した数量（１取引単位あたり基準単位数量）
				MCNumber trdUnitBaseUnitQty = convToBaseUnit(MCNumber.ONE, dtl1R.trd_unit_conv_base_qty(), dtl1R.trd_unit_conv_qty(),
						hdrR.base_unit_dec_place(), hdrR.base_unit_rnd_typ());
				// 受発注（予定）単位・数量を基準単位に換算した数量
				MCNumber hdrBaseUnitQty = convToBaseUnit(hdrR.trd_unit_qty(), hdrR.trd_unit_conv_base_qty(), hdrR.trd_unit_conv_qty(),
						hdrR.base_unit_dec_place(), hdrR.base_unit_rnd_typ());
				// 取引単位・数量を基準単位に換算した数量
				MCNumber trdBaseUnitQty = convToBaseUnit(dtl1R.trd_unit_qty(), dtl1R.trd_unit_conv_base_qty(), dtl1R.trd_unit_conv_qty(),
						hdrR.base_unit_dec_place(), hdrR.base_unit_rnd_typ());
				MCNumber wtaxRate = dtl1R.wtax_rate();
				if (isNull(wtaxRate)) {
					wtaxRate = hdrR.wtax_rate();
				}
				//受発注単位と同じ場合
				if (isSame(hdrR.trd_unit_cd(), dtl1R.trd_unit_cd())) {

					//単価：受発注単価と同じ
					dtl1R.trd_cur_upri(hdrR.trd_cur_upri());
					dtl1R.trd_cur_proc_upri(hdrR.trd_cur_proc_upri());
					dtl1R.trd_cur_onr_prov_upri(hdrR.trd_cur_onr_prov_upri());

					//値引額：受発注値引額×明細リストの数量/予定数量
					if (isNull(hdrR.schd_base_unit_qty())) {
						hdrR.schd_base_unit_qty(trdBaseUnitQty);
					}
					if (!isNull(dtl1R.trd_unit_qty()) && !isNull(hdrR.trd_cur_dscnt_amt())) {
						dtl1R.trd_cur_dscnt_amt(hdrR.trd_cur_dscnt_amt().multiply(trdBaseUnitQty)
								.divide(hdrR.schd_base_unit_qty(), hdrR.amt_dec_place().intValue(), toRoundingMode(hdrR.amt_rnd_typ())));
					}
					//金額：単価×数量-値引額
					if (!isNull(dtl1R.trd_cur_upri()) && !isNull(dtl1R.trd_unit_qty())) {
						dtl1R.trd_cur_amt(dtl1R.trd_cur_upri()
								.multiply(dtl1R.trd_unit_qty(), hdrR.amt_dec_place().intValue(), toRoundingMode(hdrR.amt_rnd_typ()))
								.subtract(nvl(dtl1R.trd_cur_dscnt_amt(), MCNumber.ZERO)));
					}
					if (!isNull(hdrR.act_tax_rate()) && 
							(!isSame(hdrR.act_tax_rate(), hdrR.tax_rate()) || !isSame(hdrR.act_inc_tax_flg(), hdrR.inc_tax_flg()))) {
						MCRow amtTax = getAmtAndTax(dtl1R.trd_cur_upri(), dtl1R.trd_unit_qty(), hdrR.act_tax_rate(), hdrR.act_inc_tax_flg(),
								hdrR.amt_dec_place(), hdrR.amt_rnd_typ(), hdrR.tax_rnd_typ(), dtl1R.trd_cur_dscnt_amt());
						dtl1R.trd_cur_amt(amtTax.getNumberNE("amt"));
						dtl1R.trd_cur_tax_amt(amtTax.getNumberNE("tax_amt"));
						dtl1R.trd_cur_inc_tax_amt(amtTax.getNumberNE("inc_tax_amt"));
					}
					else {
						MCRow amtTax = getAmtAndTax(dtl1R.trd_cur_upri(), dtl1R.trd_unit_qty(), hdrR.tax_rate(), hdrR.inc_tax_flg(),
								hdrR.amt_dec_place(), hdrR.amt_rnd_typ(), hdrR.tax_rnd_typ(), dtl1R.trd_cur_dscnt_amt());
						dtl1R.trd_cur_amt(amtTax.getNumberNE("amt"));
						dtl1R.trd_cur_tax_amt(amtTax.getNumberNE("tax_amt"));
						dtl1R.trd_cur_inc_tax_amt(amtTax.getNumberNE("inc_tax_amt"));
					}
					// 有償支給金額、加工金額：金額を有償支給単価・加工単価で案分する
					if(!isNull(dtl1R.trd_cur_amt())) {
						MCList<MCRow> amtL = calcPropOutSrcUpri(dtl1R.trd_cur_amt(), hdrR.amt_dec_place(), dtl1R.trd_cur_onr_prov_upri(), dtl1R.trd_cur_proc_upri(), dtl1R.trd_cur_dscnt_amt());
						dtl1R.trd_cur_onr_prov_amt(amtL.get(0).getNumberNE("amt"));
						dtl1R.trd_cur_proc_amt(amtL.get(1).getNumberNE("amt"));
					}

					//源泉税額
					if (!isNull(wtaxRate)) {
						dtl1R.wtax_amt(getTaxAmt(dtl1R.trd_cur_amt(), wtaxRate, hdrR.amt_dec_place(), hdrR.wtax_rnd_typ()));
					}
				}
				//予定単位と異なる場合
				else {

					//値引額
					//(値引額×取引単位換算数 ×取引単位数量)/(受発注単位換算数 ×受発注数量)
					if (!isNull(dtl1R.trd_unit_qty()) && !isNull(hdrR.trd_cur_dscnt_amt())) {
						dtl1R.trd_cur_dscnt_amt(hdrR.trd_cur_dscnt_amt().multiply(trdBaseUnitQty).divide(hdrBaseUnitQty,
								hdrR.amt_dec_place().intValue(), toRoundingMode(hdrR.amt_rnd_typ())));
					}
		
					if (!isNull(hdrR.act_tax_rate()) && 
							(!isSame(hdrR.act_tax_rate(), hdrR.tax_rate()) || !isSame(hdrR.act_inc_tax_flg(), hdrR.inc_tax_flg()))) {
						MCRow amtTax = getAmtAndTax(
								(hdrR.trd_cur_upri().multiply(trdUnitBaseUnitQty).divide(hdrUnitBaseUnitQty, hdrR.upri_dec_place().intValue(),
										RoundingMode.HALF_UP)),
								dtl1R.trd_unit_qty(), hdrR.act_tax_rate(), hdrR.act_inc_tax_flg(), hdrR.amt_dec_place(), hdrR.amt_rnd_typ(),
								hdrR.tax_rnd_typ(), dtl1R.trd_cur_dscnt_amt());
						dtl1R.trd_cur_amt(amtTax.getNumberNE("amt"));
						dtl1R.trd_cur_tax_amt(amtTax.getNumberNE("tax_amt"));
						dtl1R.trd_cur_inc_tax_amt(amtTax.getNumberNE("inc_tax_amt"));
					}
					else {
						MCRow amtTax = getAmtAndTax(
								(hdrR.trd_cur_upri().multiply(trdUnitBaseUnitQty).divide(hdrUnitBaseUnitQty, hdrR.upri_dec_place().intValue(),
										RoundingMode.HALF_UP)),
								dtl1R.trd_unit_qty(), hdrR.tax_rate(), hdrR.inc_tax_flg(), hdrR.amt_dec_place(), hdrR.amt_rnd_typ(),
								hdrR.tax_rnd_typ(), dtl1R.trd_cur_dscnt_amt());
						dtl1R.trd_cur_amt(amtTax.getNumberNE("amt"));
						dtl1R.trd_cur_tax_amt(amtTax.getNumberNE("tax_amt"));
						dtl1R.trd_cur_inc_tax_amt(amtTax.getNumberNE("inc_tax_amt"));
					}
					//源泉税額
					if (!isNull(wtaxRate)) {
						dtl1R.wtax_amt(getTaxAmt(dtl1R.trd_cur_amt(), wtaxRate, hdrR.amt_dec_place(), hdrR.wtax_rnd_typ()));
					}
					//単価
					//（金額＋値引額）/数量
					//※単価×数量=金額とならない。
					//※明細によって単価は異なる。
					boolean incTaxFlg = !isNull(hdrR.act_tax_rate()) ? hdrR.act_inc_tax_flg() : hdrR.inc_tax_flg();
					if (incTaxFlg) {
						if (!isNull(dtl1R.trd_cur_inc_tax_amt()) && !isNull(dtl1R.trd_unit_qty()) && !dtl1R.trd_unit_qty().isZero()) {
							dtl1R.trd_cur_upri((dtl1R.trd_cur_inc_tax_amt().add(nvl(dtl1R.trd_cur_dscnt_amt(), MCNumber.ZERO)))
									.divide(dtl1R.trd_unit_qty(), hdrR.upri_dec_place().intValue(), toRoundingMode(hdrR.amt_rnd_typ())));
						}
					}
					else {
						if (!isNull(dtl1R.trd_cur_amt()) && !isNull(dtl1R.trd_unit_qty()) && !dtl1R.trd_unit_qty().isZero()) {
							dtl1R.trd_cur_upri((dtl1R.trd_cur_amt().add(nvl(dtl1R.trd_cur_dscnt_amt(), MCNumber.ZERO))).divide(dtl1R.trd_unit_qty(),
									hdrR.upri_dec_place().intValue(), toRoundingMode(hdrR.amt_rnd_typ())));
						}
					}
					
					if(!isNull(dtl1R.trd_cur_amt())) {
						// 有償支給金額・加工金額：単価を受発注有償支給単価・加工単価で案分する
						MCList<MCRow> amtL = calcPropOutSrcUpri(dtl1R.trd_cur_amt(), hdrR.amt_dec_place(), hdrR.trd_cur_onr_prov_upri(), hdrR.trd_cur_proc_upri(), dtl1R.trd_cur_dscnt_amt());
						dtl1R.trd_cur_onr_prov_amt(amtL.get(0).getNumberNE("amt"));
						dtl1R.trd_cur_proc_amt(amtL.get(1).getNumberNE("amt"));
						// 有償支給単価・加工単価：単価を受発注有償支給単価・加工単価で案分する
						MCList<MCRow> upriL = calcPropOutSrcUpri(dtl1R.trd_cur_upri(), hdrR.upri_dec_place(), hdrR.trd_cur_onr_prov_upri(), hdrR.trd_cur_proc_upri(), null);
						dtl1R.trd_cur_onr_prov_upri(upriL.get(0).getNumberNE("amt"));
						dtl1R.trd_cur_proc_upri(upriL.get(1).getNumberNE("amt"));
					}
				}

			}
		}
	}
	
	/**
	 * 上段リストの数量を計算する。<br>
	 * <br>
	 * ＜リストの定義＞<br>
	 * hdrL:ヘッダリスト<br>
	 * dtl1L:上段リスト<br>
	 * dtl2L:下段リスト<br>
	 * ＜引数リストの必須項目＞<br>
	 * ■hdrL<br>
	 *  peg_no<BR>
	 *  base_unit_dec_place<BR>
	 *  base_unit_rnd_typ<BR>
	 * ■dtl1L<br>
	 *  peg_no<br>
	 *  hdr_peg_no<br>
	 * ■dtl2L<br> 
	 *  peg_no<br>
	 *  dtl_peg_no<br>
	 *  trd_unit_cd<BR>
	 *  trd_unit_qty<BR>
	 *  trd_unit_conv_base_qty<br>
	 *  trd_unit_conv_qty<br>
	 *  schd_trd_unit_cd：まとめ先の単位。返品の場合は画面の入力値を想定。<br>
	 *  schd_trd_unit_conv_base_qty<br>
	 *  schd_trd_unit_conv_qty<br>
	 *  schd_trd_unit_dec_place<br>
	 *  schd_trd_unit_rnd_typ<br>
	 * ＜当処理で設定される項目＞<br>
	 * ■dtl1L<br>
	 *  trd_unit_qty<BR>
	 *  trd_unit_cd<BR>
	 * <br>
	 * @param hdrL ヘッダリスト
	 * @param dtl1L 上段リスト
	 * @param dtl2L 下段リスト
	 */
	public static void calcDtlQty(MCList<ConvQtyAmtUtil_HdrR> hdrL, MCList<ConvQtyAmtUtil_DtlR> dtl1L, MCList<ConvQtyAmtUtil_Dtl2R> dtl2L) {

		_util._calcDtlQty(hdrL, dtl1L, dtl2L);
	}

	protected void _calcDtlQty(MCList<ConvQtyAmtUtil_HdrR> hdrL, MCList<ConvQtyAmtUtil_DtlR> dtl1L, MCList<ConvQtyAmtUtil_Dtl2R> dtl2L) {
		MCIndexKey dtl2Key = dtl2L.createIndex(ConvQtyAmtUtil_Dtl2R.$dtl_peg_no);
		MCIndexKey hdrKey = hdrL.createIndex(ConvQtyAmtUtil_HdrR.$peg_no);
		for (ConvQtyAmtUtil_DtlR dtl1R : dtl1L) {
			MCList<ConvQtyAmtUtil_Dtl2R> subDtlL = dtl2L.subList(dtl2Key, dtl1R.peg_no());
			ConvQtyAmtUtil_HdrR hdrR = hdrL.getFirst(hdrKey, dtl1R.hdr_peg_no());

			//単位が複数存在する場合は何もしない
			if (1 < subDtlL.groupBy(ConvQtyAmtUtil_Dtl2R.$trd_unit_cd).size()) {
				continue;
			}

			//予定単位に換算できるかどうか
			boolean convSchdUnit = false;
			MCNumber trdUnitQty = subDtlL.sum(ConvQtyAmtUtil_Dtl2R.$trd_unit_qty);
			MCNumber convQty = null;
			// 予定情報はsubLの全行で同じデータなので最初のデータを利用
			ConvQtyAmtUtil_Dtl2R subR = subDtlL.get(0);
			convQty = unitConv(trdUnitQty, subR.trd_unit_conv_base_qty(), subR.trd_unit_conv_qty(), hdrR.base_unit_dec_place(),
					hdrR.base_unit_rnd_typ(), subR.schd_trd_unit_conv_base_qty(), subR.schd_trd_unit_conv_qty(), subR.schd_trd_unit_dec_place(),
					subR.schd_trd_unit_rnd_typ(), true);
			if (isNull(convQty)) {
				convQty = trdUnitQty;
			}
			else {
				convSchdUnit = true;
			}
			dtl1R.trd_unit_qty(convQty);
			dtl1R.trd_unit_cd(convSchdUnit ? subR.schd_trd_unit_cd() : subR.trd_unit_cd());
		}

	}

	protected java.math.RoundingMode toRoundingMode(String rndTyp) {
		MAC_RND_TYP typ = MAC_RND_TYP.getNE(rndTyp);
		if (typ == null) {
			return null;
		}
		else {
			return typ.toMC();
		}
	}
	
	/**
	 * 基準単位数量から取引単位数量に換算します。<p>
	 * 換算時に余りが出る場合、基準単位数量がnullの場合はnullを返します。<br>
	 * 基準単位の小数部有効桁数及び端数処理区分の項目名は以下の名称を使用します。<br>
	 * <li>小数部有効桁数：base_unit_dec_place
	 * <li>端数処理区分：base_unit_rnd_typ
	 */
	public static MCNumber cnvBaseToTrdUnitQty(
			MCNumber baseUnitQty, MCRow rsltR,
			MCNumber convBaseQty, MCNumber convQty, MCNumber decPlace, String rndTyp) {
	
		if (isNull(baseUnitQty)) {
			return null;
		}
	
		// 基準単位数量→取引単位数量
		MCNumber trdUnitQty
			= rvrsBaseUnitConv(
				baseUnitQty, convBaseQty, convQty, decPlace, rndTyp);
		// 取引単位数量→基準単位数量
		MCNumber cnvQty
			= convToBaseUnit(
				trdUnitQty, convBaseQty, convQty, 
				rsltR.getNumber("base_unit_dec_place"), rsltR.getString("base_unit_rnd_typ"));
		// 基準単位数量⇔取引単位数量に換算できた場合のみ、取引単位数量を返す
		if (baseUnitQty.eq(cnvQty)) {
			return trdUnitQty;
		}
		return null;
	}
	/**
	 * 金額を有償支給単価・加工単価で案分し、有償支給金額・加工金額を取得します。<p>
	 * 値引額がある場合は、値引き前の金額をもとに案分し、計算後の加工金額を値引します。<br>
	 * @param amt 金額(案分元)
	 * @param decPlace 小数部有効桁数
	 * @param onrProvUpri 有償支給単価
	 * @param procUpri 加工単価
	 * @param dscntAmt 値引額
	 * @return [0].amt 有償支給金額計算結果<br>
	 *		   [1].amt 加工金額計算結果
	 */
	public static MCList<MCRow> calcPropOutSrcUpri(MCNumber amt, MCNumber decPlace, MCNumber onrProvUpri, MCNumber procUpri, MCNumber dscntAmt) {
		return _util._calcPropOutSrcUpri(amt, decPlace, onrProvUpri, procUpri, dscntAmt);
	}
	protected MCList<MCRow> _calcPropOutSrcUpri(MCNumber amt, MCNumber decPlace, MCNumber onrProvUpri, MCNumber procUpri, MCNumber dscntAmt) {
		MCList<MCRow> retL = MCList.create(MCRow.class);
		retL.addNumberColumn("upri");
		retL.addNumberColumn("amt");
		MCRow onrProvR = MCRow.create();
		MCRow procR = MCRow.create();
		retL.add(onrProvR);
		retL.add(procR);
		if (!isNull(amt)) {
			if (isUpriEntered(onrProvUpri) || isUpriEntered(procUpri)) {
				onrProvR.setNumberNE("upri", onrProvUpri);
				procR.setNumberNE("upri", procUpri);
				FXUCC_Divide.prop(retL, amt.add(isNull(dscntAmt) ? MCNumber.ZERO : dscntAmt), isNull(decPlace) ? 0 : decPlace.intValue(), "upri", "amt");
				procR.setNumberNE("amt", nvl(procR.getNumberNE("amt"), MCNumber.ZERO).subtract(isNull(dscntAmt) ? MCNumber.ZERO : dscntAmt));
			}
			else {
				onrProvR.setNumberNE("amt", onrProvUpri);
				procR.setNumberNE("amt", procUpri);
			}
		}
		return retL;
	}
	protected boolean isUpriEntered(MCNumber upri) {
		if (!isNull(upri) && !upri.isZero()) {
			return true;
		}
		return false;
	}

}