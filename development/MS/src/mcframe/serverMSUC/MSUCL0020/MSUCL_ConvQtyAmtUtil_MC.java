package mcframe.serverMSUC.MSUCL0020;

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
import mcframe.serverMSUC.MSUCL0020.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMAUC.MAUCL0100.MAUCL_AmtUtil.*;
import mcframe.commonFXUC.FXUCC0030.FXUCC_Divide;
import java.math.RoundingMode;
import static mcframe.serverCore.requester.MCRequestObject.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSUCL_ConvQtyAmtUtil"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSUCL_ConvQtyAmtUtil_MC extends MSUCL_ConvQtyAmtUtil_MC_A{
	//FMCB CUSTOM START
	protected static final Class<MSUCL_ConvQtyAmtUtil> CLAZZ = MSUCL_ConvQtyAmtUtil.class;

	/**
	 * ConvQtyAmtUtil_Calc01オペレーション.<p>
	 * 下段リストから上段リストの数量を計算する。<br>
	 * ＜リストの定義＞<br>
	 * hdrL:ヘッダリスト<br>
	 * dtl1L:上段リスト(例：明細)<br>
	 * dtl2L:下段リスト(例：受払)<br>
	 * 
	 */
	public class ConvQtyAmtUtil_Calc01 extends MSUCL_ConvQtyAmtUtil_MC_A.ConvQtyAmtUtil_Calc01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			down0().setAll(getDtl1L(up0(),up1()));
			down1().setAll(up1());

		}
		
		/**
		 * 予定（ヘッダ）と詳細情報（下段リスト）から明細（上段リスト）を作成して返します。<p>
		 * 詳細の処理単位は「グループＮＯ」 +「ロット明細分割区分」単位です。

		 * @param hdrL 予定
		 * @param dtl2L 詳細
		 * @return 明細
		 */
		protected MCList<ConvQtyAmtUtil_Calc01_Dtl1R> getDtl1L(
				MCList<ConvQtyAmtUtil_Calc01_HdrR> hdrL, MCList<ConvQtyAmtUtil_Calc01_Dtl2R> dtl2L) {

			MCList<ConvQtyAmtUtil_Calc01_Dtl1R> dtl1L = MCList.create(ConvQtyAmtUtil_Calc01_Dtl1R.class);
			MCIndexKey hdrKey = hdrL.createIndex(ConvQtyAmtUtil_Calc01_HdrR.$peg_no);
			MCIndexKey dtl2Key = dtl2L.createIndex(ConvQtyAmtUtil_Calc01_Dtl2R.$grp_no, ConvQtyAmtUtil_Calc01_Dtl2R.$grp_no2);
			//明細紐付ＮＯ
			int dtl_peg_no = 1;

			for(ConvQtyAmtUtil_Calc01_Dtl2R dtl2GR : dtl2L.groupBy(ConvQtyAmtUtil_Calc01_Dtl2R.$grp_no, ConvQtyAmtUtil_Calc01_Dtl2R.$grp_no2)){
				MCList<ConvQtyAmtUtil_Calc01_Dtl2R> subDtl2L = dtl2L.subList(dtl2Key, dtl2GR.grp_no(), dtl2GR.grp_no2());
				ConvQtyAmtUtil_Calc01_HdrR hdrR = hdrL.getFirst(hdrKey, subDtl2L.get(0).hdr_peg_no());
				
				//ロット明細分割区分に応じたグループ化文字列
				String[] gbKeyStr = getGrpByStrForSlipEachLotTyp(hdrR.slip_each_lot_typ());

				MCList<ConvQtyAmtUtil_Calc01_Dtl2R> subGrpL =subDtl2L.groupBy(gbKeyStr);
				MCIndexKey subGKey = subDtl2L.createIndex(gbKeyStr);
				//ループ単位はロット明細分割区分に応じて決定
				for(ConvQtyAmtUtil_Calc01_Dtl2R subDtl2R : subGrpL){

					//上段に追加する１ＲＯＷに対応する下段のリストを取得
					MCList<ConvQtyAmtUtil_Calc01_Dtl2R> subL
					= subDtl2L.subList(subGKey, getSubValsForSlipEachLotTyp(hdrR.slip_each_lot_typ(), subDtl2R));

					//単位が複数存在する場合はまとめない
					if(1 < subL.groupBy(ConvQtyAmtUtil_Calc01_Dtl2R.$trd_unit_cd).size()){
						for (ConvQtyAmtUtil_Calc01_Dtl2R dtl2R : subL) {
							ConvQtyAmtUtil_Calc01_Dtl1R addR = ConvQtyAmtUtil_Calc01_Dtl1R.create();
							copy(addR, dtl2R, createMap_ConvQtyAmtUtil_Calc01_Dtl1R_ConvQtyAmtUtil_Calc01_Dtl2R());
							dtl2R.dtl_peg_no(dtl_peg_no);
							addR.peg_no(dtl_peg_no);
							dtl_peg_no++;
							dtl1L.add(addR);
						}
						continue;
					}

					//予定単位に換算できるかどうか
					boolean convSchdUnit = false;
					MCNumber trdUnitQty = subL.sum(ConvQtyAmtUtil_Calc01_Dtl2R.$trd_unit_qty);
					MCNumber convQty = null;
					// 予定情報はsubLの全行で同じデータなので最初のデータを利用
					ConvQtyAmtUtil_Calc01_Dtl2R subR = subL.get(0);
					convQty = unitConv(trdUnitQty, subR.trd_unit_conv_base_qty(), subR.trd_unit_conv_qty(), hdrR.base_unit_dec_place(),
							hdrR.base_unit_rnd_typ(), subR.schd_trd_unit_conv_base_qty(), subR.schd_trd_unit_conv_qty(),
							subR.schd_trd_unit_dec_place(), subR.schd_trd_unit_rnd_typ(), true);
					if(isNull(convQty)){
						convQty=trdUnitQty;
					}
					else {
						convSchdUnit = true;
					}
					//追加する上段ＲＯＷ
					ConvQtyAmtUtil_Calc01_Dtl1R addR = ConvQtyAmtUtil_Calc01_Dtl1R.create();
					addR.hdr_peg_no(hdrR.peg_no());
					addR.peg_no(dtl_peg_no);
					//明細紐付ＮＯ
					subL.setNumber(ConvQtyAmtUtil_Calc01_Dtl2R.$dtl_peg_no, dtl_peg_no);
					dtl_peg_no++;

					if (MAC_SLIP_EACH_LOT_TYP.isEACH_LOT(hdrR.slip_each_lot_typ())) {
						addR.lot_no(subL.get(0).lot_no());
					}
					else if (MAC_SLIP_EACH_LOT_TYP.isEACH_LOT_SUBLOT(hdrR.slip_each_lot_typ())) {
						addR.lot_no(subL.get(0).lot_no());
						addR.sublot_no(subL.get(0).sublot_no());
					}

					addR.trd_unit_qty(convQty);
					addR.trd_unit_cd(convSchdUnit ? subR.schd_trd_unit_cd() : subR.trd_unit_cd());
					dtl1L.add(addR);
				}
			}

			return dtl1L;
		}

		protected String[] getGrpByStrForSlipEachLotTyp(String slip_each_lot_typ) {

			String[] str = null;

			if (MAC_SLIP_EACH_LOT_TYP.isNOT_EACH(slip_each_lot_typ)) {

				str = new String[] {
						ConvQtyAmtUtil_Calc01_Dtl2R.$grp_no, ConvQtyAmtUtil_Calc01_Dtl2R.$grp_no2, ConvQtyAmtUtil_Calc01_Dtl2R.$hdr_peg_no
				};
			}
			else if (MAC_SLIP_EACH_LOT_TYP.isEACH_LOT(slip_each_lot_typ)) {

				str = new String[] {
						ConvQtyAmtUtil_Calc01_Dtl2R.$grp_no, ConvQtyAmtUtil_Calc01_Dtl2R.$grp_no2, ConvQtyAmtUtil_Calc01_Dtl2R.$hdr_peg_no, ConvQtyAmtUtil_Calc01_Dtl2R.$lot_no
				};
			}
			else if (MAC_SLIP_EACH_LOT_TYP.isEACH_LOT_SUBLOT(slip_each_lot_typ)) {

				str = new String[] {
						ConvQtyAmtUtil_Calc01_Dtl2R.$grp_no, ConvQtyAmtUtil_Calc01_Dtl2R.$grp_no2, ConvQtyAmtUtil_Calc01_Dtl2R.$hdr_peg_no, ConvQtyAmtUtil_Calc01_Dtl2R.$lot_no, ConvQtyAmtUtil_Calc01_Dtl2R.$sublot_no
				};
			}

			return str;
		}

		protected Comparable<?>[] getSubValsForSlipEachLotTyp(String slip_each_lot_typ,
				ConvQtyAmtUtil_Calc01_Dtl2R subDtl2R) {

			Comparable[] subVals = null;

			if(MAC_SLIP_EACH_LOT_TYP.isNOT_EACH(slip_each_lot_typ)){

				subVals = new Comparable[]{
						subDtl2R.grp_no(), subDtl2R.grp_no2(), subDtl2R.hdr_peg_no()
				};
			}
			else 
				if(MAC_SLIP_EACH_LOT_TYP.isEACH_LOT(slip_each_lot_typ)){

				subVals = new Comparable[]{
						subDtl2R.grp_no(), 
						subDtl2R.grp_no2(),
						subDtl2R.hdr_peg_no(),
						subDtl2R.lot_no()
				};
			}
			else if(MAC_SLIP_EACH_LOT_TYP.isEACH_LOT_SUBLOT(slip_each_lot_typ)){

				subVals = new Comparable[]{
						subDtl2R.grp_no(), 
						subDtl2R.grp_no2(),
						subDtl2R.hdr_peg_no(),
						subDtl2R.lot_no(),
						subDtl2R.sublot_no()
				};
			}

			return subVals;
		}

	
	}

	protected Map_ConvQtyAmtUtil_Calc01_Dtl1R_ConvQtyAmtUtil_Calc01_Dtl2R<ConvQtyAmtUtil_Calc01_Dtl1R,ConvQtyAmtUtil_Calc01_Dtl2R> createMap_ConvQtyAmtUtil_Calc01_Dtl1R_ConvQtyAmtUtil_Calc01_Dtl2R() {
		return new Map_ConvQtyAmtUtil_Calc01_Dtl1R_ConvQtyAmtUtil_Calc01_Dtl2R<ConvQtyAmtUtil_Calc01_Dtl1R, ConvQtyAmtUtil_Calc01_Dtl2R>();
	}

	public class Map_ConvQtyAmtUtil_Calc01_Dtl1R_ConvQtyAmtUtil_Calc01_Dtl2R<D extends ConvQtyAmtUtil_Calc01_Dtl1R, S extends ConvQtyAmtUtil_Calc01_Dtl2R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {

			addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl1R.$hdr_peg_no, ConvQtyAmtUtil_Calc01_Dtl2R.$hdr_peg_no);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl1R.$lot_no, ConvQtyAmtUtil_Calc01_Dtl2R.$lot_no);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl1R.$sublot_no, ConvQtyAmtUtil_Calc01_Dtl2R.$sublot_no);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl1R.$trd_unit_qty, ConvQtyAmtUtil_Calc01_Dtl2R.$trd_unit_qty);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl1R.$trd_unit_cd, ConvQtyAmtUtil_Calc01_Dtl2R.$trd_unit_cd);

		}
	}
	/**
	 * ConvQtyAmtUtil_Calc02オペレーション.<p>
	 *
	 * 上段リストの金額を計算する。<br>
	 * <br>
	 * ＜リストの定義＞<br>
	 * hdrL:ヘッダリスト<br>
	 * dtl1L:上段リスト(例：明細)<br>
	 * dtl2L:下段リスト(例：受払)<br>
	 * ＜備考＞<br>
	 * 通常とは異なる金額計算であるため、仕入・売上での使用を想定する。<br>
	 */
	public class ConvQtyAmtUtil_Calc02 extends MSUCL_ConvQtyAmtUtil_MC_A.ConvQtyAmtUtil_Calc02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			setAmtToDtl1L(up0(), up1());
			setDown();
		}
		protected void setAmtToDtl1L(MCList<ConvQtyAmtUtil_Calc01_HdrR> hdrL, MCList<ConvQtyAmtUtil_Calc01_Dtl1R> dtl1L) {
			
			MCIndexKey key = dtl1L.createIndex(ConvQtyAmtUtil_Calc01_Dtl1R.$hdr_peg_no);
			for(ConvQtyAmtUtil_Calc01_HdrR hdrR : hdrL){
				if (isNull(hdrR.trd_cur_upri())) {
					continue;
				}
				//ヘッダに対応する上段リストの取得
				MCList<ConvQtyAmtUtil_Calc01_Dtl1R> subDtl1L = dtl1L.subList(key, hdrR.peg_no());
				//明細が1件で、受発注単位と同じ、全数仕入の場合、金額項目は全て発注と同じ
				if (subDtl1L.size() == 1) {
					ConvQtyAmtUtil_Calc01_Dtl1R dtl1R = subDtl1L.get(0);
					// 値引額あるいは税が受発注時と実績時で異なる場合、実績時の値引額・税で再計算（金額、税額、税込金額）
					// hdrR.act_tax_rate()がNULLの場合は受発注時と同じとみなす
					boolean isCalcAmt = (dtl1R.dscnt_amt_input_flg() && !isSame(dtl1R.trd_cur_dscnt_amt(), hdrR.trd_cur_dscnt_amt()) ||
								!isNull(hdrR.act_tax_rate()) && 
								!isSame(hdrR.act_inc_tax_flg(), hdrR.inc_tax_flg()));
					if (isSame(hdrR.trd_unit_cd(), dtl1R.trd_unit_cd()) && isSame(hdrR.trd_unit_qty(), dtl1R.trd_unit_qty())) {
						// 入力値がある場合はそちらを使用
						MCNumber dscntAmt = dtl1R.dscnt_amt_input_flg() ? dtl1R.trd_cur_dscnt_amt() : hdrR.trd_cur_dscnt_amt();
						if (isCalcAmt) {
							MCRow amtTax = getAmtAndTax(hdrR.trd_cur_upri(), hdrR.trd_unit_qty(), hdrR.act_tax_rate(), hdrR.act_inc_tax_flg(), hdrR.amt_dec_place(), hdrR.amt_rnd_typ(),
									hdrR.tax_rnd_typ(), dscntAmt);
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
						if (!isNull(dscntAmt)) {
							dtl1R.trd_cur_dscnt_amt(dscntAmt);
						}
						
						dtl1R.trd_cur_proc_amt(hdrR.trd_cur_proc_amt());
						dtl1R.trd_cur_onr_prov_amt(hdrR.trd_cur_onr_prov_amt());
//						dtl1R.wtax_amt(hdrR.wtax_amt());
						MCNumber wtaxRate = dtl1R.wtax_rate();
						if (isNull(dtl1R.wtax_rate())) {
							wtaxRate = hdrR.wtax_rate();
						}
						if (!isNull(wtaxRate)) {
							dtl1R.wtax_amt(getTaxAmt(dtl1R.trd_cur_amt(), wtaxRate, hdrR.amt_dec_place(), getCo().wtax_rnd_typ()));	
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

						if (!isNullOr(hdrBaseUnitQty, trdBaseUnitQty)
							&& isSame(hdrBaseUnitQty.abs(), trdBaseUnitQty.abs())
							&& !isNullOr(hdrR.trd_cur_amt(), hdrR.trd_cur_tax_amt(), hdrR.trd_cur_inc_tax_amt())) {

							// 符号を含めて一致しているときはヘッダの金額を引き継ぐ
							// 符号が異なる時はヘッダの金額の符号を反転して設定する（売上実績一覧登録の与信戻しで符号が異なることがある）
							int sign = isSame(hdrBaseUnitQty, trdBaseUnitQty) ? 1 : -1;
							
							//単価
							//（金額＋値引額）/数量
							//※単価×数量=金額とならない。
							//※明細によって単価は異なる。
							if (hdrR.inc_tax_flg()) {
								dtl1R.trd_cur_inc_tax_amt(hdrR.trd_cur_inc_tax_amt().multiply(sign));
								
								if(isNull(hdrR.act_tax_rate()) || isSame(hdrR.act_tax_rate(), hdrR.tax_rate())) {
									dtl1R.trd_cur_tax_amt(hdrR.trd_cur_tax_amt().multiply(sign));
									dtl1R.trd_cur_amt(hdrR.trd_cur_amt().multiply(sign));
								}
								else {
									dtl1R.trd_cur_tax_amt(getIncTaxAmt(dtl1R.trd_cur_inc_tax_amt(), hdrR.act_tax_rate(),
											hdrR.amt_dec_place(), hdrR.amt_rnd_typ()).multiply(sign));
									dtl1R.trd_cur_amt(hdrR.trd_cur_inc_tax_amt() != null ? hdrR.trd_cur_inc_tax_amt().subtract(nvl(dtl1R.trd_cur_tax_amt(), MCNumber.ZERO)).multiply(sign) : null);
								}
								
								if (!isNull(dtl1R.trd_cur_inc_tax_amt()) && !isNull(dtl1R.trd_unit_qty()) && !dtl1R.trd_unit_qty().isZero()) {
									dtl1R.trd_cur_upri((dtl1R.trd_cur_inc_tax_amt().add(nvl(dtl1R.trd_cur_dscnt_amt(), MCNumber.ZERO)))
											.divide(dtl1R.trd_unit_qty(), hdrR.upri_dec_place().intValue(), toRoundingMode(hdrR.amt_rnd_typ())));
								}
							}
							else {
								dtl1R.trd_cur_amt(hdrR.trd_cur_amt().multiply(sign));
								
								if(isNull(hdrR.act_tax_rate()) || isSame(hdrR.act_tax_rate(), hdrR.tax_rate())) {
									dtl1R.trd_cur_tax_amt(hdrR.trd_cur_tax_amt().multiply(sign));
									dtl1R.trd_cur_inc_tax_amt(hdrR.trd_cur_inc_tax_amt().multiply(sign));
								}
								else {
									dtl1R.trd_cur_tax_amt(getTaxAmt(dtl1R.trd_cur_amt(), hdrR.act_tax_rate(),
											hdrR.amt_dec_place(), hdrR.amt_rnd_typ()).multiply(sign));
									dtl1R.trd_cur_inc_tax_amt(hdrR.trd_cur_amt() != null ? hdrR.trd_cur_amt().add(nvl(dtl1R.trd_cur_tax_amt(), MCNumber.ZERO)).multiply(sign) : null);
								}
								
								if (!isNull(dtl1R.trd_cur_amt()) && !isNull(dtl1R.trd_unit_qty()) && !dtl1R.trd_unit_qty().isZero()) {
									dtl1R.trd_cur_upri((dtl1R.trd_cur_amt().add(nvl(dtl1R.trd_cur_dscnt_amt(), MCNumber.ZERO))).divide(dtl1R.trd_unit_qty(),
											hdrR.upri_dec_place().intValue(), toRoundingMode(hdrR.amt_rnd_typ())));
								}
							}
							// 加工単価
							if (!isNull(hdrR.trd_cur_proc_amt()) && !isNull(dtl1R.trd_unit_qty())) {
								dtl1R.trd_cur_proc_upri(hdrR.trd_cur_proc_amt().multiply(trdUnitBaseUnitQty)
										.divide(hdrBaseUnitQty, hdrR.upri_dec_place().intValue(),toRoundingMode(hdrR.amt_rnd_typ())));
							}
							//有償支給単価
							if (!isNull(hdrR.trd_cur_onr_prov_amt()) && !isNull(dtl1R.trd_unit_qty())) {
								dtl1R.trd_cur_onr_prov_upri(hdrR.trd_cur_onr_prov_amt().multiply(trdUnitBaseUnitQty)
										.divide(hdrBaseUnitQty, hdrR.upri_dec_place().intValue(),toRoundingMode(hdrR.amt_rnd_typ())));
							}
							
							// 入力値がある場合はそちらを使用
							MCNumber dscntAmt = dtl1R.dscnt_amt_input_flg() ? dtl1R.trd_cur_dscnt_amt() : hdrR.trd_cur_dscnt_amt();
							if (!isNull(dscntAmt)) {
								dtl1R.trd_cur_dscnt_amt(dscntAmt);
							}
							if (!isNull(hdrR.trd_cur_proc_amt())) {
								dtl1R.trd_cur_proc_amt(hdrR.trd_cur_proc_amt().multiply(sign));
							}
							if (!isNull(hdrR.trd_cur_onr_prov_amt())) {
								dtl1R.trd_cur_onr_prov_amt(hdrR.trd_cur_onr_prov_amt().multiply(sign));
							}
							
							MCNumber wtaxRate = dtl1R.wtax_rate();
							if (isNull(dtl1R.wtax_rate())) {
								wtaxRate = hdrR.wtax_rate();
							}
							if (!isNull(wtaxRate)) {
								dtl1R.wtax_amt(getTaxAmt(dtl1R.trd_cur_amt(), wtaxRate, hdrR.amt_dec_place(), getCo().wtax_rnd_typ()));	
							}
							continue;
						}
					}

				}
				for(ConvQtyAmtUtil_Calc01_Dtl1R dtl1R: subDtl1L){

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
						if (dtl1R.dscnt_amt_input_flg()) {
							// 入力値がある場合はそのままの値引額
						}
						else if (!isNull(dtl1R.trd_unit_qty()) && !isNull(hdrR.trd_cur_dscnt_amt())) {
							if (isNull(hdrR.schd_base_unit_qty())) {
								hdrR.schd_base_unit_qty(hdrBaseUnitQty);
							}
							dtl1R.trd_cur_dscnt_amt(
									hdrR.trd_cur_dscnt_amt().multiply(trdBaseUnitQty).divide(hdrR.schd_base_unit_qty(), hdrR.amt_dec_place().intValue(), toRoundingMode(hdrR.amt_rnd_typ())));
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
							dtl1R.wtax_amt(getTaxAmt(dtl1R.trd_cur_amt(), wtaxRate, hdrR.amt_dec_place(), getCo().wtax_rnd_typ()));
						}

					}
					//予定単位と異なる場合
					else {

						//値引額
						//(値引額×取引単位換算数 ×取引単位数量)/(受発注単位換算数 ×受発注数量)
						if (dtl1R.dscnt_amt_input_flg()) {
							// 入力値がある場合はそのままの値引額
						}
						else if (!isNull(dtl1R.trd_unit_qty()) && !isNull(hdrR.trd_cur_dscnt_amt())) {
							dtl1R.trd_cur_dscnt_amt(nvl(hdrR.trd_cur_dscnt_amt(), MCNumber.ZERO).multiply(trdBaseUnitQty).divide(hdrBaseUnitQty, hdrR.amt_dec_place().intValue(),
									toRoundingMode(hdrR.amt_rnd_typ())));
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
							dtl1R.wtax_amt(getTaxAmt(dtl1R.trd_cur_amt(), wtaxRate, hdrR.amt_dec_place(), getCo().wtax_rnd_typ()));
						}
						//単価
						//（金額＋値引額）/数量
						//※単価×数量=金額とならない。
						//※明細によって単価は異なる。
						boolean incTaxFlg = !isNull(hdrR.act_tax_rate()) ? hdrR.act_inc_tax_flg() : hdrR.inc_tax_flg();
						if (incTaxFlg) {
							if(!isNull(dtl1R.trd_cur_inc_tax_amt()) && !isNull(dtl1R.trd_unit_qty())) {
								dtl1R.trd_cur_upri((dtl1R.trd_cur_inc_tax_amt().add(nvl(dtl1R.trd_cur_dscnt_amt(), MCNumber.ZERO))).divide(dtl1R.trd_unit_qty(), hdrR
										.upri_dec_place().intValue(), toRoundingMode(hdrR.amt_rnd_typ())));
								}
						}else{
							if(!isNull(dtl1R.trd_cur_amt()) && !isNull(dtl1R.trd_unit_qty())) {
								dtl1R.trd_cur_upri((dtl1R.trd_cur_amt().add(nvl(dtl1R.trd_cur_dscnt_amt(), MCNumber.ZERO))).divide(dtl1R.trd_unit_qty(), hdrR
										.upri_dec_place().intValue(), toRoundingMode(hdrR.amt_rnd_typ())));
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

		protected void setDown() {

			down0().setAll(up1());
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
	 * ConvQtyAmtUtil_Calc03オペレーション.<p>
	 *
	 * 上段リストから下段リストの金額を計算する。<br>
	 * <br>
	 * ＜リストの定義＞<br>
	 * hdrL:ヘッダリスト<br>
	 * dtl1L:上段リスト(例：明細)<br>
	 * dtl2L:下段リスト(例：受払)<br>
	 * ＜備考＞<br>
	 * 通常とは異なる金額計算であるため、仕入・売上での使用を想定する。<br>
	 */
	public class ConvQtyAmtUtil_Calc03 extends MSUCL_ConvQtyAmtUtil_MC_A.ConvQtyAmtUtil_Calc03 {
		@Override
		protected void call() {
			super.call();
		}

		protected void doIt() {
			setAmtToDtl2FromDtl1L(up0(), up1(), up2());
			setDown();
		}
		protected void setAmtToDtl2FromDtl1L(MCList<ConvQtyAmtUtil_Calc01_HdrR> hdrL, MCList<ConvQtyAmtUtil_Calc01_Dtl1R> dtl1L,  MCList<ConvQtyAmtUtil_Calc01_Dtl2R> dtl2L) {

			MCIndexKey hdrKey = hdrL.createIndex(ConvQtyAmtUtil_Calc01_HdrR.$peg_no);
			MCIndexKey dtl2Key = dtl2L.createIndex(ConvQtyAmtUtil_Calc01_Dtl2R.$dtl_peg_no);
			//上段と下段の明細紐付ＮＯ単位の関係は下記を想定する。
			//上段：下段 = １：Ｎ
			//※上段：下段 = Ｎ：Ｎは想定しない。想定する場合は上段の処理単位でのサマリが必要になる。

			for(ConvQtyAmtUtil_Calc01_Dtl1R dtl1R : dtl1L){

				//上段に対応するヘッダの取得
				ConvQtyAmtUtil_Calc01_HdrR hdrR = hdrL.getFirst(hdrKey, dtl1R.hdr_peg_no());

				//上段に対応する下段リストの取得
				MCList<ConvQtyAmtUtil_Calc01_Dtl2R> subDtl2L = dtl2L.subList(dtl2Key, dtl1R.peg_no()); 
				
				//金額
				//上段の金額を下段の金額に、下段の基準単位数量の比率で割り当てる
				FXUCC_Divide.prop(subDtl2L, dtl1R.trd_cur_amt(), hdrR.amt_dec_place().intValue(),
						ConvQtyAmtUtil_Calc01_Dtl2R.$base_unit_qty, ConvQtyAmtUtil_Calc01_Dtl2R.$trd_cur_amt);

				//税額
				//上段の税額を下段の税額に、下段の基準単位数量の比率で割り当てる
				FXUCC_Divide.prop(subDtl2L, dtl1R.trd_cur_tax_amt(), hdrR.amt_dec_place().intValue(),
						ConvQtyAmtUtil_Calc01_Dtl2R.$base_unit_qty, ConvQtyAmtUtil_Calc01_Dtl2R.$trd_cur_tax_amt);
				
				//基準通貨税額
				//上段の基準通貨税額を下段の基準通貨税額に、下段の基準単位数量の比率で割り当てる
				FXUCC_Divide.prop(subDtl2L, dtl1R.base_cur_tax_amt(), getBaseCur().amt_dec_place().intValue(),
						ConvQtyAmtUtil_Calc01_Dtl2R.$base_unit_qty, ConvQtyAmtUtil_Calc01_Dtl2R.$base_cur_tax_amt);

				//納税通貨税額
				//上段の納税通貨税額を下段の納税通貨税額に、下段の基準単位数量の比率で割り当てる
				if (!isNull(getPtaxCur()) && !getPtaxCur().isEmpty()) {
					FXUCC_Divide.prop(subDtl2L, dtl1R.ptax_cur_tax_amt(), getPtaxCur().amt_dec_place().intValue(),
							ConvQtyAmtUtil_Calc01_Dtl2R.$base_unit_qty, ConvQtyAmtUtil_Calc01_Dtl2R.$ptax_cur_tax_amt);
				}
			
				//値引額
				//上段の値引額を下段の値引額に、下段の基準単位数量の比率で割り当てる
				if (!isNull(dtl1R.trd_cur_dscnt_amt())) {
					FXUCC_Divide.prop(subDtl2L, dtl1R.trd_cur_dscnt_amt(), hdrR.amt_dec_place().intValue(),
							ConvQtyAmtUtil_Calc01_Dtl2R.$base_unit_qty, ConvQtyAmtUtil_Calc01_Dtl2R.$trd_cur_dscnt_amt);
				}

				
				//源泉税額
				//上段の源泉税額を下段の源泉税額に、下段の基準単位数量の比率で割り当てる
				if (!isNull(dtl1R.wtax_amt())) {
					FXUCC_Divide.prop(subDtl2L, dtl1R.wtax_amt(), hdrR.amt_dec_place().intValue(),
							ConvQtyAmtUtil_Calc01_Dtl2R.$base_unit_qty, ConvQtyAmtUtil_Calc01_Dtl2R.$wtax_amt);
				}
				
				for (ConvQtyAmtUtil_Calc01_Dtl2R dtl2R : subDtl2L) {

					//税込金額
					dtl2R.trd_cur_inc_tax_amt(dtl2R.trd_cur_amt().add(dtl2R.trd_cur_tax_amt()));
	
					//単価
					//（金額+値引額）/数量
					if (hdrR.inc_tax_flg()) {
						dtl2R.trd_cur_upri((dtl2R.trd_cur_inc_tax_amt().add(nvl(dtl2R.trd_cur_dscnt_amt(), MCNumber.ZERO))).divide(dtl2R.trd_unit_qty(),
								hdrR.upri_dec_place().intValue(), toRoundingMode(hdrR.amt_rnd_typ())));
					}
					else {
						dtl2R.trd_cur_upri((dtl2R.trd_cur_amt().add(nvl(dtl2R.trd_cur_dscnt_amt(), MCNumber.ZERO))).divide(dtl2R.trd_unit_qty(),
								hdrR.upri_dec_place().intValue(), toRoundingMode(hdrR.amt_rnd_typ())));
					}

					if(!isNull(dtl2R.trd_cur_amt())) {
						// 有償支給金額・加工金額：金額を上段リストの加工単価・有償支給単価で案分する
						MCList<MCRow> amtL = calcPropOutSrcUpri(dtl2R.trd_cur_amt(), hdrR.amt_dec_place(), dtl1R.trd_cur_onr_prov_upri(), dtl1R.trd_cur_proc_upri(), dtl2R.trd_cur_dscnt_amt());
						dtl2R.trd_cur_onr_prov_amt(amtL.get(0).getNumberNE("amt"));
						dtl2R.trd_cur_proc_amt(amtL.get(1).getNumberNE("amt"));
						// 有償支給単価・加工単価：単価を上段リストの有償支給単価・加工単価で案分する
						MCList<MCRow> upriL = calcPropOutSrcUpri(dtl2R.trd_cur_upri(), hdrR.upri_dec_place(), dtl1R.trd_cur_onr_prov_upri(), dtl1R.trd_cur_proc_upri(), null);
						dtl2R.trd_cur_onr_prov_upri(upriL.get(0).getNumberNE("amt"));
						dtl2R.trd_cur_proc_upri(upriL.get(1).getNumberNE("amt"));
					}

				}
			}
		}

		protected void setDown() {

			down0().setAll(up2());

		}
	}

	/**
	 * ConvQtyAmtUtil_Calc04オペレーション.<p>
	 *
	 * 上段・下段の金額計算処理(Calc02、Calc03)をまとめて実施する。<br>
	 * <br>
	 * ＜リストの定義＞<br>
	 * hdrL:ヘッダリスト<br>
	 * dtl1L:上段リスト(例：明細)<br>
	 * dtl2L:下段リスト(例：受払)<br>
	 * ＜備考＞<br>
	 * 通常とは異なる金額計算であるため、仕入・売上での使用を想定する。<br>
	 */
	public class ConvQtyAmtUtil_Calc04 extends MSUCL_ConvQtyAmtUtil_MC_A.ConvQtyAmtUtil_Calc04 {
	
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {

			callCalc02();
			callCalc03();
			setDown();
		}

		protected void callCalc02() {

			MSUCL_ConvQtyAmtUtil.ConvQtyAmtUtil_Calc02 calc02 = MSUCL_ConvQtyAmtUtil.crtConvQtyAmtUtil_Calc02();
			calc02.up0().setAll(up0());
			calc02.up1().setAll(up1());
			calc02.exec();

			String[] copyCols = new String[]{
					ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_upri,
					ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_dscnt_amt,
					ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_amt,
					ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_tax_amt,
					ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_inc_tax_amt,
					ConvQtyAmtUtil_Calc01_Dtl1R.$wtax_amt
			};
			copyByPegNo(up1(), copyCols, calc02.down0(), copyCols);

		}

		protected void callCalc03() {

			MSUCL_ConvQtyAmtUtil.ConvQtyAmtUtil_Calc03 calc03 = MSUCL_ConvQtyAmtUtil.crtConvQtyAmtUtil_Calc03();
			calc03.up0().setAll(up0());
			calc03.up1().setAll(up1());
			calc03.up2().setAll(up2());
			calc03.exec();

			String[] copyCols = new String[]{
					ConvQtyAmtUtil_Calc01_Dtl2R.$trd_cur_upri,
					ConvQtyAmtUtil_Calc01_Dtl2R.$trd_cur_dscnt_amt,
					ConvQtyAmtUtil_Calc01_Dtl2R.$trd_cur_amt,
					ConvQtyAmtUtil_Calc01_Dtl2R.$trd_cur_tax_amt,
					ConvQtyAmtUtil_Calc01_Dtl2R.$trd_cur_inc_tax_amt,
					ConvQtyAmtUtil_Calc01_Dtl2R.$wtax_amt
			};
			copyByPegNo(up2(), copyCols, calc03.down0(), copyCols);

		}

		protected void setDown() {

			down0().setAll(up1());
			down1().setAll(up2());

		}
	}
		/**
		 * 金額を有償支給単価・加工単価で案分し、有償支給金額・加工金額を取得します。<p>
		 * 値引額がある場合は、値引き前の金額をもとに案分し、計算後の加工金額を値引します<br>
		 * @param amt 金額(案分元)
		 * @param decPlace 小数部有効桁数
		 * @param onrProvUpri 有償支給単価
		 * @param procUpri 加工単価
		 * @param dscntAmt 値引額
		 * @return [0].amt 有償支給金額計算結果<br>
		 *		   [1].amt 加工金額計算結果
		 */
		public static MCList<MCRow> calcPropOutSrcUpri(MCNumber amt, MCNumber decPlace, MCNumber onrProvUpri, MCNumber procUpri, MCNumber dscntAmt) {
			return object(CLAZZ)._calcPropOutSrcUpri(amt, decPlace, onrProvUpri, procUpri, dscntAmt);
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

	//FMCB CUSTOM END
}