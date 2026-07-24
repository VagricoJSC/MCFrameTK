package mcframe.serverMSBB.MSBBL5010;

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
import mcframe.serverFXUC.FXUCL0030.*;
import static mcframe.serverMAUC.MAUCL0140.MAUCL_DateUtil.*;
import static mcframe.serverMAUC.MAUCL0100.MAUCL_AmtUtil.*;
import static mcframe.serverMSBB.MSBBL5010.Query.*;
import mcframe.serverMABS.MABSL5010.*;
import mcframe.commonCore.meta.MCMeta;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverFXUC.FXUCL0030.FXUCL_Cache;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBBL_MlySPlnService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBBL_MlySPlnService_MC extends MSBBL_MlySPlnService_MC_A{
	//FMCB CUSTOM START

	/**
	 * Calc01オペレーション.<p>
	 *
	 */
	public class Calc01 extends MSBBL_MlySPlnService_MC_A.Calc01 {

		/**
		 * 品目マスタ・キャッシュ
		 */
		protected FXUCL_MCDbcCache<MAM_ITM_R> _cacheItm;

		/**
		 * 品目単位マスタ・キャッシュ
		 */
		protected FXUCL_MCDbcCache<MAVM_ITM_UNIT_R> _cacheItmUnit;

		/**
		 * 通貨マスタ・キャッシュ
		 */
		protected FXUCL_MCDbcCache<MAM_CUR_R> _cacheCur;

		/**
		 * 部門マスタ・キャッシュ
		 */
		protected FXUCL_MCDbcCacheStEnd<MAM_DPT_R> _cacheDpt;

		/**
		 * 取引先マスタ・キャッシュ
		 */
		protected FXUCL_MCDbcCache<MAM_BP_R> _cacheBp;

		/**
		 * 販売計画品目構成マスタ・キャッシュ（計画品目条件）
		 */
		protected FXUCL_Cache<MCList<MAM_SPLN_ITM_CONF_R>> _cacheSplnItmConfL;

		/**
		 * 販売計画品目構成マスタ・キャッシュ（品目条件）
		 */
		protected FXUCL_Cache<MCList<MAM_SPLN_ITM_CONF_R>> _cacheItmConfL;

		/**
		 * 数量金額計算結果リスト
		 */
		protected MCList<Calc01_DtlR> _rsltL;

		/**
		 * 品目内訳リスト
		 */
		protected MCList<Calc01_ItmDtlR> _rsltItmL;

		/**
		 * 販売単価リスト
		 */
		protected MCList<SlsUpri_Sprt01_DtlR> _slsUpriL;
		protected MCIndexKey _slsUpriIdx;

		/**
		 * 税率検索結果リスト
		 */
		protected MCList<Calc01_ItmDtlR> _taxL;
		protected MCIndexKey _taxIdx;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			if (isNull(up0())) {
				return ;
			}
			preProc();
			calc();
			setDown();
		}

		protected void preProc() {
			_rsltL = MCList.create(Calc01_DtlR.class);
			_rsltItmL = MCList.create(Calc01_ItmDtlR.class);
			crtCache();
		}

		protected void crtCache() {
			// 計画品目構成マスタ検索
			MCList<MAM_SPLN_ITM_CONF_R> dbcSplnItmConfL = srchSplnItmConf();
			// 販売計画品目構成マスタ・キャッシュ（計画品目条件）
			_cacheSplnItmConfL = crtCacheItmConfL(getSplnItmConfKeys(), dbcSplnItmConfL);
			// 販売計画品目構成マスタ・キャッシュ（品目条件）
			_cacheItmConfL = crtCacheItmConfL(getItmConfKeys(), dbcSplnItmConfL);

			// 品目マスタ・キャッシュ
			MCList<MAM_SPLN_ITM_CONF_R> bindItmL = MCList.create(MAM_SPLN_ITM_CONF_R.class);
			bindItmL.addAll(dbcSplnItmConfL);
			MCList<MAM_ITM_R> dbcItmL = MCList.create(MAM_ITM_R.class);
			MAM_ITM_R t1 = MAM_ITM_R.create("T");
			MCQueryApiBuilder dbcItmL_bldr = MCQueryApiBuilder.create(t1);
			dbcItmL_bldr.setSelect(t1.itm_cd);
			dbcItmL_bldr.addSelect(t1.itm_sub1);
			dbcItmL_bldr.addSelect(t1.itm_sub2);
			dbcItmL_bldr.addSelect(t1.itm_sub3);
			dbcItmL_bldr.addSelect(t1.unit_cd);
			dbcItmL_bldr.addSelect(t1.dec_place);
			dbcItmL_bldr.addSelect(t1.pckg_unit_cd);
			_cacheItm = new FXUCL_MCDbcCache<MAM_ITM_R>(dbcItmL, dbcItmL_bldr, bindItmL,
				new String[] {
					MAM_ITM_R.$itm_cd,
					MAM_ITM_R.$itm_sub1,
					MAM_ITM_R.$itm_sub2,
					MAM_ITM_R.$itm_sub3
				});
			
			// 販売計画品目構成マスタ：デフォルト値編集
			setLotQtyDefVal(dbcSplnItmConfL);
			setUpriUnitDefVal(dbcSplnItmConfL);
			setCalcRateDefVal(dbcSplnItmConfL);

			// 品目単位マスタ・キャッシュ
			MCList<MAVM_ITM_UNIT_R> bindItemUnitL = MCList.create(MAVM_ITM_UNIT_R.class);
			addAll(bindItemUnitL, dbcSplnItmConfL.subList(r-> !isNull(r.upri_unit_cd())), createMap_MAVM_ITM_UNIT_R_MAM_SPLN_ITM_CONF_R());
			addAll(bindItemUnitL, dbcItmL.subList(r-> !isNull(r.pckg_unit_cd())), createMap_MAVM_ITM_UNIT_R_MAM_ITM_R());
			MAVM_ITM_UNIT_R t2 = MAVM_ITM_UNIT_R.create("T");
			MCQueryApiBuilder dbcItemUnitL_bldr = MCQueryApiBuilder.create(t2);
			dbcItemUnitL_bldr.setSelect(t2.itm_cd);
			dbcItemUnitL_bldr.addSelect(t2.itm_sub1);
			dbcItemUnitL_bldr.addSelect(t2.itm_sub2);
			dbcItemUnitL_bldr.addSelect(t2.itm_sub3);
			dbcItemUnitL_bldr.addSelect(t2.unit_cd);
			dbcItemUnitL_bldr.addSelect(t2.conv_base_qty);
			dbcItemUnitL_bldr.addSelect(t2.conv_qty);
			dbcItemUnitL_bldr.addSelect(t2.dec_place);
			_cacheItmUnit = new FXUCL_MCDbcCache<MAVM_ITM_UNIT_R>(dbcItemUnitL_bldr, bindItemUnitL,
					new String[] {
						MAVM_ITM_UNIT_R.$itm_cd,
						MAVM_ITM_UNIT_R.$itm_sub1,
						MAVM_ITM_UNIT_R.$itm_sub2,
						MAVM_ITM_UNIT_R.$itm_sub3,
						MAVM_ITM_UNIT_R.$unit_cd
					});

			// 通貨マスタ・キャッシュ
			MAM_CUR_R t3 = MAM_CUR_R.create("T");
			MCQueryApiBuilder dbcCurL_bldr = MCQueryApiBuilder.create(t3);
			dbcCurL_bldr.setSelect(t3.cur_cd);
			dbcCurL_bldr.addSelect(t3.amt_dec_place);
			dbcCurL_bldr.addSelect(t3.upri_dec_place);
			_cacheCur = new FXUCL_MCDbcCache<MAM_CUR_R>(dbcCurL_bldr, up0(),
					new String[] {
						Calc01_DtlR.$cur_cd
					});

			// 部門マスタ・キャッシュ
			MAM_DPT_R t4 = MAM_DPT_R.create("T");
			MCQueryApiBuilder dbcDptL_bldr = MCQueryApiBuilder.create(t4);
			dbcDptL_bldr.setSelect(t4.dpt_cd);
			dbcDptL_bldr.addSelect(t4.wg_cd);
			dbcDptL_bldr.addSelect(t4.sls_dpt_flg);
			_cacheDpt = new FXUCL_MCDbcCacheStEnd<MAM_DPT_R>(dbcDptL_bldr, up0(),
					new String[] {
						Calc01_DtlR.$dpt_cd
					});

			// 取引先マスタ
			MAM_BP_R t5 = MAM_BP_R.create("T");
			MCQueryApiBuilder dbcBpL_bldr = MCQueryApiBuilder.create(t5);
			dbcBpL_bldr.setSelect(t5.bp_cd);
			dbcBpL_bldr.addSelect(t5.sls_amt_rnd_typ);
			dbcBpL_bldr.addSelect(t5.sls_tax_rnd_typ);
			dbcBpL_bldr.addSelect(t5.sls_upri_rnd_typ);
			_cacheBp = new FXUCL_MCDbcCache<MAM_BP_R>(dbcBpL_bldr, up0(),
					new String[] {
						Calc01_DtlR.$cst_cd
					});

			// 販売単価
			_slsUpriL = srchSlsUpri();
			String[] slsUpriKeys = new String[]{
					SlsUpri_Sprt01_DtlR.$itm_cd,
					SlsUpri_Sprt01_DtlR.$itm_sub1,
					SlsUpri_Sprt01_DtlR.$itm_sub2,
					SlsUpri_Sprt01_DtlR.$itm_sub3,
					SlsUpri_Sprt01_DtlR.$cst_cd,
					SlsUpri_Sprt01_DtlR.$cur_cd,
					SlsUpri_Sprt01_DtlR.$unit_cd,
					SlsUpri_Sprt01_DtlR.$wg_cd,
					SlsUpri_Sprt01_DtlR.$dt};
			_slsUpriIdx = _slsUpriL.createIndex(slsUpriKeys);

			// 税マスタ検索
			_taxL = srchTax();
			String[] taxKeys = new String[] {
					Calc01_ItmDtlR.$itm_cd,
					Calc01_ItmDtlR.$itm_sub1,
					Calc01_ItmDtlR.$itm_sub2,
					Calc01_ItmDtlR.$itm_sub3,
					Calc01_ItmDtlR.$cst_cd,
					Calc01_ItmDtlR.$spln_ym};
			_taxIdx = _taxL.createIndex(taxKeys);
		}

		/**
		 * 数量金額計算メイン
		 */
		protected void calc() {
			_rsltL.setAll(up0());
			for (Calc01_DtlR r : _rsltL) {
				if (!isNullOrNullVal(r.itm_cd())) {
					if (!isNull(r.spln_qty())) {
						calcAmtByItm(r);
					}
					else if (!isNull(r.spln_amt())) {
						calcQtyByItm(r);
					}
				}
				else if (!isNullOrNullVal(r.spln_itm_cd())) {
					if (!isNull(r.spln_qty())) {
						calcAmtBySplnItm(r, _rsltItmL);
					}
					else if (!isNull(r.spln_amt())) {
						calcQtyBySplnItm(r, _rsltItmL);
					}
				}
			}
		}

		/**
		 * 下り電文を設定する。
		 */
		protected void setDown() {
			down0().addAll(_rsltL);
			down1().addAll(_rsltItmL);
		}

		/**
		 * 品目の計画金額を算出する。
		 */
		protected void calcAmtByItm(Calc01_DtlR dtlR) {
			MAM_SPLN_ITM_CONF_R confR = getItmConf(dtlR);
			dtlR.spln_amt(calcAmt(confR, dtlR));
		}

		/**
		 * 品目の計画数量を算出する。
		 */
		protected void calcQtyByItm(Calc01_DtlR dtlR) {
			MAM_SPLN_ITM_CONF_R confR = getItmConf(dtlR);
			dtlR.spln_qty(calcQty(confR, dtlR));
		}

		protected Calc01_ItmDtlR crtItmDtlRow(Calc01_DtlR dtlR, MAM_SPLN_ITM_CONF_R confR) {
			Calc01_ItmDtlR itmDtlR = Calc01_ItmDtlR.create();
			itmDtlR.peg_no(dtlR.peg_no());
			itmDtlR.spln_itm_cd(dtlR.spln_itm_cd());
			itmDtlR.itm_cd(confR.itm_cd());
			itmDtlR.itm_sub1(confR.itm_sub1());
			itmDtlR.itm_sub2(confR.itm_sub2());
			itmDtlR.itm_sub3(confR.itm_sub3());
			itmDtlR.cst_cd(dtlR.cst_cd());
			itmDtlR.dpt_cd(dtlR.dpt_cd());
			itmDtlR.cur_cd(dtlR.cur_cd());
			itmDtlR.spln_ym(dtlR.spln_ym());
			return itmDtlR;
		}

		/**
		 * 計画品目の計画金額を算出する。
		 */
		protected void calcAmtBySplnItm(Calc01_DtlR dtlR, MCList<Calc01_ItmDtlR> itmDtlL) {
			MCList<MAM_SPLN_ITM_CONF_R> confL = getSplnItmConf(dtlR);
			MCList<Calc01_ItmDtlR> itmTmpL = MCList.create(Calc01_ItmDtlR.class);

			MCNumber sumRate = confL.sum(MAM_SPLN_ITM_CONF_R.$calc_rate);
			MCNumber remQty = nvl(dtlR.spln_qty(), MCNumber.ZERO);
			for (int i = 0; i < confL.size(); i++) {
				MAM_SPLN_ITM_CONF_R confR = confL.get(i);
				MCNumber allocQty = MCNumber.ZERO;
				if (MCNumber.ZERO.lt(remQty)) {
					if (MCNumber.ZERO.eq(sumRate) || i == confL.size() - 1) {
						allocQty = remQty;
						remQty = MCNumber.ZERO;
					}
					else if (!MCNumber.ZERO.eq(confR.calc_rate())){
						allocQty = remQty.multiply(confR.calc_rate()).divide(sumRate, 0, MAC_RND_TYP.RNDUP.toMC());
						MAM_ITM_R itmR = getItm(confR);
						MCNumber tmpQty = convToPckgQty(itmR, allocQty);
						allocQty = remQty.gt(tmpQty) ? tmpQty : remQty;
						remQty = remQty.subtract(allocQty);
						sumRate = sumRate.subtract(confR.calc_rate());
					}
				}
				// 品目内訳
				Calc01_ItmDtlR itmTmpR = crtItmDtlRow(dtlR, confR);
				itmTmpR.spln_qty(allocQty);
				itmTmpR.spln_amt(calcAmt(confR, dtlR, allocQty));
				itmTmpL.add(itmTmpR);
			}
			dtlR.spln_amt(itmTmpL.sum(Calc01_ItmDtlR.$spln_amt));
			itmDtlL.addAll(itmTmpL);
		}

		/**
		 * 計画品目の計画数量を算出する。
		 */
		protected void calcQtyBySplnItm(Calc01_DtlR dtlR, MCList<Calc01_ItmDtlR> itmDtlL) {
			MCList<MAM_SPLN_ITM_CONF_R> confL = getSplnItmConf(dtlR);
			MCList<Calc01_ItmDtlR> itmTmpL = MCList.create(Calc01_ItmDtlR.class);

			MCNumber sumRate = confL.sum(MAM_SPLN_ITM_CONF_R.$calc_rate);
			MCNumber remAmt = nvl(dtlR.spln_amt(), MCNumber.ZERO);
			MAM_CUR_R curR = getCur(dtlR.cur_cd());
			for (int i = 0; i < confL.size(); i++) {
				MAM_SPLN_ITM_CONF_R confR = confL.get(i);
				MCNumber allocAmt = MCNumber.ZERO;
				if (MCNumber.ZERO.lt(remAmt)) {
					if (MCNumber.ZERO.eq(sumRate) || i == confL.size() - 1) {
						allocAmt = remAmt;
						remAmt = MCNumber.ZERO;
					}
					else if (!MCNumber.ZERO.eq(confR.calc_rate())){
						allocAmt = remAmt.multiply(confR.calc_rate()).divide(sumRate, curR.amt_dec_place().intValue(), MAC_RND_TYP.RNDUP.toMC());
						MCNumber allocQty = calcQty(confR, dtlR, allocAmt);
						MCNumber tmpAmt = calcAmt(confR, dtlR, allocQty);
						allocAmt = remAmt.gt(tmpAmt) ? tmpAmt : remAmt;
						remAmt = remAmt.subtract(allocAmt);
						sumRate = sumRate.subtract(confR.calc_rate());
					}
				}
				
				// 品目内訳
				Calc01_ItmDtlR itmTmpR = crtItmDtlRow(dtlR, confR);
				itmTmpR.spln_qty(calcQty(confR, dtlR, allocAmt));
				itmTmpR.spln_amt(allocAmt);
				itmTmpL.add(itmTmpR);
			}
			dtlR.spln_qty(itmTmpL.sum(Calc01_ItmDtlR.$spln_qty));
			itmDtlL.addAll(itmTmpL);
		}

		/**
		 * 数量から金額を算出する
		 */
		protected MCNumber calcAmt(MAM_SPLN_ITM_CONF_R confR, Calc01_DtlR dtlR, MCNumber splnQty) {
			if (isNull(splnQty)) {
				return null;
			}
			if (confR == null || splnQty.isZero()) {
				return MCNumber.ZERO;
			}
			
			MAM_ITM_R itmR = getItm(confR);
			MCNumber qty = splnQty;
			String upriUnitCd = confR.upri_unit_cd();
			MCNumber upri = getSlsUpri(confR, dtlR);
			MAM_BP_R cst = getCst(dtlR.cst_cd());
			MAM_CUR_R cur = getCur(dtlR.cur_cd());

			if (!isSame(upriUnitCd, itmR.unit_cd())) {
				MAVM_ITM_UNIT_R itmUnitR = getItmUnit(confR.itm_cd(), confR.itm_sub1(), confR.itm_sub2(), confR.itm_sub3(), upriUnitCd);

				if (!isNull(upri) && !upri.isZero()) {
					upri = upri.multiply(itmUnitR.conv_base_qty()).divide(
							itmUnitR.conv_qty(), cur.upri_dec_place().intValue(), MAC_RND_TYP.toMC(cst.sls_upri_rnd_typ()));
				}
			}

			if (isNull(upri) || upri.isZero()) {
				MCMessagePool.add(new MCMessage(MSBBL0177,
						toDispItm(confR.itm_cd(), confR.itm_sub1(), confR.itm_sub2(), confR.itm_sub3()),
						dtlR.cst_cd(),
						dtlR.cur_cd(),
						upriUnitCd,
						toYMString(dtlR.spln_ym()),
						toDispGUIIndex(dtlR)));
				return MCNumber.ZERO;
			}

			Comparable[] vals = new Comparable[] {
					confR.itm_cd(),
					confR.itm_sub1(),
					confR.itm_sub2(),
					confR.itm_sub3(),
					dtlR.cst_cd(),
					dtlR.spln_ym()};
			Calc01_ItmDtlR tax = getTax(vals);

			if (isNull(tax)) {
				MCMessagePool.add(new MCMessage(
						dtlR, Calc01_DtlR.$spln_qty, MSBBL0645,
						toYMDString(dtlR.spln_ym()),
						dtlR.cst_cd(),
						confR.spln_itm_cd(),
						toDispItm(confR.itm_cd(), confR.itm_sub1(), confR.itm_sub2(), confR.itm_sub3())));
				return MCNumber.ZERO;
			}

			MCRow calcR = getAmtAndTax(upri,
					qty,
					tax.tax_rate(),
					tax.inc_tax_flg(),
					cur.amt_dec_place(),
					cst.sls_amt_rnd_typ(),
					cst.sls_tax_rnd_typ());

			return calcR.getNumber("amt");
		}

		/**
		 * 数量から金額を算出する
		 */
		protected MCNumber calcAmt(MAM_SPLN_ITM_CONF_R confR, Calc01_DtlR dtlR) {
			return calcAmt(confR, dtlR, dtlR.spln_qty());
		}

		/**
		 * 金額、単価から数量を算出する。
		 */
		protected MCNumber calcQty(MAM_SPLN_ITM_CONF_R confR, Calc01_DtlR dtlR, MCNumber splnAmt) {
			if (isNull(splnAmt)) {
				return null;
			}
			if (confR == null || splnAmt.isZero()) {
				return MCNumber.ZERO;
			}
			
			MCNumber upri = getSlsUpri(confR, dtlR);
			if (isNull(upri) || upri.isZero()) {
				MCMessagePool.add(new MCMessage(MSBBL0177,
						toDispItm(confR.itm_cd(), confR.itm_sub1(), confR.itm_sub2(), confR.itm_sub3()),
						dtlR.cst_cd(),
						dtlR.cur_cd(),
						confR.upri_unit_cd(),
						toYMString(dtlR.spln_ym()),
						toDispGUIIndex(dtlR)));
				return MCNumber.ZERO;
			}

			Comparable[] vals = new Comparable[] {
					confR.itm_cd(),
					confR.itm_sub1(),
					confR.itm_sub2(),
					confR.itm_sub3(),
					dtlR.cst_cd(),
					dtlR.spln_ym()};
			Calc01_ItmDtlR tax = getTax(vals);

			if (isNull(tax)) {
				MCMessagePool.add(new MCMessage(
						dtlR, Calc01_DtlR.$spln_amt, MSBBL0645,
						toYMDString(dtlR.spln_ym()),
						dtlR.cst_cd(),
						confR.spln_itm_cd(),
						toDispItm(confR.itm_cd(), confR.itm_sub1(), confR.itm_sub2(), confR.itm_sub3())));
				return MCNumber.ZERO;
			}

			// 1単価単位ずつ増加し、計画金額以上となる単価単位数量を算出する
			MCNumber amt = MCNumber.ZERO;
			MAM_BP_R cst = getCst(dtlR.cst_cd());
			MAM_CUR_R cur = getCur(dtlR.cur_cd());
			MAVM_ITM_UNIT_R upriUnitR = getItmUnit(
					confR.itm_cd(),
					confR.itm_sub1(),
					confR.itm_sub2(),
					confR.itm_sub3(),
					confR.upri_unit_cd());
			int decPlace = isNull(upriUnitR.dec_place()) ? 0 : upriUnitR.dec_place().intValue();
			MCNumber addQty = MCNumber.valueOf(Math.pow(0.1, decPlace)).setScale(decPlace, java.math.RoundingMode.DOWN);
			MCNumber upriQty = splnAmt.divide(upri, decPlace, MAC_RND_TYP.CUTOFF.toMC()); // 初期値
			MCNumber beforeAmt = MCNumber.ZERO;
			while (true) {
				MCRow calcR = getAmtAndTax(
						upri,
						upriQty,
						tax.tax_rate(),
						tax.inc_tax_flg(),
						cur.amt_dec_place(),
						cst.sls_amt_rnd_typ(),
						cst.sls_tax_rnd_typ());
				amt = calcR.getNumber("amt");
				if (splnAmt.lte(amt)) {
					break;
				}
				upriQty = upriQty.add(addQty);
				beforeAmt = amt;
			}
			
			MAM_ITM_R itmR = getItm(confR);
			MCNumber fractionQty = MCNumber.ZERO;
			// 計画金額を超えた場合
			if (splnAmt.lt(amt)
					&& !isSame(confR.upri_unit_cd(), itmR.unit_cd())
					&& upriUnitR.conv_base_qty().lt(upriUnitR.conv_qty())) {
				upriQty = upriQty.subtract(addQty);
				// 端数金額
				MCNumber fractionAmt = splnAmt.subtract(beforeAmt);
				// 基準単位の単価
				MCNumber baseUnitUpri = upri.multiply(upriUnitR.conv_base_qty()).divide(
						upriUnitR.conv_qty(), cur.upri_dec_place().intValue(), MAC_RND_TYP.toMC(cst.sls_upri_rnd_typ()));

				MCNumber baseAddQty = MCNumber.ONE;

				fractionQty = fractionAmt.divide(baseUnitUpri, 0, MAC_RND_TYP.CUTOFF.toMC()); // 初期値
				MCNumber baseUnitAmt = MCNumber.ZERO;
				while (true) {
					MCRow calcR = getAmtAndTax(
							baseUnitUpri,
							fractionQty,
							tax.tax_rate(),
							tax.inc_tax_flg(),
							cur.amt_dec_place(),
							cst.sls_amt_rnd_typ(),
							cst.sls_tax_rnd_typ());
					baseUnitAmt = calcR.getNumber("amt");
					if (fractionAmt.lte(baseUnitAmt)) {
						break;
					}
					fractionQty = fractionQty.add(baseAddQty);
				}
			}
			MCNumber baseQty = MCNumber.ZERO;
			if (isSame(confR.upri_unit_cd(), itmR.unit_cd())) {
				baseQty = upriQty.setScale(0, MAC_RND_TYP.RNDUP.toMC());
			}
			else {
				baseQty = convToBaseUnit(
						upriQty,
						upriUnitR.conv_base_qty(),
						upriUnitR.conv_qty(),
						MCNumber.ZERO,
						MAC_RND_TYP.RNDUP.value());
			}
			baseQty = baseQty.add(fractionQty);
			return convToPckgQty(itmR, baseQty);
		}

		/**
		 * 金額、単価から数量を算出する。
		 */
		protected MCNumber calcQty(MAM_SPLN_ITM_CONF_R confR, Calc01_DtlR dtlR) {
			return calcQty(confR, dtlR, dtlR.spln_amt());
		}

		/**
		 * 梱包単位数量へ変換
		 */
		protected MCNumber convToPckgQty(MAM_ITM_R itmR, MCNumber baseUnitQty) {
			if (itmR == null || isNull(itmR.pckg_unit_cd()) || isSame(itmR.unit_cd(), itmR.pckg_unit_cd())) {
				return baseUnitQty;
			}
			if (MCNumber.ZERO.eq(baseUnitQty)) {
				return MCNumber.ZERO;
			}
			MAVM_ITM_UNIT_R itmUnitR = getItmUnit(itmR.itm_cd(),
					itmR.itm_sub1(), itmR.itm_sub2(), itmR.itm_sub3(), itmR.pckg_unit_cd());
			if (isNull(itmUnitR.itm_cd())) {
				return baseUnitQty;
			}
			MCNumber pckgQty = rvrsBaseUnitConv(baseUnitQty,
					itmUnitR.conv_base_qty(),
					itmUnitR.conv_qty(),
					MCNumber.ZERO,
					MAC_RND_TYP.RNDUP.value());
			return convToBaseUnit(pckgQty,
					itmUnitR.conv_base_qty(),
					itmUnitR.conv_qty(),
					MCNumber.ZERO,
					MAC_RND_TYP.RNDUP.value());
		}

		/**
		 * 販売単価取得
		 */
		protected MCNumber getSlsUpri(MAM_SPLN_ITM_CONF_R confR, Calc01_DtlR dtlR) {
			Comparable[] vals = new Comparable[] {
					confR.itm_cd(),
					confR.itm_sub1(),
					confR.itm_sub2(),
					confR.itm_sub3(),
					dtlR.cst_cd(),
					dtlR.cur_cd(),
					confR.upri_unit_cd(),
					getWgCd(dtlR.spln_ym(), dtlR.dpt_cd()),
					getYmStDt(dtlR.spln_ym())};
			SlsUpri_Sprt01_DtlR slsUpriR = _slsUpriL.getFirst(_slsUpriIdx, vals);
			if (slsUpriR != null) {
				return slsUpriR.sls_upri();
			}
			return null;
		}

		/**
		 * 販売計画品目構成マスタ検索
		 */
		protected MCList<MAM_SPLN_ITM_CONF_R> srchSplnItmConf(){
			MCList<MAM_SPLN_ITM_CONF_R> retL = MCList.create(MAM_SPLN_ITM_CONF_R.class);
			String[] groupKeys = new String[] {
					Calc01_DtlR.$dpt_cd,
					Calc01_DtlR.$spln_itm_cd,
					Calc01_DtlR.$itm_cd,
					Calc01_DtlR.$itm_sub1,
					Calc01_DtlR.$itm_sub2,
					Calc01_DtlR.$itm_sub3};
			for (Calc01_DtlR upR : up0().groupBy(groupKeys)) {
				MAM_SPLN_ITM_CONF_R tmpR = MAM_SPLN_ITM_CONF_R.create();
				tmpR.dpt_cd(upR.dpt_cd());
				tmpR.spln_itm_cd(upR.spln_itm_cd());
				tmpR.itm_cd(upR.itm_cd());
				tmpR.itm_sub1(upR.itm_sub1());
				tmpR.itm_sub2(upR.itm_sub2());
				tmpR.itm_sub3(upR.itm_sub3());
				retL.add(tmpR);
			}
			MCQueryApiBuilder retL_bldr = MCQueryApiBuilder.create(MAM_SPLN_ITM_CONF_R.create("T"));
			dbWkDelete("MSBBL5010_MAW_SPLN_ITM_CONF_D01", retL_bldr.getBaseDbc());
			dbWkInsert("MSBBL5010_MAW_SPLN_ITM_CONF_I01", retL, retL_bldr.getBaseDbc());
			executeQuery(retL, MSBBL5010_MAM_SPLN_ITM_CONF_S01());
			dbWkDelete("MSBBL5010_MAW_SPLN_ITM_CONF_D02", retL_bldr.getBaseDbc());
			return retL;
		}

		/**
		 * 単価ロット数量のデフォルト値設定
		 */
		protected void setLotQtyDefVal(MCList<MAM_SPLN_ITM_CONF_R> retL) {
			// 販売単価取得サービスの電文メタ取得
			MCMeta qtyMeta = MAW_SLS_UPRI_SRV_R.qty_META;
			int iLength = qtyMeta.length();
			int iScale = qtyMeta.scale();

			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < iLength; i++) {
				if (iLength - i == iScale) {
					sb.append(".");
				}
				sb.append("9");
			}
			MCNumber defLotQty = MCNumber.valueOf(sb.toString());
			for (MAM_SPLN_ITM_CONF_R r : retL) {
				if (isNull(r.lot_qty())) {
					r.lot_qty(defLotQty);
				}
			}
		}

		/**
		 * 単価単位のデフォルト値設定
		 */
		protected void setUpriUnitDefVal(MCList<MAM_SPLN_ITM_CONF_R> retL) {
			for (MAM_SPLN_ITM_CONF_R r : retL) {
				if (isNull(r.upri_unit_cd())) {
					MAM_ITM_R itmR = getItm(r);
					if (!isNull(itmR)) {
						r.upri_unit_cd(itmR.unit_cd());
					}
				}
			}
		}
		
		/**
		 * 計算比率のデフォルト値設定
		 */
		protected void setCalcRateDefVal(MCList<MAM_SPLN_ITM_CONF_R> retL) {
			for (MAM_SPLN_ITM_CONF_R r: retL) {
				if (isNull(r.calc_rate())) {
					r.calc_rate(MCNumber.ZERO);
				}
			}
		}

		/**
		 * 税マスタ検索
		 */
		protected MCList<Calc01_ItmDtlR> srchTax() {
			MCList<Calc01_ItmDtlR> rsltL = MCList.create(Calc01_ItmDtlR.class);
			// ワークデータ作成
			MCList<MSW_SPLN_FMT_R> wkL = MCList.create(MSW_SPLN_FMT_R.class);
			MCList<MAM_SPLN_ITM_CONF_R> itmL = MCList.create(MAM_SPLN_ITM_CONF_R.class);
			for (Calc01_DtlR upR : up0()) {
				itmL.clear();
				if (!isNullOrNullVal(upR.itm_cd())){
					itmL.add(getItmConf(upR));
				}
				else if (!isNullOrNullVal(upR.spln_itm_cd())) {
					itmL.addAll(getSplnItmConf(upR));
				}
				
				for (MAM_SPLN_ITM_CONF_R itmR : itmL) {
					MSW_SPLN_FMT_R tmpR = MSW_SPLN_FMT_R.create();
					tmpR.itm_cd(itmR.itm_cd());
					tmpR.itm_sub1(itmR.itm_sub1());
					tmpR.itm_sub2(itmR.itm_sub2());
					tmpR.itm_sub3(itmR.itm_sub3());
					tmpR.cst_cd(upR.cst_cd());
					tmpR.st_ym(upR.spln_ym());
					wkL.add(tmpR);
				}
			}
			if (isNull(wkL)) {
				return rsltL;
			}
			execDbWkDelete("MSBBL5010_MSW_SPLN_FMT_D01", MSW_SPLN_FMT_R.create());

			MCList<MSW_SPLN_FMT_R> wkInsL = MCList.create(MSW_SPLN_FMT_R.class);
			wkInsL.addAll(wkL.groupBy(
					MSW_SPLN_FMT_R.$itm_cd,
					MSW_SPLN_FMT_R.$itm_sub1,
					MSW_SPLN_FMT_R.$itm_sub2,
					MSW_SPLN_FMT_R.$itm_sub3,
					MSW_SPLN_FMT_R.$cst_cd,
					MSW_SPLN_FMT_R.$st_ym));
			for (MSW_SPLN_FMT_R wkInsR : wkInsL) {
				wkInsR.dpt_cd(MAC_STR.NULL_VAL.value());
				wkInsR.wrk_no(MAC_STR.NULL_VAL.value());
				wkInsR.spln_itm_cd(MAC_STR.NULL_VAL.value());
				wkInsR.cur_cd(MAC_STR.NULL_VAL.value());
			}
			dbInsertEx("MSBBL5010_MSW_SPLN_FMT_I01", wkInsL,
					MCQueryApiBuilder.create(MSW_SPLN_FMT_R.create("T")));

			// 税率マスタ検索
			MCRow cnd = MCRow.create();
			cnd.addNumberColumn("ac_cl_day", getCo().ac_cl_day());
			cnd.addNumberColumn("ac_cl_mon_base", getCo().ac_cl_mon_base());
			executeQuery(rsltL, MSBBL5010_MAM_TAX_S01(), cnd);

			execDbWkDelete("MSBBL5010_MSW_SPLN_FMT_D02", MSW_SPLN_FMT_R.create());
			
			return rsltL;
		}

		/**
		 * 税マスタの設定取得
		 */
		protected Calc01_ItmDtlR getTax(Comparable[] vals) {
			return _taxL.getFirst(_taxIdx, vals);
		}

		protected MAM_BP_R _nullvalBP = MAM_BP_R.create();
		
		/**
		 * 得意先情報（金額端数処理区分、消費税端数処理区分）取得
		 */
		protected MAM_BP_R getCst(String cstCd) {
			MAM_BP_R cstR = null;
			if (!MAC_STR.isNULL_VAL(cstCd)) {
				cstR = _cacheBp.getCache(cstCd);
			}
			if (cstR == null) {
				cstR = _nullvalBP;
			}
			if (isNull(cstR.sls_amt_rnd_typ())) {
				cstR.sls_amt_rnd_typ(MAC_RND_TYP.RNDUP.value());
			}
			if (isNull(cstR.sls_tax_rnd_typ())) {
				cstR.sls_tax_rnd_typ(MAC_RND_TYP.RNDUP.value());
			}
			if (isNull(cstR.sls_upri_rnd_typ())) {
				cstR.sls_upri_rnd_typ(MAC_RND_TYP.RNDUP.value());
			}
			return cstR;
		}

		/**
		 * 販売単価取得サービス呼出し、販売単価を取得する。
		 */
		protected MCList<SlsUpri_Sprt01_DtlR> srchSlsUpri() {
			MCList<SlsUpri_Sprt01_DtlR> upL = MCList.create(SlsUpri_Sprt01_DtlR.class);
			MCList<MAM_SPLN_ITM_CONF_R> itmConfL = MCList.create(MAM_SPLN_ITM_CONF_R.class);
			for (Calc01_DtlR upR : up0()) {
				itmConfL.clear();
				if (!isNullOrNullVal(upR.itm_cd())) {
					itmConfL.add(getItmConf(upR));
				}
				else if (!isNullOrNullVal(upR.spln_itm_cd())) {
					itmConfL.addAll(getSplnItmConf(upR));
				}
				for (MAM_SPLN_ITM_CONF_R itmConfR : itmConfL) {
					SlsUpri_Sprt01_DtlR tmpR = SlsUpri_Sprt01_DtlR.create();
					tmpR.itm_cd(itmConfR.itm_cd());
					tmpR.itm_sub1(itmConfR.itm_sub1());
					tmpR.itm_sub2(itmConfR.itm_sub2());
					tmpR.itm_sub3(itmConfR.itm_sub3());
					tmpR.qty(itmConfR.lot_qty());
					tmpR.unit_cd(itmConfR.upri_unit_cd());
					tmpR.wg_cd(getWgCd(upR.spln_ym(), upR.dpt_cd()));
					tmpR.sls_upri_flg(true);
					tmpR.cst_cd(upR.cst_cd());
					tmpR.cur_cd(upR.cur_cd());
					tmpR.dt(getYmStDt(upR.spln_ym()));
					upL.add(tmpR);
				}
			}
			if (isNull(upL)) {
				return upL;
			}

			// 販売単価取得サービスを呼び出す
			setPegNo(upL);
			for (SlsUpri_Sprt01_DtlR r: upL) {
				r.grp_no(r.peg_no().toString());
			}
			MABSL_SlsUpriService.SlsUpri_Sprt01 svc = MABSL_SlsUpriService.crtSlsUpri_Sprt01();
			svc.up0().setAll(upL);
			svc.exec();
			String[] cols = new String[] {SlsUpri_Sprt01_DtlR.$sls_upri};
			copyByPegNo(upL, cols, svc.down0(), cols);
			return upL;
		}

		/**
		 * 販売計画品目構成情報取得（計画品目条件）
		 */
		protected MCList<MAM_SPLN_ITM_CONF_R> getSplnItmConf(Calc01_DtlR splnItmR) {
			return getCacheItmConf(splnItmR, getSplnItmConfKeys(), _cacheSplnItmConfL);
		}

		/**
		 * 販売計画品目構成情報取得（品目条件）
		 */
		protected MAM_SPLN_ITM_CONF_R getItmConf(Calc01_DtlR splnItmR) {
			MCList<MAM_SPLN_ITM_CONF_R> rslt = getCacheItmConf(splnItmR, getItmConfKeys(), _cacheItmConfL);
			if (rslt.isEmpty()) {
				return null;
			}
			return rslt.get(0);
		}

		protected FXUCL_Cache<MCList<MAM_SPLN_ITM_CONF_R>> crtCacheItmConfL(String[] keyCols, MCList<MAM_SPLN_ITM_CONF_R> dbcL){
			FXUCL_Cache<MCList<MAM_SPLN_ITM_CONF_R>> cache = new FXUCL_Cache<MCList<MAM_SPLN_ITM_CONF_R>>();
			cache.setFixMaxCacheSize(-1);
			for(MCList<MAM_SPLN_ITM_CONF_R> grpL : dbcL.groupList(keyCols)) {
				cache.putCache(getVals(keyCols, grpL.get(0)), grpL);
			}
			return cache;
		}

		protected MCList<MAM_SPLN_ITM_CONF_R> getCacheItmConf(
				Calc01_DtlR cndR, String[] keys,
				FXUCL_Cache<MCList<MAM_SPLN_ITM_CONF_R>> cache) {

			Comparable[] vals = getVals(keys, cndR);
			MCList<MAM_SPLN_ITM_CONF_R> rslt = cache.getCache(vals);
			MCList<MAM_SPLN_ITM_CONF_R> retL = MCList.create(MAM_SPLN_ITM_CONF_R.class);
			if (!isNull(rslt)) {
				MCList<MAM_SPLN_ITM_CONF_R> tmpL = MCList.create(MAM_SPLN_ITM_CONF_R.class);
				for(MAM_SPLN_ITM_CONF_R r : rslt){
					// 品目マスタが無効な場合、構成マスタも無効と見做す
					MAM_ITM_R itmR = getItm(r);
					if (isNull(itmR)) {
						continue;
					}
					// 適用期間に該当する構成マスタのみ有効と見做す
					if (r.st_ym().lte(cndR.spln_ym()) && r.end_ym().gte(cndR.spln_ym())) {
						if (isSame(r.dpt_cd(), cndR.dpt_cd())) {
							retL.add(r);
						}
						if (MAC_STR.isNULL_VAL(r.dpt_cd())) {
							tmpL.add(r);
						}
					}
				}
				if (isNull(retL)) {
					retL.setAll(tmpL);
				}
				retL.sort(MAM_SPLN_ITM_CONF_R.$calc_seq, MAM_SPLN_ITM_CONF_R.$itm_cd,
						MAM_SPLN_ITM_CONF_R.$itm_sub1, MAM_SPLN_ITM_CONF_R.$itm_sub2,
						MAM_SPLN_ITM_CONF_R.$itm_sub3, MAM_SPLN_ITM_CONF_R.$st_ym);
			}
			return retL;
		}

		protected String[] getSplnItmConfKeys() {
			return new String[]{Calc01_DtlR.$spln_itm_cd};
		}

		protected String[] getItmConfKeys() {
			return new String[]{
					Calc01_DtlR.$itm_cd,
					Calc01_DtlR.$itm_sub1,
					Calc01_DtlR.$itm_sub2,
					Calc01_DtlR.$itm_sub3,
					Calc01_DtlR.$spln_itm_cd};
		}

		protected Comparable[] getVals(String[] keys, MCRow cndR) {
			Comparable[] vals = new Comparable[keys.length];
			for (int i = 0; i < vals.length; i++) {
				vals[i] = cndR.getValueNE(keys[i]);
			}
			return vals;
		}

		protected MCList<MAM_SPLN_ITM_CONF_R> getCacheItmConf(MCRow cnd,
					String[] keys,
					FXUCL_Cache<MCList<MAM_SPLN_ITM_CONF_R>> cache ) {
			Comparable[] vals = getVals(keys, cnd);
			MCList<MAM_SPLN_ITM_CONF_R> retL = cache.getCache(vals);
			if (isNull(retL)) {
				return MCList.create(MAM_SPLN_ITM_CONF_R.class);
			}
			return retL;
		}

		/**
		 * 品目ＣＤ、枝番１～３から品目マスタの情報を取得する。
		 */
		protected MAM_ITM_R getItm(MCRow r) {
			MAM_ITM_R itmR =  _cacheItm.get(
					r.getString(MAM_ITM_R.$itm_cd),
					r.getString(MAM_ITM_R.$itm_sub1),
					r.getString(MAM_ITM_R.$itm_sub2),
					r.getString(MAM_ITM_R.$itm_sub3));
			if (isNull(itmR.itm_cd())) {
				return null;
			}
			return itmR;
		}

		/**
		 * 品目ＣＤ、単位ＣＤから品目単位マスタの情報を取得する。
		 */
		protected MAVM_ITM_UNIT_R getItmUnit(String itmCd, String itmSub1, String itmSub2, String itmSub3, String unitCd) {
			return _cacheItmUnit.get(itmCd, itmSub1, itmSub2,itmSub3, unitCd);
		}

		/**
		 * 通貨ＣＤから通貨マスタの情報を取得する。
		 */
		protected MAM_CUR_R getCur(String curCd) {
			MAM_CUR_R curR = _cacheCur.get(curCd);
			if (isNull(curR) || curR.isEmpty()) {
				curR = MAM_CUR_R.create();
				curR.amt_dec_place(0);
				curR.upri_dec_place(0);
			}
			return curR;
		}

		/**
		 * 部門のワーキンググループＣＤ取得。
		 */
		protected String getWgCd(MCDate ym, String dptCd) {
			MAM_DPT_R ret = _cacheDpt.get(getYmStDt(ym), dptCd);
			return ret.wg_cd();
		}

		protected Map_MAVM_ITM_UNIT_R_MAM_ITM_R<MAVM_ITM_UNIT_R,MAM_ITM_R> createMap_MAVM_ITM_UNIT_R_MAM_ITM_R() {
			return new Map_MAVM_ITM_UNIT_R_MAM_ITM_R<MAVM_ITM_UNIT_R, MAM_ITM_R>();
		}
		public class Map_MAVM_ITM_UNIT_R_MAM_ITM_R<D extends MAVM_ITM_UNIT_R, S extends MAM_ITM_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MAVM_ITM_UNIT_R.$itm_cd, MAM_ITM_R.$itm_cd);
				addColumnPathMap(MAVM_ITM_UNIT_R.$itm_sub1, MAM_ITM_R.$itm_sub1);
				addColumnPathMap(MAVM_ITM_UNIT_R.$itm_sub2, MAM_ITM_R.$itm_sub2);
				addColumnPathMap(MAVM_ITM_UNIT_R.$itm_sub3, MAM_ITM_R.$itm_sub3);
				addColumnPathMap(MAVM_ITM_UNIT_R.$unit_cd, MAM_ITM_R.$pckg_unit_cd);
			}
		}

		protected Map_MAVM_ITM_UNIT_R_MAM_SPLN_ITM_CONF_R<MAVM_ITM_UNIT_R,MAM_SPLN_ITM_CONF_R> createMap_MAVM_ITM_UNIT_R_MAM_SPLN_ITM_CONF_R() {
			return new Map_MAVM_ITM_UNIT_R_MAM_SPLN_ITM_CONF_R<MAVM_ITM_UNIT_R, MAM_SPLN_ITM_CONF_R>();
		}
		public class Map_MAVM_ITM_UNIT_R_MAM_SPLN_ITM_CONF_R<D extends MAVM_ITM_UNIT_R, S extends MAM_SPLN_ITM_CONF_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MAVM_ITM_UNIT_R.$itm_cd, MAM_SPLN_ITM_CONF_R.$itm_cd);
				addColumnPathMap(MAVM_ITM_UNIT_R.$itm_sub1, MAM_SPLN_ITM_CONF_R.$itm_sub1);
				addColumnPathMap(MAVM_ITM_UNIT_R.$itm_sub2, MAM_SPLN_ITM_CONF_R.$itm_sub2);
				addColumnPathMap(MAVM_ITM_UNIT_R.$itm_sub3, MAM_SPLN_ITM_CONF_R.$itm_sub3);
				addColumnPathMap(MAVM_ITM_UNIT_R.$unit_cd, MAM_SPLN_ITM_CONF_R.$upri_unit_cd);
			}
		}
	}

	//FMCB CUSTOM END
}