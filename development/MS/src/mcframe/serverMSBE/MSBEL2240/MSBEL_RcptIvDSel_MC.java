package mcframe.serverMSBE.MSBEL2240;

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
import static mcframe.serverMSBE.MSBEL2240.Query.*;
import mcframe.serverMSUC.MSUCL0020.*;
import static mcframe.serverMAUC.MAUCL0100.MAUCL_AmtUtil.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBEL_RcptIvDSel"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBEL_RcptIvDSel_MC extends MSBEL_RcptIvDSel_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 受領インボイス作成元区分に従い、追加候補の入荷予定、入荷実績を取得する。<br>
	 */
	public class Srch01 extends MSBEL_RcptIvDSel_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			MCQueryPlan sql = MSBEL2240_MST_PURC_SCHD_S01();
			// 受領インボイス作成元区分：入荷予定
			if  (MSC_RCPT_IV_SRC_TYP.isARR_SCHD(up0().rcpt_iv_src_typ())) {
				sql.addDynamicSQLInfo(MSBEL2240_MST_PURC_SCHD_S01_WHERE01());
			}
			// 検索モード：入荷実績
			else {
				sql.addDynamicSQLInfo(MSBEL2240_MST_PURC_SCHD_S01_WHERE02());
			}
			executeQuery(down0(), sql, up0());
		}
		
		@Override
		protected void editListMain() {
			super.editListMain();
			filterRcptIvSrcData();
			removeDupRcptIvSrcData();
			calcAmt(down0());
		}
		protected void removeDupRcptIvSrcData() {
			MCList<Srch01_RsltR> tmpL = down0().createInstance();
			MCIndexKey key = up1().createIndex(
				MSC_RCPT_IV_SRC_TYP.isARR_SCHD(up0().rcpt_iv_src_typ()) ?
				Srch01_Cnd2R.$arr_schd_no : Srch01_Cnd2R.$arr_act_no
			);
			for (Srch01_RsltR downR : down0()) {
				if (isNull(up1().getFirst(key, downR.toArray(key.getKeys())))) {
					if (isNull(up1().getFirst(key, downR.purc_schd_no()))) {
						if (up0().has_arr_basis_flg()) {
							if ((MAC_PURC_BASIS_TYP.isARR_BASIS(downR.purc_basis_typ())
									&& isSame(up0().purc_schd_dt(), downR.purc_schd_dt()))
									|| !MAC_PURC_BASIS_TYP.isARR_BASIS(downR.purc_basis_typ())) {
								tmpL.add(downR);
							}
						}
						else {
							tmpL.add(downR);
						}
					}
				}
			}
			down0().setAll(tmpL);
		}
		protected void filterRcptIvSrcData() {
			// 残数が０、および入荷実績の重複分を除く
			// ※受領インボイスマップと結合しているので、入荷実績ＮＯが重複して取得されることがある
			// ※down0()が入荷実績ＮＯを含んだキーでソート済みであること
			MCList<Srch01_RsltR> downL = MCList.create(Srch01_RsltR.class);
			Srch01_RsltR bfrR = null;
			for (Srch01_RsltR r : down0()) {
				// 検索モード：入荷実績
				if  (MSC_RCPT_IV_SRC_TYP.isARR_ACT(up0().rcpt_iv_src_typ())) {
					// 作成元が「入荷実績」の場合、残数は基準単位で算出するため
					setTrdUnitQty(r);
				}
				
				if (r.trd_unit_qty().isPositive()) {
					if (isNull(bfrR)
						|| isNull(bfrR.arr_act_no())) {
						downL.add(r);
					}
					else if (!isSame(r.arr_act_no(), bfrR.arr_act_no())) {
						// 重複分は含めない（先頭の入荷実績を含める）
						downL.add(r);
					}
				}
				bfrR = r;
			}
			down0().setAll(downL);
		}
		protected void setTrdUnitQty(Srch01_RsltR downR) {
			MCNumber convQty = rvrsBaseUnitConv(
					downR.base_unit_qty(), downR.trd_unit_conv_base_qty(), downR.trd_unit_conv_qty(),
					downR.trd_unit_dec_place(), downR.trd_unit_rnd_typ());
			MCNumber reEntQty = convToBaseUnit(
					convQty, downR.trd_unit_conv_base_qty(), downR.trd_unit_conv_qty(),
					downR.base_unit_dec_place(), downR.base_unit_rnd_typ());
			
			if (!isSame(reEntQty, downR.base_unit_qty())) {
				downR.trd_unit_qty(downR.base_unit_qty());
				downR.trd_unit_cd(downR.base_unit_cd());
				downR.trd_unit_nm(downR.base_unit_nm());
				downR.trd_unit_conv_base_qty(1);
				downR.trd_unit_conv_qty(1);
				downR.trd_unit_dec_place(downR.base_unit_dec_place());
				downR.trd_unit_rnd_typ(downR.base_unit_rnd_typ());
			}
			else {
				downR.trd_unit_qty(convQty);
			}
		}

		
		/**
		 * 下り電文の加工処理
		 * @param r
		 */
		protected void editDown(Srch01_RsltR r) {
			// 基準通貨の設定
			setBaseCur(r);
			
			// 納税通貨の設定
			setPtaxCur(r);
		}
		

		/**
		 * 基準単価の設定を行う
		 * @param r
		 */
		protected void setBaseCur(Srch01_RsltR r) {
			// 通貨情報設定
			r.base_cur_cd(getBaseCur().cur_cd());
			r.base_cur_nm(getBaseCur().cur_nm());
			r.base_amt_dec_place(getBaseCur().amt_dec_place());
			r.base_upri_dec_place(getBaseCur().upri_dec_place());
			
			// 金額設定
			// 基準通貨単価
			r.base_cur_upri(convToBaseCur(r.trd_cur_upri(), r.xrate(), 
					getBaseCur().upri_dec_place(), getCo().xrate_rnd_typ()));
			// 基準通貨値引額
			r.base_cur_dscnt_amt(convToBaseCur(r.trd_cur_dscnt_amt(), r.xrate(), 
					getBaseCur().amt_dec_place(), getCo().xrate_rnd_typ()));
			// 基準通貨金額
			r.base_cur_amt(convToBaseCur(r.trd_cur_amt(), r.xrate(), 
					getBaseCur().amt_dec_place(), getCo().xrate_rnd_typ()));
			// 基準通貨税込額
			r.base_cur_inc_ctax_amt(convToBaseCur(r.trd_cur_inc_tax_amt(), r.xrate(), 
					getBaseCur().amt_dec_place(), getCo().xrate_rnd_typ()));
			// 基準通貨税額
			r.base_cur_tax_amt(convToBaseCur(r.trd_cur_tax_amt(), r.xrate(), 
					getBaseCur().amt_dec_place(), getCo().xrate_rnd_typ()));
		}
		/**
		 * 納税単価の設定を行う
		 * @param r
		 */
		protected void setPtaxCur(Srch01_RsltR r) {
			// 通貨情報設定
			r.ptax_cur_cd(getPtaxCur().cur_cd());
			r.ptax_cur_nm(getPtaxCur().cur_nm());
			r.ptax_amt_dec_place(getPtaxCur().amt_dec_place());
			r.ptax_upri_dec_place(getPtaxCur().upri_dec_place());
			
			// 金額設定
			// 納税通貨単価
			r.ptax_cur_upri(convCur(r.trd_cur_upri(), r.ptax_xrate(), 
					r.ptax_upri_dec_place(), getCo().xrate_rnd_typ()));
			// 納税通貨値引額
			r.ptax_cur_dscnt_amt(convCur(r.trd_cur_dscnt_amt(), r.ptax_xrate(), 
					r.ptax_amt_dec_place(), getCo().xrate_rnd_typ()));
			// 納税通貨金額
			r.ptax_cur_amt(convCur(r.trd_cur_amt(), r.ptax_xrate(), 
					r.ptax_amt_dec_place(), getCo().xrate_rnd_typ()));
			// 納税通貨税込額
			r.ptax_cur_inc_ctax_amt(convCur(r.trd_cur_inc_tax_amt(), r.ptax_xrate(), 
					r.ptax_amt_dec_place(), getCo().xrate_rnd_typ()));
			// 納税通貨税額
			r.ptax_cur_tax_amt(convCur(r.trd_cur_tax_amt(), r.ptax_xrate(), 
					r.ptax_amt_dec_place(), getCo().xrate_rnd_typ()));
		}
		
	}

	/**
	 * 発注時の情報を元に明細の金額計算を行う
	 */
	protected void calcAmt(MCList<Srch01_RsltR> dtlL) {
		if(dtlL.isEmpty()){
			return;
		}
		// 明細行ごとに一意の紐付ＮＯを設定
		setPegNo(dtlL);
		
		// ヘッダ紐付NO
		int hdr_peg_no = 0;
		
		// ユーティリティ実行用の引数電文
		MCList<ConvQtyAmtUtil_Calc01_HdrR> hdrParmLst = MCList.create(ConvQtyAmtUtil_Calc01_HdrR.class);
		MCList<ConvQtyAmtUtil_Calc01_Dtl1R> dtl1ParmLst = MCList.create(ConvQtyAmtUtil_Calc01_Dtl1R.class);
		
		for (Srch01_RsltR dtlR : dtlL) {

			ConvQtyAmtUtil_Calc01_HdrR hdrParmRow = ConvQtyAmtUtil_Calc01_HdrR.create();
			hdrParmRow.peg_no(hdr_peg_no++);
			hdrParmRow.trd_unit_cd(dtlR.po_trd_unit_cd());
			hdrParmRow.trd_unit_qty(dtlR.po_trd_unit_qty());
			hdrParmRow.trd_cur_upri(dtlR.po_trd_cur_upri());
			hdrParmRow.trd_cur_dscnt_amt(dtlR.po_trd_cur_dscnt_amt());
			hdrParmRow.trd_cur_proc_upri(dtlR.po_trd_cur_proc_upri());
			hdrParmRow.trd_cur_onr_prov_upri(dtlR.po_trd_cur_onr_prov_upri());
			hdrParmRow.trd_cur_amt(dtlR.po_trd_cur_amt());
			hdrParmRow.trd_cur_proc_amt(dtlR.po_trd_cur_proc_amt());
			hdrParmRow.trd_cur_onr_prov_amt(dtlR.po_trd_cur_onr_prov_amt());
			hdrParmRow.tax_rate(dtlR.tax_rate());
			hdrParmRow.trd_cur_tax_amt(dtlR.po_trd_cur_tax_amt());
			hdrParmRow.trd_cur_inc_tax_amt(dtlR.po_trd_cur_inc_ctax_amt());
			hdrParmRow.base_unit_dec_place(dtlR.base_unit_dec_place());
			hdrParmRow.base_unit_rnd_typ(dtlR.base_unit_rnd_typ());
			hdrParmRow.trd_unit_conv_qty(dtlR.po_trd_unit_conv_qty());
			hdrParmRow.trd_unit_conv_base_qty(dtlR.po_trd_unit_conv_base_qty());
			hdrParmRow.trd_cur_cd(dtlR.trd_cur_cd());
			hdrParmRow.amt_dec_place(dtlR.trd_amt_dec_place());
			hdrParmRow.upri_dec_place(dtlR.trd_upri_dec_place());
			hdrParmRow.amt_rnd_typ(dtlR.purc_amt_rnd_typ());
			hdrParmRow.tax_rnd_typ(dtlR.purc_tax_rnd_typ());
			hdrParmRow.wtax_rate(dtlR.wtax_rate());
			hdrParmRow.wtax_amt(dtlR.wtax_amt());
			hdrParmRow.inc_tax_flg(dtlR.inc_tax_flg());

			hdrParmLst.add(hdrParmRow);

			ConvQtyAmtUtil_Calc01_Dtl1R dtl1ParmRow = ConvQtyAmtUtil_Calc01_Dtl1R.create();
			dtl1ParmRow.hdr_peg_no(hdrParmRow.peg_no());
			dtl1ParmRow.peg_no(hdrParmRow.peg_no());
			dtl1ParmRow.trd_unit_qty(dtlR.trd_unit_qty());
			dtl1ParmRow.trd_unit_cd(dtlR.trd_unit_cd());
			dtl1ParmRow.trd_unit_conv_base_qty(dtlR.trd_unit_conv_base_qty());
			dtl1ParmRow.trd_unit_conv_qty(dtlR.trd_unit_conv_qty());
			dtl1ParmLst.add(dtl1ParmRow);

		}
		
		// 金額計算実行
		MSUCL_ConvQtyAmtUtil.ConvQtyAmtUtil_Calc02 ope = MSUCL_ConvQtyAmtUtil.crtConvQtyAmtUtil_Calc02();
		ope.up0().addAll(hdrParmLst);
		ope.up1().addAll(dtl1ParmLst);
		
		ope.exec();
		
		// 実行結果を明細行に反映する
		String[] copyColsDest = {Srch01_RsltR.$trd_cur_upri,
				Srch01_RsltR.$trd_cur_dscnt_amt,
				Srch01_RsltR.$trd_cur_amt,
				Srch01_RsltR.$trd_cur_tax_amt,
				Srch01_RsltR.$trd_cur_inc_tax_amt,
				Srch01_RsltR.$trd_unit_conv_qty,
				Srch01_RsltR.$trd_unit_conv_base_qty,
				Srch01_RsltR.$trd_cur_proc_upri,
				Srch01_RsltR.$trd_cur_onr_prov_upri,
				Srch01_RsltR.$trd_cur_proc_amt,
				Srch01_RsltR.$trd_cur_onr_prov_amt,
				Srch01_RsltR.$wtax_amt};
		String[] copyColsSrc = {ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_upri,
				ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_dscnt_amt,
				ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_amt,
				ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_tax_amt,
				ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_inc_tax_amt,
				ConvQtyAmtUtil_Calc01_Dtl1R.$trd_unit_conv_qty,
				ConvQtyAmtUtil_Calc01_Dtl1R.$trd_unit_conv_base_qty,
				ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_proc_upri,
				ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_onr_prov_upri,
				ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_proc_amt,
				ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_onr_prov_amt,
				ConvQtyAmtUtil_Calc01_Dtl1R.$wtax_amt};

		copyByPegNo(dtlL, copyColsDest, ope.down0(), copyColsSrc);

		for (Srch01_RsltR rr : dtlL) {
			calcRepurcObliTax(rr);
			
			// 基準通貨・納税通貨に換算
			// 基準通貨
			rr.setStringNE(Srch01_RsltR.$base_cur_cd, getBaseCur().cur_cd());
			rr.setStringNE(Srch01_RsltR.$base_cur_nm, getBaseCur().cur_nm());
			rr.setNumberNE(Srch01_RsltR.$base_upri_dec_place, getBaseCur().upri_dec_place());
			rr.setNumberNE(Srch01_RsltR.$base_amt_dec_place, getBaseCur().amt_dec_place());
			// 納税通貨
			rr.setStringNE(Srch01_RsltR.$ptax_cur_cd, getPtaxCur().cur_cd());
			rr.setStringNE(Srch01_RsltR.$ptax_cur_nm, getPtaxCur().cur_nm());
			rr.setNumberNE(Srch01_RsltR.$ptax_upri_dec_place, getPtaxCur().upri_dec_place());
			rr.setNumberNE(Srch01_RsltR.$ptax_amt_dec_place, getPtaxCur().amt_dec_place());
			editXrateIfInptFlgOff(rr);
			// 単価・値引額・金額・税額
			rr.base_cur_upri(convToBaseCur(rr.trd_cur_upri(), rr.xrate(), getBaseCur().upri_dec_place(), getCo().xrate_rnd_typ()));
			rr.base_cur_dscnt_amt(convToBaseCur(rr.trd_cur_dscnt_amt(), rr.xrate(), getBaseCur().amt_dec_place(), getCo().xrate_rnd_typ()));
			rr.base_cur_amt(convToBaseCur(rr.trd_cur_amt(), rr.xrate(), getBaseCur().amt_dec_place(), getCo().xrate_rnd_typ()));
			rr.base_cur_tax_amt(convToBaseCur(rr.trd_cur_tax_amt(), rr.xrate(), getBaseCur().amt_dec_place(), getCo().xrate_rnd_typ()));
			if (!isNull(rr.base_cur_amt())) {
				rr.base_cur_inc_ctax_amt(rr.base_cur_amt().add(rr.base_cur_tax_amt()));
			}

			// 加工単価・金額
			rr.base_cur_proc_upri(convToBaseCur(rr.trd_cur_proc_upri(), rr.xrate(), getBaseCur().upri_dec_place(), getCo().xrate_rnd_typ()));
			rr.base_cur_proc_amt(convToBaseCur(rr.trd_cur_proc_amt(), rr.xrate(), getBaseCur().upri_dec_place(), getCo().xrate_rnd_typ()));
			// 有償支給単価・金額
			rr.base_cur_onr_prov_upri(
					convToBaseCur(rr.trd_cur_onr_prov_upri(), rr.xrate(), getBaseCur().upri_dec_place(), getCo().xrate_rnd_typ()));
			rr.base_cur_onr_prov_amt(
					convToBaseCur(rr.trd_cur_onr_prov_amt(), rr.xrate(), getBaseCur().upri_dec_place(), getCo().xrate_rnd_typ()));

			if (!isNull(rr.ptax_cur_cd())) {
				rr.ptax_cur_upri(convCur(rr.trd_cur_upri(), rr.ptax_xrate(), getPtaxCur().upri_dec_place(), getCo().xrate_rnd_typ()));
				rr.ptax_cur_dscnt_amt(convCur(rr.trd_cur_dscnt_amt(), rr.ptax_xrate(), getPtaxCur().amt_dec_place(), getCo().xrate_rnd_typ()));
				rr.ptax_cur_amt(convCur(rr.trd_cur_amt(), rr.ptax_xrate(), getPtaxCur().amt_dec_place(), getCo().xrate_rnd_typ()));
				rr.ptax_cur_tax_amt(convCur(rr.trd_cur_tax_amt(), rr.ptax_xrate(), getPtaxCur().amt_dec_place(), getCo().xrate_rnd_typ()));
				if (!isNull(rr.ptax_cur_amt())) {
					rr.ptax_cur_inc_ctax_amt(rr.ptax_cur_amt().add(rr.ptax_cur_tax_amt()));
				}

				// 加工単価・金額
				rr.ptax_cur_proc_upri(convCur(rr.trd_cur_proc_upri(), rr.ptax_xrate(), getPtaxCur().upri_dec_place(), getCo().xrate_rnd_typ()));
				rr.ptax_cur_proc_amt(convCur(rr.trd_cur_proc_amt(), rr.ptax_xrate(), getPtaxCur().amt_dec_place(), getCo().xrate_rnd_typ()));

				// 有償支給単価・金額
				rr.ptax_cur_onr_prov_upri(
						convCur(rr.trd_cur_onr_prov_upri(), rr.ptax_xrate(), getPtaxCur().upri_dec_place(), getCo().xrate_rnd_typ()));
				rr.ptax_cur_onr_prov_amt(convCur(rr.trd_cur_onr_prov_amt(), rr.ptax_xrate(), getPtaxCur().amt_dec_place(), getCo().xrate_rnd_typ()));
			}
		}

	}
	/**
	 * 買戻義務の場合の税額を計算します
	 * @param r
	 */
	protected void calcRepurcObliTax(Srch01_RsltR r) {
		if(!r.repurc_obli_flg()) {
			return;
		}
		MCNumber amt = getAmt(r.trd_cur_upri(),
				r.trd_unit_qty(),
				r.trd_amt_dec_place(),
				r.purc_tax_rnd_typ(),
				r.trd_cur_dscnt_amt());
		if(r.inc_tax_flg()) {
			// 内税の場合、有償支給単価を税額に含めないために、一旦加工単価×数量で導出し、後続処理で税額を差し引く
			MCNumber proc_inc_tax_amt = getAmt(r.trd_cur_proc_upri(),
					r.trd_unit_qty(),
					r.trd_amt_dec_place(),
					r.purc_tax_rnd_typ(),
					r.trd_cur_dscnt_amt());
			r.trd_cur_proc_amt(proc_inc_tax_amt);
			// 有償支給金額は金額-加工金額
			r.trd_cur_onr_prov_amt(!isNull(amt) ? amt.subtract(proc_inc_tax_amt) : null);
		}
		MCNumber trdCurTaxAmt = getTaxAmt(
				r.trd_cur_proc_amt(),
				r.tax_rate(),
				r.trd_amt_dec_place(),
				r.purc_tax_rnd_typ(),
				r.inc_tax_flg()
				);
		r.trd_cur_tax_amt(trdCurTaxAmt);
		if(r.inc_tax_flg()) {
			amt = (amt != null) ? amt.subtract(trdCurTaxAmt) : null;
			MCNumber proc_amt = !isNull(r.trd_cur_proc_amt()) ? r.trd_cur_proc_amt().subtract(trdCurTaxAmt) : MCNumber.ZERO;
			r.trd_cur_amt(amt);
			r.trd_cur_proc_amt(proc_amt);
		}
		r.trd_cur_inc_tax_amt(r.trd_cur_amt() != null ? r.trd_cur_amt().add(trdCurTaxAmt) : null);
	}
	
	/**
	 * 為替レート指定フラグがfalseのレートをマスタから取得
	 */
	protected void editXrateIfInptFlgOff(Srch01_RsltR r) {

		if (!r.xrate_inpt_flg()) {
			r.xrate(getDefXrateNE(r.trd_cur_cd(), r.base_cur_cd(), 
					getCo().purc_xrate_cd(), getToday()));
		}
		
		if (!r.ptax_xrate_inpt_flg()) {
			r.ptax_xrate(getDefXrateNE(r.trd_cur_cd(), r.ptax_cur_cd(), 
				getCo().purc_xrate_cd(), getToday()));
		}
	}

	//FMCB CUSTOM END
}