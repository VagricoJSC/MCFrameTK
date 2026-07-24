package mcframe.serverMABS.MABSL0930;

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
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverMABS.MABSL5030.*;
import static mcframe.serverMAUC.MAUCL0100.MAUCL_AmtUtil.*;
import static mcframe.serverMABS.MABSL0930.Query.*;
import mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil;
//FMCB CUSTOM_IMPORT END

/**
 * "MABSL_OutsrcUpriChk"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABSL_OutsrcUpriChk_MC extends MABSL_OutsrcUpriChk_MC_A{
	//FMCB CUSTOM START

	/**
	 * Sprt01オペレーション.<p>
	 *
	 * 外注購買単価の確認を行います。<br>
	 */
	public class Sprt01 extends MABSL_OutsrcUpriChk_MC_A.Sprt01 {
		/**  * マスタ・キャッシュ */
		protected FXUCL_MCDbcCache<MAM_BP_R> _cacheBp;
		protected FXUCL_MCDbcCache<MAM_CUR_R> _cacheCur;
		protected FXUCL_MCDbcCache<MAM_ITM_R> _cacheItm;
		protected FXUCL_MCDbcCache<MAVM_ITM_UNIT_R> _cacheItmUnit;
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			crtMasterCache();
			srchOutsrcUpri();
			srchProcUpri();
			srchChdItm();
		}

		/**
		 * マスタ・キャッシュの作成
		 */
		protected void crtMasterCache() {
			// 取引先マスタ
			MAM_BP_R bp = MAM_BP_R.create("BP");
			MCQueryApiBuilder bpL_bldr = MCQueryApiBuilder.create(bp);
			bpL_bldr.setSelect(bp.bp_cd, bp.outsrc_upri_typ, bp.purc_amt_rnd_typ, bp.prov_amt_rnd_typ, bp.purc_tax_rnd_typ, bp.onr_prsppl_flg);
			_cacheBp = new FXUCL_MCDbcCache<MAM_BP_R>(bpL_bldr, up0(), Sprt01_DtlR.$sppl_cd);
			
			// 通貨マスタ
			MAM_CUR_R cur = MAM_CUR_R.create("CUR");
			MCQueryApiBuilder curL_bldr = MCQueryApiBuilder.create(cur);
			curL_bldr.setSelect(cur.cur_cd, cur.amt_dec_place, cur.upri_dec_place);
			_cacheCur = new FXUCL_MCDbcCache<MAM_CUR_R>(curL_bldr, up0(), Sprt01_DtlR.$cur_cd);
			
			try {
				setDelFlgCtl(false);
				setReleaseFlgCtl(false);
				// 品目マスタ
				MAM_ITM_R itm = MAM_ITM_R.create("ITM");
				MCQueryApiBuilder itmL_bldr = MCQueryApiBuilder.create(itm);
				itmL_bldr.setSelect(itm.dec_place, itm.rnd_typ);
				_cacheItm = new FXUCL_MCDbcCache<MAM_ITM_R>(itmL_bldr, up0(),
						Sprt01_DtlR.$itm_cd, Sprt01_DtlR.$itm_sub1, Sprt01_DtlR.$itm_sub2, Sprt01_DtlR.$itm_sub3);
			}
			finally {
				setDelFlgCtl(true);
				setReleaseFlgCtl(true);
			}
				
				// 品目単位ビュー
				MAVM_ITM_UNIT_R itmUnit = MAVM_ITM_UNIT_R.create("ITM_UNIT");
				MCQueryApiBuilder itmUnitL_bldr = MCQueryApiBuilder.create(itmUnit);
				itmUnitL_bldr.setSelect(itmUnit.conv_base_qty, itmUnit.conv_qty);
				_cacheItmUnit = new FXUCL_MCDbcCache<MAVM_ITM_UNIT_R>(itmUnitL_bldr, up0(),
						Sprt01_DtlR.$itm_cd, Sprt01_DtlR.$itm_sub1, Sprt01_DtlR.$itm_sub2,
						Sprt01_DtlR.$itm_sub3, Sprt01_DtlR.$unit_cd);
		}

		protected void setDelFlgCtl(boolean isDelFlgCtl) {				
			MCRow r = MCRow.create();			
			r.addStringColumn("del_flg_ctl", toFalseStr(isDelFlgCtl));			
			String procid = "MAPA_CONTEXT$SET_DEL_FLG_CTL";			
			execProc(createSqlId("MABSL0930", procid, "MABSL_OutsrcUpriChk_setDelFlgCtl")			
					, procid, r, ":del_flg_ctl");	
		}				

		protected void setReleaseFlgCtl(boolean isReleaseFlgCtl) {			
			MCRow r = MCRow.create();		
			r.addStringColumn("release_flg_ctl", toFalseStr(isReleaseFlgCtl));		
			String procid = "MAPA_CONTEXT$SET_RELEASE_FLG_CTL";		
			execProc(createSqlId("MABSL0930", procid, "MABSL_OutsrcUpriChk_setReleaseFlgCtl")		
					, procid, r, ":release_flg_ctl");
		}			

		/**
		 * 外注単価取得
		 */
		protected void srchOutsrcUpri(){
			setPegNo(up0());
			callProcUpriService();
			srchProvUpri();
			setDown();
		}

		/**
		 * 加工単価取得
		 */
		protected void srchProcUpri() {
			executeQuery(down1(), MABSL0930_MAM_PROC_UPRI_S01());
			
			// 機能名の設定
			MAUCL_MCDataUtil.setFuncNm(down1());
		}

		/**
		 * 子品目（支給単価）取得
		 */
		protected void srchChdItm() {
			int i = 0;
			for (Sprt01_DtlR r : up0()) {
				if (r.err_flg()) {
					i++;
					continue;
				}
				
				MAM_ITM_R itmR = _cacheItm.get(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
				MCList<Sprt01_Rslt2R> rsltL = MCList.create(Sprt01_Rslt2R.class);
				setBomEx(r);
				executeQuery(rsltL, MABSL0930_MAM_PROV_UPRI_S01(), r);
				rsltL = getFirstBomPtnChdItmList(rsltL);
				
				for (Sprt01_Rslt2R rsltR : rsltL) {
					MAM_CUR_R curR = _cacheCur.get(rsltR.cur_cd());
					rsltR.peg_no(i);
					rsltR.conv_inpt_qty(rsltR.getNumber("chd_inpt_qty")
							.multiply(MCNumber.ONE,
									itmR.dec_place().intValue(),
									MAC_RND_TYP.RNDUP.toMC()));
					if (!isNull(rsltR.upri())) {
						rsltR.conv_upri(getUpri(
								rsltR.upri().multiply(rsltR.conv_inpt_qty()),
								r.qty(), curR.upri_dec_place()));
					}
					down2().add(rsltR);
				}
				i++;
			}
			// 支給区分名の設定
			MAUCL_MCDataUtil.setConstNm(down2());
			// 機能名の設定
			MAUCL_MCDataUtil.setFuncNm(down2());
		}

		protected MCList<Sprt01_Rslt2R> getFirstBomPtnChdItmList (MCList<Sprt01_Rslt2R> rsltL) {
			MCList<Sprt01_Rslt2R> rsltResultL = MCList.create(Sprt01_Rslt2R.class);
			
			for (MCList<Sprt01_Rslt2R> rsltSubL : rsltL.groupList(Sprt01_DtlR.$itm_cd, Sprt01_DtlR.$itm_sub1, Sprt01_DtlR.$itm_sub2, Sprt01_DtlR.$itm_sub3)) {
				String firstBomPtn = rsltSubL.get(0).getStringNE("bom_ptn");
				for (Sprt01_Rslt2R rsltR : rsltSubL) {
					if (isSame(firstBomPtn, rsltR.getStringNE("bom_ptn"))) {
						rsltResultL.add(rsltR);
					}
				}
			}
			return rsltResultL;
		}

		/**
		 * 加工単価取得サービス.加工単価取得を呼び出し、「外注単価区分」、「仮単価ＦＬＧ」、「加工単価」を設定する
		 */
		protected void callProcUpriService() {
			MABSL_ProcUpriService.ProcUpri_Sprt01 procService = MABSL_ProcUpriService.crtProcUpri_Sprt01();
			setAll(procService.up0(), up0(), createMap_ProcUpri_Sprt01_DtlR_Sprt01_DtlR());
			
			procService.exec();
			String[] destCols = new String[] {
					Sprt01_DtlR.$outsrc_upri_typ,
					Sprt01_DtlR.$interim_flg,
					Sprt01_DtlR.$proc_upri
			};
			String[] srcCols = new String[] {
					ProcUpri_Sprt01_DtlR.$proc_upri_typ,
					ProcUpri_Sprt01_DtlR.$interim_flg,
					ProcUpri_Sprt01_DtlR.$upri
			};
			copyByPegNo(up0(), destCols, procService.down0(), srcCols);
			
			for (Sprt01_DtlR r : up0()) {
				if (isNull(r.proc_upri())) {
					r.err_flg(true);
				}
			}
		}

		/**
		 * 子品目の支給単価を検索し、「有償支給単価」、「自給単価」を設定する
		 */
		protected void srchProvUpri() {
			for (Sprt01_DtlR r : up0()) {
				if (r.err_flg()) {
					continue;
				}
				
				MAM_ITM_R itmR = _cacheItm.get(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
				MAM_BP_R bpR = _cacheBp.get(r.sppl_cd());
				MCNumber onrProvUpri = MCNumber.ZERO;
				MCNumber slfSupprtUpri = MCNumber.ZERO;
				
				setBomEx(r);
				
				MCList<MAM_PROV_UPRI_R> provUpriL = MCList.create(MAM_PROV_UPRI_R.class);
				MAM_PROV_UPRI_R t = MAM_PROV_UPRI_R.create("T");
				MAW_BOM_EX_R bomEx = MAW_BOM_EX_R.create("BOM_EX");
				MCQueryApiBuilder provUpriL_bldr = MCQueryApiBuilder.create(t);
				
				provUpriL_bldr.addSelect(bomEx.chd_inpt_qty);
				provUpriL_bldr.addSelect(bomEx.bom_ptn);
				provUpriL_bldr.addInnerJoin(bomEx,
						t.itm_cd.eq(bomEx.itm_cd)
						.and(t.itm_sub1.eq(bomEx.itm_sub1))
						.and(t.itm_sub2.eq(bomEx.itm_sub2))
						.and(t.itm_sub3.eq(bomEx.itm_sub3)));
				provUpriL_bldr.addWhereWithAnd(t.prsppl_cd.eq(bind(Sprt01_DtlR.$sppl_cd)));
				provUpriL_bldr.addWhereWithAnd(t.cur_cd.eq(bind(Sprt01_DtlR.$cur_cd)));
				provUpriL_bldr.addWhereWithAnd(t.wg_cd.eq(bind(Sprt01_DtlR.$wg_cd)));
				provUpriL_bldr.addWhereWithAnd(t.st_dt.lte(bind(Sprt01_DtlR.$dt)));
				provUpriL_bldr.addWhereWithAnd(t.end_dt.gte(bind(Sprt01_DtlR.$dt)));
				provUpriL_bldr.addWhereWithAnd(bomEx.bom_lvl.neq(value(0)));
				provUpriL_bldr.addWhereWithAnd(bomEx.inpt_ctl_typ.neq(value(MAC_INPT_CTL_TYP.NO_MRP_INST.value())));
				provUpriL_bldr.addWhereWithAnd(bomEx.byprod_flg.eq(value(false)));
				dbSelect("MABSL0930_MAM_PROV_UPRI_S02", provUpriL, provUpriL_bldr, r);
				provUpriL = getFirstBomPtnProvUpriList(provUpriL);
				
				for (MAM_PROV_UPRI_R provUpriR : provUpriL) {
					MCNumber inptQty = provUpriR.getNumber("chd_inpt_qty")
							.multiply(MCNumber.ONE,
									itmR.dec_place().intValue(),
									MAC_RND_TYP.RNDUP.toMC());
					MCNumber convUpri = nvl(provUpriR.upri(), MCNumber.ZERO)
							.multiply(inptQty);
					
					if (MAC_PROV_TYP.isONR_PROV(provUpriR.prov_typ())) {
						// 有償支給
						onrProvUpri = onrProvUpri.add(convUpri);
					}
					else if (MAC_PROV_TYP.isSS(provUpriR.prov_typ())) {
						// 自給
						slfSupprtUpri = slfSupprtUpri.add(convUpri);
					}
				}
				
				if (bpR.onr_prsppl_flg()) {
					r.onr_prov_upri(onrProvUpri);
				}
				r.slf_supprt_upri(slfSupprtUpri);
				if (isNull(bpR.outsrc_upri_typ())) {
					r.outsrc_upri_typ(getCo().outsrc_upri_typ());
				}
				else {
					r.outsrc_upri_typ(bpR.outsrc_upri_typ());
				}
			}
			// 外注単価区分名の設定
			MAUCL_MCDataUtil.setConstNm(up0());
		}

		protected MCList<MAM_PROV_UPRI_R> getFirstBomPtnProvUpriList (MCList<MAM_PROV_UPRI_R> provUpriL) {
			MCList<MAM_PROV_UPRI_R> rsltResultL = MCList.create(MAM_PROV_UPRI_R.class);
			
			for (MCList<MAM_PROV_UPRI_R> rsltSubL : provUpriL.groupList(Sprt01_DtlR.$itm_cd, Sprt01_DtlR.$itm_sub1, Sprt01_DtlR.$itm_sub2, Sprt01_DtlR.$itm_sub3)) {
				String firstBomPtn = rsltSubL.get(0).getStringNE("bom_ptn");
				for (MAM_PROV_UPRI_R rsltR : rsltSubL) {
					if (isSame(firstBomPtn, rsltR.getStringNE("bom_ptn"))) {
						rsltResultL.add(rsltR);
					}
				}
			}
			return rsltResultL;
		}

		/**
		 * 下り電文を設定する
		 */
		protected void setDown() {
			down0().setAll(up0());
			
			MCIndexKey upIndexKey = up0().createIndex(Sprt01_DtlR.$peg_no);
			
			for (Sprt01_DtlR r : down0()) {
				if (r.err_flg()) {
					continue;
				}
				
				Sprt01_DtlR upR = up0().getFirst(upIndexKey, r.peg_no());
				MAM_CUR_R curR = _cacheCur.get(upR.cur_cd());
				MAM_BP_R bpR = _cacheBp.get(upR.sppl_cd());
				
				MCNumber upri = MCNumber.ZERO;
				MCNumber procUpri = nvl(r.proc_upri(), MCNumber.ZERO);
				MCNumber onrProvUpri = getUpri(
						nvl(r.onr_prov_upri(), MCNumber.ZERO),
						r.qty(),
						curR.upri_dec_place());
				MCNumber slfSupprtUpri = getUpri(
						nvl(r.slf_supprt_upri(), MCNumber.ZERO),
						r.qty(),
						curR.upri_dec_place());
				
				upri = upri.add(procUpri);
				if (isTgtOnrProv(bpR)) {
					upri = upri.add(onrProvUpri);
				}
				
				r.upri(upri);
				r.proc_upri(procUpri);
				r.onr_prov_upri(onrProvUpri);
				r.slf_supprt_upri(slfSupprtUpri);
				r.amt(getAmt(r.upri(), r.qty(),
						curR.amt_dec_place(),
						bpR.purc_amt_rnd_typ()));
				r.proc_amt(getAmt(r.proc_upri(), r.qty(),
						curR.amt_dec_place(),
						bpR.purc_amt_rnd_typ()));
				r.onr_prov_amt(getAmt(r.onr_prov_upri(), r.qty(),
						curR.amt_dec_place(),
						bpR.purc_amt_rnd_typ()));
				r.slf_supprt_amt(getAmt(r.slf_supprt_upri(), r.qty(),
						curR.amt_dec_place(),
						bpR.purc_amt_rnd_typ()));
			}
		}

		/**
		 * 有償支給単価および有償支給金額の計算対象かどうか判定する
		 */
		protected boolean isTgtOnrProv(MAM_BP_R bpR) {
			if (!bpR.onr_prsppl_flg()) {
				return false;
			}
			if (!isNull(bpR.outsrc_upri_typ())) {
				if (MAC_OUTSRC_UPRI_TYP.isPROC_PROV(bpR.outsrc_upri_typ())) {
					return true;
				}
			}
			else {
				if (MAC_OUTSRC_UPRI_TYP.isPROC_PROV(getCo().outsrc_upri_typ())) {
					return true;
				}
			}
			return false;
		}

		/**
		 * ＢＯＭ正展開結果を一時表（MAW_BOM_EX）に格納する
		 */
		protected void setBomEx(Sprt01_DtlR r) {
			r.addBooleanColumn("PH_EX_FLG", true);
			r.addBooleanColumn("BOM_PTN_FLG", false);
			r.addNumberColumn("MAX_HRRCHY", MCNumber.valueOf(1));
			r.addBooleanColumn("MFG_FLG", true);
			r.addNumberColumn("BASE_UNIT_QTY", getBaseUnitQty(r));
			
			String procId = "MAPA_BOM$P_INS_BOM_EX";
			execProc(createSqlId(LOGIC_ID, procId, "01"), procId, r, null,
					":ITM_CD, :ITM_SUB1, :ITM_SUB2, :ITM_SUB3, "
							+ ":BOM_PTN, :WG_CD, :DT, "
							+ ":PH_EX_FLG, :BOM_PTN_FLG, :MAX_HRRCHY, "
							+ ":SNO1, :SNO2, :SNO3, :SNO4, "
							+ ":MFG_FLG, :BASE_UNIT_QTY");
		}

		/**
		 * 基準単位数量を取得する
		 */
		protected MCNumber getBaseUnitQty(Sprt01_DtlR r) {
			MAM_ITM_R itmR = _cacheItm.get(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
			MAVM_ITM_UNIT_R itmUnitR = _cacheItmUnit.get(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.unit_cd());
			return convToBaseUnit(r.qty(), itmUnitR.conv_base_qty(), itmUnitR.conv_qty(), itmR.dec_place(), itmR.rnd_typ());
		}
	}

	protected Map_ProcUpri_Sprt01_DtlR_Sprt01_DtlR<ProcUpri_Sprt01_DtlR,Sprt01_DtlR> createMap_ProcUpri_Sprt01_DtlR_Sprt01_DtlR() {
		return new Map_ProcUpri_Sprt01_DtlR_Sprt01_DtlR<ProcUpri_Sprt01_DtlR, Sprt01_DtlR>();
	}

	public class Map_ProcUpri_Sprt01_DtlR_Sprt01_DtlR<D extends ProcUpri_Sprt01_DtlR, S extends Sprt01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ProcUpri_Sprt01_DtlR.$peg_no, Sprt01_DtlR.$peg_no);
			addColumnPathMap(ProcUpri_Sprt01_DtlR.$itm_cd, Sprt01_DtlR.$itm_cd);
			addColumnPathMap(ProcUpri_Sprt01_DtlR.$itm_sub1, Sprt01_DtlR.$itm_sub1);
			addColumnPathMap(ProcUpri_Sprt01_DtlR.$itm_sub2, Sprt01_DtlR.$itm_sub2);
			addColumnPathMap(ProcUpri_Sprt01_DtlR.$itm_sub3, Sprt01_DtlR.$itm_sub3);
			addColumnPathMap(ProcUpri_Sprt01_DtlR.$sppl_cd, Sprt01_DtlR.$sppl_cd);
			addColumnPathMap(ProcUpri_Sprt01_DtlR.$unit_cd, Sprt01_DtlR.$unit_cd);
			addColumnPathMap(ProcUpri_Sprt01_DtlR.$qty, Sprt01_DtlR.$qty);
			addColumnPathMap(ProcUpri_Sprt01_DtlR.$cur_cd, Sprt01_DtlR.$cur_cd);
			addColumnPathMap(ProcUpri_Sprt01_DtlR.$proc_upri_typ, Sprt01_DtlR.$outsrc_upri_typ);
			addColumnPathMap(ProcUpri_Sprt01_DtlR.$wg_cd, Sprt01_DtlR.$wg_cd);
			addColumnPathMap(ProcUpri_Sprt01_DtlR.$dt, Sprt01_DtlR.$dt);
		}
		
		@Override
		public void valueCopy(D dest, S src){
			// メーカＣＤ
			if (isNull(src.maker_cd())) {
				dest.maker_cd(MAC_STR.NULL_VAL.value());
			}
			else {
				dest.maker_cd(src.maker_cd());
			}
			// 納入場所ＣＤ
			if (isNull(src.loc_cd())) {
				dest.loc_cd(MAC_STR.NULL_VAL.value());
			}
			else {
				dest.loc_cd(src.loc_cd());
			}
			// 納品先ＣＤ
			if (isNull(src.dlv_cd())) {
				dest.dlv_cd(MAC_STR.NULL_VAL.value());
			}
			else {
				dest.dlv_cd(src.dlv_cd());
			}
		}
	}

	//FMCB CUSTOM END
}